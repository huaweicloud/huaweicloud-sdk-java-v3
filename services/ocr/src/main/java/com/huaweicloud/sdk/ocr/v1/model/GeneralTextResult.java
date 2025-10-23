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
public class GeneralTextResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private Float direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    private List<GeneralTextWordsBlockList> wordsBlockList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "markdown_result")

    private String markdownResult;

    public GeneralTextResult withDirection(Float direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 图片朝向，仅当detect_direction为true时，该字段有效。返回图片逆时针旋转角度，值区间为[0， 359],保留四位小数。 当detect_direction为false时，该字段值为 -1。 
     * @return direction
     */
    public Float getDirection() {
        return direction;
    }

    public void setDirection(Float direction) {
        this.direction = direction;
    }

    public GeneralTextResult withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 识别文字块数目。 
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public GeneralTextResult withWordsBlockList(List<GeneralTextWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public GeneralTextResult addWordsBlockListItem(GeneralTextWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public GeneralTextResult withWordsBlockList(Consumer<List<GeneralTextWordsBlockList>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 识别文字块列表，输出顺序从左到右，先上后下。 
     * @return wordsBlockList
     */
    public List<GeneralTextWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<GeneralTextWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    public GeneralTextResult withMarkdownResult(String markdownResult) {
        this.markdownResult = markdownResult;
        return this;
    }

    /**
     * 所有文字块拼接的识别结果，同一行的文字块使用“\\t”拼接，不同行的文字块使用“\\n”拼接。 当return_markdown_result为true时，返回该字段值，否则，不返回该字段。 
     * @return markdownResult
     */
    public String getMarkdownResult() {
        return markdownResult;
    }

    public void setMarkdownResult(String markdownResult) {
        this.markdownResult = markdownResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralTextResult that = (GeneralTextResult) obj;
        return Objects.equals(this.direction, that.direction)
            && Objects.equals(this.wordsBlockCount, that.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, that.wordsBlockList)
            && Objects.equals(this.markdownResult, that.markdownResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, wordsBlockCount, wordsBlockList, markdownResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralTextResult {\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    wordsBlockList: ").append(toIndentedString(wordsBlockList)).append("\n");
        sb.append("    markdownResult: ").append(toIndentedString(markdownResult)).append("\n");
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
