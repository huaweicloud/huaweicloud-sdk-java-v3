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
public class ListByoipPoolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "byoip_pools")

    private List<ByoipPool> byoipPools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListByoipPoolsResponse withRequestId(String requestId) {
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

    public ListByoipPoolsResponse withByoipPools(List<ByoipPool> byoipPools) {
        this.byoipPools = byoipPools;
        return this;
    }

    public ListByoipPoolsResponse addByoipPoolsItem(ByoipPool byoipPoolsItem) {
        if (this.byoipPools == null) {
            this.byoipPools = new ArrayList<>();
        }
        this.byoipPools.add(byoipPoolsItem);
        return this;
    }

    public ListByoipPoolsResponse withByoipPools(Consumer<List<ByoipPool>> byoipPoolsSetter) {
        if (this.byoipPools == null) {
            this.byoipPools = new ArrayList<>();
        }
        byoipPoolsSetter.accept(this.byoipPools);
        return this;
    }

    /**
     * 自带IP地址池列表。
     * @return byoipPools
     */
    public List<ByoipPool> getByoipPools() {
        return byoipPools;
    }

    public void setByoipPools(List<ByoipPool> byoipPools) {
        this.byoipPools = byoipPools;
    }

    public ListByoipPoolsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListByoipPoolsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListByoipPoolsResponse that = (ListByoipPoolsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.byoipPools, that.byoipPools)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, byoipPools, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListByoipPoolsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    byoipPools: ").append(toIndentedString(byoipPools)).append("\n");
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
