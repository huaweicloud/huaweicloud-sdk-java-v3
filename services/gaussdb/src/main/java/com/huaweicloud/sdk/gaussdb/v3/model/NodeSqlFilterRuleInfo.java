package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.NodeSqlFilterRule;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 节点级别的SQL限流规则。
 */
public class NodeSqlFilterRuleInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    @JacksonXmlProperty(localName = "node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    @JacksonXmlProperty(localName = "rules")
    
    private List<NodeSqlFilterRule> rules = null;
    
    public NodeSqlFilterRuleInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public NodeSqlFilterRuleInfo withRules(List<NodeSqlFilterRule> rules) {
        this.rules = rules;
        return this;
    }

    
    public NodeSqlFilterRuleInfo addRulesItem(NodeSqlFilterRule rulesItem) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public NodeSqlFilterRuleInfo withRules(Consumer<List<NodeSqlFilterRule>> rulesSetter) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * SQL限流规则。集合的sql_type值不能重复。
     * @return rules
     */
    public List<NodeSqlFilterRule> getRules() {
        return rules;
    }

    public void setRules(List<NodeSqlFilterRule> rules) {
        this.rules = rules;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeSqlFilterRuleInfo nodeSqlFilterRuleInfo = (NodeSqlFilterRuleInfo) o;
        return Objects.equals(this.nodeId, nodeSqlFilterRuleInfo.nodeId) &&
            Objects.equals(this.rules, nodeSqlFilterRuleInfo.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSqlFilterRuleInfo {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

