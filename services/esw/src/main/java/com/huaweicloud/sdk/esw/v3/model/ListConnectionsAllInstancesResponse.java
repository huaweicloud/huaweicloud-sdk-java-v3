package com.huaweicloud.sdk.esw.v3.model;

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
public class ListConnectionsAllInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private List<Connection> connections = null;

    public ListConnectionsAllInstancesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * - 参数解释：请求的唯一标识。 - 约束限制：UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListConnectionsAllInstancesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListConnectionsAllInstancesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListConnectionsAllInstancesResponse withConnections(List<Connection> connections) {
        this.connections = connections;
        return this;
    }

    public ListConnectionsAllInstancesResponse addConnectionsItem(Connection connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public ListConnectionsAllInstancesResponse withConnections(Consumer<List<Connection>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /**
     * - 参数解释：查询二层连接列表的响应体。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return connections
     */
    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionsAllInstancesResponse that = (ListConnectionsAllInstancesResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.connections, that.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, connections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionsAllInstancesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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
