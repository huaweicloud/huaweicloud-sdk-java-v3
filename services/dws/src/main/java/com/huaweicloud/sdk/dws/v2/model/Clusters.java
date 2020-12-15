package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.Endpoints;
import com.huaweicloud.sdk.dws.v2.model.PublicEndpoints;
import com.huaweicloud.sdk.dws.v2.model.PublicIp;
import com.huaweicloud.sdk.dws.v2.model.Tags;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群列表对象
 */
public class Clusters  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_status")
    
    private String subStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_status")
    
    private String taskStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_progress")
    
    private Map<String, String> actionProgress = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_type")
    
    private String nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number_of_node")
    
    private Integer numberOfNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private PublicIp publicIp = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_endpoints")
    
    private PublicEndpoints publicEndpoints = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoints")
    
    private Endpoints endpoints = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private Tags tags = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed_reasons")
    
    private Object failedReasons = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recent_event")
    
    private Integer recentEvent;

    public Clusters withId(String id) {
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

    public Clusters withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 集群状态，有效值包括：  CREATING：创建中  AVAILABLE：可用  UNAVAILABLE：不可用  CREATION FAILED：创建失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Clusters withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    


    /**
     * “可用”集群状态的子状态
     * @return subStatus
     */
    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public Clusters withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    


    /**
     * 集群管理任务
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Clusters withActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    

    public Clusters putActionProgressItem(String key, String actionProgressItem) {
        this.actionProgress.put(key, actionProgressItem);
        return this;
    }

    public Clusters withActionProgress(Consumer<Map<String, String>> actionProgressSetter) {
        if(this.actionProgress == null ){
            this.actionProgress = new HashMap<>();
        }
        actionProgressSetter.accept(this.actionProgress);
        return this;
    }
    /**
     * 任务信息，由key、value组成。key值为正在进行的任务，value值为正在进行任务的进度。
     * @return actionProgress
     */
    public Map<String, String> getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(Map<String, String> actionProgress) {
        this.actionProgress = actionProgress;
    }

    public Clusters withNodeType(String nodeType) {
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

    public Clusters withSubnetId(String subnetId) {
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

    public Clusters withSecurityGroupId(String securityGroupId) {
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

    public Clusters withVpcId(String vpcId) {
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

    public Clusters withNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
        return this;
    }

    


    /**
     * 节点数量
     * minimum: 3
     * maximum: 32
     * @return numberOfNode
     */
    public Integer getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(Integer numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    public Clusters withAvailabilityZone(String availabilityZone) {
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

    public Clusters withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 集群服务端口，取值范围8000~10000，默认值：8000。
     * minimum: 8000
     * maximum: 10000
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Clusters withName(String name) {
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

    public Clusters withVersion(String version) {
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

    public Clusters withUserName(String userName) {
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

    public Clusters withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public Clusters withPublicIp(Consumer<PublicIp> publicIpSetter) {
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

    public Clusters withPublicEndpoints(PublicEndpoints publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
        return this;
    }

    public Clusters withPublicEndpoints(Consumer<PublicEndpoints> publicEndpointsSetter) {
        if(this.publicEndpoints == null ){
            this.publicEndpoints = new PublicEndpoints();
            publicEndpointsSetter.accept(this.publicEndpoints);
        }
        
        return this;
    }


    /**
     * Get publicEndpoints
     * @return publicEndpoints
     */
    public PublicEndpoints getPublicEndpoints() {
        return publicEndpoints;
    }

    public void setPublicEndpoints(PublicEndpoints publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
    }

    public Clusters withEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public Clusters withEndpoints(Consumer<Endpoints> endpointsSetter) {
        if(this.endpoints == null ){
            this.endpoints = new Endpoints();
            endpointsSetter.accept(this.endpoints);
        }
        
        return this;
    }


    /**
     * Get endpoints
     * @return endpoints
     */
    public Endpoints getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
    }

    public Clusters withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 集群上次修改时间，格式为 ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Clusters withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 集群创建时间，格式为 ISO8601：YYYY-MM-DDThh:mm:ssZ。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Clusters withTags(Tags tags) {
        this.tags = tags;
        return this;
    }

    public Clusters withTags(Consumer<Tags> tagsSetter) {
        if(this.tags == null ){
            this.tags = new Tags();
            tagsSetter.accept(this.tags);
        }
        
        return this;
    }


    /**
     * Get tags
     * @return tags
     */
    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Clusters withFailedReasons(Object failedReasons) {
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

    public Clusters withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。值为0表示默认企业项目“default”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Clusters withRecentEvent(Integer recentEvent) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Clusters clusters = (Clusters) o;
        return Objects.equals(this.id, clusters.id) &&
            Objects.equals(this.status, clusters.status) &&
            Objects.equals(this.subStatus, clusters.subStatus) &&
            Objects.equals(this.taskStatus, clusters.taskStatus) &&
            Objects.equals(this.actionProgress, clusters.actionProgress) &&
            Objects.equals(this.nodeType, clusters.nodeType) &&
            Objects.equals(this.subnetId, clusters.subnetId) &&
            Objects.equals(this.securityGroupId, clusters.securityGroupId) &&
            Objects.equals(this.vpcId, clusters.vpcId) &&
            Objects.equals(this.numberOfNode, clusters.numberOfNode) &&
            Objects.equals(this.availabilityZone, clusters.availabilityZone) &&
            Objects.equals(this.port, clusters.port) &&
            Objects.equals(this.name, clusters.name) &&
            Objects.equals(this.version, clusters.version) &&
            Objects.equals(this.userName, clusters.userName) &&
            Objects.equals(this.publicIp, clusters.publicIp) &&
            Objects.equals(this.publicEndpoints, clusters.publicEndpoints) &&
            Objects.equals(this.endpoints, clusters.endpoints) &&
            Objects.equals(this.updated, clusters.updated) &&
            Objects.equals(this.created, clusters.created) &&
            Objects.equals(this.tags, clusters.tags) &&
            Objects.equals(this.failedReasons, clusters.failedReasons) &&
            Objects.equals(this.enterpriseProjectId, clusters.enterpriseProjectId) &&
            Objects.equals(this.recentEvent, clusters.recentEvent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, status, subStatus, taskStatus, actionProgress, nodeType, subnetId, securityGroupId, vpcId, numberOfNode, availabilityZone, port, name, version, userName, publicIp, publicEndpoints, endpoints, updated, created, tags, failedReasons, enterpriseProjectId, recentEvent);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Clusters {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    numberOfNode: ").append(toIndentedString(numberOfNode)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicEndpoints: ").append(toIndentedString(publicEndpoints)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    recentEvent: ").append(toIndentedString(recentEvent)).append("\n");
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

