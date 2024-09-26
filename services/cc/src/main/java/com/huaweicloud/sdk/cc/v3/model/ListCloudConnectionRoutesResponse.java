package com.huaweicloud.sdk.cc.v3.model;

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
public class ListCloudConnectionRoutesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_routes")

    private List<CloudConnectionRoute> cloudConnectionRoutes = null;

    public ListCloudConnectionRoutesResponse withRequestId(String requestId) {
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

    public ListCloudConnectionRoutesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCloudConnectionRoutesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCloudConnectionRoutesResponse withCloudConnectionRoutes(
        List<CloudConnectionRoute> cloudConnectionRoutes) {
        this.cloudConnectionRoutes = cloudConnectionRoutes;
        return this;
    }

    public ListCloudConnectionRoutesResponse addCloudConnectionRoutesItem(
        CloudConnectionRoute cloudConnectionRoutesItem) {
        if (this.cloudConnectionRoutes == null) {
            this.cloudConnectionRoutes = new ArrayList<>();
        }
        this.cloudConnectionRoutes.add(cloudConnectionRoutesItem);
        return this;
    }

    public ListCloudConnectionRoutesResponse withCloudConnectionRoutes(
        Consumer<List<CloudConnectionRoute>> cloudConnectionRoutesSetter) {
        if (this.cloudConnectionRoutes == null) {
            this.cloudConnectionRoutes = new ArrayList<>();
        }
        cloudConnectionRoutesSetter.accept(this.cloudConnectionRoutes);
        return this;
    }

    /**
     * 云连接路由实例列表。
     * @return cloudConnectionRoutes
     */
    public List<CloudConnectionRoute> getCloudConnectionRoutes() {
        return cloudConnectionRoutes;
    }

    public void setCloudConnectionRoutes(List<CloudConnectionRoute> cloudConnectionRoutes) {
        this.cloudConnectionRoutes = cloudConnectionRoutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudConnectionRoutesResponse that = (ListCloudConnectionRoutesResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.cloudConnectionRoutes, that.cloudConnectionRoutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, cloudConnectionRoutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudConnectionRoutesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    cloudConnectionRoutes: ").append(toIndentedString(cloudConnectionRoutes)).append("\n");
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
