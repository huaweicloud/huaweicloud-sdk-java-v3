package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * policy
 */
public class PolicyStatement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Effect")

    private String effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Resource")

    private List<String> resource = null;

    public PolicyStatement withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 允许或拒绝，控制访问权限
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public PolicyStatement withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * obs访问权限
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public PolicyStatement withResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    public PolicyStatement addResourceItem(String resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public PolicyStatement withResource(Consumer<List<String>> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * obs对象
     * @return resource
     */
    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyStatement policyStatement = (PolicyStatement) o;
        return Objects.equals(this.effect, policyStatement.effect)
            && Objects.equals(this.action, policyStatement.action)
            && Objects.equals(this.resource, policyStatement.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, action, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyStatement {\n");
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
