package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对象导入信息。
 */
public class SupportImportFileResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_select")

    private String previousSelect;

    public SupportImportFileResult withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件导入阈值。
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public SupportImportFileResult withPreviousSelect(String previousSelect) {
        this.previousSelect = previousSelect;
        return this;
    }

    /**
     * 上一次选择对象的方式。
     * @return previousSelect
     */
    public String getPreviousSelect() {
        return previousSelect;
    }

    public void setPreviousSelect(String previousSelect) {
        this.previousSelect = previousSelect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportImportFileResult that = (SupportImportFileResult) obj;
        return Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.previousSelect, that.previousSelect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSize, previousSelect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportImportFileResult {\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    previousSelect: ").append(toIndentedString(previousSelect)).append("\n");
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
