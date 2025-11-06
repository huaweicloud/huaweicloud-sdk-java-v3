package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeChangesTrees
 */
public class MergeChangesTrees {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    public MergeChangesTrees withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 分段路径
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MergeChangesTrees withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 路径级别
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public MergeChangesTrees withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 当前级别全路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public MergeChangesTrees withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeChangesTrees that = (MergeChangesTrees) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.level, that.level)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileType, that.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, level, filePath, fileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeChangesTrees {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
