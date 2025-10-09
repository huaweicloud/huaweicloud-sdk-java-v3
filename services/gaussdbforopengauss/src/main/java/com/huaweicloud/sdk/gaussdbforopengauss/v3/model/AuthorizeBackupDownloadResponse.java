package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class AuthorizeBackupDownloadResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_paths")

    private List<String> filePaths = null;

    public AuthorizeBackupDownloadResponse withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS桶名。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public AuthorizeBackupDownloadResponse withFilePaths(List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }

    public AuthorizeBackupDownloadResponse addFilePathsItem(String filePathsItem) {
        if (this.filePaths == null) {
            this.filePaths = new ArrayList<>();
        }
        this.filePaths.add(filePathsItem);
        return this;
    }

    public AuthorizeBackupDownloadResponse withFilePaths(Consumer<List<String>> filePathsSetter) {
        if (this.filePaths == null) {
            this.filePaths = new ArrayList<>();
        }
        filePathsSetter.accept(this.filePaths);
        return this;
    }

    /**
     * 通过OBS Browser+下载备份文件的路径名称。
     * @return filePaths
     */
    public List<String> getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(List<String> filePaths) {
        this.filePaths = filePaths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeBackupDownloadResponse that = (AuthorizeBackupDownloadResponse) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.filePaths, that.filePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, filePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeBackupDownloadResponse {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
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
