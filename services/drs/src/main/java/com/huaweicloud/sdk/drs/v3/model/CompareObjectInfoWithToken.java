package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.CompareTableInfoWithToken;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CompareObjectInfoWithToken  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="table_name_with_token")
    
    private List<CompareTableInfoWithToken> tableNameWithToken = null;
    
    public CompareObjectInfoWithToken withDbName(String dbName) {
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

    

    public CompareObjectInfoWithToken withTableNameWithToken(List<CompareTableInfoWithToken> tableNameWithToken) {
        this.tableNameWithToken = tableNameWithToken;
        return this;
    }

    
    public CompareObjectInfoWithToken addTableNameWithTokenItem(CompareTableInfoWithToken tableNameWithTokenItem) {
        if(this.tableNameWithToken == null) {
            this.tableNameWithToken = new ArrayList<>();
        }
        this.tableNameWithToken.add(tableNameWithTokenItem);
        return this;
    }

    public CompareObjectInfoWithToken withTableNameWithToken(Consumer<List<CompareTableInfoWithToken>> tableNameWithTokenSetter) {
        if(this.tableNameWithToken == null) {
            this.tableNameWithToken = new ArrayList<>();
        }
        tableNameWithTokenSetter.accept(this.tableNameWithToken);
        return this;
    }

    /**
     * 该库下的表信息列表（带token）。
     * @return tableNameWithToken
     */
    public List<CompareTableInfoWithToken> getTableNameWithToken() {
        return tableNameWithToken;
    }

    public void setTableNameWithToken(List<CompareTableInfoWithToken> tableNameWithToken) {
        this.tableNameWithToken = tableNameWithToken;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareObjectInfoWithToken compareObjectInfoWithToken = (CompareObjectInfoWithToken) o;
        return Objects.equals(this.dbName, compareObjectInfoWithToken.dbName) &&
            Objects.equals(this.tableNameWithToken, compareObjectInfoWithToken.tableNameWithToken);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbName, tableNameWithToken);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareObjectInfoWithToken {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableNameWithToken: ").append(toIndentedString(tableNameWithToken)).append("\n");
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

