package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto crerate Body Object
 */
public class ImageWisedesignCombineReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canvas_w")

    private Integer canvasW;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canvas_h")

    private Integer canvasH;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layers")

    private List<ImageWisedesignCombineBody> layers = null;

    public ImageWisedesignCombineReq withCanvasW(Integer canvasW) {
        this.canvasW = canvasW;
        return this;
    }

    /**
     * 画布的宽度
     * @return canvasW
     */
    public Integer getCanvasW() {
        return canvasW;
    }

    public void setCanvasW(Integer canvasW) {
        this.canvasW = canvasW;
    }

    public ImageWisedesignCombineReq withCanvasH(Integer canvasH) {
        this.canvasH = canvasH;
        return this;
    }

    /**
     * 画布的高度
     * @return canvasH
     */
    public Integer getCanvasH() {
        return canvasH;
    }

    public void setCanvasH(Integer canvasH) {
        this.canvasH = canvasH;
    }

    public ImageWisedesignCombineReq withLayers(List<ImageWisedesignCombineBody> layers) {
        this.layers = layers;
        return this;
    }

    public ImageWisedesignCombineReq addLayersItem(ImageWisedesignCombineBody layersItem) {
        if (this.layers == null) {
            this.layers = new ArrayList<>();
        }
        this.layers.add(layersItem);
        return this;
    }

    public ImageWisedesignCombineReq withLayers(Consumer<List<ImageWisedesignCombineBody>> layersSetter) {
        if (this.layers == null) {
            this.layers = new ArrayList<>();
        }
        layersSetter.accept(this.layers);
        return this;
    }

    /**
     * 图片合成的层级详细信息
     * @return layers
     */
    public List<ImageWisedesignCombineBody> getLayers() {
        return layers;
    }

    public void setLayers(List<ImageWisedesignCombineBody> layers) {
        this.layers = layers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageWisedesignCombineReq imageWisedesignCombineReq = (ImageWisedesignCombineReq) o;
        return Objects.equals(this.canvasW, imageWisedesignCombineReq.canvasW)
            && Objects.equals(this.canvasH, imageWisedesignCombineReq.canvasH)
            && Objects.equals(this.layers, imageWisedesignCombineReq.layers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canvasW, canvasH, layers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWisedesignCombineReq {\n");
        sb.append("    canvasW: ").append(toIndentedString(canvasW)).append("\n");
        sb.append("    canvasH: ").append(toIndentedString(canvasH)).append("\n");
        sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
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
