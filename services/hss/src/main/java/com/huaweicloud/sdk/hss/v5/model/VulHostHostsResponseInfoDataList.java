package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulHostHostsResponseInfoDataList
 */
public class VulHostHostsResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_with_repair_priority_list")

    private List<VulHostHostsResponseInfoVulNumWithRepairPriorityList> vulNumWithRepairPriorityList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_ids_info")

    private VulHostHostsResponseInfoVulIdsInfo vulIdsInfo;

    public VulHostHostsResponseInfoDataList withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机id **取值范围**: 字符长度0-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public VulHostHostsResponseInfoDataList withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: agent id **取值范围**: 字符长度0-64位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public VulHostHostsResponseInfoDataList withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 主机名称 **取值范围**: 字符长度0-64位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public VulHostHostsResponseInfoDataList withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * **参数解释**: 地域 **取值范围**: 字符长度0-32位 
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public VulHostHostsResponseInfoDataList withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**: 服务器公网ip **取值范围**: 字符长度0-128位 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public VulHostHostsResponseInfoDataList withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 服务器私网ip **取值范围**: 字符长度0-4096位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public VulHostHostsResponseInfoDataList withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**: 服务器组id **取值范围**: 字符长度0-128位 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public VulHostHostsResponseInfoDataList withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 服务器组名称 **取值范围**: 字符长度0-256位 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public VulHostHostsResponseInfoDataList withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**: 操作系统类型 **取值范围**: - Linux ：Linux系统 - Windows ：Windows系统
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public VulHostHostsResponseInfoDataList withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**: 资产重要性 **取值范围**: 字符长度0-32位 
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public VulHostHostsResponseInfoDataList withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间 **取值范围**: 最小值0，最大值2^63-1 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public VulHostHostsResponseInfoDataList withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**: 主机风险 **取值范围**: 字符长度0-32位 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public VulHostHostsResponseInfoDataList withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释**: 主机风险分数 **取值范围**: 最小值0，最大值100 
     * minimum: 0
     * maximum: 100
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public VulHostHostsResponseInfoDataList withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 主机配额 **取值范围**: 字符长度0-64位 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VulHostHostsResponseInfoDataList withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**: 主机配额 **取值范围**: - unhandled：待处理 - handled：已处理 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public VulHostHostsResponseInfoDataList withVulNumWithRepairPriorityList(
        List<VulHostHostsResponseInfoVulNumWithRepairPriorityList> vulNumWithRepairPriorityList) {
        this.vulNumWithRepairPriorityList = vulNumWithRepairPriorityList;
        return this;
    }

    public VulHostHostsResponseInfoDataList addVulNumWithRepairPriorityListItem(
        VulHostHostsResponseInfoVulNumWithRepairPriorityList vulNumWithRepairPriorityListItem) {
        if (this.vulNumWithRepairPriorityList == null) {
            this.vulNumWithRepairPriorityList = new ArrayList<>();
        }
        this.vulNumWithRepairPriorityList.add(vulNumWithRepairPriorityListItem);
        return this;
    }

    public VulHostHostsResponseInfoDataList withVulNumWithRepairPriorityList(
        Consumer<List<VulHostHostsResponseInfoVulNumWithRepairPriorityList>> vulNumWithRepairPriorityListSetter) {
        if (this.vulNumWithRepairPriorityList == null) {
            this.vulNumWithRepairPriorityList = new ArrayList<>();
        }
        vulNumWithRepairPriorityListSetter.accept(this.vulNumWithRepairPriorityList);
        return this;
    }

    /**
     * **参数解释**: 各个漏洞修复优先级下的漏洞数量 
     * @return vulNumWithRepairPriorityList
     */
    public List<VulHostHostsResponseInfoVulNumWithRepairPriorityList> getVulNumWithRepairPriorityList() {
        return vulNumWithRepairPriorityList;
    }

    public void setVulNumWithRepairPriorityList(
        List<VulHostHostsResponseInfoVulNumWithRepairPriorityList> vulNumWithRepairPriorityList) {
        this.vulNumWithRepairPriorityList = vulNumWithRepairPriorityList;
    }

    public VulHostHostsResponseInfoDataList withVulIdsInfo(VulHostHostsResponseInfoVulIdsInfo vulIdsInfo) {
        this.vulIdsInfo = vulIdsInfo;
        return this;
    }

    public VulHostHostsResponseInfoDataList withVulIdsInfo(
        Consumer<VulHostHostsResponseInfoVulIdsInfo> vulIdsInfoSetter) {
        if (this.vulIdsInfo == null) {
            this.vulIdsInfo = new VulHostHostsResponseInfoVulIdsInfo();
            vulIdsInfoSetter.accept(this.vulIdsInfo);
        }

        return this;
    }

    /**
     * Get vulIdsInfo
     * @return vulIdsInfo
     */
    public VulHostHostsResponseInfoVulIdsInfo getVulIdsInfo() {
        return vulIdsInfo;
    }

    public void setVulIdsInfo(VulHostHostsResponseInfoVulIdsInfo vulIdsInfo) {
        this.vulIdsInfo = vulIdsInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHostHostsResponseInfoDataList that = (VulHostHostsResponseInfoDataList) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.score, that.score) && Objects.equals(this.version, that.version)
            && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.vulNumWithRepairPriorityList, that.vulNumWithRepairPriorityList)
            && Objects.equals(this.vulIdsInfo, that.vulIdsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            agentId,
            hostName,
            regionName,
            publicIp,
            privateIp,
            groupId,
            groupName,
            osType,
            assetValue,
            scanTime,
            severityLevel,
            score,
            version,
            handleStatus,
            vulNumWithRepairPriorityList,
            vulIdsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostHostsResponseInfoDataList {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    vulNumWithRepairPriorityList: ")
            .append(toIndentedString(vulNumWithRepairPriorityList))
            .append("\n");
        sb.append("    vulIdsInfo: ").append(toIndentedString(vulIdsInfo)).append("\n");
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
