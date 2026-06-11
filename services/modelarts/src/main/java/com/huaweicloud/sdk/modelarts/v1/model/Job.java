package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建训练作业的作业请求体和相应体。
 */
public class Job {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private JobMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private JobAlgorithm algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<Task> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private Spec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private JobEndpointsReq endpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_type")

    private String trainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ftjob_config")

    private MasJobConfig ftjobConfig;

    public Job withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：训练作业类型。 **约束限制**：不涉及。 **取值范围**： - job：普通作业 - federated_pool_job：资源池联邦作业 - edge_job：边缘作业 - hetero_job：异构作业 - mrs_job：MRS作业 - autosearch_job：自动化搜索作业 - diag_job：诊断作业 - visualization_job：可视化作业  **默认取值**：job。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Job withMetadata(JobMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Job withMetadata(Consumer<JobMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new JobMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public JobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(JobMetadata metadata) {
        this.metadata = metadata;
    }

    public Job withAlgorithm(JobAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    public Job withAlgorithm(Consumer<JobAlgorithm> algorithmSetter) {
        if (this.algorithm == null) {
            this.algorithm = new JobAlgorithm();
            algorithmSetter.accept(this.algorithm);
        }

        return this;
    }

    /**
     * Get algorithm
     * @return algorithm
     */
    public JobAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(JobAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public Job withTasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    public Job addTasksItem(Task tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public Job withTasks(Consumer<List<Task>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * **参数解释**：任务列表。该功能暂未实现。 **约束限制**：不涉及。
     * @return tasks
     */
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Job withSpec(Spec spec) {
        this.spec = spec;
        return this;
    }

    public Job withSpec(Consumer<Spec> specSetter) {
        if (this.spec == null) {
            this.spec = new Spec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public Job withEndpoints(JobEndpointsReq endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public Job withEndpoints(Consumer<JobEndpointsReq> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new JobEndpointsReq();
            endpointsSetter.accept(this.endpoints);
        }

        return this;
    }

    /**
     * Get endpoints
     * @return endpoints
     */
    public JobEndpointsReq getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(JobEndpointsReq endpoints) {
        this.endpoints = endpoints;
    }

    public Job withTrainType(String trainType) {
        this.trainType = trainType;
        return this;
    }

    /**
     * **参数解释**：类型。 **约束限制**：不涉及。 **取值范围**：SFT（全量微调）、PRETRAIN（预训练）、LORA（lora微调）、DPO（dpo强化学习）、RFT（rft强化学习）
     * @return trainType
     */
    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public Job withFtjobConfig(MasJobConfig ftjobConfig) {
        this.ftjobConfig = ftjobConfig;
        return this;
    }

    public Job withFtjobConfig(Consumer<MasJobConfig> ftjobConfigSetter) {
        if (this.ftjobConfig == null) {
            this.ftjobConfig = new MasJobConfig();
            ftjobConfigSetter.accept(this.ftjobConfig);
        }

        return this;
    }

    /**
     * Get ftjobConfig
     * @return ftjobConfig
     */
    public MasJobConfig getFtjobConfig() {
        return ftjobConfig;
    }

    public void setFtjobConfig(MasJobConfig ftjobConfig) {
        this.ftjobConfig = ftjobConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Job that = (Job) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.algorithm, that.algorithm) && Objects.equals(this.tasks, that.tasks)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.trainType, that.trainType) && Objects.equals(this.ftjobConfig, that.ftjobConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, metadata, algorithm, tasks, spec, endpoints, trainType, ftjobConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    trainType: ").append(toIndentedString(trainType)).append("\n");
        sb.append("    ftjobConfig: ").append(toIndentedString(ftjobConfig)).append("\n");
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
