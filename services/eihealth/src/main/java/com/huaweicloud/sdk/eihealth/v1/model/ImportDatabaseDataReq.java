package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入数据请求体
 */
public class ImportDatabaseDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<String> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_lines")

    private Integer skipLines;

    public ImportDatabaseDataReq withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    public ImportDatabaseDataReq addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ImportDatabaseDataReq withFiles(Consumer<List<String>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 导入文件l路径列表
     * @return files
     */
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public ImportDatabaseDataReq withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 分隔符，常见分隔符为, ;
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public ImportDatabaseDataReq withSkipLines(Integer skipLines) {
        this.skipLines = skipLines;
        return this;
    }

    /**
     * 跳过的header行数
     * minimum: 0
     * maximum: 1000
     * @return skipLines
     */
    public Integer getSkipLines() {
        return skipLines;
    }

    public void setSkipLines(Integer skipLines) {
        this.skipLines = skipLines;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportDatabaseDataReq importDatabaseDataReq = (ImportDatabaseDataReq) o;
        return Objects.equals(this.files, importDatabaseDataReq.files)
            && Objects.equals(this.delimiter, importDatabaseDataReq.delimiter)
            && Objects.equals(this.skipLines, importDatabaseDataReq.skipLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(files, delimiter, skipLines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDatabaseDataReq {\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    skipLines: ").append(toIndentedString(skipLines)).append("\n");
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
