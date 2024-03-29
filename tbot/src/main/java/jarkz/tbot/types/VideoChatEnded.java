package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a service message about a video chat ended in the chat. */
public final class VideoChatEnded {

  public static final class Builder {

    private VideoChatEnded buildingType;

    public Builder() {
      buildingType = new VideoChatEnded();
    }

    public Builder setDuration(int duration) {
      buildingType.duration = duration;
      return this;
    }

    public VideoChatEnded build() {
      return buildingType;
    }
  }

  /** Video chat duration in seconds */
  @NotNull public int duration;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof VideoChatEnded other)) return false;
    return duration == other.duration;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(duration);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder.append("VideoChatEnded[duration=").append(duration).append("]");
    return builder.toString();
  }
}
