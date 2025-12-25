package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 状态指标
 */
public class StatusMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Long enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Long disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private Long error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_percentage")

    private Boolean isPercentage;

    public StatusMetric withEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 已开启的数量
     * minimum: 0
     * maximum: -9223372036854775616
     * @return enabled
     */
    public Long getEnabled() {
        return enabled;
    }

    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    public StatusMetric withDisabled(Long disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 未开启的数量
     * minimum: 0
     * maximum: -9223372036854775616
     * @return disabled
     */
    public Long getDisabled() {
        return disabled;
    }

    public void setDisabled(Long disabled) {
        this.disabled = disabled;
    }

    public StatusMetric withError(Long error) {
        this.error = error;
        return this;
    }

    /**
     * 错误的数量
     * minimum: 0
     * maximum: -9223372036854775616
     * @return error
     */
    public Long getError() {
        return error;
    }

    public void setError(Long error) {
        this.error = error;
    }

    public StatusMetric withIsPercentage(Boolean isPercentage) {
        this.isPercentage = isPercentage;
        return this;
    }

    /**
     * 是否百分比
     * @return isPercentage
     */
    public Boolean getIsPercentage() {
        return isPercentage;
    }

    public void setIsPercentage(Boolean isPercentage) {
        this.isPercentage = isPercentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusMetric that = (StatusMetric) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.error, that.error) && Objects.equals(this.isPercentage, that.isPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, disabled, error, isPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusMetric {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    isPercentage: ").append(toIndentedString(isPercentage)).append("\n");
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
