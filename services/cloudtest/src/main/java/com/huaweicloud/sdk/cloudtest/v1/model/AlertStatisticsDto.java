package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlertStatisticsDto
 */
public class AlertStatisticsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_alert_count")

    private Integer blockAlertCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_alert_count")

    private Integer exceptionAlertCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_alert_count")

    private Integer failAlertCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_time")

    private Long statisticsTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_alert_count")

    private Integer timeoutAlertCount;

    public AlertStatisticsDto withBlockAlertCount(Integer blockAlertCount) {
        this.blockAlertCount = blockAlertCount;
        return this;
    }

    /**
     * 阻塞告警次数
     * @return blockAlertCount
     */
    public Integer getBlockAlertCount() {
        return blockAlertCount;
    }

    public void setBlockAlertCount(Integer blockAlertCount) {
        this.blockAlertCount = blockAlertCount;
    }

    public AlertStatisticsDto withExceptionAlertCount(Integer exceptionAlertCount) {
        this.exceptionAlertCount = exceptionAlertCount;
        return this;
    }

    /**
     * 异常告警次数
     * @return exceptionAlertCount
     */
    public Integer getExceptionAlertCount() {
        return exceptionAlertCount;
    }

    public void setExceptionAlertCount(Integer exceptionAlertCount) {
        this.exceptionAlertCount = exceptionAlertCount;
    }

    public AlertStatisticsDto withFailAlertCount(Integer failAlertCount) {
        this.failAlertCount = failAlertCount;
        return this;
    }

    /**
     * 失败告警次数
     * @return failAlertCount
     */
    public Integer getFailAlertCount() {
        return failAlertCount;
    }

    public void setFailAlertCount(Integer failAlertCount) {
        this.failAlertCount = failAlertCount;
    }

    public AlertStatisticsDto withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public AlertStatisticsDto withStatisticsTime(Long statisticsTime) {
        this.statisticsTime = statisticsTime;
        return this;
    }

    /**
     * 统计时间
     * @return statisticsTime
     */
    public Long getStatisticsTime() {
        return statisticsTime;
    }

    public void setStatisticsTime(Long statisticsTime) {
        this.statisticsTime = statisticsTime;
    }

    public AlertStatisticsDto withTimeoutAlertCount(Integer timeoutAlertCount) {
        this.timeoutAlertCount = timeoutAlertCount;
        return this;
    }

    /**
     * 超时告警次数
     * @return timeoutAlertCount
     */
    public Integer getTimeoutAlertCount() {
        return timeoutAlertCount;
    }

    public void setTimeoutAlertCount(Integer timeoutAlertCount) {
        this.timeoutAlertCount = timeoutAlertCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertStatisticsDto that = (AlertStatisticsDto) obj;
        return Objects.equals(this.blockAlertCount, that.blockAlertCount)
            && Objects.equals(this.exceptionAlertCount, that.exceptionAlertCount)
            && Objects.equals(this.failAlertCount, that.failAlertCount)
            && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.statisticsTime, that.statisticsTime)
            && Objects.equals(this.timeoutAlertCount, that.timeoutAlertCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(blockAlertCount, exceptionAlertCount, failAlertCount, serviceId, statisticsTime, timeoutAlertCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertStatisticsDto {\n");
        sb.append("    blockAlertCount: ").append(toIndentedString(blockAlertCount)).append("\n");
        sb.append("    exceptionAlertCount: ").append(toIndentedString(exceptionAlertCount)).append("\n");
        sb.append("    failAlertCount: ").append(toIndentedString(failAlertCount)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    statisticsTime: ").append(toIndentedString(statisticsTime)).append("\n");
        sb.append("    timeoutAlertCount: ").append(toIndentedString(timeoutAlertCount)).append("\n");
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
