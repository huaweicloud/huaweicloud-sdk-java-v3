package com.huaweicloud.sdk.aom.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.MetaData;
import com.huaweicloud.sdk.aom.v2.model.MetricItemResultAPI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "ListMetricItemsResponse")
public class ListMetricItemsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metaData")
    
    @JacksonXmlProperty(localName = "metaData")

    private MetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    @JacksonXmlProperty(localName = "metrics")
    private List<MetricItemResultAPI> metrics = null;
    
    public ListMetricItemsResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListMetricItemsResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }
        
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    

    public ListMetricItemsResponse withMetrics(List<MetricItemResultAPI> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public ListMetricItemsResponse addMetricsItem(MetricItemResultAPI metricsItem) {
        if(this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ListMetricItemsResponse withMetrics(Consumer<List<MetricItemResultAPI>> metricsSetter) {
        if(this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标对象列表。
     * @return metrics
     */
    public List<MetricItemResultAPI> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricItemResultAPI> metrics) {
        this.metrics = metrics;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetricItemsResponse listMetricItemsResponse = (ListMetricItemsResponse) o;
        return Objects.equals(this.metaData, listMetricItemsResponse.metaData) &&
            Objects.equals(this.metrics, listMetricItemsResponse.metrics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metaData, metrics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricItemsResponse {\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

