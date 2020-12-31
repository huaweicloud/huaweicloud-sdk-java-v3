package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 统计结果
 */
public class StatisticValue  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistic")
    
    private String statistic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private Double value;

    public StatisticValue withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    


    /**
     * 统计方式。
     * @return statistic
     */
    public String getStatistic() {
        return statistic;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public StatisticValue withValue(Double value) {
        this.value = value;
        return this;
    }

    


    /**
     * 统计结果。
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
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
        StatisticValue statisticValue = (StatisticValue) o;
        return Objects.equals(this.statistic, statisticValue.statistic) &&
            Objects.equals(this.value, statisticValue.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(statistic, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticValue {\n");
        sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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

