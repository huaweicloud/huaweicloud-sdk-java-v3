package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.SqlFilterRulePattern;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SQL限流规则。
 */
public class SqlFilterRule  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_type")
    

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="patterns")
    
    private List<SqlFilterRulePattern> patterns = null;
    
    public SqlFilterRule withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    


    /**
     * Sql限流类型。  取值范围： - SELECT - UPDATE - DELETE
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    

    public SqlFilterRule withPatterns(List<SqlFilterRulePattern> patterns) {
        this.patterns = patterns;
        return this;
    }

    
    public SqlFilterRule addPatternsItem(SqlFilterRulePattern patternsItem) {
        if(this.patterns == null) {
            this.patterns = new ArrayList<>();
        }
        this.patterns.add(patternsItem);
        return this;
    }

    public SqlFilterRule withPatterns(Consumer<List<SqlFilterRulePattern>> patternsSetter) {
        if(this.patterns == null) {
            this.patterns = new ArrayList<>();
        }
        patternsSetter.accept(this.patterns);
        return this;
    }

    /**
     * SQL限流具体规则。
     * @return patterns
     */
    public List<SqlFilterRulePattern> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<SqlFilterRulePattern> patterns) {
        this.patterns = patterns;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlFilterRule sqlFilterRule = (SqlFilterRule) o;
        return Objects.equals(this.sqlType, sqlFilterRule.sqlType) &&
            Objects.equals(this.patterns, sqlFilterRule.patterns);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sqlType, patterns);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlFilterRule {\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    patterns: ").append(toIndentedString(patterns)).append("\n");
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

