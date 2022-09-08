package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PodResp
 */
public class PodResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private PodConfigs configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private Affinity affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init_containers")

    private List<ContainerResp> initContainers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containers")

    private List<ContainerResp> containers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public PodResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用实例uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PodResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PodResp withConfigs(PodConfigs configs) {
        this.configs = configs;
        return this;
    }

    public PodResp withConfigs(Consumer<PodConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new PodConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public PodConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(PodConfigs configs) {
        this.configs = configs;
    }

    public PodResp withAffinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public PodResp withAffinity(Consumer<Affinity> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new Affinity();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public PodResp withInitContainers(List<ContainerResp> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    public PodResp addInitContainersItem(ContainerResp initContainersItem) {
        if (this.initContainers == null) {
            this.initContainers = new ArrayList<>();
        }
        this.initContainers.add(initContainersItem);
        return this;
    }

    public PodResp withInitContainers(Consumer<List<ContainerResp>> initContainersSetter) {
        if (this.initContainers == null) {
            this.initContainers = new ArrayList<>();
        }
        initContainersSetter.accept(this.initContainers);
        return this;
    }

    /**
     * 应用实例init容器
     * @return initContainers
     */
    public List<ContainerResp> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(List<ContainerResp> initContainers) {
        this.initContainers = initContainers;
    }

    public PodResp withContainers(List<ContainerResp> containers) {
        this.containers = containers;
        return this;
    }

    public PodResp addContainersItem(ContainerResp containersItem) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        this.containers.add(containersItem);
        return this;
    }

    public PodResp withContainers(Consumer<List<ContainerResp>> containersSetter) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        containersSetter.accept(this.containers);
        return this;
    }

    /**
     * 应用实例业务容器
     * @return containers
     */
    public List<ContainerResp> getContainers() {
        return containers;
    }

    public void setContainers(List<ContainerResp> containers) {
        this.containers = containers;
    }

    public PodResp withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 应用实例所在节点
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public PodResp withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 应用ID
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public PodResp withProjectId(String projectId) {
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

    public PodResp withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 应用实例故障原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public PodResp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 应用实例故障详情
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PodResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 应用实例创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public PodResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 应用实例更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PodResp withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 应用实例状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PodResp podResp = (PodResp) o;
        return Objects.equals(this.id, podResp.id) && Objects.equals(this.name, podResp.name)
            && Objects.equals(this.configs, podResp.configs) && Objects.equals(this.affinity, podResp.affinity)
            && Objects.equals(this.initContainers, podResp.initContainers)
            && Objects.equals(this.containers, podResp.containers) && Objects.equals(this.nodeId, podResp.nodeId)
            && Objects.equals(this.deploymentId, podResp.deploymentId)
            && Objects.equals(this.projectId, podResp.projectId) && Objects.equals(this.reason, podResp.reason)
            && Objects.equals(this.message, podResp.message) && Objects.equals(this.createdAt, podResp.createdAt)
            && Objects.equals(this.updatedAt, podResp.updatedAt) && Objects.equals(this.state, podResp.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            configs,
            affinity,
            initContainers,
            containers,
            nodeId,
            deploymentId,
            projectId,
            reason,
            message,
            createdAt,
            updatedAt,
            state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
