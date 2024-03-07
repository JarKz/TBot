package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import java.util.Objects;

/**
 * Use this method to set the thumbnail of a regular or mask sticker set. The format of the
 * thumbnail file must match the format of the stickers in the set. Returns True on success.
 */
public final class SetStickerSetThumbnailParameters {

  /** Sticker set name */
  @NotNull public String name;

  /** User identifier of the sticker set owner */
  @NotNull
  @SerializedName("user_id")
  public int userId;

  /**
   * A .WEBP or .PNG image with the thumbnail, must be up to 128 kilobytes in size and have a width
   * and height of exactly 100px, or a .TGS animation with a thumbnail up to 32 kilobytes in size
   * (see https://core.telegram.org/stickers#animated-sticker-requirements for animated sticker
   * technical requirements), or a WEBM video with the thumbnail up to 32 kilobytes in size; see
   * https://core.telegram.org/stickers#video-sticker-requirements for video sticker technical
   * requirements. Pass a file_id as a String to send a file that already exists on the Telegram
   * servers, pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a
   * new one using multipart/form-data. More information on Sending Files:
   * https://core.telegram.org/bots/api#sending-files. Animated and video sticker set thumbnails
   * can't be uploaded via HTTP URL. If omitted, then the thumbnail is dropped and the first sticker
   * is used as the thumbnail.
   */
  public InputFile thumbnail;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetStickerSetThumbnailParameters other)) return false;
    return Objects.equals(name, other.name)
        && userId == other.userId
        && Objects.equals(thumbnail, other.thumbnail);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, userId, thumbnail);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetStickerSetThumbnailParameters[name=")
        .append(name)
        .append(", userId=")
        .append(userId)
        .append(", thumbnail=")
        .append(thumbnail)
        .append("]");
    return builder.toString();
  }
}
