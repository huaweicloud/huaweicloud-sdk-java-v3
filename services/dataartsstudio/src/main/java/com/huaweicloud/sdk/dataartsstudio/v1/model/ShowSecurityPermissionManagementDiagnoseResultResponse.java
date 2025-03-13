package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityPermissionManagementDiagnoseResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_time")

    private Long checkTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning")

    private Boolean scanning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_permission")

    private HighPermission highPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unreasonable_permission")

    private UnreasonablePermission unreasonablePermission;

    public ShowSecurityPermissionManagementDiagnoseResultResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 诊断任务id。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowSecurityPermissionManagementDiagnoseResultResponse withCheckTime(Long checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    /**
     * 最新检测时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return checkTime
     */
    public Long getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
    }

    public ShowSecurityPermissionManagementDiagnoseResultResponse withScanning(Boolean scanning) {
        this.scanning = scanning;
        return this;
    }

    /**
     * 是否正在诊断。
     * @return scanning
     */
    public Boolean getScanning() {
        return scanning;
    }

    public void setScanning(Boolean scanning) {
        this.scanning = scanning;
    }

    public ShowSecurityPermissionManagementDiagnoseResultResponse withHighPermission(HighPermission highPermission) {
        this.highPermission = highPermission;
        return this;
    }

    public ShowSecurityPermissionManagementDiagnoseResultResponse withHighPermission(
        Consumer<HighPermission> highPermissionSetter) {
        if (this.highPermission == null) {
            this.highPermission = new HighPermission();
            highPermissionSetter.accept(this.highPermission);
        }

        return this;
    }

    /**
     * Get highPermission
     * @return highPermission
     */
    public HighPermission getHighPermission() {
        return highPermission;
    }

    public void setHighPermission(HighPermission highPermission) {
        this.highPermission = highPermission;
    }

    public ShowSecurityPermissionManagementDiagnoseResultResponse withUnreasonablePermission(
        UnreasonablePermission unreasonablePermission) {
        this.unreasonablePermission = unreasonablePermission;
        return this;
    }

    public ShowSecurityPermissionManagementDiagnoseResultResponse withUnreasonablePermission(
        Consumer<UnreasonablePermission> unreasonablePermissionSetter) {
        if (this.unreasonablePermission == null) {
            this.unreasonablePermission = new UnreasonablePermission();
            unreasonablePermissionSetter.accept(this.unreasonablePermission);
        }

        return this;
    }

    /**
     * Get unreasonablePermission
     * @return unreasonablePermission
     */
    public UnreasonablePermission getUnreasonablePermission() {
        return unreasonablePermission;
    }

    public void setUnreasonablePermission(UnreasonablePermission unreasonablePermission) {
        this.unreasonablePermission = unreasonablePermission;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityPermissionManagementDiagnoseResultResponse that =
            (ShowSecurityPermissionManagementDiagnoseResultResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.checkTime, that.checkTime)
            && Objects.equals(this.scanning, that.scanning) && Objects.equals(this.highPermission, that.highPermission)
            && Objects.equals(this.unreasonablePermission, that.unreasonablePermission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, checkTime, scanning, highPermission, unreasonablePermission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityPermissionManagementDiagnoseResultResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
        sb.append("    scanning: ").append(toIndentedString(scanning)).append("\n");
        sb.append("    highPermission: ").append(toIndentedString(highPermission)).append("\n");
        sb.append("    unreasonablePermission: ").append(toIndentedString(unreasonablePermission)).append("\n");
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
