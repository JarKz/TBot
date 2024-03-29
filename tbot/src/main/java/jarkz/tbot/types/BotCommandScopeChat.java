package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents the scope of bot commands, covering a specific chat. */
public final class BotCommandScopeChat implements BotCommandScope {

  public static final class Builder {

    private BotCommandScopeChat buildingType;

    public Builder() {
      buildingType = new BotCommandScopeChat();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public BotCommandScopeChat build() {
      return buildingType;
    }
  }

  public static final String TYPE = "chat";

  /** Scope type, must be chat */
  @NotNull public final String type = TYPE;

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeChat other)) return false;
    return Objects.equals(type, other.type) && Objects.equals(chatId, other.chatId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, chatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("BotCommandScopeChat[type=")
        .append(type)
        .append(", chatId=")
        .append(chatId)
        .append("]");
    return builder.toString();
  }
}
