package jarkz.tbot.types.bot;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class BotDescription {

  @NotNull private String description;

  public BotDescription() {}

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(description);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof BotDescription other)) return false;
    return Objects.equals(description, other.description);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("BotDescription[description=").append(description).append("]");
    return builder.toString();
  }
}
