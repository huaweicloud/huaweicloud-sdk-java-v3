package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerWordsBlockList
 */
public class SmartDocumentRecognizerWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "char_list")

    private List<SmartDocumentRecognizerCharList> charList = null;

    public SmartDocumentRecognizerWordsBlockList withWords(String words) {
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

    public SmartDocumentRecognizerWordsBlockList withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public SmartDocumentRecognizerWordsBlockList addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public SmartDocumentRecognizerWordsBlockList withLocation(Consumer<List<List<Integer>>> locationSetter) {
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

    public SmartDocumentRecognizerWordsBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 文字块识别结果的置信度。 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public SmartDocumentRecognizerWordsBlockList withCharList(List<SmartDocumentRecognizerCharList> charList) {
        this.charList = charList;
        return this;
    }

    public SmartDocumentRecognizerWordsBlockList addCharListItem(SmartDocumentRecognizerCharList charListItem) {
        if (this.charList == null) {
            this.charList = new ArrayList<>();
        }
        this.charList.add(charListItem);
        return this;
    }

    public SmartDocumentRecognizerWordsBlockList withCharList(
        Consumer<List<SmartDocumentRecognizerCharList>> charListSetter) {
        if (this.charList == null) {
            this.charList = new ArrayList<>();
        }
        charListSetter.accept(this.charList);
        return this;
    }

    /**
     * 当入参character_mode为True时返回该字段，表示当前文字块对应的单字符识别列表，输出顺序从左到右，先上后下。 
     * @return charList
     */
    public List<SmartDocumentRecognizerCharList> getCharList() {
        return charList;
    }

    public void setCharList(List<SmartDocumentRecognizerCharList> charList) {
        this.charList = charList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerWordsBlockList that = (SmartDocumentRecognizerWordsBlockList) obj;
        return Objects.equals(this.words, that.words) && Objects.equals(this.location, that.location)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.charList, that.charList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, location, confidence, charList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    charList: ").append(toIndentedString(charList)).append("\n");
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
