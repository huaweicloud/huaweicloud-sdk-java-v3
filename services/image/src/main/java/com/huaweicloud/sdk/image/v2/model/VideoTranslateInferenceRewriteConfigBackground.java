package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 背景框配置
 */
public class VideoTranslateInferenceRewriteConfigBackground {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "box_color")

    private List<Integer> boxColor = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_font_color")

    private List<Integer> backgroundFontColor = null;

    public VideoTranslateInferenceRewriteConfigBackground withBoxColor(List<Integer> boxColor) {
        this.boxColor = boxColor;
        return this;
    }

    public VideoTranslateInferenceRewriteConfigBackground addBoxColorItem(Integer boxColorItem) {
        if (this.boxColor == null) {
            this.boxColor = new ArrayList<>();
        }
        this.boxColor.add(boxColorItem);
        return this;
    }

    public VideoTranslateInferenceRewriteConfigBackground withBoxColor(Consumer<List<Integer>> boxColorSetter) {
        if (this.boxColor == null) {
            this.boxColor = new ArrayList<>();
        }
        boxColorSetter.accept(this.boxColor);
        return this;
    }

    /**
     * 文本背景框颜色
     * @return boxColor
     */
    public List<Integer> getBoxColor() {
        return boxColor;
    }

    public void setBoxColor(List<Integer> boxColor) {
        this.boxColor = boxColor;
    }

    public VideoTranslateInferenceRewriteConfigBackground withBackgroundFontColor(List<Integer> backgroundFontColor) {
        this.backgroundFontColor = backgroundFontColor;
        return this;
    }

    public VideoTranslateInferenceRewriteConfigBackground addBackgroundFontColorItem(Integer backgroundFontColorItem) {
        if (this.backgroundFontColor == null) {
            this.backgroundFontColor = new ArrayList<>();
        }
        this.backgroundFontColor.add(backgroundFontColorItem);
        return this;
    }

    public VideoTranslateInferenceRewriteConfigBackground withBackgroundFontColor(
        Consumer<List<Integer>> backgroundFontColorSetter) {
        if (this.backgroundFontColor == null) {
            this.backgroundFontColor = new ArrayList<>();
        }
        backgroundFontColorSetter.accept(this.backgroundFontColor);
        return this;
    }

    /**
     * 文本字体颜色
     * @return backgroundFontColor
     */
    public List<Integer> getBackgroundFontColor() {
        return backgroundFontColor;
    }

    public void setBackgroundFontColor(List<Integer> backgroundFontColor) {
        this.backgroundFontColor = backgroundFontColor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoTranslateInferenceRewriteConfigBackground videoTranslateInferenceRewriteConfigBackground =
            (VideoTranslateInferenceRewriteConfigBackground) o;
        return Objects.equals(this.boxColor, videoTranslateInferenceRewriteConfigBackground.boxColor) && Objects
            .equals(this.backgroundFontColor, videoTranslateInferenceRewriteConfigBackground.backgroundFontColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxColor, backgroundFontColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTranslateInferenceRewriteConfigBackground {\n");
        sb.append("    boxColor: ").append(toIndentedString(boxColor)).append("\n");
        sb.append("    backgroundFontColor: ").append(toIndentedString(backgroundFontColor)).append("\n");
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
