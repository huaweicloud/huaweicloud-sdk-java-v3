package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扫描任务关联主机信息
 */
public class AntiVirusTaskHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_duration")

    private Long runDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_progress")

    private String scanProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virus_num")

    private Integer virusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_file_num")

    private Long scanFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_task_status")

    private String hostTaskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_using_quota")

    private Integer whetherUsingQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    public AntiVirusTaskHostResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public AntiVirusTaskHostResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AntiVirusTaskHostResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public AntiVirusTaskHostResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性公网IP地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public AntiVirusTaskHostResponseInfo withAssetValue(String assetValue) {
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

    public AntiVirusTaskHostResponseInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 启动时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public AntiVirusTaskHostResponseInfo withRunDuration(Long runDuration) {
        this.runDuration = runDuration;
        return this;
    }

    /**
     * 运行时长，秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return runDuration
     */
    public Long getRunDuration() {
        return runDuration;
    }

    public void setRunDuration(Long runDuration) {
        this.runDuration = runDuration;
    }

    public AntiVirusTaskHostResponseInfo withScanProgress(String scanProgress) {
        this.scanProgress = scanProgress;
        return this;
    }

    /**
     * 扫描进度
     * @return scanProgress
     */
    public String getScanProgress() {
        return scanProgress;
    }

    public void setScanProgress(String scanProgress) {
        this.scanProgress = scanProgress;
    }

    public AntiVirusTaskHostResponseInfo withVirusNum(Integer virusNum) {
        this.virusNum = virusNum;
        return this;
    }

    /**
     * 新发现病毒数量
     * minimum: 0
     * maximum: 2147483647
     * @return virusNum
     */
    public Integer getVirusNum() {
        return virusNum;
    }

    public void setVirusNum(Integer virusNum) {
        this.virusNum = virusNum;
    }

    public AntiVirusTaskHostResponseInfo withScanFileNum(Long scanFileNum) {
        this.scanFileNum = scanFileNum;
        return this;
    }

    /**
     * 已扫描的文件数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanFileNum
     */
    public Long getScanFileNum() {
        return scanFileNum;
    }

    public void setScanFileNum(Long scanFileNum) {
        this.scanFileNum = scanFileNum;
    }

    public AntiVirusTaskHostResponseInfo withHostTaskStatus(String hostTaskStatus) {
        this.hostTaskStatus = hostTaskStatus;
        return this;
    }

    /**
     * 服务器扫描状态，包含如下4种   - scanning ：扫描中   - success ：扫描成功   - fail ：扫描失败   - cancel ：取消扫描
     * @return hostTaskStatus
     */
    public String getHostTaskStatus() {
        return hostTaskStatus;
    }

    public void setHostTaskStatus(String hostTaskStatus) {
        this.hostTaskStatus = hostTaskStatus;
    }

    public AntiVirusTaskHostResponseInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public AntiVirusTaskHostResponseInfo withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 是否删除，包含如下:   - true ：已删除   - false : 未删除
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public AntiVirusTaskHostResponseInfo withWhetherUsingQuota(Integer whetherUsingQuota) {
        this.whetherUsingQuota = whetherUsingQuota;
        return this;
    }

    /**
     * 是否使用病毒查杀按次计费配额
     * @return whetherUsingQuota
     */
    public Integer getWhetherUsingQuota() {
        return whetherUsingQuota;
    }

    public void setWhetherUsingQuota(Integer whetherUsingQuota) {
        this.whetherUsingQuota = whetherUsingQuota;
    }

    public AntiVirusTaskHostResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * Agent ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AntiVirusTaskHostResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public AntiVirusTaskHostResponseInfo withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 服务器状态
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public AntiVirusTaskHostResponseInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * Agent状态，包含如下6种。   - installed ：已安装。   - not_installed ：未安装。   - online ：在线。   - offline ：离线。   - install_failed ：安装失败。   - installing ：安装中。   - not_online ：不在线的（除了在线以外的所有状态，仅作为查询条件）。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public AntiVirusTaskHostResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态，包含如下2种。   - closed ：关闭。   - opened ：开启。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public AntiVirusTaskHostResponseInfo withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 操作系统名称
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public AntiVirusTaskHostResponseInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusTaskHostResponseInfo that = (AntiVirusTaskHostResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.runDuration, that.runDuration)
            && Objects.equals(this.scanProgress, that.scanProgress) && Objects.equals(this.virusNum, that.virusNum)
            && Objects.equals(this.scanFileNum, that.scanFileNum)
            && Objects.equals(this.hostTaskStatus, that.hostTaskStatus)
            && Objects.equals(this.failReason, that.failReason) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.whetherUsingQuota, that.whetherUsingQuota)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.hostStatus, that.hostStatus) && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.osName, that.osName)
            && Objects.equals(this.osVersion, that.osVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            hostName,
            privateIp,
            publicIp,
            assetValue,
            startTime,
            runDuration,
            scanProgress,
            virusNum,
            scanFileNum,
            hostTaskStatus,
            failReason,
            deleted,
            whetherUsingQuota,
            agentId,
            osType,
            hostStatus,
            agentStatus,
            protectStatus,
            osName,
            osVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusTaskHostResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    runDuration: ").append(toIndentedString(runDuration)).append("\n");
        sb.append("    scanProgress: ").append(toIndentedString(scanProgress)).append("\n");
        sb.append("    virusNum: ").append(toIndentedString(virusNum)).append("\n");
        sb.append("    scanFileNum: ").append(toIndentedString(scanFileNum)).append("\n");
        sb.append("    hostTaskStatus: ").append(toIndentedString(hostTaskStatus)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    whetherUsingQuota: ").append(toIndentedString(whetherUsingQuota)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
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
