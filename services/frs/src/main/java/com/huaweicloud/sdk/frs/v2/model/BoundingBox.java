package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * BoundingBox
 */
public class BoundingBox {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    @JacksonXmlProperty(localName = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_y")

    @JacksonXmlProperty(localName = "top_left_y")

    private Integer topLeftY;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_left_x")

    @JacksonXmlProperty(localName = "top_left_x")

    private Integer topLeftX;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    @JacksonXmlProperty(localName = "height")

    private Integer height;

    public BoundingBox withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 矩形框宽度。
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public BoundingBox withTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
        return this;
    }

    /**
     * 矩形框左上角纵坐标。
     * @return topLeftY
     */
    public Integer getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
    }

    public BoundingBox withTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
        return this;
    }

    /**
     * 矩形框左上角横坐标。
     * @return topLeftX
     */
    public Integer getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
    }

    public BoundingBox withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 矩形框高度。
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) o;
        return Objects.equals(this.width, boundingBox.width) && Objects.equals(this.topLeftY, boundingBox.topLeftY)
            && Objects.equals(this.topLeftX, boundingBox.topLeftX) && Objects.equals(this.height, boundingBox.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, topLeftY, topLeftX, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoundingBox {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    topLeftY: ").append(toIndentedString(topLeftY)).append("\n");
        sb.append("    topLeftX: ").append(toIndentedString(topLeftX)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
