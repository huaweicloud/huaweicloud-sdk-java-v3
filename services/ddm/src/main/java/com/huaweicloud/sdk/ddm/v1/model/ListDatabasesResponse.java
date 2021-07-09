package com.huaweicloud.sdk.ddm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.GetDatabaseInfo;
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
    
    private List<GetDatabaseInfo> databases = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListDatabasesResponse withDatabases(List<GetDatabaseInfo> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListDatabasesResponse addDatabasesItem(GetDatabaseInfo databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListDatabasesResponse withDatabases(Consumer<List<GetDatabaseInfo>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 逻辑库相关信息的集合
     * @return databases
     */
    public List<GetDatabaseInfo> getDatabases() {
        return databases;
    }

    public void setDatabases(List<GetDatabaseInfo> databases) {
        this.databases = databases;
    }

    

    public ListDatabasesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
            Objects.equals(this.total, listDatabasesResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabasesResponse {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

