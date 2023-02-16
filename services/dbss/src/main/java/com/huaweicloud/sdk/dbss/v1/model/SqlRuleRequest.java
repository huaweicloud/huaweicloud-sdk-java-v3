package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SqlRuleRequest
 */
public class SqlRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_levels")
    
    
    private String riskLevels;

    public SqlRuleRequest withRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }

    


    /**
     * 风险级别:(多项查询使用逗号分隔)  HIGH  MEDIUM  LOW  NO_RISK
     * @return riskLevels
     */
    public String getRiskLevels() {
        return riskLevels;
    }

    public void setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlRuleRequest sqlRuleRequest = (SqlRuleRequest) o;
        return Objects.equals(this.riskLevels, sqlRuleRequest.riskLevels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(riskLevels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlRuleRequest {\n");
        sb.append("    riskLevels: ").append(toIndentedString(riskLevels)).append("\n");
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

