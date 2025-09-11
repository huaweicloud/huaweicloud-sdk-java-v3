package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例任务信息
 */
public class InstanceTask {

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
    @JsonProperty(value = "status_detail")

    private String statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_config")

    private TargetConfig targetConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_window")

    private OperateWindow operateWindow;

    public InstanceTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数说明**：实任务ID。 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public InstanceTask withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数说明**：实例任务类型。 **取值范围**： - CREATE：创建实例任务 - MODIFY：实例规格变更任务 - DELETE：实例删除任务 - FREEZE：实例冻结任务 - UNFREEZE：实例解冻任务 - UPDATE_ACCESS_CONFIG：修改实例接入信息任务 - UPDATE_ALLOW_LISTS： 修改实例接入白名单任务 - OPEN_SNAT：启用实例SNAT配置任务 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InstanceTask withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：任务状态。 **取值范围**： - PENDING：等待执行 - RUNNING：执行中 - SUCCESS：执行成功 - FAILED：执行失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceTask withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * **参数说明**：任务状态描述。 
     * @return statusDetail
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public InstanceTask withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数说明**：实例任务的创建时间。格式为：\"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\" 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public InstanceTask withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数说明**：实例任务的开始时间。格式为：\"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\" 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public InstanceTask withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数说明**：实例任务的结束时间。格式为：\"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\" 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public InstanceTask withTargetConfig(TargetConfig targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }

    public InstanceTask withTargetConfig(Consumer<TargetConfig> targetConfigSetter) {
        if (this.targetConfig == null) {
            this.targetConfig = new TargetConfig();
            targetConfigSetter.accept(this.targetConfig);
        }

        return this;
    }

    /**
     * Get targetConfig
     * @return targetConfig
     */
    public TargetConfig getTargetConfig() {
        return targetConfig;
    }

    public void setTargetConfig(TargetConfig targetConfig) {
        this.targetConfig = targetConfig;
    }

    public InstanceTask withOperateWindow(OperateWindow operateWindow) {
        this.operateWindow = operateWindow;
        return this;
    }

    public InstanceTask withOperateWindow(Consumer<OperateWindow> operateWindowSetter) {
        if (this.operateWindow == null) {
            this.operateWindow = new OperateWindow();
            operateWindowSetter.accept(this.operateWindow);
        }

        return this;
    }

    /**
     * Get operateWindow
     * @return operateWindow
     */
    public OperateWindow getOperateWindow() {
        return operateWindow;
    }

    public void setOperateWindow(OperateWindow operateWindow) {
        this.operateWindow = operateWindow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceTask that = (InstanceTask) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusDetail, that.statusDetail)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.targetConfig, that.targetConfig)
            && Objects.equals(this.operateWindow, that.operateWindow);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskId, type, status, statusDetail, createTime, startTime, endTime, targetConfig, operateWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceTask {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    targetConfig: ").append(toIndentedString(targetConfig)).append("\n");
        sb.append("    operateWindow: ").append(toIndentedString(operateWindow)).append("\n");
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
