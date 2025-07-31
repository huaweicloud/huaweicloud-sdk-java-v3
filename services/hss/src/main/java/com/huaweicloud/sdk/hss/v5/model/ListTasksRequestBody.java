package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询任务列表的请求体
 */
public class ListTasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_create_time")

    private Long startCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_create_time")

    private Long endCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_scan_info")

    private ListTasksRequestBodyClusterScanInfo clusterScanInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iac_scan_info")

    private ListTasksRequestBodyIacScanInfo iacScanInfo;

    public ListTasksRequestBody withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，包含如下   - cluster_scan：集群扫描   - iac_scan：iac扫描
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ListTasksRequestBody withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 本次创建任务的id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListTasksRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 模糊匹配任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListTasksRequestBody withStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }

    /**
     * 按任务创建时间范围查询时的起始时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startCreateTime
     */
    public Long getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public ListTasksRequestBody withEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }

    /**
     * 按任务创建时间范围查询时的结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endCreateTime
     */
    public Long getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public ListTasksRequestBody withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 任务触发类型，包含如下   - manual：手动创建的任务   - schedule：定时任务
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ListTasksRequestBody withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态，包含如下   - ready：等待执行   - running：运行中   - finished：任务结束
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ListTasksRequestBody withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段，包含如下   - start_time：任务开始时间
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListTasksRequestBody withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方式，包含如下   - desc：降序   - asc: 升序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListTasksRequestBody withClusterScanInfo(ListTasksRequestBodyClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
        return this;
    }

    public ListTasksRequestBody withClusterScanInfo(
        Consumer<ListTasksRequestBodyClusterScanInfo> clusterScanInfoSetter) {
        if (this.clusterScanInfo == null) {
            this.clusterScanInfo = new ListTasksRequestBodyClusterScanInfo();
            clusterScanInfoSetter.accept(this.clusterScanInfo);
        }

        return this;
    }

    /**
     * Get clusterScanInfo
     * @return clusterScanInfo
     */
    public ListTasksRequestBodyClusterScanInfo getClusterScanInfo() {
        return clusterScanInfo;
    }

    public void setClusterScanInfo(ListTasksRequestBodyClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
    }

    public ListTasksRequestBody withIacScanInfo(ListTasksRequestBodyIacScanInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
        return this;
    }

    public ListTasksRequestBody withIacScanInfo(Consumer<ListTasksRequestBodyIacScanInfo> iacScanInfoSetter) {
        if (this.iacScanInfo == null) {
            this.iacScanInfo = new ListTasksRequestBodyIacScanInfo();
            iacScanInfoSetter.accept(this.iacScanInfo);
        }

        return this;
    }

    /**
     * Get iacScanInfo
     * @return iacScanInfo
     */
    public ListTasksRequestBodyIacScanInfo getIacScanInfo() {
        return iacScanInfo;
    }

    public void setIacScanInfo(ListTasksRequestBodyIacScanInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksRequestBody that = (ListTasksRequestBody) obj;
        return Objects.equals(this.taskType, that.taskType) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.startCreateTime, that.startCreateTime)
            && Objects.equals(this.endCreateTime, that.endCreateTime)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.clusterScanInfo, that.clusterScanInfo)
            && Objects.equals(this.iacScanInfo, that.iacScanInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType,
            taskId,
            taskName,
            startCreateTime,
            endCreateTime,
            triggerType,
            taskStatus,
            sortKey,
            sortDir,
            clusterScanInfo,
            iacScanInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequestBody {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    startCreateTime: ").append(toIndentedString(startCreateTime)).append("\n");
        sb.append("    endCreateTime: ").append(toIndentedString(endCreateTime)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    clusterScanInfo: ").append(toIndentedString(clusterScanInfo)).append("\n");
        sb.append("    iacScanInfo: ").append(toIndentedString(iacScanInfo)).append("\n");
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
