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
public class ListAllInstanceRepositoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositories")

    private List<InstanceRepository> repositories = null;

    public ListAllInstanceRepositoriesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAllInstanceRepositoriesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListAllInstanceRepositoriesResponse withRepositories(List<InstanceRepository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public ListAllInstanceRepositoriesResponse addRepositoriesItem(InstanceRepository repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    public ListAllInstanceRepositoriesResponse withRepositories(Consumer<List<InstanceRepository>> repositoriesSetter) {
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
    public List<InstanceRepository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<InstanceRepository> repositories) {
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
        ListAllInstanceRepositoriesResponse that = (ListAllInstanceRepositoriesResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.repositories, that.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllInstanceRepositoriesResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
