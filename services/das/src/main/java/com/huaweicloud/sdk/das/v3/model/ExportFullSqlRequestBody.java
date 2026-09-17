package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Console Full Sql Export请求体
 */
public class ExportFullSqlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<Long> taskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuzzy")

    private Boolean fuzzy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<String> userList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_list")

    private List<String> dbList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private List<String> operationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip_list")

    private List<String> clientIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id_list")

    private List<Long> threadIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id_list")

    private List<Long> trxIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id_list")

    private List<Long> sessionIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<Integer> statusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_min")

    private Double costMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_max")

    private Double costMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_min")

    private Long scanMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_max")

    private Long scanMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_min")

    private Long affectMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_max")

    private Long affectMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_min")

    private Long returnMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_max")

    private Long returnMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_column_list")

    private List<String> exportColumnList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    public ExportFullSqlRequestBody withStartAt(Long startAt) {
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

    public ExportFullSqlRequestBody withEndAt(Long endAt) {
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

    public ExportFullSqlRequestBody withTaskIds(List<Long> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public ExportFullSqlRequestBody addTaskIdsItem(Long taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public ExportFullSqlRequestBody withTaskIds(Consumer<List<Long>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * SQL洞察任务ID列表
     * @return taskIds
     */
    public List<Long> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<Long> taskIds) {
        this.taskIds = taskIds;
    }

    public ExportFullSqlRequestBody withNodeId(String nodeId) {
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

    public ExportFullSqlRequestBody withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ExportFullSqlRequestBody withFuzzy(Boolean fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }

    /**
     * 是否模糊匹配
     * @return fuzzy
     */
    public Boolean getFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(Boolean fuzzy) {
        this.fuzzy = fuzzy;
    }

    public ExportFullSqlRequestBody withUserList(List<String> userList) {
        this.userList = userList;
        return this;
    }

    public ExportFullSqlRequestBody addUserListItem(String userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public ExportFullSqlRequestBody withUserList(Consumer<List<String>> userListSetter) {
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

    public ExportFullSqlRequestBody withDbList(List<String> dbList) {
        this.dbList = dbList;
        return this;
    }

    public ExportFullSqlRequestBody addDbListItem(String dbListItem) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        this.dbList.add(dbListItem);
        return this;
    }

    public ExportFullSqlRequestBody withDbList(Consumer<List<String>> dbListSetter) {
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

    public ExportFullSqlRequestBody withOperationList(List<String> operationList) {
        this.operationList = operationList;
        return this;
    }

    public ExportFullSqlRequestBody addOperationListItem(String operationListItem) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        this.operationList.add(operationListItem);
        return this;
    }

    public ExportFullSqlRequestBody withOperationList(Consumer<List<String>> operationListSetter) {
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

    public ExportFullSqlRequestBody withClientIpList(List<String> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }

    public ExportFullSqlRequestBody addClientIpListItem(String clientIpListItem) {
        if (this.clientIpList == null) {
            this.clientIpList = new ArrayList<>();
        }
        this.clientIpList.add(clientIpListItem);
        return this;
    }

    public ExportFullSqlRequestBody withClientIpList(Consumer<List<String>> clientIpListSetter) {
        if (this.clientIpList == null) {
            this.clientIpList = new ArrayList<>();
        }
        clientIpListSetter.accept(this.clientIpList);
        return this;
    }

    /**
     * 客户端IP
     * @return clientIpList
     */
    public List<String> getClientIpList() {
        return clientIpList;
    }

    public void setClientIpList(List<String> clientIpList) {
        this.clientIpList = clientIpList;
    }

    public ExportFullSqlRequestBody withThreadIdList(List<Long> threadIdList) {
        this.threadIdList = threadIdList;
        return this;
    }

    public ExportFullSqlRequestBody addThreadIdListItem(Long threadIdListItem) {
        if (this.threadIdList == null) {
            this.threadIdList = new ArrayList<>();
        }
        this.threadIdList.add(threadIdListItem);
        return this;
    }

    public ExportFullSqlRequestBody withThreadIdList(Consumer<List<Long>> threadIdListSetter) {
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
    public List<Long> getThreadIdList() {
        return threadIdList;
    }

    public void setThreadIdList(List<Long> threadIdList) {
        this.threadIdList = threadIdList;
    }

    public ExportFullSqlRequestBody withTrxIdList(List<Long> trxIdList) {
        this.trxIdList = trxIdList;
        return this;
    }

    public ExportFullSqlRequestBody addTrxIdListItem(Long trxIdListItem) {
        if (this.trxIdList == null) {
            this.trxIdList = new ArrayList<>();
        }
        this.trxIdList.add(trxIdListItem);
        return this;
    }

    public ExportFullSqlRequestBody withTrxIdList(Consumer<List<Long>> trxIdListSetter) {
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
    public List<Long> getTrxIdList() {
        return trxIdList;
    }

    public void setTrxIdList(List<Long> trxIdList) {
        this.trxIdList = trxIdList;
    }

    public ExportFullSqlRequestBody withSessionIdList(List<Long> sessionIdList) {
        this.sessionIdList = sessionIdList;
        return this;
    }

    public ExportFullSqlRequestBody addSessionIdListItem(Long sessionIdListItem) {
        if (this.sessionIdList == null) {
            this.sessionIdList = new ArrayList<>();
        }
        this.sessionIdList.add(sessionIdListItem);
        return this;
    }

    public ExportFullSqlRequestBody withSessionIdList(Consumer<List<Long>> sessionIdListSetter) {
        if (this.sessionIdList == null) {
            this.sessionIdList = new ArrayList<>();
        }
        sessionIdListSetter.accept(this.sessionIdList);
        return this;
    }

    /**
     * 会话ID
     * @return sessionIdList
     */
    public List<Long> getSessionIdList() {
        return sessionIdList;
    }

    public void setSessionIdList(List<Long> sessionIdList) {
        this.sessionIdList = sessionIdList;
    }

    public ExportFullSqlRequestBody withStatusList(List<Integer> statusList) {
        this.statusList = statusList;
        return this;
    }

    public ExportFullSqlRequestBody addStatusListItem(Integer statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public ExportFullSqlRequestBody withStatusList(Consumer<List<Integer>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 执行状态（0：成功，1：失败）
     * @return statusList
     */
    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }

    public ExportFullSqlRequestBody withCostMin(Double costMin) {
        this.costMin = costMin;
        return this;
    }

    /**
     * 最小执行耗时（毫秒）
     * @return costMin
     */
    public Double getCostMin() {
        return costMin;
    }

    public void setCostMin(Double costMin) {
        this.costMin = costMin;
    }

    public ExportFullSqlRequestBody withCostMax(Double costMax) {
        this.costMax = costMax;
        return this;
    }

    /**
     * 最大执行耗时（毫秒）
     * @return costMax
     */
    public Double getCostMax() {
        return costMax;
    }

    public void setCostMax(Double costMax) {
        this.costMax = costMax;
    }

    public ExportFullSqlRequestBody withScanMin(Long scanMin) {
        this.scanMin = scanMin;
        return this;
    }

    /**
     * 最小扫描行数
     * @return scanMin
     */
    public Long getScanMin() {
        return scanMin;
    }

    public void setScanMin(Long scanMin) {
        this.scanMin = scanMin;
    }

    public ExportFullSqlRequestBody withScanMax(Long scanMax) {
        this.scanMax = scanMax;
        return this;
    }

    /**
     * 最大扫描行数
     * @return scanMax
     */
    public Long getScanMax() {
        return scanMax;
    }

    public void setScanMax(Long scanMax) {
        this.scanMax = scanMax;
    }

    public ExportFullSqlRequestBody withAffectMin(Long affectMin) {
        this.affectMin = affectMin;
        return this;
    }

    /**
     * 最小影响行数
     * @return affectMin
     */
    public Long getAffectMin() {
        return affectMin;
    }

    public void setAffectMin(Long affectMin) {
        this.affectMin = affectMin;
    }

    public ExportFullSqlRequestBody withAffectMax(Long affectMax) {
        this.affectMax = affectMax;
        return this;
    }

    /**
     * 最大影响行数
     * @return affectMax
     */
    public Long getAffectMax() {
        return affectMax;
    }

    public void setAffectMax(Long affectMax) {
        this.affectMax = affectMax;
    }

    public ExportFullSqlRequestBody withReturnMin(Long returnMin) {
        this.returnMin = returnMin;
        return this;
    }

    /**
     * 最小返回行数
     * @return returnMin
     */
    public Long getReturnMin() {
        return returnMin;
    }

    public void setReturnMin(Long returnMin) {
        this.returnMin = returnMin;
    }

    public ExportFullSqlRequestBody withReturnMax(Long returnMax) {
        this.returnMax = returnMax;
        return this;
    }

    /**
     * 最大返回行数
     * @return returnMax
     */
    public Long getReturnMax() {
        return returnMax;
    }

    public void setReturnMax(Long returnMax) {
        this.returnMax = returnMax;
    }

    public ExportFullSqlRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ExportFullSqlRequestBody withExportColumnList(List<String> exportColumnList) {
        this.exportColumnList = exportColumnList;
        return this;
    }

    public ExportFullSqlRequestBody addExportColumnListItem(String exportColumnListItem) {
        if (this.exportColumnList == null) {
            this.exportColumnList = new ArrayList<>();
        }
        this.exportColumnList.add(exportColumnListItem);
        return this;
    }

    public ExportFullSqlRequestBody withExportColumnList(Consumer<List<String>> exportColumnListSetter) {
        if (this.exportColumnList == null) {
            this.exportColumnList = new ArrayList<>();
        }
        exportColumnListSetter.accept(this.exportColumnList);
        return this;
    }

    /**
     * 导出的列名
     * @return exportColumnList
     */
    public List<String> getExportColumnList() {
        return exportColumnList;
    }

    public void setExportColumnList(List<String> exportColumnList) {
        this.exportColumnList = exportColumnList;
    }

    public ExportFullSqlRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ExportFullSqlRequestBody withInstanceId(String instanceId) {
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

    public ExportFullSqlRequestBody withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportFullSqlRequestBody that = (ExportFullSqlRequestBody) obj;
        return Objects.equals(this.startAt, that.startAt) && Objects.equals(this.endAt, that.endAt)
            && Objects.equals(this.taskIds, that.taskIds) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.fuzzy, that.fuzzy)
            && Objects.equals(this.userList, that.userList) && Objects.equals(this.dbList, that.dbList)
            && Objects.equals(this.operationList, that.operationList)
            && Objects.equals(this.clientIpList, that.clientIpList)
            && Objects.equals(this.threadIdList, that.threadIdList) && Objects.equals(this.trxIdList, that.trxIdList)
            && Objects.equals(this.sessionIdList, that.sessionIdList)
            && Objects.equals(this.statusList, that.statusList) && Objects.equals(this.costMin, that.costMin)
            && Objects.equals(this.costMax, that.costMax) && Objects.equals(this.scanMin, that.scanMin)
            && Objects.equals(this.scanMax, that.scanMax) && Objects.equals(this.affectMin, that.affectMin)
            && Objects.equals(this.affectMax, that.affectMax) && Objects.equals(this.returnMin, that.returnMin)
            && Objects.equals(this.returnMax, that.returnMax) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.exportColumnList, that.exportColumnList)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startAt,
            endAt,
            taskIds,
            nodeId,
            keyword,
            fuzzy,
            userList,
            dbList,
            operationList,
            clientIpList,
            threadIdList,
            trxIdList,
            sessionIdList,
            statusList,
            costMin,
            costMax,
            scanMin,
            scanMax,
            affectMin,
            affectMax,
            returnMin,
            returnMax,
            bucketName,
            exportColumnList,
            timeZone,
            instanceId,
            taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFullSqlRequestBody {\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    fuzzy: ").append(toIndentedString(fuzzy)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    dbList: ").append(toIndentedString(dbList)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
        sb.append("    clientIpList: ").append(toIndentedString(clientIpList)).append("\n");
        sb.append("    threadIdList: ").append(toIndentedString(threadIdList)).append("\n");
        sb.append("    trxIdList: ").append(toIndentedString(trxIdList)).append("\n");
        sb.append("    sessionIdList: ").append(toIndentedString(sessionIdList)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    costMin: ").append(toIndentedString(costMin)).append("\n");
        sb.append("    costMax: ").append(toIndentedString(costMax)).append("\n");
        sb.append("    scanMin: ").append(toIndentedString(scanMin)).append("\n");
        sb.append("    scanMax: ").append(toIndentedString(scanMax)).append("\n");
        sb.append("    affectMin: ").append(toIndentedString(affectMin)).append("\n");
        sb.append("    affectMax: ").append(toIndentedString(affectMax)).append("\n");
        sb.append("    returnMin: ").append(toIndentedString(returnMin)).append("\n");
        sb.append("    returnMax: ").append(toIndentedString(returnMax)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    exportColumnList: ").append(toIndentedString(exportColumnList)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
