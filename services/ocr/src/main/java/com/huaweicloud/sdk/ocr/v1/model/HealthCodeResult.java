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
public class HealthCodeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    @JacksonXmlProperty(localName = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private Object confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    @JacksonXmlProperty(localName = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    @JacksonXmlProperty(localName = "words_block_list")

    private List<HealthCodeWordsBlockList> wordsBlockList = null;

    public HealthCodeResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthCodeResult withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 健康码更新时间 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HealthCodeResult withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 健康码颜色，可选值包括： - \"green\" - \"yellow\" - \"red\" - \"gray\" 
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HealthCodeResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public HealthCodeResult withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 代表检测识别出来的文字块数目。 
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public HealthCodeResult withWordsBlockList(List<HealthCodeWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public HealthCodeResult addWordsBlockListItem(HealthCodeWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public HealthCodeResult withWordsBlockList(Consumer<List<HealthCodeWordsBlockList>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 识别文字块列表，输出顺序从左到右，从上到下。 
     * @return wordsBlockList
     */
    public List<HealthCodeWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<HealthCodeWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthCodeResult healthCodeResult = (HealthCodeResult) o;
        return Objects.equals(this.name, healthCodeResult.name) && Objects.equals(this.time, healthCodeResult.time)
            && Objects.equals(this.color, healthCodeResult.color)
            && Objects.equals(this.confidence, healthCodeResult.confidence)
            && Objects.equals(this.wordsBlockCount, healthCodeResult.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, healthCodeResult.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time, color, confidence, wordsBlockCount, wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCodeResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    wordsBlockList: ").append(toIndentedString(wordsBlockList)).append("\n");
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
