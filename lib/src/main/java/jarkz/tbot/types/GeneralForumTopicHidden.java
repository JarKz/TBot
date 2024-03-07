package jarkz.tbot.types;

/**
 * This object represents a service message about General forum topic hidden in the chat. Currently
 * holds no information.
 */
public final class GeneralForumTopicHidden {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GeneralForumTopicHidden)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "GeneralForumTopicHidden[]";
  }
}