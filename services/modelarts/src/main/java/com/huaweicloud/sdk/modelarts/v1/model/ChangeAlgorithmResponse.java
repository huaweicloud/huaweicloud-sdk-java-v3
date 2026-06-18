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
public class ChangeAlgorithmResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private AlgorithmResponseMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private AlgorithmResponseJobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_requirements")

    private List<AlgorithmResponseResourceRequirements> resourceRequirements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_config")

    private AlgorithmResponseAdvancedConfig advancedConfig;

    public ChangeAlgorithmResponse withMetadata(AlgorithmResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ChangeAlgorithmResponse withMetadata(Consumer<AlgorithmResponseMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new AlgorithmResponseMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public AlgorithmResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AlgorithmResponseMetadata metadata) {
        this.metadata = metadata;
    }

    public ChangeAlgorithmResponse withJobConfig(AlgorithmResponseJobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public ChangeAlgorithmResponse withJobConfig(Consumer<AlgorithmResponseJobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new AlgorithmResponseJobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public AlgorithmResponseJobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(AlgorithmResponseJobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public ChangeAlgorithmResponse withResourceRequirements(
        List<AlgorithmResponseResourceRequirements> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    public ChangeAlgorithmResponse addResourceRequirementsItem(
        AlgorithmResponseResourceRequirements resourceRequirementsItem) {
        if (this.resourceRequirements == null) {
            this.resourceRequirements = new ArrayList<>();
        }
        this.resourceRequirements.add(resourceRequirementsItem);
        return this;
    }

    public ChangeAlgorithmResponse withResourceRequirements(
        Consumer<List<AlgorithmResponseResourceRequirements>> resourceRequirementsSetter) {
        if (this.resourceRequirements == null) {
            this.resourceRequirements = new ArrayList<>();
        }
        resourceRequirementsSetter.accept(this.resourceRequirements);
        return this;
    }

    /**
     * 算法资源约束，可不设置。设置后，在算法使用于训练作业时，控制台会过滤可用的公共资源池。
     * @return resourceRequirements
     */
    public List<AlgorithmResponseResourceRequirements> getResourceRequirements() {
        return resourceRequirements;
    }

    public void setResourceRequirements(List<AlgorithmResponseResourceRequirements> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
    }

    public ChangeAlgorithmResponse withAdvancedConfig(AlgorithmResponseAdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public ChangeAlgorithmResponse withAdvancedConfig(Consumer<AlgorithmResponseAdvancedConfig> advancedConfigSetter) {
        if (this.advancedConfig == null) {
            this.advancedConfig = new AlgorithmResponseAdvancedConfig();
            advancedConfigSetter.accept(this.advancedConfig);
        }

        return this;
    }

    /**
     * Get advancedConfig
     * @return advancedConfig
     */
    public AlgorithmResponseAdvancedConfig getAdvancedConfig() {
        return advancedConfig;
    }

    public void setAdvancedConfig(AlgorithmResponseAdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeAlgorithmResponse that = (ChangeAlgorithmResponse) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.jobConfig, that.jobConfig)
            && Objects.equals(this.resourceRequirements, that.resourceRequirements)
            && Objects.equals(this.advancedConfig, that.advancedConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, jobConfig, resourceRequirements, advancedConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAlgorithmResponse {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    resourceRequirements: ").append(toIndentedString(resourceRequirements)).append("\n");
        sb.append("    advancedConfig: ").append(toIndentedString(advancedConfig)).append("\n");
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
