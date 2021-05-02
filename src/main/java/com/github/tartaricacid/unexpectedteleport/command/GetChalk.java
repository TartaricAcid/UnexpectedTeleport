package com.github.tartaricacid.unexpectedteleport.command;

import com.github.tartaricacid.unexpectedteleport.init.ItemRegistry;
import com.github.tartaricacid.unexpectedteleport.item.ItemChalk;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.DimensionArgument;
import net.minecraft.command.arguments.ILocationArgument;
import net.minecraft.command.arguments.Vec3Argument;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.registries.ForgeRegistries;

public class GetChalk {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        LiteralArgumentBuilder<CommandSource> chalk = Commands.literal("chalk")
                .requires((source -> source.hasPermission(2)));

        LiteralArgumentBuilder<CommandSource> pos = Commands.literal("pos");
        LiteralArgumentBuilder<CommandSource> feature = Commands.literal("feature");

        chalk.then(pos.then(Commands.argument("dim", DimensionArgument.dimension())
                .then(Commands.argument("coordinate", Vec3Argument.vec3())
                        .executes((context -> getPosChalk(context.getSource(),
                                DimensionArgument.getDimension(context, "dim"),
                                Vec3Argument.getCoordinates(context, "coordinate")))))));

        for (Structure<?> structureFeature : ForgeRegistries.STRUCTURE_FEATURES) {
            ResourceLocation res = structureFeature.getRegistryName();
            if (res == null) {
                continue;
            }
            String structure = res.toString().replace("minecraft:", "");
            chalk.then(feature.then(Commands.argument("dim", DimensionArgument.dimension())
                    .then(Commands.literal(structure)
                            .executes((context -> getFeatureChalk(context.getSource(),
                                    DimensionArgument.getDimension(context, "dim"),
                                    structure))))));
        }

        dispatcher.register(chalk);
    }

    private static int getPosChalk(CommandSource source, ServerWorld world, ILocationArgument location) throws CommandSyntaxException {
        String dim = world.dimension().location().toString();
        BlockPos pos = new BlockPos(location.getPosition(source));
        ItemStack chalk = new ItemStack(ItemRegistry.CHALK.get());
        giveItem(source.getPlayerOrException(), ItemChalk.setDim(dim, ItemChalk.setPos(pos, chalk)));
        return Command.SINGLE_SUCCESS;
    }

    private static int getFeatureChalk(CommandSource source, ServerWorld world, String feature) throws CommandSyntaxException {
        String dim = world.dimension().location().toString();
        ItemStack chalk = new ItemStack(ItemRegistry.CHALK.get());
        giveItem(source.getPlayerOrException(), ItemChalk.setDim(dim, ItemChalk.setFeature(feature, chalk)));
        return Command.SINGLE_SUCCESS;
    }

    private static void giveItem(ServerPlayerEntity player, ItemStack chalk) {
        ItemEntity itemEntity = player.drop(chalk, false);
        if (itemEntity != null) {
            itemEntity.setNoPickUpDelay();
            itemEntity.setOwner(player.getUUID());
        }
    }
}
