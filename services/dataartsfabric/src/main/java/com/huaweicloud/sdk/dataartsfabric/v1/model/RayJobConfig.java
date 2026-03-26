package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Ray job类型的配置。
 */
public class RayJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint")

    private String entrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Object metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint_num_cpus")

    private Double entrypointNumCpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint_num_gpus")

    private Double entrypointNumGpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint_memory")

    private Integer entrypointMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint_resources")

    private Object entrypointResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submission_id")

    private String submissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_env")

    private RuntimeEnv runtimeEnv;

    public RayJobConfig withEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    /**
     * 运行作业主脚本
     * @return entrypoint
     */
    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public RayJobConfig withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 用户提供的元数据
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public RayJobConfig withEntrypointNumCpus(Double entrypointNumCpus) {
        this.entrypointNumCpus = entrypointNumCpus;
        return this;
    }

    /**
     * 执行命令的CPU数量
     * @return entrypointNumCpus
     */
    public Double getEntrypointNumCpus() {
        return entrypointNumCpus;
    }

    public void setEntrypointNumCpus(Double entrypointNumCpus) {
        this.entrypointNumCpus = entrypointNumCpus;
    }

    public RayJobConfig withEntrypointNumGpus(Double entrypointNumGpus) {
        this.entrypointNumGpus = entrypointNumGpus;
        return this;
    }

    /**
     * 执行命令的GPU数量
     * @return entrypointNumGpus
     */
    public Double getEntrypointNumGpus() {
        return entrypointNumGpus;
    }

    public void setEntrypointNumGpus(Double entrypointNumGpus) {
        this.entrypointNumGpus = entrypointNumGpus;
    }

    public RayJobConfig withEntrypointMemory(Integer entrypointMemory) {
        this.entrypointMemory = entrypointMemory;
        return this;
    }

    /**
     * 执行命令的内存大小
     * @return entrypointMemory
     */
    public Integer getEntrypointMemory() {
        return entrypointMemory;
    }

    public void setEntrypointMemory(Integer entrypointMemory) {
        this.entrypointMemory = entrypointMemory;
    }

    public RayJobConfig withEntrypointResources(Object entrypointResources) {
        this.entrypointResources = entrypointResources;
        return this;
    }

    /**
     * 自定义资源数量
     * @return entrypointResources
     */
    public Object getEntrypointResources() {
        return entrypointResources;
    }

    public void setEntrypointResources(Object entrypointResources) {
        this.entrypointResources = entrypointResources;
    }

    public RayJobConfig withSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }

    /**
     * 为作业指定的可选submission_id。
     * @return submissionId
     */
    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public RayJobConfig withRuntimeEnv(RuntimeEnv runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
        return this;
    }

    public RayJobConfig withRuntimeEnv(Consumer<RuntimeEnv> runtimeEnvSetter) {
        if (this.runtimeEnv == null) {
            this.runtimeEnv = new RuntimeEnv();
            runtimeEnvSetter.accept(this.runtimeEnv);
        }

        return this;
    }

    /**
     * Get runtimeEnv
     * @return runtimeEnv
     */
    public RuntimeEnv getRuntimeEnv() {
        return runtimeEnv;
    }

    public void setRuntimeEnv(RuntimeEnv runtimeEnv) {
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
        RayJobConfig that = (RayJobConfig) obj;
        return Objects.equals(this.entrypoint, that.entrypoint) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.entrypointNumCpus, that.entrypointNumCpus)
            && Objects.equals(this.entrypointNumGpus, that.entrypointNumGpus)
            && Objects.equals(this.entrypointMemory, that.entrypointMemory)
            && Objects.equals(this.entrypointResources, that.entrypointResources)
            && Objects.equals(this.submissionId, that.submissionId) && Objects.equals(this.runtimeEnv, that.runtimeEnv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entrypoint,
            metadata,
            entrypointNumCpus,
            entrypointNumGpus,
            entrypointMemory,
            entrypointResources,
            submissionId,
            runtimeEnv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayJobConfig {\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    entrypointNumCpus: ").append(toIndentedString(entrypointNumCpus)).append("\n");
        sb.append("    entrypointNumGpus: ").append(toIndentedString(entrypointNumGpus)).append("\n");
        sb.append("    entrypointMemory: ").append(toIndentedString(entrypointMemory)).append("\n");
        sb.append("    entrypointResources: ").append(toIndentedString(entrypointResources)).append("\n");
        sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
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
