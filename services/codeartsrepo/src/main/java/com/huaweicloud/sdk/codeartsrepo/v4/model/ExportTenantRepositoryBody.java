package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 仓库Id列表
 */
public class ExportTenantRepositoryBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_ids")

    private List<Integer> repositoryIds = null;

    public ExportTenantRepositoryBody withRepositoryIds(List<Integer> repositoryIds) {
        this.repositoryIds = repositoryIds;
        return this;
    }

    public ExportTenantRepositoryBody addRepositoryIdsItem(Integer repositoryIdsItem) {
        if (this.repositoryIds == null) {
            this.repositoryIds = new ArrayList<>();
        }
        this.repositoryIds.add(repositoryIdsItem);
        return this;
    }

    public ExportTenantRepositoryBody withRepositoryIds(Consumer<List<Integer>> repositoryIdsSetter) {
        if (this.repositoryIds == null) {
            this.repositoryIds = new ArrayList<>();
        }
        repositoryIdsSetter.accept(this.repositoryIds);
        return this;
    }

    /**
     * Get repositoryIds
     * @return repositoryIds
     */
    public List<Integer> getRepositoryIds() {
        return repositoryIds;
    }

    public void setRepositoryIds(List<Integer> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTenantRepositoryBody that = (ExportTenantRepositoryBody) obj;
        return Objects.equals(this.repositoryIds, that.repositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTenantRepositoryBody {\n");
        sb.append("    repositoryIds: ").append(toIndentedString(repositoryIds)).append("\n");
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
