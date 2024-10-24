package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建成员和组之间的关系。必须指定以下标识符：GroupId、IdentityStoreId和memberId
 */
public class CreateGroupMembershipReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private MemberIdDto memberId;

    public CreateGroupMembershipReqBody withGroupId(String groupId) {
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

    public CreateGroupMembershipReqBody withMemberId(MemberIdDto memberId) {
        this.memberId = memberId;
        return this;
    }

    public CreateGroupMembershipReqBody withMemberId(Consumer<MemberIdDto> memberIdSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGroupMembershipReqBody that = (CreateGroupMembershipReqBody) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, memberId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGroupMembershipReqBody {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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
