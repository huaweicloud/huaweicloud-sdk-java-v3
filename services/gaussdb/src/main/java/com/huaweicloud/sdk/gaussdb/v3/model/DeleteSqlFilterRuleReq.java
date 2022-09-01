package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteNodeSqlFilterRuleInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * - 开启/关闭sql限流参数体。
 */
public class DeleteSqlFilterRuleReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_filter_rules")
    
    @JacksonXmlProperty(localName = "sql_filter_rules")
    
    private List<DeleteNodeSqlFilterRuleInfo> sqlFilterRules = null;
    
    public DeleteSqlFilterRuleReq withSqlFilterRules(List<DeleteNodeSqlFilterRuleInfo> sqlFilterRules) {
        this.sqlFilterRules = sqlFilterRules;
        return this;
    }

    
    public DeleteSqlFilterRuleReq addSqlFilterRulesItem(DeleteNodeSqlFilterRuleInfo sqlFilterRulesItem) {
        if(this.sqlFilterRules == null) {
            this.sqlFilterRules = new ArrayList<>();
        }
        this.sqlFilterRules.add(sqlFilterRulesItem);
        return this;
    }

    public DeleteSqlFilterRuleReq withSqlFilterRules(Consumer<List<DeleteNodeSqlFilterRuleInfo>> sqlFilterRulesSetter) {
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
    public List<DeleteNodeSqlFilterRuleInfo> getSqlFilterRules() {
        return sqlFilterRules;
    }

    public void setSqlFilterRules(List<DeleteNodeSqlFilterRuleInfo> sqlFilterRules) {
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
        DeleteSqlFilterRuleReq deleteSqlFilterRuleReq = (DeleteSqlFilterRuleReq) o;
        return Objects.equals(this.sqlFilterRules, deleteSqlFilterRuleReq.sqlFilterRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sqlFilterRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSqlFilterRuleReq {\n");
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

