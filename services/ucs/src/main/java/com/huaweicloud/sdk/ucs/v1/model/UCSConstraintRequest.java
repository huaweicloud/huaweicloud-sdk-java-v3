package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UCSConstraintRequest
 */
public class UCSConstraintRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraintTemplateID")

    private String constraintTemplateID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enforcementAction")

    private String enforcementAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<String> namespaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Object parameters;

    public UCSConstraintRequest withConstraintTemplateID(String constraintTemplateID) {
        this.constraintTemplateID = constraintTemplateID;
        return this;
    }

    /**
     * 策略模板的ID
     * @return constraintTemplateID
     */
    public String getConstraintTemplateID() {
        return constraintTemplateID;
    }

    public void setConstraintTemplateID(String constraintTemplateID) {
        this.constraintTemplateID = constraintTemplateID;
    }

    public UCSConstraintRequest withEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
        return this;
    }

    /**
     * 策略执行方式，当前支持warn和deny
     * @return enforcementAction
     */
    public String getEnforcementAction() {
        return enforcementAction;
    }

    public void setEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
    }

    public UCSConstraintRequest withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public UCSConstraintRequest addNamespacesItem(String namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public UCSConstraintRequest withNamespaces(Consumer<List<String>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 生效的命名空间
     * @return namespaces
     */
    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public UCSConstraintRequest withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 策略实例的参数
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UCSConstraintRequest that = (UCSConstraintRequest) obj;
        return Objects.equals(this.constraintTemplateID, that.constraintTemplateID)
            && Objects.equals(this.enforcementAction, that.enforcementAction)
            && Objects.equals(this.namespaces, that.namespaces) && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constraintTemplateID, enforcementAction, namespaces, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UCSConstraintRequest {\n");
        sb.append("    constraintTemplateID: ").append(toIndentedString(constraintTemplateID)).append("\n");
        sb.append("    enforcementAction: ").append(toIndentedString(enforcementAction)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
