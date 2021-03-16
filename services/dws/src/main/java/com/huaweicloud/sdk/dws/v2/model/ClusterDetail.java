package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.Endpoints;
import com.huaweicloud.sdk.dws.v2.model.MaintainWindow;
import com.huaweicloud.sdk.dws.v2.model.NodeDetail;
import com.huaweicloud.sdk.dws.v2.model.ParameterGroup;
import com.huaweicloud.sdk.dws.v2.model.PublicEndpoints;
import com.huaweicloud.sdk.dws.v2.model.PublicIp;
import com.huaweicloud.sdk.dws.v2.model.ResizeInfo;
import com.huaweicloud.sdk.dws.v2.model.Tags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群详情对象
 */
public class ClusterDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_progress")
    
    private Map<String, String> actionProgress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private PublicIp publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number_of_node")
    
    private Integer numberOfNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recent_event")
    
    private Integer recentEvent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip")
    
    private List<String> privateIp = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter_group")
    
    private ParameterGroup parameterGroup;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_type")
    
    private String nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_endpoints")
    
    private List<PublicEndpoints> publicEndpoints = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed_reasons")
    
    private Object failedReasons;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoints")
    
    private List<Endpoints> endpoints = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_status")
    
    private String taskStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_status")
    
    private String subStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_type_id")
    
    private String nodeTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_detail")
    
    private NodeDetail nodeDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_window")
    
    private MaintainWindow maintainWindow;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tags> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize_info")
    
    private ResizeInfo resizeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public ClusterDetail withActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    

    public ClusterDetail putActionProgressItem(String key, String actionProgressItem) {
        this.actionProgress.put(key, actionProgressItem);
        return this;
    }

    public ClusterDetail withActionProgress(Consumer<Map<String, String>> actionProgressSetter) {
        if(this.actionProgress == null ){
            this.actionProgress = new HashMap<>();
        }
        actionProgressSetter.accept(this.actionProgress);
        return this;
    }
    /**
     * Key值为正在进行的任务，有效值包括：  GROWING：扩容中  RESTORING：恢复中  SNAPSHOTTING：快照中  REPAIRING : 修复中  CREATING : 创建中 value值为正在进行任务的进度。 
     * @return actionProgress
     */
    public Map<String, String> getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
    }

    

    public ClusterDetail withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public ClusterDetail withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if(this.publicIp == null ){
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }
        
        return this;
    }


    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    

    public ClusterDetail withNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
        return this;
    }

    


    /**
     * 节点数量
     * @return numberOfNode
     */
    public Integer getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    

    public ClusterDetail withRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
        return this;
    }

    


    /**
     * 事件数
     * @return recentEvent
     */
    public Integer getRecentEvent() {
        return recentEvent;
    }

    public void setRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
    }

    

    public ClusterDetail withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public ClusterDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 管理员用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public ClusterDetail withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public ClusterDetail withPrivateIp(List<String> privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    
    public ClusterDetail addPrivateIpItem(String privateIpItem) {
        this.privateIp.add(privateIpItem);
        return this;
    }

    public ClusterDetail withPrivateIp(Consumer<List<String>> privateIpSetter) {
        if(this.privateIp == null ){
            this.privateIp = new ArrayList<>();
        }
        privateIpSetter.accept(this.privateIp);
        return this;
    }

    /**
     * 内网IP地址列表
     * @return privateIp
     */
    public List<String> getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(List<String> privateIp) {
        this.privateIp = privateIp;
    }

    

    public ClusterDetail withParameterGroup(ParameterGroup parameterGroup) {
        this.parameterGroup = parameterGroup;
        return this;
    }

    public ClusterDetail withParameterGroup(Consumer<ParameterGroup> parameterGroupSetter) {
        if(this.parameterGroup == null ){
            this.parameterGroup = new ParameterGroup();
            parameterGroupSetter.accept(this.parameterGroup);
        }
        
        return this;
    }


    /**
     * Get parameterGroup
     * @return parameterGroup
     */
    public ParameterGroup getParameterGroup() {
        return parameterGroup;
    }

    public void setParameterGroup(ParameterGroup parameterGroup) {
        this.parameterGroup = parameterGroup;
    }

    

    public ClusterDetail withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * 节点类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    

    public ClusterDetail withPublicEndpoints(List<PublicEndpoints> publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
        return this;
    }

    
    public ClusterDetail addPublicEndpointsItem(PublicEndpoints publicEndpointsItem) {
        this.publicEndpoints.add(publicEndpointsItem);
        return this;
    }

    public ClusterDetail withPublicEndpoints(Consumer<List<PublicEndpoints>> publicEndpointsSetter) {
        if(this.publicEndpoints == null ){
            this.publicEndpoints = new ArrayList<>();
        }
        publicEndpointsSetter.accept(this.publicEndpoints);
        return this;
    }

    /**
     * 集群的公网连接信息，如果未指定，则默认不使用公网连接信息。
     * @return publicEndpoints
     */
    public List<PublicEndpoints> getPublicEndpoints() {
        return publicEndpoints;
    }

    public void setPublicEndpoints(List<PublicEndpoints> publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
    }

    

    public ClusterDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 集群ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ClusterDetail withFailedReasons(Object failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    


    /**
     * 失败原因。如果为空，则集群处于正常状态。
     * @return failedReasons
     */
    public Object getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(Object failedReasons) {
        this.failedReasons = failedReasons;
    }

    

    public ClusterDetail withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public ClusterDetail withEndpoints(List<Endpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    
    public ClusterDetail addEndpointsItem(Endpoints endpointsItem) {
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ClusterDetail withEndpoints(Consumer<List<Endpoints>> endpointsSetter) {
        if(this.endpoints == null ){
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 集群的内网连接信息
     * @return endpoints
     */
    public List<Endpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Endpoints> endpoints) {
        this.endpoints = endpoints;
    }

    

    public ClusterDetail withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    


    /**
     * 集群管理任务，有效值包括：  RESTORING：恢复中  SNAPSHOTTING：快照中  GROWING：扩容中  REBOOTING：重启中  SETTING_CONFIGURATION：安全设置配置中  CONFIGURING_EXT_DATASOURCE：MRS连接配置中  DELETING_EXT_DATASOURCE：删除MRS连接  REBOOT_FAILURE：重启失败  RESIZE_FAILURE：扩容失败 
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    

    public ClusterDetail withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    


    /**
     * “可用”集群状态的子状态，有效值包括：  NORMAL：正常  READONLY：只读  REDISTRIBUTING：重分布中  REDISTRIBUTION-FAILURE：重分布失败  UNBALANCED：低性能  UNBALANCED | READONLY：低性能，只读  DEGRADED：节点故障  DEGRADED | READONLY：节点故障，只读  DEGRADED | UNBALANCED：节点故障，低性能  UNBALANCED | REDISTRIBUTING：低性能，重分布中  UNBALANCED | REDISTRIBUTION-FAILURE：低性能，重分布失败  READONLY | REDISTRIBUTION-FAILURE：只读，重分布失败  UNBALANCED | READONLY | REDISTRIBUTION-FAILURE：低性能，只读，重分布失败  DEGRADED | REDISTRIBUTION-FAILURE：节点故障，重分布失败  DEGRADED | UNBALANCED | REDISTRIBUTION-FAILURE：节点故障，低性能，只读，重分布失败  DEGRADED | UNBALANCED | READONLY | REDISTRIBUTION-FAILURE：节点故障，低性能，只读，重分布失败  DEGRADED | UNBALANCED | READONLY：节点故障，低性能，只读 
     * @return subStatus
     */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    

    public ClusterDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 集群创建时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public ClusterDetail withNodeTypeId(String nodeTypeId) {
        this.nodeTypeId = nodeTypeId;
        return this;
    }

    


    /**
     * 节点类型ID
     * @return nodeTypeId
     */
    public String getNodeTypeId() {
        return nodeTypeId;
    }

    public void setNodeTypeId(String nodeTypeId) {
        this.nodeTypeId = nodeTypeId;
    }

    

    public ClusterDetail withNodeDetail(NodeDetail nodeDetail) {
        this.nodeDetail = nodeDetail;
        return this;
    }

    public ClusterDetail withNodeDetail(Consumer<NodeDetail> nodeDetailSetter) {
        if(this.nodeDetail == null ){
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

    

    public ClusterDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 数据仓库版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public ClusterDetail withMaintainWindow(MaintainWindow maintainWindow) {
        this.maintainWindow = maintainWindow;
        return this;
    }

    public ClusterDetail withMaintainWindow(Consumer<MaintainWindow> maintainWindowSetter) {
        if(this.maintainWindow == null ){
            this.maintainWindow = new MaintainWindow();
            maintainWindowSetter.accept(this.maintainWindow);
        }
        
        return this;
    }


    /**
     * Get maintainWindow
     * @return maintainWindow
     */
    public MaintainWindow getMaintainWindow() {
        return maintainWindow;
    }

    public void setMaintainWindow(MaintainWindow maintainWindow) {
        this.maintainWindow = maintainWindow;
    }

    

    public ClusterDetail withTags(List<Tags> tags) {
        this.tags = tags;
        return this;
    }

    
    public ClusterDetail addTagsItem(Tags tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public ClusterDetail withTags(Consumer<List<Tags>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 
     * @return tags
     */
    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    

    public ClusterDetail withResizeInfo(ResizeInfo resizeInfo) {
        this.resizeInfo = resizeInfo;
        return this;
    }

    public ClusterDetail withResizeInfo(Consumer<ResizeInfo> resizeInfoSetter) {
        if(this.resizeInfo == null ){
            this.resizeInfo = new ResizeInfo();
            resizeInfoSetter.accept(this.resizeInfo);
        }
        
        return this;
    }


    /**
     * Get resizeInfo
     * @return resizeInfo
     */
    public ResizeInfo getResizeInfo() {
        return resizeInfo;
    }

    public void setResizeInfo(ResizeInfo resizeInfo) {
        this.resizeInfo = resizeInfo;
    }

    

    public ClusterDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。值为0表示默认企业项目“default”
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ClusterDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 集群服务端口（8000~30000），默认值：8000
     * minimum: 8000
     * maximum: 30000
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public ClusterDetail withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ClusterDetail withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public ClusterDetail withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 集群上次修改时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public ClusterDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 集群状态，有效值包括：   CREATING：创建中   AVAILABLE：可用   UNAVAILABLE：不可用   CREATION FAILED：创建失败 
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
        ClusterDetail clusterDetail = (ClusterDetail) o;
        return Objects.equals(this.actionProgress, clusterDetail.actionProgress) &&
            Objects.equals(this.publicIp, clusterDetail.publicIp) &&
            Objects.equals(this.numberOfNode, clusterDetail.numberOfNode) &&
            Objects.equals(this.recentEvent, clusterDetail.recentEvent) &&
            Objects.equals(this.vpcId, clusterDetail.vpcId) &&
            Objects.equals(this.userName, clusterDetail.userName) &&
            Objects.equals(this.securityGroupId, clusterDetail.securityGroupId) &&
            Objects.equals(this.privateIp, clusterDetail.privateIp) &&
            Objects.equals(this.parameterGroup, clusterDetail.parameterGroup) &&
            Objects.equals(this.nodeType, clusterDetail.nodeType) &&
            Objects.equals(this.publicEndpoints, clusterDetail.publicEndpoints) &&
            Objects.equals(this.id, clusterDetail.id) &&
            Objects.equals(this.failedReasons, clusterDetail.failedReasons) &&
            Objects.equals(this.availabilityZone, clusterDetail.availabilityZone) &&
            Objects.equals(this.endpoints, clusterDetail.endpoints) &&
            Objects.equals(this.taskStatus, clusterDetail.taskStatus) &&
            Objects.equals(this.subStatus, clusterDetail.subStatus) &&
            Objects.equals(this.created, clusterDetail.created) &&
            Objects.equals(this.nodeTypeId, clusterDetail.nodeTypeId) &&
            Objects.equals(this.nodeDetail, clusterDetail.nodeDetail) &&
            Objects.equals(this.version, clusterDetail.version) &&
            Objects.equals(this.maintainWindow, clusterDetail.maintainWindow) &&
            Objects.equals(this.tags, clusterDetail.tags) &&
            Objects.equals(this.resizeInfo, clusterDetail.resizeInfo) &&
            Objects.equals(this.enterpriseProjectId, clusterDetail.enterpriseProjectId) &&
            Objects.equals(this.port, clusterDetail.port) &&
            Objects.equals(this.name, clusterDetail.name) &&
            Objects.equals(this.subnetId, clusterDetail.subnetId) &&
            Objects.equals(this.updated, clusterDetail.updated) &&
            Objects.equals(this.status, clusterDetail.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionProgress, publicIp, numberOfNode, recentEvent, vpcId, userName, securityGroupId, privateIp, parameterGroup, nodeType, publicEndpoints, id, failedReasons, availabilityZone, endpoints, taskStatus, subStatus, created, nodeTypeId, nodeDetail, version, maintainWindow, tags, resizeInfo, enterpriseProjectId, port, name, subnetId, updated, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDetail {\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    numberOfNode: ").append(toIndentedString(numberOfNode)).append("\n");
        sb.append("    recentEvent: ").append(toIndentedString(recentEvent)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    parameterGroup: ").append(toIndentedString(parameterGroup)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    publicEndpoints: ").append(toIndentedString(publicEndpoints)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    nodeTypeId: ").append(toIndentedString(nodeTypeId)).append("\n");
        sb.append("    nodeDetail: ").append(toIndentedString(nodeDetail)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    maintainWindow: ").append(toIndentedString(maintainWindow)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resizeInfo: ").append(toIndentedString(resizeInfo)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

