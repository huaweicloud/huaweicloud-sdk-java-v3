package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流计算
 */
public class StreamResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<InputResponse> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<StreamOutput> outputs = null;

    public StreamResponse withInputs(List<InputResponse> inputs) {
        this.inputs = inputs;
        return this;
    }

    public StreamResponse addInputsItem(InputResponse inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public StreamResponse withInputs(Consumer<List<InputResponse>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 输入参数
     * @return inputs
     */
    public List<InputResponse> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputResponse> inputs) {
        this.inputs = inputs;
    }

    public StreamResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 流计算任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StreamResponse withOutputs(List<StreamOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    public StreamResponse addOutputsItem(StreamOutput outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public StreamResponse withOutputs(Consumer<List<StreamOutput>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 输出属性，最多支持10个
     * @return outputs
     */
    public List<StreamOutput> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<StreamOutput> outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StreamResponse streamResponse = (StreamResponse) o;
        return Objects.equals(this.inputs, streamResponse.inputs) && Objects.equals(this.jobId, streamResponse.jobId)
            && Objects.equals(this.outputs, streamResponse.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, jobId, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamResponse {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
