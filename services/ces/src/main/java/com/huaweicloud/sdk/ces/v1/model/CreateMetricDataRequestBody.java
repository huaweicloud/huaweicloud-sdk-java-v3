package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加一条或多条自定义指标监控数据，请求参数。
 */
public class CreateMetricDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private MetricInfo metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CreateMetricDataRequestBody withMetric(MetricInfo metric) {
        this.metric = metric;
        return this;
    }

    public CreateMetricDataRequestBody withMetric(Consumer<MetricInfo> metricSetter) {
        if (this.metric == null) {
            this.metric = new MetricInfo();
            metricSetter.accept(this.metric);
        }

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

    public CreateMetricDataRequestBody withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释**： 数据的有效期，超出该有效期则自动删除该数据，单位秒。 **约束限制**： 不涉及。 **取值范围**： 大小为[1,604800]的整数。 **默认取值**： 不涉及。 
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

    public CreateMetricDataRequestBody withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * **参数解释**： 数据收集时间 。UNIX时间戳，单位毫秒。 **约束限制**： 不涉及。 **取值范围**： 因为客户端到服务器端有延时，因此插入数据的时间戳应该在[当前时间-3天+10秒，当前时间+10分钟-10秒]区间内，保证到达服务器时不会因为传输时延造成数据不能插入数据库。 **默认取值**： 不涉及。 
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public CreateMetricDataRequestBody withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 待添加的监控指标数据的值。 **约束限制**： 不涉及。 **取值范围**： 数值类型支持“整数”或“浮点数”。 **默认取值**： 不涉及。 
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public CreateMetricDataRequestBody withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**： 数据的单位。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,32]个字符。 **默认取值**： 不涉及。 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public CreateMetricDataRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 数据类型。 **约束限制**： 不涉及。 **取值范围**： 枚举值，只能是\"int\"或\"float\"。 - int：整数 - float：浮点数 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMetricDataRequestBody that = (CreateMetricDataRequestBody) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.collectTime, that.collectTime) && Objects.equals(this.value, that.value)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, ttl, collectTime, value, unit, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMetricDataRequestBody {\n");
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
