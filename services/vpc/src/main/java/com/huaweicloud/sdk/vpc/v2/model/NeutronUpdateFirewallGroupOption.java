package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronUpdateFirewallGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_firewall_policy_id")

    @JacksonXmlProperty(localName = "egress_firewall_policy_id")

    private String egressFirewallPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_firewall_policy_id")

    @JacksonXmlProperty(localName = "ingress_firewall_policy_id")

    private String ingressFirewallPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    @JacksonXmlProperty(localName = "ports")

    private List<String> ports = null;

    public NeutronUpdateFirewallGroupOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 网络ACL防火墙是否受管理员控制。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public NeutronUpdateFirewallGroupOption withDescription(String description) {
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

    public NeutronUpdateFirewallGroupOption withEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
        return this;
    }

    /**
     * 出方向网络ACL防火墙策略。
     * @return egressFirewallPolicyId
     */
    public String getEgressFirewallPolicyId() {
        return egressFirewallPolicyId;
    }

    public void setEgressFirewallPolicyId(String egressFirewallPolicyId) {
        this.egressFirewallPolicyId = egressFirewallPolicyId;
    }

    public NeutronUpdateFirewallGroupOption withIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
        return this;
    }

    /**
     * 入方向网络ACL防火墙策略。
     * @return ingressFirewallPolicyId
     */
    public String getIngressFirewallPolicyId() {
        return ingressFirewallPolicyId;
    }

    public void setIngressFirewallPolicyId(String ingressFirewallPolicyId) {
        this.ingressFirewallPolicyId = ingressFirewallPolicyId;
    }

    public NeutronUpdateFirewallGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：网络ACL防火墙组名称 取值范围：最长255个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronUpdateFirewallGroupOption withPorts(List<String> ports) {
        this.ports = ports;
        return this;
    }

    public NeutronUpdateFirewallGroupOption addPortsItem(String portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public NeutronUpdateFirewallGroupOption withPorts(Consumer<List<String>> portsSetter) {
        if (this.ports == null) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFirewallGroupOption neutronUpdateFirewallGroupOption = (NeutronUpdateFirewallGroupOption) o;
        return Objects.equals(this.adminStateUp, neutronUpdateFirewallGroupOption.adminStateUp)
            && Objects.equals(this.description, neutronUpdateFirewallGroupOption.description)
            && Objects.equals(this.egressFirewallPolicyId, neutronUpdateFirewallGroupOption.egressFirewallPolicyId)
            && Objects.equals(this.ingressFirewallPolicyId, neutronUpdateFirewallGroupOption.ingressFirewallPolicyId)
            && Objects.equals(this.name, neutronUpdateFirewallGroupOption.name)
            && Objects.equals(this.ports, neutronUpdateFirewallGroupOption.ports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, description, egressFirewallPolicyId, ingressFirewallPolicyId, name, ports);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallGroupOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    egressFirewallPolicyId: ").append(toIndentedString(egressFirewallPolicyId)).append("\n");
        sb.append("    ingressFirewallPolicyId: ").append(toIndentedString(ingressFirewallPolicyId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
