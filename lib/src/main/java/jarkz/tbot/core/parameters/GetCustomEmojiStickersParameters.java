package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Use this method to get information about custom emoji stickers by their identifiers. Returns an
 * Array of Sticker objects.
 */
public final class GetCustomEmojiStickersParameters {

  /**
   * A JSON-serialized list of custom emoji identifiers. At most 200 custom emoji identifiers can be
   * specified.
   */
  @NotNull
  @SerializedName("custom_emoji_ids")
  public List<String> customEmojiIds;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetCustomEmojiStickersParameters other)) return false;
    return Objects.equals(customEmojiIds, other.customEmojiIds);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(customEmojiIds);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetCustomEmojiStickersParameters[customEmojiIds=")
        .append(customEmojiIds)
        .append("]");
    return builder.toString();
  }
}