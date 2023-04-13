package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVideoTranslateTaskRequestBody
 */
public class CreateVideoTranslateTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private VideoTranslateTaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private TaskCallback callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private VideoTranslateConfig config;

    public CreateVideoTranslateTaskRequestBody withInput(VideoTranslateTaskInput input) {
        this.input = input;
        return this;
    }

    public CreateVideoTranslateTaskRequestBody withInput(Consumer<VideoTranslateTaskInput> inputSetter) {
        if (this.input == null) {
            this.input = new VideoTranslateTaskInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public VideoTranslateTaskInput getInput() {
        return input;
    }

    public void setInput(VideoTranslateTaskInput input) {
        this.input = input;
    }

    public CreateVideoTranslateTaskRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public CreateVideoTranslateTaskRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
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

    public CreateVideoTranslateTaskRequestBody withCallback(TaskCallback callback) {
        this.callback = callback;
        return this;
    }

    public CreateVideoTranslateTaskRequestBody withCallback(Consumer<TaskCallback> callbackSetter) {
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

    public CreateVideoTranslateTaskRequestBody withConfig(VideoTranslateConfig config) {
        this.config = config;
        return this;
    }

    public CreateVideoTranslateTaskRequestBody withConfig(Consumer<VideoTranslateConfig> configSetter) {
        if (this.config == null) {
            this.config = new VideoTranslateConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public VideoTranslateConfig getConfig() {
        return config;
    }

    public void setConfig(VideoTranslateConfig config) {
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
        CreateVideoTranslateTaskRequestBody createVideoTranslateTaskRequestBody =
            (CreateVideoTranslateTaskRequestBody) o;
        return Objects.equals(this.input, createVideoTranslateTaskRequestBody.input)
            && Objects.equals(this.output, createVideoTranslateTaskRequestBody.output)
            && Objects.equals(this.callback, createVideoTranslateTaskRequestBody.callback)
            && Objects.equals(this.config, createVideoTranslateTaskRequestBody.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, callback, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoTranslateTaskRequestBody {\n");
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
