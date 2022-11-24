package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageMainObjectDetectionInstance
 */
public class ImageMainObjectDetectionInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private Object location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private String confidence;

    public ImageMainObjectDetectionInstance withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 主体的类别，现阶段分为：bounding_box和main_object_box
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ImageMainObjectDetectionInstance withLocation(Object location) {
        this.location = location;
        return this;
    }

    /**
     *  目标检测框位置信息，包括4个值：  width：检测框区域宽度  height：检测框区域高度  top_left_x：检测框左上角到垂直轴距离  top_left_y：检测框左上角到水平轴距离 properties: width: type: string description: 检测框区域高度 example: 139.58 height: type: string description: 检测框区域高度 example: 261.32 top_left_x: type: string description: 检测框左上角到垂直轴距离 example: 256.13 top_left_y: type: string description: 检测框左上角到水平轴距离 example: 85.2 
     * @return location
     */
    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public ImageMainObjectDetectionInstance withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 主体框的置信度,将Float型置信度转为String类型返回,Float取值范围（0~100）。
     * @return confidence
     */
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
        ImageMainObjectDetectionInstance imageMainObjectDetectionInstance = (ImageMainObjectDetectionInstance) o;
        return Objects.equals(this.label, imageMainObjectDetectionInstance.label)
            && Objects.equals(this.location, imageMainObjectDetectionInstance.location)
            && Objects.equals(this.confidence, imageMainObjectDetectionInstance.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, location, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageMainObjectDetectionInstance {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
