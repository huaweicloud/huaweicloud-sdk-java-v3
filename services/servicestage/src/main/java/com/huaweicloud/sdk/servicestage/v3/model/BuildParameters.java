package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BuildParameters
 */
public class BuildParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_namespace")

    private String artifactNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_cmd")

    private String buildCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerfile_path")

    private String dockerfilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_label_selector")

    private Map<String, String> nodeLabelSelector = null;

    public BuildParameters withArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
        return this;
    }

    /**
     * Get artifactNamespace
     * @return artifactNamespace
     */
    public String getArtifactNamespace() {
        return artifactNamespace;
    }

    public void setArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
    }

    public BuildParameters withBuildCmd(String buildCmd) {
        this.buildCmd = buildCmd;
        return this;
    }

    /**
     * Get buildCmd
     * @return buildCmd
     */
    public String getBuildCmd() {
        return buildCmd;
    }

    public void setBuildCmd(String buildCmd) {
        this.buildCmd = buildCmd;
    }

    public BuildParameters withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public BuildParameters withDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
        return this;
    }

    /**
     * Get dockerfilePath
     * @return dockerfilePath
     */
    public String getDockerfilePath() {
        return dockerfilePath;
    }

    public void setDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
    }

    public BuildParameters withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * 构建环境，选择其中的k8s集群进行构建
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public BuildParameters withNodeLabelSelector(Map<String, String> nodeLabelSelector) {
        this.nodeLabelSelector = nodeLabelSelector;
        return this;
    }

    public BuildParameters putNodeLabelSelectorItem(String key, String nodeLabelSelectorItem) {
        if (this.nodeLabelSelector == null) {
            this.nodeLabelSelector = new HashMap<>();
        }
        this.nodeLabelSelector.put(key, nodeLabelSelectorItem);
        return this;
    }

    public BuildParameters withNodeLabelSelector(Consumer<Map<String, String>> nodeLabelSelectorSetter) {
        if (this.nodeLabelSelector == null) {
            this.nodeLabelSelector = new HashMap<>();
        }
        nodeLabelSelectorSetter.accept(this.nodeLabelSelector);
        return this;
    }

    /**
     * Get nodeLabelSelector
     * @return nodeLabelSelector
     */
    public Map<String, String> getNodeLabelSelector() {
        return nodeLabelSelector;
    }

    public void setNodeLabelSelector(Map<String, String> nodeLabelSelector) {
        this.nodeLabelSelector = nodeLabelSelector;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildParameters that = (BuildParameters) obj;
        return Objects.equals(this.artifactNamespace, that.artifactNamespace)
            && Objects.equals(this.buildCmd, that.buildCmd) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.dockerfilePath, that.dockerfilePath)
            && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.nodeLabelSelector, that.nodeLabelSelector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactNamespace, buildCmd, clusterId, dockerfilePath, environmentId, nodeLabelSelector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildParameters {\n");
        sb.append("    artifactNamespace: ").append(toIndentedString(artifactNamespace)).append("\n");
        sb.append("    buildCmd: ").append(toIndentedString(buildCmd)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    dockerfilePath: ").append(toIndentedString(dockerfilePath)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    nodeLabelSelector: ").append(toIndentedString(nodeLabelSelector)).append("\n");
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
