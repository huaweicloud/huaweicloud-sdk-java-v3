package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：自动扩缩的配置。 **约束限制**：不涉及。
 */
public class AutoscalingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ongoing_requests")

    private Integer targetOngoingRequests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_replicas")

    private Integer minReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replicas")

    private Integer maxReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_replicas")

    private Integer initialReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upscale_delay_s")

    private Integer upscaleDelayS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downscale_delay_s")

    private Integer downscaleDelayS;

    public AutoscalingConfig withTargetOngoingRequests(Integer targetOngoingRequests) {
        this.targetOngoingRequests = targetOngoingRequests;
        return this;
    }

    /**
     * **参数解释**：每个副本单位时间能提供的平均请求数。 **约束限制**：不涉及。 **取值范围**：[1,1000]。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 1000
     * @return targetOngoingRequests
     */
    public Integer getTargetOngoingRequests() {
        return targetOngoingRequests;
    }

    public void setTargetOngoingRequests(Integer targetOngoingRequests) {
        this.targetOngoingRequests = targetOngoingRequests;
    }

    public AutoscalingConfig withMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
        return this;
    }

    /**
     * **参数解释**：最小副本数。 **约束限制**：不涉及。 **取值范围**：[0,1000]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 1000
     * @return minReplicas
     */
    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public AutoscalingConfig withMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
        return this;
    }

    /**
     * **参数解释**：最大副本数。 **约束限制**：不涉及。 **取值范围**：[0,1000]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 1000
     * @return maxReplicas
     */
    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public AutoscalingConfig withInitialReplicas(Integer initialReplicas) {
        this.initialReplicas = initialReplicas;
        return this;
    }

    /**
     * **参数解释**：初始副本数。 **约束限制**：不涉及。 **取值范围**：[0,1000]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 1000
     * @return initialReplicas
     */
    public Integer getInitialReplicas() {
        return initialReplicas;
    }

    public void setInitialReplicas(Integer initialReplicas) {
        this.initialReplicas = initialReplicas;
    }

    public AutoscalingConfig withUpscaleDelayS(Integer upscaleDelayS) {
        this.upscaleDelayS = upscaleDelayS;
        return this;
    }

    /**
     * **参数解释**：扩容之前的等待时间。 **约束限制**：不涉及。 **取值范围**：[0,86400]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 86400
     * @return upscaleDelayS
     */
    public Integer getUpscaleDelayS() {
        return upscaleDelayS;
    }

    public void setUpscaleDelayS(Integer upscaleDelayS) {
        this.upscaleDelayS = upscaleDelayS;
    }

    public AutoscalingConfig withDownscaleDelayS(Integer downscaleDelayS) {
        this.downscaleDelayS = downscaleDelayS;
        return this;
    }

    /**
     * **参数解释**：缩容之前的等待时间。 **约束限制**：不涉及。 **取值范围**：[0,86400]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 86400
     * @return downscaleDelayS
     */
    public Integer getDownscaleDelayS() {
        return downscaleDelayS;
    }

    public void setDownscaleDelayS(Integer downscaleDelayS) {
        this.downscaleDelayS = downscaleDelayS;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoscalingConfig that = (AutoscalingConfig) obj;
        return Objects.equals(this.targetOngoingRequests, that.targetOngoingRequests)
            && Objects.equals(this.minReplicas, that.minReplicas) && Objects.equals(this.maxReplicas, that.maxReplicas)
            && Objects.equals(this.initialReplicas, that.initialReplicas)
            && Objects.equals(this.upscaleDelayS, that.upscaleDelayS)
            && Objects.equals(this.downscaleDelayS, that.downscaleDelayS);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(targetOngoingRequests, minReplicas, maxReplicas, initialReplicas, upscaleDelayS, downscaleDelayS);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoscalingConfig {\n");
        sb.append("    targetOngoingRequests: ").append(toIndentedString(targetOngoingRequests)).append("\n");
        sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
        sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
        sb.append("    initialReplicas: ").append(toIndentedString(initialReplicas)).append("\n");
        sb.append("    upscaleDelayS: ").append(toIndentedString(upscaleDelayS)).append("\n");
        sb.append("    downscaleDelayS: ").append(toIndentedString(downscaleDelayS)).append("\n");
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
