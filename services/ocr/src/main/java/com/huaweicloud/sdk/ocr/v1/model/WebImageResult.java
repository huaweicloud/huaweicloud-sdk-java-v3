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
public class WebImageResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    @JacksonXmlProperty(localName = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    @JacksonXmlProperty(localName = "words_block_list")

    private List<WebImageWordsBlockList> wordsBlockList = null;

    public WebImageResult withWordsBlockCount(Integer wordsBlockCount) {
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

    public WebImageResult withWordsBlockList(List<WebImageWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public WebImageResult addWordsBlockListItem(WebImageWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public WebImageResult withWordsBlockList(Consumer<List<WebImageWordsBlockList>> wordsBlockListSetter) {
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
    public List<WebImageWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<WebImageWordsBlockList> wordsBlockList) {
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
        WebImageResult webImageResult = (WebImageResult) o;
        return Objects.equals(this.wordsBlockCount, webImageResult.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, webImageResult.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordsBlockCount, wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebImageResult {\n");
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
