package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class MessageId {

	@SerializedName("message_id")
	private Long messageId;

	public MessageId() {
	}

	public Optional<Long> getMessageId() {
		return Optional.of(messageId);
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(messageId);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MessageId other))
			return false;
		return Objects.equals(messageId, other.messageId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MessageId[messageId=").append(messageId).append("]");
		return builder.toString();
	}
}
