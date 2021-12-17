package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** AnalysisModelResponse */
public class AnalysisModelResponse {

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

    private TransformModel transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate")

    private AggregateModel aggregate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private StreamModel stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_id")

    private String analysisId;

    public AnalysisModelResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 分析任务名称，正则：\"^[a-zA-Z][a-zA-Z0-9_]{0,63}$\"
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnalysisModelResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** 分析任务显示名称，正则：\"^[\\\\u4E00-\\\\u9FA5A-Za-z0-9_@#.-]{1,64}$\"
     * 
     * @return displayName */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AnalysisModelResponse withType(String type) {
        this.type = type;
        return this;
    }

    /** 分析任务类型，转换计算（transform）、聚合计算（aggregate）、流计算（stream）
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AnalysisModelResponse withTransform(TransformModel transform) {
        this.transform = transform;
        return this;
    }

    public AnalysisModelResponse withTransform(Consumer<TransformModel> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransformModel();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /** Get transform
     * 
     * @return transform */
    public TransformModel getTransform() {
        return transform;
    }

    public void setTransform(TransformModel transform) {
        this.transform = transform;
    }

    public AnalysisModelResponse withAggregate(AggregateModel aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    public AnalysisModelResponse withAggregate(Consumer<AggregateModel> aggregateSetter) {
        if (this.aggregate == null) {
            this.aggregate = new AggregateModel();
            aggregateSetter.accept(this.aggregate);
        }

        return this;
    }

    /** Get aggregate
     * 
     * @return aggregate */
    public AggregateModel getAggregate() {
        return aggregate;
    }

    public void setAggregate(AggregateModel aggregate) {
        this.aggregate = aggregate;
    }

    public AnalysisModelResponse withStream(StreamModel stream) {
        this.stream = stream;
        return this;
    }

    public AnalysisModelResponse withStream(Consumer<StreamModel> streamSetter) {
        if (this.stream == null) {
            this.stream = new StreamModel();
            streamSetter.accept(this.stream);
        }

        return this;
    }

    /** Get stream
     * 
     * @return stream */
    public StreamModel getStream() {
        return stream;
    }

    public void setStream(StreamModel stream) {
        this.stream = stream;
    }

    public AnalysisModelResponse withAnalysisId(String analysisId) {
        this.analysisId = analysisId;
        return this;
    }

    /** 分析任务ID
     * 
     * @return analysisId */
    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalysisModelResponse analysisModelResponse = (AnalysisModelResponse) o;
        return Objects.equals(this.name, analysisModelResponse.name)
            && Objects.equals(this.displayName, analysisModelResponse.displayName)
            && Objects.equals(this.type, analysisModelResponse.type)
            && Objects.equals(this.transform, analysisModelResponse.transform)
            && Objects.equals(this.aggregate, analysisModelResponse.aggregate)
            && Objects.equals(this.stream, analysisModelResponse.stream)
            && Objects.equals(this.analysisId, analysisModelResponse.analysisId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, type, transform, aggregate, stream, analysisId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisModelResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
