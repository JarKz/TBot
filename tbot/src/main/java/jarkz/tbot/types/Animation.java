package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound). */
public final class Animation {

  public static final class Builder {

    private Animation buildingType;

    public Builder() {
      buildingType = new Animation();
    }

    public Builder setFileId(String fileId) {
      buildingType.fileId = fileId;
      return this;
    }

    public Builder setFileUniqueId(String fileUniqueId) {
      buildingType.fileUniqueId = fileUniqueId;
      return this;
    }

    public Builder setWidth(int width) {
      buildingType.width = width;
      return this;
    }

    public Builder setHeight(int height) {
      buildingType.height = height;
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

    public Builder setFileName(String fileName) {
      buildingType.fileName = fileName;
      return this;
    }

    public Builder setMimeType(String mimeType) {
      buildingType.mimeType = mimeType;
      return this;
    }

    public Builder setFileSize(Long fileSize) {
      buildingType.fileSize = fileSize;
      return this;
    }

    public Animation build() {
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

  /** Video width as defined by sender */
  @NotNull public int width;

  /** Video height as defined by sender */
  @NotNull public int height;

  /** Duration of the video in seconds as defined by sender */
  @NotNull public int duration;

  /** Optional. Animation thumbnail as defined by sender */
  public PhotoSize thumbnail;

  /** Optional. Original animation filename as defined by sender */
  @SerializedName("file_name")
  public String fileName;

  /** Optional. MIME type of the file as defined by sender */
  @SerializedName("mime_type")
  public String mimeType;

  /**
   * Optional. File size in bytes. It can be bigger than 2^31 and some programming languages may
   * have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a
   * signed 64-bit integer or double-precision float type are safe for storing this value.
   */
  @SerializedName("file_size")
  public Long fileSize;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Animation other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && width == other.width
        && height == other.height
        && duration == other.duration
        && Objects.equals(thumbnail, other.thumbnail)
        && Objects.equals(fileName, other.fileName)
        && Objects.equals(mimeType, other.mimeType)
        && Objects.equals(fileSize, other.fileSize);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        fileId, fileUniqueId, width, height, duration, thumbnail, fileName, mimeType, fileSize);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("Animation[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", width=")
        .append(width)
        .append(", height=")
        .append(height)
        .append(", duration=")
        .append(duration)
        .append(", thumbnail=")
        .append(thumbnail)
        .append(", fileName=")
        .append(fileName)
        .append(", mimeType=")
        .append(mimeType)
        .append(", fileSize=")
        .append(fileSize)
        .append("]");
    return builder.toString();
  }
}
