package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListRealTimeSessionsRequestBody
 */
public class ListRealTimeSessionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_info")

    private SessionQueryInfoOption queryInfo;

    public ListRealTimeSessionsRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **约束限制**： 仅支持非日志类型的CN或DN节点。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListRealTimeSessionsRequestBody withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释**： 组件ID。 **约束限制**： 仅支持非日志类型的CN或DN节点。 **取值范围**： 不涉及。 **默认取值**: 不涉及。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListRealTimeSessionsRequestBody withQueryInfo(SessionQueryInfoOption queryInfo) {
        this.queryInfo = queryInfo;
        return this;
    }

    public ListRealTimeSessionsRequestBody withQueryInfo(Consumer<SessionQueryInfoOption> queryInfoSetter) {
        if (this.queryInfo == null) {
            this.queryInfo = new SessionQueryInfoOption();
            queryInfoSetter.accept(this.queryInfo);
        }

        return this;
    }

    /**
     * Get queryInfo
     * @return queryInfo
     */
    public SessionQueryInfoOption getQueryInfo() {
        return queryInfo;
    }

    public void setQueryInfo(SessionQueryInfoOption queryInfo) {
        this.queryInfo = queryInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRealTimeSessionsRequestBody that = (ListRealTimeSessionsRequestBody) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.queryInfo, that.queryInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, componentId, queryInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRealTimeSessionsRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    queryInfo: ").append(toIndentedString(queryInfo)).append("\n");
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
