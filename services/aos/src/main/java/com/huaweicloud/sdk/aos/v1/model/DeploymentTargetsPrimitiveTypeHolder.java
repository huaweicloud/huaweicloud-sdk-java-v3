package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeploymentTargetsPrimitiveTypeHolder
 */
public class DeploymentTargetsPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_targets")

    private DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets;

    public DeploymentTargetsPrimitiveTypeHolder withDeploymentTargets(
        DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }

    public DeploymentTargetsPrimitiveTypeHolder withDeploymentTargets(
        Consumer<DeploymentTargetsPrimitiveTypeHolderDeploymentTargets> deploymentTargetsSetter) {
        if (this.deploymentTargets == null) {
            this.deploymentTargets = new DeploymentTargetsPrimitiveTypeHolderDeploymentTargets();
            deploymentTargetsSetter.accept(this.deploymentTargets);
        }

        return this;
    }

    /**
     * Get deploymentTargets
     * @return deploymentTargets
     */
    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets getDeploymentTargets() {
        return deploymentTargets;
    }

    public void setDeploymentTargets(DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentTargetsPrimitiveTypeHolder that = (DeploymentTargetsPrimitiveTypeHolder) obj;
        return Objects.equals(this.deploymentTargets, that.deploymentTargets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deploymentTargets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentTargetsPrimitiveTypeHolder {\n");
        sb.append("    deploymentTargets: ").append(toIndentedString(deploymentTargets)).append("\n");
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
