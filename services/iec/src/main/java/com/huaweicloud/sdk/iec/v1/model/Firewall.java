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
 * 防火墙对象
 */
public class Firewall  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;
    /**
     * 网络ACL状态。  取值范围：INACTIVE
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
            return String.valueOf(value);
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
            if (obj != null && obj instanceof StatusEnum) {
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
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="egress_firewall_policy")
    
    private FirewallPolicy egressFirewallPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="egress_firewall_rule_count")
    
    private Integer egressFirewallRuleCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ingress_firewall_policy")
    
    private FirewallPolicy ingressFirewallPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ingress_firewall_rule_count")
    
    private Integer ingressFirewallRuleCount;

    public Firewall withId(String id) {
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

    

    public Firewall withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 网络ACL名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Firewall withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 网络ACL使能开关。  取值范围：true（开启），false（关闭）。默认为true
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public Firewall withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 网络ACL状态。  取值范围：INACTIVE
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public Firewall withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 网络ACL描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Firewall withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 租户domainID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public Firewall withEgressFirewallPolicy(FirewallPolicy egressFirewallPolicy) {
        this.egressFirewallPolicy = egressFirewallPolicy;
        return this;
    }

    public Firewall withEgressFirewallPolicy(Consumer<FirewallPolicy> egressFirewallPolicySetter) {
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

    

    public Firewall withEgressFirewallRuleCount(Integer egressFirewallRuleCount) {
        this.egressFirewallRuleCount = egressFirewallRuleCount;
        return this;
    }

    


    /**
     * 出方向网络ACL规则个数。
     * @return egressFirewallRuleCount
     */
    public Integer getEgressFirewallRuleCount() {
        return egressFirewallRuleCount;
    }

    public void setEgressFirewallRuleCount(Integer egressFirewallRuleCount) {
        this.egressFirewallRuleCount = egressFirewallRuleCount;
    }

    

    public Firewall withIngressFirewallPolicy(FirewallPolicy ingressFirewallPolicy) {
        this.ingressFirewallPolicy = ingressFirewallPolicy;
        return this;
    }

    public Firewall withIngressFirewallPolicy(Consumer<FirewallPolicy> ingressFirewallPolicySetter) {
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

    

    public Firewall withIngressFirewallRuleCount(Integer ingressFirewallRuleCount) {
        this.ingressFirewallRuleCount = ingressFirewallRuleCount;
        return this;
    }

    


    /**
     * 入方向网络ACL规则个数。
     * @return ingressFirewallRuleCount
     */
    public Integer getIngressFirewallRuleCount() {
        return ingressFirewallRuleCount;
    }

    public void setIngressFirewallRuleCount(Integer ingressFirewallRuleCount) {
        this.ingressFirewallRuleCount = ingressFirewallRuleCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Firewall firewall = (Firewall) o;
        return Objects.equals(this.id, firewall.id) &&
            Objects.equals(this.name, firewall.name) &&
            Objects.equals(this.adminStateUp, firewall.adminStateUp) &&
            Objects.equals(this.status, firewall.status) &&
            Objects.equals(this.description, firewall.description) &&
            Objects.equals(this.domainId, firewall.domainId) &&
            Objects.equals(this.egressFirewallPolicy, firewall.egressFirewallPolicy) &&
            Objects.equals(this.egressFirewallRuleCount, firewall.egressFirewallRuleCount) &&
            Objects.equals(this.ingressFirewallPolicy, firewall.ingressFirewallPolicy) &&
            Objects.equals(this.ingressFirewallRuleCount, firewall.ingressFirewallRuleCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, adminStateUp, status, description, domainId, egressFirewallPolicy, egressFirewallRuleCount, ingressFirewallPolicy, ingressFirewallRuleCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Firewall {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    egressFirewallPolicy: ").append(toIndentedString(egressFirewallPolicy)).append("\n");
        sb.append("    egressFirewallRuleCount: ").append(toIndentedString(egressFirewallRuleCount)).append("\n");
        sb.append("    ingressFirewallPolicy: ").append(toIndentedString(ingressFirewallPolicy)).append("\n");
        sb.append("    ingressFirewallRuleCount: ").append(toIndentedString(ingressFirewallRuleCount)).append("\n");
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

