package com.huaweicloud.sdk.ugo.v1.model;

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
public class ListMigrationProjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_projects")

    private List<MigrationProject> migrationProjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListMigrationProjectsResponse withMigrationProjects(List<MigrationProject> migrationProjects) {
        this.migrationProjects = migrationProjects;
        return this;
    }

    public ListMigrationProjectsResponse addMigrationProjectsItem(MigrationProject migrationProjectsItem) {
        if (this.migrationProjects == null) {
            this.migrationProjects = new ArrayList<>();
        }
        this.migrationProjects.add(migrationProjectsItem);
        return this;
    }

    public ListMigrationProjectsResponse withMigrationProjects(
        Consumer<List<MigrationProject>> migrationProjectsSetter) {
        if (this.migrationProjects == null) {
            this.migrationProjects = new ArrayList<>();
        }
        migrationProjectsSetter.accept(this.migrationProjects);
        return this;
    }

    /**
     * 当前页的迁移项目列表。
     * @return migrationProjects
     */
    public List<MigrationProject> getMigrationProjects() {
        return migrationProjects;
    }

    public void setMigrationProjects(List<MigrationProject> migrationProjects) {
        this.migrationProjects = migrationProjects;
    }

    public ListMigrationProjectsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 迁移项目总数。
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
        ListMigrationProjectsResponse listMigrationProjectsResponse = (ListMigrationProjectsResponse) o;
        return Objects.equals(this.migrationProjects, listMigrationProjectsResponse.migrationProjects)
            && Objects.equals(this.totalCount, listMigrationProjectsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationProjects, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMigrationProjectsResponse {\n");
        sb.append("    migrationProjects: ").append(toIndentedString(migrationProjects)).append("\n");
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
