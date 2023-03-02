package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageTranslateConfigCommon
 */
public class ImageTranslateConfigCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference")

    private ImageTranslateInference inference;

    public ImageTranslateConfigCommon withInference(ImageTranslateInference inference) {
        this.inference = inference;
        return this;
    }

    public ImageTranslateConfigCommon withInference(Consumer<ImageTranslateInference> inferenceSetter) {
        if (this.inference == null) {
            this.inference = new ImageTranslateInference();
            inferenceSetter.accept(this.inference);
        }

        return this;
    }

    /**
     * Get inference
     * @return inference
     */
    public ImageTranslateInference getInference() {
        return inference;
    }

    public void setInference(ImageTranslateInference inference) {
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
        ImageTranslateConfigCommon imageTranslateConfigCommon = (ImageTranslateConfigCommon) o;
        return Objects.equals(this.inference, imageTranslateConfigCommon.inference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTranslateConfigCommon {\n");
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
