package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBackupDownloadLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<BackupDownloadLink> files = null;

    public ShowBackupDownloadLinkResponse withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 文件所在的桶名。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ShowBackupDownloadLinkResponse withFiles(List<BackupDownloadLink> files) {
        this.files = files;
        return this;
    }

    public ShowBackupDownloadLinkResponse addFilesItem(BackupDownloadLink filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ShowBackupDownloadLinkResponse withFiles(Consumer<List<BackupDownloadLink>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 备份包含的文件列表。
     * @return files
     */
    public List<BackupDownloadLink> getFiles() {
        return files;
    }

    public void setFiles(List<BackupDownloadLink> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupDownloadLinkResponse that = (ShowBackupDownloadLinkResponse) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupDownloadLinkResponse {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
