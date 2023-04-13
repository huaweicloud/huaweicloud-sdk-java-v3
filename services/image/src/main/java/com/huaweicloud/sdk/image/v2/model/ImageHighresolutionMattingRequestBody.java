package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageHighresolutionMattingRequestBody
 */
public class ImageHighresolutionMattingRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ImageHighresolutionMattingInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private TaskCallback callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private ImageHighresolutionMattingConfig config;

    public ImageHighresolutionMattingRequestBody withInput(ImageHighresolutionMattingInput input) {
        this.input = input;
        return this;
    }

    public ImageHighresolutionMattingRequestBody withInput(Consumer<ImageHighresolutionMattingInput> inputSetter) {
        if (this.input == null) {
            this.input = new ImageHighresolutionMattingInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ImageHighresolutionMattingInput getInput() {
        return input;
    }

    public void setInput(ImageHighresolutionMattingInput input) {
        this.input = input;
    }

    public ImageHighresolutionMattingRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public ImageHighresolutionMattingRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
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

    public ImageHighresolutionMattingRequestBody withCallback(TaskCallback callback) {
        this.callback = callback;
        return this;
    }

    public ImageHighresolutionMattingRequestBody withCallback(Consumer<TaskCallback> callbackSetter) {
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

    public ImageHighresolutionMattingRequestBody withConfig(ImageHighresolutionMattingConfig config) {
        this.config = config;
        return this;
    }

    public ImageHighresolutionMattingRequestBody withConfig(Consumer<ImageHighresolutionMattingConfig> configSetter) {
        if (this.config == null) {
            this.config = new ImageHighresolutionMattingConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public ImageHighresolutionMattingConfig getConfig() {
        return config;
    }

    public void setConfig(ImageHighresolutionMattingConfig config) {
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
        ImageHighresolutionMattingRequestBody imageHighresolutionMattingRequestBody =
            (ImageHighresolutionMattingRequestBody) o;
        return Objects.equals(this.input, imageHighresolutionMattingRequestBody.input)
            && Objects.equals(this.output, imageHighresolutionMattingRequestBody.output)
            && Objects.equals(this.callback, imageHighresolutionMattingRequestBody.callback)
            && Objects.equals(this.config, imageHighresolutionMattingRequestBody.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, callback, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageHighresolutionMattingRequestBody {\n");
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
