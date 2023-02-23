package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussListDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDatabasesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<GaussDBforOpenGaussListDatabase> databases = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    

    private Long totalCount;

    public ListDatabasesResponse withDatabases(List<GaussDBforOpenGaussListDatabase> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListDatabasesResponse addDatabasesItem(GaussDBforOpenGaussListDatabase databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListDatabasesResponse withDatabases(Consumer<List<GaussDBforOpenGaussListDatabase>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 列表中每个元素表示一个数据库。
     * @return databases
     */
    public List<GaussDBforOpenGaussListDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<GaussDBforOpenGaussListDatabase> databases) {
        this.databases = databases;
    }

    

    public ListDatabasesResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 数据库总数。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
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
        ListDatabasesResponse listDatabasesResponse = (ListDatabasesResponse) o;
        return Objects.equals(this.databases, listDatabasesResponse.databases) &&
            Objects.equals(this.totalCount, listDatabasesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabasesResponse {\n");
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

