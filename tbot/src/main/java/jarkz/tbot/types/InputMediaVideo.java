package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** Represents a video to be sent. */
public final class InputMediaVideo implements InputMedia, Media {

  public static final class Builder {

    private InputMediaVideo buildingType;

    public Builder() {
      buildingType = new InputMediaVideo();
    }

    public Builder setMedia(InputFile media) {
      buildingType.media = media;
      return this;
    }

    public Builder setThumbnail(InputFile thumbnail) {
      buildingType.thumbnail = thumbnail;
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

    public Builder setWidth(Integer width) {
      buildingType.width = width;
      return this;
    }

    public Builder setHeight(Integer height) {
      buildingType.height = height;
      return this;
    }

    public Builder setDuration(Integer duration) {
      buildingType.duration = duration;
      return this;
    }

    public Builder setSupportsStreaming(Boolean supportsStreaming) {
      buildingType.supportsStreaming = supportsStreaming;
      return this;
    }

    public Builder setHasSpoiler(Boolean hasSpoiler) {
      buildingType.hasSpoiler = hasSpoiler;
      return this;
    }

    public InputMediaVideo build() {
      return buildingType;
    }
  }

  public static final String TYPE = "video";

  /** Type of the result, must be video */
  @NotNull public final String type = TYPE;

  /**
   * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
   * pass an HTTP URL for Telegram to get a file from the Internet, or pass
   * "attach://<file_attach_name>" to upload a new one using multipart/form-data under
   * <file_attach_name> name. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files
   */
  @NotNull public InputFile media;

  /**
   * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file is
   * supported server-side. The thumbnail should be in JPEG format and less than 200 kB in size. A
   * thumbnail's width and height should not exceed 320. Ignored if the file is not uploaded using
   * multipart/form-data. Thumbnails can't be reused and can be only uploaded as a new file, so you
   * can pass "attach://<file_attach_name>" if the thumbnail was uploaded using multipart/form-data
   * under <file_attach_name>. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files
   */
  public InputFile thumbnail;

  /** Optional. Caption of the video to be sent, 0-1024 characters after entities parsing */
  public String caption;

  /**
   * Optional. Mode for parsing entities in the video caption. See formatting options for more
   * details.
   */
  @SerializedName("parse_mode")
  public String parseMode;

  /**
   * Optional. List of special entities that appear in the caption, which can be specified instead
   * of parse_mode
   */
  @SerializedName("caption_entities")
  public List<MessageEntity> captionEntities;

  /** Optional. Video width */
  public Integer width;

  /** Optional. Video height */
  public Integer height;

  /** Optional. Video duration in seconds */
  public Integer duration;

  /** Optional. Pass True if the uploaded video is suitable for streaming */
  @SerializedName("supports_streaming")
  public Boolean supportsStreaming;

  /** Optional. Pass True if the video needs to be covered with a spoiler animation */
  @SerializedName("has_spoiler")
  public Boolean hasSpoiler;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputMediaVideo other)) return false;
    return Objects.equals(type, other.type)
        && Objects.equals(media, other.media)
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(caption, other.caption)
        && Objects.equals(parseMode, other.parseMode)
        && Objects.equals(captionEntities, other.captionEntities)
        && Objects.equals(width, other.width)
        && Objects.equals(height, other.height)
        && Objects.equals(duration, other.duration)
        && Objects.equals(supportsStreaming, other.supportsStreaming)
        && Objects.equals(hasSpoiler, other.hasSpoiler);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        type,
        media,
        thumbnail,
        caption,
        parseMode,
        captionEntities,
        width,
        height,
        duration,
        supportsStreaming,
        hasSpoiler);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("InputMediaVideo[type=")
        .append(type)
        .append(", media=")
        .append(media)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", caption=")
        .append(caption)
        .append(", parseMode=")
        .append(parseMode)
        .append(", captionEntities=")
        .append(captionEntities)
        .append(", width=")
        .append(width)
        .append(", height=")
        .append(height)
        .append(", duration=")
        .append(duration)
        .append(", supportsStreaming=")
        .append(supportsStreaming)
        .append(", hasSpoiler=")
        .append(hasSpoiler)
        .append("]");
    return builder.toString();
  }
}
