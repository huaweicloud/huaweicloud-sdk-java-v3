package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 指标信息
 */
public class ExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_metric_name")

    private String originMetricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_prefix")

    private String metricPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_type")

    private String metricType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_proc_name")

    private String customProcName;

    public ExtraInfo withOriginMetricName(String originMetricName) {
        this.originMetricName = originMetricName;
        return this;
    }

    /**
     * 指标名称
     * @return originMetricName
     */
    public String getOriginMetricName() {
        return originMetricName;
    }

    public void setOriginMetricName(String originMetricName) {
        this.originMetricName = originMetricName;
    }

    public ExtraInfo withMetricPrefix(String metricPrefix) {
        this.metricPrefix = metricPrefix;
        return this;
    }

    /**
     * 指标名称前缀
     * @return metricPrefix
     */
    public String getMetricPrefix() {
        return metricPrefix;
    }

    public void setMetricPrefix(String metricPrefix) {
        this.metricPrefix = metricPrefix;
    }

    public ExtraInfo withMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }

    /**
     * 指标类型
     * @return metricType
     */
    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public ExtraInfo withCustomProcName(String customProcName) {
        this.customProcName = customProcName;
        return this;
    }

    /**
     * 自定义进程名称
     * @return customProcName
     */
    public String getCustomProcName() {
        return customProcName;
    }

    public void setCustomProcName(String customProcName) {
        this.customProcName = customProcName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtraInfo that = (ExtraInfo) obj;
        return Objects.equals(this.originMetricName, that.originMetricName)
            && Objects.equals(this.metricPrefix, that.metricPrefix) && Objects.equals(this.metricType, that.metricType)
            && Objects.equals(this.customProcName, that.customProcName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originMetricName, metricPrefix, metricType, customProcName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraInfo {\n");
        sb.append("    originMetricName: ").append(toIndentedString(originMetricName)).append("\n");
        sb.append("    metricPrefix: ").append(toIndentedString(metricPrefix)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    customProcName: ").append(toIndentedString(customProcName)).append("\n");
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
