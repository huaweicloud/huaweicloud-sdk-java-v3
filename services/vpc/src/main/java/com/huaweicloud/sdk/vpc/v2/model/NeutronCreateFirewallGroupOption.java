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
public class NeutronCreateFirewallGroupOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ingress_firewall_policy_id")
    
    private String ingressFirewallPolicyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="egress_firewall_policy_id")
    
    private String egressFirewallPolicyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ports")
    
    private List<String> ports = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;

    public NeutronCreateFirewallGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：网络ACL组名称 取值范围：0-255个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NeutronCreateFirewallGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能说明：网络ACL防火墙组描述 取值范围：最长255个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NeutronCreateFirewallGroupOption withIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
        return this;
    }

    


    /**
     * 功能说明：入方向网络ACL策略
     * @return ingressFirewallPolicyId
     */
    public String getIngressFirewallPolicyId() {
        return ingressFirewallPolicyId;
    }

    public void setIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
    }

    

    public NeutronCreateFirewallGroupOption withEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
        return this;
    }

    


    /**
     * 功能说明：出方向网络ACL策略
     * @return egressFirewallPolicyId
     */
    public String getEgressFirewallPolicyId() {
        return egressFirewallPolicyId;
    }

    public void setEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
    }

    

    public NeutronCreateFirewallGroupOption withPorts(List<String> ports) {
        this.ports = ports;
        return this;
    }

    
    public NeutronCreateFirewallGroupOption addPortsItem(String portsItem) {
        if(this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public NeutronCreateFirewallGroupOption withPorts(Consumer<List<String>> portsSetter) {
        if(this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 功能说明：网络ACL防火墙组绑定的端口列表 约束：必须为分布式router的端口id
     * @return ports
     */
    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    

    public NeutronCreateFirewallGroupOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 功能说明：网络ACL是否受管理员控制
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFirewallGroupOption neutronCreateFirewallGroupOption = (NeutronCreateFirewallGroupOption) o;
        return Objects.equals(this.name, neutronCreateFirewallGroupOption.name) &&
            Objects.equals(this.description, neutronCreateFirewallGroupOption.description) &&
            Objects.equals(this.ingressFirewallPolicyId, neutronCreateFirewallGroupOption.ingressFirewallPolicyId) &&
            Objects.equals(this.egressFirewallPolicyId, neutronCreateFirewallGroupOption.egressFirewallPolicyId) &&
            Objects.equals(this.ports, neutronCreateFirewallGroupOption.ports) &&
            Objects.equals(this.adminStateUp, neutronCreateFirewallGroupOption.adminStateUp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, ingressFirewallPolicyId, egressFirewallPolicyId, ports, adminStateUp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallGroupOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ingressFirewallPolicyId: ").append(toIndentedString(ingressFirewallPolicyId)).append("\n");
        sb.append("    egressFirewallPolicyId: ").append(toIndentedString(egressFirewallPolicyId)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
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

