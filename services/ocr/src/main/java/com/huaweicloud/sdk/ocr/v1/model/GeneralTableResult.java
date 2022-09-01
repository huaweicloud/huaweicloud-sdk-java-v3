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
public class GeneralTableResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_region_count")

    @JacksonXmlProperty(localName = "words_region_count")

    private Integer wordsRegionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_region_list")

    @JacksonXmlProperty(localName = "words_region_list")

    private List<WordsRegionList> wordsRegionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excel")

    @JacksonXmlProperty(localName = "excel")

    private String excel;

    public GeneralTableResult withWordsRegionCount(Integer wordsRegionCount) {
        this.wordsRegionCount = wordsRegionCount;
        return this;
    }

    /**
     * 文字区域数目。          
     * @return wordsRegionCount
     */
    public Integer getWordsRegionCount() {
        return wordsRegionCount;
    }

    public void setWordsRegionCount(Integer wordsRegionCount) {
        this.wordsRegionCount = wordsRegionCount;
    }

    public GeneralTableResult withWordsRegionList(List<WordsRegionList> wordsRegionList) {
        this.wordsRegionList = wordsRegionList;
        return this;
    }

    public GeneralTableResult addWordsRegionListItem(WordsRegionList wordsRegionListItem) {
        if (this.wordsRegionList == null) {
            this.wordsRegionList = new ArrayList<>();
        }
        this.wordsRegionList.add(wordsRegionListItem);
        return this;
    }

    public GeneralTableResult withWordsRegionList(Consumer<List<WordsRegionList>> wordsRegionListSetter) {
        if (this.wordsRegionList == null) {
            this.wordsRegionList = new ArrayList<>();
        }
        wordsRegionListSetter.accept(this.wordsRegionList);
        return this;
    }

    /**
     * 文字区域识别结果列表，输出顺序从左到右，先上后下。 
     * @return wordsRegionList
     */
    public List<WordsRegionList> getWordsRegionList() {
        return wordsRegionList;
    }

    public void setWordsRegionList(List<WordsRegionList> wordsRegionList) {
        this.wordsRegionList = wordsRegionList;
    }

    public GeneralTableResult withExcel(String excel) {
        this.excel = excel;
        return this;
    }

    /**
     * 表格图像转换为excel的base64编码，图像中的文字和表格按位置写入excel。对返回的excel编码可用base64.b64decode解码并保存为.xlsx文件。 
     * @return excel
     */
    public String getExcel() {
        return excel;
    }

    public void setExcel(String excel) {
        this.excel = excel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeneralTableResult generalTableResult = (GeneralTableResult) o;
        return Objects.equals(this.wordsRegionCount, generalTableResult.wordsRegionCount)
            && Objects.equals(this.wordsRegionList, generalTableResult.wordsRegionList)
            && Objects.equals(this.excel, generalTableResult.excel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordsRegionCount, wordsRegionList, excel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralTableResult {\n");
        sb.append("    wordsRegionCount: ").append(toIndentedString(wordsRegionCount)).append("\n");
        sb.append("    wordsRegionList: ").append(toIndentedString(wordsRegionList)).append("\n");
        sb.append("    excel: ").append(toIndentedString(excel)).append("\n");
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
