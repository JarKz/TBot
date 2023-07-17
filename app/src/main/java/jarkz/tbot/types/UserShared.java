package jarkz.tbot.types;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class UserShared {

	@SerializedName("request_id")
	@NotNull
	public int requestId;

	@SerializedName("user_id")
	@NotNull
	public long userId;

	public UserShared(){
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UserShared other))
			return false;
		return requestId == other.requestId && userId == other.userId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserShared[requestId=").append(requestId).append(", userId=").append(userId).append("]");
		return builder.toString();
	}
}
