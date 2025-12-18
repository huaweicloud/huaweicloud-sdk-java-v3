package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetBackupDownloadLinkResponseBodyFiles
 */
public class GetBackupDownloadLinkResponseBodyFiles {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_link")

    private String downloadLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_expired_time")

    private String linkExpiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    public GetBackupDownloadLinkResponseBodyFiles withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 文件名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetBackupDownloadLinkResponseBodyFiles withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小，单位为KB。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public GetBackupDownloadLinkResponseBodyFiles withDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }

    /**
     * 文件下载链接。
     * @return downloadLink
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public GetBackupDownloadLinkResponseBodyFiles withLinkExpiredTime(String linkExpiredTime) {
        this.linkExpiredTime = linkExpiredTime;
        return this;
    }

    /**
     * 下载链接过期时间，格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始，Z指时区偏移量，例如UTC时间偏移显示为+0000。
     * @return linkExpiredTime
     */
    public String getLinkExpiredTime() {
        return linkExpiredTime;
    }

    public void setLinkExpiredTime(String linkExpiredTime) {
        this.linkExpiredTime = linkExpiredTime;
    }

    public GetBackupDownloadLinkResponseBodyFiles withGroupId(String groupId) {
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

    public GetBackupDownloadLinkResponseBodyFiles withGroupName(String groupName) {
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
        GetBackupDownloadLinkResponseBodyFiles that = (GetBackupDownloadLinkResponseBodyFiles) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.size, that.size)
            && Objects.equals(this.downloadLink, that.downloadLink)
            && Objects.equals(this.linkExpiredTime, that.linkExpiredTime) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, downloadLink, linkExpiredTime, groupId, groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBackupDownloadLinkResponseBodyFiles {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
        sb.append("    linkExpiredTime: ").append(toIndentedString(linkExpiredTime)).append("\n");
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
