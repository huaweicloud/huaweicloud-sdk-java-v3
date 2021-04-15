package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.SqlserverDatabaseForDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSqlserverDatabasesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<SqlserverDatabaseForDetail> databases = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListSqlserverDatabasesResponse withDatabases(List<SqlserverDatabaseForDetail> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListSqlserverDatabasesResponse addDatabasesItem(SqlserverDatabaseForDetail databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListSqlserverDatabasesResponse withDatabases(Consumer<List<SqlserverDatabaseForDetail>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库信息。
     * @return databases
     */
    public List<SqlserverDatabaseForDetail> getDatabases() {
        return databases;
    }

    public void setDatabases(List<SqlserverDatabaseForDetail> databases) {
        this.databases = databases;
    }

    

    public ListSqlserverDatabasesResponse withTotalCount(Integer totalCount) {
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
        ListSqlserverDatabasesResponse listSqlserverDatabasesResponse = (ListSqlserverDatabasesResponse) o;
        return Objects.equals(this.databases, listSqlserverDatabasesResponse.databases) &&
            Objects.equals(this.totalCount, listSqlserverDatabasesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlserverDatabasesResponse {\n");
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

