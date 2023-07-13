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
public class StreamModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<InputModel> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<StreamOutput> outputs = null;

    public StreamModel withInputs(List<InputModel> inputs) {
        this.inputs = inputs;
        return this;
    }

    public StreamModel addInputsItem(InputModel inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public StreamModel withInputs(Consumer<List<InputModel>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 输入参数，最多支持10个；流计算的输入参数名需要在接收数据类型为资产数据的实时分析作业中定义，模型中必须与其保持一致
     * @return inputs
     */
    public List<InputModel> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputModel> inputs) {
        this.inputs = inputs;
    }

    public StreamModel withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 实时分析作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StreamModel withOutputs(List<StreamOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    public StreamModel addOutputsItem(StreamOutput outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public StreamModel withOutputs(Consumer<List<StreamOutput>> outputsSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamModel that = (StreamModel) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.outputs, that.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, jobId, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamModel {\n");
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
