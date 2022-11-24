package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListVmsSendTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_begin_time")

    private String sendBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_end_time")

    private String sendEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListVmsSendTasksRequest withTaskName(String taskName) {
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

    public ListVmsSendTasksRequest withTaskId(String taskId) {
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

    public ListVmsSendTasksRequest withTplId(String tplId) {
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

    public ListVmsSendTasksRequest withTplName(String tplName) {
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

    public ListVmsSendTasksRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 智能信息基础版任务创建开始时间。 样例为：2019-10-12T07:20:50Z。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListVmsSendTasksRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 智能信息基础版任务创建结束时间。 样例为：2019-10-12T07:20:50Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListVmsSendTasksRequest withSendBeginTime(String sendBeginTime) {
        this.sendBeginTime = sendBeginTime;
        return this;
    }

    /**
     * 智能信息基础版任务发送开始时间。 样例为：2019-10-12T07:20:50Z。
     * @return sendBeginTime
     */
    public String getSendBeginTime() {
        return sendBeginTime;
    }

    public void setSendBeginTime(String sendBeginTime) {
        this.sendBeginTime = sendBeginTime;
    }

    public ListVmsSendTasksRequest withSendEndTime(String sendEndTime) {
        this.sendEndTime = sendEndTime;
        return this;
    }

    /**
     * 智能信息基础版任务发送结束时间。 样例为：2019-10-12T07:20:50Z。
     * @return sendEndTime
     */
    public String getSendEndTime() {
        return sendEndTime;
    }

    public void setSendEndTime(String sendEndTime) {
        this.sendEndTime = sendEndTime;
    }

    public ListVmsSendTasksRequest withOperator(String operator) {
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

    public ListVmsSendTasksRequest withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 发送状态类型。 - submit_success：提交成功 - submit_failed：提交失败 - processing：发送中 - sending_failed：发送失败 - re_submit_success：重试提交成功 - sending_complete：发送完成 - re_submit_failed：重试提交成功 - re_processing：重试进行中 - re_sending_complete：重试发送完成 - scheduled：定时任务
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ListVmsSendTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVmsSendTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVmsSendTasksRequest listVmsSendTasksRequest = (ListVmsSendTasksRequest) o;
        return Objects.equals(this.taskName, listVmsSendTasksRequest.taskName)
            && Objects.equals(this.taskId, listVmsSendTasksRequest.taskId)
            && Objects.equals(this.tplId, listVmsSendTasksRequest.tplId)
            && Objects.equals(this.tplName, listVmsSendTasksRequest.tplName)
            && Objects.equals(this.beginTime, listVmsSendTasksRequest.beginTime)
            && Objects.equals(this.endTime, listVmsSendTasksRequest.endTime)
            && Objects.equals(this.sendBeginTime, listVmsSendTasksRequest.sendBeginTime)
            && Objects.equals(this.sendEndTime, listVmsSendTasksRequest.sendEndTime)
            && Objects.equals(this.operator, listVmsSendTasksRequest.operator)
            && Objects.equals(this.taskStatus, listVmsSendTasksRequest.taskStatus)
            && Objects.equals(this.offset, listVmsSendTasksRequest.offset)
            && Objects.equals(this.limit, listVmsSendTasksRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            taskId,
            tplId,
            tplName,
            beginTime,
            endTime,
            sendBeginTime,
            sendEndTime,
            operator,
            taskStatus,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVmsSendTasksRequest {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sendBeginTime: ").append(toIndentedString(sendBeginTime)).append("\n");
        sb.append("    sendEndTime: ").append(toIndentedString(sendEndTime)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
