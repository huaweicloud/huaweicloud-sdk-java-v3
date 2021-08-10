package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 集群列表对象 */
public class ClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_progress")

    private Map<String, String> actionProgress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reasons")

    private Object failedReasons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private Endpoints endpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_status")

    private String subStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_node")

    private Integer numberOfNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_event")

    private Integer recentEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Tags tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_endpoints")

    private PublicEndpoints publicEndpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ClusterInfo withActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ClusterInfo putActionProgressItem(String key, String actionProgressItem) {
        if (this.actionProgress == null) {
            this.actionProgress = new HashMap<>();
        }
        this.actionProgress.put(key, actionProgressItem);
        return this;
    }

    public ClusterInfo withActionProgress(Consumer<Map<String, String>> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new HashMap<>();
        }
        actionProgressSetter.accept(this.actionProgress);
        return this;
    }

    /** 任务信息，由key、value组成。key值为正在进行的任务，value值为正在进行任务的进度。key值的有效值包括：  GROWING：扩容中  RESTORING：恢复中  SNAPSHOTTING：快照中 
     * REPAIRING : 修复中  CREATING : 创建中
     * 
     * @return actionProgress */
    public Map<String, String> getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ClusterInfo withFailedReasons(Object failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    /** 失败原因。如果为空，则集群处于正常状态。
     * 
     * @return failedReasons */
    public Object getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(Object failedReasons) {
        this.failedReasons = failedReasons;
    }

    public ClusterInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 可用区
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ClusterInfo withEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ClusterInfo withEndpoints(Consumer<Endpoints> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new Endpoints();
            endpointsSetter.accept(this.endpoints);
        }

        return this;
    }

    /** Get endpoints
     * 
     * @return endpoints */
    public Endpoints getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
    }

    public ClusterInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /** 集群管理任务，有效值包括：  RESTORING：恢复中  SNAPSHOTTING：快照中  GROWING：扩容中  REBOOTING：重启中  SETTING_CONFIGURATION：安全设置配置中 
     * CONFIGURING_EXT_DATASOURCE：MRS连接配置中  DELETING_EXT_DATASOURCE：删除MRS连接  REBOOT_FAILURE：重启失败  RESIZE_FAILURE：扩容失败
     * 
     * @return taskStatus */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ClusterInfo withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public ClusterInfo withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /** Get publicIp
     * 
     * @return publicIp */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public ClusterInfo withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /** “可用”集群状态的子状态，有效值包括：  NORMAL：正常  READONLY：只读  REDISTRIBUTING：重分布中  REDISTRIBUTION-FAILURE：重分布失败 
     * UNBALANCED：低性能  UNBALANCED | READONLY：低性能，只读  DEGRADED：节点故障  DEGRADED | READONLY：节点故障，只读  DEGRADED |
     * UNBALANCED：节点故障，低性能  UNBALANCED | REDISTRIBUTING：低性能，重分布中  UNBALANCED | REDISTRIBUTION-FAILURE：低性能，重分布失败 
     * READONLY | REDISTRIBUTION-FAILURE：只读，重分布失败  UNBALANCED | READONLY | REDISTRIBUTION-FAILURE：低性能，只读，重分布失败 
     * DEGRADED | REDISTRIBUTION-FAILURE：节点故障，重分布失败  DEGRADED | UNBALANCED | REDISTRIBUTION-FAILURE：节点故障，低性能，只读，重分布失败 
     * DEGRADED | UNBALANCED | READONLY | REDISTRIBUTION-FAILURE：节点故障，低性能，只读，重分布失败  DEGRADED | UNBALANCED |
     * READONLY：节点故障，低性能，只读
     * 
     * @return subStatus */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public ClusterInfo withNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
        return this;
    }

    /** 节点数量 minimum: 3 maximum: 32
     * 
     * @return numberOfNode */
    public Integer getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    public ClusterInfo withRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
        return this;
    }

    /** 事件数
     * 
     * @return recentEvent */
    public Integer getRecentEvent() {
        return recentEvent;
    }

    public void setRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
    }

    public ClusterInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 虚拟私有云ID
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ClusterInfo withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 集群创建时间，格式为 ISO8601：YYYY-MM-DDThh:mm:ssZ。
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ClusterInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 管理员用户名
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ClusterInfo withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 安全组ID
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ClusterInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 数据仓库版本
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterInfo withTags(Tags tags) {
        this.tags = tags;
        return this;
    }

    public ClusterInfo withTags(Consumer<Tags> tagsSetter) {
        if (this.tags == null) {
            this.tags = new Tags();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /** Get tags
     * 
     * @return tags */
    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public ClusterInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。值为0表示默认企业项目“default”
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ClusterInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /** 节点类型
     * 
     * @return nodeType */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ClusterInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** 集群服务端口，取值范围8000~30000，默认值：8000 minimum: 8000 maximum: 30000
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ClusterInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** 集群名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 子网ID
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ClusterInfo withPublicEndpoints(PublicEndpoints publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
        return this;
    }

    public ClusterInfo withPublicEndpoints(Consumer<PublicEndpoints> publicEndpointsSetter) {
        if (this.publicEndpoints == null) {
            this.publicEndpoints = new PublicEndpoints();
            publicEndpointsSetter.accept(this.publicEndpoints);
        }

        return this;
    }

    /** Get publicEndpoints
     * 
     * @return publicEndpoints */
    public PublicEndpoints getPublicEndpoints() {
        return publicEndpoints;
    }

    public void setPublicEndpoints(PublicEndpoints publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
    }

    public ClusterInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** 集群ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterInfo withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 集群上次修改时间，格式为 ISO8601：YYYY-MM-DDThh:mm:ssZ
     * 
     * @return updated */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ClusterInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 集群状态，有效值包括：  CREATING：创建中  AVAILABLE：可用  UNAVAILABLE：不可用  CREATION FAILED：创建失败
     * 
     * @return status */
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
        ClusterInfo clusterInfo = (ClusterInfo) o;
        return Objects.equals(this.actionProgress, clusterInfo.actionProgress)
            && Objects.equals(this.failedReasons, clusterInfo.failedReasons)
            && Objects.equals(this.availabilityZone, clusterInfo.availabilityZone)
            && Objects.equals(this.endpoints, clusterInfo.endpoints)
            && Objects.equals(this.taskStatus, clusterInfo.taskStatus)
            && Objects.equals(this.publicIp, clusterInfo.publicIp)
            && Objects.equals(this.subStatus, clusterInfo.subStatus)
            && Objects.equals(this.numberOfNode, clusterInfo.numberOfNode)
            && Objects.equals(this.recentEvent, clusterInfo.recentEvent)
            && Objects.equals(this.vpcId, clusterInfo.vpcId) && Objects.equals(this.created, clusterInfo.created)
            && Objects.equals(this.userName, clusterInfo.userName)
            && Objects.equals(this.securityGroupId, clusterInfo.securityGroupId)
            && Objects.equals(this.version, clusterInfo.version) && Objects.equals(this.tags, clusterInfo.tags)
            && Objects.equals(this.enterpriseProjectId, clusterInfo.enterpriseProjectId)
            && Objects.equals(this.nodeType, clusterInfo.nodeType) && Objects.equals(this.port, clusterInfo.port)
            && Objects.equals(this.name, clusterInfo.name) && Objects.equals(this.subnetId, clusterInfo.subnetId)
            && Objects.equals(this.publicEndpoints, clusterInfo.publicEndpoints)
            && Objects.equals(this.id, clusterInfo.id) && Objects.equals(this.updated, clusterInfo.updated)
            && Objects.equals(this.status, clusterInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionProgress,
            failedReasons,
            availabilityZone,
            endpoints,
            taskStatus,
            publicIp,
            subStatus,
            numberOfNode,
            recentEvent,
            vpcId,
            created,
            userName,
            securityGroupId,
            version,
            tags,
            enterpriseProjectId,
            nodeType,
            port,
            name,
            subnetId,
            publicEndpoints,
            id,
            updated,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInfo {\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
        sb.append("    numberOfNode: ").append(toIndentedString(numberOfNode)).append("\n");
        sb.append("    recentEvent: ").append(toIndentedString(recentEvent)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    publicEndpoints: ").append(toIndentedString(publicEndpoints)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
