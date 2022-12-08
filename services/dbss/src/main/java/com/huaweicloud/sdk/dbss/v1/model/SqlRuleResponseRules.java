package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SqlRuleResponseRules
 */
public class SqlRuleResponseRules  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_level")
    
    
    private String riskLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rank")
    
    
    private Integer rank;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="feature")
    
    
    private String feature;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regex")
    
    
    private String regex;

    public SqlRuleResponseRules withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * SQL规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public SqlRuleResponseRules withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * SQL规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public SqlRuleResponseRules withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 规则的状态：  ON  OFF
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public SqlRuleResponseRules withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    


    /**
     * 风险级别  HIGH  MEDIUM  LOW
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    

    public SqlRuleResponseRules withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public SqlRuleResponseRules withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    


    /**
     * 等级
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    

    public SqlRuleResponseRules withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    


    /**
     * SQL命令特征
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    

    public SqlRuleResponseRules withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    


    /**
     * 正则表达式
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlRuleResponseRules sqlRuleResponseRules = (SqlRuleResponseRules) o;
        return Objects.equals(this.id, sqlRuleResponseRules.id) &&
            Objects.equals(this.name, sqlRuleResponseRules.name) &&
            Objects.equals(this.status, sqlRuleResponseRules.status) &&
            Objects.equals(this.riskLevel, sqlRuleResponseRules.riskLevel) &&
            Objects.equals(this.type, sqlRuleResponseRules.type) &&
            Objects.equals(this.rank, sqlRuleResponseRules.rank) &&
            Objects.equals(this.feature, sqlRuleResponseRules.feature) &&
            Objects.equals(this.regex, sqlRuleResponseRules.regex);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, riskLevel, type, rank, feature, regex);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlRuleResponseRules {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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

