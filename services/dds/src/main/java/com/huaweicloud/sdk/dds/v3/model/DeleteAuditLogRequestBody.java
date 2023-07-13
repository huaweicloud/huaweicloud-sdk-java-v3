package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteAuditLogRequestBody
 */
public class DeleteAuditLogRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_names")

    private List<String> fileNames = null;

    public DeleteAuditLogRequestBody withFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
        return this;
    }

    public DeleteAuditLogRequestBody addFileNamesItem(String fileNamesItem) {
        if (this.fileNames == null) {
            this.fileNames = new ArrayList<>();
        }
        this.fileNames.add(fileNamesItem);
        return this;
    }

    public DeleteAuditLogRequestBody withFileNames(Consumer<List<String>> fileNamesSetter) {
        if (this.fileNames == null) {
            this.fileNames = new ArrayList<>();
        }
        fileNamesSetter.accept(this.fileNames);
        return this;
    }

    /**
     * 文件名列表
     * @return fileNames
     */
    public List<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(List<String> fileNames) {
        this.fileNames = fileNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAuditLogRequestBody that = (DeleteAuditLogRequestBody) obj;
        return Objects.equals(this.fileNames, that.fileNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAuditLogRequestBody {\n");
        sb.append("    fileNames: ").append(toIndentedString(fileNames)).append("\n");
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
