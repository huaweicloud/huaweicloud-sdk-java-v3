package com.huaweicloud.sdk.devstar.v1.model;

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
public class ShowApplicationReleaseRepositoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_repositories")

    private List<ReleaseRepository> releaseRepositories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowApplicationReleaseRepositoriesResponse withReleaseRepositories(
        List<ReleaseRepository> releaseRepositories) {
        this.releaseRepositories = releaseRepositories;
        return this;
    }

    public ShowApplicationReleaseRepositoriesResponse addReleaseRepositoriesItem(
        ReleaseRepository releaseRepositoriesItem) {
        if (this.releaseRepositories == null) {
            this.releaseRepositories = new ArrayList<>();
        }
        this.releaseRepositories.add(releaseRepositoriesItem);
        return this;
    }

    public ShowApplicationReleaseRepositoriesResponse withReleaseRepositories(
        Consumer<List<ReleaseRepository>> releaseRepositoriesSetter) {
        if (this.releaseRepositories == null) {
            this.releaseRepositories = new ArrayList<>();
        }
        releaseRepositoriesSetter.accept(this.releaseRepositories);
        return this;
    }

    /**
     * 软件包列表
     * @return releaseRepositories
     */
    public List<ReleaseRepository> getReleaseRepositories() {
        return releaseRepositories;
    }

    public void setReleaseRepositories(List<ReleaseRepository> releaseRepositories) {
        this.releaseRepositories = releaseRepositories;
    }

    public ShowApplicationReleaseRepositoriesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 软件包总条数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowApplicationReleaseRepositoriesResponse that = (ShowApplicationReleaseRepositoriesResponse) obj;
        return Objects.equals(this.releaseRepositories, that.releaseRepositories)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseRepositories, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationReleaseRepositoriesResponse {\n");
        sb.append("    releaseRepositories: ").append(toIndentedString(releaseRepositories)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
