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
public class ListCloudConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connections")

    private List<CloudConnection> cloudConnections = null;

    public ListCloudConnectionsResponse withRequestId(String requestId) {
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

    public ListCloudConnectionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCloudConnectionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCloudConnectionsResponse withCloudConnections(List<CloudConnection> cloudConnections) {
        this.cloudConnections = cloudConnections;
        return this;
    }

    public ListCloudConnectionsResponse addCloudConnectionsItem(CloudConnection cloudConnectionsItem) {
        if (this.cloudConnections == null) {
            this.cloudConnections = new ArrayList<>();
        }
        this.cloudConnections.add(cloudConnectionsItem);
        return this;
    }

    public ListCloudConnectionsResponse withCloudConnections(Consumer<List<CloudConnection>> cloudConnectionsSetter) {
        if (this.cloudConnections == null) {
            this.cloudConnections = new ArrayList<>();
        }
        cloudConnectionsSetter.accept(this.cloudConnections);
        return this;
    }

    /**
     * 云连接实例列表。
     * @return cloudConnections
     */
    public List<CloudConnection> getCloudConnections() {
        return cloudConnections;
    }

    public void setCloudConnections(List<CloudConnection> cloudConnections) {
        this.cloudConnections = cloudConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudConnectionsResponse that = (ListCloudConnectionsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.cloudConnections, that.cloudConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, cloudConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudConnectionsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    cloudConnections: ").append(toIndentedString(cloudConnections)).append("\n");
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
