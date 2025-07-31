package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单元格内文字段列表。 
 */
public class WordsListItem {

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
    @JsonProperty(value = "char_list")

    private List<CharListItem> charList = null;

    public WordsListItem withWords(String words) {
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

    public WordsListItem withConfidence(Float confidence) {
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

    public WordsListItem withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public WordsListItem addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public WordsListItem withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 文字块位置信息，列表形式，分别表示文字块4个顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public WordsListItem withCharList(List<CharListItem> charList) {
        this.charList = charList;
        return this;
    }

    public WordsListItem addCharListItem(CharListItem charListItem) {
        if (this.charList == null) {
            this.charList = new ArrayList<>();
        }
        this.charList.add(charListItem);
        return this;
    }

    public WordsListItem withCharList(Consumer<List<CharListItem>> charListSetter) {
        if (this.charList == null) {
            this.charList = new ArrayList<>();
        }
        charListSetter.accept(this.charList);
        return this;
    }

    /**
     * 单元格内文字段列表。输出顺序从左到右，从上到下。仅当入参\"return_text_location\"和\"return_char_location\"同时为true时存在。 
     * @return charList
     */
    public List<CharListItem> getCharList() {
        return charList;
    }

    public void setCharList(List<CharListItem> charList) {
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
        WordsListItem that = (WordsListItem) obj;
        return Objects.equals(this.words, that.words) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.location, that.location) && Objects.equals(this.charList, that.charList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, confidence, location, charList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WordsListItem {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
