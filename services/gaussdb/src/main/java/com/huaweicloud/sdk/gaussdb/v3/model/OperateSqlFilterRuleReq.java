package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.NodeSqlFilterRuleInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * - 开启/关闭sql限流参数体。
 */
public class OperateSqlFilterRuleReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_filter_rules")
    
    private List<NodeSqlFilterRuleInfo> sqlFilterRules = null;
    
    public OperateSqlFilterRuleReq withSqlFilterRules(List<NodeSqlFilterRuleInfo> sqlFilterRules) {
        this.sqlFilterRules = sqlFilterRules;
        return this;
    }

    
    public OperateSqlFilterRuleReq addSqlFilterRulesItem(NodeSqlFilterRuleInfo sqlFilterRulesItem) {
        if(this.sqlFilterRules == null) {
            this.sqlFilterRules = new ArrayList<>();
        }
        this.sqlFilterRules.add(sqlFilterRulesItem);
        return this;
    }

    public OperateSqlFilterRuleReq withSqlFilterRules(Consumer<List<NodeSqlFilterRuleInfo>> sqlFilterRulesSetter) {
        if(this.sqlFilterRules == null) {
            this.sqlFilterRules = new ArrayList<>();
        }
        sqlFilterRulesSetter.accept(this.sqlFilterRules);
        return this;
    }

    /**
     * Get sqlFilterRules
     * @return sqlFilterRules
     */
    public List<NodeSqlFilterRuleInfo> getSqlFilterRules() {
        return sqlFilterRules;
    }

    public void setSqlFilterRules(List<NodeSqlFilterRuleInfo> sqlFilterRules) {
        this.sqlFilterRules = sqlFilterRules;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateSqlFilterRuleReq operateSqlFilterRuleReq = (OperateSqlFilterRuleReq) o;
        return Objects.equals(this.sqlFilterRules, operateSqlFilterRuleReq.sqlFilterRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sqlFilterRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateSqlFilterRuleReq {\n");
        sb.append("    sqlFilterRules: ").append(toIndentedString(sqlFilterRules)).append("\n");
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

