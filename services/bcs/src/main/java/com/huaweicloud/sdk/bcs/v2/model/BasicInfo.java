package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BasicInfo
 */
public class BasicInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="purchase_type")
    
    private String purchaseType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_algorithm")
    
    private String signAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consensus")
    
    private String consensus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private Integer chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_type")
    
    private Integer versionType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_type")
    
    private String databaseType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_name")
    
    private String clusterName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_type")
    
    private String clusterType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_az")
    
    private String clusterAz;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_type")
    
    private String deployType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_cross_region")
    
    private Boolean isCrossRegion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_support_rollback")
    
    private Boolean isSupportRollback;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_support_restful")
    
    private Boolean isSupportRestful;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_old_service")
    
    private Boolean isOldService;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="old_service_version")
    
    private String oldServiceVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_portal_addrs")
    
    private List<String> agentPortalAddrs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="process_status")
    
    private String processStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_status")
    
    private Integer orderStatus;

    public BasicInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * BCS服务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * BCS服务名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasicInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * BCS服务版本信息
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BasicInfo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * BCS服务的类型，分为：联盟链（union），私有链（private）
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public BasicInfo withPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }

    


    /**
     * BCS服务部署类型，分为一键购买（onestep），普通购买（normal）
     * @return purchaseType
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public BasicInfo withSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
        return this;
    }

    


    /**
     * BCS服务安全机制，分为ECDSA（ECDSA），国密算法（sm2）
     * @return signAlgorithm
     */
    public String getSignAlgorithm() {
        return signAlgorithm;
    }

    public void setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
    }

    public BasicInfo withConsensus(String consensus) {
        this.consensus = consensus;
        return this;
    }

    


    /**
     * BCS服务的共识策略，分为测试策略（solo），快速拜占庭容错算法（sflic）,Kafka(kafka)
     * @return consensus
     */
    public String getConsensus() {
        return consensus;
    }

    public void setConsensus(String consensus) {
        this.consensus = consensus;
    }

    public BasicInfo withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * BCS服务付费模式，分为按需（1），包周期（0）
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public BasicInfo withVersionType(Integer versionType) {
        this.versionType = versionType;
        return this;
    }

    


    /**
     * BCS服务版本类型，分为基础版（1），专业版（2），铂金版（3）
     * @return versionType
     */
    public Integer getVersionType() {
        return versionType;
    }

    public void setVersionType(Integer versionType) {
        this.versionType = versionType;
    }

    public BasicInfo withDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    


    /**
     * BCS服务数据库类型，包括文件数据库（goleveldb），关系数据库（MySQL），NoSQL（couchdb）
     * @return databaseType
     */
    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public BasicInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * BCS服务所在集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public BasicInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    


    /**
     * BCS服务所在集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public BasicInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    


    /**
     * BCS服务的集群类型，分为CCE集群（空），IEF集群（ief）
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public BasicInfo withClusterAz(String clusterAz) {
        this.clusterAz = clusterAz;
        return this;
    }

    


    /**
     * BCS多可用区标示，分为：多可用区（yes），非多可用区（no）
     * @return clusterAz
     */
    public String getClusterAz() {
        return clusterAz;
    }

    public void setClusterAz(String clusterAz) {
        this.clusterAz = clusterAz;
    }

    public BasicInfo withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * BCS服务创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public BasicInfo withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    


    /**
     * BCS服务联盟链下生效，分为邀请方（create），被邀请方（invite）
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public BasicInfo withIsCrossRegion(Boolean isCrossRegion) {
        this.isCrossRegion = isCrossRegion;
        return this;
    }

    


    /**
     * BCS服务是否跨region
     * @return isCrossRegion
     */
    public Boolean getIsCrossRegion() {
        return isCrossRegion;
    }

    public void setIsCrossRegion(Boolean isCrossRegion) {
        this.isCrossRegion = isCrossRegion;
    }

    public BasicInfo withIsSupportRollback(Boolean isSupportRollback) {
        this.isSupportRollback = isSupportRollback;
        return this;
    }

    


    /**
     * BCS服务升级失败，是否支持回滚
     * @return isSupportRollback
     */
    public Boolean getIsSupportRollback() {
        return isSupportRollback;
    }

    public void setIsSupportRollback(Boolean isSupportRollback) {
        this.isSupportRollback = isSupportRollback;
    }

    public BasicInfo withIsSupportRestful(Boolean isSupportRestful) {
        this.isSupportRestful = isSupportRestful;
        return this;
    }

    


    /**
     * BCS服务是否添加RESTful APIs支持，分为支持（true），不支持（false）
     * @return isSupportRestful
     */
    public Boolean getIsSupportRestful() {
        return isSupportRestful;
    }

    public void setIsSupportRestful(Boolean isSupportRestful) {
        this.isSupportRestful = isSupportRestful;
    }

    public BasicInfo withIsOldService(Boolean isOldService) {
        this.isOldService = isOldService;
        return this;
    }

    


    /**
     * 区分BCS是否新服务，分为老服务（true），新服务（false）
     * @return isOldService
     */
    public Boolean getIsOldService() {
        return isOldService;
    }

    public void setIsOldService(Boolean isOldService) {
        this.isOldService = isOldService;
    }

    public BasicInfo withOldServiceVersion(String oldServiceVersion) {
        this.oldServiceVersion = oldServiceVersion;
        return this;
    }

    


    /**
     * BCS服务为老服务时，此字段为老服务版本号
     * @return oldServiceVersion
     */
    public String getOldServiceVersion() {
        return oldServiceVersion;
    }

    public void setOldServiceVersion(String oldServiceVersion) {
        this.oldServiceVersion = oldServiceVersion;
    }

    public BasicInfo withAgentPortalAddrs(List<String> agentPortalAddrs) {
        this.agentPortalAddrs = agentPortalAddrs;
        return this;
    }

    
    public BasicInfo addAgentPortalAddrsItem(String agentPortalAddrsItem) {
        if (this.agentPortalAddrs == null) {
            this.agentPortalAddrs = new ArrayList<>();
        }
        this.agentPortalAddrs.add(agentPortalAddrsItem);
        return this;
    }

    public BasicInfo withAgentPortalAddrs(Consumer<List<String>> agentPortalAddrsSetter) {
        if(this.agentPortalAddrs == null ){
            this.agentPortalAddrs = new ArrayList<>();
        }
        agentPortalAddrsSetter.accept(this.agentPortalAddrs);
        return this;
    }

    /**
     * BCS服务用户数据面agent地址端口列表
     * @return agentPortalAddrs
     */
    public List<String> getAgentPortalAddrs() {
        return agentPortalAddrs;
    }

    public void setAgentPortalAddrs(List<String> agentPortalAddrs) {
        this.agentPortalAddrs = agentPortalAddrs;
    }

    public BasicInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * BCS服务状态，分为正常（Normal），异常（Abnormal），弹性IP异常（EipAbnormal），已冻结（Freeze），休眠中（Hibernation），未知（其余值）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BasicInfo withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    


    /**
     * BCS服务处理状态，分为创建中（IsCreating），升级中（IsUpgrading），扩缩容中（IsScaling），删除中（IsDeleting），添加中（IsAdding）
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public BasicInfo withOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    


    /**
     * BCS服务为包周期模式时，返回值为0（订单未成功）,1（订单异常）,2（订单正常）
     * @return orderStatus
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasicInfo basicInfo = (BasicInfo) o;
        return Objects.equals(this.id, basicInfo.id) &&
            Objects.equals(this.name, basicInfo.name) &&
            Objects.equals(this.version, basicInfo.version) &&
            Objects.equals(this.serviceType, basicInfo.serviceType) &&
            Objects.equals(this.purchaseType, basicInfo.purchaseType) &&
            Objects.equals(this.signAlgorithm, basicInfo.signAlgorithm) &&
            Objects.equals(this.consensus, basicInfo.consensus) &&
            Objects.equals(this.chargingMode, basicInfo.chargingMode) &&
            Objects.equals(this.versionType, basicInfo.versionType) &&
            Objects.equals(this.databaseType, basicInfo.databaseType) &&
            Objects.equals(this.clusterId, basicInfo.clusterId) &&
            Objects.equals(this.clusterName, basicInfo.clusterName) &&
            Objects.equals(this.clusterType, basicInfo.clusterType) &&
            Objects.equals(this.clusterAz, basicInfo.clusterAz) &&
            Objects.equals(this.createdTime, basicInfo.createdTime) &&
            Objects.equals(this.deployType, basicInfo.deployType) &&
            Objects.equals(this.isCrossRegion, basicInfo.isCrossRegion) &&
            Objects.equals(this.isSupportRollback, basicInfo.isSupportRollback) &&
            Objects.equals(this.isSupportRestful, basicInfo.isSupportRestful) &&
            Objects.equals(this.isOldService, basicInfo.isOldService) &&
            Objects.equals(this.oldServiceVersion, basicInfo.oldServiceVersion) &&
            Objects.equals(this.agentPortalAddrs, basicInfo.agentPortalAddrs) &&
            Objects.equals(this.status, basicInfo.status) &&
            Objects.equals(this.processStatus, basicInfo.processStatus) &&
            Objects.equals(this.orderStatus, basicInfo.orderStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, version, serviceType, purchaseType, signAlgorithm, consensus, chargingMode, versionType, databaseType, clusterId, clusterName, clusterType, clusterAz, createdTime, deployType, isCrossRegion, isSupportRollback, isSupportRestful, isOldService, oldServiceVersion, agentPortalAddrs, status, processStatus, orderStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    purchaseType: ").append(toIndentedString(purchaseType)).append("\n");
        sb.append("    signAlgorithm: ").append(toIndentedString(signAlgorithm)).append("\n");
        sb.append("    consensus: ").append(toIndentedString(consensus)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterAz: ").append(toIndentedString(clusterAz)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    isCrossRegion: ").append(toIndentedString(isCrossRegion)).append("\n");
        sb.append("    isSupportRollback: ").append(toIndentedString(isSupportRollback)).append("\n");
        sb.append("    isSupportRestful: ").append(toIndentedString(isSupportRestful)).append("\n");
        sb.append("    isOldService: ").append(toIndentedString(isOldService)).append("\n");
        sb.append("    oldServiceVersion: ").append(toIndentedString(oldServiceVersion)).append("\n");
        sb.append("    agentPortalAddrs: ").append(toIndentedString(agentPortalAddrs)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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

