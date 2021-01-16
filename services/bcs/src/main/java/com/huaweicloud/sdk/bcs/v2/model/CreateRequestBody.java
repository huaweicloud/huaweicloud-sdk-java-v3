package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.ChannelInfoV2;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBodyBlockInfo;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBodyCceClusterInfo;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBodyCceCreateInfo;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBodyCouchdbInfo;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBodyInvitorInfos;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBodyKafkaCreateInfo;
import com.huaweicloud.sdk.bcs.v2.model.CreateRequestBodyTurboInfo;
import com.huaweicloud.sdk.bcs.v2.model.IEFNode;
import com.huaweicloud.sdk.bcs.v2.model.OrgPeer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateRequestBody
 */
public class CreateRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_type")
    
    private Integer versionType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fabric_version")
    
    private String fabricVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blockchain_type")
    
    private String blockchainType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consensus")
    
    private String consensus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_algorithm")
    
    private String signAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private String volumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="evs_disk_type")
    
    private String evsDiskType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="org_disk_size")
    
    private Integer orgDiskSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_type")
    
    private String databaseType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_password")
    
    private String resourcePassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="orderer_node_number")
    
    private Integer ordererNodeNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="use_eip")
    
    private Boolean useEip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_size")
    
    private Integer bandwidthSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_type")
    
    private String clusterType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_new_cluster")
    
    private Boolean createNewCluster;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cce_cluster_info")
    
    private CreateRequestBodyCceClusterInfo cceClusterInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cce_create_info")
    
    private CreateRequestBodyCceCreateInfo cceCreateInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ief_deploy_mode")
    
    private Integer iefDeployMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ief_nodes_info")
    
    private List<IEFNode> iefNodesInfo = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peer_orgs")
    
    private List<OrgPeer> peerOrgs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channels")
    
    private List<ChannelInfoV2> channels = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="couchdb_info")
    
    private CreateRequestBodyCouchdbInfo couchdbInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="turbo_info")
    
    private CreateRequestBodyTurboInfo turboInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="block_info")
    
    private CreateRequestBodyBlockInfo blockInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_create_info")
    
    private CreateRequestBodyKafkaCreateInfo kafkaCreateInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tc3_need")
    
    private Boolean tc3Need;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restful_api_support")
    
    private Boolean restfulApiSupport;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_invitee")
    
    private Boolean isInvitee;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitor_infos")
    
    private CreateRequestBodyInvitorInfos invitorInfos = null;

    public CreateRequestBody withName(String name) {
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

    public CreateRequestBody withVersionType(Integer versionType) {
        this.versionType = versionType;
        return this;
    }

    


    /**
     * BCS服务版本类型，可选：基础版（1），专业版（4），企业版（2），铂金版（3）
     * @return versionType
     */
    public Integer getVersionType() {
        return versionType;
    }

    public void setVersionType(Integer versionType) {
        this.versionType = versionType;
    }

    public CreateRequestBody withFabricVersion(String fabricVersion) {
        this.fabricVersion = fabricVersion;
        return this;
    }

    


    /**
     * Fabric版本，可选：\"1.4\"，\"2.0\"。目前HCS只支持1.4
     * @return fabricVersion
     */
    public String getFabricVersion() {
        return fabricVersion;
    }

    public void setFabricVersion(String fabricVersion) {
        this.fabricVersion = fabricVersion;
    }

    public CreateRequestBody withBlockchainType(String blockchainType) {
        this.blockchainType = blockchainType;
        return this;
    }

    


    /**
     * 区块链类型，可选：联盟链（union），私有链（private）
     * @return blockchainType
     */
    public String getBlockchainType() {
        return blockchainType;
    }

    public void setBlockchainType(String blockchainType) {
        this.blockchainType = blockchainType;
    }

    public CreateRequestBody withConsensus(String consensus) {
        this.consensus = consensus;
        return this;
    }

    


    /**
     * BCS服务的共识策略，可选：（etcdraft,1.4版本不支持raft共识算法）、快速拜占庭容错算法（SFLIC）、测试策略（solo）、Kafka共识（kafka）
     * @return consensus
     */
    public String getConsensus() {
        return consensus;
    }

    public void setConsensus(String consensus) {
        this.consensus = consensus;
    }

    public CreateRequestBody withSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
        return this;
    }

    


    /**
     * BCS服务安全机制，可选：ECDSA（ECDSA），国密算法（sm2）
     * @return signAlgorithm
     */
    public String getSignAlgorithm() {
        return signAlgorithm;
    }

    public void setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
    }

    public CreateRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * BCS服务所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateRequestBody withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * CCE集群存储卷类型，根据实际环境可选：云硬盘存储卷（evs），文件存储卷（nfs）, 极速文件存储卷（efs）
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public CreateRequestBody withEvsDiskType(String evsDiskType) {
        this.evsDiskType = evsDiskType;
        return this;
    }

    


    /**
     * 云硬盘存储卷类型，volume_type选择evs时必填，可选：普通I/O（SATA），高I/O（SAS），超高I/O（SSD）
     * @return evsDiskType
     */
    public String getEvsDiskType() {
        return evsDiskType;
    }

    public void setEvsDiskType(String evsDiskType) {
        this.evsDiskType = evsDiskType;
    }

    public CreateRequestBody withOrgDiskSize(Integer orgDiskSize) {
        this.orgDiskSize = orgDiskSize;
        return this;
    }

    


    /**
     * [节点组织存储容量，基础版至少40GB，专业版和企业版至少100GB，铂金版至少500GB](tag:online)[节点组织存储容量GB，至少为100GB](tag:hcs)
     * @return orgDiskSize
     */
    public Integer getOrgDiskSize() {
        return orgDiskSize;
    }

    public void setOrgDiskSize(Integer orgDiskSize) {
        this.orgDiskSize = orgDiskSize;
    }

    public CreateRequestBody withDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    


    /**
     * BCS服务数据库类型，包括文件数据库（goleveldb），NoSQL（couchdb）
     * @return databaseType
     */
    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public CreateRequestBody withResourcePassword(String resourcePassword) {
        this.resourcePassword = resourcePassword;
        return this;
    }

    


    /**
     * BCS服务资源、区块链管理密码
     * @return resourcePassword
     */
    public String getResourcePassword() {
        return resourcePassword;
    }

    public void setResourcePassword(String resourcePassword) {
        this.resourcePassword = resourcePassword;
    }

    public CreateRequestBody withOrdererNodeNumber(Integer ordererNodeNumber) {
        this.ordererNodeNumber = ordererNodeNumber;
        return this;
    }

    


    /**
     * 共识组织节点数，被邀请方创实例时可不填
     * @return ordererNodeNumber
     */
    public Integer getOrdererNodeNumber() {
        return ordererNodeNumber;
    }

    public void setOrdererNodeNumber(Integer ordererNodeNumber) {
        this.ordererNodeNumber = ordererNodeNumber;
    }

    public CreateRequestBody withUseEip(Boolean useEip) {
        this.useEip = useEip;
        return this;
    }

    


    /**
     * 是否使用集群节点弹性IP
     * @return useEip
     */
    public Boolean getUseEip() {
        return useEip;
    }

    public void setUseEip(Boolean useEip) {
        this.useEip = useEip;
    }

    public CreateRequestBody withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    


    /**
     * 弹性IP带宽
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public CreateRequestBody withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    


    /**
     * 集群类型，[可选：CCE集群（cce），边缘集群（ief）](tag:online)[目前线下混合云模式下只支持CCE集群](tag:hcs)
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public CreateRequestBody withCreateNewCluster(Boolean createNewCluster) {
        this.createNewCluster = createNewCluster;
        return this;
    }

    


    /**
     * 是否创建新集群
     * @return createNewCluster
     */
    public Boolean getCreateNewCluster() {
        return createNewCluster;
    }

    public void setCreateNewCluster(Boolean createNewCluster) {
        this.createNewCluster = createNewCluster;
    }

    public CreateRequestBody withCceClusterInfo(CreateRequestBodyCceClusterInfo cceClusterInfo) {
        this.cceClusterInfo = cceClusterInfo;
        return this;
    }

    public CreateRequestBody withCceClusterInfo(Consumer<CreateRequestBodyCceClusterInfo> cceClusterInfoSetter) {
        if(this.cceClusterInfo == null ){
            this.cceClusterInfo = new CreateRequestBodyCceClusterInfo();
            cceClusterInfoSetter.accept(this.cceClusterInfo);
        }
        
        return this;
    }


    /**
     * Get cceClusterInfo
     * @return cceClusterInfo
     */
    public CreateRequestBodyCceClusterInfo getCceClusterInfo() {
        return cceClusterInfo;
    }

    public void setCceClusterInfo(CreateRequestBodyCceClusterInfo cceClusterInfo) {
        this.cceClusterInfo = cceClusterInfo;
    }

    public CreateRequestBody withCceCreateInfo(CreateRequestBodyCceCreateInfo cceCreateInfo) {
        this.cceCreateInfo = cceCreateInfo;
        return this;
    }

    public CreateRequestBody withCceCreateInfo(Consumer<CreateRequestBodyCceCreateInfo> cceCreateInfoSetter) {
        if(this.cceCreateInfo == null ){
            this.cceCreateInfo = new CreateRequestBodyCceCreateInfo();
            cceCreateInfoSetter.accept(this.cceCreateInfo);
        }
        
        return this;
    }


    /**
     * Get cceCreateInfo
     * @return cceCreateInfo
     */
    public CreateRequestBodyCceCreateInfo getCceCreateInfo() {
        return cceCreateInfo;
    }

    public void setCceCreateInfo(CreateRequestBodyCceCreateInfo cceCreateInfo) {
        this.cceCreateInfo = cceCreateInfo;
    }

    public CreateRequestBody withIefDeployMode(Integer iefDeployMode) {
        this.iefDeployMode = iefDeployMode;
        return this;
    }

    


    /**
     * IEF集群部署方式，随机部署（0），组织节点绑定（1）
     * @return iefDeployMode
     */
    public Integer getIefDeployMode() {
        return iefDeployMode;
    }

    public void setIefDeployMode(Integer iefDeployMode) {
        this.iefDeployMode = iefDeployMode;
    }

    public CreateRequestBody withIefNodesInfo(List<IEFNode> iefNodesInfo) {
        this.iefNodesInfo = iefNodesInfo;
        return this;
    }

    
    public CreateRequestBody addIefNodesInfoItem(IEFNode iefNodesInfoItem) {
        if (this.iefNodesInfo == null) {
            this.iefNodesInfo = new ArrayList<>();
        }
        this.iefNodesInfo.add(iefNodesInfoItem);
        return this;
    }

    public CreateRequestBody withIefNodesInfo(Consumer<List<IEFNode>> iefNodesInfoSetter) {
        if(this.iefNodesInfo == null ){
            this.iefNodesInfo = new ArrayList<>();
        }
        iefNodesInfoSetter.accept(this.iefNodesInfo);
        return this;
    }

    /**
     * IEF集群节点列表
     * @return iefNodesInfo
     */
    public List<IEFNode> getIefNodesInfo() {
        return iefNodesInfo;
    }

    public void setIefNodesInfo(List<IEFNode> iefNodesInfo) {
        this.iefNodesInfo = iefNodesInfo;
    }

    public CreateRequestBody withPeerOrgs(List<OrgPeer> peerOrgs) {
        this.peerOrgs = peerOrgs;
        return this;
    }

    
    public CreateRequestBody addPeerOrgsItem(OrgPeer peerOrgsItem) {
        if (this.peerOrgs == null) {
            this.peerOrgs = new ArrayList<>();
        }
        this.peerOrgs.add(peerOrgsItem);
        return this;
    }

    public CreateRequestBody withPeerOrgs(Consumer<List<OrgPeer>> peerOrgsSetter) {
        if(this.peerOrgs == null ){
            this.peerOrgs = new ArrayList<>();
        }
        peerOrgsSetter.accept(this.peerOrgs);
        return this;
    }

    /**
     * 节点组织列表
     * @return peerOrgs
     */
    public List<OrgPeer> getPeerOrgs() {
        return peerOrgs;
    }

    public void setPeerOrgs(List<OrgPeer> peerOrgs) {
        this.peerOrgs = peerOrgs;
    }

    public CreateRequestBody withChannels(List<ChannelInfoV2> channels) {
        this.channels = channels;
        return this;
    }

    
    public CreateRequestBody addChannelsItem(ChannelInfoV2 channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    public CreateRequestBody withChannels(Consumer<List<ChannelInfoV2>> channelsSetter) {
        if(this.channels == null ){
            this.channels = new ArrayList<>();
        }
        channelsSetter.accept(this.channels);
        return this;
    }

    /**
     * 通道列表
     * @return channels
     */
    public List<ChannelInfoV2> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelInfoV2> channels) {
        this.channels = channels;
    }

    public CreateRequestBody withCouchdbInfo(CreateRequestBodyCouchdbInfo couchdbInfo) {
        this.couchdbInfo = couchdbInfo;
        return this;
    }

    public CreateRequestBody withCouchdbInfo(Consumer<CreateRequestBodyCouchdbInfo> couchdbInfoSetter) {
        if(this.couchdbInfo == null ){
            this.couchdbInfo = new CreateRequestBodyCouchdbInfo();
            couchdbInfoSetter.accept(this.couchdbInfo);
        }
        
        return this;
    }


    /**
     * Get couchdbInfo
     * @return couchdbInfo
     */
    public CreateRequestBodyCouchdbInfo getCouchdbInfo() {
        return couchdbInfo;
    }

    public void setCouchdbInfo(CreateRequestBodyCouchdbInfo couchdbInfo) {
        this.couchdbInfo = couchdbInfo;
    }

    public CreateRequestBody withTurboInfo(CreateRequestBodyTurboInfo turboInfo) {
        this.turboInfo = turboInfo;
        return this;
    }

    public CreateRequestBody withTurboInfo(Consumer<CreateRequestBodyTurboInfo> turboInfoSetter) {
        if(this.turboInfo == null ){
            this.turboInfo = new CreateRequestBodyTurboInfo();
            turboInfoSetter.accept(this.turboInfo);
        }
        
        return this;
    }


    /**
     * Get turboInfo
     * @return turboInfo
     */
    public CreateRequestBodyTurboInfo getTurboInfo() {
        return turboInfo;
    }

    public void setTurboInfo(CreateRequestBodyTurboInfo turboInfo) {
        this.turboInfo = turboInfo;
    }

    public CreateRequestBody withBlockInfo(CreateRequestBodyBlockInfo blockInfo) {
        this.blockInfo = blockInfo;
        return this;
    }

    public CreateRequestBody withBlockInfo(Consumer<CreateRequestBodyBlockInfo> blockInfoSetter) {
        if(this.blockInfo == null ){
            this.blockInfo = new CreateRequestBodyBlockInfo();
            blockInfoSetter.accept(this.blockInfo);
        }
        
        return this;
    }


    /**
     * Get blockInfo
     * @return blockInfo
     */
    public CreateRequestBodyBlockInfo getBlockInfo() {
        return blockInfo;
    }

    public void setBlockInfo(CreateRequestBodyBlockInfo blockInfo) {
        this.blockInfo = blockInfo;
    }

    public CreateRequestBody withKafkaCreateInfo(CreateRequestBodyKafkaCreateInfo kafkaCreateInfo) {
        this.kafkaCreateInfo = kafkaCreateInfo;
        return this;
    }

    public CreateRequestBody withKafkaCreateInfo(Consumer<CreateRequestBodyKafkaCreateInfo> kafkaCreateInfoSetter) {
        if(this.kafkaCreateInfo == null ){
            this.kafkaCreateInfo = new CreateRequestBodyKafkaCreateInfo();
            kafkaCreateInfoSetter.accept(this.kafkaCreateInfo);
        }
        
        return this;
    }


    /**
     * Get kafkaCreateInfo
     * @return kafkaCreateInfo
     */
    public CreateRequestBodyKafkaCreateInfo getKafkaCreateInfo() {
        return kafkaCreateInfo;
    }

    public void setKafkaCreateInfo(CreateRequestBodyKafkaCreateInfo kafkaCreateInfo) {
        this.kafkaCreateInfo = kafkaCreateInfo;
    }

    public CreateRequestBody withTc3Need(Boolean tc3Need) {
        this.tc3Need = tc3Need;
        return this;
    }

    


    /**
     * 是否添加可信计算平台
     * @return tc3Need
     */
    public Boolean getTc3Need() {
        return tc3Need;
    }

    public void setTc3Need(Boolean tc3Need) {
        this.tc3Need = tc3Need;
    }

    public CreateRequestBody withRestfulApiSupport(Boolean restfulApiSupport) {
        this.restfulApiSupport = restfulApiSupport;
        return this;
    }

    


    /**
     * 是否添加restful API支持
     * @return restfulApiSupport
     */
    public Boolean getRestfulApiSupport() {
        return restfulApiSupport;
    }

    public void setRestfulApiSupport(Boolean restfulApiSupport) {
        this.restfulApiSupport = restfulApiSupport;
    }

    public CreateRequestBody withIsInvitee(Boolean isInvitee) {
        this.isInvitee = isInvitee;
        return this;
    }

    


    /**
     * 是否是被邀请方创建实例
     * @return isInvitee
     */
    public Boolean getIsInvitee() {
        return isInvitee;
    }

    public void setIsInvitee(Boolean isInvitee) {
        this.isInvitee = isInvitee;
    }

    public CreateRequestBody withInvitorInfos(CreateRequestBodyInvitorInfos invitorInfos) {
        this.invitorInfos = invitorInfos;
        return this;
    }

    public CreateRequestBody withInvitorInfos(Consumer<CreateRequestBodyInvitorInfos> invitorInfosSetter) {
        if(this.invitorInfos == null ){
            this.invitorInfos = new CreateRequestBodyInvitorInfos();
            invitorInfosSetter.accept(this.invitorInfos);
        }
        
        return this;
    }


    /**
     * Get invitorInfos
     * @return invitorInfos
     */
    public CreateRequestBodyInvitorInfos getInvitorInfos() {
        return invitorInfos;
    }

    public void setInvitorInfos(CreateRequestBodyInvitorInfos invitorInfos) {
        this.invitorInfos = invitorInfos;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRequestBody createRequestBody = (CreateRequestBody) o;
        return Objects.equals(this.name, createRequestBody.name) &&
            Objects.equals(this.versionType, createRequestBody.versionType) &&
            Objects.equals(this.fabricVersion, createRequestBody.fabricVersion) &&
            Objects.equals(this.blockchainType, createRequestBody.blockchainType) &&
            Objects.equals(this.consensus, createRequestBody.consensus) &&
            Objects.equals(this.signAlgorithm, createRequestBody.signAlgorithm) &&
            Objects.equals(this.enterpriseProjectId, createRequestBody.enterpriseProjectId) &&
            Objects.equals(this.volumeType, createRequestBody.volumeType) &&
            Objects.equals(this.evsDiskType, createRequestBody.evsDiskType) &&
            Objects.equals(this.orgDiskSize, createRequestBody.orgDiskSize) &&
            Objects.equals(this.databaseType, createRequestBody.databaseType) &&
            Objects.equals(this.resourcePassword, createRequestBody.resourcePassword) &&
            Objects.equals(this.ordererNodeNumber, createRequestBody.ordererNodeNumber) &&
            Objects.equals(this.useEip, createRequestBody.useEip) &&
            Objects.equals(this.bandwidthSize, createRequestBody.bandwidthSize) &&
            Objects.equals(this.clusterType, createRequestBody.clusterType) &&
            Objects.equals(this.createNewCluster, createRequestBody.createNewCluster) &&
            Objects.equals(this.cceClusterInfo, createRequestBody.cceClusterInfo) &&
            Objects.equals(this.cceCreateInfo, createRequestBody.cceCreateInfo) &&
            Objects.equals(this.iefDeployMode, createRequestBody.iefDeployMode) &&
            Objects.equals(this.iefNodesInfo, createRequestBody.iefNodesInfo) &&
            Objects.equals(this.peerOrgs, createRequestBody.peerOrgs) &&
            Objects.equals(this.channels, createRequestBody.channels) &&
            Objects.equals(this.couchdbInfo, createRequestBody.couchdbInfo) &&
            Objects.equals(this.turboInfo, createRequestBody.turboInfo) &&
            Objects.equals(this.blockInfo, createRequestBody.blockInfo) &&
            Objects.equals(this.kafkaCreateInfo, createRequestBody.kafkaCreateInfo) &&
            Objects.equals(this.tc3Need, createRequestBody.tc3Need) &&
            Objects.equals(this.restfulApiSupport, createRequestBody.restfulApiSupport) &&
            Objects.equals(this.isInvitee, createRequestBody.isInvitee) &&
            Objects.equals(this.invitorInfos, createRequestBody.invitorInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, versionType, fabricVersion, blockchainType, consensus, signAlgorithm, enterpriseProjectId, volumeType, evsDiskType, orgDiskSize, databaseType, resourcePassword, ordererNodeNumber, useEip, bandwidthSize, clusterType, createNewCluster, cceClusterInfo, cceCreateInfo, iefDeployMode, iefNodesInfo, peerOrgs, channels, couchdbInfo, turboInfo, blockInfo, kafkaCreateInfo, tc3Need, restfulApiSupport, isInvitee, invitorInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    fabricVersion: ").append(toIndentedString(fabricVersion)).append("\n");
        sb.append("    blockchainType: ").append(toIndentedString(blockchainType)).append("\n");
        sb.append("    consensus: ").append(toIndentedString(consensus)).append("\n");
        sb.append("    signAlgorithm: ").append(toIndentedString(signAlgorithm)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    evsDiskType: ").append(toIndentedString(evsDiskType)).append("\n");
        sb.append("    orgDiskSize: ").append(toIndentedString(orgDiskSize)).append("\n");
        sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
        sb.append("    resourcePassword: ").append(toIndentedString(resourcePassword)).append("\n");
        sb.append("    ordererNodeNumber: ").append(toIndentedString(ordererNodeNumber)).append("\n");
        sb.append("    useEip: ").append(toIndentedString(useEip)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    createNewCluster: ").append(toIndentedString(createNewCluster)).append("\n");
        sb.append("    cceClusterInfo: ").append(toIndentedString(cceClusterInfo)).append("\n");
        sb.append("    cceCreateInfo: ").append(toIndentedString(cceCreateInfo)).append("\n");
        sb.append("    iefDeployMode: ").append(toIndentedString(iefDeployMode)).append("\n");
        sb.append("    iefNodesInfo: ").append(toIndentedString(iefNodesInfo)).append("\n");
        sb.append("    peerOrgs: ").append(toIndentedString(peerOrgs)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    couchdbInfo: ").append(toIndentedString(couchdbInfo)).append("\n");
        sb.append("    turboInfo: ").append(toIndentedString(turboInfo)).append("\n");
        sb.append("    blockInfo: ").append(toIndentedString(blockInfo)).append("\n");
        sb.append("    kafkaCreateInfo: ").append(toIndentedString(kafkaCreateInfo)).append("\n");
        sb.append("    tc3Need: ").append(toIndentedString(tc3Need)).append("\n");
        sb.append("    restfulApiSupport: ").append(toIndentedString(restfulApiSupport)).append("\n");
        sb.append("    isInvitee: ").append(toIndentedString(isInvitee)).append("\n");
        sb.append("    invitorInfos: ").append(toIndentedString(invitorInfos)).append("\n");
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

