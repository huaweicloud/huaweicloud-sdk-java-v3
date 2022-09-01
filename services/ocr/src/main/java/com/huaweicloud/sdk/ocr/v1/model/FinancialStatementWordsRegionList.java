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
public class FinancialStatementWordsRegionList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    @JacksonXmlProperty(localName = "words_block_count")

    private Float wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_location")

    @JacksonXmlProperty(localName = "table_location")

    private List<List<Integer>> tableLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    @JacksonXmlProperty(localName = "words_block_list")

    private List<FinancialStatementWordsBlockList> wordsBlockList = null;

    public FinancialStatementWordsRegionList withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 区域属性：文本或表格。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FinancialStatementWordsRegionList withWordsBlockCount(Float wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 区域内文字块数目。对文本区，文字块以文本字段为单位；对表格区，文字块以单元格内所有字段为单位。 
     * @return wordsBlockCount
     */
    public Float getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Float wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public FinancialStatementWordsRegionList withTableLocation(List<List<Integer>> tableLocation) {
        this.tableLocation = tableLocation;
        return this;
    }

    public FinancialStatementWordsRegionList addTableLocationItem(List<Integer> tableLocationItem) {
        if (this.tableLocation == null) {
            this.tableLocation = new ArrayList<>();
        }
        this.tableLocation.add(tableLocationItem);
        return this;
    }

    public FinancialStatementWordsRegionList withTableLocation(Consumer<List<List<Integer>>> tableLocationSetter) {
        if (this.tableLocation == null) {
            this.tableLocation = new ArrayList<>();
        }
        tableLocationSetter.accept(this.tableLocation);
        return this;
    }

    /**
     * 表格位置信息，列表形式，分别表示表格4个顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return tableLocation
     */
    public List<List<Integer>> getTableLocation() {
        return tableLocation;
    }

    public void setTableLocation(List<List<Integer>> tableLocation) {
        this.tableLocation = tableLocation;
    }

    public FinancialStatementWordsRegionList withWordsBlockList(List<FinancialStatementWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public FinancialStatementWordsRegionList addWordsBlockListItem(
        FinancialStatementWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public FinancialStatementWordsRegionList withWordsBlockList(
        Consumer<List<FinancialStatementWordsBlockList>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 区域内文字块列表，输出顺序从左到右，从上到下。 
     * @return wordsBlockList
     */
    public List<FinancialStatementWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<FinancialStatementWordsBlockList> wordsBlockList) {
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
        FinancialStatementWordsRegionList financialStatementWordsRegionList = (FinancialStatementWordsRegionList) o;
        return Objects.equals(this.type, financialStatementWordsRegionList.type)
            && Objects.equals(this.wordsBlockCount, financialStatementWordsRegionList.wordsBlockCount)
            && Objects.equals(this.tableLocation, financialStatementWordsRegionList.tableLocation)
            && Objects.equals(this.wordsBlockList, financialStatementWordsRegionList.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, wordsBlockCount, tableLocation, wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinancialStatementWordsRegionList {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    tableLocation: ").append(toIndentedString(tableLocation)).append("\n");
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
