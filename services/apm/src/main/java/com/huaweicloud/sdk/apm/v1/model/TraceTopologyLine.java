package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 拓扑图上的组件调用指向线。
 */
public class TraceTopologyLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_node_id")

    private Long startNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_node_id")

    private Long endNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_id")

    private String spanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_info")

    private TraceTopologyLineInfo clientInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_info")

    private TraceTopologyLineInfo serverInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint")

    private String hint;

    public TraceTopologyLine withStartNodeId(Long startNodeId) {
        this.startNodeId = startNodeId;
        return this;
    }

    /**
     * 开始节点id。
     * @return startNodeId
     */
    public Long getStartNodeId() {
        return startNodeId;
    }

    public void setStartNodeId(Long startNodeId) {
        this.startNodeId = startNodeId;
    }

    public TraceTopologyLine withEndNodeId(Long endNodeId) {
        this.endNodeId = endNodeId;
        return this;
    }

    /**
     * 结束节点id。
     * @return endNodeId
     */
    public Long getEndNodeId() {
        return endNodeId;
    }

    public void setEndNodeId(Long endNodeId) {
        this.endNodeId = endNodeId;
    }

    public TraceTopologyLine withSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }

    /**
     * 调用跨度id。
     * @return spanId
     */
    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public TraceTopologyLine withClientInfo(TraceTopologyLineInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }

    public TraceTopologyLine withClientInfo(Consumer<TraceTopologyLineInfo> clientInfoSetter) {
        if (this.clientInfo == null) {
            this.clientInfo = new TraceTopologyLineInfo();
            clientInfoSetter.accept(this.clientInfo);
        }

        return this;
    }

    /**
     * Get clientInfo
     * @return clientInfo
     */
    public TraceTopologyLineInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(TraceTopologyLineInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public TraceTopologyLine withServerInfo(TraceTopologyLineInfo serverInfo) {
        this.serverInfo = serverInfo;
        return this;
    }

    public TraceTopologyLine withServerInfo(Consumer<TraceTopologyLineInfo> serverInfoSetter) {
        if (this.serverInfo == null) {
            this.serverInfo = new TraceTopologyLineInfo();
            serverInfoSetter.accept(this.serverInfo);
        }

        return this;
    }

    /**
     * Get serverInfo
     * @return serverInfo
     */
    public TraceTopologyLineInfo getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(TraceTopologyLineInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public TraceTopologyLine withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TraceTopologyLine withHint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * 获取一条线的提示信息。
     * @return hint
     */
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TraceTopologyLine that = (TraceTopologyLine) obj;
        return Objects.equals(this.startNodeId, that.startNodeId) && Objects.equals(this.endNodeId, that.endNodeId)
            && Objects.equals(this.spanId, that.spanId) && Objects.equals(this.clientInfo, that.clientInfo)
            && Objects.equals(this.serverInfo, that.serverInfo) && Objects.equals(this.id, that.id)
            && Objects.equals(this.hint, that.hint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startNodeId, endNodeId, spanId, clientInfo, serverInfo, id, hint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TraceTopologyLine {\n");
        sb.append("    startNodeId: ").append(toIndentedString(startNodeId)).append("\n");
        sb.append("    endNodeId: ").append(toIndentedString(endNodeId)).append("\n");
        sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
        sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
        sb.append("    serverInfo: ").append(toIndentedString(serverInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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
