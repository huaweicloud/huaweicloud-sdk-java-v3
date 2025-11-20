package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提权访问分析路径的某个步骤。
 */
public class PrivilegeEscalationStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private FindingPrincipal principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<String> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public PrivilegeEscalationStep withPrincipal(FindingPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public PrivilegeEscalationStep withPrincipal(Consumer<FindingPrincipal> principalSetter) {
        if (this.principal == null) {
            this.principal = new FindingPrincipal();
            principalSetter.accept(this.principal);
        }

        return this;
    }

    /**
     * Get principal
     * @return principal
     */
    public FindingPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(FindingPrincipal principal) {
        this.principal = principal;
    }

    public PrivilegeEscalationStep withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public PrivilegeEscalationStep addResourcesItem(String resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PrivilegeEscalationStep withResources(Consumer<List<String>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 本步骤涉及到的资源。
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public PrivilegeEscalationStep withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 本步骤涉及到的操作。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivilegeEscalationStep that = (PrivilegeEscalationStep) obj;
        return Objects.equals(this.principal, that.principal) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, resources, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegeEscalationStep {\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
