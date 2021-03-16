package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.MetricRequest2Dividend;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MetricRequest2
 */
public class MetricRequest2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_type")
    
    private String metricType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sprint_id")
    
    private String sprintId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dividend")
    
    private MetricRequest2Dividend dividend;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="divisor")
    
    private Object divisor;

    public MetricRequest2 withMetricType(String metricType) {
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

    

    public MetricRequest2 withSprintId(String sprintId) {
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

    

    public MetricRequest2 withDividend(MetricRequest2Dividend dividend) {
        this.dividend = dividend;
        return this;
    }

    public MetricRequest2 withDividend(Consumer<MetricRequest2Dividend> dividendSetter) {
        if(this.dividend == null ){
            this.dividend = new MetricRequest2Dividend();
            dividendSetter.accept(this.dividend);
        }
        
        return this;
    }


    /**
     * Get dividend
     * @return dividend
     */
    public MetricRequest2Dividend getDividend() {
        return dividend;
    }

    public void setDividend(MetricRequest2Dividend dividend) {
        this.dividend = dividend;
    }

    

    public MetricRequest2 withDivisor(Object divisor) {
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
        MetricRequest2 metricRequest2 = (MetricRequest2) o;
        return Objects.equals(this.metricType, metricRequest2.metricType) &&
            Objects.equals(this.sprintId, metricRequest2.sprintId) &&
            Objects.equals(this.dividend, metricRequest2.dividend) &&
            Objects.equals(this.divisor, metricRequest2.divisor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metricType, sprintId, dividend, divisor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricRequest2 {\n");
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

