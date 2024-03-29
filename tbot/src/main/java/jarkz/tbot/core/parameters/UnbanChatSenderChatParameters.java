package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to unban a previously banned channel chat in a supergroup or channel. The bot
 * must be an administrator for this to work and must have the appropriate administrator rights.
 * Returns True on success.
 */
public final class UnbanChatSenderChatParameters {

  public static final class Builder {

    private UnbanChatSenderChatParameters buildingType;

    public Builder() {
      buildingType = new UnbanChatSenderChatParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setSenderChatId(int senderChatId) {
      buildingType.senderChatId = senderChatId;
      return this;
    }

    public UnbanChatSenderChatParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /** Unique identifier of the target sender chat */
  @NotNull
  @SerializedName("sender_chat_id")
  public int senderChatId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof UnbanChatSenderChatParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && senderChatId == other.senderChatId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, senderChatId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("UnbanChatSenderChatParameters[chatId=")
        .append(chatId)
        .append(", senderChatId=")
        .append(senderChatId)
        .append("]");
    return builder.toString();
  }
}
