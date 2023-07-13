package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点信息
 */
public class TreeNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_leaf")

    private Boolean isLeaf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkbox_status")

    private String checkboxStatus;

    public TreeNode withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 目录或文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public TreeNode withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 目录或文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public TreeNode withIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
        return this;
    }

    /**
     * 是否为叶子节点，true是，false不是
     * @return isLeaf
     */
    public Boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public TreeNode withCheckboxStatus(String checkboxStatus) {
        this.checkboxStatus = checkboxStatus;
        return this;
    }

    /**
     * 屏蔽状态，包括unchecked(不屏蔽)、all(全屏蔽)、half(半屏蔽)
     * @return checkboxStatus
     */
    public String getCheckboxStatus() {
        return checkboxStatus;
    }

    public void setCheckboxStatus(String checkboxStatus) {
        this.checkboxStatus = checkboxStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TreeNode that = (TreeNode) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.isLeaf, that.isLeaf) && Objects.equals(this.checkboxStatus, that.checkboxStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, filePath, isLeaf, checkboxStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TreeNode {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    isLeaf: ").append(toIndentedString(isLeaf)).append("\n");
        sb.append("    checkboxStatus: ").append(toIndentedString(checkboxStatus)).append("\n");
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
