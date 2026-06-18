package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法管理算法配置。
 */
public class Algorithm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private AlgorithmMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private AlgorithmJobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_requirements")

    private List<ResourceRequirement> resourceRequirements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_config")

    private AlgorithmAdvancedConfig advancedConfig;

    public Algorithm withMetadata(AlgorithmMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Algorithm withMetadata(Consumer<AlgorithmMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new AlgorithmMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public AlgorithmMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AlgorithmMetadata metadata) {
        this.metadata = metadata;
    }

    public Algorithm withJobConfig(AlgorithmJobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public Algorithm withJobConfig(Consumer<AlgorithmJobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new AlgorithmJobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public AlgorithmJobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(AlgorithmJobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public Algorithm withResourceRequirements(List<ResourceRequirement> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    public Algorithm addResourceRequirementsItem(ResourceRequirement resourceRequirementsItem) {
        if (this.resourceRequirements == null) {
            this.resourceRequirements = new ArrayList<>();
        }
        this.resourceRequirements.add(resourceRequirementsItem);
        return this;
    }

    public Algorithm withResourceRequirements(Consumer<List<ResourceRequirement>> resourceRequirementsSetter) {
        if (this.resourceRequirements == null) {
            this.resourceRequirements = new ArrayList<>();
        }
        resourceRequirementsSetter.accept(this.resourceRequirements);
        return this;
    }

    /**
     * 算法资源约束。可不设置。设置后，在算法使用于训练作业时，控制台会过滤可用的公共资源池。
     * @return resourceRequirements
     */
    public List<ResourceRequirement> getResourceRequirements() {
        return resourceRequirements;
    }

    public void setResourceRequirements(List<ResourceRequirement> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
    }

    public Algorithm withAdvancedConfig(AlgorithmAdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public Algorithm withAdvancedConfig(Consumer<AlgorithmAdvancedConfig> advancedConfigSetter) {
        if (this.advancedConfig == null) {
            this.advancedConfig = new AlgorithmAdvancedConfig();
            advancedConfigSetter.accept(this.advancedConfig);
        }

        return this;
    }

    /**
     * Get advancedConfig
     * @return advancedConfig
     */
    public AlgorithmAdvancedConfig getAdvancedConfig() {
        return advancedConfig;
    }

    public void setAdvancedConfig(AlgorithmAdvancedConfig advancedConfig) {
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
        Algorithm that = (Algorithm) obj;
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
        sb.append("class Algorithm {\n");
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
