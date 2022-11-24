package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.BootstrapScript;
import com.huaweicloud.sdk.mrs.v1.model.ComponentAmb;
import com.huaweicloud.sdk.mrs.v1.model.NodeGroupV10;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Cluster
 */
public class Cluster  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterId")
    
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterName")
    
    
    private String clusterName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="totalNodeNum")
    
    
    private String totalNodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterState")
    
    
    private String clusterState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stageDesc")
    
    
    private String stageDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="createAt")
    
    
    private String createAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updateAt")
    
    
    private String updateAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chargingStartTime")
    
    
    private String chargingStartTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billingType")
    
    
    private String billingType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dataCenter")
    
    
    private String dataCenter;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc")
    
    
    private String vpc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpcId")
    
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    
    private String duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fee")
    
    
    private String fee;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hadoopVersion")
    
    
    private String hadoopVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="componentList")
    
    
    private List<ComponentAmb> componentList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="externalIp")
    
    
    private String externalIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="externalAlternateIp")
    
    
    private String externalAlternateIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="internalIp")
    
    
    private String internalIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploymentId")
    
    
    private String deploymentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="orderId")
    
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="azId")
    
    
    private String azId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="azName")
    
    
    private String azName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="azCode")
    
    
    private String azCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availabilityZoneId")
    
    
    private String availabilityZoneId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instanceId")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vnc")
    
    
    private String vnc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenantId")
    
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeSize")
    
    
    private Integer volumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeType")
    
    
    private String volumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnetId")
    
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnetName")
    
    
    private String subnetName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="securityGroupsId")
    
    
    private String securityGroupsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slaveSecurityGroupsId")
    
    
    private String slaveSecurityGroupsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bootstrapScripts")
    
    
    private List<BootstrapScript> bootstrapScripts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="safeMode")
    
    
    private Integer safeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterVersion")
    
    
    private String clusterVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodePublicCertName")
    
    
    private String nodePublicCertName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterNodeIp")
    
    
    private String masterNodeIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privateIpFirst")
    
    
    private String privateIpFirst;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorInfo")
    
    
    private String errorInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterNodeNum")
    
    
    private String masterNodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coreNodeNum")
    
    
    private String coreNodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterNodeSize")
    
    
    private String masterNodeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coreNodeSize")
    
    
    private String coreNodeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterNodeProductId")
    
    
    private String masterNodeProductId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterNodeSpecId")
    
    
    private String masterNodeSpecId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coreNodeProductId")
    
    
    private String coreNodeProductId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coreNodeSpecId")
    
    
    private String coreNodeSpecId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterDataVolumeType")
    
    
    private String masterDataVolumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterDataVolumeSize")
    
    
    private Integer masterDataVolumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterDataVolumeCount")
    
    
    private Integer masterDataVolumeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coreDataVolumeType")
    
    
    private String coreDataVolumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coreDataVolumeSize")
    
    
    private Integer coreDataVolumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coreDataVolumeCount")
    
    
    private Integer coreDataVolumeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterpriseProjectId")
    
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isMrsManagerFinish")
    
    
    private Boolean isMrsManagerFinish;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterType")
    
    
    private Integer clusterType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logCollection")
    
    
    private Integer logCollection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="periodType")
    
    
    private Integer periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scale")
    
    
    private String scale;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeGroups")
    
    
    private List<NodeGroupV10> nodeGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="taskNodeGroups")
    
    
    private List<NodeGroupV10> taskNodeGroups = null;
    
    public Cluster withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public Cluster withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    


    /**
     * 集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    

    public Cluster withTotalNodeNum(String totalNodeNum) {
        this.totalNodeNum = totalNodeNum;
        return this;
    }

    


    /**
     * 集群部署的节点总数。
     * @return totalNodeNum
     */
    public String getTotalNodeNum() {
        return totalNodeNum;
    }

    public void setTotalNodeNum(String totalNodeNum) {
        this.totalNodeNum = totalNodeNum;
    }

    

    public Cluster withClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }

    


    /**
     * 集群状态，包括： - starting：启动中的集群。 - running：运行中的集群。 - terminated：已删除的集群。 - failed：失败的集群。 - abnormal：异常的集群。 - terminating：删除中的集群。 - frozen：已冻结的集群。 - scaling-out：扩容中的集群。 - scaling-in：缩容中的集群。
     * @return clusterState
     */
    public String getClusterState() {
        return clusterState;
    }

    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    

    public Cluster withStageDesc(String stageDesc) {
        this.stageDesc = stageDesc;
        return this;
    }

    


    /**
     * 集群进度描述。  安装集群进度包括： - Verifying cluster parameters：校验集群参数中 - Applying for cluster resources：申请集群资源中 - Creating VM：创建虚拟机中 - Initializing VM：初始化虚拟机中 - Installing MRS Manager：安装MRS Manager中 - Deploying cluster：部署集群中 - Cluster installation failed：集群安装失败  扩容集群进度包括： - Preparing for cluster expansion：准备扩容中 - Creating VM：创建虚拟机中 - Initializing VM：初始化虚拟机中 - Adding node to the cluster：节点加入集群中 - Cluster expansion failed：集群扩容失败  缩容集群进度包括： - Preparing for cluster shrink：正在准备缩容 - Decommissioning instance：实例退服中 - Deleting VM：删除虚拟机中 - Deleting node from the cluster：从集群删除节点中 - Cluster shrink failed：集群缩容失败 集群安装、扩容、缩容失败，stageDesc会显示失败的原因。
     * @return stageDesc
     */
    public String getStageDesc() {
        return stageDesc;
    }

    public void setStageDesc(String stageDesc) {
        this.stageDesc = stageDesc;
    }

    

    public Cluster withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    


    /**
     * 集群创建时间，十位时间戳。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    

    public Cluster withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    


    /**
     * 集群更新时间，十位时间戳。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    

    public Cluster withChargingStartTime(String chargingStartTime) {
        this.chargingStartTime = chargingStartTime;
        return this;
    }

    


    /**
     * 开始计费时间。
     * @return chargingStartTime
     */
    public String getChargingStartTime() {
        return chargingStartTime;
    }

    public void setChargingStartTime(String chargingStartTime) {
        this.chargingStartTime = chargingStartTime;
    }

    

    public Cluster withBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }

    


    /**
     * 集群计费模式。
     * @return billingType
     */
    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    

    public Cluster withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    


    /**
     * 集群工作区域。
     * @return dataCenter
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    

    public Cluster withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    


    /**
     * VPC名称。
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    

    public Cluster withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public Cluster withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 集群购买时长。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    

    public Cluster withFee(String fee) {
        this.fee = fee;
        return this;
    }

    


    /**
     * 创建集群所需费用，系统自动计算。
     * @return fee
     */
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    

    public Cluster withHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
        return this;
    }

    


    /**
     * Hadoop组件版本信息。
     * @return hadoopVersion
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }

    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }

    

    public Cluster withComponentList(List<ComponentAmb> componentList) {
        this.componentList = componentList;
        return this;
    }

    
    public Cluster addComponentListItem(ComponentAmb componentListItem) {
        if(this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        this.componentList.add(componentListItem);
        return this;
    }

    public Cluster withComponentList(Consumer<List<ComponentAmb>> componentListSetter) {
        if(this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        componentListSetter.accept(this.componentList);
        return this;
    }

    /**
     * 组件列表信息。
     * @return componentList
     */
    public List<ComponentAmb> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<ComponentAmb> componentList) {
        this.componentList = componentList;
    }

    

    public Cluster withExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }

    


    /**
     * 公网IP地址。
     * @return externalIp
     */
    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp;
    }

    

    public Cluster withExternalAlternateIp(String externalAlternateIp) {
        this.externalAlternateIp = externalAlternateIp;
        return this;
    }

    


    /**
     * 公网备用IP地址。
     * @return externalAlternateIp
     */
    public String getExternalAlternateIp() {
        return externalAlternateIp;
    }

    public void setExternalAlternateIp(String externalAlternateIp) {
        this.externalAlternateIp = externalAlternateIp;
    }

    

    public Cluster withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    


    /**
     * 内网IP地址。
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    

    public Cluster withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    


    /**
     * 集群部署ID。
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    

    public Cluster withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 集群备注信息。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public Cluster withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 创建集群的订单号。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    public Cluster withAzId(String azId) {
        this.azId = azId;
        return this;
    }

    


    /**
     * 可用区域ID。
     * @return azId
     */
    public String getAzId() {
        return azId;
    }

    public void setAzId(String azId) {
        this.azId = azId;
    }

    

    public Cluster withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    


    /**
     * 可用区域名称。
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    

    public Cluster withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 可用区域英文名称
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    

    public Cluster withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    


    /**
     * 可用区域
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    

    public Cluster withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public Cluster withVnc(String vnc) {
        this.vnc = vnc;
        return this;
    }

    


    /**
     * 远程登录弹性云服务器的URI地址。
     * @return vnc
     */
    public String getVnc() {
        return vnc;
    }

    public void setVnc(String vnc) {
        this.vnc = vnc;
    }

    

    public Cluster withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目编号。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    public Cluster withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    


    /**
     * 磁盘存储空间。
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    

    public Cluster withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 磁盘类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    

    public Cluster withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public Cluster withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    


    /**
     * 子网名称。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    

    public Cluster withSecurityGroupsId(String securityGroupsId) {
        this.securityGroupsId = securityGroupsId;
        return this;
    }

    


    /**
     * 安全组ID。
     * @return securityGroupsId
     */
    public String getSecurityGroupsId() {
        return securityGroupsId;
    }

    public void setSecurityGroupsId(String securityGroupsId) {
        this.securityGroupsId = securityGroupsId;
    }

    

    public Cluster withSlaveSecurityGroupsId(String slaveSecurityGroupsId) {
        this.slaveSecurityGroupsId = slaveSecurityGroupsId;
        return this;
    }

    


    /**
     * 非Master节点的安全组id，当前一个MRS集群只会使用一个安全组，所以该字段已经废弃，从兼容性考虑，该字段会返回和securityGroupsId同样的值。
     * @return slaveSecurityGroupsId
     */
    public String getSlaveSecurityGroupsId() {
        return slaveSecurityGroupsId;
    }

    public void setSlaveSecurityGroupsId(String slaveSecurityGroupsId) {
        this.slaveSecurityGroupsId = slaveSecurityGroupsId;
    }

    

    public Cluster withBootstrapScripts(List<BootstrapScript> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }

    
    public Cluster addBootstrapScriptsItem(BootstrapScript bootstrapScriptsItem) {
        if(this.bootstrapScripts == null) {
            this.bootstrapScripts = new ArrayList<>();
        }
        this.bootstrapScripts.add(bootstrapScriptsItem);
        return this;
    }

    public Cluster withBootstrapScripts(Consumer<List<BootstrapScript>> bootstrapScriptsSetter) {
        if(this.bootstrapScripts == null) {
            this.bootstrapScripts = new ArrayList<>();
        }
        bootstrapScriptsSetter.accept(this.bootstrapScripts);
        return this;
    }

    /**
     * 配置引导操作脚本信息。
     * @return bootstrapScripts
     */
    public List<BootstrapScript> getBootstrapScripts() {
        return bootstrapScripts;
    }

    public void setBootstrapScripts(List<BootstrapScript> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
    }

    

    public Cluster withSafeMode(Integer safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    


    /**
     * MRS集群运行模式。 - 0：普通集群 - 1：安全集群
     * @return safeMode
     */
    public Integer getSafeMode() {
        return safeMode;
    }

    public void setSafeMode(Integer safeMode) {
        this.safeMode = safeMode;
    }

    

    public Cluster withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    


    /**
     * 集群版本。
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    

    public Cluster withNodePublicCertName(String nodePublicCertName) {
        this.nodePublicCertName = nodePublicCertName;
        return this;
    }

    


    /**
     * 密钥文件名称。
     * @return nodePublicCertName
     */
    public String getNodePublicCertName() {
        return nodePublicCertName;
    }

    public void setNodePublicCertName(String nodePublicCertName) {
        this.nodePublicCertName = nodePublicCertName;
    }

    

    public Cluster withMasterNodeIp(String masterNodeIp) {
        this.masterNodeIp = masterNodeIp;
        return this;
    }

    


    /**
     * Master节点IP。
     * @return masterNodeIp
     */
    public String getMasterNodeIp() {
        return masterNodeIp;
    }

    public void setMasterNodeIp(String masterNodeIp) {
        this.masterNodeIp = masterNodeIp;
    }

    

    public Cluster withPrivateIpFirst(String privateIpFirst) {
        this.privateIpFirst = privateIpFirst;
        return this;
    }

    


    /**
     * 首选私有IP。
     * @return privateIpFirst
     */
    public String getPrivateIpFirst() {
        return privateIpFirst;
    }

    public void setPrivateIpFirst(String privateIpFirst) {
        this.privateIpFirst = privateIpFirst;
    }

    

    public Cluster withErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    


    /**
     * 错误信息。
     * @return errorInfo
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    

    public Cluster withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 标签信息
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    public Cluster withMasterNodeNum(String masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
        return this;
    }

    


    /**
     * 集群部署的Master节点数量。
     * @return masterNodeNum
     */
    public String getMasterNodeNum() {
        return masterNodeNum;
    }

    public void setMasterNodeNum(String masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
    }

    

    public Cluster withCoreNodeNum(String coreNodeNum) {
        this.coreNodeNum = coreNodeNum;
        return this;
    }

    


    /**
     * 集群部署的Core节点数量。
     * @return coreNodeNum
     */
    public String getCoreNodeNum() {
        return coreNodeNum;
    }

    public void setCoreNodeNum(String coreNodeNum) {
        this.coreNodeNum = coreNodeNum;
    }

    

    public Cluster withMasterNodeSize(String masterNodeSize) {
        this.masterNodeSize = masterNodeSize;
        return this;
    }

    


    /**
     * Master节点的实例规格。
     * @return masterNodeSize
     */
    public String getMasterNodeSize() {
        return masterNodeSize;
    }

    public void setMasterNodeSize(String masterNodeSize) {
        this.masterNodeSize = masterNodeSize;
    }

    

    public Cluster withCoreNodeSize(String coreNodeSize) {
        this.coreNodeSize = coreNodeSize;
        return this;
    }

    


    /**
     * Core节点的实例规格。
     * @return coreNodeSize
     */
    public String getCoreNodeSize() {
        return coreNodeSize;
    }

    public void setCoreNodeSize(String coreNodeSize) {
        this.coreNodeSize = coreNodeSize;
    }

    

    public Cluster withMasterNodeProductId(String masterNodeProductId) {
        this.masterNodeProductId = masterNodeProductId;
        return this;
    }

    


    /**
     * Master节点产品ID。
     * @return masterNodeProductId
     */
    public String getMasterNodeProductId() {
        return masterNodeProductId;
    }

    public void setMasterNodeProductId(String masterNodeProductId) {
        this.masterNodeProductId = masterNodeProductId;
    }

    

    public Cluster withMasterNodeSpecId(String masterNodeSpecId) {
        this.masterNodeSpecId = masterNodeSpecId;
        return this;
    }

    


    /**
     * Master节点规格ID。
     * @return masterNodeSpecId
     */
    public String getMasterNodeSpecId() {
        return masterNodeSpecId;
    }

    public void setMasterNodeSpecId(String masterNodeSpecId) {
        this.masterNodeSpecId = masterNodeSpecId;
    }

    

    public Cluster withCoreNodeProductId(String coreNodeProductId) {
        this.coreNodeProductId = coreNodeProductId;
        return this;
    }

    


    /**
     * Core节点产品ID。
     * @return coreNodeProductId
     */
    public String getCoreNodeProductId() {
        return coreNodeProductId;
    }

    public void setCoreNodeProductId(String coreNodeProductId) {
        this.coreNodeProductId = coreNodeProductId;
    }

    

    public Cluster withCoreNodeSpecId(String coreNodeSpecId) {
        this.coreNodeSpecId = coreNodeSpecId;
        return this;
    }

    


    /**
     * Core节点规格ID。
     * @return coreNodeSpecId
     */
    public String getCoreNodeSpecId() {
        return coreNodeSpecId;
    }

    public void setCoreNodeSpecId(String coreNodeSpecId) {
        this.coreNodeSpecId = coreNodeSpecId;
    }

    

    public Cluster withMasterDataVolumeType(String masterDataVolumeType) {
        this.masterDataVolumeType = masterDataVolumeType;
        return this;
    }

    


    /**
     * Master节点数据磁盘存储类别，目前支持SATA、SAS和SSD。
     * @return masterDataVolumeType
     */
    public String getMasterDataVolumeType() {
        return masterDataVolumeType;
    }

    public void setMasterDataVolumeType(String masterDataVolumeType) {
        this.masterDataVolumeType = masterDataVolumeType;
    }

    

    public Cluster withMasterDataVolumeSize(Integer masterDataVolumeSize) {
        this.masterDataVolumeSize = masterDataVolumeSize;
        return this;
    }

    


    /**
     * Master节点数据磁盘存储空间。为增大数据存储容量，创建集群时可同时添加磁盘。 取值范围：100GB～32000GB，传值只需填数字，不需要带单位GB。
     * @return masterDataVolumeSize
     */
    public Integer getMasterDataVolumeSize() {
        return masterDataVolumeSize;
    }

    public void setMasterDataVolumeSize(Integer masterDataVolumeSize) {
        this.masterDataVolumeSize = masterDataVolumeSize;
    }

    

    public Cluster withMasterDataVolumeCount(Integer masterDataVolumeCount) {
        this.masterDataVolumeCount = masterDataVolumeCount;
        return this;
    }

    


    /**
     * Master节点数据磁盘个数。 取值只能是1
     * @return masterDataVolumeCount
     */
    public Integer getMasterDataVolumeCount() {
        return masterDataVolumeCount;
    }

    public void setMasterDataVolumeCount(Integer masterDataVolumeCount) {
        this.masterDataVolumeCount = masterDataVolumeCount;
    }

    

    public Cluster withCoreDataVolumeType(String coreDataVolumeType) {
        this.coreDataVolumeType = coreDataVolumeType;
        return this;
    }

    


    /**
     * Core节点数据磁盘存储类别，目前支持SATA、SAS和SSD。
     * @return coreDataVolumeType
     */
    public String getCoreDataVolumeType() {
        return coreDataVolumeType;
    }

    public void setCoreDataVolumeType(String coreDataVolumeType) {
        this.coreDataVolumeType = coreDataVolumeType;
    }

    

    public Cluster withCoreDataVolumeSize(Integer coreDataVolumeSize) {
        this.coreDataVolumeSize = coreDataVolumeSize;
        return this;
    }

    


    /**
     * Core节点数据磁盘存储空间。为增大数据存储容量，创建集群时可同时添加磁盘。 取值范围：100GB～32000GB，传值只需填数字，不需要带单位GB。
     * @return coreDataVolumeSize
     */
    public Integer getCoreDataVolumeSize() {
        return coreDataVolumeSize;
    }

    public void setCoreDataVolumeSize(Integer coreDataVolumeSize) {
        this.coreDataVolumeSize = coreDataVolumeSize;
    }

    

    public Cluster withCoreDataVolumeCount(Integer coreDataVolumeCount) {
        this.coreDataVolumeCount = coreDataVolumeCount;
        return this;
    }

    


    /**
     * Core节点数据磁盘个数。 取值范围：1～10
     * @return coreDataVolumeCount
     */
    public Integer getCoreDataVolumeCount() {
        return coreDataVolumeCount;
    }

    public void setCoreDataVolumeCount(Integer coreDataVolumeCount) {
        this.coreDataVolumeCount = coreDataVolumeCount;
    }

    

    public Cluster withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public Cluster withIsMrsManagerFinish(Boolean isMrsManagerFinish) {
        this.isMrsManagerFinish = isMrsManagerFinish;
        return this;
    }

    


    /**
     * 表示集群创建过程中，MRS Manager是否安装完成。 - true：安装完成 - false：安装未完成
     * @return isMrsManagerFinish
     */
    public Boolean getIsMrsManagerFinish() {
        return isMrsManagerFinish;
    }

    public void setIsMrsManagerFinish(Boolean isMrsManagerFinish) {
        this.isMrsManagerFinish = isMrsManagerFinish;
    }

    

    public Cluster withClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    


    /**
     * 集群类型。
     * @return clusterType
     */
    public Integer getClusterType() {
        return clusterType;
    }

    public void setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
    }

    

    public Cluster withLogCollection(Integer logCollection) {
        this.logCollection = logCollection;
        return this;
    }

    


    /**
     * 集群安装失败时，是否搜集日志。 - 0：不收集 - 1：收集
     * @return logCollection
     */
    public Integer getLogCollection() {
        return logCollection;
    }

    public void setLogCollection(Integer logCollection) {
        this.logCollection = logCollection;
    }

    

    public Cluster withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 区分包周期，集群是包年还是包月。 - 0：包月 - 1：包年
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    

    public Cluster withScale(String scale) {
        this.scale = scale;
        return this;
    }

    


    /**
     * 集群节点的变更状态（扩容/缩容/变更规格）。当该参数取值为空时，表示集群节点没有进行变更操作。 取值范围： - scaling-out：扩容中 - scaling-in：缩容中 - scaling-error：处于running状态，且上一次扩容/缩容/升级规格失败的集群 - scaling-up：Master节点规格升级中 - scaling_up_first：备Master节点规格升级中 - scaled_up_first：备Master节点规格升级成功 - scaled-up-success：Master节点规格升级成功
     * @return scale
     */
    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    

    public Cluster withNodeGroups(List<NodeGroupV10> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }

    
    public Cluster addNodeGroupsItem(NodeGroupV10 nodeGroupsItem) {
        if(this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        this.nodeGroups.add(nodeGroupsItem);
        return this;
    }

    public Cluster withNodeGroups(Consumer<List<NodeGroupV10>> nodeGroupsSetter) {
        if(this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        nodeGroupsSetter.accept(this.nodeGroups);
        return this;
    }

    /**
     * Master节点、Core节点和Task节点列表信息。
     * @return nodeGroups
     */
    public List<NodeGroupV10> getNodeGroups() {
        return nodeGroups;
    }

    public void setNodeGroups(List<NodeGroupV10> nodeGroups) {
        this.nodeGroups = nodeGroups;
    }

    

    public Cluster withTaskNodeGroups(List<NodeGroupV10> taskNodeGroups) {
        this.taskNodeGroups = taskNodeGroups;
        return this;
    }

    
    public Cluster addTaskNodeGroupsItem(NodeGroupV10 taskNodeGroupsItem) {
        if(this.taskNodeGroups == null) {
            this.taskNodeGroups = new ArrayList<>();
        }
        this.taskNodeGroups.add(taskNodeGroupsItem);
        return this;
    }

    public Cluster withTaskNodeGroups(Consumer<List<NodeGroupV10>> taskNodeGroupsSetter) {
        if(this.taskNodeGroups == null) {
            this.taskNodeGroups = new ArrayList<>();
        }
        taskNodeGroupsSetter.accept(this.taskNodeGroups);
        return this;
    }

    /**
     * Task节点列表信息。
     * @return taskNodeGroups
     */
    public List<NodeGroupV10> getTaskNodeGroups() {
        return taskNodeGroups;
    }

    public void setTaskNodeGroups(List<NodeGroupV10> taskNodeGroups) {
        this.taskNodeGroups = taskNodeGroups;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cluster cluster = (Cluster) o;
        return Objects.equals(this.clusterId, cluster.clusterId) &&
            Objects.equals(this.clusterName, cluster.clusterName) &&
            Objects.equals(this.totalNodeNum, cluster.totalNodeNum) &&
            Objects.equals(this.clusterState, cluster.clusterState) &&
            Objects.equals(this.stageDesc, cluster.stageDesc) &&
            Objects.equals(this.createAt, cluster.createAt) &&
            Objects.equals(this.updateAt, cluster.updateAt) &&
            Objects.equals(this.chargingStartTime, cluster.chargingStartTime) &&
            Objects.equals(this.billingType, cluster.billingType) &&
            Objects.equals(this.dataCenter, cluster.dataCenter) &&
            Objects.equals(this.vpc, cluster.vpc) &&
            Objects.equals(this.vpcId, cluster.vpcId) &&
            Objects.equals(this.duration, cluster.duration) &&
            Objects.equals(this.fee, cluster.fee) &&
            Objects.equals(this.hadoopVersion, cluster.hadoopVersion) &&
            Objects.equals(this.componentList, cluster.componentList) &&
            Objects.equals(this.externalIp, cluster.externalIp) &&
            Objects.equals(this.externalAlternateIp, cluster.externalAlternateIp) &&
            Objects.equals(this.internalIp, cluster.internalIp) &&
            Objects.equals(this.deploymentId, cluster.deploymentId) &&
            Objects.equals(this.remark, cluster.remark) &&
            Objects.equals(this.orderId, cluster.orderId) &&
            Objects.equals(this.azId, cluster.azId) &&
            Objects.equals(this.azName, cluster.azName) &&
            Objects.equals(this.azCode, cluster.azCode) &&
            Objects.equals(this.availabilityZoneId, cluster.availabilityZoneId) &&
            Objects.equals(this.instanceId, cluster.instanceId) &&
            Objects.equals(this.vnc, cluster.vnc) &&
            Objects.equals(this.tenantId, cluster.tenantId) &&
            Objects.equals(this.volumeSize, cluster.volumeSize) &&
            Objects.equals(this.volumeType, cluster.volumeType) &&
            Objects.equals(this.subnetId, cluster.subnetId) &&
            Objects.equals(this.subnetName, cluster.subnetName) &&
            Objects.equals(this.securityGroupsId, cluster.securityGroupsId) &&
            Objects.equals(this.slaveSecurityGroupsId, cluster.slaveSecurityGroupsId) &&
            Objects.equals(this.bootstrapScripts, cluster.bootstrapScripts) &&
            Objects.equals(this.safeMode, cluster.safeMode) &&
            Objects.equals(this.clusterVersion, cluster.clusterVersion) &&
            Objects.equals(this.nodePublicCertName, cluster.nodePublicCertName) &&
            Objects.equals(this.masterNodeIp, cluster.masterNodeIp) &&
            Objects.equals(this.privateIpFirst, cluster.privateIpFirst) &&
            Objects.equals(this.errorInfo, cluster.errorInfo) &&
            Objects.equals(this.tags, cluster.tags) &&
            Objects.equals(this.masterNodeNum, cluster.masterNodeNum) &&
            Objects.equals(this.coreNodeNum, cluster.coreNodeNum) &&
            Objects.equals(this.masterNodeSize, cluster.masterNodeSize) &&
            Objects.equals(this.coreNodeSize, cluster.coreNodeSize) &&
            Objects.equals(this.masterNodeProductId, cluster.masterNodeProductId) &&
            Objects.equals(this.masterNodeSpecId, cluster.masterNodeSpecId) &&
            Objects.equals(this.coreNodeProductId, cluster.coreNodeProductId) &&
            Objects.equals(this.coreNodeSpecId, cluster.coreNodeSpecId) &&
            Objects.equals(this.masterDataVolumeType, cluster.masterDataVolumeType) &&
            Objects.equals(this.masterDataVolumeSize, cluster.masterDataVolumeSize) &&
            Objects.equals(this.masterDataVolumeCount, cluster.masterDataVolumeCount) &&
            Objects.equals(this.coreDataVolumeType, cluster.coreDataVolumeType) &&
            Objects.equals(this.coreDataVolumeSize, cluster.coreDataVolumeSize) &&
            Objects.equals(this.coreDataVolumeCount, cluster.coreDataVolumeCount) &&
            Objects.equals(this.enterpriseProjectId, cluster.enterpriseProjectId) &&
            Objects.equals(this.isMrsManagerFinish, cluster.isMrsManagerFinish) &&
            Objects.equals(this.clusterType, cluster.clusterType) &&
            Objects.equals(this.logCollection, cluster.logCollection) &&
            Objects.equals(this.periodType, cluster.periodType) &&
            Objects.equals(this.scale, cluster.scale) &&
            Objects.equals(this.nodeGroups, cluster.nodeGroups) &&
            Objects.equals(this.taskNodeGroups, cluster.taskNodeGroups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterName, totalNodeNum, clusterState, stageDesc, createAt, updateAt, chargingStartTime, billingType, dataCenter, vpc, vpcId, duration, fee, hadoopVersion, componentList, externalIp, externalAlternateIp, internalIp, deploymentId, remark, orderId, azId, azName, azCode, availabilityZoneId, instanceId, vnc, tenantId, volumeSize, volumeType, subnetId, subnetName, securityGroupsId, slaveSecurityGroupsId, bootstrapScripts, safeMode, clusterVersion, nodePublicCertName, masterNodeIp, privateIpFirst, errorInfo, tags, masterNodeNum, coreNodeNum, masterNodeSize, coreNodeSize, masterNodeProductId, masterNodeSpecId, coreNodeProductId, coreNodeSpecId, masterDataVolumeType, masterDataVolumeSize, masterDataVolumeCount, coreDataVolumeType, coreDataVolumeSize, coreDataVolumeCount, enterpriseProjectId, isMrsManagerFinish, clusterType, logCollection, periodType, scale, nodeGroups, taskNodeGroups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cluster {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    totalNodeNum: ").append(toIndentedString(totalNodeNum)).append("\n");
        sb.append("    clusterState: ").append(toIndentedString(clusterState)).append("\n");
        sb.append("    stageDesc: ").append(toIndentedString(stageDesc)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    chargingStartTime: ").append(toIndentedString(chargingStartTime)).append("\n");
        sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("    hadoopVersion: ").append(toIndentedString(hadoopVersion)).append("\n");
        sb.append("    componentList: ").append(toIndentedString(componentList)).append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalAlternateIp: ").append(toIndentedString(externalAlternateIp)).append("\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    azId: ").append(toIndentedString(azId)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    vnc: ").append(toIndentedString(vnc)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    securityGroupsId: ").append(toIndentedString(securityGroupsId)).append("\n");
        sb.append("    slaveSecurityGroupsId: ").append(toIndentedString(slaveSecurityGroupsId)).append("\n");
        sb.append("    bootstrapScripts: ").append(toIndentedString(bootstrapScripts)).append("\n");
        sb.append("    safeMode: ").append(toIndentedString(safeMode)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    nodePublicCertName: ").append(toIndentedString(nodePublicCertName)).append("\n");
        sb.append("    masterNodeIp: ").append(toIndentedString(masterNodeIp)).append("\n");
        sb.append("    privateIpFirst: ").append(toIndentedString(privateIpFirst)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    masterNodeNum: ").append(toIndentedString(masterNodeNum)).append("\n");
        sb.append("    coreNodeNum: ").append(toIndentedString(coreNodeNum)).append("\n");
        sb.append("    masterNodeSize: ").append(toIndentedString(masterNodeSize)).append("\n");
        sb.append("    coreNodeSize: ").append(toIndentedString(coreNodeSize)).append("\n");
        sb.append("    masterNodeProductId: ").append(toIndentedString(masterNodeProductId)).append("\n");
        sb.append("    masterNodeSpecId: ").append(toIndentedString(masterNodeSpecId)).append("\n");
        sb.append("    coreNodeProductId: ").append(toIndentedString(coreNodeProductId)).append("\n");
        sb.append("    coreNodeSpecId: ").append(toIndentedString(coreNodeSpecId)).append("\n");
        sb.append("    masterDataVolumeType: ").append(toIndentedString(masterDataVolumeType)).append("\n");
        sb.append("    masterDataVolumeSize: ").append(toIndentedString(masterDataVolumeSize)).append("\n");
        sb.append("    masterDataVolumeCount: ").append(toIndentedString(masterDataVolumeCount)).append("\n");
        sb.append("    coreDataVolumeType: ").append(toIndentedString(coreDataVolumeType)).append("\n");
        sb.append("    coreDataVolumeSize: ").append(toIndentedString(coreDataVolumeSize)).append("\n");
        sb.append("    coreDataVolumeCount: ").append(toIndentedString(coreDataVolumeCount)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    isMrsManagerFinish: ").append(toIndentedString(isMrsManagerFinish)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    logCollection: ").append(toIndentedString(logCollection)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
        sb.append("    nodeGroups: ").append(toIndentedString(nodeGroups)).append("\n");
        sb.append("    taskNodeGroups: ").append(toIndentedString(taskNodeGroups)).append("\n");
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

