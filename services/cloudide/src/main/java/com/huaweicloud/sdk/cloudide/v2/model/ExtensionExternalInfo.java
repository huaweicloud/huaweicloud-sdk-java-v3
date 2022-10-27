package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ExtensionExternalInfo
 */
public class ExtensionExternalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_id")

    private String extensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_url")

    private String repoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "help_page")

    private String helpPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "website")

    private String website;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_link")

    private String issueLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_previews")

    private Boolean showPreviews;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ExtensionExternalInfo withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * 插件id
     * @return extensionId
     */
    public String getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(String extensionId) {
        this.extensionId = extensionId;
    }

    public ExtensionExternalInfo withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * 源码仓地址
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public ExtensionExternalInfo withHelpPage(String helpPage) {
        this.helpPage = helpPage;
        return this;
    }

    /**
     * 帮助页面
     * @return helpPage
     */
    public String getHelpPage() {
        return helpPage;
    }

    public void setHelpPage(String helpPage) {
        this.helpPage = helpPage;
    }

    public ExtensionExternalInfo withWebsite(String website) {
        this.website = website;
        return this;
    }

    /**
     * 产品首页
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public ExtensionExternalInfo withIssueLink(String issueLink) {
        this.issueLink = issueLink;
        return this;
    }

    /**
     * 问题链接
     * @return issueLink
     */
    public String getIssueLink() {
        return issueLink;
    }

    public void setIssueLink(String issueLink) {
        this.issueLink = issueLink;
    }

    public ExtensionExternalInfo withShowPreviews(Boolean showPreviews) {
        this.showPreviews = showPreviews;
        return this;
    }

    /**
     * 是否支持预览
     * @return showPreviews
     */
    public Boolean getShowPreviews() {
        return showPreviews;
    }

    public void setShowPreviews(Boolean showPreviews) {
        this.showPreviews = showPreviews;
    }

    public ExtensionExternalInfo withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ExtensionExternalInfo withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionExternalInfo extensionExternalInfo = (ExtensionExternalInfo) o;
        return Objects.equals(this.extensionId, extensionExternalInfo.extensionId)
            && Objects.equals(this.repoUrl, extensionExternalInfo.repoUrl)
            && Objects.equals(this.helpPage, extensionExternalInfo.helpPage)
            && Objects.equals(this.website, extensionExternalInfo.website)
            && Objects.equals(this.issueLink, extensionExternalInfo.issueLink)
            && Objects.equals(this.showPreviews, extensionExternalInfo.showPreviews)
            && Objects.equals(this.createdAt, extensionExternalInfo.createdAt)
            && Objects.equals(this.updatedAt, extensionExternalInfo.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensionId, repoUrl, helpPage, website, issueLink, showPreviews, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionExternalInfo {\n");
        sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    helpPage: ").append(toIndentedString(helpPage)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    issueLink: ").append(toIndentedString(issueLink)).append("\n");
        sb.append("    showPreviews: ").append(toIndentedString(showPreviews)).append("\n");
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
