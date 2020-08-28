package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.RuleRef;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * lb状态树的策略状态信息
 */
public class LoadBalancerPolicyStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus = "ACTIVE";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<RuleRef> rules = null;
    
    public LoadBalancerPolicyStatus withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 匹配动作。 支持REDIRECT_TO_POOL和REDIRECT_TO_LISTENER。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LoadBalancerPolicyStatus withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerPolicyStatus withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * provisioning的状态。 可以为：ACTIVE、PENDING_CREATE 或者ERROR。默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancerPolicyStatus withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancerPolicyStatus withRules(List<RuleRef> rules) {
        this.rules = rules;
        return this;
    }

    
    public LoadBalancerPolicyStatus addRulesItem(RuleRef rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public LoadBalancerPolicyStatus withRules(Consumer<List<RuleRef>> rulesSetter) {
        if(this.rules == null ){
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 规则。
     * @return rules
     */
    public List<RuleRef> getRules() {
        return rules;
    }

    public void setRules(List<RuleRef> rules) {
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
        LoadBalancerPolicyStatus loadBalancerPolicyStatus = (LoadBalancerPolicyStatus) o;
        return Objects.equals(this.action, loadBalancerPolicyStatus.action) &&
            Objects.equals(this.id, loadBalancerPolicyStatus.id) &&
            Objects.equals(this.provisioningStatus, loadBalancerPolicyStatus.provisioningStatus) &&
            Objects.equals(this.name, loadBalancerPolicyStatus.name) &&
            Objects.equals(this.rules, loadBalancerPolicyStatus.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, id, provisioningStatus, name, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerPolicyStatus {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

