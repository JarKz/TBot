package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** Represents a chat member that has some additional privileges. */
public final class ChatMemberAdministrator implements ChatMember {

  public static final class Builder {

    private ChatMemberAdministrator buildingType;

    public Builder() {
      buildingType = new ChatMemberAdministrator();
    }

    public Builder setUser(User user) {
      buildingType.user = user;
      return this;
    }

    public Builder setCanBeEdited(boolean canBeEdited) {
      buildingType.canBeEdited = canBeEdited;
      return this;
    }

    public Builder setAnonymous(boolean isAnonymous) {
      buildingType.isAnonymous = isAnonymous;
      return this;
    }

    public Builder setCanManageChat(boolean canManageChat) {
      buildingType.canManageChat = canManageChat;
      return this;
    }

    public Builder setCanDeleteMessages(boolean canDeleteMessages) {
      buildingType.canDeleteMessages = canDeleteMessages;
      return this;
    }

    public Builder setCanManageVideoChats(boolean canManageVideoChats) {
      buildingType.canManageVideoChats = canManageVideoChats;
      return this;
    }

    public Builder setCanRestrictMembers(boolean canRestrictMembers) {
      buildingType.canRestrictMembers = canRestrictMembers;
      return this;
    }

    public Builder setCanPromoteMembers(boolean canPromoteMembers) {
      buildingType.canPromoteMembers = canPromoteMembers;
      return this;
    }

    public Builder setCanChangeInfo(boolean canChangeInfo) {
      buildingType.canChangeInfo = canChangeInfo;
      return this;
    }

    public Builder setCanInviteUsers(boolean canInviteUsers) {
      buildingType.canInviteUsers = canInviteUsers;
      return this;
    }

    public Builder setCanPostStories(boolean canPostStories) {
      buildingType.canPostStories = canPostStories;
      return this;
    }

    public Builder setCanEditStories(boolean canEditStories) {
      buildingType.canEditStories = canEditStories;
      return this;
    }

    public Builder setCanDeleteStories(boolean canDeleteStories) {
      buildingType.canDeleteStories = canDeleteStories;
      return this;
    }

    public Builder setCanPostMessages(Boolean canPostMessages) {
      buildingType.canPostMessages = canPostMessages;
      return this;
    }

    public Builder setCanEditMessages(Boolean canEditMessages) {
      buildingType.canEditMessages = canEditMessages;
      return this;
    }

    public Builder setCanPinMessages(Boolean canPinMessages) {
      buildingType.canPinMessages = canPinMessages;
      return this;
    }

    public Builder setCanManageTopics(Boolean canManageTopics) {
      buildingType.canManageTopics = canManageTopics;
      return this;
    }

    public Builder setCustomTitle(String customTitle) {
      buildingType.customTitle = customTitle;
      return this;
    }

    public ChatMemberAdministrator build() {
      return buildingType;
    }
  }

  public static final String STATUS = "administrator";

  /** The member's status in the chat, always "administrator" */
  @NotNull public final String status = STATUS;

  /** Information about the user */
  @NotNull public User user;

  /** True, if the bot is allowed to edit administrator privileges of that user */
  @NotNull
  @SerializedName("can_be_edited")
  public boolean canBeEdited;

  /** True, if the user's presence in the chat is hidden */
  @NotNull
  @SerializedName("is_anonymous")
  public boolean isAnonymous;

  /**
   * True, if the administrator can access the chat event log, get boost list, see hidden supergroup
   * and channel members, report spam messages and ignore slow mode. Implied by any other
   * administrator privilege.
   */
  @NotNull
  @SerializedName("can_manage_chat")
  public boolean canManageChat;

  /** True, if the administrator can delete messages of other users */
  @NotNull
  @SerializedName("can_delete_messages")
  public boolean canDeleteMessages;

  /** True, if the administrator can manage video chats */
  @NotNull
  @SerializedName("can_manage_video_chats")
  public boolean canManageVideoChats;

  /**
   * True, if the administrator can restrict, ban or unban chat members, or access supergroup
   * statistics
   */
  @NotNull
  @SerializedName("can_restrict_members")
  public boolean canRestrictMembers;

  /**
   * True, if the administrator can add new administrators with a subset of their own privileges or
   * demote administrators that they have promoted, directly or indirectly (promoted by
   * administrators that were appointed by the user)
   */
  @NotNull
  @SerializedName("can_promote_members")
  public boolean canPromoteMembers;

