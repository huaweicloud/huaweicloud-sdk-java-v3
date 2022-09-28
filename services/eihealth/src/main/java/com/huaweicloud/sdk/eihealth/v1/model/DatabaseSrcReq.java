package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseSrcReq
 */
public class DatabaseSrcReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database_id")

    private String sourceDatabaseId;

    public DatabaseSrcReq withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * 源数据库id
     * @return sourceDatabaseId
     */
    public String getSourceDatabaseId() {
        return sourceDatabaseId;
    }

    public void setSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseSrcReq databaseSrcReq = (DatabaseSrcReq) o;
        return Objects.equals(this.sourceDatabaseId, databaseSrcReq.sourceDatabaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDatabaseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseSrcReq {\n");
        sb.append("    sourceDatabaseId: ").append(toIndentedString(sourceDatabaseId)).append("\n");
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
