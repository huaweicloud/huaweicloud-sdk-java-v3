package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDatabaseUsersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    public ListDatabaseUsersRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 被查询的数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatabaseUsersRequest listDatabaseUsersRequest = (ListDatabaseUsersRequest) o;
        return Objects.equals(this.databaseName, listDatabaseUsersRequest.databaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseUsersRequest {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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
