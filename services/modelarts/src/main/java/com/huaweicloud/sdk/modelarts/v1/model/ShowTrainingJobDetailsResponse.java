package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTrainingJobDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private JobMetadataResponse metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private JobAlgorithmResponse algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskResponse> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecResponse spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private JobEndpointsResp endpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ftjob_config")

    private MasJobConfig ftjobConfig;

    public ShowTrainingJobDetailsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：训练作业类型。 **取值范围**： - job：普通作业 - federated_pool_job：资源池联邦作业 - edge_job：边缘作业 - hetero_job：异构作业 - mrs_job：MRS作业 - autosearch_job：自动化搜索作业 - diag_job：诊断作业 - visualization_job：可视化作业
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowTrainingJobDetailsResponse withMetadata(JobMetadataResponse metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowTrainingJobDetailsResponse withMetadata(Consumer<JobMetadataResponse> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new JobMetadataResponse();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public JobMetadataResponse getMetadata() {
        return metadata;
    }

    public void setMetadata(JobMetadataResponse metadata) {
        this.metadata = metadata;
    }

    public ShowTrainingJobDetailsResponse withStatus(Status status) {
        this.status = status;
        return this;
    }

    public ShowTrainingJobDetailsResponse withStatus(Consumer<Status> statusSetter) {
        if (this.status == null) {
            this.status = new Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ShowTrainingJobDetailsResponse withAlgorithm(JobAlgorithmResponse algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    public ShowTrainingJobDetailsResponse withAlgorithm(Consumer<JobAlgorithmResponse> algorithmSetter) {
        if (this.algorithm == null) {
            this.algorithm = new JobAlgorithmResponse();
            algorithmSetter.accept(this.algorithm);
        }

        return this;
    }

    /**
     * Get algorithm
     * @return algorithm
     */
    public JobAlgorithmResponse getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(JobAlgorithmResponse algorithm) {
        this.algorithm = algorithm;
    }

    public ShowTrainingJobDetailsResponse withTasks(List<TaskResponse> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowTrainingJobDetailsResponse addTasksItem(TaskResponse tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowTrainingJobDetailsResponse withTasks(Consumer<List<TaskResponse>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * **参数解释**：异构训练作业的任务列表。
     * @return tasks
     */
    public List<TaskResponse> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskResponse> tasks) {
        this.tasks = tasks;
    }

    public ShowTrainingJobDetailsResponse withSpec(SpecResponse spec) {
        this.spec = spec;
        return this;
    }

    public ShowTrainingJobDetailsResponse withSpec(Consumer<SpecResponse> specSetter) {
        if (this.spec == null) {
            this.spec = new SpecResponse();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public SpecResponse getSpec() {
        return spec;
    }

    public void setSpec(SpecResponse spec) {
        this.spec = spec;
    }

    public ShowTrainingJobDetailsResponse withEndpoints(JobEndpointsResp endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ShowTrainingJobDetailsResponse withEndpoints(Consumer<JobEndpointsResp> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new JobEndpointsResp();
            endpointsSetter.accept(this.endpoints);
        }

        return this;
    }

    /**
     * Get endpoints
     * @return endpoints
     */
    public JobEndpointsResp getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(JobEndpointsResp endpoints) {
        this.endpoints = endpoints;
    }

    public ShowTrainingJobDetailsResponse withFtjobConfig(MasJobConfig ftjobConfig) {
        this.ftjobConfig = ftjobConfig;
        return this;
    }

    public ShowTrainingJobDetailsResponse withFtjobConfig(Consumer<MasJobConfig> ftjobConfigSetter) {
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
        ShowTrainingJobDetailsResponse that = (ShowTrainingJobDetailsResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.status, that.status) && Objects.equals(this.algorithm, that.algorithm)
            && Objects.equals(this.tasks, that.tasks) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.endpoints, that.endpoints) && Objects.equals(this.ftjobConfig, that.ftjobConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, metadata, status, algorithm, tasks, spec, endpoints, ftjobConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingJobDetailsResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
