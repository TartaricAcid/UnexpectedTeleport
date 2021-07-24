package com.github.tartaricacid.unexpectedteleport.command;

import com.github.tartaricacid.unexpectedteleport.util.TeleportData;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.item.Item;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.concurrent.CompletableFuture;

public class TeleportTypeArgument implements ArgumentType<Item> {
    public static final DynamicCommandExceptionType ERROR_INVALID_VALUE = new DynamicCommandExceptionType(
            (obj) -> new TranslationTextComponent("argument.unexpectedteleport.type.invalid", obj));

    private TeleportTypeArgument() {
    }

    public static TeleportTypeArgument type() {
        return new TeleportTypeArgument();
    }

    public static Item getType(CommandContext<CommandSource> context, String s) {
        return context.getArgument(s, Item.class);
    }

    @Override
    public Item parse(StringReader reader) throws CommandSyntaxException {
        String arg = reader.readUnquotedString();
        Item item = TeleportData.TYPES.get(arg);
        if (item == null) {
            throw ERROR_INVALID_VALUE.create(arg);
        } else {
            return item;
        }
    }

    @Override
    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        return ISuggestionProvider.suggest(TeleportData.TYPES.keySet(), builder);
    }
}
