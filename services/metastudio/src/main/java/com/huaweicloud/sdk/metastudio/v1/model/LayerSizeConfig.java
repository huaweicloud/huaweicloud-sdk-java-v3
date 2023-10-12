package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 图层大小配置。
 */
public class LayerSizeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    public LayerSizeConfig withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 图层图片宽度像素值（相对背景图片）。 > 横屏（16:9）背景图片像素为1920x1080；竖屏（9:16）背景图片像素为1080x1920。
     * minimum: 1
     * maximum: 7680
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public LayerSizeConfig withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 图层图片高度像素值（相对背景图片）。 > 横屏（16:9）背景图片像素为1920x1080；竖屏（9:16）背景图片像素为1080x1920。
     * minimum: 1
     * maximum: 7680
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LayerSizeConfig that = (LayerSizeConfig) obj;
        return Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayerSizeConfig {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
