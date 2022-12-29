package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeploymentUpdateRequest
 */
public class DeploymentUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment")

    private DeploymentRequest deployment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<DeploymentTag> tags = null;

    public DeploymentUpdateRequest withDeployment(DeploymentRequest deployment) {
        this.deployment = deployment;
        return this;
    }

    public DeploymentUpdateRequest withDeployment(Consumer<DeploymentRequest> deploymentSetter) {
        if (this.deployment == null) {
            this.deployment = new DeploymentRequest();
            deploymentSetter.accept(this.deployment);
        }

        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    public DeploymentRequest getDeployment() {
        return deployment;
    }

    public void setDeployment(DeploymentRequest deployment) {
        this.deployment = deployment;
    }

    public DeploymentUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用部署描述修改，只修改描述不需要传deployment参数。最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeploymentUpdateRequest withTags(List<DeploymentTag> tags) {
        this.tags = tags;
        return this;
    }

    public DeploymentUpdateRequest addTagsItem(DeploymentTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public DeploymentUpdateRequest withTags(Consumer<List<DeploymentTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 部署标签
     * @return tags
     */
    public List<DeploymentTag> getTags() {
        return tags;
    }

    public void setTags(List<DeploymentTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentUpdateRequest deploymentUpdateRequest = (DeploymentUpdateRequest) o;
        return Objects.equals(this.deployment, deploymentUpdateRequest.deployment)
            && Objects.equals(this.description, deploymentUpdateRequest.description)
            && Objects.equals(this.tags, deploymentUpdateRequest.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployment, description, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentUpdateRequest {\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
