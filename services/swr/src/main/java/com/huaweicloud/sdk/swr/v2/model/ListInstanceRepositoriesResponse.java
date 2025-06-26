package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceRepositoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositories")

    private List<Repository> repositories = null;

    public ListInstanceRepositoriesResponse withTotal(Integer total) {
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

    public ListInstanceRepositoriesResponse withRepositories(List<Repository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public ListInstanceRepositoriesResponse addRepositoriesItem(Repository repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    public ListInstanceRepositoriesResponse withRepositories(Consumer<List<Repository>> repositoriesSetter) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        repositoriesSetter.accept(this.repositories);
        return this;
    }

    /**
     * 仓库列表详情
     * @return repositories
     */
    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
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
        ListInstanceRepositoriesResponse that = (ListInstanceRepositoriesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.repositories, that.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceRepositoriesResponse {\n");
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
