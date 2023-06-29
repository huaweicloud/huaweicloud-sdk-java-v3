package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSyntaxConversionProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_id")

    private String migrationProjectId;

    public ListSyntaxConversionProgressRequest withMigrationProjectId(String migrationProjectId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSyntaxConversionProgressRequest that = (ListSyntaxConversionProgressRequest) obj;
        return Objects.equals(this.migrationProjectId, that.migrationProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSyntaxConversionProgressRequest {\n");
        sb.append("    migrationProjectId: ").append(toIndentedString(migrationProjectId)).append("\n");
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
