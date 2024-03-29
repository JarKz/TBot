package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the scope of bot commands, covering all group and supergroup chat administrators. */
public final class BotCommandScopeAllChatAdministrators implements BotCommandScope {

  public static final class Builder {

    private BotCommandScopeAllChatAdministrators buildingType;

    public Builder() {
      buildingType = new BotCommandScopeAllChatAdministrators();
    }

    public BotCommandScopeAllChatAdministrators build() {
      return buildingType;
    }
  }

  public static final String TYPE = "all_chat_administrators";

  /** Scope type, must be all_chat_administrators */
  @NotNull public final String type = TYPE;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeAllChatAdministrators other)) return false;
    return Objects.equals(type, other.type);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("BotCommandScopeAllChatAdministrators[type=").append(type).append("]");
    return builder.toString();
  }
}
