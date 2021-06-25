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

    public ShowCdnStatisticsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 开始时间 
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
     * 结束时间 
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
     * 支持的参数类型 cdn_bw：CDN峰值带宽cdn_flux：CDN流量req_num：请求总数req_hit_rate：请求命中率flux_hit_rate：流量命中率 
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
     * 域名列表，多个域名以逗号（半角）分隔 
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
     * 采样间隔，单位：秒，取值说明： 时间跨度1天：5分钟、1小时、4小时、8小时，分别对应300秒、3600秒、14400秒和28800秒。 时间跨度2~7天：1小时、4小时、8小时、1天，分别对应3600秒、14400秒、28800秒和86400秒。 时间跨度8~31天：4小时、8小时、1天，分别对应14400秒、28800秒和86400秒。 如果不传，默认取对应时间跨度的最小间隔。 
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
        return Objects.equals(this.startTime, showCdnStatisticsRequest.startTime) &&
            Objects.equals(this.endTime, showCdnStatisticsRequest.endTime) &&
            Objects.equals(this.statType, showCdnStatisticsRequest.statType) &&
            Objects.equals(this.domain, showCdnStatisticsRequest.domain) &&
            Objects.equals(this.interval, showCdnStatisticsRequest.interval);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, statType, domain, interval);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCdnStatisticsRequest {\n");
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

