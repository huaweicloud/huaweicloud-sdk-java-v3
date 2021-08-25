package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourcesPlan
 */
public class ResourcesPlan  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_type")
    
    
    private String periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_capacity")
    
    
    private Integer minCapacity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_capacity")
    
    
    private Integer maxCapacity;

    public ResourcesPlan withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 资源计划的周期类型，当前只允许以下类型：  daily
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    

    public ResourcesPlan withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 资源计划的起始时间，格式为“hour:minute”，表示时间在0:00-23:59之间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ResourcesPlan withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 资源计划的结束时间，格式与“start_time”相同，不早于start_time表示的时间，且与start_time间隔不小于30min。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ResourcesPlan withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    


    /**
     * 资源计划内该节点组的最小保留节点数。  取值范围：[0～500]
     * minimum: 0
     * maximum: 500
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    

    public ResourcesPlan withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    


    /**
     * 资源计划内该节点组的最大保留节点数。  取值范围：[0～500]
     * minimum: 0
     * maximum: 500
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesPlan resourcesPlan = (ResourcesPlan) o;
        return Objects.equals(this.periodType, resourcesPlan.periodType) &&
            Objects.equals(this.startTime, resourcesPlan.startTime) &&
            Objects.equals(this.endTime, resourcesPlan.endTime) &&
            Objects.equals(this.minCapacity, resourcesPlan.minCapacity) &&
            Objects.equals(this.maxCapacity, resourcesPlan.maxCapacity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(periodType, startTime, endTime, minCapacity, maxCapacity);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesPlan {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    minCapacity: ").append(toIndentedString(minCapacity)).append("\n");
        sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
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

