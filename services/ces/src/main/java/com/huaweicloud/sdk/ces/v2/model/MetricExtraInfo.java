package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 告警策略附加信息。     **约束限制**： 不涉及。 
 */
public class MetricExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_metric_name")

    private String originMetricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_prefix")

    private String metricPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_proc_name")

    private String customProcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_type")

    private String metricType;

    public MetricExtraInfo withOriginMetricName(String originMetricName) {
        this.originMetricName = originMetricName;
        return this;
    }

    /**
     * **参数解释**： 原始指标名称。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,4096]个字符。          **默认取值**： 不涉及。 
     * @return originMetricName
     */
    public String getOriginMetricName() {
        return originMetricName;
    }

    public void setOriginMetricName(String originMetricName) {
        this.originMetricName = originMetricName;
    }

    public MetricExtraInfo withMetricPrefix(String metricPrefix) {
        this.metricPrefix = metricPrefix;
        return this;
    }

    /**
     * **参数解释**： 指标名称前缀。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,4096]个字符。          **默认取值**： 不涉及。 
     * @return metricPrefix
     */
    public String getMetricPrefix() {
        return metricPrefix;
    }

    public void setMetricPrefix(String metricPrefix) {
        this.metricPrefix = metricPrefix;
    }

    public MetricExtraInfo withCustomProcName(String customProcName) {
        this.customProcName = customProcName;
        return this;
    }

    /**
     * **参数解释**： 用户进程名称。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,250]个字符。          **默认取值**： 不涉及。 
     * @return customProcName
     */
    public String getCustomProcName() {
        return customProcName;
    }

    public void setCustomProcName(String customProcName) {
        this.customProcName = customProcName;
    }

    public MetricExtraInfo withMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }

    /**
     * **参数解释**： 指标类型。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,32]个字符。          **默认取值**： 不涉及。 
     * @return metricType
     */
    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricExtraInfo that = (MetricExtraInfo) obj;
        return Objects.equals(this.originMetricName, that.originMetricName)
            && Objects.equals(this.metricPrefix, that.metricPrefix)
            && Objects.equals(this.customProcName, that.customProcName)
            && Objects.equals(this.metricType, that.metricType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originMetricName, metricPrefix, customProcName, metricType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricExtraInfo {\n");
        sb.append("    originMetricName: ").append(toIndentedString(originMetricName)).append("\n");
        sb.append("    metricPrefix: ").append(toIndentedString(metricPrefix)).append("\n");
        sb.append("    customProcName: ").append(toIndentedString(customProcName)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
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