  /** True, if the user is allowed to change the chat title, photo and other settings */
  @NotNull
  @SerializedName("can_change_info")
  public boolean canChangeInfo;

  /** True, if the user is allowed to invite new users to the chat */
  @NotNull
  @SerializedName("can_invite_users")
  public boolean canInviteUsers;

  /** True, if the administrator can post stories to the chat */
  @NotNull
  @SerializedName("can_post_stories")
  public boolean canPostStories;

  /** True, if the administrator can edit stories posted by other users */
  @NotNull
  @SerializedName("can_edit_stories")
  public boolean canEditStories;

  /** True, if the administrator can delete stories posted by other users */
  @NotNull
  @SerializedName("can_delete_stories")
  public boolean canDeleteStories;

  /**
   * Optional. True, if the administrator can post messages in the channel, or access channel
   * statistics; for channels only
   */
  @SerializedName("can_post_messages")
  public Boolean canPostMessages;

  /**
   * Optional. True, if the administrator can edit messages of other users and can pin messages; for
   * channels only
   */
  @SerializedName("can_edit_messages")
  public Boolean canEditMessages;

  /** Optional. True, if the user is allowed to pin messages; for groups and supergroups only */
  @SerializedName("can_pin_messages")
  public Boolean canPinMessages;

  /**
   * Optional. True, if the user is allowed to create, rename, close, and reopen forum topics; for
   * supergroups only
   */
  @SerializedName("can_manage_topics")
  public Boolean canManageTopics;

  /** Optional. Custom title for this user */
  @SerializedName("custom_title")
  public String customTitle;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberAdministrator other)) return false;
    return Objects.equals(status, other.status)
        && Objects.equals(user, other.user)
        && canBeEdited == other.canBeEdited
        && isAnonymous == other.isAnonymous
        && canManageChat == other.canManageChat
        && canDeleteMessages == other.canDeleteMessages
        && canManageVideoChats == other.canManageVideoChats
        && canRestrictMembers == other.canRestrictMembers
        && canPromoteMembers == other.canPromoteMembers
        && canChangeInfo == other.canChangeInfo
        && canInviteUsers == other.canInviteUsers
        && canPostStories == other.canPostStories
        && canEditStories == other.canEditStories
        && canDeleteStories == other.canDeleteStories
        && Objects.equals(canPostMessages, other.canPostMessages)
        && Objects.equals(canEditMessages, other.canEditMessages)
        && Objects.equals(canPinMessages, other.canPinMessages)
        && Objects.equals(canManageTopics, other.canManageTopics)
        && Objects.equals(customTitle, other.customTitle);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        status,
        user,
        canBeEdited,
        isAnonymous,
        canManageChat,
        canDeleteMessages,
        canManageVideoChats,
        canRestrictMembers,
        canPromoteMembers,
        canChangeInfo,
        canInviteUsers,
        canPostStories,
        canEditStories,
        canDeleteStories,
        canPostMessages,
        canEditMessages,
        canPinMessages,
        canManageTopics,
        customTitle);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatMemberAdministrator[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append(", canBeEdited=")
        .append(canBeEdited)
        .append(", isAnonymous=")
        .append(isAnonymous)
        .append(", canManageChat=")
        .append(canManageChat)
        .append(", canDeleteMessages=")
        .append(canDeleteMessages)
        .append(", canManageVideoChats=")
        .append(canManageVideoChats)
        .append(", canRestrictMembers=")
        .append(canRestrictMembers)
        .append(", canPromoteMembers=")
        .append(canPromoteMembers)
        .append(", canChangeInfo=")
        .append(canChangeInfo)
        .append(", canInviteUsers=")
        .append(canInviteUsers)
        .append(", canPostStories=")
        .append(canPostStories)
        .append(", canEditStories=")
        .append(canEditStories)
        .append(", canDeleteStories=")
        .append(canDeleteStories)
        .append(", canPostMessages=")
        .append(canPostMessages)
        .append(", canEditMessages=")
        .append(canEditMessages)
        .append(", canPinMessages=")
        .append(canPinMessages)
        .append(", canManageTopics=")
        .append(canManageTopics)
        .append(", customTitle=")
        .append(customTitle)
        .append("]");
    return builder.toString();
  }
}
