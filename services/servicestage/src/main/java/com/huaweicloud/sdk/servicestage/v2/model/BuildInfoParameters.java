package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建任务的环境变量。
 */
public class BuildInfoParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_cmd")

    private String buildCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerfile_path")

    private String dockerfilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_namespace")

    private String artifactNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_label_selector")

    private Object nodeLabelSelector;

    public BuildInfoParameters withBuildCmd(String buildCmd) {
        this.buildCmd = buildCmd;
        return this;
    }

    /**
     * 编译命令。默认：  1、根目录存在build.sh：./build.sh  2、根据运行系统，示例如下：  Java和Tomcat：mvn clean package  Nodejs: npm build 
     * @return buildCmd
     */
    public String getBuildCmd() {
        return buildCmd;
    }

    public void setBuildCmd(String buildCmd) {
        this.buildCmd = buildCmd;
    }

    public BuildInfoParameters withDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
        return this;
    }

    /**
     * dockerfile地址。默认是根目录./。
     * @return dockerfilePath
     */
    public String getDockerfilePath() {
        return dockerfilePath;
    }

    public void setDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
    }

    public BuildInfoParameters withArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
        return this;
    }

    /**
     * 构建归档组织，默认cas_{project_id}。
     * @return artifactNamespace
     */
    public String getArtifactNamespace() {
        return artifactNamespace;
    }

    public void setArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
    }

    public BuildInfoParameters withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定构建集群的id。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public BuildInfoParameters withNodeLabelSelector(Object nodeLabelSelector) {
        this.nodeLabelSelector = nodeLabelSelector;
        return this;
    }

    /**
     * key是标签的键，value是标签的值。
     * @return nodeLabelSelector
     */
    public Object getNodeLabelSelector() {
        return nodeLabelSelector;
    }

    public void setNodeLabelSelector(Object nodeLabelSelector) {
        this.nodeLabelSelector = nodeLabelSelector;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuildInfoParameters buildInfoParameters = (BuildInfoParameters) o;
        return Objects.equals(this.buildCmd, buildInfoParameters.buildCmd)
            && Objects.equals(this.dockerfilePath, buildInfoParameters.dockerfilePath)
            && Objects.equals(this.artifactNamespace, buildInfoParameters.artifactNamespace)
            && Objects.equals(this.clusterId, buildInfoParameters.clusterId)
            && Objects.equals(this.nodeLabelSelector, buildInfoParameters.nodeLabelSelector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildCmd, dockerfilePath, artifactNamespace, clusterId, nodeLabelSelector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildInfoParameters {\n");
        sb.append("    buildCmd: ").append(toIndentedString(buildCmd)).append("\n");
        sb.append("    dockerfilePath: ").append(toIndentedString(dockerfilePath)).append("\n");
        sb.append("    artifactNamespace: ").append(toIndentedString(artifactNamespace)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
