package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoObjectMaskingTaskConfigCommon
 */
public class VideoObjectMaskingTaskConfigCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference")

    private VideoObjectMaskingInference inference;

    public VideoObjectMaskingTaskConfigCommon withInference(VideoObjectMaskingInference inference) {
        this.inference = inference;
        return this;
    }

    public VideoObjectMaskingTaskConfigCommon withInference(Consumer<VideoObjectMaskingInference> inferenceSetter) {
        if (this.inference == null) {
            this.inference = new VideoObjectMaskingInference();
            inferenceSetter.accept(this.inference);
        }

        return this;
    }

    /**
     * Get inference
     * @return inference
     */
    public VideoObjectMaskingInference getInference() {
        return inference;
    }

    public void setInference(VideoObjectMaskingInference inference) {
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
        VideoObjectMaskingTaskConfigCommon videoObjectMaskingTaskConfigCommon = (VideoObjectMaskingTaskConfigCommon) o;
        return Objects.equals(this.inference, videoObjectMaskingTaskConfigCommon.inference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoObjectMaskingTaskConfigCommon {\n");
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
