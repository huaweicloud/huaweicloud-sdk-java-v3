package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “搜索”文件夹重定向配置
 */
public class SearchesConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_status")

    private Integer searchesStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_redirection_type")

    private Integer searchesRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_storage_path")

    private String searchesStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_relative_path")

    private String searchesRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_exclusive_rights")

    private Integer searchesExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_move_contents")

    private Integer searchesMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_move_content_on_policy_removal")

    private Integer searchesMoveContentOnPolicyRemoval;

    public SearchesConfigurations withSearchesStatus(Integer searchesStatus) {
        this.searchesStatus = searchesStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return searchesStatus
     */
    public Integer getSearchesStatus() {
        return searchesStatus;
    }

    public void setSearchesStatus(Integer searchesStatus) {
        this.searchesStatus = searchesStatus;
    }

    public SearchesConfigurations withSearchesRedirectionType(Integer searchesRedirectionType) {
        this.searchesRedirectionType = searchesRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return searchesRedirectionType
     */
    public Integer getSearchesRedirectionType() {
        return searchesRedirectionType;
    }

    public void setSearchesRedirectionType(Integer searchesRedirectionType) {
        this.searchesRedirectionType = searchesRedirectionType;
    }

    public SearchesConfigurations withSearchesStoragePath(String searchesStoragePath) {
        this.searchesStoragePath = searchesStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return searchesStoragePath
     */
    public String getSearchesStoragePath() {
        return searchesStoragePath;
    }

    public void setSearchesStoragePath(String searchesStoragePath) {
        this.searchesStoragePath = searchesStoragePath;
    }

    public SearchesConfigurations withSearchesRelativePath(String searchesRelativePath) {
        this.searchesRelativePath = searchesRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return searchesRelativePath
     */
    public String getSearchesRelativePath() {
        return searchesRelativePath;
    }

    public void setSearchesRelativePath(String searchesRelativePath) {
        this.searchesRelativePath = searchesRelativePath;
    }

    public SearchesConfigurations withSearchesExclusiveRights(Integer searchesExclusiveRights) {
        this.searchesExclusiveRights = searchesExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return searchesExclusiveRights
     */
    public Integer getSearchesExclusiveRights() {
        return searchesExclusiveRights;
    }

    public void setSearchesExclusiveRights(Integer searchesExclusiveRights) {
        this.searchesExclusiveRights = searchesExclusiveRights;
    }

    public SearchesConfigurations withSearchesMoveContents(Integer searchesMoveContents) {
        this.searchesMoveContents = searchesMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return searchesMoveContents
     */
    public Integer getSearchesMoveContents() {
        return searchesMoveContents;
    }

    public void setSearchesMoveContents(Integer searchesMoveContents) {
        this.searchesMoveContents = searchesMoveContents;
    }

    public SearchesConfigurations withSearchesMoveContentOnPolicyRemoval(Integer searchesMoveContentOnPolicyRemoval) {
        this.searchesMoveContentOnPolicyRemoval = searchesMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return searchesMoveContentOnPolicyRemoval
     */
    public Integer getSearchesMoveContentOnPolicyRemoval() {
        return searchesMoveContentOnPolicyRemoval;
    }

    public void setSearchesMoveContentOnPolicyRemoval(Integer searchesMoveContentOnPolicyRemoval) {
        this.searchesMoveContentOnPolicyRemoval = searchesMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchesConfigurations that = (SearchesConfigurations) obj;
        return Objects.equals(this.searchesStatus, that.searchesStatus)
            && Objects.equals(this.searchesRedirectionType, that.searchesRedirectionType)
            && Objects.equals(this.searchesStoragePath, that.searchesStoragePath)
            && Objects.equals(this.searchesRelativePath, that.searchesRelativePath)
            && Objects.equals(this.searchesExclusiveRights, that.searchesExclusiveRights)
            && Objects.equals(this.searchesMoveContents, that.searchesMoveContents)
            && Objects.equals(this.searchesMoveContentOnPolicyRemoval, that.searchesMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchesStatus,
            searchesRedirectionType,
            searchesStoragePath,
            searchesRelativePath,
            searchesExclusiveRights,
            searchesMoveContents,
            searchesMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchesConfigurations {\n");
        sb.append("    searchesStatus: ").append(toIndentedString(searchesStatus)).append("\n");
        sb.append("    searchesRedirectionType: ").append(toIndentedString(searchesRedirectionType)).append("\n");
        sb.append("    searchesStoragePath: ").append(toIndentedString(searchesStoragePath)).append("\n");
        sb.append("    searchesRelativePath: ").append(toIndentedString(searchesRelativePath)).append("\n");
        sb.append("    searchesExclusiveRights: ").append(toIndentedString(searchesExclusiveRights)).append("\n");
        sb.append("    searchesMoveContents: ").append(toIndentedString(searchesMoveContents)).append("\n");
        sb.append("    searchesMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(searchesMoveContentOnPolicyRemoval))
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
