package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目标检测框位置信息
 */
public class ImageTaggingBoundingBox {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Double width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Double height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_x")

    private Double topLeftX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_y")

    private Double topLeftY;

    public ImageTaggingBoundingBox withWidth(Double width) {
        this.width = width;
        return this;
    }

    /**
     * 检测框区域宽度
     * @return width
     */
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public ImageTaggingBoundingBox withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * 检测框区域高度
     * @return height
     */
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public ImageTaggingBoundingBox withTopLeftX(Double topLeftX) {
        this.topLeftX = topLeftX;
        return this;
    }

    /**
     * 检测框左上角到垂直轴距离
     * @return topLeftX
     */
    public Double getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Double topLeftX) {
        this.topLeftX = topLeftX;
    }

    public ImageTaggingBoundingBox withTopLeftY(Double topLeftY) {
        this.topLeftY = topLeftY;
        return this;
    }

    /**
     * 检测框左上角到水平轴距离
     * @return topLeftY
     */
    public Double getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Double topLeftY) {
        this.topLeftY = topLeftY;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageTaggingBoundingBox imageTaggingBoundingBox = (ImageTaggingBoundingBox) o;
        return Objects.equals(this.width, imageTaggingBoundingBox.width)
            && Objects.equals(this.height, imageTaggingBoundingBox.height)
            && Objects.equals(this.topLeftX, imageTaggingBoundingBox.topLeftX)
            && Objects.equals(this.topLeftY, imageTaggingBoundingBox.topLeftY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, topLeftX, topLeftY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingBoundingBox {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    topLeftX: ").append(toIndentedString(topLeftX)).append("\n");
        sb.append("    topLeftY: ").append(toIndentedString(topLeftY)).append("\n");
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
