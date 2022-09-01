package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 识别文字块列表，输出顺序从左到右，先上后下。
 */
public class GeneralTextWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    @JacksonXmlProperty(localName = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    @JacksonXmlProperty(localName = "location")

    private List<List<Integer>> location = null;

    public GeneralTextWordsBlockList withWords(String words) {
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

    public GeneralTextWordsBlockList withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public GeneralTextWordsBlockList addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public GeneralTextWordsBlockList withLocation(Consumer<List<List<Integer>>> locationSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeneralTextWordsBlockList generalTextWordsBlockList = (GeneralTextWordsBlockList) o;
        return Objects.equals(this.words, generalTextWordsBlockList.words)
            && Objects.equals(this.location, generalTextWordsBlockList.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralTextWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
