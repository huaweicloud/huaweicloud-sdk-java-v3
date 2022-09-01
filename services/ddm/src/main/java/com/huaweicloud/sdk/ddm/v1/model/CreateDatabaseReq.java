package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateDatabaseReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    @JacksonXmlProperty(localName = "databases")

    private List<CreateDatabaseDetail> databases = null;

    public CreateDatabaseReq withDatabases(List<CreateDatabaseDetail> databases) {
        this.databases = databases;
        return this;
    }

    public CreateDatabaseReq addDatabasesItem(CreateDatabaseDetail databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateDatabaseReq withDatabases(Consumer<List<CreateDatabaseDetail>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 逻辑库相关信息的集合
     * @return databases
     */
    public List<CreateDatabaseDetail> getDatabases() {
        return databases;
    }

    public void setDatabases(List<CreateDatabaseDetail> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatabaseReq createDatabaseReq = (CreateDatabaseReq) o;
        return Objects.equals(this.databases, createDatabaseReq.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseReq {\n");
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
