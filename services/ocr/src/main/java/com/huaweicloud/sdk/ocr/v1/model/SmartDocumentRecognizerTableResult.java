package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerTableResult
 */
public class SmartDocumentRecognizerTableResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_count")

    private Integer tableCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_list")

    private List<SmartDocumentRecognizerTableBlock> tableList = null;

    public SmartDocumentRecognizerTableResult withTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * 模型识别到的表格数量。 
     * @return tableCount
     */
    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public SmartDocumentRecognizerTableResult withTableList(List<SmartDocumentRecognizerTableBlock> tableList) {
        this.tableList = tableList;
        return this;
    }

    public SmartDocumentRecognizerTableResult addTableListItem(SmartDocumentRecognizerTableBlock tableListItem) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        this.tableList.add(tableListItem);
        return this;
    }

    public SmartDocumentRecognizerTableResult withTableList(
        Consumer<List<SmartDocumentRecognizerTableBlock>> tableListSetter) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        tableListSetter.accept(this.tableList);
        return this;
    }

    /**
     * 表格识别结果列表。 
     * @return tableList
     */
    public List<SmartDocumentRecognizerTableBlock> getTableList() {
        return tableList;
    }

    public void setTableList(List<SmartDocumentRecognizerTableBlock> tableList) {
        this.tableList = tableList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerTableResult that = (SmartDocumentRecognizerTableResult) obj;
        return Objects.equals(this.tableCount, that.tableCount) && Objects.equals(this.tableList, that.tableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableCount, tableList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerTableResult {\n");
        sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
        sb.append("    tableList: ").append(toIndentedString(tableList)).append("\n");
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
