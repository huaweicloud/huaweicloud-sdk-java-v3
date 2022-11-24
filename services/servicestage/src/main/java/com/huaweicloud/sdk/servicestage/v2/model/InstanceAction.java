package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceAction
 */
public class InstanceAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private InstanceActionType action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private InstanceActionParameters parameters;

    public InstanceAction withAction(InstanceActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    public InstanceActionType getAction() {
        return action;
    }

    public void setAction(InstanceActionType action) {
        this.action = action;
    }

    public InstanceAction withParameters(InstanceActionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public InstanceAction withParameters(Consumer<InstanceActionParameters> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new InstanceActionParameters();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public InstanceActionParameters getParameters() {
        return parameters;
    }

    public void setParameters(InstanceActionParameters parameters) {
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
        InstanceAction instanceAction = (InstanceAction) o;
        return Objects.equals(this.action, instanceAction.action)
            && Objects.equals(this.parameters, instanceAction.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceAction {\n");
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
