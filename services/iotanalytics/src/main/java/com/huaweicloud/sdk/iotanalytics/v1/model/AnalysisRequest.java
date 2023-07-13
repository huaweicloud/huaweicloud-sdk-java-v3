package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分析任务
 */
public class AnalysisRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private DTTransformRequest transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate")

    private DTAggregateRequest aggregate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private DTStreamRequest stream;

    public AnalysisRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分析任务名，必须是模型中已存在的
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnalysisRequest withTransform(DTTransformRequest transform) {
        this.transform = transform;
        return this;
    }

    public AnalysisRequest withTransform(Consumer<DTTransformRequest> transformSetter) {
        if (this.transform == null) {
            this.transform = new DTTransformRequest();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public DTTransformRequest getTransform() {
        return transform;
    }

    public void setTransform(DTTransformRequest transform) {
        this.transform = transform;
    }

    public AnalysisRequest withAggregate(DTAggregateRequest aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    public AnalysisRequest withAggregate(Consumer<DTAggregateRequest> aggregateSetter) {
        if (this.aggregate == null) {
            this.aggregate = new DTAggregateRequest();
            aggregateSetter.accept(this.aggregate);
        }

        return this;
    }

    /**
     * Get aggregate
     * @return aggregate
     */
    public DTAggregateRequest getAggregate() {
        return aggregate;
    }

    public void setAggregate(DTAggregateRequest aggregate) {
        this.aggregate = aggregate;
    }

    public AnalysisRequest withStream(DTStreamRequest stream) {
        this.stream = stream;
        return this;
    }

    public AnalysisRequest withStream(Consumer<DTStreamRequest> streamSetter) {
        if (this.stream == null) {
            this.stream = new DTStreamRequest();
            streamSetter.accept(this.stream);
        }

        return this;
    }

    /**
     * Get stream
     * @return stream
     */
    public DTStreamRequest getStream() {
        return stream;
    }

    public void setStream(DTStreamRequest stream) {
        this.stream = stream;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalysisRequest that = (AnalysisRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.transform, that.transform)
            && Objects.equals(this.aggregate, that.aggregate) && Objects.equals(this.stream, that.stream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transform, aggregate, stream);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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
