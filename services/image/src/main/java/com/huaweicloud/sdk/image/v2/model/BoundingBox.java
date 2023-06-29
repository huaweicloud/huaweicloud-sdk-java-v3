package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目标检测框位置信息
 */
public class BoundingBox {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_x")

    private Integer topLeftX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_y")

    private Integer topLeftY;

    public BoundingBox withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 检测框区域宽度
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public BoundingBox withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 检测框区域高度
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public BoundingBox withTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
        return this;
    }

    /**
     * 检测框左上角到垂直轴距离
     * @return topLeftX
     */
    public Integer getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
    }

    public BoundingBox withTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
        return this;
    }

    /**
     * 检测框左上角到水平轴距离
     * @return topLeftY
     */
    public Integer getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BoundingBox that = (BoundingBox) obj;
        return Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.topLeftX, that.topLeftX) && Objects.equals(this.topLeftY, that.topLeftY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, topLeftX, topLeftY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoundingBox {\n");
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
