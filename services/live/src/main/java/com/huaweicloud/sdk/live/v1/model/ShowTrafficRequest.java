package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowTrafficRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step")
    
    private Integer step;

    public ShowTrafficRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 播放域名，不指定域名表示查询租户所有域名汇总流量
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public ShowTrafficRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 查询起始时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ShowTrafficRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 查询结束时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ。  - start_time与end_time均不存在时，服务端从最近一个统计周期的数据里查询。 - start_time存在、end_time不存在时，end_time取当前时间。 - start_time不存在、end_time存在时，请求非法。 - 只能查询最近三个月内的数据，start_time和end_time的跨度不能大于30天。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ShowTrafficRequest withStep(Integer step) {
        this.step = step;
        return this;
    }

    


    /**
     * 统计周期，单位分钟
     * minimum: 1
     * maximum: 9223372036854775807
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTrafficRequest showTrafficRequest = (ShowTrafficRequest) o;
        return Objects.equals(this.domain, showTrafficRequest.domain) &&
            Objects.equals(this.startTime, showTrafficRequest.startTime) &&
            Objects.equals(this.endTime, showTrafficRequest.endTime) &&
            Objects.equals(this.step, showTrafficRequest.step);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, startTime, endTime, step);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrafficRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

