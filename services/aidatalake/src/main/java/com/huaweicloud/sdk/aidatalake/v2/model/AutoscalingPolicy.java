package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：自动调优配置，用于控制Flink作业自动调优行为。 **约束限制**：不涉及。
 */
public class AutoscalingPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertex_max_parallelism")

    private Integer vertexMaxParallelism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_cpu")

    private Integer quotaCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_memory")

    private Long quotaMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_config")

    private Map<String, String> customConfig = null;

    public AutoscalingPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**：自动调优开关。 **约束限制**：不涉及。 **取值范围**：   - true：开启自动调优。   - false：关闭自动调优。 **默认取值**：false。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AutoscalingPolicy withVertexMaxParallelism(Integer vertexMaxParallelism) {
        this.vertexMaxParallelism = vertexMaxParallelism;
        return this;
    }

    /**
     * **参数解释**：算子最大并行度。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：1000。
     * minimum: 1
     * maximum: 1000
     * @return vertexMaxParallelism
     */
    public Integer getVertexMaxParallelism() {
        return vertexMaxParallelism;
    }

    public void setVertexMaxParallelism(Integer vertexMaxParallelism) {
        this.vertexMaxParallelism = vertexMaxParallelism;
    }

    public AutoscalingPolicy withQuotaCpu(Integer quotaCpu) {
        this.quotaCpu = quotaCpu;
        return this;
    }

    /**
     * **参数解释**：CPU配额（单位：毫核）。 **约束限制**：不涉及。 **取值范围**：500~40000000。 **默认取值**：16000。
     * minimum: 500
     * maximum: 40000000
     * @return quotaCpu
     */
    public Integer getQuotaCpu() {
        return quotaCpu;
    }

    public void setQuotaCpu(Integer quotaCpu) {
        this.quotaCpu = quotaCpu;
    }

    public AutoscalingPolicy withQuotaMemory(Long quotaMemory) {
        this.quotaMemory = quotaMemory;
        return this;
    }

    /**
     * **参数解释**：内存配额（单位：MB）。 **约束限制**：不涉及。 **取值范围**：2048~81920000。 **默认取值**：65536。
     * minimum: 2048
     * maximum: 81920000
     * @return quotaMemory
     */
    public Long getQuotaMemory() {
        return quotaMemory;
    }

    public void setQuotaMemory(Long quotaMemory) {
        this.quotaMemory = quotaMemory;
    }

    public AutoscalingPolicy withCustomConfig(Map<String, String> customConfig) {
        this.customConfig = customConfig;
        return this;
    }

    public AutoscalingPolicy putCustomConfigItem(String key, String customConfigItem) {
        if (this.customConfig == null) {
            this.customConfig = new HashMap<>();
        }
        this.customConfig.put(key, customConfigItem);
        return this;
    }

    public AutoscalingPolicy withCustomConfig(Consumer<Map<String, String>> customConfigSetter) {
        if (this.customConfig == null) {
            this.customConfig = new HashMap<>();
        }
        customConfigSetter.accept(this.customConfig);
        return this;
    }

    /**
     * **参数解释**：用户自定义的自动调优配置参数，为键值对形式，传入Flink Kubernetes Operator支持的job.autoscaler.*参数。最多支持50个参数，每个值长度为1~1024个字符。 **约束限制**：采用全量替换模式，传入该字段时以本次传入内容为准；不传该字段时不修改自定义自动调优配置。参数名必须以job.autoscaler.开头。结构化字段同名键（job.autoscaler.enabled、job.autoscaler.vertex.max-parallelism、job.autoscaler.quota.cpu、job.autoscaler.quota.memory）配置不生效。
     * @return customConfig
     */
    public Map<String, String> getCustomConfig() {
        return customConfig;
    }

    public void setCustomConfig(Map<String, String> customConfig) {
        this.customConfig = customConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoscalingPolicy that = (AutoscalingPolicy) obj;
        return Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.vertexMaxParallelism, that.vertexMaxParallelism)
            && Objects.equals(this.quotaCpu, that.quotaCpu) && Objects.equals(this.quotaMemory, that.quotaMemory)
            && Objects.equals(this.customConfig, that.customConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, vertexMaxParallelism, quotaCpu, quotaMemory, customConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoscalingPolicy {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    vertexMaxParallelism: ").append(toIndentedString(vertexMaxParallelism)).append("\n");
        sb.append("    quotaCpu: ").append(toIndentedString(quotaCpu)).append("\n");
        sb.append("    quotaMemory: ").append(toIndentedString(quotaMemory)).append("\n");
        sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
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
