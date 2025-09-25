package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSqlLimitTaskRequestBody
 */
public class ListSqlLimitTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_scope")

    private String taskScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type")

    private String limitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type_value")

    private String limitTypeValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    public ListSqlLimitTaskRequestBody withTaskScope(String taskScope) {
        this.taskScope = taskScope;
        return this;
    }

    /**
     * **参数解释**: 限流任务范围。 **约束限制**: 不涉及。 **取值范围**: 目前支持SQL、SESSION。 **默认取值**: 不涉及。
     * @return taskScope
     */
    public String getTaskScope() {
        return taskScope;
    }

    public void setTaskScope(String taskScope) {
        this.taskScope = taskScope;
    }

    public ListSqlLimitTaskRequestBody withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * **参数解释**: 限流类型。 **约束限制**: 不涉及。 **取值范围**: 支持SQL_ID、SQL_TYPE、SESSION_ACTIVE_MAX_COUNT类型。 **默认取值**: 不涉及。
     * @return limitType
     */
    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public ListSqlLimitTaskRequestBody withLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
        return this;
    }

    /**
     * **参数解释**: 限流类型值，支持模糊匹配。 **约束限制**: 不涉及。 **取值范围**: 长度为1~19字符，且只能包含大小写字母、数字和_。 **默认取值**: 不涉及。
     * @return limitTypeValue
     */
    public String getLimitTypeValue() {
        return limitTypeValue;
    }

    public void setLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
    }

    public ListSqlLimitTaskRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**: 限流任务名，支持模糊匹配。 **约束限制**: 不涉及。 **取值范围**: 长度为1~100字符，只能包含大小写字母、数字、-、_和$。 **默认取值**: 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListSqlLimitTaskRequestBody withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**: 规则名。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ListSqlLimitTaskRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询。 **约束限制**: 不涉及。 **取值范围**: 0 - 10000 **默认取值**: 0（偏移0条数据，表示从第一条数据开始查询）。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSqlLimitTaskRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 查询记录数。 **约束限制**: 不涉及。 **取值范围**: 不能为负数，最小值为1，最大值为100。 **默认取值**: 10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSqlLimitTaskRequestBody withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: 限流任务SQL_ID。 **约束限制**: 不涉及。 **取值范围**: 1 到 19 位的正整数（首位不为 0）。 **默认取值**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public ListSqlLimitTaskRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ListSqlLimitTaskRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ListSqlLimitTaskRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * **参数解释**: 限流任务NodeID列表。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlLimitTaskRequestBody that = (ListSqlLimitTaskRequestBody) obj;
        return Objects.equals(this.taskScope, that.taskScope) && Objects.equals(this.limitType, that.limitType)
            && Objects.equals(this.limitTypeValue, that.limitTypeValue) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.nodeIds, that.nodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskScope, limitType, limitTypeValue, taskName, ruleName, offset, limit, sqlId, nodeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlLimitTaskRequestBody {\n");
        sb.append("    taskScope: ").append(toIndentedString(taskScope)).append("\n");
        sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
        sb.append("    limitTypeValue: ").append(toIndentedString(limitTypeValue)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
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
