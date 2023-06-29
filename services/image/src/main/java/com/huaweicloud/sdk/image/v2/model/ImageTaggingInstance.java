package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageTaggingInstance
 */
public class ImageTaggingInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private ImageTaggingBoundingBox boundingBox;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private String confidence;

    public ImageTaggingInstance withBoundingBox(ImageTaggingBoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public ImageTaggingInstance withBoundingBox(Consumer<ImageTaggingBoundingBox> boundingBoxSetter) {
        if (this.boundingBox == null) {
            this.boundingBox = new ImageTaggingBoundingBox();
            boundingBoxSetter.accept(this.boundingBox);
        }

        return this;
    }

    /**
     * Get boundingBox
     * @return boundingBox
     */
    public ImageTaggingBoundingBox getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(ImageTaggingBoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public ImageTaggingInstance withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 检测标签置信度,将Float型置信度转为String类型返回,Float取值范围（0~100）。
     * @return confidence
     */
    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageTaggingInstance that = (ImageTaggingInstance) obj;
        return Objects.equals(this.boundingBox, that.boundingBox) && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boundingBox, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingInstance {\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
