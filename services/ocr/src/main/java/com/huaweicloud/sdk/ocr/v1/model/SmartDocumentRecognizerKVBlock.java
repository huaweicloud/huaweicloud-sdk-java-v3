package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerKVBlock
 */
public class SmartDocumentRecognizerKVBlock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    private List<SmartDocumentRecognizerKVWordsBlock> wordsBlockList = null;

    public SmartDocumentRecognizerKVBlock withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * key-value对（键值对）中的key，例如“姓名：小明”中的“姓名” 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SmartDocumentRecognizerKVBlock withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * key-value对（键值对）中的value，例如“姓名：小明”中的“小明” 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SmartDocumentRecognizerKVBlock withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 该键值对中所包含的文本框数量。   
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public SmartDocumentRecognizerKVBlock withWordsBlockList(List<SmartDocumentRecognizerKVWordsBlock> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public SmartDocumentRecognizerKVBlock addWordsBlockListItem(
        SmartDocumentRecognizerKVWordsBlock wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public SmartDocumentRecognizerKVBlock withWordsBlockList(
        Consumer<List<SmartDocumentRecognizerKVWordsBlock>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 文本框识别结果列表。 
     * @return wordsBlockList
     */
    public List<SmartDocumentRecognizerKVWordsBlock> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<SmartDocumentRecognizerKVWordsBlock> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerKVBlock that = (SmartDocumentRecognizerKVBlock) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.wordsBlockCount, that.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, that.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, wordsBlockCount, wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerKVBlock {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
