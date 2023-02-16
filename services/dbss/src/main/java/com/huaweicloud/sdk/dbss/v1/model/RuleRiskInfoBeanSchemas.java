package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RuleRiskInfoBeanSchemas
 */
public class RuleRiskInfoBeanSchemas  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema")
    
    
    private String schema;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="table")
    
    
    private String table;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="column")
    
    
    private String column;

    public RuleRiskInfoBeanSchemas withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    


    /**
     * schema名称
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    

    public RuleRiskInfoBeanSchemas withTable(String table) {
        this.table = table;
        return this;
    }

    


    /**
     * 表名
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    

    public RuleRiskInfoBeanSchemas withColumn(String column) {
        this.column = column;
        return this;
    }

    


    /**
     * 列名
     * @return column
     */
    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleRiskInfoBeanSchemas ruleRiskInfoBeanSchemas = (RuleRiskInfoBeanSchemas) o;
        return Objects.equals(this.schema, ruleRiskInfoBeanSchemas.schema) &&
            Objects.equals(this.table, ruleRiskInfoBeanSchemas.table) &&
            Objects.equals(this.column, ruleRiskInfoBeanSchemas.column);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schema, table, column);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleRiskInfoBeanSchemas {\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
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

