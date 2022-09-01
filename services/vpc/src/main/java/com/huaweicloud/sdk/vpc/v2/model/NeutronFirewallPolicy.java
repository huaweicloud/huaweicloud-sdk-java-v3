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
public class NeutronFirewallPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audited")

    @JacksonXmlProperty(localName = "audited")

    private Boolean audited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rules")

    @JacksonXmlProperty(localName = "firewall_rules")

    private List<String> firewallRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    @JacksonXmlProperty(localName = "public")

    private Boolean _public;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    @JacksonXmlProperty(localName = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    public NeutronFirewallPolicy withAudited(Boolean audited) {
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

    public NeutronFirewallPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 网络ACL防火墙策略描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeutronFirewallPolicy withFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    public NeutronFirewallPolicy addFirewallRulesItem(String firewallRulesItem) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        this.firewallRules.add(firewallRulesItem);
        return this;
    }

    public NeutronFirewallPolicy withFirewallRules(Consumer<List<String>> firewallRulesSetter) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        firewallRulesSetter.accept(this.firewallRules);
        return this;
    }

    /**
     * 策略引用的网络ACL防火墙规则链。
     * @return firewallRules
     */
    public List<String> getFirewallRules() {
        return firewallRules;
    }

    public void setFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
    }

    public NeutronFirewallPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网络ACL防火墙策略uuid标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeutronFirewallPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网络ACL防火墙策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronFirewallPolicy withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * 是否支持跨租户共享。
     * @return _public
     */
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public NeutronFirewallPolicy withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronFirewallPolicy withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronFirewallPolicy neutronFirewallPolicy = (NeutronFirewallPolicy) o;
        return Objects.equals(this.audited, neutronFirewallPolicy.audited)
            && Objects.equals(this.description, neutronFirewallPolicy.description)
            && Objects.equals(this.firewallRules, neutronFirewallPolicy.firewallRules)
            && Objects.equals(this.id, neutronFirewallPolicy.id)
            && Objects.equals(this.name, neutronFirewallPolicy.name)
            && Objects.equals(this._public, neutronFirewallPolicy._public)
            && Objects.equals(this.tenantId, neutronFirewallPolicy.tenantId)
            && Objects.equals(this.projectId, neutronFirewallPolicy.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audited, description, firewallRules, id, name, _public, tenantId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronFirewallPolicy {\n");
        sb.append("    audited: ").append(toIndentedString(audited)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    firewallRules: ").append(toIndentedString(firewallRules)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
