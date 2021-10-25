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
public class FinancialStatementWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<Integer> rows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<Integer> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cell_location")

    private List<List<Integer>> cellLocation = null;

    public FinancialStatementWordsBlockList withWords(String words) {
        this.words = words;
        return this;
    }

    /** 文字块内容。当入参\"return_text_location\"为false时，每个单元格返回一个文本值，不同行文本由换行符 \"\\n\" 拼接。
     * 
     * @return words */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public FinancialStatementWordsBlockList withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public FinancialStatementWordsBlockList addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public FinancialStatementWordsBlockList withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /** 文字块位置信息，列表形式，分别表示文字块4个顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。
     * 
     * @return location */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public FinancialStatementWordsBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /** 文字块识别结果置信度信息，置信度越大，表示本次识别的对应字段的可靠性越大，在统计意义上，置信度越大正确率越高。注：置信度由算法给出，其不直接等价于对应字段的精度。
     * 
     * @return confidence */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public FinancialStatementWordsBlockList withRows(List<Integer> rows) {
        this.rows = rows;
        return this;
    }

    public FinancialStatementWordsBlockList addRowsItem(Integer rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public FinancialStatementWordsBlockList withRows(Consumer<List<Integer>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /** 单元格行信息，列表形式。多个连续值表示单元格垮多行。
     * 
     * @return rows */
    public List<Integer> getRows() {
        return rows;
    }

    public void setRows(List<Integer> rows) {
        this.rows = rows;
    }

    public FinancialStatementWordsBlockList withColumns(List<Integer> columns) {
        this.columns = columns;
        return this;
    }

    public FinancialStatementWordsBlockList addColumnsItem(Integer columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public FinancialStatementWordsBlockList withColumns(Consumer<List<Integer>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /** 单元格列信息，列表形式。多个连续值表示单元格垮多列。
     * 
     * @return columns */
    public List<Integer> getColumns() {
        return columns;
    }

    public void setColumns(List<Integer> columns) {
        this.columns = columns;
    }

    public FinancialStatementWordsBlockList withCellLocation(List<List<Integer>> cellLocation) {
        this.cellLocation = cellLocation;
        return this;
    }

    public FinancialStatementWordsBlockList addCellLocationItem(List<Integer> cellLocationItem) {
        if (this.cellLocation == null) {
            this.cellLocation = new ArrayList<>();
        }
        this.cellLocation.add(cellLocationItem);
        return this;
    }

    public FinancialStatementWordsBlockList withCellLocation(Consumer<List<List<Integer>>> cellLocationSetter) {
        if (this.cellLocation == null) {
            this.cellLocation = new ArrayList<>();
        }
        cellLocationSetter.accept(this.cellLocation);
        return this;
    }

    /** 单元格位置信息，列表形式，分别表示单元格4个顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。
     * 
     * @return cellLocation */
    public List<List<Integer>> getCellLocation() {
        return cellLocation;
    }

    public void setCellLocation(List<List<Integer>> cellLocation) {
        this.cellLocation = cellLocation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FinancialStatementWordsBlockList financialStatementWordsBlockList = (FinancialStatementWordsBlockList) o;
        return Objects.equals(this.words, financialStatementWordsBlockList.words)
            && Objects.equals(this.location, financialStatementWordsBlockList.location)
            && Objects.equals(this.confidence, financialStatementWordsBlockList.confidence)
            && Objects.equals(this.rows, financialStatementWordsBlockList.rows)
            && Objects.equals(this.columns, financialStatementWordsBlockList.columns)
            && Objects.equals(this.cellLocation, financialStatementWordsBlockList.cellLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, location, confidence, rows, columns, cellLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinancialStatementWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    cellLocation: ").append(toIndentedString(cellLocation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
