package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetMetricsValue
 */
public class GetMetricsValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    @JacksonXmlProperty(localName = "transform")

    private TransformMetricsRequest transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate")

    @JacksonXmlProperty(localName = "aggregate")

    private AggregateMetricsRequest aggregate;

    public GetMetricsValue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 查询类型，经过转换计算的序列值（transform）、经过聚合计算的序列值（aggregate）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetMetricsValue withTransform(TransformMetricsRequest transform) {
        this.transform = transform;
        return this;
    }

    public GetMetricsValue withTransform(Consumer<TransformMetricsRequest> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransformMetricsRequest();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransformMetricsRequest getTransform() {
        return transform;
    }

    public void setTransform(TransformMetricsRequest transform) {
        this.transform = transform;
    }

    public GetMetricsValue withAggregate(AggregateMetricsRequest aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    public GetMetricsValue withAggregate(Consumer<AggregateMetricsRequest> aggregateSetter) {
        if (this.aggregate == null) {
            this.aggregate = new AggregateMetricsRequest();
            aggregateSetter.accept(this.aggregate);
        }

        return this;
    }

    /**
     * Get aggregate
     * @return aggregate
     */
    public AggregateMetricsRequest getAggregate() {
        return aggregate;
    }

    public void setAggregate(AggregateMetricsRequest aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMetricsValue getMetricsValue = (GetMetricsValue) o;
        return Objects.equals(this.type, getMetricsValue.type)
            && Objects.equals(this.transform, getMetricsValue.transform)
            && Objects.equals(this.aggregate, getMetricsValue.aggregate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transform, aggregate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMetricsValue {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
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
