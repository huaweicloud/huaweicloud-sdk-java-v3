package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEnhancedConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    @JacksonXmlProperty(localName = "connections")

    private List<ListEnhancedConnectionsDetail> connections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListEnhancedConnectionsResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListEnhancedConnectionsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListEnhancedConnectionsResponse withConnections(List<ListEnhancedConnectionsDetail> connections) {
        this.connections = connections;
        return this;
    }

    public ListEnhancedConnectionsResponse addConnectionsItem(ListEnhancedConnectionsDetail connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public ListEnhancedConnectionsResponse withConnections(
        Consumer<List<ListEnhancedConnectionsDetail>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /**
     * 跨源连接信息列表。
     * @return connections
     */
    public List<ListEnhancedConnectionsDetail> getConnections() {
        return connections;
    }

    public void setConnections(List<ListEnhancedConnectionsDetail> connections) {
        this.connections = connections;
    }

    public ListEnhancedConnectionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 返回的跨源连接个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnhancedConnectionsResponse listEnhancedConnectionsResponse = (ListEnhancedConnectionsResponse) o;
        return Objects.equals(this.isSuccess, listEnhancedConnectionsResponse.isSuccess)
            && Objects.equals(this.message, listEnhancedConnectionsResponse.message)
            && Objects.equals(this.connections, listEnhancedConnectionsResponse.connections)
            && Objects.equals(this.count, listEnhancedConnectionsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, connections, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnhancedConnectionsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
