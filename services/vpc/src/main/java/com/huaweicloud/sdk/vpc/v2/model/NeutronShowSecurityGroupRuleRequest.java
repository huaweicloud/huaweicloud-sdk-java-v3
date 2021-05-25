package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronShowSecurityGroupRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_rule_id")
    
    private String securityGroupRuleId;

    public NeutronShowSecurityGroupRuleRequest withSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }

    


    /**
     * 安全组规则ID
     * @return securityGroupRuleId
     */
    public String getSecurityGroupRuleId() {
        return securityGroupRuleId;
    }

    public void setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronShowSecurityGroupRuleRequest neutronShowSecurityGroupRuleRequest = (NeutronShowSecurityGroupRuleRequest) o;
        return Objects.equals(this.securityGroupRuleId, neutronShowSecurityGroupRuleRequest.securityGroupRuleId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(securityGroupRuleId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowSecurityGroupRuleRequest {\n");
        sb.append("    securityGroupRuleId: ").append(toIndentedString(securityGroupRuleId)).append("\n");
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

