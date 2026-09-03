package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建多天全量SQL明细解析任务请求体
 */
public class AddTasksNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private String userList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_list")

    private String dbList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private String operationList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id_list")

    private String threadIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id_list")

    private String trxIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private String statusList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_ids")

    private String sqlTemplateIds;

    public AddTasksNewRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，实例的唯一标识
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AddTasksNewRequestBody withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间（Unix timestamp），单位：毫秒
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public AddTasksNewRequestBody withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间（Unix timestamp），单位：毫秒
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public AddTasksNewRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public AddTasksNewRequestBody withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字，可组合，用逗号分隔
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public AddTasksNewRequestBody withUserList(String userList) {
        this.userList = userList;
        return this;
    }

    /**
     * 用户名，可组合，用逗号分隔
     * @return userList
     */
    public String getUserList() {
        return userList;
    }

    public void setUserList(String userList) {
        this.userList = userList;
    }

    public AddTasksNewRequestBody withDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }

    /**
     * 数据库，可组合，用逗号分隔
     * @return dbList
     */
    public String getDbList() {
        return dbList;
    }

    public void setDbList(String dbList) {
        this.dbList = dbList;
    }

    public AddTasksNewRequestBody withOperationList(String operationList) {
        this.operationList = operationList;
        return this;
    }

    /**
     * 操作类型，可组合，用逗号分隔
     * @return operationList
     */
    public String getOperationList() {
        return operationList;
    }

    public void setOperationList(String operationList) {
        this.operationList = operationList;
    }

    public AddTasksNewRequestBody withThreadIdList(String threadIdList) {
        this.threadIdList = threadIdList;
        return this;
    }

    /**
     * 线程ID，可组合，用逗号分隔
     * @return threadIdList
     */
    public String getThreadIdList() {
        return threadIdList;
    }

    public void setThreadIdList(String threadIdList) {
        this.threadIdList = threadIdList;
    }

    public AddTasksNewRequestBody withTrxIdList(String trxIdList) {
        this.trxIdList = trxIdList;
        return this;
    }

    /**
     * 事务ID，可组合，用逗号分隔
     * @return trxIdList
     */
    public String getTrxIdList() {
        return trxIdList;
    }

    public void setTrxIdList(String trxIdList) {
        this.trxIdList = trxIdList;
    }

    public AddTasksNewRequestBody withStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }

    /**
     * 执行状态，可组合，用逗号分隔
     * @return statusList
     */
    public String getStatusList() {
        return statusList;
    }

    public void setStatusList(String statusList) {
        this.statusList = statusList;
    }

    public AddTasksNewRequestBody withSqlTemplateIds(String sqlTemplateIds) {
        this.sqlTemplateIds = sqlTemplateIds;
        return this;
    }

    /**
     * SQL模板ID，可组合，用逗号分隔
     * @return sqlTemplateIds
     */
    public String getSqlTemplateIds() {
        return sqlTemplateIds;
    }

    public void setSqlTemplateIds(String sqlTemplateIds) {
        this.sqlTemplateIds = sqlTemplateIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTasksNewRequestBody that = (AddTasksNewRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.userList, that.userList)
            && Objects.equals(this.dbList, that.dbList) && Objects.equals(this.operationList, that.operationList)
            && Objects.equals(this.threadIdList, that.threadIdList) && Objects.equals(this.trxIdList, that.trxIdList)
            && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.sqlTemplateIds, that.sqlTemplateIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            startAt,
            endAt,
            nodeId,
            keyword,
            userList,
            dbList,
            operationList,
            threadIdList,
            trxIdList,
            statusList,
            sqlTemplateIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTasksNewRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    dbList: ").append(toIndentedString(dbList)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
        sb.append("    threadIdList: ").append(toIndentedString(threadIdList)).append("\n");
        sb.append("    trxIdList: ").append(toIndentedString(trxIdList)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    sqlTemplateIds: ").append(toIndentedString(sqlTemplateIds)).append("\n");
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
