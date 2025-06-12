package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class RepositoriesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest")

    private String latest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositories")

    private List<String> repositories = null;

    public RepositoriesResult withLatest(String latest) {
        this.latest = latest;
        return this;
    }

    /**
     * 最后一次仓库名称
     * @return latest
     */
    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public RepositoriesResult withRepositories(List<String> repositories) {
        this.repositories = repositories;
        return this;
    }

    public RepositoriesResult addRepositoriesItem(String repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    public RepositoriesResult withRepositories(Consumer<List<String>> repositoriesSetter) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        repositoriesSetter.accept(this.repositories);
        return this;
    }

    /**
     * 本次任务的构建步骤详情，返回的步骤为页面可见步骤
     * @return repositories
     */
    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoriesResult that = (RepositoriesResult) obj;
        return Objects.equals(this.latest, that.latest) && Objects.equals(this.repositories, that.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latest, repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoriesResult {\n");
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
