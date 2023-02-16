package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RuleRiskResponseRules
 */
public class RuleRiskResponseRules  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="feature")
    
    
    private String feature;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rank")
    
    
    private Integer rank;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_level")
    
    
    private String riskLevel;

    public RuleRiskResponseRules withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 风险规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public RuleRiskResponseRules withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 风险规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public RuleRiskResponseRules withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 风险类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public RuleRiskResponseRules withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    


    /**
     * 风险特征
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    

    public RuleRiskResponseRules withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 风险规则状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public RuleRiskResponseRules withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    


    /**
     * 风险规则优先级
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    

    public RuleRiskResponseRules withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    


    /**
     * 风险级别
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleRiskResponseRules ruleRiskResponseRules = (RuleRiskResponseRules) o;
        return Objects.equals(this.id, ruleRiskResponseRules.id) &&
            Objects.equals(this.name, ruleRiskResponseRules.name) &&
            Objects.equals(this.type, ruleRiskResponseRules.type) &&
            Objects.equals(this.feature, ruleRiskResponseRules.feature) &&
            Objects.equals(this.status, ruleRiskResponseRules.status) &&
            Objects.equals(this.rank, ruleRiskResponseRules.rank) &&
            Objects.equals(this.riskLevel, ruleRiskResponseRules.riskLevel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, feature, status, rank, riskLevel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleRiskResponseRules {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
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

