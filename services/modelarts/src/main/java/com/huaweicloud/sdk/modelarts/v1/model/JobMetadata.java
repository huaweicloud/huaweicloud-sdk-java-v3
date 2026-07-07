package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业元信息。
 */
public class JobMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, String> annotations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_experiment_reference")

    private List<TrainingExperimentRequest> trainingExperimentReference = null;

    public JobMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 训练作业名称。限制为1-64位只含数字、字母、下划线和中划线的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobMetadata withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 指定作业所处的工作空间，默认值为“0”。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public JobMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对训练作业的描述，默认为“NULL”，字符串的长度限制为[0, 256]。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public JobMetadata putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public JobMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * 训练作业高级功能配置，可选取值如下： - \"job_template\": \"Template RL\"（异构作业）。 - \"fault-tolerance/job-retry-num\": \"3\"（故障自动重启次数）。 - \"jupyter-lab/enable\": \"true\"（JupyterLab训练应用程序）
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public JobMetadata withTrainingExperimentReference(List<TrainingExperimentRequest> trainingExperimentReference) {
        this.trainingExperimentReference = trainingExperimentReference;
        return this;
    }

    public JobMetadata addTrainingExperimentReferenceItem(TrainingExperimentRequest trainingExperimentReferenceItem) {
        if (this.trainingExperimentReference == null) {
            this.trainingExperimentReference = new ArrayList<>();
        }
        this.trainingExperimentReference.add(trainingExperimentReferenceItem);
        return this;
    }

    public JobMetadata withTrainingExperimentReference(
        Consumer<List<TrainingExperimentRequest>> trainingExperimentReferenceSetter) {
        if (this.trainingExperimentReference == null) {
            this.trainingExperimentReference = new ArrayList<>();
        }
        trainingExperimentReferenceSetter.accept(this.trainingExperimentReference);
        return this;
    }

    /**
     * **参数解释**：训练实验参数。 **约束限制**：不涉及。
     * @return trainingExperimentReference
     */
    public List<TrainingExperimentRequest> getTrainingExperimentReference() {
        return trainingExperimentReference;
    }

    public void setTrainingExperimentReference(List<TrainingExperimentRequest> trainingExperimentReference) {
        this.trainingExperimentReference = trainingExperimentReference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobMetadata that = (JobMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.annotations, that.annotations)
            && Objects.equals(this.trainingExperimentReference, that.trainingExperimentReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workspaceId, description, annotations, trainingExperimentReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    trainingExperimentReference: ")
            .append(toIndentedString(trainingExperimentReference))
            .append("\n");
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
