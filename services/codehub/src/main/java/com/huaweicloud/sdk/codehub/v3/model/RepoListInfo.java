package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** RepoListInfo */
public class RepoListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositorys")

    private List<RepoInfo> repositorys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public RepoListInfo withRepositorys(List<RepoInfo> repositorys) {
        this.repositorys = repositorys;
        return this;
    }

    public RepoListInfo addRepositorysItem(RepoInfo repositorysItem) {
        if (this.repositorys == null) {
            this.repositorys = new ArrayList<>();
        }
        this.repositorys.add(repositorysItem);
        return this;
    }

    public RepoListInfo withRepositorys(Consumer<List<RepoInfo>> repositorysSetter) {
        if (this.repositorys == null) {
            this.repositorys = new ArrayList<>();
        }
        repositorysSetter.accept(this.repositorys);
        return this;
    }

    /** 仓库列表
     * 
     * @return repositorys */
    public List<RepoInfo> getRepositorys() {
        return repositorys;
    }

    public void setRepositorys(List<RepoInfo> repositorys) {
        this.repositorys = repositorys;
    }

    public RepoListInfo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 仓库总数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoListInfo repoListInfo = (RepoListInfo) o;
        return Objects.equals(this.repositorys, repoListInfo.repositorys)
            && Objects.equals(this.total, repoListInfo.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositorys, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoListInfo {\n");
        sb.append("    repositorys: ").append(toIndentedString(repositorys)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
