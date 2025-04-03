package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 背景图片大小及位置配置。
 */
public class BackgroundImageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private Integer dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private Integer dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    public BackgroundImageConfig withDx(Integer dx) {
        this.dx = dx;
        return this;
    }

    /**
     * **参数解释**： 背景图片左上角像素点的X轴位置值（画布左上角坐标是0x0）。 横屏（16:9）画布像素为1920x1080；竖屏（9:16）画布像素为1080x1920。  **约束限制**： 需要保证背景图片要铺满画布。即dx <= 0，并且横屏时dx + width >=1920，竖屏时dx + width >=1080。
     * minimum: -5760
     * maximum: 0
     * @return dx
     */
    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public BackgroundImageConfig withDy(Integer dy) {
        this.dy = dy;
        return this;
    }

    /**
     * **参数解释**： 背景图片左上角像素点的Y轴位置值（画布左上角坐标是0x0）。 横屏（16:9）画布像素为1920x1080；竖屏（9:16）画布像素为1080x1920。  **约束限制**：  需要保证背景图片要铺满画布。即dy <= 0，并且横屏时dy + height >=1080，竖屏时dy + height >=1920。
     * minimum: -5760
     * maximum: 0
     * @return dy
     */
    public Integer getDy() {
        return dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }

    public BackgroundImageConfig withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * **参数解释**： 背景图片宽度像素值（相对画布大小）。 横屏（16:9）画布像素为1920x1080；竖屏（9:16）画布像素为1080x1920。  **约束限制**： 需要保证背景图片要铺满画布。即width > 1080，并且横屏时dx + width >=1920，竖屏时dx + width >=1080。
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

    public BackgroundImageConfig withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * **参数解释**： 背景图片高度像素值（相对画布大小）。 横屏（16:9）画布像素为1920x1080；竖屏（9:16）画布像素为1080x1920。  **约束限制**： 需要保证背景图片要铺满画布。height> 1080，并且横屏时dy + height >=1080，竖屏时dy + height >=1920。
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
        BackgroundImageConfig that = (BackgroundImageConfig) obj;
        return Objects.equals(this.dx, that.dx) && Objects.equals(this.dy, that.dy)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dx, dy, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackgroundImageConfig {\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
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
