package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import java.util.Objects;

/**
 * Use this method to forward messages of any kind. Service messages and messages with protected
 * content can't be forwarded. On success, the sent Message is returned.
 */
public final class ForwardMessageParameters {

  public static final class Builder {

    private ForwardMessageParameters buildingType;

    public Builder() {
      buildingType = new ForwardMessageParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(Integer messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
      return this;
    }

    public Builder setFromChatId(Id fromChatId) {
      buildingType.fromChatId = fromChatId;
      return this;
    }

    public Builder setDisableNotification(Boolean disableNotification) {
      buildingType.disableNotification = disableNotification;
      return this;
    }

    public Builder setProtectContent(Boolean protectContent) {
      buildingType.protectContent = protectContent;
      return this;
    }

    public Builder setMessageId(int messageId) {
      buildingType.messageId = messageId;
      return this;
    }

    public ForwardMessageParameters build() {
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

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /**
   * Unique identifier for the chat where the original message was sent (or channel username in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("from_chat_id")
  public Id fromChatId;

  /** Sends the message silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the forwarded message from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Message identifier in the chat specified in from_chat_id */
  @NotNull
  @SerializedName("message_id")
  public int messageId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ForwardMessageParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(fromChatId, other.fromChatId)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && messageId == other.messageId;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId, messageThreadId, fromChatId, disableNotification, protectContent, messageId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ForwardMessageParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", fromChatId=")
        .append(fromChatId)
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", messageId=")
        .append(messageId)
        .append("]");
    return builder.toString();
  }
}
