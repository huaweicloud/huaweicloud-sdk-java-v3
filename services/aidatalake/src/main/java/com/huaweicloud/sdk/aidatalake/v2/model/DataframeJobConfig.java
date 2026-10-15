package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Aura dataframe Job作业类型的配置信息 。  **约束限制**：不涉及。 **取值范围**：不涉及 **默认取值**：不涉及。
 */
public class DataframeJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint")

    private String entrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private ResourceConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_env")

    private JobRuntimeEnv runtimeEnv;

    public DataframeJobConfig withEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    /**
     * **参数解释**：运行作业主脚本。  **约束限制**：不涉及。 **取值范围**：长度为1~1024个字符。 **默认取值**：不涉及。
     * @return entrypoint
     */
    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public DataframeJobConfig withJobConfig(ResourceConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public DataframeJobConfig withJobConfig(Consumer<ResourceConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new ResourceConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public ResourceConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(ResourceConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public DataframeJobConfig withRuntimeEnv(JobRuntimeEnv runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
        return this;
    }

    public DataframeJobConfig withRuntimeEnv(Consumer<JobRuntimeEnv> runtimeEnvSetter) {
        if (this.runtimeEnv == null) {
            this.runtimeEnv = new JobRuntimeEnv();
            runtimeEnvSetter.accept(this.runtimeEnv);
        }

        return this;
    }

    /**
     * Get runtimeEnv
     * @return runtimeEnv
     */
    public JobRuntimeEnv getRuntimeEnv() {
        return runtimeEnv;
    }

    public void setRuntimeEnv(JobRuntimeEnv runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataframeJobConfig that = (DataframeJobConfig) obj;
        return Objects.equals(this.entrypoint, that.entrypoint) && Objects.equals(this.jobConfig, that.jobConfig)
            && Objects.equals(this.runtimeEnv, that.runtimeEnv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entrypoint, jobConfig, runtimeEnv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataframeJobConfig {\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    runtimeEnv: ").append(toIndentedString(runtimeEnv)).append("\n");
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
