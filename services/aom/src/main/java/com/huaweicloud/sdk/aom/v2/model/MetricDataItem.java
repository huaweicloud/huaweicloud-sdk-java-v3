package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.MetricItemInfo;
import com.huaweicloud.sdk.aom.v2.model.ValueData;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 指标
 */
@JacksonXmlRootElement(localName = "MetricDataItem")
public class MetricDataItem  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="collect_time")
    
    @JacksonXmlProperty(localName = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric")
    
    @JacksonXmlProperty(localName = "metric")

    private MetricItemInfo metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    @JacksonXmlProperty(localName = "values")
    private List<ValueData> values = null;
    
    public MetricDataItem withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    


    /**
     * 数据收集时间支持过去1天和未来半小时范围内的数据上报。数据收集时间需要满足：  当前UTC时间减去collect_time小于等于24小时或者collect_time减去当前UTC时间小于等于30分钟。  若数据上报时间早于当天8点，则指标监控页面只显示当天8点后的数据。 取值范围： UNIX时间戳，单位毫秒。
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    

    public MetricDataItem withMetric(MetricItemInfo metric) {
        this.metric = metric;
        return this;
    }

    public MetricDataItem withMetric(Consumer<MetricItemInfo> metricSetter) {
        if(this.metric == null ){
            this.metric = new MetricItemInfo();
            metricSetter.accept(this.metric);
        }
        
        return this;
    }


    /**
     * Get metric
     * @return metric
     */
    public MetricItemInfo getMetric() {
        return metric;
    }

    public void setMetric(MetricItemInfo metric) {
        this.metric = metric;
    }

    

    public MetricDataItem withValues(List<ValueData> values) {
        this.values = values;
        return this;
    }

    
    public MetricDataItem addValuesItem(ValueData valuesItem) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public MetricDataItem withValues(Consumer<List<ValueData>> valuesSetter) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 指标数据的值。
     * @return values
     */
    public List<ValueData> getValues() {
        return values;
    }

    public void setValues(List<ValueData> values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricDataItem metricDataItem = (MetricDataItem) o;
        return Objects.equals(this.collectTime, metricDataItem.collectTime) &&
            Objects.equals(this.metric, metricDataItem.metric) &&
            Objects.equals(this.values, metricDataItem.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(collectTime, metric, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataItem {\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

