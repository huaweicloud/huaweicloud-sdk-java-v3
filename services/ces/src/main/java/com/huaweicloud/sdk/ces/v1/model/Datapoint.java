package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class Datapoint  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="average")
    
    private Double average;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    private String unit;

    public Datapoint withAverage(Double average) {
        this.average = average;
        return this;
    }

    


    /**
     * 指标值，该字段名称与请求参数中filter使用的查询值相同。
     * @return average
     */
    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Datapoint withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 指标采集时间。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Datapoint withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 指标单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Datapoint datapoint = (Datapoint) o;
        return Objects.equals(this.average, datapoint.average) &&
            Objects.equals(this.timestamp, datapoint.timestamp) &&
            Objects.equals(this.unit, datapoint.unit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(average, timestamp, unit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Datapoint {\n");
            sb.append("    average: ").append(toIndentedString(average)).append("\n");
            sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
            sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

