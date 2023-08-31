package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerTableBlock
 */
public class SmartDocumentRecognizerTableBlock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    private List<SmartDocumentRecognizerTableWordsBlock> wordsBlockList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excel")

    private String excel;

    public SmartDocumentRecognizerTableBlock withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public SmartDocumentRecognizerTableBlock addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public SmartDocumentRecognizerTableBlock withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 当前表格的位置信息，列表形式，分别表示文字块4个顶点的x, y坐标；坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public SmartDocumentRecognizerTableBlock withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 表格中所包含的单元格数量。 
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public SmartDocumentRecognizerTableBlock withWordsBlockList(
        List<SmartDocumentRecognizerTableWordsBlock> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public SmartDocumentRecognizerTableBlock addWordsBlockListItem(
        SmartDocumentRecognizerTableWordsBlock wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public SmartDocumentRecognizerTableBlock withWordsBlockList(
        Consumer<List<SmartDocumentRecognizerTableWordsBlock>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 单元格识别结果列表。 
     * @return wordsBlockList
     */
    public List<SmartDocumentRecognizerTableWordsBlock> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<SmartDocumentRecognizerTableWordsBlock> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    public SmartDocumentRecognizerTableBlock withExcel(String excel) {
        this.excel = excel;
        return this;
    }

    /**
     * 表格识别结果的base64编码，仅当return_excel为True时返回该字段。对返回的excel编码可用base64.b64decode解码并保存为.xlsx文件。 
     * @return excel
     */
    public String getExcel() {
        return excel;
    }

    public void setExcel(String excel) {
        this.excel = excel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerTableBlock that = (SmartDocumentRecognizerTableBlock) obj;
        return Objects.equals(this.location, that.location)
            && Objects.equals(this.wordsBlockCount, that.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, that.wordsBlockList) && Objects.equals(this.excel, that.excel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, wordsBlockCount, wordsBlockList, excel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerTableBlock {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    wordsBlockList: ").append(toIndentedString(wordsBlockList)).append("\n");
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
