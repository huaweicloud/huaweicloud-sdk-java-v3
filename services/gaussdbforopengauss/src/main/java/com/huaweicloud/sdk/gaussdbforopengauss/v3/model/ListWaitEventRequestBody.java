package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListWaitEventRequestBody
 */
public class ListWaitEventRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system")

    private Boolean system;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_fields")

    private List<List<String>> orderFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event_query_info")

    private WaitEventQueryInfo waitEventQueryInfo;

    public ListWaitEventRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: 节点ID，仅支持包含有CN或DN（主、备）组件的节点。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListWaitEventRequestBody withSystem(Boolean system) {
        this.system = system;
        return this;
    }

    /**
     * **参数解释**: 是否查询系统用户。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return system
     */
    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public ListWaitEventRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 查询记录数。 **约束限制**: 不能为负数。 **取值范围**: [1，100]。 **默认取值**: 默认为10。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListWaitEventRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询。 **约束限制**: 必须为数字，不能为负数。 **取值范围**: 不涉及。 **默认取值**: 默认为0（偏移0条数据，表示从第一条数据开始查询）。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListWaitEventRequestBody withOrderFields(List<List<String>> orderFields) {
        this.orderFields = orderFields;
        return this;
    }

    public ListWaitEventRequestBody addOrderFieldsItem(List<String> orderFieldsItem) {
        if (this.orderFields == null) {
            this.orderFields = new ArrayList<>();
        }
        this.orderFields.add(orderFieldsItem);
        return this;
    }

    public ListWaitEventRequestBody withOrderFields(Consumer<List<List<String>>> orderFieldsSetter) {
        if (this.orderFields == null) {
            this.orderFields = new ArrayList<>();
        }
        orderFieldsSetter.accept(this.orderFields);
        return this;
    }

    /**
     * **参数解释**: 排序字段列表，内部List<String>。 **约束限制**: 不涉及。
     * @return orderFields
     */
    public List<List<String>> getOrderFields() {
        return orderFields;
    }

    public void setOrderFields(List<List<String>> orderFields) {
        this.orderFields = orderFields;
    }

    public ListWaitEventRequestBody withWaitEventQueryInfo(WaitEventQueryInfo waitEventQueryInfo) {
        this.waitEventQueryInfo = waitEventQueryInfo;
        return this;
    }

    public ListWaitEventRequestBody withWaitEventQueryInfo(Consumer<WaitEventQueryInfo> waitEventQueryInfoSetter) {
        if (this.waitEventQueryInfo == null) {
            this.waitEventQueryInfo = new WaitEventQueryInfo();
            waitEventQueryInfoSetter.accept(this.waitEventQueryInfo);
        }

        return this;
    }

    /**
     * Get waitEventQueryInfo
     * @return waitEventQueryInfo
     */
    public WaitEventQueryInfo getWaitEventQueryInfo() {
        return waitEventQueryInfo;
    }

    public void setWaitEventQueryInfo(WaitEventQueryInfo waitEventQueryInfo) {
        this.waitEventQueryInfo = waitEventQueryInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWaitEventRequestBody that = (ListWaitEventRequestBody) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.system, that.system)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.orderFields, that.orderFields)
            && Objects.equals(this.waitEventQueryInfo, that.waitEventQueryInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, system, limit, offset, orderFields, waitEventQueryInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWaitEventRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    orderFields: ").append(toIndentedString(orderFields)).append("\n");
        sb.append("    waitEventQueryInfo: ").append(toIndentedString(waitEventQueryInfo)).append("\n");
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
