package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTenantVersionConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private Integer versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private Integer osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_status")

    private String versionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time_begin")

    private String publishTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time_end")

    private String publishTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_note")

    private String releaseNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListTenantVersionConfigRequest withVersionType(Integer versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * 版本类型：0-服务端 1-客户端（必传）
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

    public ListTenantVersionConfigRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号（支持模糊查询）
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListTenantVersionConfigRequest withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型：0-windows 1-android 2-mac 3-linux_UOS 4-linux_ubuntu 5-linux_Kylin 6-linux
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

    public ListTenantVersionConfigRequest withVersionStatus(String versionStatus) {
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

    public ListTenantVersionConfigRequest withPublishTimeBegin(String publishTimeBegin) {
        this.publishTimeBegin = publishTimeBegin;
        return this;
    }

    /**
     * 发布时间开始（格式：yyyy-MM-dd HH:mm:ss）
     * @return publishTimeBegin
     */
    public String getPublishTimeBegin() {
        return publishTimeBegin;
    }

    public void setPublishTimeBegin(String publishTimeBegin) {
        this.publishTimeBegin = publishTimeBegin;
    }

    public ListTenantVersionConfigRequest withPublishTimeEnd(String publishTimeEnd) {
        this.publishTimeEnd = publishTimeEnd;
        return this;
    }

    /**
     * 发布时间结束（格式：yyyy-MM-dd HH:mm:ss）
     * @return publishTimeEnd
     */
    public String getPublishTimeEnd() {
        return publishTimeEnd;
    }

    public void setPublishTimeEnd(String publishTimeEnd) {
        this.publishTimeEnd = publishTimeEnd;
    }

    public ListTenantVersionConfigRequest withReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }

    /**
     * 版本说明（支持模糊查询，会同时搜索SRE配置的版本说明和租户自定义的版本说明）
     * @return releaseNote
     */
    public String getReleaseNote() {
        return releaseNote;
    }

    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }

    public ListTenantVersionConfigRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，默认0
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTenantVersionConfigRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量，默认10，最大20000
     * minimum: 1
     * maximum: 20000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantVersionConfigRequest that = (ListTenantVersionConfigRequest) obj;
        return Objects.equals(this.versionType, that.versionType) && Objects.equals(this.version, that.version)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.versionStatus, that.versionStatus)
            && Objects.equals(this.publishTimeBegin, that.publishTimeBegin)
            && Objects.equals(this.publishTimeEnd, that.publishTimeEnd)
            && Objects.equals(this.releaseNote, that.releaseNote) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionType,
            version,
            osType,
            versionStatus,
            publishTimeBegin,
            publishTimeEnd,
            releaseNote,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantVersionConfigRequest {\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
        sb.append("    publishTimeBegin: ").append(toIndentedString(publishTimeBegin)).append("\n");
        sb.append("    publishTimeEnd: ").append(toIndentedString(publishTimeEnd)).append("\n");
        sb.append("    releaseNote: ").append(toIndentedString(releaseNote)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
