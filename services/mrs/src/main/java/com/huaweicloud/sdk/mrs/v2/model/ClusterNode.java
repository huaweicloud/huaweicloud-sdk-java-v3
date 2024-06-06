package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterNode
 */
public class ClusterNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group_name")

    private String nodeGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_type")

    private String billingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_type")

    private String deploymentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_info")

    private ServerInfo serverInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_detail")

    private NodeDetail nodeDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_status")

    private String nodeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_infos")

    private List<ComponentInfo> componentInfos = null;

    public ClusterNode withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称，对应manager里的节点名称。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ClusterNode withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id。确定节点的唯一性，包周期节点可用于计费的查询。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ClusterNode withNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }

    /**
     * 节点组名称。
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    public ClusterNode withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型。Task、Core、Master等。
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ClusterNode withBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * on-period包周期或者on-quantity按需。
     * @return billingType
     */
    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public ClusterNode withDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * 部署类型。支持Server主机类型。
     * @return deploymentType
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    public ClusterNode withServerInfo(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
        return this;
    }

    public ClusterNode withServerInfo(Consumer<ServerInfo> serverInfoSetter) {
        if (this.serverInfo == null) {
            this.serverInfo = new ServerInfo();
            serverInfoSetter.accept(this.serverInfo);
        }

        return this;
    }

    /**
     * Get serverInfo
     * @return serverInfo
     */
    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public ClusterNode withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ClusterNode addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ClusterNode withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 节点标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ClusterNode withNodeDetail(NodeDetail nodeDetail) {
        this.nodeDetail = nodeDetail;
        return this;
    }

    public ClusterNode withNodeDetail(Consumer<NodeDetail> nodeDetailSetter) {
        if (this.nodeDetail == null) {
            this.nodeDetail = new NodeDetail();
            nodeDetailSetter.accept(this.nodeDetail);
        }

        return this;
    }

    /**
     * Get nodeDetail
     * @return nodeDetail
     */
    public NodeDetail getNodeDetail() {
        return nodeDetail;
    }

    public void setNodeDetail(NodeDetail nodeDetail) {
        this.nodeDetail = nodeDetail;
    }

    public ClusterNode withNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * 节点状态。对应页面上的操作状态。
     * @return nodeStatus
     */
    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public ClusterNode withComponentInfos(List<ComponentInfo> componentInfos) {
        this.componentInfos = componentInfos;
        return this;
    }

    public ClusterNode addComponentInfosItem(ComponentInfo componentInfosItem) {
        if (this.componentInfos == null) {
            this.componentInfos = new ArrayList<>();
        }
        this.componentInfos.add(componentInfosItem);
        return this;
    }

    public ClusterNode withComponentInfos(Consumer<List<ComponentInfo>> componentInfosSetter) {
        if (this.componentInfos == null) {
            this.componentInfos = new ArrayList<>();
        }
        componentInfosSetter.accept(this.componentInfos);
        return this;
    }

    /**
     * 组件实例信息数组。
     * @return componentInfos
     */
    public List<ComponentInfo> getComponentInfos() {
        return componentInfos;
    }

    public void setComponentInfos(List<ComponentInfo> componentInfos) {
        this.componentInfos = componentInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterNode that = (ClusterNode) obj;
        return Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.nodeGroupName, that.nodeGroupName) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.billingType, that.billingType)
            && Objects.equals(this.deploymentType, that.deploymentType)
            && Objects.equals(this.serverInfo, that.serverInfo) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.nodeDetail, that.nodeDetail) && Objects.equals(this.nodeStatus, that.nodeStatus)
            && Objects.equals(this.componentInfos, that.componentInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName,
            resourceId,
            nodeGroupName,
            nodeType,
            billingType,
            deploymentType,
            serverInfo,
            tags,
            nodeDetail,
            nodeStatus,
            componentInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNode {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    nodeGroupName: ").append(toIndentedString(nodeGroupName)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
        sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
        sb.append("    serverInfo: ").append(toIndentedString(serverInfo)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    nodeDetail: ").append(toIndentedString(nodeDetail)).append("\n");
        sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
        sb.append("    componentInfos: ").append(toIndentedString(componentInfos)).append("\n");
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
