package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Counter
 */
public class Counter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "BYTES_WRITTEN")

    @JacksonXmlProperty(localName = "BYTES_WRITTEN")

    private Long bytesWritten;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TOTAL_FILES")

    @JacksonXmlProperty(localName = "TOTAL_FILES")

    private Integer totalFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ROWS_READ")

    @JacksonXmlProperty(localName = "ROWS_READ")

    private Long rowsRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "BYTES_READ")

    @JacksonXmlProperty(localName = "BYTES_READ")

    private Long bytesRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ROWS_WRITTEN")

    @JacksonXmlProperty(localName = "ROWS_WRITTEN")

    private Long rowsWritten;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FILES_WRITTEN")

    @JacksonXmlProperty(localName = "FILES_WRITTEN")

    private Integer filesWritten;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FILES_READ")

    @JacksonXmlProperty(localName = "FILES_READ")

    private Integer filesRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TOTAL_SIZE")

    @JacksonXmlProperty(localName = "TOTAL_SIZE")

    private Long totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FILES_SKIPPED")

    @JacksonXmlProperty(localName = "FILES_SKIPPED")

    private Integer filesSkipped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ROWS_WRITTEN_SKIPPED")

    @JacksonXmlProperty(localName = "ROWS_WRITTEN_SKIPPED")

    private Long rowsWrittenSkipped;

    public Counter withBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
        return this;
    }

    /**
     * 写入的字节数
     * @return bytesWritten
     */
    public Long getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public Counter withTotalFiles(Integer totalFiles) {
        this.totalFiles = totalFiles;
        return this;
    }

    /**
     * 总文件数
     * @return totalFiles
     */
    public Integer getTotalFiles() {
        return totalFiles;
    }

    public void setTotalFiles(Integer totalFiles) {
        this.totalFiles = totalFiles;
    }

    public Counter withRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
        return this;
    }

    /**
     * 读取的行数
     * @return rowsRead
     */
    public Long getRowsRead() {
        return rowsRead;
    }

    public void setRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
    }

    public Counter withBytesRead(Long bytesRead) {
        this.bytesRead = bytesRead;
        return this;
    }

    /**
     * 读取的字节数
     * @return bytesRead
     */
    public Long getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(Long bytesRead) {
        this.bytesRead = bytesRead;
    }

    public Counter withRowsWritten(Long rowsWritten) {
        this.rowsWritten = rowsWritten;
        return this;
    }

    /**
     * 写入的行数
     * @return rowsWritten
     */
    public Long getRowsWritten() {
        return rowsWritten;
    }

    public void setRowsWritten(Long rowsWritten) {
        this.rowsWritten = rowsWritten;
    }

    public Counter withFilesWritten(Integer filesWritten) {
        this.filesWritten = filesWritten;
        return this;
    }

    /**
     * 写入的文件数
     * @return filesWritten
     */
    public Integer getFilesWritten() {
        return filesWritten;
    }

    public void setFilesWritten(Integer filesWritten) {
        this.filesWritten = filesWritten;
    }

    public Counter withFilesRead(Integer filesRead) {
        this.filesRead = filesRead;
        return this;
    }

    /**
     * 读取的文件数
     * @return filesRead
     */
    public Integer getFilesRead() {
        return filesRead;
    }

    public void setFilesRead(Integer filesRead) {
        this.filesRead = filesRead;
    }

    public Counter withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 总字节数
     * @return totalSize
     */
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public Counter withFilesSkipped(Integer filesSkipped) {
        this.filesSkipped = filesSkipped;
        return this;
    }

    /**
     * 跳过的文件数
     * @return filesSkipped
     */
    public Integer getFilesSkipped() {
        return filesSkipped;
    }

    public void setFilesSkipped(Integer filesSkipped) {
        this.filesSkipped = filesSkipped;
    }

    public Counter withRowsWrittenSkipped(Long rowsWrittenSkipped) {
        this.rowsWrittenSkipped = rowsWrittenSkipped;
        return this;
    }

    /**
     * 跳过的行数
     * @return rowsWrittenSkipped
     */
    public Long getRowsWrittenSkipped() {
        return rowsWrittenSkipped;
    }

    public void setRowsWrittenSkipped(Long rowsWrittenSkipped) {
        this.rowsWrittenSkipped = rowsWrittenSkipped;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Counter counter = (Counter) o;
        return Objects.equals(this.bytesWritten, counter.bytesWritten)
            && Objects.equals(this.totalFiles, counter.totalFiles) && Objects.equals(this.rowsRead, counter.rowsRead)
            && Objects.equals(this.bytesRead, counter.bytesRead)
            && Objects.equals(this.rowsWritten, counter.rowsWritten)
            && Objects.equals(this.filesWritten, counter.filesWritten)
            && Objects.equals(this.filesRead, counter.filesRead) && Objects.equals(this.totalSize, counter.totalSize)
            && Objects.equals(this.filesSkipped, counter.filesSkipped)
            && Objects.equals(this.rowsWrittenSkipped, counter.rowsWrittenSkipped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bytesWritten,
            totalFiles,
            rowsRead,
            bytesRead,
            rowsWritten,
            filesWritten,
            filesRead,
            totalSize,
            filesSkipped,
            rowsWrittenSkipped);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Counter {\n");
        sb.append("    bytesWritten: ").append(toIndentedString(bytesWritten)).append("\n");
        sb.append("    totalFiles: ").append(toIndentedString(totalFiles)).append("\n");
        sb.append("    rowsRead: ").append(toIndentedString(rowsRead)).append("\n");
        sb.append("    bytesRead: ").append(toIndentedString(bytesRead)).append("\n");
        sb.append("    rowsWritten: ").append(toIndentedString(rowsWritten)).append("\n");
        sb.append("    filesWritten: ").append(toIndentedString(filesWritten)).append("\n");
        sb.append("    filesRead: ").append(toIndentedString(filesRead)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    filesSkipped: ").append(toIndentedString(filesSkipped)).append("\n");
        sb.append("    rowsWrittenSkipped: ").append(toIndentedString(rowsWrittenSkipped)).append("\n");
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
