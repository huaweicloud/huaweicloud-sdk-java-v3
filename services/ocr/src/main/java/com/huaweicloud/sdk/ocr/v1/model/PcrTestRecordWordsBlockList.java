package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PcrTestRecordWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    @JacksonXmlProperty(localName = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    @JacksonXmlProperty(localName = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private Float confidence;

    public PcrTestRecordWordsBlockList withWords(String words) {
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

    public PcrTestRecordWordsBlockList withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public PcrTestRecordWordsBlockList addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public PcrTestRecordWordsBlockList withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 识别到的文字块的区域位置信息，列表形式，分别表示文字块4个顶点的（x,y）坐标；采用图像坐标系，图像坐标原点为图像左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public PcrTestRecordWordsBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 字段的平均置信度，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。置信度由算法给出，不直接等价于对应字段的准确率。 
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
        PcrTestRecordWordsBlockList pcrTestRecordWordsBlockList = (PcrTestRecordWordsBlockList) o;
        return Objects.equals(this.words, pcrTestRecordWordsBlockList.words)
            && Objects.equals(this.location, pcrTestRecordWordsBlockList.location)
            && Objects.equals(this.confidence, pcrTestRecordWordsBlockList.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, location, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PcrTestRecordWordsBlockList {\n");
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
