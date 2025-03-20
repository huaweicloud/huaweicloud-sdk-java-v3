package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作。
 */
public class Operation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_action")

    private String operationAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependent_actions")

    private List<String> dependentActions = null;

    public Operation withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * OpenAPI的操作标识符。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public Operation withOperationAction(String operationAction) {
        this.operationAction = operationAction;
        return this;
    }

    /**
     * 三段式的授权项名称，例如\"iam:policies:createV5\"。
     * @return operationAction
     */
    public String getOperationAction() {
        return operationAction;
    }

    public void setOperationAction(String operationAction) {
        this.operationAction = operationAction;
    }

    public Operation withDependentActions(List<String> dependentActions) {
        this.dependentActions = dependentActions;
        return this;
    }

    public Operation addDependentActionsItem(String dependentActionsItem) {
        if (this.dependentActions == null) {
            this.dependentActions = new ArrayList<>();
        }
        this.dependentActions.add(dependentActionsItem);
        return this;
    }

    public Operation withDependentActions(Consumer<List<String>> dependentActionsSetter) {
        if (this.dependentActions == null) {
            this.dependentActions = new ArrayList<>();
        }
        dependentActionsSetter.accept(this.dependentActions);
        return this;
    }

    /**
     * 该操作可能需要的其他授权项授权。
     * @return dependentActions
     */
    public List<String> getDependentActions() {
        return dependentActions;
    }

    public void setDependentActions(List<String> dependentActions) {
        this.dependentActions = dependentActions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operation that = (Operation) obj;
        return Objects.equals(this.operationId, that.operationId)
            && Objects.equals(this.operationAction, that.operationAction)
            && Objects.equals(this.dependentActions, that.dependentActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId, operationAction, dependentActions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Operation {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    operationAction: ").append(toIndentedString(operationAction)).append("\n");
        sb.append("    dependentActions: ").append(toIndentedString(dependentActions)).append("\n");
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
