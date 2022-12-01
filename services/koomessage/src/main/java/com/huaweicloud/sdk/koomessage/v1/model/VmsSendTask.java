package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 智能信息基础版任务详情。
 */
public class VmsSendTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_time")

    private String sendTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_count")

    private Integer timeoutCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exdata")

    private String exdata;

    public VmsSendTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 智能信息基础版任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public VmsSendTask withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 智能信息基础版任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public VmsSendTask withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 智能信息基础版任务状态。
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public VmsSendTask withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息基础版模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public VmsSendTask withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息基础版模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public VmsSendTask withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作员。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public VmsSendTask withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 智能信息基础版任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VmsSendTask withSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    /**
     * 智能信息基础版任务发送时间。
     * @return sendTime
     */
    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public VmsSendTask withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 需要发送的手机号码总数（有效号码总数）。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public VmsSendTask withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 已经发送成功的手机号码总数。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public VmsSendTask withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 已经发送失败的手机号码总数。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public VmsSendTask withTimeoutCount(Integer timeoutCount) {
        this.timeoutCount = timeoutCount;
        return this;
    }

    /**
     * 已经发送超时失败的手机号码总数（72小时没接收到状态认定为超时失败）。
     * @return timeoutCount
     */
    public Integer getTimeoutCount() {
        return timeoutCount;
    }

    public void setTimeoutCount(Integer timeoutCount) {
        this.timeoutCount = timeoutCount;
    }

    public VmsSendTask withExdata(String exdata) {
        this.exdata = exdata;
        return this;
    }

    /**
     * 扩展字段。  > 预留字段。 
     * @return exdata
     */
    public String getExdata() {
        return exdata;
    }

    public void setExdata(String exdata) {
        this.exdata = exdata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmsSendTask vmsSendTask = (VmsSendTask) o;
        return Objects.equals(this.taskId, vmsSendTask.taskId) && Objects.equals(this.taskName, vmsSendTask.taskName)
            && Objects.equals(this.taskState, vmsSendTask.taskState) && Objects.equals(this.tplId, vmsSendTask.tplId)
            && Objects.equals(this.tplName, vmsSendTask.tplName) && Objects.equals(this.operator, vmsSendTask.operator)
            && Objects.equals(this.createTime, vmsSendTask.createTime)
            && Objects.equals(this.sendTime, vmsSendTask.sendTime)
            && Objects.equals(this.totalCount, vmsSendTask.totalCount)
            && Objects.equals(this.successCount, vmsSendTask.successCount)
            && Objects.equals(this.failedCount, vmsSendTask.failedCount)
            && Objects.equals(this.timeoutCount, vmsSendTask.timeoutCount)
            && Objects.equals(this.exdata, vmsSendTask.exdata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            taskState,
            tplId,
            tplName,
            operator,
            createTime,
            sendTime,
            totalCount,
            successCount,
            failedCount,
            timeoutCount,
            exdata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmsSendTask {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    timeoutCount: ").append(toIndentedString(timeoutCount)).append("\n");
        sb.append("    exdata: ").append(toIndentedString(exdata)).append("\n");
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
