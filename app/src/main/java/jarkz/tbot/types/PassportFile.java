package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a file uploaded to Telegram Passport. Currently all Telegram Passport
 * files are in JPEG format when decrypted and don't exceed 10MB.
 */
public final class PassportFile {

  /** Identifier for this file, which can be used to download or reuse the file */
  @NotNull
  @SerializedName("file_id")
  public String fileId;

  /**
   * Unique identifier for this file, which is supposed to be the same over time and for different
   * bots. Can't be used to download or reuse the file.
   */
  @SerializedName("file_unique_id")
  @NotNull
  public String fileUniqueId;

  /** File size in bytes */
  @NotNull
  @SerializedName("file_size")
  public int fileSize;

  /** Unix time when the file was uploaded */
  @NotNull
  @SerializedName("file_date")
  public int fileDate;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PassportFile other)) return false;
    return Objects.equals(fileId, other.fileId)
        && Objects.equals(fileUniqueId, other.fileUniqueId)
        && fileSize == other.fileSize
        && fileDate == other.fileDate;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(fileId, fileUniqueId, fileSize, fileDate);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("PassportFile[fileId=")
        .append(fileId)
        .append(", fileUniqueId=")
        .append(fileUniqueId)
        .append(", fileSize=")
        .append(fileSize)
        .append(", fileDate=")
        .append(fileDate)
        .append("]");
    return builder.toString();
  }
}
