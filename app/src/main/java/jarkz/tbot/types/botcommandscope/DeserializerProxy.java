package jarkz.tbot.types.botcommandscope;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.deserializers.JsonNotFoundKey;
import jarkz.tbot.types.deserializers.JsonTypeNotDefined;

/**
 * The deserializer proxy for general interface {@link BotCommandScope}.
 *
 * <p>Uses for the JSON deserializer adapter. Contains only one static method, which defines which
 * child type needed to map and returns the needed class.
 *
 * @author Pavel Bialiauski
 */
@Deserializer
public class DeserializerProxy {

  private static final String BOT_COMMAND_SCOPE_KEY = "type";

  /**
   * Returns a implemented class from the {@link BotCommandScope} by specific type.
   *
   * @param jsonObject the BotCommandScope as json object.
   * @return a implemented class from the {@link BotCommandScope}.
   */
  public static Class<? extends BotCommandScope> getBotCommandScopeClass(JsonObject jsonObject) {

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
    return clazz;
  }
}
