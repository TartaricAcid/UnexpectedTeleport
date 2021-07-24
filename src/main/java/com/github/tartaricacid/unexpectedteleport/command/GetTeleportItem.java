package com.github.tartaricacid.unexpectedteleport.command;

import com.github.tartaricacid.unexpectedteleport.util.TeleportData;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.DimensionArgument;
import net.minecraft.command.arguments.ILocationArgument;
import net.minecraft.command.arguments.Vec3Argument;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.registries.ForgeRegistries;

public class GetTeleportItem {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        LiteralArgumentBuilder<CommandSource> root = Commands.literal("ut")
                .requires((source -> source.hasPermission(2)));

        LiteralArgumentBuilder<CommandSource> pos = Commands.literal("pos");
        LiteralArgumentBuilder<CommandSource> feature = Commands.literal("feature");

        root.then(Commands.argument("type", TeleportTypeArgument.type()).then(
                pos.then(Commands.argument("dim", DimensionArgument.dimension())
                        .then(Commands.argument("coordinate", Vec3Argument.vec3())
                                .executes((GetTeleportItem::getTeleportPosItem))))));

        for (Structure<?> structureFeature : ForgeRegistries.STRUCTURE_FEATURES) {
            ResourceLocation res = structureFeature.getRegistryName();
            if (res == null) {
                continue;
            }
            String structure = res.toString().replace("minecraft:", "");
            root.then(Commands.argument("type", TeleportTypeArgument.type()).then(
                    feature.then(Commands.argument("dim", DimensionArgument.dimension())
                            .then(Commands.literal(structure).executes(
                                    (context -> getTeleportFeatureItem(context, structure)))))));
        }

        dispatcher.register(root);
    }

    private static int getTeleportPosItem(CommandContext<CommandSource> context) throws CommandSyntaxException {
        CommandSource source = context.getSource();
        Item typeItem = TeleportTypeArgument.getType(context, "type");
        String dim = DimensionArgument.getDimension(context, "dim").dimension().location().toString();
        ILocationArgument location = Vec3Argument.getCoordinates(context, "coordinate");
        BlockPos pos = new BlockPos(location.getPosition(source));
        ItemStack stack = new ItemStack(typeItem);

        giveItem(source.getPlayerOrException(), TeleportData.setDim(dim, TeleportData.setPos(pos, stack)));
        return Command.SINGLE_SUCCESS;
    }

    private static int getTeleportFeatureItem(CommandContext<CommandSource> context, String feature) throws CommandSyntaxException {
        CommandSource source = context.getSource();
        Item typeItem = TeleportTypeArgument.getType(context, "type");
        String dim = DimensionArgument.getDimension(context, "dim").dimension().location().toString();
        ItemStack stack = new ItemStack(typeItem);

        giveItem(source.getPlayerOrException(), TeleportData.setDim(dim, TeleportData.setFeature(feature, stack)));
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
