package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DescribeGroupMembershipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private MemberIdDto memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "membership_id")

    private String membershipId;

    public DescribeGroupMembershipResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 身份源中IdentityCenter用户组的全局唯一标识符（ID）
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DescribeGroupMembershipResponse withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * 身份源的全局唯一标识符（ID）
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    public DescribeGroupMembershipResponse withMemberId(MemberIdDto memberId) {
        this.memberId = memberId;
        return this;
    }

    public DescribeGroupMembershipResponse withMemberId(Consumer<MemberIdDto> memberIdSetter) {
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

    public DescribeGroupMembershipResponse withMembershipId(String membershipId) {
        this.membershipId = membershipId;
        return this;
    }

    /**
     * 身份源中用户和组关联关系的全局唯一标识符（ID）
     * @return membershipId
     */
    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeGroupMembershipResponse that = (DescribeGroupMembershipResponse) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.identityStoreId, that.identityStoreId)
            && Objects.equals(this.memberId, that.memberId) && Objects.equals(this.membershipId, that.membershipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, identityStoreId, memberId, membershipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeGroupMembershipResponse {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
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
