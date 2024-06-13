package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提交流作业的请求参数。
 */
public class CreateStreamJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_config")

    private StreamEnvironmentConfig environmentConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_config")

    private StreamRuntimeConfig runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_sql_parameter")

    private FlinkSqlParameter flinkSqlParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_jar_parameter")

    private FlinkJarParameter flinkJarParameter;

    public CreateStreamJobRequestBody withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 流作业事务 ID，防止重复提交。长度限制：0-64个字符。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public CreateStreamJobRequestBody withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型：flink_sql_job或flink_jar_job
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateStreamJobRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流作业描述。长度限制：0-512个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateStreamJobRequestBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateStreamJobRequestBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateStreamJobRequestBody withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateStreamJobRequestBody withEnvironmentConfig(StreamEnvironmentConfig environmentConfig) {
        this.environmentConfig = environmentConfig;
        return this;
    }

    public CreateStreamJobRequestBody withEnvironmentConfig(Consumer<StreamEnvironmentConfig> environmentConfigSetter) {
        if (this.environmentConfig == null) {
            this.environmentConfig = new StreamEnvironmentConfig();
            environmentConfigSetter.accept(this.environmentConfig);
        }

        return this;
    }

    /**
     * Get environmentConfig
     * @return environmentConfig
     */
    public StreamEnvironmentConfig getEnvironmentConfig() {
        return environmentConfig;
    }

    public void setEnvironmentConfig(StreamEnvironmentConfig environmentConfig) {
        this.environmentConfig = environmentConfig;
    }

    public CreateStreamJobRequestBody withRuntimeConfig(StreamRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public CreateStreamJobRequestBody withRuntimeConfig(Consumer<StreamRuntimeConfig> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new StreamRuntimeConfig();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    /**
     * Get runtimeConfig
     * @return runtimeConfig
     */
    public StreamRuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(StreamRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public CreateStreamJobRequestBody withFlinkSqlParameter(FlinkSqlParameter flinkSqlParameter) {
        this.flinkSqlParameter = flinkSqlParameter;
        return this;
    }

    public CreateStreamJobRequestBody withFlinkSqlParameter(Consumer<FlinkSqlParameter> flinkSqlParameterSetter) {
        if (this.flinkSqlParameter == null) {
            this.flinkSqlParameter = new FlinkSqlParameter();
            flinkSqlParameterSetter.accept(this.flinkSqlParameter);
        }

        return this;
    }

    /**
     * Get flinkSqlParameter
     * @return flinkSqlParameter
     */
    public FlinkSqlParameter getFlinkSqlParameter() {
        return flinkSqlParameter;
    }

    public void setFlinkSqlParameter(FlinkSqlParameter flinkSqlParameter) {
        this.flinkSqlParameter = flinkSqlParameter;
    }

    public CreateStreamJobRequestBody withFlinkJarParameter(FlinkJarParameter flinkJarParameter) {
        this.flinkJarParameter = flinkJarParameter;
        return this;
    }

    public CreateStreamJobRequestBody withFlinkJarParameter(Consumer<FlinkJarParameter> flinkJarParameterSetter) {
        if (this.flinkJarParameter == null) {
            this.flinkJarParameter = new FlinkJarParameter();
            flinkJarParameterSetter.accept(this.flinkJarParameter);
        }

        return this;
    }

    /**
     * Get flinkJarParameter
     * @return flinkJarParameter
     */
    public FlinkJarParameter getFlinkJarParameter() {
        return flinkJarParameter;
    }

    public void setFlinkJarParameter(FlinkJarParameter flinkJarParameter) {
        this.flinkJarParameter = flinkJarParameter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateStreamJobRequestBody that = (CreateStreamJobRequestBody) obj;
        return Objects.equals(this.transactionId, that.transactionId) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.environmentConfig, that.environmentConfig)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.flinkSqlParameter, that.flinkSqlParameter)
            && Objects.equals(this.flinkJarParameter, that.flinkJarParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId,
            jobType,
            description,
            tags,
            environmentConfig,
            runtimeConfig,
            flinkSqlParameter,
            flinkJarParameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStreamJobRequestBody {\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    environmentConfig: ").append(toIndentedString(environmentConfig)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    flinkSqlParameter: ").append(toIndentedString(flinkSqlParameter)).append("\n");
        sb.append("    flinkJarParameter: ").append(toIndentedString(flinkJarParameter)).append("\n");
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
