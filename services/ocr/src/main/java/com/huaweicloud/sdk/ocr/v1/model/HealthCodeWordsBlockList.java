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
public class HealthCodeWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<Integer> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    public HealthCodeWordsBlockList withWords(String words) {
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

    public HealthCodeWordsBlockList withLocation(List<Integer> location) {
        this.location = location;
        return this;
    }

    public HealthCodeWordsBlockList addLocationItem(Integer locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public HealthCodeWordsBlockList withLocation(Consumer<List<Integer>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 识别到的文字块的区域位置信息，列表形式，分别表示文字块4个顶点的（x,y）坐标。采用图像坐标系，图像坐标原点为图像左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<Integer> getLocation() {
        return location;
    }

    public void setLocation(List<Integer> location) {
        this.location = location;
    }

    public HealthCodeWordsBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthCodeWordsBlockList healthCodeWordsBlockList = (HealthCodeWordsBlockList) o;
        return Objects.equals(this.words, healthCodeWordsBlockList.words)
            && Objects.equals(this.location, healthCodeWordsBlockList.location)
            && Objects.equals(this.confidence, healthCodeWordsBlockList.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, location, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCodeWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
