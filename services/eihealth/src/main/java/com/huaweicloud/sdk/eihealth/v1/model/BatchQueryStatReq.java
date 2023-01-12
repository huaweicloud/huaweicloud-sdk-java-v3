package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchQueryStatReq
 */
public class BatchQueryStatReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_time")

    private Long fromTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_time")

    private Long toTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private MonitorPeriod period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private MonitorMethod method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    public BatchQueryStatReq withFromTime(Long fromTime) {
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

    public BatchQueryStatReq withToTime(Long toTime) {
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

    public BatchQueryStatReq withPeriod(MonitorPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Get period
     * @return period
     */
    public MonitorPeriod getPeriod() {
        return period;
    }

    public void setPeriod(MonitorPeriod period) {
        this.period = period;
    }

    public BatchQueryStatReq withMethod(MonitorMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get method
     * @return method
     */
    public MonitorMethod getMethod() {
        return method;
    }

    public void setMethod(MonitorMethod method) {
        this.method = method;
    }

    public BatchQueryStatReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public BatchQueryStatReq addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public BatchQueryStatReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 查询的监控资源对象id集合
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchQueryStatReq batchQueryStatReq = (BatchQueryStatReq) o;
        return Objects.equals(this.fromTime, batchQueryStatReq.fromTime)
            && Objects.equals(this.toTime, batchQueryStatReq.toTime)
            && Objects.equals(this.period, batchQueryStatReq.period)
            && Objects.equals(this.method, batchQueryStatReq.method)
            && Objects.equals(this.resourceIds, batchQueryStatReq.resourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromTime, toTime, period, method, resourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchQueryStatReq {\n");
        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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
