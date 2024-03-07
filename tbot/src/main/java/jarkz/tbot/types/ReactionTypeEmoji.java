package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** The reaction is based on an emoji. */
public final class ReactionTypeEmoji implements ReactionType {

  public static final class Builder {

    private ReactionTypeEmoji buildingType;

    public Builder() {
      buildingType = new ReactionTypeEmoji();
    }

    public Builder setEmoji(String emoji) {
      buildingType.emoji = emoji;
      return this;
    }

    public ReactionTypeEmoji build() {
      return buildingType;
    }
  }

  public static final String TYPE = "emoji";

  /** Type of the reaction, always "emoji" */
  @NotNull public final String type = TYPE;

  /**
   * Reaction emoji. Currently, it can be one of "👍", "👎", "❤", "🔥", "🥰", "👏", "😁", "🤔",
   * "🤯", "😱", "🤬", "😢", "🎉", "🤩", "🤮", "💩", "🙏", "👌", "🕊", "🤡", "🥱", "🥴", "😍", "🐳",
   * "❤‍🔥", "🌚", "🌭", "💯", "🤣", "⚡", "🍌", "🏆", "💔", "🤨", "😐", "🍓", "🍾", "💋", "🖕",
   * "😈", "😴", "😭", "🤓", "👻", "👨‍💻", "👀", "🎃", "🙈", "😇", "😨", "🤝", "✍", "🤗", "🫡",
   * "🎅", "🎄", "☃", "💅", "🤪", "🗿", "🆒", "💘", "🙉", "🦄", "😘", "💊", "🙊", "😎", "👾",
   * "🤷‍♂", "🤷", "🤷‍♀", "😡"
   */
  @NotNull public String emoji;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReactionTypeEmoji other)) return false;
    return Objects.equals(type, other.type) && Objects.equals(emoji, other.emoji);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(type, emoji);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ReactionTypeEmoji[type=")
        .append(type)
        .append(", emoji=")
        .append(emoji)
        .append("]");
    return builder.toString();
  }
}
