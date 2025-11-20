package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提权访问分析详细结果。
 */
public class PrivilegeEscalationDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private FindingPrincipal principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_action")

    private String activeAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private List<PrivilegeEscalationStep> path = null;

    public PrivilegeEscalationDetails withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public PrivilegeEscalationDetails addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public PrivilegeEscalationDetails withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 指定的待分析操作集合。
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public PrivilegeEscalationDetails withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 资源的唯一资源标识符。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public PrivilegeEscalationDetails withPrincipal(FindingPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public PrivilegeEscalationDetails withPrincipal(Consumer<FindingPrincipal> principalSetter) {
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

    public PrivilegeEscalationDetails withActiveAction(String activeAction) {
        this.activeAction = activeAction;
        return this;
    }

    /**
     * 能够通过提权访问路径触发的操作代表。
     * @return activeAction
     */
    public String getActiveAction() {
        return activeAction;
    }

    public void setActiveAction(String activeAction) {
        this.activeAction = activeAction;
    }

    public PrivilegeEscalationDetails withPath(List<PrivilegeEscalationStep> path) {
        this.path = path;
        return this;
    }

    public PrivilegeEscalationDetails addPathItem(PrivilegeEscalationStep pathItem) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        this.path.add(pathItem);
        return this;
    }

    public PrivilegeEscalationDetails withPath(Consumer<List<PrivilegeEscalationStep>> pathSetter) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        pathSetter.accept(this.path);
        return this;
    }

    /**
     * Get path
     * @return path
     */
    public List<PrivilegeEscalationStep> getPath() {
        return path;
    }

    public void setPath(List<PrivilegeEscalationStep> path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivilegeEscalationDetails that = (PrivilegeEscalationDetails) obj;
        return Objects.equals(this.actions, that.actions) && Objects.equals(this.resource, that.resource)
            && Objects.equals(this.principal, that.principal) && Objects.equals(this.activeAction, that.activeAction)
            && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, resource, principal, activeAction, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegeEscalationDetails {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    activeAction: ").append(toIndentedString(activeAction)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
