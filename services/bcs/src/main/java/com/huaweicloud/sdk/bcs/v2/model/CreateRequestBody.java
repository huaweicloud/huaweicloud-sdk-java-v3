package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRequestBody
 */
public class CreateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private Long versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fabric_version")

    private String fabricVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_type")

    private String blockchainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consensus")

    private String consensus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_algorithm")

    private String signAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_disk_type")

    private String evsDiskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_disk_size")

    private Long orgDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_type")

    private String databaseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_password")

    private String resourcePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderer_node_number")

    private Long ordererNodeNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_eip")

    private Boolean useEip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Long bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_new_cluster")

    private Boolean createNewCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_cluster_info")

    private CCEClusterInfo cceClusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_create_info")

    private CCECreateInfo cceCreateInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_deploy_mode")

    private Long iefDeployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_nodes_info")

    private List<IEFNode> iefNodesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_orgs")

    private List<OrgPeer> peerOrgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private List<ChannelInfoV2> channels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "couchdb_info")

    private CouchDb couchdbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turbo_info")

    private TurboInfo turboInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_info")

    private CreateRequestBodyBlockInfo blockInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_create_info")

    private KafkaCreateInfo kafkaCreateInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tc3_need")

    private Boolean tc3Need;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restful_api_support")

    private Boolean restfulApiSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_invitee")

    private Boolean isInvitee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitor_infos")

    private InvitorInfos invitorInfos;

    public CreateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 区块链服务名称，支持英文，数字，中文字符和中划线(-)，不能以中划线(-)开头，长度4-24个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRequestBody withVersionType(Long versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * BCS服务版本类型，可选：[基础版（4），专业版（2），企业版（3）](tag: hws)[基础版（4），专业版（2）](tag: hws_hk)。被邀请方创建时，和邀请方保持一致。
     * @return versionType
     */
    public Long getVersionType() {
        return versionType;
    }

    public void setVersionType(Long versionType) {
        this.versionType = versionType;
    }

    public CreateRequestBody withFabricVersion(String fabricVersion) {
        this.fabricVersion = fabricVersion;
        return this;
    }

    /**
     * Fabric版本，当前邀请方以及私有链的创建仅可选：2.2 ;被邀请方创建时，和邀请方保持一致，1.4版本服务仅支持1.15及以下版本集群. 默认值为2.2.
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
     * 区块链类型，默认私有链，可选：联盟链（union），私有链（private）。被邀请方创建时，和邀请方保持一致。
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
     * BCS服务的共识策略，Fabric1.4版本可选：测试策略（solo）、快速拜占庭容错算法（SFLIC）；Fabric2.2版本可选：raft共识算法（etcdraft）、快速拜占庭容错算法（SFLIC）。被邀请方创建时，和邀请方保持一致。
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

    public CreateRequestBody withOrgDiskSize(Long orgDiskSize) {
        this.orgDiskSize = orgDiskSize;
        return this;
    }

    /**
     * 节点组织存储容量，[基础版和专业版至少100GB，企业版至少500GB](tag: hws)[基础版和专业版至少100GB](tag: hws_hk)
     * @return orgDiskSize
     */
    public Long getOrgDiskSize() {
        return orgDiskSize;
    }

    public void setOrgDiskSize(Long orgDiskSize) {
        this.orgDiskSize = orgDiskSize;
    }

    public CreateRequestBody withDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * BCS服务数据库类型，包括文件数据库（goleveldb），NoSQL（couchdb），选择couchdb需要填写couchdb_info字段中的信息
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

    public CreateRequestBody withOrdererNodeNumber(Long ordererNodeNumber) {
        this.ordererNodeNumber = ordererNodeNumber;
        return this;
    }

    /**
     * 共识组织节点数，被邀请方创实例时可不填。购买fabric2.2服务时必填，若共识策略为Raft（CFT），节点数为3；若共识策略为快速拜占庭容错共识算法（FBFT），节点数为4。
     * @return ordererNodeNumber
     */
    public Long getOrdererNodeNumber() {
        return ordererNodeNumber;
    }

    public void setOrdererNodeNumber(Long ordererNodeNumber) {
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

    public CreateRequestBody withBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 弹性IP带宽
     * @return bandwidthSize
     */
    public Long getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public CreateRequestBody withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型，可选：CCE集群 [,边缘集群ief](tag:hasief)。
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
     * 是否创建新集群，使用已有集群需要填写cce_cluster_info字段中的信息，创建新集群需要填写cce_create_info字段中的信息
     * @return createNewCluster
     */
    public Boolean getCreateNewCluster() {
        return createNewCluster;
    }

    public void setCreateNewCluster(Boolean createNewCluster) {
        this.createNewCluster = createNewCluster;
    }

    public CreateRequestBody withCceClusterInfo(CCEClusterInfo cceClusterInfo) {
        this.cceClusterInfo = cceClusterInfo;
        return this;
    }

    public CreateRequestBody withCceClusterInfo(Consumer<CCEClusterInfo> cceClusterInfoSetter) {
        if (this.cceClusterInfo == null) {
            this.cceClusterInfo = new CCEClusterInfo();
            cceClusterInfoSetter.accept(this.cceClusterInfo);
        }

        return this;
    }

    /**
     * Get cceClusterInfo
     * @return cceClusterInfo
     */
    public CCEClusterInfo getCceClusterInfo() {
        return cceClusterInfo;
    }

    public void setCceClusterInfo(CCEClusterInfo cceClusterInfo) {
        this.cceClusterInfo = cceClusterInfo;
    }

    public CreateRequestBody withCceCreateInfo(CCECreateInfo cceCreateInfo) {
        this.cceCreateInfo = cceCreateInfo;
        return this;
    }

    public CreateRequestBody withCceCreateInfo(Consumer<CCECreateInfo> cceCreateInfoSetter) {
        if (this.cceCreateInfo == null) {
            this.cceCreateInfo = new CCECreateInfo();
            cceCreateInfoSetter.accept(this.cceCreateInfo);
        }

        return this;
    }

    /**
     * Get cceCreateInfo
     * @return cceCreateInfo
     */
    public CCECreateInfo getCceCreateInfo() {
        return cceCreateInfo;
    }

    public void setCceCreateInfo(CCECreateInfo cceCreateInfo) {
        this.cceCreateInfo = cceCreateInfo;
    }

    public CreateRequestBody withIefDeployMode(Long iefDeployMode) {
        this.iefDeployMode = iefDeployMode;
        return this;
    }

    /**
     * IEF集群部署方式，随机部署（0），组织节点绑定（1）。组织节点绑定模式时，peer_orgs 参数必填。组织名和IEF节点名必须一致。
     * @return iefDeployMode
     */
    public Long getIefDeployMode() {
        return iefDeployMode;
    }

    public void setIefDeployMode(Long iefDeployMode) {
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
        if (this.iefNodesInfo == null) {
            this.iefNodesInfo = new ArrayList<>();
        }
        iefNodesInfoSetter.accept(this.iefNodesInfo);
        return this;
    }

    /**
     * IEF集群节点列表，使用边缘集群模式部署时必填。
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
        if (this.peerOrgs == null) {
            this.peerOrgs = new ArrayList<>();
        }
        peerOrgsSetter.accept(this.peerOrgs);
        return this;
    }

    /**
     * 节点组织列表。节点绑定模式中，组织名和IEF节点名必须一致。边缘集群模式时此字段必填。
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
        if (this.channels == null) {
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

    public CreateRequestBody withCouchdbInfo(CouchDb couchdbInfo) {
        this.couchdbInfo = couchdbInfo;
        return this;
    }

    public CreateRequestBody withCouchdbInfo(Consumer<CouchDb> couchdbInfoSetter) {
        if (this.couchdbInfo == null) {
            this.couchdbInfo = new CouchDb();
            couchdbInfoSetter.accept(this.couchdbInfo);
        }

        return this;
    }

    /**
     * Get couchdbInfo
     * @return couchdbInfo
     */
    public CouchDb getCouchdbInfo() {
        return couchdbInfo;
    }

    public void setCouchdbInfo(CouchDb couchdbInfo) {
        this.couchdbInfo = couchdbInfo;
    }

    public CreateRequestBody withTurboInfo(TurboInfo turboInfo) {
        this.turboInfo = turboInfo;
        return this;
    }

    public CreateRequestBody withTurboInfo(Consumer<TurboInfo> turboInfoSetter) {
        if (this.turboInfo == null) {
            this.turboInfo = new TurboInfo();
            turboInfoSetter.accept(this.turboInfo);
        }

        return this;
    }

    /**
     * Get turboInfo
     * @return turboInfo
     */
    public TurboInfo getTurboInfo() {
        return turboInfo;
    }

    public void setTurboInfo(TurboInfo turboInfo) {
        this.turboInfo = turboInfo;
    }

    public CreateRequestBody withBlockInfo(CreateRequestBodyBlockInfo blockInfo) {
        this.blockInfo = blockInfo;
        return this;
    }

    public CreateRequestBody withBlockInfo(Consumer<CreateRequestBodyBlockInfo> blockInfoSetter) {
        if (this.blockInfo == null) {
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

    public CreateRequestBody withKafkaCreateInfo(KafkaCreateInfo kafkaCreateInfo) {
        this.kafkaCreateInfo = kafkaCreateInfo;
        return this;
    }

    public CreateRequestBody withKafkaCreateInfo(Consumer<KafkaCreateInfo> kafkaCreateInfoSetter) {
        if (this.kafkaCreateInfo == null) {
            this.kafkaCreateInfo = new KafkaCreateInfo();
            kafkaCreateInfoSetter.accept(this.kafkaCreateInfo);
        }

        return this;
    }

    /**
     * Get kafkaCreateInfo
     * @return kafkaCreateInfo
     */
    public KafkaCreateInfo getKafkaCreateInfo() {
        return kafkaCreateInfo;
    }

    public void setKafkaCreateInfo(KafkaCreateInfo kafkaCreateInfo) {
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
     * 是否是创建被邀请方BCS服务实例，创建被邀请方实例需要同时填写invitor_infos字段中的信息
     * @return isInvitee
     */
    public Boolean getIsInvitee() {
        return isInvitee;
    }

    public void setIsInvitee(Boolean isInvitee) {
        this.isInvitee = isInvitee;
    }

    public CreateRequestBody withInvitorInfos(InvitorInfos invitorInfos) {
        this.invitorInfos = invitorInfos;
        return this;
    }

    public CreateRequestBody withInvitorInfos(Consumer<InvitorInfos> invitorInfosSetter) {
        if (this.invitorInfos == null) {
            this.invitorInfos = new InvitorInfos();
            invitorInfosSetter.accept(this.invitorInfos);
        }

        return this;
    }

    /**
     * Get invitorInfos
     * @return invitorInfos
     */
    public InvitorInfos getInvitorInfos() {
        return invitorInfos;
    }

    public void setInvitorInfos(InvitorInfos invitorInfos) {
        this.invitorInfos = invitorInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRequestBody that = (CreateRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.versionType, that.versionType)
            && Objects.equals(this.fabricVersion, that.fabricVersion)
            && Objects.equals(this.blockchainType, that.blockchainType)
            && Objects.equals(this.consensus, that.consensus) && Objects.equals(this.signAlgorithm, that.signAlgorithm)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.evsDiskType, that.evsDiskType)
            && Objects.equals(this.orgDiskSize, that.orgDiskSize)
            && Objects.equals(this.databaseType, that.databaseType)
            && Objects.equals(this.resourcePassword, that.resourcePassword)
            && Objects.equals(this.ordererNodeNumber, that.ordererNodeNumber)
            && Objects.equals(this.useEip, that.useEip) && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.createNewCluster, that.createNewCluster)
            && Objects.equals(this.cceClusterInfo, that.cceClusterInfo)
            && Objects.equals(this.cceCreateInfo, that.cceCreateInfo)
            && Objects.equals(this.iefDeployMode, that.iefDeployMode)
            && Objects.equals(this.iefNodesInfo, that.iefNodesInfo) && Objects.equals(this.peerOrgs, that.peerOrgs)
            && Objects.equals(this.channels, that.channels) && Objects.equals(this.couchdbInfo, that.couchdbInfo)
            && Objects.equals(this.turboInfo, that.turboInfo) && Objects.equals(this.blockInfo, that.blockInfo)
            && Objects.equals(this.kafkaCreateInfo, that.kafkaCreateInfo) && Objects.equals(this.tc3Need, that.tc3Need)
            && Objects.equals(this.restfulApiSupport, that.restfulApiSupport)
            && Objects.equals(this.isInvitee, that.isInvitee) && Objects.equals(this.invitorInfos, that.invitorInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            versionType,
            fabricVersion,
            blockchainType,
            consensus,
            signAlgorithm,
            enterpriseProjectId,
            volumeType,
            evsDiskType,
            orgDiskSize,
            databaseType,
            resourcePassword,
            ordererNodeNumber,
            useEip,
            bandwidthSize,
            clusterType,
            createNewCluster,
            cceClusterInfo,
            cceCreateInfo,
            iefDeployMode,
            iefNodesInfo,
            peerOrgs,
            channels,
            couchdbInfo,
            turboInfo,
            blockInfo,
            kafkaCreateInfo,
            tc3Need,
            restfulApiSupport,
            isInvitee,
            invitorInfos);
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
