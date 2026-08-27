package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务端版本信息
 */
public class TenantVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private Integer versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private Integer osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_note")

    private String releaseNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_release_note")

    private String customReleaseNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_download_url")

    private String versionDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_status")

    private String versionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    private String stopTime;

    public TenantVersionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TenantVersionInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public TenantVersionInfo withVersionType(Integer versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * 版本类型：0-服务端 1-客户端
     * minimum: 0
     * maximum: 1
     * @return versionType
     */
    public Integer getVersionType() {
        return versionType;
    }

    public void setVersionType(Integer versionType) {
        this.versionType = versionType;
    }

    public TenantVersionInfo withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型：0-windows 1-android 2-mac 3-linux_UOS 4-linux_ubuntu 5-linux_Kylin 6-linux 7-linux_ubuntu_soft 8-linux_kylin_v10
     * minimum: 0
     * maximum: 8
     * @return osType
     */
    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

    public TenantVersionInfo withReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }

    /**
     * 更新说明
     * @return releaseNote
     */
    public String getReleaseNote() {
        return releaseNote;
    }

    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }

    public TenantVersionInfo withCustomReleaseNote(String customReleaseNote) {
        this.customReleaseNote = customReleaseNote;
        return this;
    }

    /**
     * 租户自定义更新说明
     * @return customReleaseNote
     */
    public String getCustomReleaseNote() {
        return customReleaseNote;
    }

    public void setCustomReleaseNote(String customReleaseNote) {
        this.customReleaseNote = customReleaseNote;
    }

    public TenantVersionInfo withVersionDownloadUrl(String versionDownloadUrl) {
        this.versionDownloadUrl = versionDownloadUrl;
        return this;
    }

    /**
     * 版本下载地址
     * @return versionDownloadUrl
     */
    public String getVersionDownloadUrl() {
        return versionDownloadUrl;
    }

    public void setVersionDownloadUrl(String versionDownloadUrl) {
        this.versionDownloadUrl = versionDownloadUrl;
    }

    public TenantVersionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TenantVersionInfo withVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    /**
     * 版本状态：PREVIEW-预览 RELEASED-已发布 OFFLINE-已下线 OBSOLETE-已废弃
     * @return versionStatus
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    public TenantVersionInfo withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * 发布时间
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public TenantVersionInfo withStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 停止服务时间
     * @return stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantVersionInfo that = (TenantVersionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionType, that.versionType) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.releaseNote, that.releaseNote)
            && Objects.equals(this.customReleaseNote, that.customReleaseNote)
            && Objects.equals(this.versionDownloadUrl, that.versionDownloadUrl)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.versionStatus, that.versionStatus)
            && Objects.equals(this.publishTime, that.publishTime) && Objects.equals(this.stopTime, that.stopTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            version,
            versionType,
            osType,
            releaseNote,
            customReleaseNote,
            versionDownloadUrl,
            description,
            versionStatus,
            publishTime,
            stopTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantVersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    releaseNote: ").append(toIndentedString(releaseNote)).append("\n");
        sb.append("    customReleaseNote: ").append(toIndentedString(customReleaseNote)).append("\n");
        sb.append("    versionDownloadUrl: ").append(toIndentedString(versionDownloadUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
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
