package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class QueryChartDataResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_value")
    
    private Long xValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="y_value")
    
    private Long yValue;

    public QueryChartDataResp withXValue(Long xValue) {
        this.xValue = xValue;
        return this;
    }

    


    /**
     * 图表x轴数据
     * @return xValue
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_value")
    public Long getXValue() {
        return xValue;
    }

    public void setXValue(Long xValue) {
        this.xValue = xValue;
    }

    public QueryChartDataResp withYValue(Long yValue) {
        this.yValue = yValue;
        return this;
    }

    


    /**
     * 图表y轴数据
     * @return yValue
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="y_value")
    public Long getYValue() {
        return yValue;
    }

    public void setYValue(Long yValue) {
        this.yValue = yValue;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryChartDataResp queryChartDataResp = (QueryChartDataResp) o;
        return Objects.equals(this.xValue, queryChartDataResp.xValue) &&
            Objects.equals(this.yValue, queryChartDataResp.yValue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xValue, yValue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryChartDataResp {\n");
        sb.append("    xValue: ").append(toIndentedString(xValue)).append("\n");
        sb.append("    yValue: ").append(toIndentedString(yValue)).append("\n");
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

