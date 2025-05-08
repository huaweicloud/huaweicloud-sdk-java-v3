package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EditMediaTask
 */
public class EditMediaTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<EditMediaTaskInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutPut output;

    public EditMediaTask withInputs(List<EditMediaTaskInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public EditMediaTask addInputsItem(EditMediaTaskInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public EditMediaTask withInputs(Consumer<List<EditMediaTaskInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 剪辑任务的输入文件信息
     * @return inputs
     */
    public List<EditMediaTaskInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<EditMediaTaskInput> inputs) {
        this.inputs = inputs;
    }

    public EditMediaTask withOutput(TaskOutPut output) {
        this.output = output;
        return this;
    }

    public EditMediaTask withOutput(Consumer<TaskOutPut> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutPut();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public TaskOutPut getOutput() {
        return output;
    }

    public void setOutput(TaskOutPut output) {
        this.output = output;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditMediaTask that = (EditMediaTask) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditMediaTask {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
