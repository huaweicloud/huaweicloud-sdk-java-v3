package com.huaweicloud.sdk.iec.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.FirewallPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateFirewallRuleResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * 网络ACL状态。
     */
    public static final class StatusEnum {

        
        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("INACTIVE");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="egress_firewall_policy")
    
    private FirewallPolicy egressFirewallPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ingress_firewall_policy")
    
    private FirewallPolicy ingressFirewallPolicy;

    public UpdateFirewallRuleResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 网络ACL ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UpdateFirewallRuleResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 网络ACL状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public UpdateFirewallRuleResp withEgressFirewallPolicy(FirewallPolicy egressFirewallPolicy) {
        this.egressFirewallPolicy = egressFirewallPolicy;
        return this;
    }

    public UpdateFirewallRuleResp withEgressFirewallPolicy(Consumer<FirewallPolicy> egressFirewallPolicySetter) {
        if(this.egressFirewallPolicy == null ){
            this.egressFirewallPolicy = new FirewallPolicy();
            egressFirewallPolicySetter.accept(this.egressFirewallPolicy);
        }
        
        return this;
    }


    /**
     * Get egressFirewallPolicy
     * @return egressFirewallPolicy
     */
    public FirewallPolicy getEgressFirewallPolicy() {
        return egressFirewallPolicy;
    }

    public void setEgressFirewallPolicy(FirewallPolicy egressFirewallPolicy) {
        this.egressFirewallPolicy = egressFirewallPolicy;
    }

    

    public UpdateFirewallRuleResp withIngressFirewallPolicy(FirewallPolicy ingressFirewallPolicy) {
        this.ingressFirewallPolicy = ingressFirewallPolicy;
        return this;
    }

    public UpdateFirewallRuleResp withIngressFirewallPolicy(Consumer<FirewallPolicy> ingressFirewallPolicySetter) {
        if(this.ingressFirewallPolicy == null ){
            this.ingressFirewallPolicy = new FirewallPolicy();
            ingressFirewallPolicySetter.accept(this.ingressFirewallPolicy);
        }
        
        return this;
    }


    /**
     * Get ingressFirewallPolicy
     * @return ingressFirewallPolicy
     */
    public FirewallPolicy getIngressFirewallPolicy() {
        return ingressFirewallPolicy;
    }

    public void setIngressFirewallPolicy(FirewallPolicy ingressFirewallPolicy) {
        this.ingressFirewallPolicy = ingressFirewallPolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFirewallRuleResp updateFirewallRuleResp = (UpdateFirewallRuleResp) o;
        return Objects.equals(this.id, updateFirewallRuleResp.id) &&
            Objects.equals(this.status, updateFirewallRuleResp.status) &&
            Objects.equals(this.egressFirewallPolicy, updateFirewallRuleResp.egressFirewallPolicy) &&
            Objects.equals(this.ingressFirewallPolicy, updateFirewallRuleResp.ingressFirewallPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, status, egressFirewallPolicy, ingressFirewallPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallRuleResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    egressFirewallPolicy: ").append(toIndentedString(egressFirewallPolicy)).append("\n");
        sb.append("    ingressFirewallPolicy: ").append(toIndentedString(ingressFirewallPolicy)).append("\n");
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

