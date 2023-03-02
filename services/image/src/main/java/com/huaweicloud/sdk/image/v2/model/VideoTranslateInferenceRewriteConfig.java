package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 回写配置
 */
public class VideoTranslateInferenceRewriteConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_type")

    private String fontType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_row_interval")

    private Float rewriteRowInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stroke")

    private VideoTranslateInferenceRewriteConfigStroke stroke;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background")

    private VideoTranslateInferenceRewriteConfigBackground background;

    public VideoTranslateInferenceRewriteConfig withFontType(String fontType) {
        this.fontType = fontType;
        return this;
    }

    /**
     * 字体类型
     * @return fontType
     */
    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public VideoTranslateInferenceRewriteConfig withRewriteRowInterval(Float rewriteRowInterval) {
        this.rewriteRowInterval = rewriteRowInterval;
        return this;
    }

    /**
     * 字幕字体行间距
     * minimum: 0
     * maximum: 1
     * @return rewriteRowInterval
     */
    public Float getRewriteRowInterval() {
        return rewriteRowInterval;
    }

    public void setRewriteRowInterval(Float rewriteRowInterval) {
        this.rewriteRowInterval = rewriteRowInterval;
    }

    public VideoTranslateInferenceRewriteConfig withStroke(VideoTranslateInferenceRewriteConfigStroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public VideoTranslateInferenceRewriteConfig withStroke(
        Consumer<VideoTranslateInferenceRewriteConfigStroke> strokeSetter) {
        if (this.stroke == null) {
            this.stroke = new VideoTranslateInferenceRewriteConfigStroke();
            strokeSetter.accept(this.stroke);
        }

        return this;
    }

    /**
     * Get stroke
     * @return stroke
     */
    public VideoTranslateInferenceRewriteConfigStroke getStroke() {
        return stroke;
    }

    public void setStroke(VideoTranslateInferenceRewriteConfigStroke stroke) {
        this.stroke = stroke;
    }

    public VideoTranslateInferenceRewriteConfig withBackground(
        VideoTranslateInferenceRewriteConfigBackground background) {
        this.background = background;
        return this;
    }

    public VideoTranslateInferenceRewriteConfig withBackground(
        Consumer<VideoTranslateInferenceRewriteConfigBackground> backgroundSetter) {
        if (this.background == null) {
            this.background = new VideoTranslateInferenceRewriteConfigBackground();
            backgroundSetter.accept(this.background);
        }

        return this;
    }

    /**
     * Get background
     * @return background
     */
    public VideoTranslateInferenceRewriteConfigBackground getBackground() {
        return background;
    }

    public void setBackground(VideoTranslateInferenceRewriteConfigBackground background) {
        this.background = background;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoTranslateInferenceRewriteConfig videoTranslateInferenceRewriteConfig =
            (VideoTranslateInferenceRewriteConfig) o;
        return Objects.equals(this.fontType, videoTranslateInferenceRewriteConfig.fontType)
            && Objects.equals(this.rewriteRowInterval, videoTranslateInferenceRewriteConfig.rewriteRowInterval)
            && Objects.equals(this.stroke, videoTranslateInferenceRewriteConfig.stroke)
            && Objects.equals(this.background, videoTranslateInferenceRewriteConfig.background);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontType, rewriteRowInterval, stroke, background);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTranslateInferenceRewriteConfig {\n");
        sb.append("    fontType: ").append(toIndentedString(fontType)).append("\n");
        sb.append("    rewriteRowInterval: ").append(toIndentedString(rewriteRowInterval)).append("\n");
        sb.append("    stroke: ").append(toIndentedString(stroke)).append("\n");
        sb.append("    background: ").append(toIndentedString(background)).append("\n");
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
