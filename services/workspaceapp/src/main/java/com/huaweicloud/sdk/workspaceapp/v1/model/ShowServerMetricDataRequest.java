package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowServerMetricDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    public ShowServerMetricDataRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器唯一标识。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ShowServerMetricDataRequest withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 监控开始时间：由日期加时间组成，UTC格式，例如“2021-05-11T11:45:42.000Z”。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ShowServerMetricDataRequest withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 监控结束时间：由日期加时间组成，UTC格式，例如“2021-05-11T11:45:42.000Z”。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ShowServerMetricDataRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 监控查询指标：例如 \"cpu_util\"，详情见下表；当metric_name为空时，为批量查询。| 指标                                  | 指标名称          | 测量对象     | 监控周期 || ------------------------------------- | ----------------- | ------------ | -------- || cpu_util                              | CPU使用率         | 弹性云服务器 | 5分钟    || mem_util                              | 内存使用率        | 弹性云服务器 | 5分钟    || disk_util_inband                      | 磁盘使用率        | 弹性云服务器 | 5分钟    || disk_read_bytes_rate                  | 磁盘读带宽        | 弹性云服务器 | 5分钟    || disk_write_bytes_rate                 | 磁盘写带宽        | 弹性云服务器 | 5分钟    || disk_read_requests_rate               | 磁盘读IOPS        | 弹性云服务器 | 5分钟    || disk_write_requests_rate              | 磁盘写IOPS        | 弹性云服务器 | 5分钟    || network_incoming_bytes_rate_inband    | 带内网络流入速率  | 弹性云服务器 | 5分钟    || network_outgoing_bytes_rate_inband    | 带内网络流出速率  | 弹性云服务器 | 5分钟    || network_incoming_bytes_aggregate_rate | 带外网络流入速率  | 弹性云服务器 | 5分钟    || network_outgoing_bytes_aggregate_rate | 带外网络流出速率  | 弹性云服务器 | 5分钟    |
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerMetricDataRequest that = (ShowServerMetricDataRequest) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.metricName, that.metricName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, startTime, endTime, metricName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerMetricDataRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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
