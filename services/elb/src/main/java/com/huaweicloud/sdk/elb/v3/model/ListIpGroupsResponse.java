package com.huaweicloud.sdk.elb.v3.model;

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
    @JsonProperty(value = "ipgroups")

    private List<IpGroup> ipgroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListIpGroupsResponse withIpgroups(List<IpGroup> ipgroups) {
        this.ipgroups = ipgroups;
        return this;
    }

    public ListIpGroupsResponse addIpgroupsItem(IpGroup ipgroupsItem) {
        if (this.ipgroups == null) {
            this.ipgroups = new ArrayList<>();
        }
        this.ipgroups.add(ipgroupsItem);
        return this;
    }

    public ListIpGroupsResponse withIpgroups(Consumer<List<IpGroup>> ipgroupsSetter) {
        if (this.ipgroups == null) {
            this.ipgroups = new ArrayList<>();
        }
        ipgroupsSetter.accept(this.ipgroups);
        return this;
    }

    /**
     * **参数解释**：IP地址组列表返回对象。
     * @return ipgroups
     */
    public List<IpGroup> getIpgroups() {
        return ipgroups;
    }

    public void setIpgroups(List<IpGroup> ipgroups) {
        this.ipgroups = ipgroups;
    }

    public ListIpGroupsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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
        return Objects.equals(this.ipgroups, that.ipgroups) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroups, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpGroupsResponse {\n");
        sb.append("    ipgroups: ").append(toIndentedString(ipgroups)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
