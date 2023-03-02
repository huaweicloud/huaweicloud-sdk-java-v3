package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 字体描边配置
 */
public class VideoTranslateInferenceRewriteConfigStroke {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stroke_color")

    private List<Integer> strokeColor = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_color")

    private List<Integer> fontColor = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stroke_ratio")

    private Float strokeRatio;

    public VideoTranslateInferenceRewriteConfigStroke withStrokeColor(List<Integer> strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    public VideoTranslateInferenceRewriteConfigStroke addStrokeColorItem(Integer strokeColorItem) {
        if (this.strokeColor == null) {
            this.strokeColor = new ArrayList<>();
        }
        this.strokeColor.add(strokeColorItem);
        return this;
    }

    public VideoTranslateInferenceRewriteConfigStroke withStrokeColor(Consumer<List<Integer>> strokeColorSetter) {
        if (this.strokeColor == null) {
            this.strokeColor = new ArrayList<>();
        }
        strokeColorSetter.accept(this.strokeColor);
        return this;
    }

    /**
     * 文本描边颜色
     * @return strokeColor
     */
    public List<Integer> getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(List<Integer> strokeColor) {
        this.strokeColor = strokeColor;
    }

    public VideoTranslateInferenceRewriteConfigStroke withFontColor(List<Integer> fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    public VideoTranslateInferenceRewriteConfigStroke addFontColorItem(Integer fontColorItem) {
        if (this.fontColor == null) {
            this.fontColor = new ArrayList<>();
        }
        this.fontColor.add(fontColorItem);
        return this;
    }

    public VideoTranslateInferenceRewriteConfigStroke withFontColor(Consumer<List<Integer>> fontColorSetter) {
        if (this.fontColor == null) {
            this.fontColor = new ArrayList<>();
        }
        fontColorSetter.accept(this.fontColor);
        return this;
    }

    /**
     * 文本字体颜色
     * @return fontColor
     */
    public List<Integer> getFontColor() {
        return fontColor;
    }

    public void setFontColor(List<Integer> fontColor) {
        this.fontColor = fontColor;
    }

    public VideoTranslateInferenceRewriteConfigStroke withStrokeRatio(Float strokeRatio) {
        this.strokeRatio = strokeRatio;
        return this;
    }

    /**
     * 描边宽度
     * @return strokeRatio
     */
    public Float getStrokeRatio() {
        return strokeRatio;
    }

    public void setStrokeRatio(Float strokeRatio) {
        this.strokeRatio = strokeRatio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoTranslateInferenceRewriteConfigStroke videoTranslateInferenceRewriteConfigStroke =
            (VideoTranslateInferenceRewriteConfigStroke) o;
        return Objects.equals(this.strokeColor, videoTranslateInferenceRewriteConfigStroke.strokeColor)
            && Objects.equals(this.fontColor, videoTranslateInferenceRewriteConfigStroke.fontColor)
            && Objects.equals(this.strokeRatio, videoTranslateInferenceRewriteConfigStroke.strokeRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strokeColor, fontColor, strokeRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTranslateInferenceRewriteConfigStroke {\n");
        sb.append("    strokeColor: ").append(toIndentedString(strokeColor)).append("\n");
        sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
        sb.append("    strokeRatio: ").append(toIndentedString(strokeRatio)).append("\n");
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
