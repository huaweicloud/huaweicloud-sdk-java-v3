package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.MetricRequest3Dividend;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MetricRequest3
 */
public class MetricRequest3  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="date_range")
    
    private String dateRange;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_type")
    
    private String metricType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sprint_id")
    
    private String sprintId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dividend")
    
    private MetricRequest3Dividend dividend;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="divisor")
    
    private Object divisor;

    public MetricRequest3 withDateRange(String dateRange) {
        this.dateRange = dateRange;
        return this;
    }

    


    /**
     * 统计周期
     * @return dateRange
     */
    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    

    public MetricRequest3 withMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }

    


    /**
     * 指标类型
     * @return metricType
     */
    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    

    public MetricRequest3 withSprintId(String sprintId) {
        this.sprintId = sprintId;
        return this;
    }

    


    /**
     * 迭代ID
     * @return sprintId
     */
    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    

    public MetricRequest3 withDividend(MetricRequest3Dividend dividend) {
        this.dividend = dividend;
        return this;
    }

    public MetricRequest3 withDividend(Consumer<MetricRequest3Dividend> dividendSetter) {
        if(this.dividend == null ){
            this.dividend = new MetricRequest3Dividend();
            dividendSetter.accept(this.dividend);
        }
        
        return this;
    }


    /**
     * Get dividend
     * @return dividend
     */
    public MetricRequest3Dividend getDividend() {
        return dividend;
    }

    public void setDividend(MetricRequest3Dividend dividend) {
        this.dividend = dividend;
    }

    

    public MetricRequest3 withDivisor(Object divisor) {
        this.divisor = divisor;
        return this;
    }

    


    /**
     * 指标分母过滤条件
     * @return divisor
     */
    public Object getDivisor() {
        return divisor;
    }

    public void setDivisor(Object divisor) {
        this.divisor = divisor;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricRequest3 metricRequest3 = (MetricRequest3) o;
        return Objects.equals(this.dateRange, metricRequest3.dateRange) &&
            Objects.equals(this.metricType, metricRequest3.metricType) &&
            Objects.equals(this.sprintId, metricRequest3.sprintId) &&
            Objects.equals(this.dividend, metricRequest3.dividend) &&
            Objects.equals(this.divisor, metricRequest3.divisor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dateRange, metricType, sprintId, dividend, divisor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricRequest3 {\n");
        sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
        sb.append("    sprintId: ").append(toIndentedString(sprintId)).append("\n");
        sb.append("    dividend: ").append(toIndentedString(dividend)).append("\n");
        sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
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

