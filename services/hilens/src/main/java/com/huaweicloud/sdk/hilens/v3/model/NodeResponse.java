package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备详情
 */
public class NodeResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_node_state")

    private String clusterNodeState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_node_type")

    private String clusterNodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_name")

    private String firmwareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_firmware_version")

    private String upgradeFirmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_status")

    private Integer firmwareStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_upgrade_record")

    private List<FirmwareUpdateRecord> firmwareUpgradeRecord = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_status")

    private String activeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_num")

    private Integer gpuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_num")

    private Integer npuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ips")

    private List<String> hostIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_num")

    private Integer deploymentNum;

    public NodeResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 设备ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 设备描述，最大长度255，不允许^, ~, ＃, $, %, &, *, <, >, (, ), [, ], {, }, ', \", \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NodeResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 产生时间，如2021-10-15 14:45:22 GMT+08:00
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public NodeResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 当该设备处于集群时，显示设备所属的集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public NodeResponse withClusterNodeState(String clusterNodeState) {
        this.clusterNodeState = clusterNodeState;
        return this;
    }

    /**
     * 设备所处集群状态，集群创建（cluster_create）、集群删除（cluster_delete）、添加集群工作节点设备（cluster_add_nodes）、删除集群工作节点设备（cluster_delete_node）、集群节点设备状态更新（cluster_node_state_update）
     * @return clusterNodeState
     */
    public String getClusterNodeState() {
        return clusterNodeState;
    }

    public void setClusterNodeState(String clusterNodeState) {
        this.clusterNodeState = clusterNodeState;
    }

    public NodeResponse withClusterNodeType(String clusterNodeType) {
        this.clusterNodeType = clusterNodeType;
        return this;
    }

    /**
     * 当该设备处于集群时，显示所属的集群设备类型。 - cluster_controller 控制设备 - cluster_worker 工作设备
     * @return clusterNodeType
     */
    public String getClusterNodeType() {
        return clusterNodeType;
    }

    public void setClusterNodeType(String clusterNodeType) {
        this.clusterNodeType = clusterNodeType;
    }

    public NodeResponse withFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }

    /**
     * 固件名称。可包含大小写字母、数字、下划线、中划线,长度不超过60字符。必须以字母开头,字母或数字结尾
     * @return firmwareName
     */
    public String getFirmwareName() {
        return firmwareName;
    }

    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    public NodeResponse withUpgradeFirmwareVersion(String upgradeFirmwareVersion) {
        this.upgradeFirmwareVersion = upgradeFirmwareVersion;
        return this;
    }

    /**
     * 固件正在升级的版本
     * @return upgradeFirmwareVersion
     */
    public String getUpgradeFirmwareVersion() {
        return upgradeFirmwareVersion;
    }

    public void setUpgradeFirmwareVersion(String upgradeFirmwareVersion) {
        this.upgradeFirmwareVersion = upgradeFirmwareVersion;
    }

    public NodeResponse withFirmwareStatus(Integer firmwareStatus) {
        this.firmwareStatus = firmwareStatus;
        return this;
    }

    /**
     * 固件升级状态，1、2、3分别代表升级中，升级失败，升级成功
     * @return firmwareStatus
     */
    public Integer getFirmwareStatus() {
        return firmwareStatus;
    }

    public void setFirmwareStatus(Integer firmwareStatus) {
        this.firmwareStatus = firmwareStatus;
    }

    public NodeResponse withFirmwareUpgradeRecord(List<FirmwareUpdateRecord> firmwareUpgradeRecord) {
        this.firmwareUpgradeRecord = firmwareUpgradeRecord;
        return this;
    }

    public NodeResponse addFirmwareUpgradeRecordItem(FirmwareUpdateRecord firmwareUpgradeRecordItem) {
        if (this.firmwareUpgradeRecord == null) {
            this.firmwareUpgradeRecord = new ArrayList<>();
        }
        this.firmwareUpgradeRecord.add(firmwareUpgradeRecordItem);
        return this;
    }

    public NodeResponse withFirmwareUpgradeRecord(Consumer<List<FirmwareUpdateRecord>> firmwareUpgradeRecordSetter) {
        if (this.firmwareUpgradeRecord == null) {
            this.firmwareUpgradeRecord = new ArrayList<>();
        }
        firmwareUpgradeRecordSetter.accept(this.firmwareUpgradeRecord);
        return this;
    }

    /**
     * Get firmwareUpgradeRecord
     * @return firmwareUpgradeRecord
     */
    public List<FirmwareUpdateRecord> getFirmwareUpgradeRecord() {
        return firmwareUpgradeRecord;
    }

    public void setFirmwareUpgradeRecord(List<FirmwareUpdateRecord> firmwareUpgradeRecord) {
        this.firmwareUpgradeRecord = firmwareUpgradeRecord;
    }

    public NodeResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 设备状态：UNCONNECTED(未注册)、RUNNING(运行中)、FAIL(故障)、STOPPED(停用)、UPGRADING(升级中)、FREEZE(冻结)
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public NodeResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 设备类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodeResponse withActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }

    /**
     * 设备激活状态，未激活（INACTIVE）和已激活（ACTIVATED）
     * @return activeStatus
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public NodeResponse withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 设备CPU个数
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public NodeResponse withGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
        return this;
    }

    /**
     * 设备GPU个数
     * @return gpuNum
     */
    public Integer getGpuNum() {
        return gpuNum;
    }

    public void setGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
    }

    public NodeResponse withNpuNum(Integer npuNum) {
        this.npuNum = npuNum;
        return this;
    }

    /**
     * 设备NPU个数
     * @return npuNum
     */
    public Integer getNpuNum() {
        return npuNum;
    }

    public void setNpuNum(Integer npuNum) {
        this.npuNum = npuNum;
    }

    public NodeResponse withHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
        return this;
    }

    public NodeResponse addHostIpsItem(String hostIpsItem) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        this.hostIps.add(hostIpsItem);
        return this;
    }

    public NodeResponse withHostIps(Consumer<List<String>> hostIpsSetter) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        hostIpsSetter.accept(this.hostIps);
        return this;
    }

    /**
     * 主机IP列表
     * @return hostIps
     */
    public List<String> getHostIps() {
        return hostIps;
    }

    public void setHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
    }

    public NodeResponse withDeploymentNum(Integer deploymentNum) {
        this.deploymentNum = deploymentNum;
        return this;
    }

    /**
     * 节点中部署的数量
     * @return deploymentNum
     */
    public Integer getDeploymentNum() {
        return deploymentNum;
    }

    public void setDeploymentNum(Integer deploymentNum) {
        this.deploymentNum = deploymentNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeResponse that = (NodeResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterNodeState, that.clusterNodeState)
            && Objects.equals(this.clusterNodeType, that.clusterNodeType)
            && Objects.equals(this.firmwareName, that.firmwareName)
            && Objects.equals(this.upgradeFirmwareVersion, that.upgradeFirmwareVersion)
            && Objects.equals(this.firmwareStatus, that.firmwareStatus)
            && Objects.equals(this.firmwareUpgradeRecord, that.firmwareUpgradeRecord)
            && Objects.equals(this.state, that.state) && Objects.equals(this.type, that.type)
            && Objects.equals(this.activeStatus, that.activeStatus) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.gpuNum, that.gpuNum) && Objects.equals(this.npuNum, that.npuNum)
            && Objects.equals(this.hostIps, that.hostIps) && Objects.equals(this.deploymentNum, that.deploymentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            clusterId,
            clusterNodeState,
            clusterNodeType,
            firmwareName,
            upgradeFirmwareVersion,
            firmwareStatus,
            firmwareUpgradeRecord,
            state,
            type,
            activeStatus,
            cpu,
            gpuNum,
            npuNum,
            hostIps,
            deploymentNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterNodeState: ").append(toIndentedString(clusterNodeState)).append("\n");
        sb.append("    clusterNodeType: ").append(toIndentedString(clusterNodeType)).append("\n");
        sb.append("    firmwareName: ").append(toIndentedString(firmwareName)).append("\n");
        sb.append("    upgradeFirmwareVersion: ").append(toIndentedString(upgradeFirmwareVersion)).append("\n");
        sb.append("    firmwareStatus: ").append(toIndentedString(firmwareStatus)).append("\n");
        sb.append("    firmwareUpgradeRecord: ").append(toIndentedString(firmwareUpgradeRecord)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    gpuNum: ").append(toIndentedString(gpuNum)).append("\n");
        sb.append("    npuNum: ").append(toIndentedString(npuNum)).append("\n");
        sb.append("    hostIps: ").append(toIndentedString(hostIps)).append("\n");
        sb.append("    deploymentNum: ").append(toIndentedString(deploymentNum)).append("\n");
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
