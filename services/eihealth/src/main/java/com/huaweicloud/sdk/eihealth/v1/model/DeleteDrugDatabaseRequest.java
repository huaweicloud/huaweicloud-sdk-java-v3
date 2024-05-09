package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDrugDatabaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private String databaseId;

    public DeleteDrugDatabaseRequest withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * 数据库id
     * @return databaseId
     */
    public String getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDrugDatabaseRequest that = (DeleteDrugDatabaseRequest) obj;
        return Objects.equals(this.databaseId, that.databaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDrugDatabaseRequest {\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
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
