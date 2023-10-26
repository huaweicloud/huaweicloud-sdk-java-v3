package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 目录资源使用情况(包含子目录)
 */
public class FsDuInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_capacity")

    private Long usedCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_count")

    private FsFileCount fileCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public FsDuInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件系统内合法的目录全路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FsDuInfo withUsedCapacity(Long usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    /**
     * 占用容量，单位：byte
     * minimum: 0
     * @return usedCapacity
     */
    public Long getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(Long usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public FsDuInfo withFileCount(FsFileCount fileCount) {
        this.fileCount = fileCount;
        return this;
    }

    public FsDuInfo withFileCount(Consumer<FsFileCount> fileCountSetter) {
        if (this.fileCount == null) {
            this.fileCount = new FsFileCount();
            fileCountSetter.accept(this.fileCount);
        }

        return this;
    }

    /**
     * 该目录下所有文件数目
     * @return fileCount
     */
    public FsFileCount getFileCount() {
        return fileCount;
    }

    public void setFileCount(FsFileCount fileCount) {
        this.fileCount = fileCount;
    }

    public FsDuInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 错误信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FsDuInfo that = (FsDuInfo) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.usedCapacity, that.usedCapacity)
            && Objects.equals(this.fileCount, that.fileCount) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, usedCapacity, fileCount, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FsDuInfo {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    usedCapacity: ").append(toIndentedString(usedCapacity)).append("\n");
        sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
