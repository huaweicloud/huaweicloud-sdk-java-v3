package com.huaweicloud.sdk.dbss.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.DataBaseBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAuditDatabasesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    
    private List<DataBaseBean> databases = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    
    private Integer total;

    public ListAuditDatabasesResponse withDatabases(List<DataBaseBean> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListAuditDatabasesResponse addDatabasesItem(DataBaseBean databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListAuditDatabasesResponse withDatabases(Consumer<List<DataBaseBean>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库信息列表
     * @return databases
     */
    public List<DataBaseBean> getDatabases() {
        return databases;
    }

    public void setDatabases(List<DataBaseBean> databases) {
        this.databases = databases;
    }

    

    public ListAuditDatabasesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
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
        ListAuditDatabasesResponse listAuditDatabasesResponse = (ListAuditDatabasesResponse) o;
        return Objects.equals(this.databases, listAuditDatabasesResponse.databases) &&
            Objects.equals(this.total, listAuditDatabasesResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditDatabasesResponse {\n");
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

