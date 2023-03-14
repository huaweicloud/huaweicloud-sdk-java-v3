package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageVariationTaskConfigCommon
 */
public class ImageVariationTaskConfigCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference")

    private ImageVariationInference inference;

    public ImageVariationTaskConfigCommon withInference(ImageVariationInference inference) {
        this.inference = inference;
        return this;
    }

    public ImageVariationTaskConfigCommon withInference(Consumer<ImageVariationInference> inferenceSetter) {
        if (this.inference == null) {
            this.inference = new ImageVariationInference();
            inferenceSetter.accept(this.inference);
        }

        return this;
    }

    /**
     * Get inference
     * @return inference
     */
    public ImageVariationInference getInference() {
        return inference;
    }

    public void setInference(ImageVariationInference inference) {
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
        ImageVariationTaskConfigCommon imageVariationTaskConfigCommon = (ImageVariationTaskConfigCommon) o;
        return Objects.equals(this.inference, imageVariationTaskConfigCommon.inference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageVariationTaskConfigCommon {\n");
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
