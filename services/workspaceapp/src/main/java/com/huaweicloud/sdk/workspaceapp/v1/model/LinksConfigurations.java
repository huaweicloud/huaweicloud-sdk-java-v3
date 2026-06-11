package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “链接”文件夹重定向配置
 */
public class LinksConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_status")

    private Integer linksStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_redirection_type")

    private Integer linksRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_storage_path")

    private String linksStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_relative_path")

    private String linksRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_exclusive_rights")

    private Integer linksExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_move_contents")

    private Integer linksMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_move_content_on_policy_removal")

    private Integer linksMoveContentOnPolicyRemoval;

    public LinksConfigurations withLinksStatus(Integer linksStatus) {
        this.linksStatus = linksStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return linksStatus
     */
    public Integer getLinksStatus() {
        return linksStatus;
    }

    public void setLinksStatus(Integer linksStatus) {
        this.linksStatus = linksStatus;
    }

    public LinksConfigurations withLinksRedirectionType(Integer linksRedirectionType) {
        this.linksRedirectionType = linksRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return linksRedirectionType
     */
    public Integer getLinksRedirectionType() {
        return linksRedirectionType;
    }

    public void setLinksRedirectionType(Integer linksRedirectionType) {
        this.linksRedirectionType = linksRedirectionType;
    }

    public LinksConfigurations withLinksStoragePath(String linksStoragePath) {
        this.linksStoragePath = linksStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return linksStoragePath
     */
    public String getLinksStoragePath() {
        return linksStoragePath;
    }

    public void setLinksStoragePath(String linksStoragePath) {
        this.linksStoragePath = linksStoragePath;
    }

    public LinksConfigurations withLinksRelativePath(String linksRelativePath) {
        this.linksRelativePath = linksRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return linksRelativePath
     */
    public String getLinksRelativePath() {
        return linksRelativePath;
    }

    public void setLinksRelativePath(String linksRelativePath) {
        this.linksRelativePath = linksRelativePath;
    }

    public LinksConfigurations withLinksExclusiveRights(Integer linksExclusiveRights) {
        this.linksExclusiveRights = linksExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return linksExclusiveRights
     */
    public Integer getLinksExclusiveRights() {
        return linksExclusiveRights;
    }

    public void setLinksExclusiveRights(Integer linksExclusiveRights) {
        this.linksExclusiveRights = linksExclusiveRights;
    }

    public LinksConfigurations withLinksMoveContents(Integer linksMoveContents) {
        this.linksMoveContents = linksMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return linksMoveContents
     */
    public Integer getLinksMoveContents() {
        return linksMoveContents;
    }

    public void setLinksMoveContents(Integer linksMoveContents) {
        this.linksMoveContents = linksMoveContents;
    }

    public LinksConfigurations withLinksMoveContentOnPolicyRemoval(Integer linksMoveContentOnPolicyRemoval) {
        this.linksMoveContentOnPolicyRemoval = linksMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return linksMoveContentOnPolicyRemoval
     */
    public Integer getLinksMoveContentOnPolicyRemoval() {
        return linksMoveContentOnPolicyRemoval;
    }

    public void setLinksMoveContentOnPolicyRemoval(Integer linksMoveContentOnPolicyRemoval) {
        this.linksMoveContentOnPolicyRemoval = linksMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinksConfigurations that = (LinksConfigurations) obj;
        return Objects.equals(this.linksStatus, that.linksStatus)
            && Objects.equals(this.linksRedirectionType, that.linksRedirectionType)
            && Objects.equals(this.linksStoragePath, that.linksStoragePath)
            && Objects.equals(this.linksRelativePath, that.linksRelativePath)
            && Objects.equals(this.linksExclusiveRights, that.linksExclusiveRights)
            && Objects.equals(this.linksMoveContents, that.linksMoveContents)
            && Objects.equals(this.linksMoveContentOnPolicyRemoval, that.linksMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linksStatus,
            linksRedirectionType,
            linksStoragePath,
            linksRelativePath,
            linksExclusiveRights,
            linksMoveContents,
            linksMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinksConfigurations {\n");
        sb.append("    linksStatus: ").append(toIndentedString(linksStatus)).append("\n");
        sb.append("    linksRedirectionType: ").append(toIndentedString(linksRedirectionType)).append("\n");
        sb.append("    linksStoragePath: ").append(toIndentedString(linksStoragePath)).append("\n");
        sb.append("    linksRelativePath: ").append(toIndentedString(linksRelativePath)).append("\n");
        sb.append("    linksExclusiveRights: ").append(toIndentedString(linksExclusiveRights)).append("\n");
        sb.append("    linksMoveContents: ").append(toIndentedString(linksMoveContents)).append("\n");
        sb.append("    linksMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(linksMoveContentOnPolicyRemoval))
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
