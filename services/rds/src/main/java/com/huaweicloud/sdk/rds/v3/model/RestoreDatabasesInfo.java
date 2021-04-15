package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.RestoreTableInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RestoreDatabasesInfo
 */
public class RestoreDatabasesInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database")
    
    private String database;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tables")
    
    private List<RestoreTableInfo> tables = null;
    
    public RestoreDatabasesInfo withDatabase(String database) {
        this.database = database;
        return this;
    }

    


    /**
     * 库名
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    

    public RestoreDatabasesInfo withTables(List<RestoreTableInfo> tables) {
        this.tables = tables;
        return this;
    }

    
    public RestoreDatabasesInfo addTablesItem(RestoreTableInfo tablesItem) {
        if(this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public RestoreDatabasesInfo withTables(Consumer<List<RestoreTableInfo>> tablesSetter) {
        if(this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 表信息
     * @return tables
     */
    public List<RestoreTableInfo> getTables() {
        return tables;
    }

    public void setTables(List<RestoreTableInfo> tables) {
        this.tables = tables;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreDatabasesInfo restoreDatabasesInfo = (RestoreDatabasesInfo) o;
        return Objects.equals(this.database, restoreDatabasesInfo.database) &&
            Objects.equals(this.tables, restoreDatabasesInfo.tables);
    }
    @Override
    public int hashCode() {
        return Objects.hash(database, tables);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreDatabasesInfo {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

