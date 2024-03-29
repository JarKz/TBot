package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the scope of bot commands, covering a specific member of a group or supergroup chat.
 */
public final class BotCommandScopeChatMember implements BotCommandScope {

  public static final class Builder {

    private BotCommandScopeChatMember buildingType;

    public Builder() {
      buildingType = new BotCommandScopeChatMember();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setUserId(int userId) {
      buildingType.userId = userId;
      return this;
    }

    public BotCommandScopeChatMember build() {
      return buildingType;
    }
  }

  public static final String TYPE = "chat_member";

  /** Scope type, must be chat_member */
  @NotNull public final String type = TYPE;

  /**
   * Unique identifier for the target chat or username of the target supergroup (in the
   * format @supergroupusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target user */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotCommandScopeChatMember other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(chatId, other.chatId)
        && userId == other.userId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, chatId, userId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("BotCommandScopeChatMember[type=")
        .append(type)
        .append(", chatId=")
        .append(chatId)
        .append(", userId=")
        .append(userId)
        .append("]");
    return builder.toString();
  }
}
