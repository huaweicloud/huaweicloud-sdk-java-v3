package com.huaweicloud.sdk.dds.v3.model;

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
    @JsonProperty(value = "files")

    private List<GetBackupDownloadLinkResponseBodyFiles> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    public ShowBackupDownloadLinkResponse withFiles(List<GetBackupDownloadLinkResponseBodyFiles> files) {
        this.files = files;
        return this;
    }

    public ShowBackupDownloadLinkResponse addFilesItem(GetBackupDownloadLinkResponseBodyFiles filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ShowBackupDownloadLinkResponse withFiles(
        Consumer<List<GetBackupDownloadLinkResponseBodyFiles>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 备份文件信息。
     * @return files
     */
    public List<GetBackupDownloadLinkResponseBodyFiles> getFiles() {
        return files;
    }

    public void setFiles(List<GetBackupDownloadLinkResponseBodyFiles> files) {
        this.files = files;
    }

    public ShowBackupDownloadLinkResponse withBucket(String bucket) {
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

    public ShowBackupDownloadLinkResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowBackupDownloadLinkResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
        return Objects.equals(this.files, that.files) && Objects.equals(this.bucket, that.bucket)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(files, bucket, groupId, groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupDownloadLinkResponse {\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
