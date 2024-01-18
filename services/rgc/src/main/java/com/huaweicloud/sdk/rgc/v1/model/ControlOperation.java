package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 控制策略实施的情况。
 */
public class ControlOperation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_control_status_id")

    private String operationControlStatusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ControlOperation withOperationControlStatusId(String operationControlStatusId) {
        this.operationControlStatusId = operationControlStatusId;
        return this;
    }

    /**
     * 本次操作控制策略的ID。
     * @return operationControlStatusId
     */
    public String getOperationControlStatusId() {
        return operationControlStatusId;
    }

    public void setOperationControlStatusId(String operationControlStatusId) {
        this.operationControlStatusId = operationControlStatusId;
    }

    public ControlOperation withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类型，启用控制策略或禁用控制策略。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ControlOperation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 控制策略实施的状态 SUCCEEDED | FAILED | IN_PROGRESS。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ControlOperation withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 控制策略实施失败的错误信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ControlOperation withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 操作开始的时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ControlOperation withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 操作结束的时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ControlOperation that = (ControlOperation) obj;
        return Objects.equals(this.operationControlStatusId, that.operationControlStatusId)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.message, that.message) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationControlStatusId, operationType, status, message, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ControlOperation {\n");
        sb.append("    operationControlStatusId: ").append(toIndentedString(operationControlStatusId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
