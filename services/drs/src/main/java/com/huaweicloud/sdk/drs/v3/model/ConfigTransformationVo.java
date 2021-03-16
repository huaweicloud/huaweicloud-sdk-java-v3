package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据同步配置库规则信息体
 */
public class ConfigTransformationVo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_table_name")
    
    private String dbTableName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="table_name")
    
    private String tableName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="col_names")
    
    private String colNames;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="prim_key_or_index")
    
    private String primKeyOrIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indexs")
    
    private String indexs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private String values;

    public ConfigTransformationVo withDbTableName(String dbTableName) {
        this.dbTableName = dbTableName;
        return this;
    }

    


    /**
     * 库名.表名。
     * @return dbTableName
     */
    public String getDbTableName() {
        return dbTableName;
    }

    public void setDbTableName(String dbTableName) {
        this.dbTableName = dbTableName;
    }

    

    public ConfigTransformationVo withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 库名。长度限制256。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public ConfigTransformationVo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    


    /**
     * 表名。长度限制256。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    

    public ConfigTransformationVo withColNames(String colNames) {
        this.colNames = colNames;
        return this;
    }

    


    /**
     * 列名。长度限制256。
     * @return colNames
     */
    public String getColNames() {
        return colNames;
    }

    public void setColNames(String colNames) {
        this.colNames = colNames;
    }

    

    public ConfigTransformationVo withPrimKeyOrIndex(String primKeyOrIndex) {
        this.primKeyOrIndex = primKeyOrIndex;
        return this;
    }

    


    /**
     * 主键或唯一索引。长度限制256。
     * @return primKeyOrIndex
     */
    public String getPrimKeyOrIndex() {
        return primKeyOrIndex;
    }

    public void setPrimKeyOrIndex(String primKeyOrIndex) {
        this.primKeyOrIndex = primKeyOrIndex;
    }

    

    public ConfigTransformationVo withIndexs(String indexs) {
        this.indexs = indexs;
        return this;
    }

    


    /**
     * 优化查询所需的索引。长度限制256。
     * @return indexs
     */
    public String getIndexs() {
        return indexs;
    }

    public void setIndexs(String indexs) {
        this.indexs = indexs;
    }

    

    public ConfigTransformationVo withValues(String values) {
        this.values = values;
        return this;
    }

    


    /**
     * 过滤条件。长度限制256。
     * @return values
     */
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigTransformationVo configTransformationVo = (ConfigTransformationVo) o;
        return Objects.equals(this.dbTableName, configTransformationVo.dbTableName) &&
            Objects.equals(this.dbName, configTransformationVo.dbName) &&
            Objects.equals(this.tableName, configTransformationVo.tableName) &&
            Objects.equals(this.colNames, configTransformationVo.colNames) &&
            Objects.equals(this.primKeyOrIndex, configTransformationVo.primKeyOrIndex) &&
            Objects.equals(this.indexs, configTransformationVo.indexs) &&
            Objects.equals(this.values, configTransformationVo.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbTableName, dbName, tableName, colNames, primKeyOrIndex, indexs, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigTransformationVo {\n");
        sb.append("    dbTableName: ").append(toIndentedString(dbTableName)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    colNames: ").append(toIndentedString(colNames)).append("\n");
        sb.append("    primKeyOrIndex: ").append(toIndentedString(primKeyOrIndex)).append("\n");
        sb.append("    indexs: ").append(toIndentedString(indexs)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

