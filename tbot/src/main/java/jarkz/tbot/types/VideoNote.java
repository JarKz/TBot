package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a video message (available in Telegram apps as of v.4.0). */
public final class VideoNote {

  public static final class Builder {

    private VideoNote buildingType;

    public Builder() {
      buildingType = new VideoNote();
    }

    public Builder setFileId(String fileId) {
      buildingType.fileId = fileId;
      return this;
    }

    public Builder setFileUniqueId(String fileUniqueId) {
      buildingType.fileUniqueId = fileUniqueId;
      return this;
    }

    public Builder setLength(int length) {
      buildingType.length = length;
      return this;
    }

    public Builder setDuration(int duration) {
      buildingType.duration = duration;
      return this;
    }

    public Builder setThumbnail(PhotoSize thumbnail) {
      buildingType.thumbnail = thumbnail;
      return this;
    }

    public Builder setFileSize(Integer fileSize) {
      buildingType.fileSize = fileSize;
      return this;
    }

    public VideoNote build() {
      return buildingType;
    }
  }

  /** Identifier for this file, which can be used to download or reuse the file */
  @NotNull
  @SerializedName("file_id")
  public String fileId;

  /**
   * Unique identifier for this file, which is supposed to be the same over time and for different
   * bots. Can't be used to download or reuse the file.
   */
  @NotNull
  @SerializedName("file_unique_id")
  public String fileUniqueId;

  /** Video width and height (diameter of the video message) as defined by sender */
  @NotNull public int length;

  /** Duration of the video in seconds as defined by sender */
  @NotNull public int duration;

  /** Optional. Video thumbnail */
  public PhotoSize thumbnail;

  /** Optional. File size in bytes */
  @SerializedName("file_size")
  public Integer fileSize;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoNote other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && length == other.length
        && duration == other.duration
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, length, duration, thumbnail, fileSize);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("VideoNote[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", length=")
        .append(length)
        .append(", duration=")
        .append(duration)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
