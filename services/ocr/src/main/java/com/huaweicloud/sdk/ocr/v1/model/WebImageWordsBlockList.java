package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class WebImageWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_list")

    private List<String> fontList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_scores")

    private List<Float> fontScores = null;

    public WebImageWordsBlockList withWords(String words) {
        this.words = words;
        return this;
    }

    /**
     * 文字块识别结果。 
     * @return words
     */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public WebImageWordsBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public WebImageWordsBlockList withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public WebImageWordsBlockList addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public WebImageWordsBlockList withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 文字块的区域位置信息，列表形式，包含文字区域四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public WebImageWordsBlockList withFontList(List<String> fontList) {
        this.fontList = fontList;
        return this;
    }

    public WebImageWordsBlockList addFontListItem(String fontListItem) {
        if (this.fontList == null) {
            this.fontList = new ArrayList<>();
        }
        this.fontList.add(fontListItem);
        return this;
    }

    public WebImageWordsBlockList withFontList(Consumer<List<String>> fontListSetter) {
        if (this.fontList == null) {
            this.fontList = new ArrayList<>();
        }
        fontListSetter.accept(this.fontList);
        return this;
    }

    /**
     * 文字块所属字体类型，列表形式，表示与文字块的文字最接近的字体类型。 
     * @return fontList
     */
    public List<String> getFontList() {
        return fontList;
    }

    public void setFontList(List<String> fontList) {
        this.fontList = fontList;
    }

    public WebImageWordsBlockList withFontScores(List<Float> fontScores) {
        this.fontScores = fontScores;
        return this;
    }

    public WebImageWordsBlockList addFontScoresItem(Float fontScoresItem) {
        if (this.fontScores == null) {
            this.fontScores = new ArrayList<>();
        }
        this.fontScores.add(fontScoresItem);
        return this;
    }

    public WebImageWordsBlockList withFontScores(Consumer<List<Float>> fontScoresSetter) {
        if (this.fontScores == null) {
            this.fontScores = new ArrayList<>();
        }
        fontScoresSetter.accept(this.fontScores);
        return this;
    }

    /**
     * 文字块所属字体类型的概率，列表形式，与font_list一一对应，表示文字块的文字属于某种字体类型的概率。 
     * @return fontScores
     */
    public List<Float> getFontScores() {
        return fontScores;
    }

    public void setFontScores(List<Float> fontScores) {
        this.fontScores = fontScores;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebImageWordsBlockList that = (WebImageWordsBlockList) obj;
        return Objects.equals(this.words, that.words) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.location, that.location) && Objects.equals(this.fontList, that.fontList)
            && Objects.equals(this.fontScores, that.fontScores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, confidence, location, fontList, fontScores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebImageWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    fontList: ").append(toIndentedString(fontList)).append("\n");
        sb.append("    fontScores: ").append(toIndentedString(fontScores)).append("\n");
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
