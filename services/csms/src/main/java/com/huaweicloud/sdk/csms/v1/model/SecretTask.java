package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecretTask
 */
public class SecretTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_func_urn")

    private String rotationFuncUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attempt_nums")

    private Integer attemptNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_time")

    private Long taskTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_error_code")

    private String taskErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_error_msg")

    private String taskErrorMsg;

    public SecretTask withTaskId(String taskId) {
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

    public SecretTask withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public SecretTask withRotationFuncUrn(String rotationFuncUrn) {
        this.rotationFuncUrn = rotationFuncUrn;
        return this;
    }

    /**
     * FunctionGraph函数的urn。
     * @return rotationFuncUrn
     */
    public String getRotationFuncUrn() {
        return rotationFuncUrn;
    }

    public void setRotationFuncUrn(String rotationFuncUrn) {
        this.rotationFuncUrn = rotationFuncUrn;
    }

    public SecretTask withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public SecretTask withAttemptNums(Integer attemptNums) {
        this.attemptNums = attemptNums;
        return this;
    }

    /**
     * 任务尝试次数。
     * @return attemptNums
     */
    public Integer getAttemptNums() {
        return attemptNums;
    }

    public void setAttemptNums(Integer attemptNums) {
        this.attemptNums = attemptNums;
    }

    public SecretTask withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 轮转类型。
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public SecretTask withTaskTime(Long taskTime) {
        this.taskTime = taskTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return taskTime
     */
    public Long getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Long taskTime) {
        this.taskTime = taskTime;
    }

    public SecretTask withTaskErrorCode(String taskErrorCode) {
        this.taskErrorCode = taskErrorCode;
        return this;
    }

    /**
     * 任务错误码。
     * @return taskErrorCode
     */
    public String getTaskErrorCode() {
        return taskErrorCode;
    }

    public void setTaskErrorCode(String taskErrorCode) {
        this.taskErrorCode = taskErrorCode;
    }

    public SecretTask withTaskErrorMsg(String taskErrorMsg) {
        this.taskErrorMsg = taskErrorMsg;
        return this;
    }

    /**
     * 任务错误信息。
     * @return taskErrorMsg
     */
    public String getTaskErrorMsg() {
        return taskErrorMsg;
    }

    public void setTaskErrorMsg(String taskErrorMsg) {
        this.taskErrorMsg = taskErrorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecretTask that = (SecretTask) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.rotationFuncUrn, that.rotationFuncUrn)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.attemptNums, that.attemptNums)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.taskTime, that.taskTime)
            && Objects.equals(this.taskErrorCode, that.taskErrorCode)
            && Objects.equals(this.taskErrorMsg, that.taskErrorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            secretName,
            rotationFuncUrn,
            taskStatus,
            attemptNums,
            operateType,
            taskTime,
            taskErrorCode,
            taskErrorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretTask {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    rotationFuncUrn: ").append(toIndentedString(rotationFuncUrn)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    attemptNums: ").append(toIndentedString(attemptNums)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    taskTime: ").append(toIndentedString(taskTime)).append("\n");
        sb.append("    taskErrorCode: ").append(toIndentedString(taskErrorCode)).append("\n");
        sb.append("    taskErrorMsg: ").append(toIndentedString(taskErrorMsg)).append("\n");
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
