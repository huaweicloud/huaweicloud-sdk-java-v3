package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AnalysisResponse
 */
public class AnalysisResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_id")

    private String analysisId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private TransformResponse transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate")

    private AggregateResponse aggregate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private StreamResponse stream;

    public AnalysisResponse withAnalysisId(String analysisId) {
        this.analysisId = analysisId;
        return this;
    }

    /**
     * 分析任务ID
     * @return analysisId
     */
    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    public AnalysisResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分析任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnalysisResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 分析任务显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AnalysisResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 分析任务类型，转换计算（transform）、聚合计算（aggregate）、流计算（stream）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AnalysisResponse withTransform(TransformResponse transform) {
        this.transform = transform;
        return this;
    }

    public AnalysisResponse withTransform(Consumer<TransformResponse> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransformResponse();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransformResponse getTransform() {
        return transform;
    }

    public void setTransform(TransformResponse transform) {
        this.transform = transform;
    }

    public AnalysisResponse withAggregate(AggregateResponse aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    public AnalysisResponse withAggregate(Consumer<AggregateResponse> aggregateSetter) {
        if (this.aggregate == null) {
            this.aggregate = new AggregateResponse();
            aggregateSetter.accept(this.aggregate);
        }

        return this;
    }

    /**
     * Get aggregate
     * @return aggregate
     */
    public AggregateResponse getAggregate() {
        return aggregate;
    }

    public void setAggregate(AggregateResponse aggregate) {
        this.aggregate = aggregate;
    }

    public AnalysisResponse withStream(StreamResponse stream) {
        this.stream = stream;
        return this;
    }

    public AnalysisResponse withStream(Consumer<StreamResponse> streamSetter) {
        if (this.stream == null) {
            this.stream = new StreamResponse();
            streamSetter.accept(this.stream);
        }

        return this;
    }

    /**
     * Get stream
     * @return stream
     */
    public StreamResponse getStream() {
        return stream;
    }

    public void setStream(StreamResponse stream) {
        this.stream = stream;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalysisResponse analysisResponse = (AnalysisResponse) o;
        return Objects.equals(this.analysisId, analysisResponse.analysisId)
            && Objects.equals(this.name, analysisResponse.name)
            && Objects.equals(this.displayName, analysisResponse.displayName)
            && Objects.equals(this.type, analysisResponse.type)
            && Objects.equals(this.transform, analysisResponse.transform)
            && Objects.equals(this.aggregate, analysisResponse.aggregate)
            && Objects.equals(this.stream, analysisResponse.stream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analysisId, name, displayName, type, transform, aggregate, stream);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisResponse {\n");
        sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
