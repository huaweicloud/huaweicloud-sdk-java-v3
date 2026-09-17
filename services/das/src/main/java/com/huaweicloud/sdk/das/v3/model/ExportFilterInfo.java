package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出筛选条件
 */
public class ExportFilterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private List<String> dbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_names")

    private List<String> tbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_names")

    private List<String> fileNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_list")

    private List<String> typeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_list")

    private List<ExportColumnInfo> columnList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_double_insert")

    private Boolean parseDoubleInsert;

    public ExportFilterInfo withDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public ExportFilterInfo addDbNamesItem(String dbNamesItem) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        this.dbNames.add(dbNamesItem);
        return this;
    }

    public ExportFilterInfo withDbNames(Consumer<List<String>> dbNamesSetter) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        dbNamesSetter.accept(this.dbNames);
        return this;
    }

    /**
     * 数据库名称列表
     * @return dbNames
     */
    public List<String> getDbNames() {
        return dbNames;
    }

    public void setDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
    }

    public ExportFilterInfo withTbNames(List<String> tbNames) {
        this.tbNames = tbNames;
        return this;
    }

    public ExportFilterInfo addTbNamesItem(String tbNamesItem) {
        if (this.tbNames == null) {
            this.tbNames = new ArrayList<>();
        }
        this.tbNames.add(tbNamesItem);
        return this;
    }

    public ExportFilterInfo withTbNames(Consumer<List<String>> tbNamesSetter) {
        if (this.tbNames == null) {
            this.tbNames = new ArrayList<>();
        }
        tbNamesSetter.accept(this.tbNames);
        return this;
    }

    /**
     * 表名称列表
     * @return tbNames
     */
    public List<String> getTbNames() {
        return tbNames;
    }

    public void setTbNames(List<String> tbNames) {
        this.tbNames = tbNames;
    }

    public ExportFilterInfo withFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
        return this;
    }

    public ExportFilterInfo addFileNamesItem(String fileNamesItem) {
        if (this.fileNames == null) {
            this.fileNames = new ArrayList<>();
        }
        this.fileNames.add(fileNamesItem);
        return this;
    }

    public ExportFilterInfo withFileNames(Consumer<List<String>> fileNamesSetter) {
        if (this.fileNames == null) {
            this.fileNames = new ArrayList<>();
        }
        fileNamesSetter.accept(this.fileNames);
        return this;
    }

    /**
     * 文件名称列表
     * @return fileNames
     */
    public List<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
    }

    public ExportFilterInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ExportFilterInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ExportFilterInfo withTypeList(List<String> typeList) {
        this.typeList = typeList;
        return this;
    }

    public ExportFilterInfo addTypeListItem(String typeListItem) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        this.typeList.add(typeListItem);
        return this;
    }

    public ExportFilterInfo withTypeList(Consumer<List<String>> typeListSetter) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        typeListSetter.accept(this.typeList);
        return this;
    }

    /**
     * SQL类型列表（insert、update、delete、ddl）
     * @return typeList
     */
    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public ExportFilterInfo withColumnList(List<ExportColumnInfo> columnList) {
        this.columnList = columnList;
        return this;
    }

    public ExportFilterInfo addColumnListItem(ExportColumnInfo columnListItem) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        this.columnList.add(columnListItem);
        return this;
    }

    public ExportFilterInfo withColumnList(Consumer<List<ExportColumnInfo>> columnListSetter) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        columnListSetter.accept(this.columnList);
        return this;
    }

    /**
     * 列列表
     * @return columnList
     */
    public List<ExportColumnInfo> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<ExportColumnInfo> columnList) {
        this.columnList = columnList;
    }

    public ExportFilterInfo withParseDoubleInsert(Boolean parseDoubleInsert) {
        this.parseDoubleInsert = parseDoubleInsert;
        return this;
    }

    /**
     * 是否将UPDATE语句导出为两条INSERT语句
     * @return parseDoubleInsert
     */
    public Boolean getParseDoubleInsert() {
        return parseDoubleInsert;
    }

    public void setParseDoubleInsert(Boolean parseDoubleInsert) {
        this.parseDoubleInsert = parseDoubleInsert;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportFilterInfo that = (ExportFilterInfo) obj;
        return Objects.equals(this.dbNames, that.dbNames) && Objects.equals(this.tbNames, that.tbNames)
            && Objects.equals(this.fileNames, that.fileNames) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.typeList, that.typeList)
            && Objects.equals(this.columnList, that.columnList)
            && Objects.equals(this.parseDoubleInsert, that.parseDoubleInsert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbNames, tbNames, fileNames, startTime, endTime, typeList, columnList, parseDoubleInsert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFilterInfo {\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    tbNames: ").append(toIndentedString(tbNames)).append("\n");
        sb.append("    fileNames: ").append(toIndentedString(fileNames)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
        sb.append("    columnList: ").append(toIndentedString(columnList)).append("\n");
        sb.append("    parseDoubleInsert: ").append(toIndentedString(parseDoubleInsert)).append("\n");
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
