package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GenerateSpeechRequestBody
 */
public class GenerateSpeechRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private GenerateSpeechRequestBodyConfig config;

    public GenerateSpeechRequestBody withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 待合成的文本，文本长度不大于300字符。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GenerateSpeechRequestBody withConfig(GenerateSpeechRequestBodyConfig config) {
        this.config = config;
        return this;
    }

    public GenerateSpeechRequestBody withConfig(Consumer<GenerateSpeechRequestBodyConfig> configSetter) {
        if (this.config == null) {
            this.config = new GenerateSpeechRequestBodyConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public GenerateSpeechRequestBodyConfig getConfig() {
        return config;
    }

    public void setConfig(GenerateSpeechRequestBodyConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateSpeechRequestBody that = (GenerateSpeechRequestBody) obj;
        return Objects.equals(this.text, that.text) && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateSpeechRequestBody {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
