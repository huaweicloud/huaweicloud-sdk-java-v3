package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.MetricDataPoints;
import com.huaweicloud.sdk.bcs.v2.model.MetricDemision;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 监控数据信息
 */
public class MetricItemResultAPI  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric")
    
    private MetricDemision metric = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dataPoints")
    
    private List<MetricDataPoints> dataPoints = null;
    
    public MetricItemResultAPI withMetric(MetricDemision metric) {
        this.metric = metric;
        return this;
    }

    public MetricItemResultAPI withMetric(Consumer<MetricDemision> metricSetter) {
        if(this.metric == null ){
            this.metric = new MetricDemision();
            metricSetter.accept(this.metric);
        }
        
        return this;
    }


    /**
     * Get metric
     * @return metric
     */
    public MetricDemision getMetric() {
        return metric;
    }

    public void setMetric(MetricDemision metric) {
        this.metric = metric;
    }

    public MetricItemResultAPI withDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    
    public MetricItemResultAPI addDataPointsItem(MetricDataPoints dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public MetricItemResultAPI withDataPoints(Consumer<List<MetricDataPoints>> dataPointsSetter) {
        if(this.dataPoints == null ){
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 监控数据信息
     * @return dataPoints
     */
    public List<MetricDataPoints> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricItemResultAPI metricItemResultAPI = (MetricItemResultAPI) o;
        return Objects.equals(this.metric, metricItemResultAPI.metric) &&
            Objects.equals(this.dataPoints, metricItemResultAPI.dataPoints);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metric, dataPoints);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricItemResultAPI {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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

