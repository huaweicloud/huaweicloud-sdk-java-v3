package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDrugDatabaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<DrugDatabaseDto> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListDrugDatabaseResponse withDatabases(List<DrugDatabaseDto> databases) {
        this.databases = databases;
        return this;
    }

    public ListDrugDatabaseResponse addDatabasesItem(DrugDatabaseDto databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListDrugDatabaseResponse withDatabases(Consumer<List<DrugDatabaseDto>> databasesSetter) {
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
    public List<DrugDatabaseDto> getDatabases() {
        return databases;
    }

    public void setDatabases(List<DrugDatabaseDto> databases) {
        this.databases = databases;
    }

    public ListDrugDatabaseResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数据库总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDrugDatabaseResponse that = (ListDrugDatabaseResponse) obj;
        return Objects.equals(this.databases, that.databases) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDrugDatabaseResponse {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
