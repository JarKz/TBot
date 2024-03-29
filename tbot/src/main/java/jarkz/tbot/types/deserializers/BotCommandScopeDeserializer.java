package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.BotCommandScope;
import jarkz.tbot.types.BotCommandScopeAllChatAdministrators;
import jarkz.tbot.types.BotCommandScopeAllGroupChats;
import jarkz.tbot.types.BotCommandScopeAllPrivateChats;
import jarkz.tbot.types.BotCommandScopeChat;
import jarkz.tbot.types.BotCommandScopeChatAdministrators;
import jarkz.tbot.types.BotCommandScopeChatMember;
import jarkz.tbot.types.BotCommandScopeDefault;
import java.lang.reflect.Type;

/**
 * The JSON deserializer adapter for general interface {@link BotCommandScope}.
 *
 * @author Pavel Bialiauski
 */
public class BotCommandScopeDeserializer implements JsonDeserializer<BotCommandScope> {

  private final String BOT_COMMAND_SCOPE_KEY = "type";

  @Override
  public BotCommandScope deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    JsonElement element = jsonObject.get(BOT_COMMAND_SCOPE_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.",
              BOT_COMMAND_SCOPE_KEY, BotCommandScope.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends BotCommandScope> clazz = null;
    switch (value) {
      case BotCommandScopeAllChatAdministrators.TYPE -> clazz =
          BotCommandScopeAllChatAdministrators.class;
      case BotCommandScopeAllGroupChats.TYPE -> clazz = BotCommandScopeAllGroupChats.class;
      case BotCommandScopeAllPrivateChats.TYPE -> clazz = BotCommandScopeAllPrivateChats.class;
      case BotCommandScopeChat.TYPE -> clazz = BotCommandScopeChat.class;
      case BotCommandScopeChatAdministrators.TYPE -> clazz =
          BotCommandScopeChatAdministrators.class;
      case BotCommandScopeChatMember.TYPE -> clazz = BotCommandScopeChatMember.class;
      case BotCommandScopeDefault.TYPE -> clazz = BotCommandScopeDefault.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.",
              BOT_COMMAND_SCOPE_KEY, BotCommandScope.class.getName()));
    }
    return context.deserialize(json, clazz);
  }
}
