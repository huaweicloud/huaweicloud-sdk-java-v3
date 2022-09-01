package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateListInfo
 */
public class TemplateListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repos")

    @JacksonXmlProperty(localName = "repos")

    private List<DevstarRepoInfo> repos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    public TemplateListInfo withRepos(List<DevstarRepoInfo> repos) {
        this.repos = repos;
        return this;
    }

    public TemplateListInfo addReposItem(DevstarRepoInfo reposItem) {
        if (this.repos == null) {
            this.repos = new ArrayList<>();
        }
        this.repos.add(reposItem);
        return this;
    }

    public TemplateListInfo withRepos(Consumer<List<DevstarRepoInfo>> reposSetter) {
        if (this.repos == null) {
            this.repos = new ArrayList<>();
        }
        reposSetter.accept(this.repos);
        return this;
    }

    /**
     * 仓库列表
     * @return repos
     */
    public List<DevstarRepoInfo> getRepos() {
        return repos;
    }

    public void setRepos(List<DevstarRepoInfo> repos) {
        this.repos = repos;
    }

    public TemplateListInfo withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 仓库总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateListInfo templateListInfo = (TemplateListInfo) o;
        return Objects.equals(this.repos, templateListInfo.repos)
            && Objects.equals(this.totalCount, templateListInfo.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repos, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateListInfo {\n");
        sb.append("    repos: ").append(toIndentedString(repos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
