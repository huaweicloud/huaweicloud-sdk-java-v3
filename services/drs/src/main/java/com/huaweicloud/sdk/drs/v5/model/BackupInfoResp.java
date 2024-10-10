package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份文件信息
 */
public class BackupInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_source")

    private String fileSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_info")

    private List<BackupFileResp> fileInfo = null;

    public BackupInfoResp withFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }

    /**
     * 备份文件来源，包括OBS和RDS两种。
     * @return fileSource
     */
    public String getFileSource() {
        return fileSource;
    }

    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }

    public BackupInfoResp withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名称。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public BackupInfoResp withFileInfo(List<BackupFileResp> fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    public BackupInfoResp addFileInfoItem(BackupFileResp fileInfoItem) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        this.fileInfo.add(fileInfoItem);
        return this;
    }

    public BackupInfoResp withFileInfo(Consumer<List<BackupFileResp>> fileInfoSetter) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        fileInfoSetter.accept(this.fileInfo);
        return this;
    }

    /**
     * 备份文件列表。
     * @return fileInfo
     */
    public List<BackupFileResp> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(List<BackupFileResp> fileInfo) {
        this.fileInfo = fileInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupInfoResp that = (BackupInfoResp) obj;
        return Objects.equals(this.fileSource, that.fileSource) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.fileInfo, that.fileInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSource, bucketName, fileInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupInfoResp {\n");
        sb.append("    fileSource: ").append(toIndentedString(fileSource)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
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
