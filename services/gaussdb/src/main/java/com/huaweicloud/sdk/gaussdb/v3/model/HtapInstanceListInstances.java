package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HtapInstanceListInstances
 */
public class HtapInstanceListInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_state")

    private HtapInstanceListInstanceState instanceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Boolean isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private String payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alter_order_id")

    private String alterOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readable_node_infos")

    private List<ReadableNodeInfos> readableNodeInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_ips")

    private List<String> proxyIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip_v6")

    private String dataVipV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<HtapInstanceListAvailableZones> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_actions")

    private List<QueryAction> currentActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_resource_id")

    private String dedicatedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private HtapInstanceListNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ch_master_node_id")

    private String chMasterNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    public HtapInstanceListInstances withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * HTAP实例ID，严格匹配UUID规则。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HtapInstanceListInstances withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * HTAP实例名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HtapInstanceListInstances withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * HTAP数据库引擎名。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public HtapInstanceListInstances withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * HTAP数据库引擎版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public HtapInstanceListInstances withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户在某一region下的project ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HtapInstanceListInstances withInstanceState(HtapInstanceListInstanceState instanceState) {
        this.instanceState = instanceState;
        return this;
    }

    public HtapInstanceListInstances withInstanceState(Consumer<HtapInstanceListInstanceState> instanceStateSetter) {
        if (this.instanceState == null) {
            this.instanceState = new HtapInstanceListInstanceState();
            instanceStateSetter.accept(this.instanceState);
        }

        return this;
    }

    /**
     * Get instanceState
     * @return instanceState
     */
    public HtapInstanceListInstanceState getInstanceState() {
        return instanceState;
    }

    public void setInstanceState(HtapInstanceListInstanceState instanceState) {
        this.instanceState = instanceState;
    }

    public HtapInstanceListInstances withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * HTAP实例创建时间。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public HtapInstanceListInstances withIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * HTAP实例是否冻结。
     * @return isFrozen
     */
    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public HtapInstanceListInstances withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * HTAP实例部署模式。
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public HtapInstanceListInstances withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 计费模式。当前仅支持按需计费。 0：按需计费 1：包周期
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public HtapInstanceListInstances withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期计费订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public HtapInstanceListInstances withAlterOrderId(String alterOrderId) {
        this.alterOrderId = alterOrderId;
        return this;
    }

    /**
     * 包周期计费备用订单ID。
     * @return alterOrderId
     */
    public String getAlterOrderId() {
        return alterOrderId;
    }

    public void setAlterOrderId(String alterOrderId) {
        this.alterOrderId = alterOrderId;
    }

    public HtapInstanceListInstances withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * 读写内网地址。
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public HtapInstanceListInstances withReadableNodeInfos(List<ReadableNodeInfos> readableNodeInfos) {
        this.readableNodeInfos = readableNodeInfos;
        return this;
    }

    public HtapInstanceListInstances addReadableNodeInfosItem(ReadableNodeInfos readableNodeInfosItem) {
        if (this.readableNodeInfos == null) {
            this.readableNodeInfos = new ArrayList<>();
        }
        this.readableNodeInfos.add(readableNodeInfosItem);
        return this;
    }

    public HtapInstanceListInstances withReadableNodeInfos(Consumer<List<ReadableNodeInfos>> readableNodeInfosSetter) {
        if (this.readableNodeInfos == null) {
            this.readableNodeInfos = new ArrayList<>();
        }
        readableNodeInfosSetter.accept(this.readableNodeInfos);
        return this;
    }

    /**
     * 可读节点信息
     * @return readableNodeInfos
     */
    public List<ReadableNodeInfos> getReadableNodeInfos() {
        return readableNodeInfos;
    }

    public void setReadableNodeInfos(List<ReadableNodeInfos> readableNodeInfos) {
        this.readableNodeInfos = readableNodeInfos;
    }

    public HtapInstanceListInstances withProxyIps(List<String> proxyIps) {
        this.proxyIps = proxyIps;
        return this;
    }

    public HtapInstanceListInstances addProxyIpsItem(String proxyIpsItem) {
        if (this.proxyIps == null) {
            this.proxyIps = new ArrayList<>();
        }
        this.proxyIps.add(proxyIpsItem);
        return this;
    }

    public HtapInstanceListInstances withProxyIps(Consumer<List<String>> proxyIpsSetter) {
        if (this.proxyIps == null) {
            this.proxyIps = new ArrayList<>();
        }
        proxyIpsSetter.accept(this.proxyIps);
        return this;
    }

    /**
     * 代理IP。
     * @return proxyIps
     */
    public List<String> getProxyIps() {
        return proxyIps;
    }

    public void setProxyIps(List<String> proxyIps) {
        this.proxyIps = proxyIps;
    }

    public HtapInstanceListInstances withDataVipV6(String dataVipV6) {
        this.dataVipV6 = dataVipV6;
        return this;
    }

    /**
     * 读写内网地址IPV6。
     * @return dataVipV6
     */
    public String getDataVipV6() {
        return dataVipV6;
    }

    public void setDataVipV6(String dataVipV6) {
        this.dataVipV6 = dataVipV6;
    }

    public HtapInstanceListInstances withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库访问端口。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HtapInstanceListInstances withAvailableZones(List<HtapInstanceListAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public HtapInstanceListInstances addAvailableZonesItem(HtapInstanceListAvailableZones availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public HtapInstanceListInstances withAvailableZones(
        Consumer<List<HtapInstanceListAvailableZones>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区信息。
     * @return availableZones
     */
    public List<HtapInstanceListAvailableZones> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<HtapInstanceListAvailableZones> availableZones) {
        this.availableZones = availableZones;
    }

    public HtapInstanceListInstances withCurrentActions(List<QueryAction> currentActions) {
        this.currentActions = currentActions;
        return this;
    }

    public HtapInstanceListInstances addCurrentActionsItem(QueryAction currentActionsItem) {
        if (this.currentActions == null) {
            this.currentActions = new ArrayList<>();
        }
        this.currentActions.add(currentActionsItem);
        return this;
    }

    public HtapInstanceListInstances withCurrentActions(Consumer<List<QueryAction>> currentActionsSetter) {
        if (this.currentActions == null) {
            this.currentActions = new ArrayList<>();
        }
        currentActionsSetter.accept(this.currentActions);
        return this;
    }

    /**
     * 实例动作。
     * @return currentActions
     */
    public List<QueryAction> getCurrentActions() {
        return currentActions;
    }

    public void setCurrentActions(List<QueryAction> currentActions) {
        this.currentActions = currentActions;
    }

    public HtapInstanceListInstances withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 存储类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public HtapInstanceListInstances withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 服务器类型。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public HtapInstanceListInstances withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。如果帐户开通企业项目服务则该参数必选，未开启该参数不可选。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public HtapInstanceListInstances withDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
        return this;
    }

    /**
     * 专属资源池ID，只有开通专属资源池后才支持此参数。
     * @return dedicatedResourceId
     */
    public String getDedicatedResourceId() {
        return dedicatedResourceId;
    }

    public void setDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
    }

    public HtapInstanceListInstances withNetwork(HtapInstanceListNetwork network) {
        this.network = network;
        return this;
    }

    public HtapInstanceListInstances withNetwork(Consumer<HtapInstanceListNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new HtapInstanceListNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public HtapInstanceListNetwork getNetwork() {
        return network;
    }

    public void setNetwork(HtapInstanceListNetwork network) {
        this.network = network;
    }

    public HtapInstanceListInstances withChMasterNodeId(String chMasterNodeId) {
        this.chMasterNodeId = chMasterNodeId;
        return this;
    }

    /**
     * ClickHouse主节点ID。
     * @return chMasterNodeId
     */
    public String getChMasterNodeId() {
        return chMasterNodeId;
    }

    public void setChMasterNodeId(String chMasterNodeId) {
        this.chMasterNodeId = chMasterNodeId;
    }

    public HtapInstanceListInstances withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点个数。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapInstanceListInstances that = (HtapInstanceListInstances) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.instanceState, that.instanceState) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.isFrozen, that.isFrozen) && Objects.equals(this.haMode, that.haMode)
            && Objects.equals(this.payModel, that.payModel) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.alterOrderId, that.alterOrderId) && Objects.equals(this.dataVip, that.dataVip)
            && Objects.equals(this.readableNodeInfos, that.readableNodeInfos)
            && Objects.equals(this.proxyIps, that.proxyIps) && Objects.equals(this.dataVipV6, that.dataVipV6)
            && Objects.equals(this.port, that.port) && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.currentActions, that.currentActions)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.serverType, that.serverType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.dedicatedResourceId, that.dedicatedResourceId)
            && Objects.equals(this.network, that.network) && Objects.equals(this.chMasterNodeId, that.chMasterNodeId)
            && Objects.equals(this.nodeNum, that.nodeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            engineName,
            engineVersion,
            projectId,
            instanceState,
            createAt,
            isFrozen,
            haMode,
            payModel,
            orderId,
            alterOrderId,
            dataVip,
            readableNodeInfos,
            proxyIps,
            dataVipV6,
            port,
            availableZones,
            currentActions,
            volumeType,
            serverType,
            enterpriseProjectId,
            dedicatedResourceId,
            network,
            chMasterNodeId,
            nodeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapInstanceListInstances {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceState: ").append(toIndentedString(instanceState)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    alterOrderId: ").append(toIndentedString(alterOrderId)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    readableNodeInfos: ").append(toIndentedString(readableNodeInfos)).append("\n");
        sb.append("    proxyIps: ").append(toIndentedString(proxyIps)).append("\n");
        sb.append("    dataVipV6: ").append(toIndentedString(dataVipV6)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    currentActions: ").append(toIndentedString(currentActions)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    dedicatedResourceId: ").append(toIndentedString(dedicatedResourceId)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    chMasterNodeId: ").append(toIndentedString(chMasterNodeId)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
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
