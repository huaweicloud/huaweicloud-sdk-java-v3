package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 伸缩策略高级配置。
 */
public class ScaleConfigurationDataAdvanced {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaledown_stabilization_seconds")

    private Integer scaledownStabilizationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaledown_rate")

    private Integer scaledownRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleup_stabilization_seconds")

    private Integer scaleupStabilizationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleup_rate")

    private Integer scaleupRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_scaledown")

    private Boolean disableScaledown;

    public ScaleConfigurationDataAdvanced withScaledownStabilizationSeconds(Integer scaledownStabilizationSeconds) {
        this.scaledownStabilizationSeconds = scaledownStabilizationSeconds;
        return this;
    }

    /**
     * 缩容冷却时间窗。
     * @return scaledownStabilizationSeconds
     */
    public Integer getScaledownStabilizationSeconds() {
        return scaledownStabilizationSeconds;
    }

    public void setScaledownStabilizationSeconds(Integer scaledownStabilizationSeconds) {
        this.scaledownStabilizationSeconds = scaledownStabilizationSeconds;
    }

    public ScaleConfigurationDataAdvanced withScaledownRate(Integer scaledownRate) {
        this.scaledownRate = scaledownRate;
        return this;
    }

    /**
     * 缩容步长。
     * @return scaledownRate
     */
    public Integer getScaledownRate() {
        return scaledownRate;
    }

    public void setScaledownRate(Integer scaledownRate) {
        this.scaledownRate = scaledownRate;
    }

    public ScaleConfigurationDataAdvanced withScaleupStabilizationSeconds(Integer scaleupStabilizationSeconds) {
        this.scaleupStabilizationSeconds = scaleupStabilizationSeconds;
        return this;
    }

    /**
     * 扩容冷却时间窗。
     * @return scaleupStabilizationSeconds
     */
    public Integer getScaleupStabilizationSeconds() {
        return scaleupStabilizationSeconds;
    }

    public void setScaleupStabilizationSeconds(Integer scaleupStabilizationSeconds) {
        this.scaleupStabilizationSeconds = scaleupStabilizationSeconds;
    }

    public ScaleConfigurationDataAdvanced withScaleupRate(Integer scaleupRate) {
        this.scaleupRate = scaleupRate;
        return this;
    }

    /**
     * 扩容步长。
     * @return scaleupRate
     */
    public Integer getScaleupRate() {
        return scaleupRate;
    }

    public void setScaleupRate(Integer scaleupRate) {
        this.scaleupRate = scaleupRate;
    }

    public ScaleConfigurationDataAdvanced withDisableScaledown(Boolean disableScaledown) {
        this.disableScaledown = disableScaledown;
        return this;
    }

    /**
     * 是否禁用自动缩容。
     * @return disableScaledown
     */
    public Boolean getDisableScaledown() {
        return disableScaledown;
    }

    public void setDisableScaledown(Boolean disableScaledown) {
        this.disableScaledown = disableScaledown;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleConfigurationDataAdvanced that = (ScaleConfigurationDataAdvanced) obj;
        return Objects.equals(this.scaledownStabilizationSeconds, that.scaledownStabilizationSeconds)
            && Objects.equals(this.scaledownRate, that.scaledownRate)
            && Objects.equals(this.scaleupStabilizationSeconds, that.scaleupStabilizationSeconds)
            && Objects.equals(this.scaleupRate, that.scaleupRate)
            && Objects.equals(this.disableScaledown, that.disableScaledown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scaledownStabilizationSeconds,
            scaledownRate,
            scaleupStabilizationSeconds,
            scaleupRate,
            disableScaledown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleConfigurationDataAdvanced {\n");
        sb.append("    scaledownStabilizationSeconds: ")
            .append(toIndentedString(scaledownStabilizationSeconds))
            .append("\n");
        sb.append("    scaledownRate: ").append(toIndentedString(scaledownRate)).append("\n");
        sb.append("    scaleupStabilizationSeconds: ")
            .append(toIndentedString(scaleupStabilizationSeconds))
            .append("\n");
        sb.append("    scaleupRate: ").append(toIndentedString(scaleupRate)).append("\n");
        sb.append("    disableScaledown: ").append(toIndentedString(disableScaledown)).append("\n");
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
