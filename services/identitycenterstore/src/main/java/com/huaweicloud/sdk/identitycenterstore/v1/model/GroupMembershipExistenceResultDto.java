package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Indicates whether a resource is a member of a group in the identity store.
 */
public class GroupMembershipExistenceResultDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private MemberIdDto memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "membership_exists")

    private Boolean membershipExists;

    public GroupMembershipExistenceResultDto withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 身份源中IAM身份中心用户组的全局唯一标识符（ID）
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public GroupMembershipExistenceResultDto withMemberId(MemberIdDto memberId) {
        this.memberId = memberId;
        return this;
    }

    public GroupMembershipExistenceResultDto withMemberId(Consumer<MemberIdDto> memberIdSetter) {
        if (this.memberId == null) {
            this.memberId = new MemberIdDto();
            memberIdSetter.accept(this.memberId);
        }

        return this;
    }

    /**
     * Get memberId
     * @return memberId
     */
    public MemberIdDto getMemberId() {
        return memberId;
    }

    public void setMemberId(MemberIdDto memberId) {
        this.memberId = memberId;
    }

    public GroupMembershipExistenceResultDto withMembershipExists(Boolean membershipExists) {
        this.membershipExists = membershipExists;
        return this;
    }

    /**
     * 一个布尔值，表示用户是否在组中
     * @return membershipExists
     */
    public Boolean getMembershipExists() {
        return membershipExists;
    }

    public void setMembershipExists(Boolean membershipExists) {
        this.membershipExists = membershipExists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupMembershipExistenceResultDto that = (GroupMembershipExistenceResultDto) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.memberId, that.memberId)
            && Objects.equals(this.membershipExists, that.membershipExists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, memberId, membershipExists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupMembershipExistenceResultDto {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    membershipExists: ").append(toIndentedString(membershipExists)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
