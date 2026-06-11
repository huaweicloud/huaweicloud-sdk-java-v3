package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “下载”文件夹重定向配置
 */
public class DownloadsConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_status")

    private Integer downloadsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_redirection_type")

    private Integer downloadsRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_storage_path")

    private String downloadsStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_relative_path")

    private String downloadsRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_exclusive_rights")

    private Integer downloadsExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_move_contents")

    private Integer downloadsMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_move_content_on_policy_removal")

    private Integer downloadsMoveContentOnPolicyRemoval;

    public DownloadsConfigurations withDownloadsStatus(Integer downloadsStatus) {
        this.downloadsStatus = downloadsStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return downloadsStatus
     */
    public Integer getDownloadsStatus() {
        return downloadsStatus;
    }

    public void setDownloadsStatus(Integer downloadsStatus) {
        this.downloadsStatus = downloadsStatus;
    }

    public DownloadsConfigurations withDownloadsRedirectionType(Integer downloadsRedirectionType) {
        this.downloadsRedirectionType = downloadsRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return downloadsRedirectionType
     */
    public Integer getDownloadsRedirectionType() {
        return downloadsRedirectionType;
    }

    public void setDownloadsRedirectionType(Integer downloadsRedirectionType) {
        this.downloadsRedirectionType = downloadsRedirectionType;
    }

    public DownloadsConfigurations withDownloadsStoragePath(String downloadsStoragePath) {
        this.downloadsStoragePath = downloadsStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return downloadsStoragePath
     */
    public String getDownloadsStoragePath() {
        return downloadsStoragePath;
    }

    public void setDownloadsStoragePath(String downloadsStoragePath) {
        this.downloadsStoragePath = downloadsStoragePath;
    }

    public DownloadsConfigurations withDownloadsRelativePath(String downloadsRelativePath) {
        this.downloadsRelativePath = downloadsRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return downloadsRelativePath
     */
    public String getDownloadsRelativePath() {
        return downloadsRelativePath;
    }

    public void setDownloadsRelativePath(String downloadsRelativePath) {
        this.downloadsRelativePath = downloadsRelativePath;
    }

    public DownloadsConfigurations withDownloadsExclusiveRights(Integer downloadsExclusiveRights) {
        this.downloadsExclusiveRights = downloadsExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return downloadsExclusiveRights
     */
    public Integer getDownloadsExclusiveRights() {
        return downloadsExclusiveRights;
    }

    public void setDownloadsExclusiveRights(Integer downloadsExclusiveRights) {
        this.downloadsExclusiveRights = downloadsExclusiveRights;
    }

    public DownloadsConfigurations withDownloadsMoveContents(Integer downloadsMoveContents) {
        this.downloadsMoveContents = downloadsMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return downloadsMoveContents
     */
    public Integer getDownloadsMoveContents() {
        return downloadsMoveContents;
    }

    public void setDownloadsMoveContents(Integer downloadsMoveContents) {
        this.downloadsMoveContents = downloadsMoveContents;
    }

    public DownloadsConfigurations withDownloadsMoveContentOnPolicyRemoval(
        Integer downloadsMoveContentOnPolicyRemoval) {
        this.downloadsMoveContentOnPolicyRemoval = downloadsMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return downloadsMoveContentOnPolicyRemoval
     */
    public Integer getDownloadsMoveContentOnPolicyRemoval() {
        return downloadsMoveContentOnPolicyRemoval;
    }

    public void setDownloadsMoveContentOnPolicyRemoval(Integer downloadsMoveContentOnPolicyRemoval) {
        this.downloadsMoveContentOnPolicyRemoval = downloadsMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadsConfigurations that = (DownloadsConfigurations) obj;
        return Objects.equals(this.downloadsStatus, that.downloadsStatus)
            && Objects.equals(this.downloadsRedirectionType, that.downloadsRedirectionType)
            && Objects.equals(this.downloadsStoragePath, that.downloadsStoragePath)
            && Objects.equals(this.downloadsRelativePath, that.downloadsRelativePath)
            && Objects.equals(this.downloadsExclusiveRights, that.downloadsExclusiveRights)
            && Objects.equals(this.downloadsMoveContents, that.downloadsMoveContents)
            && Objects.equals(this.downloadsMoveContentOnPolicyRemoval, that.downloadsMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadsStatus,
            downloadsRedirectionType,
            downloadsStoragePath,
            downloadsRelativePath,
            downloadsExclusiveRights,
            downloadsMoveContents,
            downloadsMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadsConfigurations {\n");
        sb.append("    downloadsStatus: ").append(toIndentedString(downloadsStatus)).append("\n");
        sb.append("    downloadsRedirectionType: ").append(toIndentedString(downloadsRedirectionType)).append("\n");
        sb.append("    downloadsStoragePath: ").append(toIndentedString(downloadsStoragePath)).append("\n");
        sb.append("    downloadsRelativePath: ").append(toIndentedString(downloadsRelativePath)).append("\n");
        sb.append("    downloadsExclusiveRights: ").append(toIndentedString(downloadsExclusiveRights)).append("\n");
        sb.append("    downloadsMoveContents: ").append(toIndentedString(downloadsMoveContents)).append("\n");
        sb.append("    downloadsMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(downloadsMoveContentOnPolicyRemoval))
            .append("\n");
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
