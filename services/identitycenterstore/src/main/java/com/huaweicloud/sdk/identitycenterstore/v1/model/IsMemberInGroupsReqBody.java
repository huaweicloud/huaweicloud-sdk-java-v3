package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 判断用户是否在用户组请求体
 */
public class IsMemberInGroupsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_ids")

    private List<String> groupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private MemberIdDto memberId;

    public IsMemberInGroupsReqBody withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public IsMemberInGroupsReqBody addGroupIdsItem(String groupIdsItem) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupIdsItem);
        return this;
    }

    public IsMemberInGroupsReqBody withGroupIds(Consumer<List<String>> groupIdsSetter) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        groupIdsSetter.accept(this.groupIds);
        return this;
    }

    /**
     * 用户组标识符列表
     * @return groupIds
     */
    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public IsMemberInGroupsReqBody withMemberId(MemberIdDto memberId) {
        this.memberId = memberId;
        return this;
    }

    public IsMemberInGroupsReqBody withMemberId(Consumer<MemberIdDto> memberIdSetter) {
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
        IsMemberInGroupsReqBody that = (IsMemberInGroupsReqBody) obj;
        return Objects.equals(this.groupIds, that.groupIds) && Objects.equals(this.memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupIds, memberId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsMemberInGroupsReqBody {\n");
        sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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
