package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowResourceMetricDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_time")

    private Long fromTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_time")

    private Long toTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    public ShowResourceMetricDataRequest withFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * 查询监控数据起始时间，UNIX时间戳，单位毫秒，不填时默认为当前时间
     * @return fromTime
     */
    public Long getFromTime() {
        return fromTime;
    }

    public void setFromTime(Long fromTime) {
        this.fromTime = fromTime;
    }

    public ShowResourceMetricDataRequest withToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * 查询数据截止时间，UNIX时间戳，单位毫秒，不填时默认为当前时间
     * @return toTime
     */
    public Long getToTime() {
        return toTime;
    }

    public void setToTime(Long toTime) {
        this.toTime = toTime;
    }

    public ShowResourceMetricDataRequest withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 监控数据周期。枚举值，取值范围：real_time（实时数据）、five_minutes（5分钟粒度）、fifteen_to_twenty_minutes（15-20分钟粒度）、one_hour（1小时粒度），不填时默认为real_time
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ShowResourceMetricDataRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 统计方法。枚举值，取值范围：max（最大值）、min（最小值）、average（平均值），不填时默认为max
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ShowResourceMetricDataRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 查询的监控指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowResourceMetricDataRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 查询的监控资源对象id，当查询存储资源和计算节点资源中的集群监控数据时，不需要填写资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowResourceMetricDataRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 显卡id，仅查询裸金属节点的gpu监控时，需要指定
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceMetricDataRequest that = (ShowResourceMetricDataRequest) obj;
        return Objects.equals(this.fromTime, that.fromTime) && Objects.equals(this.toTime, that.toTime)
            && Objects.equals(this.period, that.period) && Objects.equals(this.method, that.method)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.deviceId, that.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromTime, toTime, period, method, metricName, resourceId, deviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceMetricDataRequest {\n");
        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
