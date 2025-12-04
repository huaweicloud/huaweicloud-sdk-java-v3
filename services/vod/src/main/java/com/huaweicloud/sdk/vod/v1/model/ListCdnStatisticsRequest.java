package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCdnStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    public ListCdnStatisticsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListCdnStatisticsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，格式为yyyymmddhhmmss。   - interval为300时，end_time设置为整5分钟时刻点，如：20240601000000。   - interval为3600时，end_time设置为整小时时刻点，如：20240601120000。   - interval为86400时，end_time设置为东8区零点时刻点，如：20240601000000。   - 只能查询最近三个月内的数据，且时间跨度不能超过31天。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListCdnStatisticsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式为yyyymmddhhmmss。   - interval为300时，end_time设置为整5分钟时刻点，如：20240601000000。   - interval为3600时，end_time设置为整小时时刻点，如：20240601120000。   - interval为86400时，end_time设置为东8区零点时刻点，如：20240601000000。   - 只能查询最近三个月内的数据，且时间跨度不能超过31天。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListCdnStatisticsRequest withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 统计数据类型。  取值如下： - bw：CDN峰值带宽 - flux：CDN流量 - req_num：请求总数 - req_hit_rate：请求命中率 - flux_hit_rate：流量命中率 - http_code_2xx 状态码汇总2xx - http_code_3xx 状态码汇总3xx - http_code_4xx 状态码汇总4xx - http_code_5xx 状态码汇总5xx  每次只能查询一种统计数据。
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ListCdnStatisticsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名列表，多个域名以逗号（半角）分隔。  示例：example.test1.com,example.test2.com。  ALL表示查询名下全部域名。一次最多查询20个域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListCdnStatisticsRequest withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 查询粒度间隔。  取值如下： - 300(5分钟)：最大查询跨度2天。 - 3600(1小时)：最大查询跨度7天。 - 86400(1天)：最大查询跨度31天，最少跨度为2天。  单位：秒。  若不设置，小于1天 300，大于1天小于7天3600，大于7天86400。
     * minimum: 0
     * maximum: 86400
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCdnStatisticsRequest that = (ListCdnStatisticsRequest) obj;
        return Objects.equals(this.xSdkDate, that.xSdkDate) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.interval, that.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSdkDate, startTime, endTime, statType, domain, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnStatisticsRequest {\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
