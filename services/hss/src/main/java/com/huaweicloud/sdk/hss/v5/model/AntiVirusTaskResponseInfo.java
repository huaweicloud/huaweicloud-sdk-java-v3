package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扫描任务信息
 */
public class AntiVirusTaskResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_type")

    private String startType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_host_num")

    private Integer successHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_host_num")

    private Integer failHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_host_num")

    private Integer cancelHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info_list")

    private List<AntiVirusTaskHostResponseInfo> hostInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rescan")

    private Boolean rescan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_paid_task")

    private Boolean whetherPaidTask;

    public AntiVirusTaskResponseInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public AntiVirusTaskResponseInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public AntiVirusTaskResponseInfo withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * 任务类型，包含如下:   - quick ：快速扫描   - full : 全盘扫描   - custom : 自定义扫描
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public AntiVirusTaskResponseInfo withStartType(String startType) {
        this.startType = startType;
        return this;
    }

    /**
     * 启动类型，包含如下:   - now : 立即启动   - later : 稍后启动   - period : 周期启动
     * @return startType
     */
    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

    public AntiVirusTaskResponseInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 处置动作，包含如下:   - auto：自动处置   - manual：人工处置
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public AntiVirusTaskResponseInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 启动时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public AntiVirusTaskResponseInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态，包含如下2种   - scanning ：扫描中   - finish ：扫描完成
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public AntiVirusTaskResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * 关联服务器数
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public AntiVirusTaskResponseInfo withSuccessHostNum(Integer successHostNum) {
        this.successHostNum = successHostNum;
        return this;
    }

    /**
     * 扫描成功服务器数
     * minimum: 0
     * maximum: 2147483647
     * @return successHostNum
     */
    public Integer getSuccessHostNum() {
        return successHostNum;
    }

    public void setSuccessHostNum(Integer successHostNum) {
        this.successHostNum = successHostNum;
    }

    public AntiVirusTaskResponseInfo withFailHostNum(Integer failHostNum) {
        this.failHostNum = failHostNum;
        return this;
    }

    /**
     * 扫描失败服务器数
     * minimum: 0
     * maximum: 2147483647
     * @return failHostNum
     */
    public Integer getFailHostNum() {
        return failHostNum;
    }

    public void setFailHostNum(Integer failHostNum) {
        this.failHostNum = failHostNum;
    }

    public AntiVirusTaskResponseInfo withCancelHostNum(Integer cancelHostNum) {
        this.cancelHostNum = cancelHostNum;
        return this;
    }

    /**
     * 已取消服务器数
     * minimum: 0
     * maximum: 2147483647
     * @return cancelHostNum
     */
    public Integer getCancelHostNum() {
        return cancelHostNum;
    }

    public void setCancelHostNum(Integer cancelHostNum) {
        this.cancelHostNum = cancelHostNum;
    }

    public AntiVirusTaskResponseInfo withHostInfoList(List<AntiVirusTaskHostResponseInfo> hostInfoList) {
        this.hostInfoList = hostInfoList;
        return this;
    }

    public AntiVirusTaskResponseInfo addHostInfoListItem(AntiVirusTaskHostResponseInfo hostInfoListItem) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        this.hostInfoList.add(hostInfoListItem);
        return this;
    }

    public AntiVirusTaskResponseInfo withHostInfoList(
        Consumer<List<AntiVirusTaskHostResponseInfo>> hostInfoListSetter) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        hostInfoListSetter.accept(this.hostInfoList);
        return this;
    }

    /**
     * 主机信息
     * @return hostInfoList
     */
    public List<AntiVirusTaskHostResponseInfo> getHostInfoList() {
        return hostInfoList;
    }

    public void setHostInfoList(List<AntiVirusTaskHostResponseInfo> hostInfoList) {
        this.hostInfoList = hostInfoList;
    }

    public AntiVirusTaskResponseInfo withRescan(Boolean rescan) {
        this.rescan = rescan;
        return this;
    }

    /**
     * 是否需要重新扫描
     * @return rescan
     */
    public Boolean getRescan() {
        return rescan;
    }

    public void setRescan(Boolean rescan) {
        this.rescan = rescan;
    }

    public AntiVirusTaskResponseInfo withWhetherPaidTask(Boolean whetherPaidTask) {
        this.whetherPaidTask = whetherPaidTask;
        return this;
    }

    /**
     * 此次扫描任务是否付费
     * @return whetherPaidTask
     */
    public Boolean getWhetherPaidTask() {
        return whetherPaidTask;
    }

    public void setWhetherPaidTask(Boolean whetherPaidTask) {
        this.whetherPaidTask = whetherPaidTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusTaskResponseInfo that = (AntiVirusTaskResponseInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.scanType, that.scanType) && Objects.equals(this.startType, that.startType)
            && Objects.equals(this.action, that.action) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.successHostNum, that.successHostNum)
            && Objects.equals(this.failHostNum, that.failHostNum)
            && Objects.equals(this.cancelHostNum, that.cancelHostNum)
            && Objects.equals(this.hostInfoList, that.hostInfoList) && Objects.equals(this.rescan, that.rescan)
            && Objects.equals(this.whetherPaidTask, that.whetherPaidTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            scanType,
            startType,
            action,
            startTime,
            taskStatus,
            hostNum,
            successHostNum,
            failHostNum,
            cancelHostNum,
            hostInfoList,
            rescan,
            whetherPaidTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusTaskResponseInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    startType: ").append(toIndentedString(startType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    successHostNum: ").append(toIndentedString(successHostNum)).append("\n");
        sb.append("    failHostNum: ").append(toIndentedString(failHostNum)).append("\n");
        sb.append("    cancelHostNum: ").append(toIndentedString(cancelHostNum)).append("\n");
        sb.append("    hostInfoList: ").append(toIndentedString(hostInfoList)).append("\n");
        sb.append("    rescan: ").append(toIndentedString(rescan)).append("\n");
        sb.append("    whetherPaidTask: ").append(toIndentedString(whetherPaidTask)).append("\n");
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
