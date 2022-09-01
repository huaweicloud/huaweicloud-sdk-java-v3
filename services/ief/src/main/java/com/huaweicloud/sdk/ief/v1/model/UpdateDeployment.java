package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新部署请求Body参数
 */
public class UpdateDeployment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment")

    @JacksonXmlProperty(localName = "deployment")

    private UpdatePodDeployment deployment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public UpdateDeployment withDeployment(UpdatePodDeployment deployment) {
        this.deployment = deployment;
        return this;
    }

    public UpdateDeployment withDeployment(Consumer<UpdatePodDeployment> deploymentSetter) {
        if (this.deployment == null) {
            this.deployment = new UpdatePodDeployment();
            deploymentSetter.accept(this.deployment);
        }

        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    public UpdatePodDeployment getDeployment() {
        return deployment;
    }

    public void setDeployment(UpdatePodDeployment deployment) {
        this.deployment = deployment;
    }

    public UpdateDeployment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用部署描述修改，只修改描述不需要传入deployment参数
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDeployment updateDeployment = (UpdateDeployment) o;
        return Objects.equals(this.deployment, updateDeployment.deployment)
            && Objects.equals(this.description, updateDeployment.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployment, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeployment {\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
