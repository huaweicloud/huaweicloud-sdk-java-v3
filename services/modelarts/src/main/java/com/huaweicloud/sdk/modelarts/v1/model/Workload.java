package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业详细信息。
 */
public class Workload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobUUID")

    private String jobUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceRequirement")

    private WorkloadResourceRequirement resourceRequirement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runningDuration")

    private Integer runningDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pendingDuration")

    private Integer pendingDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pendingPosition")

    private Integer pendingPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gvk")

    private String gvk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostIps")

    private String hostIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<WorkloadNodeVO> nodes = null;

    public Workload withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：资源的API版本。 **取值范围**：可选值如下： - v1：当前资源版本为v1
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Workload withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：资源的类型。 **取值范围**：可选值如下： - Workload：资源池作业
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Workload withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源池中作业的业务类型。 **取值范围**：可选值如下： - train：训练作业 - infer：推理服务 - notebook：Notebook作业 - x-infer：新版推理作业
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Workload withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**：集群中作业所属的命名空间。 **取值范围**：不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Workload withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业的名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workload withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * **参数解释**：作业的归属的上层业务的名称。 **取值范围**：不涉及。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Workload withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**：作业的ID。 **取值范围**：不涉及。
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Workload withJobUUID(String jobUUID) {
        this.jobUUID = jobUUID;
        return this;
    }

    /**
     * **参数解释**：作业的归属的上层业务的ID。 **取值范围**：不涉及。
     * @return jobUUID
     */
    public String getJobUUID() {
        return jobUUID;
    }

    public void setJobUUID(String jobUUID) {
        this.jobUUID = jobUUID;
    }

    public Workload withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：作业的资源规格。 **取值范围**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Workload withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：作业状态。 **取值范围**：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Workload withResourceRequirement(WorkloadResourceRequirement resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
        return this;
    }

    public Workload withResourceRequirement(Consumer<WorkloadResourceRequirement> resourceRequirementSetter) {
        if (this.resourceRequirement == null) {
            this.resourceRequirement = new WorkloadResourceRequirement();
            resourceRequirementSetter.accept(this.resourceRequirement);
        }

        return this;
    }

    /**
     * Get resourceRequirement
     * @return resourceRequirement
     */
    public WorkloadResourceRequirement getResourceRequirement() {
        return resourceRequirement;
    }

    public void setResourceRequirement(WorkloadResourceRequirement resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
    }

    public Workload withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**：作业的优先级。 **取值范围**：不涉及。
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Workload withRunningDuration(Integer runningDuration) {
        this.runningDuration = runningDuration;
        return this;
    }

    /**
     * **参数解释**：作业的运行时长，以秒为单位。 **取值范围**：不涉及。
     * @return runningDuration
     */
    public Integer getRunningDuration() {
        return runningDuration;
    }

    public void setRunningDuration(Integer runningDuration) {
        this.runningDuration = runningDuration;
    }

    public Workload withPendingDuration(Integer pendingDuration) {
        this.pendingDuration = pendingDuration;
        return this;
    }

    /**
     * **参数解释**：作业的排队时长，以秒为单位。 **取值范围**：不涉及。
     * @return pendingDuration
     */
    public Integer getPendingDuration() {
        return pendingDuration;
    }

    public void setPendingDuration(Integer pendingDuration) {
        this.pendingDuration = pendingDuration;
    }

    public Workload withPendingPosition(Integer pendingPosition) {
        this.pendingPosition = pendingPosition;
        return this;
    }

    /**
     * **参数解释**：作业当前的排队位置。 **取值范围**：不涉及。
     * @return pendingPosition
     */
    public Integer getPendingPosition() {
        return pendingPosition;
    }

    public void setPendingPosition(Integer pendingPosition) {
        this.pendingPosition = pendingPosition;
    }

    public Workload withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：作业的Unix创建时间戳，以毫秒为单位。 **取值范围**：不涉及。
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Workload withGvk(String gvk) {
        this.gvk = gvk;
        return this;
    }

    /**
     * **参数解释**：作业的k8s资源类型、分组和版本。 **取值范围**：不涉及。
     * @return gvk
     */
    public String getGvk() {
        return gvk;
    }

    public void setGvk(String gvk) {
        this.gvk = gvk;
    }

    public Workload withHostIps(String hostIps) {
        this.hostIps = hostIps;
        return this;
    }

    /**
     * **参数解释**：作业运行的节点IP列表，以“,”分隔。 **取值范围**：不涉及。
     * @return hostIps
     */
    public String getHostIps() {
        return hostIps;
    }

    public void setHostIps(String hostIps) {
        this.hostIps = hostIps;
    }

    public Workload withNodes(List<WorkloadNodeVO> nodes) {
        this.nodes = nodes;
        return this;
    }

    public Workload addNodesItem(WorkloadNodeVO nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public Workload withNodes(Consumer<List<WorkloadNodeVO>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**：作业运行时占用的节点资源信息。
     * @return nodes
     */
    public List<WorkloadNodeVO> getNodes() {
        return nodes;
    }

    public void setNodes(List<WorkloadNodeVO> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Workload that = (Workload) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.type, that.type) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.name, that.name) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.jobUUID, that.jobUUID)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.status, that.status)
            && Objects.equals(this.resourceRequirement, that.resourceRequirement)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.runningDuration, that.runningDuration)
            && Objects.equals(this.pendingDuration, that.pendingDuration)
            && Objects.equals(this.pendingPosition, that.pendingPosition)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.gvk, that.gvk)
            && Objects.equals(this.hostIps, that.hostIps) && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion,
            kind,
            type,
            namespace,
            name,
            jobName,
            uid,
            jobUUID,
            flavor,
            status,
            resourceRequirement,
            priority,
            runningDuration,
            pendingDuration,
            pendingPosition,
            createTime,
            gvk,
            hostIps,
            nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workload {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    jobUUID: ").append(toIndentedString(jobUUID)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceRequirement: ").append(toIndentedString(resourceRequirement)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    runningDuration: ").append(toIndentedString(runningDuration)).append("\n");
        sb.append("    pendingDuration: ").append(toIndentedString(pendingDuration)).append("\n");
        sb.append("    pendingPosition: ").append(toIndentedString(pendingPosition)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    gvk: ").append(toIndentedString(gvk)).append("\n");
        sb.append("    hostIps: ").append(toIndentedString(hostIps)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
