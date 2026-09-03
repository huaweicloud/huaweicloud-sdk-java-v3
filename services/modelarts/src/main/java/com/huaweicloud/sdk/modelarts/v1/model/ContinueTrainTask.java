package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ContinueTrainTask
 */
public class ContinueTrainTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_id")

    private String checkpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue_task_id")

    private String continueTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue_task_name")

    private String continueTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue_train_type")

    private String continueTrainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_steps")

    private Integer skippedSteps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_training")

    private Integer restoreTraining;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_config")

    private String checkpointConfig;

    public ContinueTrainTask withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    /**
     * 中间产物id。
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public ContinueTrainTask withContinueTaskId(String continueTaskId) {
        this.continueTaskId = continueTaskId;
        return this;
    }

    /**
     * 续训任务id。
     * @return continueTaskId
     */
    public String getContinueTaskId() {
        return continueTaskId;
    }

    public void setContinueTaskId(String continueTaskId) {
        this.continueTaskId = continueTaskId;
    }

    public ContinueTrainTask withContinueTaskName(String continueTaskName) {
        this.continueTaskName = continueTaskName;
        return this;
    }

    /**
     * 续训任务名称。
     * @return continueTaskName
     */
    public String getContinueTaskName() {
        return continueTaskName;
    }

    public void setContinueTaskName(String continueTaskName) {
        this.continueTaskName = continueTaskName;
    }

    public ContinueTrainTask withContinueTrainType(String continueTrainType) {
        this.continueTrainType = continueTrainType;
        return this;
    }

    /**
     * 续训训练类型。
     * @return continueTrainType
     */
    public String getContinueTrainType() {
        return continueTrainType;
    }

    public void setContinueTrainType(String continueTrainType) {
        this.continueTrainType = continueTrainType;
    }

    public ContinueTrainTask withSkippedSteps(Integer skippedSteps) {
        this.skippedSteps = skippedSteps;
        return this;
    }

    /**
     * 跳过步数，0表示不跳过。
     * minimum: 0
     * maximum: 2147483647
     * @return skippedSteps
     */
    public Integer getSkippedSteps() {
        return skippedSteps;
    }

    public void setSkippedSteps(Integer skippedSteps) {
        this.skippedSteps = skippedSteps;
    }

    public ContinueTrainTask withRestoreTraining(Integer restoreTraining) {
        this.restoreTraining = restoreTraining;
        return this;
    }

    /**
     * 是否续训任务。  0: 非续训, 1:续训。
     * minimum: 0
     * maximum: 1
     * @return restoreTraining
     */
    public Integer getRestoreTraining() {
        return restoreTraining;
    }

    public void setRestoreTraining(Integer restoreTraining) {
        this.restoreTraining = restoreTraining;
    }

    public ContinueTrainTask withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ContinueTrainTask withCheckpointConfig(String checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
        return this;
    }

    /**
     * 中间产物配置信息。
     * @return checkpointConfig
     */
    public String getCheckpointConfig() {
        return checkpointConfig;
    }

    public void setCheckpointConfig(String checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContinueTrainTask that = (ContinueTrainTask) obj;
        return Objects.equals(this.checkpointId, that.checkpointId)
            && Objects.equals(this.continueTaskId, that.continueTaskId)
            && Objects.equals(this.continueTaskName, that.continueTaskName)
            && Objects.equals(this.continueTrainType, that.continueTrainType)
            && Objects.equals(this.skippedSteps, that.skippedSteps)
            && Objects.equals(this.restoreTraining, that.restoreTraining)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.checkpointConfig, that.checkpointConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpointId,
            continueTaskId,
            continueTaskName,
            continueTrainType,
            skippedSteps,
            restoreTraining,
            createTime,
            checkpointConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContinueTrainTask {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    continueTaskId: ").append(toIndentedString(continueTaskId)).append("\n");
        sb.append("    continueTaskName: ").append(toIndentedString(continueTaskName)).append("\n");
        sb.append("    continueTrainType: ").append(toIndentedString(continueTrainType)).append("\n");
        sb.append("    skippedSteps: ").append(toIndentedString(skippedSteps)).append("\n");
        sb.append("    restoreTraining: ").append(toIndentedString(restoreTraining)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    checkpointConfig: ").append(toIndentedString(checkpointConfig)).append("\n");
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
