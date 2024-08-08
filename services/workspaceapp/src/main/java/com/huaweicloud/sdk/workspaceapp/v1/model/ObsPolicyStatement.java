package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OBS桶存放的策略内容。
 */
public class ObsPolicyStatement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private PolicyEffectEnum effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private List<String> action = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private List<String> resource = null;

    public ObsPolicyStatement withEffect(PolicyEffectEnum effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Get effect
     * @return effect
     */
    public PolicyEffectEnum getEffect() {
        return effect;
    }

    public void setEffect(PolicyEffectEnum effect) {
        this.effect = effect;
    }

    public ObsPolicyStatement withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public ObsPolicyStatement addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public ObsPolicyStatement withAction(Consumer<List<String>> actionSetter) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * 可以进行操作的权限合集。
     * @return action
     */
    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public ObsPolicyStatement withResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    public ObsPolicyStatement addResourceItem(String resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public ObsPolicyStatement withResource(Consumer<List<String>> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * 允许访问的资源。
     * @return resource
     */
    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsPolicyStatement that = (ObsPolicyStatement) obj;
        return Objects.equals(this.effect, that.effect) && Objects.equals(this.action, that.action)
            && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, action, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsPolicyStatement {\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
