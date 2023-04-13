package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVideoCoverAnalysisTaskRequestBody
 */
public class CreateVideoCoverAnalysisTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private VideoCoverAnalysisTaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private TaskCallback callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private VideoCoverAnalysisConfig config;

    public CreateVideoCoverAnalysisTaskRequestBody withInput(VideoCoverAnalysisTaskInput input) {
        this.input = input;
        return this;
    }

    public CreateVideoCoverAnalysisTaskRequestBody withInput(Consumer<VideoCoverAnalysisTaskInput> inputSetter) {
        if (this.input == null) {
            this.input = new VideoCoverAnalysisTaskInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public VideoCoverAnalysisTaskInput getInput() {
        return input;
    }

    public void setInput(VideoCoverAnalysisTaskInput input) {
        this.input = input;
    }

    public CreateVideoCoverAnalysisTaskRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public CreateVideoCoverAnalysisTaskRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutput();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public TaskOutput getOutput() {
        return output;
    }

    public void setOutput(TaskOutput output) {
        this.output = output;
    }

    public CreateVideoCoverAnalysisTaskRequestBody withCallback(TaskCallback callback) {
        this.callback = callback;
        return this;
    }

    public CreateVideoCoverAnalysisTaskRequestBody withCallback(Consumer<TaskCallback> callbackSetter) {
        if (this.callback == null) {
            this.callback = new TaskCallback();
            callbackSetter.accept(this.callback);
        }

        return this;
    }

    /**
     * Get callback
     * @return callback
     */
    public TaskCallback getCallback() {
        return callback;
    }

    public void setCallback(TaskCallback callback) {
        this.callback = callback;
    }

    public CreateVideoCoverAnalysisTaskRequestBody withConfig(VideoCoverAnalysisConfig config) {
        this.config = config;
        return this;
    }

    public CreateVideoCoverAnalysisTaskRequestBody withConfig(Consumer<VideoCoverAnalysisConfig> configSetter) {
        if (this.config == null) {
            this.config = new VideoCoverAnalysisConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public VideoCoverAnalysisConfig getConfig() {
        return config;
    }

    public void setConfig(VideoCoverAnalysisConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVideoCoverAnalysisTaskRequestBody createVideoCoverAnalysisTaskRequestBody =
            (CreateVideoCoverAnalysisTaskRequestBody) o;
        return Objects.equals(this.input, createVideoCoverAnalysisTaskRequestBody.input)
            && Objects.equals(this.output, createVideoCoverAnalysisTaskRequestBody.output)
            && Objects.equals(this.callback, createVideoCoverAnalysisTaskRequestBody.callback)
            && Objects.equals(this.config, createVideoCoverAnalysisTaskRequestBody.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, callback, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoCoverAnalysisTaskRequestBody {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
