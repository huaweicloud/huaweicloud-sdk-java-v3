package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.PgListDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPostgresqlDatabasesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<PgListDatabase> databases = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListPostgresqlDatabasesResponse withDatabases(List<PgListDatabase> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListPostgresqlDatabasesResponse addDatabasesItem(PgListDatabase databasesItem) {
        this.databases.add(databasesItem);
        return this;
    }

    public ListPostgresqlDatabasesResponse withDatabases(Consumer<List<PgListDatabase>> databasesSetter) {
        if(this.databases == null ){
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库信息。
     * @return databases
     */
    public List<PgListDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<PgListDatabase> databases) {
        this.databases = databases;
    }

    

    public ListPostgresqlDatabasesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPostgresqlDatabasesResponse listPostgresqlDatabasesResponse = (ListPostgresqlDatabasesResponse) o;
        return Objects.equals(this.databases, listPostgresqlDatabasesResponse.databases) &&
            Objects.equals(this.totalCount, listPostgresqlDatabasesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostgresqlDatabasesResponse {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

