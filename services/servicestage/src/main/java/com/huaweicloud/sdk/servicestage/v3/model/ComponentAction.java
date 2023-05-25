package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentAction
 */
public class ComponentAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ComponentActionType action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private ComponentActionParameters parameters;

    public ComponentAction withAction(ComponentActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    public ComponentActionType getAction() {
        return action;
    }

    public void setAction(ComponentActionType action) {
        this.action = action;
    }

    public ComponentAction withParameters(ComponentActionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public ComponentAction withParameters(Consumer<ComponentActionParameters> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ComponentActionParameters();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public ComponentActionParameters getParameters() {
        return parameters;
    }

    public void setParameters(ComponentActionParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentAction componentAction = (ComponentAction) o;
        return Objects.equals(this.action, componentAction.action)
            && Objects.equals(this.parameters, componentAction.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentAction {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
