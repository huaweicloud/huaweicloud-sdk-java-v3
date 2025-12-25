package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAllRepositoriesResult
 */
public class ListAllRepositoriesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositories")

    private List<RepositoryBasicDO> repositories = null;

    public ListAllRepositoriesResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总数。 **取值范围**： 不涉及。 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAllRepositoriesResult withRepositories(List<RepositoryBasicDO> repositories) {
        this.repositories = repositories;
        return this;
    }

    public ListAllRepositoriesResult addRepositoriesItem(RepositoryBasicDO repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    public ListAllRepositoriesResult withRepositories(Consumer<List<RepositoryBasicDO>> repositoriesSetter) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        repositoriesSetter.accept(this.repositories);
        return this;
    }

    /**
     * **参数解释**： 仓库详情列表。 **取值范围**： 不涉及。 
     * @return repositories
     */
    public List<RepositoryBasicDO> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<RepositoryBasicDO> repositories) {
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
        ListAllRepositoriesResult that = (ListAllRepositoriesResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.repositories, that.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllRepositoriesResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
