package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网页防篡改防护信息
 */
public class WtpProtectHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

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
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private String osBit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_protect_status")

    private String raspProtectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_tampering_times")

    private Long antiTamperingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_tampering_times")

    private Long detectTamperingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir_num")

    private Integer protectDirNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_dir_list")

    private List<String> abnormalDirList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_reason")

    private Integer abnormalReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_id")

    private String backupHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interrupt_reason")

    private String interruptReason;

    public WtpProtectHostResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public WtpProtectHostResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public WtpProtectHostResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP地址 **取值范围**： 字符长度1-256位 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public WtpProtectHostResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 服务器私有IP **取值范围**： 字符长度1-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public WtpProtectHostResponseInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 策略组ID **取值范围**： 字符长度36-64位
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WtpProtectHostResponseInfo withGroupName(String groupName) {
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

    public WtpProtectHostResponseInfo withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * 资产重要性，包含如下3种   - important ：重要资产   - common ：一般资产   - test ：测试资产
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public WtpProtectHostResponseInfo withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    /**
     * **参数解释**： 操作系统位数 **取值范围**： 字符长度1-64位 
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public WtpProtectHostResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**： 操作系统类型 **取值范围**： - Linux：Linux。 - Windows：Windows。 
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public WtpProtectHostResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改防护状态 **取值范围**: - opening : 开启中。 - opened : 防护中。 - closed : 未防护。 - open_failed : 防护失败。 - partial_protection : 部分防护。 - protection_interruption : 防护中断。 - protection_pause : 防护暂停。 
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public WtpProtectHostResponseInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**： 计费模式 **取值范围**： - packet_cycle ：包年/包月。 - on_demand ：按需计费。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public WtpProtectHostResponseInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**： 资源ID **取值范围**： 字符长度0-128位
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public WtpProtectHostResponseInfo withRaspProtectStatus(String raspProtectStatus) {
        this.raspProtectStatus = raspProtectStatus;
        return this;
    }

    /**
     * **参数解释**: 动态网页防篡改防护开启状态 **取值范围**: - opened ：已开启动态网页防篡改防护。 - closed ：未开启动态网页防篡改防护。 
     * @return raspProtectStatus
     */
    public String getRaspProtectStatus() {
        return raspProtectStatus;
    }

    public void setRaspProtectStatus(String raspProtectStatus) {
        this.raspProtectStatus = raspProtectStatus;
    }

    public WtpProtectHostResponseInfo withAntiTamperingTimes(Long antiTamperingTimes) {
        this.antiTamperingTimes = antiTamperingTimes;
        return this;
    }

    /**
     * **参数解释**: 近7天静态网页防篡改攻击次数 **取值范围**: 最小值0，最大值2000000000 
     * minimum: 0
     * maximum: 2000000000
     * @return antiTamperingTimes
     */
    public Long getAntiTamperingTimes() {
        return antiTamperingTimes;
    }

    public void setAntiTamperingTimes(Long antiTamperingTimes) {
        this.antiTamperingTimes = antiTamperingTimes;
    }

    public WtpProtectHostResponseInfo withDetectTamperingTimes(Long detectTamperingTimes) {
        this.detectTamperingTimes = detectTamperingTimes;
        return this;
    }

    /**
     * **参数解释**: 近7天动态网页防篡改攻击次数 **取值范围**: 最小值0，最大值2000000000 
     * minimum: 0
     * maximum: 2000000000
     * @return detectTamperingTimes
     */
    public Long getDetectTamperingTimes() {
        return detectTamperingTimes;
    }

    public void setDetectTamperingTimes(Long detectTamperingTimes) {
        this.detectTamperingTimes = detectTamperingTimes;
    }

    public WtpProtectHostResponseInfo withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * **参数解释**： 操作系统名称 **取值范围**： 字符长度0-128位 
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public WtpProtectHostResponseInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * **参数解释**： 操作系统版本 **取值范围**： 字符长度0-256位 
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public WtpProtectHostResponseInfo withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * **参数解释**: 服务器状态 **取值范围**: - ACTIVE ：运行中。 - SHUTOFF ：关机。 - BUILDING ：创建中。 - ERROR ：故障。
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public WtpProtectHostResponseInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent状态 **取值范围**: - not_installed：未安装。 - online：在线。 - offline：离线。 
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public WtpProtectHostResponseInfo withProtectDirNum(Integer protectDirNum) {
        this.protectDirNum = protectDirNum;
        return this;
    }

    /**
     * **参数解释**: 防护目录数 **取值范围**: 最小值0，最大值50 
     * minimum: 0
     * maximum: 50
     * @return protectDirNum
     */
    public Integer getProtectDirNum() {
        return protectDirNum;
    }

    public void setProtectDirNum(Integer protectDirNum) {
        this.protectDirNum = protectDirNum;
    }

    public WtpProtectHostResponseInfo withAbnormalDirList(List<String> abnormalDirList) {
        this.abnormalDirList = abnormalDirList;
        return this;
    }

    public WtpProtectHostResponseInfo addAbnormalDirListItem(String abnormalDirListItem) {
        if (this.abnormalDirList == null) {
            this.abnormalDirList = new ArrayList<>();
        }
        this.abnormalDirList.add(abnormalDirListItem);
        return this;
    }

    public WtpProtectHostResponseInfo withAbnormalDirList(Consumer<List<String>> abnormalDirListSetter) {
        if (this.abnormalDirList == null) {
            this.abnormalDirList = new ArrayList<>();
        }
        abnormalDirListSetter.accept(this.abnormalDirList);
        return this;
    }

    /**
     * **参数解释**: 防护状态是防护失败的防护目录列表，仅当存在防护状态是防护失败的防护目录时返回。 **取值范围**: 最少0条，最多50条 
     * @return abnormalDirList
     */
    public List<String> getAbnormalDirList() {
        return abnormalDirList;
    }

    public void setAbnormalDirList(List<String> abnormalDirList) {
        this.abnormalDirList = abnormalDirList;
    }

    public WtpProtectHostResponseInfo withAbnormalReason(Integer abnormalReason) {
        this.abnormalReason = abnormalReason;
        return this;
    }

    /**
     * **参数解释**: 防护失败原因，仅当存在防护状态是防护失败的防护目录时返回。 **取值范围**: - 1 ：某一个防护目录的路径不存在。 - 2 ：多个防护目录的路径不存在。 - 7 ：某一个防护目录未防护。 - 8 ：多个防护目录未防护。 - 10 ：某一个防护目录是网络文件系统。 - 11 ：多个防护目录是网络文件系统。 
     * minimum: 1
     * maximum: 11
     * @return abnormalReason
     */
    public Integer getAbnormalReason() {
        return abnormalReason;
    }

    public void setAbnormalReason(Integer abnormalReason) {
        this.abnormalReason = abnormalReason;
    }

    public WtpProtectHostResponseInfo withBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
        return this;
    }

    /**
     * **参数解释**： 远端备份服务器ID，仅当Linux服务器开启远端备份功能时返回。 **取值范围**： 字符长度0-64位 
     * @return backupHostId
     */
    public String getBackupHostId() {
        return backupHostId;
    }

    public void setBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
    }

    public WtpProtectHostResponseInfo withInterruptReason(String interruptReason) {
        this.interruptReason = interruptReason;
        return this;
    }

    /**
     * **参数解释**： 防护中断原因，仅当防护状态是防护中断时返回。 **取值范围**： 字符长度0-256位 
     * @return interruptReason
     */
    public String getInterruptReason() {
        return interruptReason;
    }

    public void setInterruptReason(String interruptReason) {
        this.interruptReason = interruptReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WtpProtectHostResponseInfo that = (WtpProtectHostResponseInfo) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.osBit, that.osBit)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.raspProtectStatus, that.raspProtectStatus)
            && Objects.equals(this.antiTamperingTimes, that.antiTamperingTimes)
            && Objects.equals(this.detectTamperingTimes, that.detectTamperingTimes)
            && Objects.equals(this.osName, that.osName) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.hostStatus, that.hostStatus) && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.protectDirNum, that.protectDirNum)
            && Objects.equals(this.abnormalDirList, that.abnormalDirList)
            && Objects.equals(this.abnormalReason, that.abnormalReason)
            && Objects.equals(this.backupHostId, that.backupHostId)
            && Objects.equals(this.interruptReason, that.interruptReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName,
            hostId,
            publicIp,
            privateIp,
            groupId,
            groupName,
            assetValue,
            osBit,
            osType,
            protectStatus,
            chargingMode,
            resourceId,
            raspProtectStatus,
            antiTamperingTimes,
            detectTamperingTimes,
            osName,
            osVersion,
            hostStatus,
            agentStatus,
            protectDirNum,
            abnormalDirList,
            abnormalReason,
            backupHostId,
            interruptReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WtpProtectHostResponseInfo {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    raspProtectStatus: ").append(toIndentedString(raspProtectStatus)).append("\n");
        sb.append("    antiTamperingTimes: ").append(toIndentedString(antiTamperingTimes)).append("\n");
        sb.append("    detectTamperingTimes: ").append(toIndentedString(detectTamperingTimes)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    protectDirNum: ").append(toIndentedString(protectDirNum)).append("\n");
        sb.append("    abnormalDirList: ").append(toIndentedString(abnormalDirList)).append("\n");
        sb.append("    abnormalReason: ").append(toIndentedString(abnormalReason)).append("\n");
        sb.append("    backupHostId: ").append(toIndentedString(backupHostId)).append("\n");
        sb.append("    interruptReason: ").append(toIndentedString(interruptReason)).append("\n");
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
