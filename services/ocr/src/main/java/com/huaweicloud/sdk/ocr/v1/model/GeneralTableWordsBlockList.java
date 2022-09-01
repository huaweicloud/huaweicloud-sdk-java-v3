package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子区域识别文字块列表，输出顺序从左到右，先上后下。
 */
public class GeneralTableWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    @JacksonXmlProperty(localName = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    @JacksonXmlProperty(localName = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_list")

    @JacksonXmlProperty(localName = "words_list")

    private List<WordsListIem> wordsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    @JacksonXmlProperty(localName = "rows")

    private List<Integer> rows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    @JacksonXmlProperty(localName = "columns")

    private List<Integer> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cell_location")

    @JacksonXmlProperty(localName = "cell_location")

    private List<List<Integer>> cellLocation = null;

    public GeneralTableWordsBlockList withWords(String words) {
        this.words = words;
        return this;
    }

    /**
     * 文字块识别结果。 
     * @return words
     */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public GeneralTableWordsBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 字段的平均置信度，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public GeneralTableWordsBlockList withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public GeneralTableWordsBlockList addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public GeneralTableWordsBlockList withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 文字块位置信息，列表形式，分别表示文字块4个顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public GeneralTableWordsBlockList withWordsList(List<WordsListIem> wordsList) {
        this.wordsList = wordsList;
        return this;
    }

    public GeneralTableWordsBlockList addWordsListItem(WordsListIem wordsListItem) {
        if (this.wordsList == null) {
            this.wordsList = new ArrayList<>();
        }
        this.wordsList.add(wordsListItem);
        return this;
    }

    public GeneralTableWordsBlockList withWordsList(Consumer<List<WordsListIem>> wordsListSetter) {
        if (this.wordsList == null) {
            this.wordsList = new ArrayList<>();
        }
        wordsListSetter.accept(this.wordsList);
        return this;
    }

    /**
     * 单元格内文字段列表。输出顺序从左到右，从上到下。仅当入参\"return_text_location\"为true时存在。 
     * @return wordsList
     */
    public List<WordsListIem> getWordsList() {
        return wordsList;
    }

    public void setWordsList(List<WordsListIem> wordsList) {
        this.wordsList = wordsList;
    }

    public GeneralTableWordsBlockList withRows(List<Integer> rows) {
        this.rows = rows;
        return this;
    }

    public GeneralTableWordsBlockList addRowsItem(Integer rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public GeneralTableWordsBlockList withRows(Consumer<List<Integer>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 文字块占用的行信息，编号从0开始，列表形式，数据类型为Integer。仅在表格区域内有效，即type字段为\"table\"时该字段有效。 
     * @return rows
     */
    public List<Integer> getRows() {
        return rows;
    }

    public void setRows(List<Integer> rows) {
        this.rows = rows;
    }

    public GeneralTableWordsBlockList withColumns(List<Integer> columns) {
        this.columns = columns;
        return this;
    }

    public GeneralTableWordsBlockList addColumnsItem(Integer columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public GeneralTableWordsBlockList withColumns(Consumer<List<Integer>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 文字块占用的列信息，编号从0开始，列表形式，数据类型为Integer。仅在表格区域内有效，即type字段为\"table\"时该字段有效。 
     * @return columns
     */
    public List<Integer> getColumns() {
        return columns;
    }

    public void setColumns(List<Integer> columns) {
        this.columns = columns;
    }

    public GeneralTableWordsBlockList withCellLocation(List<List<Integer>> cellLocation) {
        this.cellLocation = cellLocation;
        return this;
    }

    public GeneralTableWordsBlockList addCellLocationItem(List<Integer> cellLocationItem) {
        if (this.cellLocation == null) {
            this.cellLocation = new ArrayList<>();
        }
        this.cellLocation.add(cellLocationItem);
        return this;
    }

    public GeneralTableWordsBlockList withCellLocation(Consumer<List<List<Integer>>> cellLocationSetter) {
        if (this.cellLocation == null) {
            this.cellLocation = new ArrayList<>();
        }
        cellLocationSetter.accept(this.cellLocation);
        return this;
    }

    /**
     * 单元格位置信息，列表形式，分别表示单元格4个顶点的x, y坐标;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return cellLocation
     */
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
        GeneralTableWordsBlockList generalTableWordsBlockList = (GeneralTableWordsBlockList) o;
        return Objects.equals(this.words, generalTableWordsBlockList.words)
            && Objects.equals(this.confidence, generalTableWordsBlockList.confidence)
            && Objects.equals(this.location, generalTableWordsBlockList.location)
            && Objects.equals(this.wordsList, generalTableWordsBlockList.wordsList)
            && Objects.equals(this.rows, generalTableWordsBlockList.rows)
            && Objects.equals(this.columns, generalTableWordsBlockList.columns)
            && Objects.equals(this.cellLocation, generalTableWordsBlockList.cellLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, confidence, location, wordsList, rows, columns, cellLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralTableWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    wordsList: ").append(toIndentedString(wordsList)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    cellLocation: ").append(toIndentedString(cellLocation)).append("\n");
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
