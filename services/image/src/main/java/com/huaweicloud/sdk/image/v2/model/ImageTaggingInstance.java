package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ImageTaggingInstance */
public class ImageTaggingInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private Object boundingBox;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private String confidence;

    public ImageTaggingInstance withBoundingBox(Object boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /** 目标检测框位置信息，包括4个值： width：检测框区域宽度 height：检测框区域高度 top_left_x：检测框左上角到垂直轴距离 top_left_y：检测框左上角到水平轴距离
     * 
     * @return boundingBox */
    public Object getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(Object boundingBox) {
        this.boundingBox = boundingBox;
    }

    public ImageTaggingInstance withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    /** 检测标签置信度,将Float型置信度转为String类型返回,Float取值范围（0~100）。
     * 
     * @return confidence */
    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageTaggingInstance imageTaggingInstance = (ImageTaggingInstance) o;
        return Objects.equals(this.boundingBox, imageTaggingInstance.boundingBox)
            && Objects.equals(this.confidence, imageTaggingInstance.confidence);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
