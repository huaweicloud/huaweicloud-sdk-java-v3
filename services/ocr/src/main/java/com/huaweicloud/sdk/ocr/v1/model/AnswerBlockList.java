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
public class AnswerBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<Integer> location = null;

    public AnswerBlockList withWords(String words) {
        this.words = words;
        return this;
    }

    /** 文字块识别结果。
     * 
     * @return words */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public AnswerBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /** 文字块words的置信度。
     * 
     * @return confidence */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public AnswerBlockList withLocation(List<Integer> location) {
        this.location = location;
        return this;
    }

    public AnswerBlockList addLocationItem(Integer locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public AnswerBlockList withLocation(Consumer<List<Integer>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /** 文字块words的区域位置信息，列表形式，分别表示文字块顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。
     * 
     * @return location */
    public List<Integer> getLocation() {
        return location;
    }

    public void setLocation(List<Integer> location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnswerBlockList answerBlockList = (AnswerBlockList) o;
        return Objects.equals(this.words, answerBlockList.words)
            && Objects.equals(this.confidence, answerBlockList.confidence)
            && Objects.equals(this.location, answerBlockList.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, confidence, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnswerBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
