package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 精调训练作业参数
 */
public class MasJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ft_job_uuid")

    private String ftJobUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ft_train_type")

    private String ftTrainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_type")

    private String modelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_output_path")

    private String trainOutputPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_process")

    private Double trainProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_id")

    private String checkpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_env")

    private TaskEnv taskEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_config")

    private CheckpointConf checkpointConfig;

    public MasJobConfig withFtJobUuid(String ftJobUuid) {
        this.ftJobUuid = ftJobUuid;
        return this;
    }

    /**
     * 模型ID
     * @return ftJobUuid
     */
    public String getFtJobUuid() {
        return ftJobUuid;
    }

    public void setFtJobUuid(String ftJobUuid) {
        this.ftJobUuid = ftJobUuid;
    }

    public MasJobConfig withFtTrainType(String ftTrainType) {
        this.ftTrainType = ftTrainType;
        return this;
    }

    /**
     * 模型训练类型
     * @return ftTrainType
     */
    public String getFtTrainType() {
        return ftTrainType;
    }

    public void setFtTrainType(String ftTrainType) {
        this.ftTrainType = ftTrainType;
    }

    public MasJobConfig withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * 模型类型
     * @return modelType
     */
    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public MasJobConfig withTrainOutputPath(String trainOutputPath) {
        this.trainOutputPath = trainOutputPath;
        return this;
    }

    /**
     * 训练作业输出路径
     * @return trainOutputPath
     */
    public String getTrainOutputPath() {
        return trainOutputPath;
    }

    public void setTrainOutputPath(String trainOutputPath) {
        this.trainOutputPath = trainOutputPath;
    }

    public MasJobConfig withTrainProcess(Double trainProcess) {
        this.trainProcess = trainProcess;
        return this;
    }

    /**
     * 训练作业进度
     * minimum: 0
     * maximum: 1
     * @return trainProcess
     */
    public Double getTrainProcess() {
        return trainProcess;
    }

    public void setTrainProcess(Double trainProcess) {
        this.trainProcess = trainProcess;
    }

    public MasJobConfig withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    /**
     * 断点ID
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public MasJobConfig withTaskEnv(TaskEnv taskEnv) {
        this.taskEnv = taskEnv;
        return this;
    }

    public MasJobConfig withTaskEnv(Consumer<TaskEnv> taskEnvSetter) {
        if (this.taskEnv == null) {
            this.taskEnv = new TaskEnv();
            taskEnvSetter.accept(this.taskEnv);
        }

        return this;
    }

    /**
     * Get taskEnv
     * @return taskEnv
     */
    public TaskEnv getTaskEnv() {
        return taskEnv;
    }

    public void setTaskEnv(TaskEnv taskEnv) {
        this.taskEnv = taskEnv;
    }

    public MasJobConfig withCheckpointConfig(CheckpointConf checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
        return this;
    }

    public MasJobConfig withCheckpointConfig(Consumer<CheckpointConf> checkpointConfigSetter) {
        if (this.checkpointConfig == null) {
            this.checkpointConfig = new CheckpointConf();
            checkpointConfigSetter.accept(this.checkpointConfig);
        }

        return this;
    }

    /**
     * Get checkpointConfig
     * @return checkpointConfig
     */
    public CheckpointConf getCheckpointConfig() {
        return checkpointConfig;
    }

    public void setCheckpointConfig(CheckpointConf checkpointConfig) {
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
        MasJobConfig that = (MasJobConfig) obj;
        return Objects.equals(this.ftJobUuid, that.ftJobUuid) && Objects.equals(this.ftTrainType, that.ftTrainType)
            && Objects.equals(this.modelType, that.modelType)
            && Objects.equals(this.trainOutputPath, that.trainOutputPath)
            && Objects.equals(this.trainProcess, that.trainProcess)
            && Objects.equals(this.checkpointId, that.checkpointId) && Objects.equals(this.taskEnv, that.taskEnv)
            && Objects.equals(this.checkpointConfig, that.checkpointConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ftJobUuid,
            ftTrainType,
            modelType,
            trainOutputPath,
            trainProcess,
            checkpointId,
            taskEnv,
            checkpointConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MasJobConfig {\n");
        sb.append("    ftJobUuid: ").append(toIndentedString(ftJobUuid)).append("\n");
        sb.append("    ftTrainType: ").append(toIndentedString(ftTrainType)).append("\n");
        sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
        sb.append("    trainOutputPath: ").append(toIndentedString(trainOutputPath)).append("\n");
        sb.append("    trainProcess: ").append(toIndentedString(trainProcess)).append("\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    taskEnv: ").append(toIndentedString(taskEnv)).append("\n");
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
