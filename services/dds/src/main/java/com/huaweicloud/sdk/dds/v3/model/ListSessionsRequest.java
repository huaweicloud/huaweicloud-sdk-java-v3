package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSessionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    @JacksonXmlProperty(localName = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_summary")

    @JacksonXmlProperty(localName = "plan_summary")

    private String planSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time")

    @JacksonXmlProperty(localName = "cost_time")

    private Integer costTime;

    public ListSessionsRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID。允许查询的节点如下： 集群下面的 mongos节点以及 副本集、单节点实例下面的所有节点。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListSessionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。 从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSessionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。取值范围[1, 20]，默认10 （表示返回10条数据）。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSessionsRequest withPlanSummary(String planSummary) {
        this.planSummary = planSummary;
        return this;
    }

    /**
     * 执行计划描述。取空值表示查询所有语句类型，也可指定执行计划，例如： COLLSCAN IXSCAN FETCH SORT LIMIT SKIP COUNT COUNT_SCAN TEXT PROJECTION 等
     * @return planSummary
     */
    public String getPlanSummary() {
        return planSummary;
    }

    public void setPlanSummary(String planSummary) {
        this.planSummary = planSummary;
    }

    public ListSessionsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 操作类型。取空值表示查询所有操作类型。也可指定操作类型，例如： none update insert query command getmore remove killcursors等
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListSessionsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间。取空值表示查询所有命名空间。也可根据当前业务进行指定。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListSessionsRequest withCostTime(Integer costTime) {
        this.costTime = costTime;
        return this;
    }

    /**
     * 运行时间，单位为 ms。取空值表示查询所有的运行时间。也可根据当前业务需要进行配置，表示查询超出 cost_time 的会话。
     * @return costTime
     */
    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSessionsRequest listSessionsRequest = (ListSessionsRequest) o;
        return Objects.equals(this.nodeId, listSessionsRequest.nodeId)
            && Objects.equals(this.offset, listSessionsRequest.offset)
            && Objects.equals(this.limit, listSessionsRequest.limit)
            && Objects.equals(this.planSummary, listSessionsRequest.planSummary)
            && Objects.equals(this.type, listSessionsRequest.type)
            && Objects.equals(this.namespace, listSessionsRequest.namespace)
            && Objects.equals(this.costTime, listSessionsRequest.costTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, offset, limit, planSummary, type, namespace, costTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionsRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    planSummary: ").append(toIndentedString(planSummary)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
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
