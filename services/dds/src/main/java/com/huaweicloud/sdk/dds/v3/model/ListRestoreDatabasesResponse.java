package com.huaweicloud.sdk.dds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRestoreDatabasesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<String> databases = null;
    
    public ListRestoreDatabasesResponse withTotalCount(Integer totalCount) {
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

    

    public ListRestoreDatabasesResponse withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListRestoreDatabasesResponse addDatabasesItem(String databasesItem) {
        this.databases.add(databasesItem);
        return this;
    }

    public ListRestoreDatabasesResponse withDatabases(Consumer<List<String>> databasesSetter) {
        if(this.databases == null ){
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库列表，列表中每个元素表示一个数据库。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
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
        ListRestoreDatabasesResponse listRestoreDatabasesResponse = (ListRestoreDatabasesResponse) o;
        return Objects.equals(this.totalCount, listRestoreDatabasesResponse.totalCount) &&
            Objects.equals(this.databases, listRestoreDatabasesResponse.databases);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, databases);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreDatabasesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

