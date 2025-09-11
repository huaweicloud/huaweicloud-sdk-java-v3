package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListTopSqlsRequestBody
 */
public class ListTopSqlsRequestBody {

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
    @JsonProperty(value = "start_time_utc")

    private String startTimeUtc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_utc")

    private String endTimeUtc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_text")

    private String sqlText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_system")

    private Boolean supportSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_queries")

    private List<MultiQueryConditionOption> multiQueries = null;

    public ListTopSqlsRequestBody withInstanceId(String instanceId) {
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

    public ListTopSqlsRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ListTopSqlsRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ListTopSqlsRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * **参数解释**: 所选实例节点ID列表。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public ListTopSqlsRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 起始时间。 **约束限制**: 13位UNIX时间戳格式，单位是毫秒，时区是UTC。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListTopSqlsRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 结束时间。 **约束限制**: 13位UNIX时间戳格式，单位是毫秒，时区是UTC。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListTopSqlsRequestBody withStartTimeUtc(String startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
        return this;
    }

    /**
     * **参数解释**: 起始时间。 **约束限制**: UTC时间。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return startTimeUtc
     */
    public String getStartTimeUtc() {
        return startTimeUtc;
    }

    public void setStartTimeUtc(String startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    public ListTopSqlsRequestBody withEndTimeUtc(String endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
        return this;
    }

    /**
     * **参数解释**: 结束时间。 **约束限制**: UTC时间。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return endTimeUtc
     */
    public String getEndTimeUtc() {
        return endTimeUtc;
    }

    public void setEndTimeUtc(String endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
    }

    public ListTopSqlsRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: Top SQL的用户名。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListTopSqlsRequestBody withSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }

    /**
     * **参数解释**: Top SQL的SQL文本，例如 select pg_sleep(5)。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return sqlText
     */
    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public ListTopSqlsRequestBody withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: Top SQL的归一化SQL ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public ListTopSqlsRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**: Top SQL的数据库名。 **约束限制**: 引擎版本8.200及以上显示。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListTopSqlsRequestBody withSupportSystem(Boolean supportSystem) {
        this.supportSystem = supportSystem;
        return this;
    }

    /**
     * **参数解释**: 是否支持展示系统用户。 **约束限制**: 不涉及。 **取值范围**: - true：支持展示系统用户。 - false：不支持展示系统用户。  **默认取值**: 不涉及
     * @return supportSystem
     */
    public Boolean getSupportSystem() {
        return supportSystem;
    }

    public void setSupportSystem(Boolean supportSystem) {
        this.supportSystem = supportSystem;
    }

    public ListTopSqlsRequestBody withMultiQueries(List<MultiQueryConditionOption> multiQueries) {
        this.multiQueries = multiQueries;
        return this;
    }

    public ListTopSqlsRequestBody addMultiQueriesItem(MultiQueryConditionOption multiQueriesItem) {
        if (this.multiQueries == null) {
            this.multiQueries = new ArrayList<>();
        }
        this.multiQueries.add(multiQueriesItem);
        return this;
    }

    public ListTopSqlsRequestBody withMultiQueries(Consumer<List<MultiQueryConditionOption>> multiQueriesSetter) {
        if (this.multiQueries == null) {
            this.multiQueries = new ArrayList<>();
        }
        multiQueriesSetter.accept(this.multiQueries);
        return this;
    }

    /**
     * **参数解释**: 字段汇聚查询条件列表。 **约束限制**: 只支持针对query字段全与或者全或的查询。
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
        ListTopSqlsRequestBody that = (ListTopSqlsRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeIds, that.nodeIds)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.startTimeUtc, that.startTimeUtc) && Objects.equals(this.endTimeUtc, that.endTimeUtc)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.sqlText, that.sqlText)
            && Objects.equals(this.sqlId, that.sqlId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.supportSystem, that.supportSystem)
            && Objects.equals(this.multiQueries, that.multiQueries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            nodeIds,
            startTime,
            endTime,
            startTimeUtc,
            endTimeUtc,
            userName,
            sqlText,
            sqlId,
            dbName,
            supportSystem,
            multiQueries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopSqlsRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTimeUtc: ").append(toIndentedString(startTimeUtc)).append("\n");
        sb.append("    endTimeUtc: ").append(toIndentedString(endTimeUtc)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sqlText: ").append(toIndentedString(sqlText)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    supportSystem: ").append(toIndentedString(supportSystem)).append("\n");
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
