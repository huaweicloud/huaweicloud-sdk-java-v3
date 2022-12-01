package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Pod
 */
public class Pod {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private PodConfig configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private PodAffinity affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private AppDef apps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public Pod withConfigs(PodConfig configs) {
        this.configs = configs;
        return this;
    }

    public Pod withConfigs(Consumer<PodConfig> configsSetter) {
        if (this.configs == null) {
            this.configs = new PodConfig();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public PodConfig getConfigs() {
        return configs;
    }

    public void setConfigs(PodConfig configs) {
        this.configs = configs;
    }

    public Pod withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 部署失败的原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Pod withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 对应网卡地址
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public Pod withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Pod withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Pod withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Pod withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Pod withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pod withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pod withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 部署ID
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public Pod withAffinity(PodAffinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public Pod withAffinity(Consumer<PodAffinity> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new PodAffinity();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public PodAffinity getAffinity() {
        return affinity;
    }

    public void setAffinity(PodAffinity affinity) {
        this.affinity = affinity;
    }

    public Pod withApps(AppDef apps) {
        this.apps = apps;
        return this;
    }

    public Pod withApps(Consumer<AppDef> appsSetter) {
        if (this.apps == null) {
            this.apps = new AppDef();
            appsSetter.accept(this.apps);
        }

        return this;
    }

    /**
     * Get apps
     * @return apps
     */
    public AppDef getApps() {
        return apps;
    }

    public void setApps(AppDef apps) {
        this.apps = apps;
    }

    public Pod withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Pod withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，状态包括，Pending，表示挂起，Running表示pod已经被调到到某节点，Succeeded表示Pod已经被成功终止，Failed表示左右容器都已终止，Unkonwn表示无法取得Pod状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pod pod = (Pod) o;
        return Objects.equals(this.configs, pod.configs) && Objects.equals(this.reason, pod.reason)
            && Objects.equals(this.hostIp, pod.hostIp) && Objects.equals(this.createdAt, pod.createdAt)
            && Objects.equals(this.clusterId, pod.clusterId) && Objects.equals(this.updatedAt, pod.updatedAt)
            && Objects.equals(this.projectId, pod.projectId) && Objects.equals(this.name, pod.name)
            && Objects.equals(this.id, pod.id) && Objects.equals(this.deploymentId, pod.deploymentId)
            && Objects.equals(this.affinity, pod.affinity) && Objects.equals(this.apps, pod.apps)
            && Objects.equals(this.nodeId, pod.nodeId) && Objects.equals(this.status, pod.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs,
            reason,
            hostIp,
            createdAt,
            clusterId,
            updatedAt,
            projectId,
            name,
            id,
            deploymentId,
            affinity,
            apps,
            nodeId,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pod {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
