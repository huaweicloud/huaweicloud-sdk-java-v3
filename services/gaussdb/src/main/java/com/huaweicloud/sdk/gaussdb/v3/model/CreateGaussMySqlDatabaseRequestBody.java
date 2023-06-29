package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建数据库请求体。
 */
public class CreateGaussMySqlDatabaseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<CreateGaussMySqlDatabase> databases = null;

    public CreateGaussMySqlDatabaseRequestBody withDatabases(List<CreateGaussMySqlDatabase> databases) {
        this.databases = databases;
        return this;
    }

    public CreateGaussMySqlDatabaseRequestBody addDatabasesItem(CreateGaussMySqlDatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateGaussMySqlDatabaseRequestBody withDatabases(Consumer<List<CreateGaussMySqlDatabase>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * Get databases
     * @return databases
     */
    public List<CreateGaussMySqlDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<CreateGaussMySqlDatabase> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGaussMySqlDatabaseRequestBody that = (CreateGaussMySqlDatabaseRequestBody) obj;
        return Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGaussMySqlDatabaseRequestBody {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
