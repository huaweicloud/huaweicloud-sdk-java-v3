package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：自定义配置。 **约束限制**：不涉及。
 */
public class ResourceExtendParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    private String dockerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postInstall")

    private String postInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelPolicyOnExistingNodes")

    private String labelPolicyOnExistingNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taintPolicyOnExistingNodes")

    private String taintPolicyOnExistingNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tagPolicyOnExistingNodes")

    private String tagPolicyOnExistingNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "XParameterPlaneSubnet")

    private String xparameterPlaneSubnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodePoolName")

    private String nodePoolName;

    public ResourceExtendParams withDockerBaseSize(String dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    /**
     * **参数解释**：节点的容器镜像空间大小。 **取值范围**：可选值如下： - 指定大小：dockerBaseSize的大小范围默认为50-500，但实际上限受到节点的容器数据盘大小约束。 - 不限制：dockerBaseSize=\\\"0\\\"，表示不限制容器镜像空间大小。
     * @return dockerBaseSize
     */
    public String getDockerBaseSize() {
        return dockerBaseSize;
    }

    public void setDockerBaseSize(String dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
    }

    public ResourceExtendParams withPostInstall(String postInstall) {
        this.postInstall = postInstall;
        return this;
    }

    /**
     * **参数解释**：安装后执行脚本，输入的值需要经过Base64编码。 **取值范围**：不涉及。
     * @return postInstall
     */
    public String getPostInstall() {
        return postInstall;
    }

    public void setPostInstall(String postInstall) {
        this.postInstall = postInstall;
    }

    public ResourceExtendParams withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * **参数解释**：容器运行时。 **取值范围**：可选值如下： - docker：容器运行时，是目前最常用的容器化引擎，基于容器镜像创建和管理容器实例。 - containerd：工业级的容器运行时，专注于容器的生命周期管理，是 Docker 底层核心组件之一，也可独立部署使用。
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ResourceExtendParams withLabelPolicyOnExistingNodes(String labelPolicyOnExistingNodes) {
        this.labelPolicyOnExistingNodes = labelPolicyOnExistingNodes;
        return this;
    }

    /**
     * **参数解释**：存量节点k8s标签更新策略，值为空时默认更新存量节点。 **取值范围**：可选值如下： - refresh：更新。 - ignore：不更新。
     * @return labelPolicyOnExistingNodes
     */
    public String getLabelPolicyOnExistingNodes() {
        return labelPolicyOnExistingNodes;
    }

    public void setLabelPolicyOnExistingNodes(String labelPolicyOnExistingNodes) {
        this.labelPolicyOnExistingNodes = labelPolicyOnExistingNodes;
    }

    public ResourceExtendParams withTaintPolicyOnExistingNodes(String taintPolicyOnExistingNodes) {
        this.taintPolicyOnExistingNodes = taintPolicyOnExistingNodes;
        return this;
    }

    /**
     * **参数解释**：存量节点k8s污点更新策略，值为空时默认更新存量节点。 **取值范围**：可选值如下： - refresh：更新。 - ignore：不更新。
     * @return taintPolicyOnExistingNodes
     */
    public String getTaintPolicyOnExistingNodes() {
        return taintPolicyOnExistingNodes;
    }

    public void setTaintPolicyOnExistingNodes(String taintPolicyOnExistingNodes) {
        this.taintPolicyOnExistingNodes = taintPolicyOnExistingNodes;
    }

    public ResourceExtendParams withTagPolicyOnExistingNodes(String tagPolicyOnExistingNodes) {
        this.tagPolicyOnExistingNodes = tagPolicyOnExistingNodes;
        return this;
    }

    /**
     * **参数解释**：存量节点资源标签更新策略，值为空时默认更新存量节点。 **取值范围**：可选值如下： - refresh：更新。 - ignore：不更新。
     * @return tagPolicyOnExistingNodes
     */
    public String getTagPolicyOnExistingNodes() {
        return tagPolicyOnExistingNodes;
    }

    public void setTagPolicyOnExistingNodes(String tagPolicyOnExistingNodes) {
        this.tagPolicyOnExistingNodes = tagPolicyOnExistingNodes;
    }

    public ResourceExtendParams withXparameterPlaneSubnet(String xparameterPlaneSubnet) {
        this.xparameterPlaneSubnet = xparameterPlaneSubnet;
        return this;
    }

    /**
     * **参数解释**：跨物理集群之间进行参数面数据传输使用的子网id。不可与节点子网和容器子网重复。 **取值范围**：不涉及。
     * @return xparameterPlaneSubnet
     */
    public String getXparameterPlaneSubnet() {
        return xparameterPlaneSubnet;
    }

    public void setXparameterPlaneSubnet(String xparameterPlaneSubnet) {
        this.xparameterPlaneSubnet = xparameterPlaneSubnet;
    }

    public ResourceExtendParams withNodePoolName(String nodePoolName) {
        this.nodePoolName = nodePoolName;
        return this;
    }

    /**
     * **参数解释**：用户指定的节点池名称。最小长度为2，最大长度为50的小写字母、中划线-、数字组成，由小写字母开头，不能以-，-default结尾。 **取值范围**：不涉及
     * @return nodePoolName
     */
    public String getNodePoolName() {
        return nodePoolName;
    }

    public void setNodePoolName(String nodePoolName) {
        this.nodePoolName = nodePoolName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceExtendParams that = (ResourceExtendParams) obj;
        return Objects.equals(this.dockerBaseSize, that.dockerBaseSize)
            && Objects.equals(this.postInstall, that.postInstall) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.labelPolicyOnExistingNodes, that.labelPolicyOnExistingNodes)
            && Objects.equals(this.taintPolicyOnExistingNodes, that.taintPolicyOnExistingNodes)
            && Objects.equals(this.tagPolicyOnExistingNodes, that.tagPolicyOnExistingNodes)
            && Objects.equals(this.xparameterPlaneSubnet, that.xparameterPlaneSubnet)
            && Objects.equals(this.nodePoolName, that.nodePoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerBaseSize,
            postInstall,
            runtime,
            labelPolicyOnExistingNodes,
            taintPolicyOnExistingNodes,
            tagPolicyOnExistingNodes,
            xparameterPlaneSubnet,
            nodePoolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceExtendParams {\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
        sb.append("    postInstall: ").append(toIndentedString(postInstall)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    labelPolicyOnExistingNodes: ").append(toIndentedString(labelPolicyOnExistingNodes)).append("\n");
        sb.append("    taintPolicyOnExistingNodes: ").append(toIndentedString(taintPolicyOnExistingNodes)).append("\n");
        sb.append("    tagPolicyOnExistingNodes: ").append(toIndentedString(tagPolicyOnExistingNodes)).append("\n");
        sb.append("    xparameterPlaneSubnet: ").append(toIndentedString(xparameterPlaneSubnet)).append("\n");
        sb.append("    nodePoolName: ").append(toIndentedString(nodePoolName)).append("\n");
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
