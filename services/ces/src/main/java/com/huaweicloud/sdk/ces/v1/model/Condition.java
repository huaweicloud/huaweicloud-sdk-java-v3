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
 * Condition
 */
public class Condition  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comparison_operator")
    
    private String comparisonOperator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="filter")
    
    private String filter;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    private String unit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private Integer value;

    public Condition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    


    /**
     * Get comparisonOperator
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Condition withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * Get count
     * minimum: 1
     * maximum: 5
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Condition withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    


    /**
     * Get filter
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Condition withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    


    /**
     * Get period
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Condition withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * Get unit
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Condition withValue(Integer value) {
        this.value = value;
        return this;
    }

    


    /**
     * Get value
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Condition condition = (Condition) o;
        return Objects.equals(this.comparisonOperator, condition.comparisonOperator) &&
            Objects.equals(this.count, condition.count) &&
            Objects.equals(this.filter, condition.filter) &&
            Objects.equals(this.period, condition.period) &&
            Objects.equals(this.unit, condition.unit) &&
            Objects.equals(this.value, condition.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(comparisonOperator, count, filter, period, unit, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
            sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    period: ").append(toIndentedString(period)).append("\n");
            sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

