package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class NeutronUpdateFirewallPolicyOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_rules")
    
    private List<String> firewallRules = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audited")
    
    private Boolean audited;

    public NeutronUpdateFirewallPolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：网络ACL防火墙策略名称 取值范围：最长255个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NeutronUpdateFirewallPolicyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能说明：网络ACL防火墙策略描述 取值范围：最长255个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NeutronUpdateFirewallPolicyOption withFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    
    public NeutronUpdateFirewallPolicyOption addFirewallRulesItem(String firewallRulesItem) {
        this.firewallRules.add(firewallRulesItem);
        return this;
    }

    public NeutronUpdateFirewallPolicyOption withFirewallRules(Consumer<List<String>> firewallRulesSetter) {
        if(this.firewallRules == null ){
            this.firewallRules = new ArrayList<>();
        }
        firewallRulesSetter.accept(this.firewallRules);
        return this;
    }

    /**
     * 功能说明：网络ACL策略关联的规则列表
     * @return firewallRules
     */
    public List<String> getFirewallRules() {
        return firewallRules;
    }

    public void setFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
    }

    

    public NeutronUpdateFirewallPolicyOption withAudited(Boolean audited) {
        this.audited = audited;
        return this;
    }

    


    /**
     * 审计标记。
     * @return audited
     */
    public Boolean getAudited() {
        return audited;
    }

    public void setAudited(Boolean audited) {
        this.audited = audited;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFirewallPolicyOption neutronUpdateFirewallPolicyOption = (NeutronUpdateFirewallPolicyOption) o;
        return Objects.equals(this.name, neutronUpdateFirewallPolicyOption.name) &&
            Objects.equals(this.description, neutronUpdateFirewallPolicyOption.description) &&
            Objects.equals(this.firewallRules, neutronUpdateFirewallPolicyOption.firewallRules) &&
            Objects.equals(this.audited, neutronUpdateFirewallPolicyOption.audited);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, firewallRules, audited);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallPolicyOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    firewallRules: ").append(toIndentedString(firewallRules)).append("\n");
        sb.append("    audited: ").append(toIndentedString(audited)).append("\n");
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

