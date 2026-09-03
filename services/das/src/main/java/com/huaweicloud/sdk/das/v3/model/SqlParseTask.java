package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SQL解析任务
 */
public class SqlParseTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_id")

    private String batchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<String> userList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private List<String> keyword = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_list")

    private List<String> dbList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private List<String> operationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id_list")

    private List<String> threadIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id_list")

    private List<String> trxIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<String> statusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_ids")

    private List<String> sqlTemplateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Double progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public SqlParseTask withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SqlParseTask withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SqlParseTask withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public SqlParseTask withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SqlParseTask withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public SqlParseTask withStartAt(Long startAt) {
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

    public SqlParseTask withEndAt(Long endAt) {
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

    public SqlParseTask withBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * 批次ID
     * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public SqlParseTask withUserList(List<String> userList) {
        this.userList = userList;
        return this;
    }

    public SqlParseTask addUserListItem(String userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public SqlParseTask withUserList(Consumer<List<String>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * 用户名
     * @return userList
     */
    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public SqlParseTask withKeyword(List<String> keyword) {
        this.keyword = keyword;
        return this;
    }

    public SqlParseTask addKeywordItem(String keywordItem) {
        if (this.keyword == null) {
            this.keyword = new ArrayList<>();
        }
        this.keyword.add(keywordItem);
        return this;
    }

    public SqlParseTask withKeyword(Consumer<List<String>> keywordSetter) {
        if (this.keyword == null) {
            this.keyword = new ArrayList<>();
        }
        keywordSetter.accept(this.keyword);
        return this;
    }

    /**
     * 关键字
     * @return keyword
     */
    public List<String> getKeyword() {
        return keyword;
    }

    public void setKeyword(List<String> keyword) {
        this.keyword = keyword;
    }

    public SqlParseTask withDbList(List<String> dbList) {
        this.dbList = dbList;
        return this;
    }

    public SqlParseTask addDbListItem(String dbListItem) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        this.dbList.add(dbListItem);
        return this;
    }

    public SqlParseTask withDbList(Consumer<List<String>> dbListSetter) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        dbListSetter.accept(this.dbList);
        return this;
    }

    /**
     * 数据库
     * @return dbList
     */
    public List<String> getDbList() {
        return dbList;
    }

    public void setDbList(List<String> dbList) {
        this.dbList = dbList;
    }

    public SqlParseTask withOperationList(List<String> operationList) {
        this.operationList = operationList;
        return this;
    }

    public SqlParseTask addOperationListItem(String operationListItem) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        this.operationList.add(operationListItem);
        return this;
    }

    public SqlParseTask withOperationList(Consumer<List<String>> operationListSetter) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        operationListSetter.accept(this.operationList);
        return this;
    }

    /**
     * 操作类型
     * @return operationList
     */
    public List<String> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<String> operationList) {
        this.operationList = operationList;
    }

    public SqlParseTask withThreadIdList(List<String> threadIdList) {
        this.threadIdList = threadIdList;
        return this;
    }

    public SqlParseTask addThreadIdListItem(String threadIdListItem) {
        if (this.threadIdList == null) {
            this.threadIdList = new ArrayList<>();
        }
        this.threadIdList.add(threadIdListItem);
        return this;
    }

    public SqlParseTask withThreadIdList(Consumer<List<String>> threadIdListSetter) {
        if (this.threadIdList == null) {
            this.threadIdList = new ArrayList<>();
        }
        threadIdListSetter.accept(this.threadIdList);
        return this;
    }

    /**
     * 线程ID
     * @return threadIdList
     */
    public List<String> getThreadIdList() {
        return threadIdList;
    }

    public void setThreadIdList(List<String> threadIdList) {
        this.threadIdList = threadIdList;
    }

    public SqlParseTask withTrxIdList(List<String> trxIdList) {
        this.trxIdList = trxIdList;
        return this;
    }

    public SqlParseTask addTrxIdListItem(String trxIdListItem) {
        if (this.trxIdList == null) {
            this.trxIdList = new ArrayList<>();
        }
        this.trxIdList.add(trxIdListItem);
        return this;
    }

    public SqlParseTask withTrxIdList(Consumer<List<String>> trxIdListSetter) {
        if (this.trxIdList == null) {
            this.trxIdList = new ArrayList<>();
        }
        trxIdListSetter.accept(this.trxIdList);
        return this;
    }

    /**
     * 事务ID
     * @return trxIdList
     */
    public List<String> getTrxIdList() {
        return trxIdList;
    }

    public void setTrxIdList(List<String> trxIdList) {
        this.trxIdList = trxIdList;
    }

    public SqlParseTask withStatusList(List<String> statusList) {
        this.statusList = statusList;
        return this;
    }

    public SqlParseTask addStatusListItem(String statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public SqlParseTask withStatusList(Consumer<List<String>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 执行状态
     * @return statusList
     */
    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public SqlParseTask withSqlTemplateIds(List<String> sqlTemplateIds) {
        this.sqlTemplateIds = sqlTemplateIds;
        return this;
    }

    public SqlParseTask addSqlTemplateIdsItem(String sqlTemplateIdsItem) {
        if (this.sqlTemplateIds == null) {
            this.sqlTemplateIds = new ArrayList<>();
        }
        this.sqlTemplateIds.add(sqlTemplateIdsItem);
        return this;
    }

    public SqlParseTask withSqlTemplateIds(Consumer<List<String>> sqlTemplateIdsSetter) {
        if (this.sqlTemplateIds == null) {
            this.sqlTemplateIds = new ArrayList<>();
        }
        sqlTemplateIdsSetter.accept(this.sqlTemplateIds);
        return this;
    }

    /**
     * SQL模板ID
     * @return sqlTemplateIds
     */
    public List<String> getSqlTemplateIds() {
        return sqlTemplateIds;
    }

    public void setSqlTemplateIds(List<String> sqlTemplateIds) {
        this.sqlTemplateIds = sqlTemplateIds;
    }

    public SqlParseTask withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SqlParseTask withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间（Unix timestamp），单位：毫秒
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public SqlParseTask withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间（Unix timestamp），单位：毫秒
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public SqlParseTask withProgress(Double progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务进度
     * @return progress
     */
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public SqlParseTask withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlParseTask that = (SqlParseTask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.batchId, that.batchId)
            && Objects.equals(this.userList, that.userList) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.dbList, that.dbList) && Objects.equals(this.operationList, that.operationList)
            && Objects.equals(this.threadIdList, that.threadIdList) && Objects.equals(this.trxIdList, that.trxIdList)
            && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.sqlTemplateIds, that.sqlTemplateIds) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instanceId,
            instanceName,
            nodeId,
            domainId,
            startAt,
            endAt,
            batchId,
            userList,
            keyword,
            dbList,
            operationList,
            threadIdList,
            trxIdList,
            statusList,
            sqlTemplateIds,
            status,
            createAt,
            updateAt,
            progress,
            reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlParseTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    dbList: ").append(toIndentedString(dbList)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
        sb.append("    threadIdList: ").append(toIndentedString(threadIdList)).append("\n");
        sb.append("    trxIdList: ").append(toIndentedString(trxIdList)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    sqlTemplateIds: ").append(toIndentedString(sqlTemplateIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
