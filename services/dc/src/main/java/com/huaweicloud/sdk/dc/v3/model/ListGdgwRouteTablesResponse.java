package com.huaweicloud.sdk.dc.v3.model;

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
public class ListGdgwRouteTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gdgw_routetables")

    private List<CommonRoutetable> gdgwRoutetables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListGdgwRouteTablesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListGdgwRouteTablesResponse withGdgwRoutetables(List<CommonRoutetable> gdgwRoutetables) {
        this.gdgwRoutetables = gdgwRoutetables;
        return this;
    }

    public ListGdgwRouteTablesResponse addGdgwRoutetablesItem(CommonRoutetable gdgwRoutetablesItem) {
        if (this.gdgwRoutetables == null) {
            this.gdgwRoutetables = new ArrayList<>();
        }
        this.gdgwRoutetables.add(gdgwRoutetablesItem);
        return this;
    }

    public ListGdgwRouteTablesResponse withGdgwRoutetables(Consumer<List<CommonRoutetable>> gdgwRoutetablesSetter) {
        if (this.gdgwRoutetables == null) {
            this.gdgwRoutetables = new ArrayList<>();
        }
        gdgwRoutetablesSetter.accept(this.gdgwRoutetables);
        return this;
    }

    /**
     * 全域接入网关路由表
     * @return gdgwRoutetables
     */
    public List<CommonRoutetable> getGdgwRoutetables() {
        return gdgwRoutetables;
    }

    public void setGdgwRoutetables(List<CommonRoutetable> gdgwRoutetables) {
        this.gdgwRoutetables = gdgwRoutetables;
    }

    public ListGdgwRouteTablesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGdgwRouteTablesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListGdgwRouteTablesResponse that = (ListGdgwRouteTablesResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.gdgwRoutetables, that.gdgwRoutetables)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, gdgwRoutetables, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGdgwRouteTablesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    gdgwRoutetables: ").append(toIndentedString(gdgwRoutetables)).append("\n");
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
