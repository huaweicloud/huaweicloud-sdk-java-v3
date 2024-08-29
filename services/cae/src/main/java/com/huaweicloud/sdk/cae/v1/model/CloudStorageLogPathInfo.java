package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云存储日志扫描路径信息。
 */
public class CloudStorageLogPathInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_path")

    private String dirPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name_pattern")

    private String fileNamePattern;

    public CloudStorageLogPathInfo withDirPath(String dirPath) {
        this.dirPath = dirPath;
        return this;
    }

    /**
     * 容器挂载路径。
     * @return dirPath
     */
    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public CloudStorageLogPathInfo withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }

    /**
     * 日志文件名匹配模式。
     * @return fileNamePattern
     */
    public String getFileNamePattern() {
        return fileNamePattern;
    }

    public void setFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudStorageLogPathInfo that = (CloudStorageLogPathInfo) obj;
        return Objects.equals(this.dirPath, that.dirPath) && Objects.equals(this.fileNamePattern, that.fileNamePattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dirPath, fileNamePattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudStorageLogPathInfo {\n");
        sb.append("    dirPath: ").append(toIndentedString(dirPath)).append("\n");
        sb.append("    fileNamePattern: ").append(toIndentedString(fileNamePattern)).append("\n");
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
