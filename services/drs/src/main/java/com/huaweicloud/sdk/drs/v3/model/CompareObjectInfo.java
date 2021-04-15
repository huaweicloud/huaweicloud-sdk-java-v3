package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CompareObjectInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="table_name")
    
    private List<String> tableName = null;
    
    public CompareObjectInfo withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public CompareObjectInfo withTableName(List<String> tableName) {
        this.tableName = tableName;
        return this;
    }

    
    public CompareObjectInfo addTableNameItem(String tableNameItem) {
        if(this.tableName == null) {
            this.tableName = new ArrayList<>();
        }
        this.tableName.add(tableNameItem);
        return this;
    }

    public CompareObjectInfo withTableName(Consumer<List<String>> tableNameSetter) {
        if(this.tableName == null) {
            this.tableName = new ArrayList<>();
        }
        tableNameSetter.accept(this.tableName);
        return this;
    }

    /**
     * 该库下的表名列表。
     * @return tableName
     */
    public List<String> getTableName() {
        return tableName;
    }

    public void setTableName(List<String> tableName) {
        this.tableName = tableName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareObjectInfo compareObjectInfo = (CompareObjectInfo) o;
        return Objects.equals(this.dbName, compareObjectInfo.dbName) &&
            Objects.equals(this.tableName, compareObjectInfo.tableName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbName, tableName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareObjectInfo {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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

