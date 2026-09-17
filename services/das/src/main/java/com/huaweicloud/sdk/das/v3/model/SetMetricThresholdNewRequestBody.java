package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置指标阈值请求体
 */
public class SetMetricThresholdNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_code")

    private String metricCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_threshold")

    private Double newThreshold;

    public SetMetricThresholdNewRequestBody withMetricCode(String metricCode) {
        this.metricCode = metricCode;
        return this;
    }

    /**
     * 指标码
     * @return metricCode
     */
    public String getMetricCode() {
        return metricCode;
    }

    public void setMetricCode(String metricCode) {
        this.metricCode = metricCode;
    }

    public SetMetricThresholdNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public SetMetricThresholdNewRequestBody withNewThreshold(Double newThreshold) {
        this.newThreshold = newThreshold;
        return this;
    }

    /**
     * 新阈值
     * @return newThreshold
     */
    public Double getNewThreshold() {
        return newThreshold;
    }

    public void setNewThreshold(Double newThreshold) {
        this.newThreshold = newThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetMetricThresholdNewRequestBody that = (SetMetricThresholdNewRequestBody) obj;
        return Objects.equals(this.metricCode, that.metricCode) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.newThreshold, that.newThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricCode, engineType, newThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetMetricThresholdNewRequestBody {\n");
        sb.append("    metricCode: ").append(toIndentedString(metricCode)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    newThreshold: ").append(toIndentedString(newThreshold)).append("\n");
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
