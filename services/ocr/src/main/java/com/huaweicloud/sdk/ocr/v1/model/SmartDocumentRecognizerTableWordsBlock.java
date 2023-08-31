package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerTableWordsBlock
 */
public class SmartDocumentRecognizerTableWordsBlock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<Integer> rows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<Integer> columns = null;

    public SmartDocumentRecognizerTableWordsBlock withWords(String words) {
        this.words = words;
        return this;
    }

    /**
     * 单元格内的文字识别结果。 
     * @return words
     */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public SmartDocumentRecognizerTableWordsBlock withRows(List<Integer> rows) {
        this.rows = rows;
        return this;
    }

    public SmartDocumentRecognizerTableWordsBlock addRowsItem(Integer rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public SmartDocumentRecognizerTableWordsBlock withRows(Consumer<List<Integer>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 文字块占用的行信息，编号从0开始，列表形式，数据类型为Integer。 
     * @return rows
     */
    public List<Integer> getRows() {
        return rows;
    }

    public void setRows(List<Integer> rows) {
        this.rows = rows;
    }

    public SmartDocumentRecognizerTableWordsBlock withColumns(List<Integer> columns) {
        this.columns = columns;
        return this;
    }

    public SmartDocumentRecognizerTableWordsBlock addColumnsItem(Integer columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public SmartDocumentRecognizerTableWordsBlock withColumns(Consumer<List<Integer>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 文字块占用的列信息，编号从0开始，列表形式，数据类型为Integer。 
     * @return columns
     */
    public List<Integer> getColumns() {
        return columns;
    }

    public void setColumns(List<Integer> columns) {
        this.columns = columns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerTableWordsBlock that = (SmartDocumentRecognizerTableWordsBlock) obj;
        return Objects.equals(this.words, that.words) && Objects.equals(this.rows, that.rows)
            && Objects.equals(this.columns, that.columns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, rows, columns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerTableWordsBlock {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
