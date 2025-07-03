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
public class ListSharedRepoDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repos")

    private List<ShowReposRespV3> repos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nextMarker")

    private Integer nextMarker;

    public ListSharedRepoDetailsResponse withRepos(List<ShowReposRespV3> repos) {
        this.repos = repos;
        return this;
    }

    public ListSharedRepoDetailsResponse addReposItem(ShowReposRespV3 reposItem) {
        if (this.repos == null) {
            this.repos = new ArrayList<>();
        }
        this.repos.add(reposItem);
        return this;
    }

    public ListSharedRepoDetailsResponse withRepos(Consumer<List<ShowReposRespV3>> reposSetter) {
        if (this.repos == null) {
            this.repos = new ArrayList<>();
        }
        reposSetter.accept(this.repos);
        return this;
    }

    /**
     * 镜像仓库列表.
     * @return repos
     */
    public List<ShowReposRespV3> getRepos() {
        return repos;
    }

    public void setRepos(List<ShowReposRespV3> repos) {
        this.repos = repos;
    }

    public ListSharedRepoDetailsResponse withNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 分页查询时,查询下一页数据的起始位置。
     * @return nextMarker
     */
    public Integer getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSharedRepoDetailsResponse that = (ListSharedRepoDetailsResponse) obj;
        return Objects.equals(this.repos, that.repos) && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repos, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSharedRepoDetailsResponse {\n");
        sb.append("    repos: ").append(toIndentedString(repos)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
