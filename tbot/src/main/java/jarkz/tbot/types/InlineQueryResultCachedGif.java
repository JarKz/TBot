package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Represents a link to an animated GIF file stored on the Telegram servers. By default, this
 * animated GIF file will be sent by the user with an optional caption. Alternatively, you can use
 * input_message_content to send a message with specified content instead of the animation.
 */
public final class InlineQueryResultCachedGif implements InlineQueryResult {

  public static final class Builder {

    private InlineQueryResultCachedGif buildingType;

    public Builder() {
      buildingType = new InlineQueryResultCachedGif();
    }

    public Builder setId(String id) {
      buildingType.id = id;
      return this;
    }

    public Builder setGifFileId(String gifFileId) {
      buildingType.gifFileId = gifFileId;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public Builder setCaption(String caption) {
      buildingType.caption = caption;
      return this;
    }

    public Builder setParseMode(String parseMode) {
      buildingType.parseMode = parseMode;
      return this;
    }

    public Builder setCaptionEntities(List<MessageEntity> captionEntities) {
      buildingType.captionEntities = captionEntities;
      return this;
    }

    public Builder setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public Builder setInputMessageContent(InputMessageContent inputMessageContent) {
      buildingType.inputMessageContent = inputMessageContent;
      return this;
    }

    public InlineQueryResultCachedGif build() {
      return buildingType;
    }
  }

  public static final String TYPE = "gif";

  /** Type of the result, must be gif */
  @NotNull public final String type = TYPE;

  /** Unique identifier for this result, 1-64 bytes */
  @NotNull public String id;

  /** A valid file identifier for the GIF file */
  @NotNull
  @SerializedName("gif_file_id")
  public String gifFileId;

  /** Optional. Title for the result */
  public String title;

  /** Optional. Caption of the GIF file to be sent, 0-1024 characters after entities parsing */
  public String caption;

  /**
   * Optional. Mode for parsing entities in the caption. See formatting options for more details.
   */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * Optional. List of special entities that appear in the caption, which can be specified instead
   * of parse_mode
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** Optional. Inline keyboard attached to the message */
  @SerializedName("reply_markup")
  public InlineKeyboardMarkup replyMarkup;

  /** Optional. Content of the message to be sent instead of the GIF animation */
  @SerializedName("input_message_content")
  public InputMessageContent inputMessageContent;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InlineQueryResultCachedGif other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(id, other.id)
        && Objects.equals(gifFileId, other.gifFileId)
        && Objects.equals(title, other.title)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(replyMarkup, other.replyMarkup)
        && Objects.equals(inputMessageContent, other.inputMessageContent);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        id,
        gifFileId,
        title,
        caption,
        parseMode,
        captionEntities,
        replyMarkup,
        inputMessageContent);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InlineQueryResultCachedGif[type=")
        .append(type)
        .append(", id=")
        .append(id)
        .append(", gifFileId=")
        .append(gifFileId)
        .append(", title=")
        .append(title)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append(", inputMessageContent=")
        .append(inputMessageContent)
        .append("]");
    return builder.toString();
  }
}
