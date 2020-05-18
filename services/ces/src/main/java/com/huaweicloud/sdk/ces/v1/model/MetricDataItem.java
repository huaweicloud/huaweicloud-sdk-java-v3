package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.MetricInfo;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class MetricDataItem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric")
    
    private MetricInfo metric = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ttl")
    
    private Integer ttl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="collect_time")
    
    private Long collectTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private Double value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    private String unit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public MetricDataItem withMetric(MetricInfo metric) {
        this.metric = metric;
        return this;
    }

    public MetricDataItem withMetric(Consumer<MetricInfo> metricSetter) {
        if(this.metric == null ){
            this.metric = new MetricInfo();
        }
        metricSetter.accept(this.metric);
        return this;
    }


    /**
     * Get metric
     * @return metric
     */
    public MetricInfo getMetric() {
        return metric;
    }

    public void setMetric(MetricInfo metric) {
        this.metric = metric;
    }

    public MetricDataItem withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    


    /**
     * 数据的有效期，超出该有效期则自动删除该数据，单位秒，最大值604800。
     * minimum: 1
     * maximum: 604800
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public MetricDataItem withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    


    /**
     * 数据收集时间  UNIX时间戳，单位毫秒。  说明： 因为客户端到服务器端有延时，因此插入数据的时间戳应该在[当前时间-3天+20秒，当前时间+10分钟-20秒]区间内，保证到达服务器时不会因为传输时延造成数据不能插入数据库。
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public MetricDataItem withValue(Double value) {
        this.value = value;
        return this;
    }

    


    /**
     * 指标数据的值。
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public MetricDataItem withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 数据的单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public MetricDataItem withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 数据的类型，只能是\"int\"或\"float\"
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return Objects.equals(this.metric, metricDataItem.metric) &&
            Objects.equals(this.ttl, metricDataItem.ttl) &&
            Objects.equals(this.collectTime, metricDataItem.collectTime) &&
            Objects.equals(this.value, metricDataItem.value) &&
            Objects.equals(this.unit, metricDataItem.unit) &&
            Objects.equals(this.type, metricDataItem.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metric, ttl, collectTime, value, unit, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricDataItem {\n");
            sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
            sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
            sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

