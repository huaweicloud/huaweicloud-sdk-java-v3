package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepoListInfoV2
 */
public class RepoListInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositories")

    private List<RepoInfoV2> repositories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public RepoListInfoV2 withRepositories(List<RepoInfoV2> repositories) {
        this.repositories = repositories;
        return this;
    }

    public RepoListInfoV2 addRepositoriesItem(RepoInfoV2 repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    public RepoListInfoV2 withRepositories(Consumer<List<RepoInfoV2>> repositoriesSetter) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        repositoriesSetter.accept(this.repositories);
        return this;
    }

    /**
     * 仓库列表
     * @return repositories
     */
    public List<RepoInfoV2> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<RepoInfoV2> repositories) {
        this.repositories = repositories;
    }

    public RepoListInfoV2 withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 仓库总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoListInfoV2 that = (RepoListInfoV2) obj;
        return Objects.equals(this.repositories, that.repositories) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositories, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoListInfoV2 {\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
