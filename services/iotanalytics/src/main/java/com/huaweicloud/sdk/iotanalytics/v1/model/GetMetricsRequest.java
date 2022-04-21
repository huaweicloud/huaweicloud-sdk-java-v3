package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询指标请求
 */
public class GetMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private TransformMetrics transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate")

    private AggregateMetrics aggregate;

    public GetMetricsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 查询类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetMetricsRequest withTransform(TransformMetrics transform) {
        this.transform = transform;
        return this;
    }

    public GetMetricsRequest withTransform(Consumer<TransformMetrics> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransformMetrics();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransformMetrics getTransform() {
        return transform;
    }

    public void setTransform(TransformMetrics transform) {
        this.transform = transform;
    }

    public GetMetricsRequest withAggregate(AggregateMetrics aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    public GetMetricsRequest withAggregate(Consumer<AggregateMetrics> aggregateSetter) {
        if (this.aggregate == null) {
            this.aggregate = new AggregateMetrics();
            aggregateSetter.accept(this.aggregate);
        }

        return this;
    }

    /**
     * Get aggregate
     * @return aggregate
     */
    public AggregateMetrics getAggregate() {
        return aggregate;
    }

    public void setAggregate(AggregateMetrics aggregate) {
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
        GetMetricsRequest getMetricsRequest = (GetMetricsRequest) o;
        return Objects.equals(this.type, getMetricsRequest.type)
            && Objects.equals(this.transform, getMetricsRequest.transform)
            && Objects.equals(this.aggregate, getMetricsRequest.aggregate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transform, aggregate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMetricsRequest {\n");
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
