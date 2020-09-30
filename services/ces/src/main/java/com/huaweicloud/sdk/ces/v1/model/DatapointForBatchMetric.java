package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class DatapointForBatchMetric  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="average")
    
    private Double average;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public DatapointForBatchMetric withAverage(Double average) {
        this.average = average;
        return this;
    }

    


    /**
     * 指标值，该字段名称与请求参数中filter使用的查询值相同；字段名称可为：max/min/average/sum/variance。
     * @return average
     */
    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public DatapointForBatchMetric withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 指标采集时间，UNIX时间戳，单位毫秒。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatapointForBatchMetric datapointForBatchMetric = (DatapointForBatchMetric) o;
        return Objects.equals(this.average, datapointForBatchMetric.average) &&
            Objects.equals(this.timestamp, datapointForBatchMetric.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(average, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatapointForBatchMetric {\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

