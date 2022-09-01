package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Trigger
 */
public class Trigger  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    @JacksonXmlProperty(localName = "metric_name")
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_value")
    
    @JacksonXmlProperty(localName = "metric_value")
    
    private String metricValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comparison_operator")
    
    @JacksonXmlProperty(localName = "comparison_operator")
    
    private String comparisonOperator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="evaluation_periods")
    
    @JacksonXmlProperty(localName = "evaluation_periods")
    
    private Integer evaluationPeriods;

    public Trigger withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 指标名称。  该触发条件会依据该名称对应指标的值来进行判断。  最大长度为64个字符。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public Trigger withMetricValue(String metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    


    /**
     * 指标阈值。  触发该条件的指标阈值，只允许输入整数或者带两位小数的数。
     * @return metricValue
     */
    public String getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    

    public Trigger withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    


    /**
     * 指标判断逻辑运算符，包括：  - LT：小于 - GT：大于 - LTOE：小于等于 - GTOE：大于等于
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    

    public Trigger withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    


    /**
     * 判断连续满足指标阈值的周期数(一个周期为5分钟)。  取值范围[1～288]
     * minimum: 1
     * maximum: 288
     * @return evaluationPeriods
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trigger trigger = (Trigger) o;
        return Objects.equals(this.metricName, trigger.metricName) &&
            Objects.equals(this.metricValue, trigger.metricValue) &&
            Objects.equals(this.comparisonOperator, trigger.comparisonOperator) &&
            Objects.equals(this.evaluationPeriods, trigger.evaluationPeriods);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metricName, metricValue, comparisonOperator, evaluationPeriods);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trigger {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    evaluationPeriods: ").append(toIndentedString(evaluationPeriods)).append("\n");
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

