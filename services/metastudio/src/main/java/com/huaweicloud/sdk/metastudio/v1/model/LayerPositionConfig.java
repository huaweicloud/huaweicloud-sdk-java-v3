package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 图层位置配置。
 */
public class LayerPositionConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private Integer dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private Integer dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_index")

    private Integer layerIndex;

    public LayerPositionConfig withDx(Integer dx) {
        this.dx = dx;
        return this;
    }

    /**
     * 图层图片左上角像素点的X轴位置值（相对背景图片）。 > 横屏（16:9）背景图片像素为1920*1080；竖屏（9:16）背景图片像素为1080*1920。
     * minimum: -1920
     * maximum: 3840
     * @return dx
     */
    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public LayerPositionConfig withDy(Integer dy) {
        this.dy = dy;
        return this;
    }

    /**
     * 图层图片左上角像素点的Y轴位置值（相对背景图片）。 > 横屏（16:9）背景图片像素为1920*1080；竖屏（9:16）背景图片像素为1080*1920。
     * minimum: -1920
     * maximum: 3840
     * @return dy
     */
    public Integer getDy() {
        return dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }

    public LayerPositionConfig withLayerIndex(Integer layerIndex) {
        this.layerIndex = layerIndex;
        return this;
    }

    /**
     * 图片/视频/人物图的层顺序。 > * 图层顺序从1开始的整数，底层图层顺序是1，往上依次增加。
     * minimum: 1
     * maximum: 100
     * @return layerIndex
     */
    public Integer getLayerIndex() {
        return layerIndex;
    }

    public void setLayerIndex(Integer layerIndex) {
        this.layerIndex = layerIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LayerPositionConfig that = (LayerPositionConfig) obj;
        return Objects.equals(this.dx, that.dx) && Objects.equals(this.dy, that.dy)
            && Objects.equals(this.layerIndex, that.layerIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dx, dy, layerIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayerPositionConfig {\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    layerIndex: ").append(toIndentedString(layerIndex)).append("\n");
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
