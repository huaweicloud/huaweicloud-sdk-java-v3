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
public class ListCentralNetworkConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_connections")

    private List<CentralNetworkConnection> centralNetworkConnections = null;

    public ListCentralNetworkConnectionsResponse withRequestId(String requestId) {
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

    public ListCentralNetworkConnectionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCentralNetworkConnectionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCentralNetworkConnectionsResponse withCentralNetworkConnections(
        List<CentralNetworkConnection> centralNetworkConnections) {
        this.centralNetworkConnections = centralNetworkConnections;
        return this;
    }

    public ListCentralNetworkConnectionsResponse addCentralNetworkConnectionsItem(
        CentralNetworkConnection centralNetworkConnectionsItem) {
        if (this.centralNetworkConnections == null) {
            this.centralNetworkConnections = new ArrayList<>();
        }
        this.centralNetworkConnections.add(centralNetworkConnectionsItem);
        return this;
    }

    public ListCentralNetworkConnectionsResponse withCentralNetworkConnections(
        Consumer<List<CentralNetworkConnection>> centralNetworkConnectionsSetter) {
        if (this.centralNetworkConnections == null) {
            this.centralNetworkConnections = new ArrayList<>();
        }
        centralNetworkConnectionsSetter.accept(this.centralNetworkConnections);
        return this;
    }

    /**
     * 中心网络连接列表。
     * @return centralNetworkConnections
     */
    public List<CentralNetworkConnection> getCentralNetworkConnections() {
        return centralNetworkConnections;
    }

    public void setCentralNetworkConnections(List<CentralNetworkConnection> centralNetworkConnections) {
        this.centralNetworkConnections = centralNetworkConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkConnectionsResponse that = (ListCentralNetworkConnectionsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.centralNetworkConnections, that.centralNetworkConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, centralNetworkConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkConnectionsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    centralNetworkConnections: ").append(toIndentedString(centralNetworkConnections)).append("\n");
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
