package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSlowSqlsRequestBody
 */
public class ListSlowSqlsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_queries")

    private List<MultiQueryConditionOption> multiQueries = null;

    public ListSlowSqlsRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSlowSqlsRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ListSlowSqlsRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ListSlowSqlsRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * **参数解释**: 节点ID列表。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public ListSlowSqlsRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释** 起始日期。 **约束限制** 13位UNIX时间戳格式，单位是毫秒，时区是UTC。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSlowSqlsRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释** 结束日期。 **约束限制** 13位UNIX时间戳格式，单位是毫秒，时区是UTC。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListSlowSqlsRequestBody withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: 慢SQL的sql_id，可按照sql_id过滤查询。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public ListSlowSqlsRequestBody withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * **参数解释**: 阈值。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public ListSlowSqlsRequestBody withMultiQueries(List<MultiQueryConditionOption> multiQueries) {
        this.multiQueries = multiQueries;
        return this;
    }

    public ListSlowSqlsRequestBody addMultiQueriesItem(MultiQueryConditionOption multiQueriesItem) {
        if (this.multiQueries == null) {
            this.multiQueries = new ArrayList<>();
        }
        this.multiQueries.add(multiQueriesItem);
        return this;
    }

    public ListSlowSqlsRequestBody withMultiQueries(Consumer<List<MultiQueryConditionOption>> multiQueriesSetter) {
        if (this.multiQueries == null) {
            this.multiQueries = new ArrayList<>();
        }
        multiQueriesSetter.accept(this.multiQueries);
        return this;
    }

    /**
     * **参数解释**: 字符型组合过滤多条件查询列表。 **约束限制**: 不涉及。
     * @return multiQueries
     */
    public List<MultiQueryConditionOption> getMultiQueries() {
        return multiQueries;
    }

    public void setMultiQueries(List<MultiQueryConditionOption> multiQueries) {
        this.multiQueries = multiQueries;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSlowSqlsRequestBody that = (ListSlowSqlsRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeIds, that.nodeIds)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.sqlId, that.sqlId) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.multiQueries, that.multiQueries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, nodeIds, startTime, endTime, sqlId, threshold, multiQueries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowSqlsRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    multiQueries: ").append(toIndentedString(multiQueries)).append("\n");
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
