package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowCdnStatisticsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Authorization")
    
    private String authorization;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Sdk-Date")
    
    private String xSdkDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stat_type")
    
    private String statType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interval")
    
    private Integer interval;

    public ShowCdnStatisticsRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    


    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    

    public ShowCdnStatisticsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    


    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    

    public ShowCdnStatisticsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 起始时间，格式为yyyymmddhhmmss。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ShowCdnStatisticsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间，格式为yyyymmddhhmmss。  - “**start_time**”、“**end_time**”均不存在时，“**start_time**”取当天零点，“end_time”取当前时间。  - “**start_time**”不存在、“**end_time**”存在，请求非法。  - “**start_time**”存在、“**end_time**”不存在，“**end_time**”取当前时间。  - 只能查询最近三个月内的数据，且时间跨度不能超过31天。  - 起始时间和结束时间会自动规整，起始时间规整为指定时间所在的整点时刻，结束时间规整为指定时间所在时间的下一小时整点时刻。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ShowCdnStatisticsRequest withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    


    /**
     * 统计数据类型。  取值如下： - cdn_bw：CDN峰值带宽 - cdn_flux：CDN流量 - req_num：请求总数 - req_hit_rate：请求命中率 - flux_hit_rate：流量命中率  每次只能查询一种统计数据。
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    

    public ShowCdnStatisticsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 域名列表，多个域名以逗号（半角）分隔。  示例：example.test1.com,example.test2.com。  ALL表示查询名下全部域名。一次最多查询100个域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public ShowCdnStatisticsRequest withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * 查询粒度间隔。  取值如下： - 时间跨度1天：5分钟、1小时、4小时、8小时，分别对应300秒、3600秒、14400秒和28800秒。 - 时间跨度2~7天：1小时、4小时、8小时、1天，分别对应3600秒、14400秒、28800秒和86400秒。 - 时间跨度8~31天：4小时、8小时、1天，分别对应14400秒、28800秒和86400秒。  单位：秒。  若不设置，默认取对应时间跨度的最小间隔。
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCdnStatisticsRequest showCdnStatisticsRequest = (ShowCdnStatisticsRequest) o;
        return Objects.equals(this.authorization, showCdnStatisticsRequest.authorization) &&
            Objects.equals(this.xSdkDate, showCdnStatisticsRequest.xSdkDate) &&
            Objects.equals(this.startTime, showCdnStatisticsRequest.startTime) &&
            Objects.equals(this.endTime, showCdnStatisticsRequest.endTime) &&
            Objects.equals(this.statType, showCdnStatisticsRequest.statType) &&
            Objects.equals(this.domain, showCdnStatisticsRequest.domain) &&
            Objects.equals(this.interval, showCdnStatisticsRequest.interval);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, startTime, endTime, statType, domain, interval);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCdnStatisticsRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

