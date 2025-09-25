package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListTransactionRequestBody
 */
public class ListTransactionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_query_option")

    private ListTransactionRequestBodyTransactionQueryOption transactionQueryOption;

    public ListTransactionRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: 节点ID，仅支持非日志类型的CN或DN节点。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListTransactionRequestBody withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释**: 组件ID，仅支持非日志类型的CN或DN节点。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListTransactionRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 查询结果的事务最大个数。 **约束限制**: 不涉及。 **取值范围**: [1，100]。 **默认取值**: 默认为10。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTransactionRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 查询结果的事务起始页码。 **约束限制**: 不涉及。 **取值范围**: [0，2^31-1]。 **默认取值**: 默认为0（偏移0条数据，表示从第一条数据开始查询）。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTransactionRequestBody withTransactionQueryOption(
        ListTransactionRequestBodyTransactionQueryOption transactionQueryOption) {
        this.transactionQueryOption = transactionQueryOption;
        return this;
    }

    public ListTransactionRequestBody withTransactionQueryOption(
        Consumer<ListTransactionRequestBodyTransactionQueryOption> transactionQueryOptionSetter) {
        if (this.transactionQueryOption == null) {
            this.transactionQueryOption = new ListTransactionRequestBodyTransactionQueryOption();
            transactionQueryOptionSetter.accept(this.transactionQueryOption);
        }

        return this;
    }

    /**
     * Get transactionQueryOption
     * @return transactionQueryOption
     */
    public ListTransactionRequestBodyTransactionQueryOption getTransactionQueryOption() {
        return transactionQueryOption;
    }

    public void setTransactionQueryOption(ListTransactionRequestBodyTransactionQueryOption transactionQueryOption) {
        this.transactionQueryOption = transactionQueryOption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransactionRequestBody that = (ListTransactionRequestBody) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.transactionQueryOption, that.transactionQueryOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, componentId, limit, offset, transactionQueryOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransactionRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    transactionQueryOption: ").append(toIndentedString(transactionQueryOption)).append("\n");
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
