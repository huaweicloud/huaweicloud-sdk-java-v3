package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoTranslateConfigCommon
 */
public class VideoTranslateConfigCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference")

    private VideoTranslateInference inference;

    public VideoTranslateConfigCommon withInference(VideoTranslateInference inference) {
        this.inference = inference;
        return this;
    }

    public VideoTranslateConfigCommon withInference(Consumer<VideoTranslateInference> inferenceSetter) {
        if (this.inference == null) {
            this.inference = new VideoTranslateInference();
            inferenceSetter.accept(this.inference);
        }

        return this;
    }

    /**
     * Get inference
     * @return inference
     */
    public VideoTranslateInference getInference() {
        return inference;
    }

    public void setInference(VideoTranslateInference inference) {
        this.inference = inference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoTranslateConfigCommon videoTranslateConfigCommon = (VideoTranslateConfigCommon) o;
        return Objects.equals(this.inference, videoTranslateConfigCommon.inference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTranslateConfigCommon {\n");
        sb.append("    inference: ").append(toIndentedString(inference)).append("\n");
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
