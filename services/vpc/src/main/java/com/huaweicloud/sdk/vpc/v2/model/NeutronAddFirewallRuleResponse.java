package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronAddFirewallRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rules")

    private List<String> firewallRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audited")

    private Boolean audited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private Boolean _public;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public NeutronAddFirewallRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：网络ACL策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeutronAddFirewallRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：网络ACL策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronAddFirewallRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：网络ACL策略的描述信息 取值范围：0-255个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeutronAddFirewallRuleResponse withFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    public NeutronAddFirewallRuleResponse addFirewallRulesItem(String firewallRulesItem) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        this.firewallRules.add(firewallRulesItem);
        return this;
    }

    public NeutronAddFirewallRuleResponse withFirewallRules(Consumer<List<String>> firewallRulesSetter) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        firewallRulesSetter.accept(this.firewallRules);
        return this;
    }

    /**
     * 功能说明：网络ACL策略关联的规则的ID列表
     * @return firewallRules
     */
    public List<String> getFirewallRules() {
        return firewallRules;
    }

    public void setFirewallRules(List<String> firewallRules) {
        this.firewallRules = firewallRules;
    }

    public NeutronAddFirewallRuleResponse withAudited(Boolean audited) {
        this.audited = audited;
        return this;
    }

    /**
     * 功能说明：每次policy或者它相关的rule有变动，该参数将会被置为False
     * @return audited
     */
    public Boolean getAudited() {
        return audited;
    }

    public void setAudited(Boolean audited) {
        this.audited = audited;
    }

    public NeutronAddFirewallRuleResponse withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * 功能说明：网络ACL策略是否对其他网络ACL策略可见 取值范围：true(可见)、false(不可见)
     * @return _public
     */
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public NeutronAddFirewallRuleResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 功能说明：网络ACL策略所属项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronAddFirewallRuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：网络ACL策略所属项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronAddFirewallRuleResponse that = (NeutronAddFirewallRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.firewallRules, that.firewallRules) && Objects.equals(this.audited, that.audited)
            && Objects.equals(this._public, that._public) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, firewallRules, audited, _public, tenantId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronAddFirewallRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    firewallRules: ").append(toIndentedString(firewallRules)).append("\n");
        sb.append("    audited: ").append(toIndentedString(audited)).append("\n");
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
