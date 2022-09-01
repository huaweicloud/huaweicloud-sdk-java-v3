package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateDatabaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    @JacksonXmlProperty(localName = "databases")

    private List<CreateDatabaseDetailResponses> databases = null;

    public CreateDatabaseResponse withDatabases(List<CreateDatabaseDetailResponses> databases) {
        this.databases = databases;
        return this;
    }

    public CreateDatabaseResponse addDatabasesItem(CreateDatabaseDetailResponses databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateDatabaseResponse withDatabases(Consumer<List<CreateDatabaseDetailResponses>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 逻辑库相关信息的集合。
     * @return databases
     */
    public List<CreateDatabaseDetailResponses> getDatabases() {
        return databases;
    }

    public void setDatabases(List<CreateDatabaseDetailResponses> databases) {
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
        CreateDatabaseResponse createDatabaseResponse = (CreateDatabaseResponse) o;
        return Objects.equals(this.databases, createDatabaseResponse.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseResponse {\n");
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
