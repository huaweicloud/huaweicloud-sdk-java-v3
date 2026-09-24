package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray作业类型的配置信息。key为配置项名称，类型为String，value为配置项值，类型为Object。 **约束限制**：不涉及。
 */
public class RayJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint")

    private String entrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private InnerRayJobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_env")

    private RuntimeEnv runtimeEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private V2ImageBriefInfo image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config")

    private RayResourceConfig resourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rayjob_strategy")

    private RayJobStrategy rayjobStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    public RayJobConfig withEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    /**
     * **参数解释**：运行作业主脚本。 **约束限制**：不涉及。 **取值范围**：长度为1~102400个字符。 **默认取值**：不涉及。
     * @return entrypoint
     */
    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public RayJobConfig withJobConfig(InnerRayJobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public RayJobConfig withJobConfig(Consumer<InnerRayJobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new InnerRayJobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public InnerRayJobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(InnerRayJobConfig jobConfig) {
        this.jobConfig = jobConfig;
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

    public RayJobConfig withImage(V2ImageBriefInfo image) {
        this.image = image;
        return this;
    }

    public RayJobConfig withImage(Consumer<V2ImageBriefInfo> imageSetter) {
        if (this.image == null) {
            this.image = new V2ImageBriefInfo();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public V2ImageBriefInfo getImage() {
        return image;
    }

    public void setImage(V2ImageBriefInfo image) {
        this.image = image;
    }

    public RayJobConfig withResourceConfig(RayResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    public RayJobConfig withResourceConfig(Consumer<RayResourceConfig> resourceConfigSetter) {
        if (this.resourceConfig == null) {
            this.resourceConfig = new RayResourceConfig();
            resourceConfigSetter.accept(this.resourceConfig);
        }

        return this;
    }

    /**
     * Get resourceConfig
     * @return resourceConfig
     */
    public RayResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(RayResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public RayJobConfig withRayjobStrategy(RayJobStrategy rayjobStrategy) {
        this.rayjobStrategy = rayjobStrategy;
        return this;
    }

    public RayJobConfig withRayjobStrategy(Consumer<RayJobStrategy> rayjobStrategySetter) {
        if (this.rayjobStrategy == null) {
            this.rayjobStrategy = new RayJobStrategy();
            rayjobStrategySetter.accept(this.rayjobStrategy);
        }

        return this;
    }

    /**
     * Get rayjobStrategy
     * @return rayjobStrategy
     */
    public RayJobStrategy getRayjobStrategy() {
        return rayjobStrategy;
    }

    public void setRayjobStrategy(RayJobStrategy rayjobStrategy) {
        this.rayjobStrategy = rayjobStrategy;
    }

    public RayJobConfig withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public RayJobConfig putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public RayJobConfig withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * **参数解释**：用户自定义作业元数据（键值对）。 **约束限制**：键值对数量为0~255个。key和value的值不能为空，长度不超过255个字符 。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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
        return Objects.equals(this.entrypoint, that.entrypoint) && Objects.equals(this.jobConfig, that.jobConfig)
            && Objects.equals(this.runtimeEnv, that.runtimeEnv) && Objects.equals(this.image, that.image)
            && Objects.equals(this.resourceConfig, that.resourceConfig)
            && Objects.equals(this.rayjobStrategy, that.rayjobStrategy) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entrypoint, jobConfig, runtimeEnv, image, resourceConfig, rayjobStrategy, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayJobConfig {\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    runtimeEnv: ").append(toIndentedString(runtimeEnv)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
        sb.append("    rayjobStrategy: ").append(toIndentedString(rayjobStrategy)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
