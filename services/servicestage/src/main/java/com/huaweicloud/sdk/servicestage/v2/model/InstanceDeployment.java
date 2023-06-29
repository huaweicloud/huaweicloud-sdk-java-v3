package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 部署实例请求体
 */
public class InstanceDeployment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private InstanceDeploymentVariables variables;

    public InstanceDeployment withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceDeployment withVariables(InstanceDeploymentVariables variables) {
        this.variables = variables;
        return this;
    }

    public InstanceDeployment withVariables(Consumer<InstanceDeploymentVariables> variablesSetter) {
        if (this.variables == null) {
            this.variables = new InstanceDeploymentVariables();
            variablesSetter.accept(this.variables);
        }

        return this;
    }

    /**
     * Get variables
     * @return variables
     */
    public InstanceDeploymentVariables getVariables() {
        return variables;
    }

    public void setVariables(InstanceDeploymentVariables variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDeployment that = (InstanceDeployment) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.variables, that.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDeployment {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
