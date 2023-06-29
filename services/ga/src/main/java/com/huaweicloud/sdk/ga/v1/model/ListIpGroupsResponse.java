package com.huaweicloud.sdk.ga.v1.model;

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
public class ListIpGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_groups")

    private List<IpGroupDetail> ipGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListIpGroupsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListIpGroupsResponse withIpGroups(List<IpGroupDetail> ipGroups) {
        this.ipGroups = ipGroups;
        return this;
    }

    public ListIpGroupsResponse addIpGroupsItem(IpGroupDetail ipGroupsItem) {
        if (this.ipGroups == null) {
            this.ipGroups = new ArrayList<>();
        }
        this.ipGroups.add(ipGroupsItem);
        return this;
    }

    public ListIpGroupsResponse withIpGroups(Consumer<List<IpGroupDetail>> ipGroupsSetter) {
        if (this.ipGroups == null) {
            this.ipGroups = new ArrayList<>();
        }
        ipGroupsSetter.accept(this.ipGroups);
        return this;
    }

    /**
     * Get ipGroups
     * @return ipGroups
     */
    public List<IpGroupDetail> getIpGroups() {
        return ipGroups;
    }

    public void setIpGroups(List<IpGroupDetail> ipGroups) {
        this.ipGroups = ipGroups;
    }

    public ListIpGroupsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListIpGroupsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
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
        ListIpGroupsResponse that = (ListIpGroupsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.ipGroups, that.ipGroups)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, ipGroups, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpGroupsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    ipGroups: ").append(toIndentedString(ipGroups)).append("\n");
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
