package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源统计数据返回体
 */
public class ResourceStatDataRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic")

    private String statistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    public ResourceStatDataRsp withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * 统计值
     * @return statistic
     */
    public String getStatistic() {
        return statistic;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public ResourceStatDataRsp withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 数据单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ResourceStatDataRsp withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 监控指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ResourceStatDataRsp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 监控资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceStatDataRsp withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 显卡id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceStatDataRsp resourceStatDataRsp = (ResourceStatDataRsp) o;
        return Objects.equals(this.statistic, resourceStatDataRsp.statistic)
            && Objects.equals(this.unit, resourceStatDataRsp.unit)
            && Objects.equals(this.metricName, resourceStatDataRsp.metricName)
            && Objects.equals(this.resourceId, resourceStatDataRsp.resourceId)
            && Objects.equals(this.deviceId, resourceStatDataRsp.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statistic, unit, metricName, resourceId, deviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceStatDataRsp {\n");
        sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
