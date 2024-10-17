package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RdsDbRequest
 */
public class RdsDbRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<RdsDbRequestDatabases> databases = null;

    public RdsDbRequest withDatabases(List<RdsDbRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }

    public RdsDbRequest addDatabasesItem(RdsDbRequestDatabases databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public RdsDbRequest withDatabases(Consumer<List<RdsDbRequestDatabases>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库列表
     * @return databases
     */
    public List<RdsDbRequestDatabases> getDatabases() {
        return databases;
    }

    public void setDatabases(List<RdsDbRequestDatabases> databases) {
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
        RdsDbRequest that = (RdsDbRequest) obj;
        return Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RdsDbRequest {\n");
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
