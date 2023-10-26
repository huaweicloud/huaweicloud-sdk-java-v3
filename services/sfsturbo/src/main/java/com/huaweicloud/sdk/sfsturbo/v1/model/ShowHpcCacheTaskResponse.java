package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHpcCacheTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_target")

    private String srcTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_prefix")

    private String srcPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_target")

    private String destTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_prefix")

    private String destPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowHpcCacheTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowHpcCacheTaskResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowHpcCacheTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowHpcCacheTaskResponse withSrcTarget(String srcTarget) {
        this.srcTarget = srcTarget;
        return this;
    }

    /**
     * 源端对象
     * @return srcTarget
     */
    public String getSrcTarget() {
        return srcTarget;
    }

    public void setSrcTarget(String srcTarget) {
        this.srcTarget = srcTarget;
    }

    public ShowHpcCacheTaskResponse withSrcPrefix(String srcPrefix) {
        this.srcPrefix = srcPrefix;
        return this;
    }

    /**
     * 源端路径
     * @return srcPrefix
     */
    public String getSrcPrefix() {
        return srcPrefix;
    }

    public void setSrcPrefix(String srcPrefix) {
        this.srcPrefix = srcPrefix;
    }

    public ShowHpcCacheTaskResponse withDestTarget(String destTarget) {
        this.destTarget = destTarget;
        return this;
    }

    /**
     * 目的端对象
     * @return destTarget
     */
    public String getDestTarget() {
        return destTarget;
    }

    public void setDestTarget(String destTarget) {
        this.destTarget = destTarget;
    }

    public ShowHpcCacheTaskResponse withDestPrefix(String destPrefix) {
        this.destPrefix = destPrefix;
        return this;
    }

    /**
     * 目的端路径
     * @return destPrefix
     */
    public String getDestPrefix() {
        return destPrefix;
    }

    public void setDestPrefix(String destPrefix) {
        this.destPrefix = destPrefix;
    }

    public ShowHpcCacheTaskResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowHpcCacheTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowHpcCacheTaskResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 任务执行结果信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowHpcCacheTaskResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHpcCacheTaskResponse that = (ShowHpcCacheTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.srcTarget, that.srcTarget)
            && Objects.equals(this.srcPrefix, that.srcPrefix) && Objects.equals(this.destTarget, that.destTarget)
            && Objects.equals(this.destPrefix, that.destPrefix) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.message, that.message)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            type,
            status,
            srcTarget,
            srcPrefix,
            destTarget,
            destPrefix,
            startTime,
            endTime,
            message,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHpcCacheTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    srcTarget: ").append(toIndentedString(srcTarget)).append("\n");
        sb.append("    srcPrefix: ").append(toIndentedString(srcPrefix)).append("\n");
        sb.append("    destTarget: ").append(toIndentedString(destTarget)).append("\n");
        sb.append("    destPrefix: ").append(toIndentedString(destPrefix)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
