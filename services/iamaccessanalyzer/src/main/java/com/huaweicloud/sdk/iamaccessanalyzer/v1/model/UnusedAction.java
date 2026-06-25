package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UnusedAction
 */
public class UnusedAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_accessed")

    private OffsetDateTime lastAccessed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_sources")

    private List<String> roleSources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_policy_sources")

    private List<String> identityPolicySources = null;

    public UnusedAction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 授权项名称。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UnusedAction withLastAccessed(OffsetDateTime lastAccessed) {
        this.lastAccessed = lastAccessed;
        return this;
    }

    /**
     * 用户使用授权项的最后访问时间。
     * @return lastAccessed
     */
    public OffsetDateTime getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(OffsetDateTime lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    public UnusedAction withRoleSources(List<String> roleSources) {
        this.roleSources = roleSources;
        return this;
    }

    public UnusedAction addRoleSourcesItem(String roleSourcesItem) {
        if (this.roleSources == null) {
            this.roleSources = new ArrayList<>();
        }
        this.roleSources.add(roleSourcesItem);
        return this;
    }

    public UnusedAction withRoleSources(Consumer<List<String>> roleSourcesSetter) {
        if (this.roleSources == null) {
            this.roleSources = new ArrayList<>();
        }
        roleSourcesSetter.accept(this.roleSources);
        return this;
    }

    /**
     * 通过该操作访问的角色来源列表。
     * @return roleSources
     */
    public List<String> getRoleSources() {
        return roleSources;
    }

    public void setRoleSources(List<String> roleSources) {
        this.roleSources = roleSources;
    }

    public UnusedAction withIdentityPolicySources(List<String> identityPolicySources) {
        this.identityPolicySources = identityPolicySources;
        return this;
    }

    public UnusedAction addIdentityPolicySourcesItem(String identityPolicySourcesItem) {
        if (this.identityPolicySources == null) {
            this.identityPolicySources = new ArrayList<>();
        }
        this.identityPolicySources.add(identityPolicySourcesItem);
        return this;
    }

    public UnusedAction withIdentityPolicySources(Consumer<List<String>> identityPolicySourcesSetter) {
        if (this.identityPolicySources == null) {
            this.identityPolicySources = new ArrayList<>();
        }
        identityPolicySourcesSetter.accept(this.identityPolicySources);
        return this;
    }

    /**
     * 通过该操作访问的身份策略来源列表。
     * @return identityPolicySources
     */
    public List<String> getIdentityPolicySources() {
        return identityPolicySources;
    }

    public void setIdentityPolicySources(List<String> identityPolicySources) {
        this.identityPolicySources = identityPolicySources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnusedAction that = (UnusedAction) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.lastAccessed, that.lastAccessed)
            && Objects.equals(this.roleSources, that.roleSources)
            && Objects.equals(this.identityPolicySources, that.identityPolicySources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, lastAccessed, roleSources, identityPolicySources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnusedAction {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
        sb.append("    roleSources: ").append(toIndentedString(roleSources)).append("\n");
        sb.append("    identityPolicySources: ").append(toIndentedString(identityPolicySources)).append("\n");
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
