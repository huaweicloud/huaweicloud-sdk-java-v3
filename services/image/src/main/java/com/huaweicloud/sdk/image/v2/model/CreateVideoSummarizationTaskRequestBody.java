package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVideoSummarizationTaskRequestBody
 */
public class CreateVideoSummarizationTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private VideoSummarizationTaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private TaskCallback callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private SummarizationAnalysisConfig config;

    public CreateVideoSummarizationTaskRequestBody withInput(VideoSummarizationTaskInput input) {
        this.input = input;
        return this;
    }

    public CreateVideoSummarizationTaskRequestBody withInput(Consumer<VideoSummarizationTaskInput> inputSetter) {
        if (this.input == null) {
            this.input = new VideoSummarizationTaskInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public VideoSummarizationTaskInput getInput() {
        return input;
    }

    public void setInput(VideoSummarizationTaskInput input) {
        this.input = input;
    }

    public CreateVideoSummarizationTaskRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public CreateVideoSummarizationTaskRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
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

    public CreateVideoSummarizationTaskRequestBody withCallback(TaskCallback callback) {
        this.callback = callback;
        return this;
    }

    public CreateVideoSummarizationTaskRequestBody withCallback(Consumer<TaskCallback> callbackSetter) {
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

    public CreateVideoSummarizationTaskRequestBody withConfig(SummarizationAnalysisConfig config) {
        this.config = config;
        return this;
    }

    public CreateVideoSummarizationTaskRequestBody withConfig(Consumer<SummarizationAnalysisConfig> configSetter) {
        if (this.config == null) {
            this.config = new SummarizationAnalysisConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public SummarizationAnalysisConfig getConfig() {
        return config;
    }

    public void setConfig(SummarizationAnalysisConfig config) {
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
        CreateVideoSummarizationTaskRequestBody createVideoSummarizationTaskRequestBody =
            (CreateVideoSummarizationTaskRequestBody) o;
        return Objects.equals(this.input, createVideoSummarizationTaskRequestBody.input)
            && Objects.equals(this.output, createVideoSummarizationTaskRequestBody.output)
            && Objects.equals(this.callback, createVideoSummarizationTaskRequestBody.callback)
            && Objects.equals(this.config, createVideoSummarizationTaskRequestBody.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, callback, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoSummarizationTaskRequestBody {\n");
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
