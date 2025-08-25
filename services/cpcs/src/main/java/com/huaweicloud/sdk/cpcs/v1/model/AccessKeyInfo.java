package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessKeyInfo
 */
public class AccessKeyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_time")

    private Long downloadTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_downloaded")

    private Boolean isDownloaded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_imported")

    private Boolean isImported;

    public AccessKeyInfo withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * 访问密钥ID
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public AccessKeyInfo withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 访问密钥名称
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public AccessKeyInfo withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 访问密钥AK
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public AccessKeyInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 访问密钥所属的应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AccessKeyInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 访问密钥状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AccessKeyInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 应用的创建时间，UNIX时间戳，单位毫秒
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AccessKeyInfo withDownloadTime(Long downloadTime) {
        this.downloadTime = downloadTime;
        return this;
    }

    /**
     * 下载时间
     * @return downloadTime
     */
    public Long getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Long downloadTime) {
        this.downloadTime = downloadTime;
    }

    public AccessKeyInfo withIsDownloaded(Boolean isDownloaded) {
        this.isDownloaded = isDownloaded;
        return this;
    }

    /**
     * 是否下载
     * @return isDownloaded
     */
    public Boolean getIsDownloaded() {
        return isDownloaded;
    }

    public void setIsDownloaded(Boolean isDownloaded) {
        this.isDownloaded = isDownloaded;
    }

    public AccessKeyInfo withIsImported(Boolean isImported) {
        this.isImported = isImported;
        return this;
    }

    /**
     * 是否导入
     * @return isImported
     */
    public Boolean getIsImported() {
        return isImported;
    }

    public void setIsImported(Boolean isImported) {
        this.isImported = isImported;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessKeyInfo that = (AccessKeyInfo) obj;
        return Objects.equals(this.accessKeyId, that.accessKeyId) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.accessKey, that.accessKey) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.downloadTime, that.downloadTime)
            && Objects.equals(this.isDownloaded, that.isDownloaded) && Objects.equals(this.isImported, that.isImported);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(accessKeyId, keyName, accessKey, appName, status, createTime, downloadTime, isDownloaded, isImported);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessKeyInfo {\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    downloadTime: ").append(toIndentedString(downloadTime)).append("\n");
        sb.append("    isDownloaded: ").append(toIndentedString(isDownloaded)).append("\n");
        sb.append("    isImported: ").append(toIndentedString(isImported)).append("\n");
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
