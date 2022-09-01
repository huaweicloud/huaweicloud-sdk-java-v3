package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文字区域识别结果列表，输出顺序从左到右，先上后下。
 */
public class WordsRegionList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    @JacksonXmlProperty(localName = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    @JacksonXmlProperty(localName = "words_block_list")

    private List<GeneralTableWordsBlockList> wordsBlockList = null;

    public WordsRegionList withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 文字识别区域类型。 - text：文本识别区域; - table：表格识别区域。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WordsRegionList withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 子区域识别文字块数目。 
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public WordsRegionList withWordsBlockList(List<GeneralTableWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public WordsRegionList addWordsBlockListItem(GeneralTableWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public WordsRegionList withWordsBlockList(Consumer<List<GeneralTableWordsBlockList>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 子区域识别文字块列表，输出顺序从左到右，先上后下。 
     * @return wordsBlockList
     */
    public List<GeneralTableWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<GeneralTableWordsBlockList> wordsBlockList) {
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
        WordsRegionList wordsRegionList = (WordsRegionList) o;
        return Objects.equals(this.type, wordsRegionList.type)
            && Objects.equals(this.wordsBlockCount, wordsRegionList.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, wordsRegionList.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, wordsBlockCount, wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WordsRegionList {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
