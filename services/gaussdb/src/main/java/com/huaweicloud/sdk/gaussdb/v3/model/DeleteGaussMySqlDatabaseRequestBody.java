package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 删除数据库请求体。
 */
public class DeleteGaussMySqlDatabaseRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<String> databases = null;
    
    public DeleteGaussMySqlDatabaseRequestBody withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    
    public DeleteGaussMySqlDatabaseRequestBody addDatabasesItem(String databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public DeleteGaussMySqlDatabaseRequestBody withDatabases(Consumer<List<String>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 准备删除的数据库列表，列表最大长度为50。
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
        DeleteGaussMySqlDatabaseRequestBody deleteGaussMySqlDatabaseRequestBody = (DeleteGaussMySqlDatabaseRequestBody) o;
        return Objects.equals(this.databases, deleteGaussMySqlDatabaseRequestBody.databases);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databases);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGaussMySqlDatabaseRequestBody {\n");
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

