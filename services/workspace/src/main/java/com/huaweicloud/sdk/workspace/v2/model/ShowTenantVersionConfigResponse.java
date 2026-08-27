package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTenantVersionConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_config_id")

    private String versionConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_release_note")

    private String customReleaseNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_note")

    private String releaseNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_download_url")

    private String versionDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ShowTenantVersionConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 租户版本配置ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowTenantVersionConfigResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowTenantVersionConfigResponse withVersionConfigId(String versionConfigId) {
        this.versionConfigId = versionConfigId;
        return this;
    }

    /**
     * 关联版本配置表ID
     * @return versionConfigId
     */
    public String getVersionConfigId() {
        return versionConfigId;
    }

    public void setVersionConfigId(String versionConfigId) {
        this.versionConfigId = versionConfigId;
    }

    public ShowTenantVersionConfigResponse withCustomReleaseNote(String customReleaseNote) {
        this.customReleaseNote = customReleaseNote;
        return this;
    }

    /**
     * 自定义版本说明
     * @return customReleaseNote
     */
    public String getCustomReleaseNote() {
        return customReleaseNote;
    }

    public void setCustomReleaseNote(String customReleaseNote) {
        this.customReleaseNote = customReleaseNote;
    }

    public ShowTenantVersionConfigResponse withReleaseNote(String releaseNote) {
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

    public ShowTenantVersionConfigResponse withVersionDownloadUrl(String versionDownloadUrl) {
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

    public ShowTenantVersionConfigResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowTenantVersionConfigResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTenantVersionConfigResponse that = (ShowTenantVersionConfigResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.versionConfigId, that.versionConfigId)
            && Objects.equals(this.customReleaseNote, that.customReleaseNote)
            && Objects.equals(this.releaseNote, that.releaseNote)
            && Objects.equals(this.versionDownloadUrl, that.versionDownloadUrl)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            versionConfigId,
            customReleaseNote,
            releaseNote,
            versionDownloadUrl,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantVersionConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    versionConfigId: ").append(toIndentedString(versionConfigId)).append("\n");
        sb.append("    customReleaseNote: ").append(toIndentedString(customReleaseNote)).append("\n");
        sb.append("    releaseNote: ").append(toIndentedString(releaseNote)).append("\n");
        sb.append("    versionDownloadUrl: ").append(toIndentedString(versionDownloadUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
