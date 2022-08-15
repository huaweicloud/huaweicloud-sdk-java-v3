package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库用户信息。
 */
public class ListGaussMySqlDatabaseUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    
    private List<ListGaussMySqlDatabase> databases = null;
    
    public ListGaussMySqlDatabaseUser withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 数据库用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListGaussMySqlDatabaseUser withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 主机地址。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public ListGaussMySqlDatabaseUser withDatabases(List<ListGaussMySqlDatabase> databases) {
        this.databases = databases;
        return this;
    }

    
    public ListGaussMySqlDatabaseUser addDatabasesItem(ListGaussMySqlDatabase databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListGaussMySqlDatabaseUser withDatabases(Consumer<List<ListGaussMySqlDatabase>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库列表。
     * @return databases
     */
    public List<ListGaussMySqlDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<ListGaussMySqlDatabase> databases) {
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
        ListGaussMySqlDatabaseUser listGaussMySqlDatabaseUser = (ListGaussMySqlDatabaseUser) o;
        return Objects.equals(this.name, listGaussMySqlDatabaseUser.name) &&
            Objects.equals(this.host, listGaussMySqlDatabaseUser.host) &&
            Objects.equals(this.databases, listGaussMySqlDatabaseUser.databases);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, host, databases);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlDatabaseUser {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

