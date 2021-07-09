package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCdnStatisticsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interval")
    
    private Integer interval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private List<Long> values = null;
    
    public ShowCdnStatisticsResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 统计起始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ShowCdnStatisticsResponse withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * 统计间隔。
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    

    public ShowCdnStatisticsResponse withValues(List<Long> values) {
        this.values = values;
        return this;
    }

    
    public ShowCdnStatisticsResponse addValuesItem(Long valuesItem) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ShowCdnStatisticsResponse withValues(Consumer<List<Long>> valuesSetter) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 采样数据数组。  从start_time开始，每个间隔对应一个采样数据。
     * @return values
     */
    public List<Long> getValues() {
        return values;
    }

    public void setValues(List<Long> values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCdnStatisticsResponse showCdnStatisticsResponse = (ShowCdnStatisticsResponse) o;
        return Objects.equals(this.startTime, showCdnStatisticsResponse.startTime) &&
            Objects.equals(this.interval, showCdnStatisticsResponse.interval) &&
            Objects.equals(this.values, showCdnStatisticsResponse.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, interval, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCdnStatisticsResponse {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

