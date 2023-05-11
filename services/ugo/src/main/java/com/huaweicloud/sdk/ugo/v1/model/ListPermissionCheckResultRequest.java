package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPermissionCheckResultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_id")

    private String migrationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListPermissionCheckResultRequest withMigrationProjectId(String migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
        return this;
    }

    /**
     * 迁移项目ID。
     * @return migrationProjectId
     */
    public String getMigrationProjectId() {
        return migrationProjectId;
    }

    public void setMigrationProjectId(String migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
    }

    public ListPermissionCheckResultRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询的偏移量。
     * minimum: 0
     * maximum: 99
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPermissionCheckResultRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPermissionCheckResultRequest listPermissionCheckResultRequest = (ListPermissionCheckResultRequest) o;
        return Objects.equals(this.migrationProjectId, listPermissionCheckResultRequest.migrationProjectId)
            && Objects.equals(this.offset, listPermissionCheckResultRequest.offset)
            && Objects.equals(this.limit, listPermissionCheckResultRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationProjectId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPermissionCheckResultRequest {\n");
        sb.append("    migrationProjectId: ").append(toIndentedString(migrationProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
