package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDatabaseOwnerRequestBody
 */
public class UpdateDatabaseOwnerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    public UpdateDatabaseOwnerRequestBody withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 修改后数据库owner
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public UpdateDatabaseOwnerRequestBody withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名称
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDatabaseOwnerRequestBody that = (UpdateDatabaseOwnerRequestBody) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.database, that.database);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, database);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseOwnerRequestBody {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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
