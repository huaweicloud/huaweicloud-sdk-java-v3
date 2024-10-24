package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGroupMembershipsForMemberResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_memberships")

    private List<GroupMembershipItem> groupMemberships = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListGroupMembershipsForMemberResponse withGroupMemberships(List<GroupMembershipItem> groupMemberships) {
        this.groupMemberships = groupMemberships;
        return this;
    }

    public ListGroupMembershipsForMemberResponse addGroupMembershipsItem(GroupMembershipItem groupMembershipsItem) {
        if (this.groupMemberships == null) {
            this.groupMemberships = new ArrayList<>();
        }
        this.groupMemberships.add(groupMembershipsItem);
        return this;
    }

    public ListGroupMembershipsForMemberResponse withGroupMemberships(
        Consumer<List<GroupMembershipItem>> groupMembershipsSetter) {
        if (this.groupMemberships == null) {
            this.groupMemberships = new ArrayList<>();
        }
        groupMembershipsSetter.accept(this.groupMemberships);
        return this;
    }

    /**
     * 满足查询条件的关联关系对象列表
     * @return groupMemberships
     */
    public List<GroupMembershipItem> getGroupMemberships() {
        return groupMemberships;
    }

    public void setGroupMemberships(List<GroupMembershipItem> groupMemberships) {
        this.groupMemberships = groupMemberships;
    }

    public ListGroupMembershipsForMemberResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGroupMembershipsForMemberResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGroupMembershipsForMemberResponse that = (ListGroupMembershipsForMemberResponse) obj;
        return Objects.equals(this.groupMemberships, that.groupMemberships)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupMemberships, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupMembershipsForMemberResponse {\n");
        sb.append("    groupMemberships: ").append(toIndentedString(groupMemberships)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
