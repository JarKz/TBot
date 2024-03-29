package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/** This object represents a sticker set. */
public final class StickerSet {

  public static final class Builder {

    private StickerSet buildingType;

    public Builder() {
      buildingType = new StickerSet();
    }

    public Builder setName(String name) {
      buildingType.name = name;
      return this;
    }

    public Builder setTitle(String title) {
      buildingType.title = title;
      return this;
    }

    public Builder setStickerType(String stickerType) {
      buildingType.stickerType = stickerType;
      return this;
    }

    public Builder setAnimated(boolean isAnimated) {
      buildingType.isAnimated = isAnimated;
      return this;
    }

    public Builder setVideo(boolean isVideo) {
      buildingType.isVideo = isVideo;
      return this;
    }

    public Builder setStickers(List<Sticker> stickers) {
      buildingType.stickers = stickers;
      return this;
    }

    public Builder setThumbnail(PhotoSize thumbnail) {
      buildingType.thumbnail = thumbnail;
      return this;
    }

    public StickerSet build() {
      return buildingType;
    }
  }

  /** Sticker set name */
  @NotNull public String name;

  /** Sticker set title */
  @NotNull public String title;

  /** Type of stickers in the set, currently one of "regular", "mask", "custom_emoji" */
  @NotNull
  @SerializedName("sticker_type")
  public String stickerType;

  /** True, if the sticker set contains animated stickers */
  @NotNull
  @SerializedName("is_animated")
  public boolean isAnimated;

  /** True, if the sticker set contains video stickers */
  @NotNull
  @SerializedName("is_video")
  public boolean isVideo;

  /** List of all set stickers */
  @NotNull public List<Sticker> stickers;

  /** Optional. Sticker set thumbnail in the .WEBP, .TGS, or .WEBM format */
  public PhotoSize thumbnail;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof StickerSet other)) return false;
    return Objects.equals(name, other.name)
        && Objects.equals(title, other.title)
        && Objects.equals(stickerType, other.stickerType)
        && isAnimated == other.isAnimated
        && isVideo == other.isVideo
        && Objects.equals(stickers, other.stickers)
        && Objects.equals(thumbnail, other.thumbnail);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name, title, stickerType, isAnimated, isVideo, stickers, thumbnail);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("StickerSet[name=")
        .append(name)
        .append(", title=")
        .append(title)
        .append(", stickerType=")
        .append(stickerType)
        .append(", isAnimated=")
        .append(isAnimated)
        .append(", isVideo=")
        .append(isVideo)
        .append(", stickers=")
        .append(stickers)
        .append(", thumbnail=")
        .append(thumbnail)
        .append("]");
    return builder.toString();
  }
}
