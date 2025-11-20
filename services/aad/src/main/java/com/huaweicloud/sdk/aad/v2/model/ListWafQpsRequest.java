package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWafQpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private String domains;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent")

    private String recent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overseas_type")

    private Integer overseasType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListWafQpsRequest withDomains(String domains) {
        this.domains = domains;
        return this;
    }

    /**
     * 不传时代表全部域名
     * @return domains
     */
    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }

    public ListWafQpsRequest withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 用于 QPS、带宽: 平均值 mean、峰值 peak;用于 响应状态码: 源站返回值 source 、高防返回值 proxy
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public ListWafQpsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（毫秒时间戳）
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListWafQpsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间（毫秒时间戳）
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListWafQpsRequest withRecent(String recent) {
        this.recent = recent;
        return this;
    }

    /**
     * 枚举值：yesterday,today,3days,1week,1month 与开始结束时间不同时为空
     * @return recent
     */
    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    public ListWafQpsRequest withOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
        return this;
    }

    /**
     * 实例类型，0-大陆，1-海外
     * @return overseasType
     */
    public Integer getOverseasType() {
        return overseasType;
    }

    public void setOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
    }

    public ListWafQpsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制条数
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListWafQpsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWafQpsRequest that = (ListWafQpsRequest) obj;
        return Objects.equals(this.domains, that.domains) && Objects.equals(this.valueType, that.valueType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.recent, that.recent) && Objects.equals(this.overseasType, that.overseasType)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domains, valueType, startTime, endTime, recent, overseasType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWafQpsRequest {\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    overseasType: ").append(toIndentedString(overseasType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
