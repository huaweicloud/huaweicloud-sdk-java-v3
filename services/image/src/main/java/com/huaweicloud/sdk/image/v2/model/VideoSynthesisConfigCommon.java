package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoSynthesisConfigCommon
 */
public class VideoSynthesisConfigCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference")

    private VideoSynthesisInference inference;

    public VideoSynthesisConfigCommon withInference(VideoSynthesisInference inference) {
        this.inference = inference;
        return this;
    }

    public VideoSynthesisConfigCommon withInference(Consumer<VideoSynthesisInference> inferenceSetter) {
        if (this.inference == null) {
            this.inference = new VideoSynthesisInference();
            inferenceSetter.accept(this.inference);
        }

        return this;
    }

    /**
     * Get inference
     * @return inference
     */
    public VideoSynthesisInference getInference() {
        return inference;
    }

    public void setInference(VideoSynthesisInference inference) {
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
        VideoSynthesisConfigCommon videoSynthesisConfigCommon = (VideoSynthesisConfigCommon) o;
        return Objects.equals(this.inference, videoSynthesisConfigCommon.inference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSynthesisConfigCommon {\n");
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
