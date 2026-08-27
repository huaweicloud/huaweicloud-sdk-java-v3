package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EvolveTaskRsp
 */
public class EvolveTaskRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_path")

    private String outputPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_id")

    private String algorithmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_file")

    private String algorithmFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_func_name")

    private String algorithmFuncName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_progress")

    private Float taskProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_file")

    private String evaluatorFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_func_name")

    private String evaluatorFuncName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_baseline")

    private String evaluatorBaseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_baseline_func_name")

    private String evaluatorBaselineFuncName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_parameter")

    private EvaluatorParameter evaluatorParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_create_at")

    private Long metaCreateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_start_at")

    private Long metaStartAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_finish_at")

    private Long metaFinishAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    public EvolveTaskRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 任务标识符。 **约束限制**： 不涉及 **取值范围**： 长度[1-128] **默认取值**： 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EvolveTaskRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 优化任务名称。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,128]。 **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EvolveTaskRsp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 优化任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EvolveTaskRsp withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户标识符。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,128]。 **默认取值**： 不涉及 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EvolveTaskRsp withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public EvolveTaskRsp withOutputPath(String outputPath) {
        this.outputPath = outputPath;
        return this;
    }

    /**
     * **参数解释**： 优化结果存储路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,128]。 **默认取值**： 不涉及 
     * @return outputPath
     */
    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public EvolveTaskRsp withAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }

    /**
     * **参数解释**： 关联的算法设计项目。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,128]。 **默认取值**： 不涉及 
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
    }

    public EvolveTaskRsp withAlgorithmFile(String algorithmFile) {
        this.algorithmFile = algorithmFile;
        return this;
    }

    /**
     * **参数解释**： 关联的算法文件路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,256]。 **默认取值**： 不涉及 
     * @return algorithmFile
     */
    public String getAlgorithmFile() {
        return algorithmFile;
    }

    public void setAlgorithmFile(String algorithmFile) {
        this.algorithmFile = algorithmFile;
    }

    public EvolveTaskRsp withAlgorithmFuncName(String algorithmFuncName) {
        this.algorithmFuncName = algorithmFuncName;
        return this;
    }

    /**
     * **参数解释**： 算法函数名。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,256]。 **默认取值**： 不涉及 
     * @return algorithmFuncName
     */
    public String getAlgorithmFuncName() {
        return algorithmFuncName;
    }

    public void setAlgorithmFuncName(String algorithmFuncName) {
        this.algorithmFuncName = algorithmFuncName;
    }

    public EvolveTaskRsp withTaskProgress(Float taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }

    /**
     * **参数解释**： 算法进度。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,1]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 1
     * @return taskProgress
     */
    public Float getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(Float taskProgress) {
        this.taskProgress = taskProgress;
    }

    public EvolveTaskRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 算法状态。 **约束限制**： 不涉及 **取值范围**： * DRAFT: 草稿 * PENDING: 初始化 * RUNNING: 运行中 * STOPPED: 已停止 * FINISHED: 已完成 * FAILED: 异常失败 **默认取值**： 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EvolveTaskRsp withEvaluatorFile(String evaluatorFile) {
        this.evaluatorFile = evaluatorFile;
        return this;
    }

    /**
     * **参数解释**： 评估器文件路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,65536]。 **默认取值**： 不涉及 
     * @return evaluatorFile
     */
    public String getEvaluatorFile() {
        return evaluatorFile;
    }

    public void setEvaluatorFile(String evaluatorFile) {
        this.evaluatorFile = evaluatorFile;
    }

    public EvolveTaskRsp withEvaluatorFuncName(String evaluatorFuncName) {
        this.evaluatorFuncName = evaluatorFuncName;
        return this;
    }

    /**
     * **参数解释**： 评估器算法函数名。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,256]。 **默认取值**： 不涉及 
     * @return evaluatorFuncName
     */
    public String getEvaluatorFuncName() {
        return evaluatorFuncName;
    }

    public void setEvaluatorFuncName(String evaluatorFuncName) {
        this.evaluatorFuncName = evaluatorFuncName;
    }

    public EvolveTaskRsp withEvaluatorBaseline(String evaluatorBaseline) {
        this.evaluatorBaseline = evaluatorBaseline;
        return this;
    }

    /**
     * **参数解释**： 评估基线文件路径。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,65536]。 **默认取值**： 不涉及 
     * @return evaluatorBaseline
     */
    public String getEvaluatorBaseline() {
        return evaluatorBaseline;
    }

    public void setEvaluatorBaseline(String evaluatorBaseline) {
        this.evaluatorBaseline = evaluatorBaseline;
    }

    public EvolveTaskRsp withEvaluatorBaselineFuncName(String evaluatorBaselineFuncName) {
        this.evaluatorBaselineFuncName = evaluatorBaselineFuncName;
        return this;
    }

    /**
     * **参数解释**： 评估基线算法函数名。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,256]。 **默认取值**： 不涉及 
     * @return evaluatorBaselineFuncName
     */
    public String getEvaluatorBaselineFuncName() {
        return evaluatorBaselineFuncName;
    }

    public void setEvaluatorBaselineFuncName(String evaluatorBaselineFuncName) {
        this.evaluatorBaselineFuncName = evaluatorBaselineFuncName;
    }

    public EvolveTaskRsp withEvaluatorParameter(EvaluatorParameter evaluatorParameter) {
        this.evaluatorParameter = evaluatorParameter;
        return this;
    }

    public EvolveTaskRsp withEvaluatorParameter(Consumer<EvaluatorParameter> evaluatorParameterSetter) {
        if (this.evaluatorParameter == null) {
            this.evaluatorParameter = new EvaluatorParameter();
            evaluatorParameterSetter.accept(this.evaluatorParameter);
        }

        return this;
    }

    /**
     * Get evaluatorParameter
     * @return evaluatorParameter
     */
    public EvaluatorParameter getEvaluatorParameter() {
        return evaluatorParameter;
    }

    public void setEvaluatorParameter(EvaluatorParameter evaluatorParameter) {
        this.evaluatorParameter = evaluatorParameter;
    }

    public EvolveTaskRsp withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 关联CCE集群ID。 **约束限制**： 不涉及 **取值范围**： 取值范围[1,128]。 **默认取值**： 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public EvolveTaskRsp withMetaCreateAt(Long metaCreateAt) {
        this.metaCreateAt = metaCreateAt;
        return this;
    }

    /**
     * **参数解释**： 演化任务创建时间,单位毫秒。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,9999999999999]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return metaCreateAt
     */
    public Long getMetaCreateAt() {
        return metaCreateAt;
    }

    public void setMetaCreateAt(Long metaCreateAt) {
        this.metaCreateAt = metaCreateAt;
    }

    public EvolveTaskRsp withMetaStartAt(Long metaStartAt) {
        this.metaStartAt = metaStartAt;
        return this;
    }

    /**
     * **参数解释**： 演化任务启动时间,单位毫秒。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,9999999999999]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return metaStartAt
     */
    public Long getMetaStartAt() {
        return metaStartAt;
    }

    public void setMetaStartAt(Long metaStartAt) {
        this.metaStartAt = metaStartAt;
    }

    public EvolveTaskRsp withMetaFinishAt(Long metaFinishAt) {
        this.metaFinishAt = metaFinishAt;
        return this;
    }

    /**
     * **参数解释**： 演化任务完成时间,单位毫秒。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,9999999999999]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return metaFinishAt
     */
    public Long getMetaFinishAt() {
        return metaFinishAt;
    }

    public void setMetaFinishAt(Long metaFinishAt) {
        this.metaFinishAt = metaFinishAt;
    }

    public EvolveTaskRsp withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**： 项目可见性。 **约束限制**： 不涉及 **取值范围**： * 公共: PUBLIC * 私有: PRIVATE **默认取值**： 不涉及 
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvolveTaskRsp that = (EvolveTaskRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.outputPath, that.outputPath)
            && Objects.equals(this.algorithmId, that.algorithmId)
            && Objects.equals(this.algorithmFile, that.algorithmFile)
            && Objects.equals(this.algorithmFuncName, that.algorithmFuncName)
            && Objects.equals(this.taskProgress, that.taskProgress) && Objects.equals(this.status, that.status)
            && Objects.equals(this.evaluatorFile, that.evaluatorFile)
            && Objects.equals(this.evaluatorFuncName, that.evaluatorFuncName)
            && Objects.equals(this.evaluatorBaseline, that.evaluatorBaseline)
            && Objects.equals(this.evaluatorBaselineFuncName, that.evaluatorBaselineFuncName)
            && Objects.equals(this.evaluatorParameter, that.evaluatorParameter)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.metaCreateAt, that.metaCreateAt)
            && Objects.equals(this.metaStartAt, that.metaStartAt)
            && Objects.equals(this.metaFinishAt, that.metaFinishAt) && Objects.equals(this.visibility, that.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            userId,
            userName,
            outputPath,
            algorithmId,
            algorithmFile,
            algorithmFuncName,
            taskProgress,
            status,
            evaluatorFile,
            evaluatorFuncName,
            evaluatorBaseline,
            evaluatorBaselineFuncName,
            evaluatorParameter,
            clusterId,
            metaCreateAt,
            metaStartAt,
            metaFinishAt,
            visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolveTaskRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
        sb.append("    algorithmId: ").append(toIndentedString(algorithmId)).append("\n");
        sb.append("    algorithmFile: ").append(toIndentedString(algorithmFile)).append("\n");
        sb.append("    algorithmFuncName: ").append(toIndentedString(algorithmFuncName)).append("\n");
        sb.append("    taskProgress: ").append(toIndentedString(taskProgress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    evaluatorFile: ").append(toIndentedString(evaluatorFile)).append("\n");
        sb.append("    evaluatorFuncName: ").append(toIndentedString(evaluatorFuncName)).append("\n");
        sb.append("    evaluatorBaseline: ").append(toIndentedString(evaluatorBaseline)).append("\n");
        sb.append("    evaluatorBaselineFuncName: ").append(toIndentedString(evaluatorBaselineFuncName)).append("\n");
        sb.append("    evaluatorParameter: ").append(toIndentedString(evaluatorParameter)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    metaCreateAt: ").append(toIndentedString(metaCreateAt)).append("\n");
        sb.append("    metaStartAt: ").append(toIndentedString(metaStartAt)).append("\n");
        sb.append("    metaFinishAt: ").append(toIndentedString(metaFinishAt)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
