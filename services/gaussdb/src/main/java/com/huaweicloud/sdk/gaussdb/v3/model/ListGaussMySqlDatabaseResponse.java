package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMysqlDatabaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGaussMySqlDatabaseResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    
    private List<ListGaussMysqlDatabaseInfo> databases = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListGaussMySqlDatabaseResponse withDatabases(List<ListGaussMysqlDatabaseInfo> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListGaussMySqlDatabaseResponse addDatabasesItem(ListGaussMysqlDatabaseInfo databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListGaussMySqlDatabaseResponse withDatabases(Consumer<List<ListGaussMysqlDatabaseInfo>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库信息列表。
     * @return databases
     */
    public List<ListGaussMysqlDatabaseInfo> getDatabases() {
        return databases;
    }

    public void setDatabases(List<ListGaussMysqlDatabaseInfo> databases) {
        this.databases = databases;
    }

    

    public ListGaussMySqlDatabaseResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 数据库总数。
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
        ListGaussMySqlDatabaseResponse listGaussMySqlDatabaseResponse = (ListGaussMySqlDatabaseResponse) o;
        return Objects.equals(this.databases, listGaussMySqlDatabaseResponse.databases) &&
            Objects.equals(this.totalCount, listGaussMySqlDatabaseResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlDatabaseResponse {\n");
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

