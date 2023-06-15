package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.SqlFilterRule;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSqlFilterRuleResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_filter_rules")
    
    private List<SqlFilterRule> sqlFilterRules = null;
    
    public ShowSqlFilterRuleResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public ShowSqlFilterRuleResponse withSqlFilterRules(List<SqlFilterRule> sqlFilterRules) {
        this.sqlFilterRules = sqlFilterRules;
        return this;
    }

    
    public ShowSqlFilterRuleResponse addSqlFilterRulesItem(SqlFilterRule sqlFilterRulesItem) {
        if(this.sqlFilterRules == null) {
            this.sqlFilterRules = new ArrayList<>();
        }
        this.sqlFilterRules.add(sqlFilterRulesItem);
        return this;
    }

    public ShowSqlFilterRuleResponse withSqlFilterRules(Consumer<List<SqlFilterRule>> sqlFilterRulesSetter) {
        if(this.sqlFilterRules == null) {
            this.sqlFilterRules = new ArrayList<>();
        }
        sqlFilterRulesSetter.accept(this.sqlFilterRules);
        return this;
    }

    /**
     * SQL限流规则
     * @return sqlFilterRules
     */
    public List<SqlFilterRule> getSqlFilterRules() {
        return sqlFilterRules;
    }

    public void setSqlFilterRules(List<SqlFilterRule> sqlFilterRules) {
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
        ShowSqlFilterRuleResponse showSqlFilterRuleResponse = (ShowSqlFilterRuleResponse) o;
        return Objects.equals(this.nodeId, showSqlFilterRuleResponse.nodeId) &&
            Objects.equals(this.sqlFilterRules, showSqlFilterRuleResponse.sqlFilterRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, sqlFilterRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlFilterRuleResponse {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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

