package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 已隔离文件详情
 */
public class IsolatedFileResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_attr")

    private String fileAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolation_status")

    private String isolationStatus;

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
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolate_source")

    private String isolateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_event_info")

    private IsolateEventResponseInfo agentEventInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antivirus_result_info")

    private AntivirusResultDetailInfo antivirusResultInfo;

    public IsolatedFileResponseInfo withOsType(String osType) {
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

    public IsolatedFileResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public IsolatedFileResponseInfo withHostName(String hostName) {
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

    public IsolatedFileResponseInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * 文件哈希
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public IsolatedFileResponseInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public IsolatedFileResponseInfo withFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
        return this;
    }

    /**
     * 文件属性
     * @return fileAttr
     */
    public String getFileAttr() {
        return fileAttr;
    }

    public void setFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
    }

    public IsolatedFileResponseInfo withIsolationStatus(String isolationStatus) {
        this.isolationStatus = isolationStatus;
        return this;
    }

    /**
     * 隔离状态，包含如下:   - isolated : 已隔离   - restored : 已恢复   - isolating : 已下发隔离任务   - restoring : 已下发恢复任务
     * @return isolationStatus
     */
    public String getIsolationStatus() {
        return isolationStatus;
    }

    public void setIsolationStatus(String isolationStatus) {
        this.isolationStatus = isolationStatus;
    }

    public IsolatedFileResponseInfo withPrivateIp(String privateIp) {
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

    public IsolatedFileResponseInfo withPublicIp(String publicIp) {
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

    public IsolatedFileResponseInfo withAssetValue(String assetValue) {
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

    public IsolatedFileResponseInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public IsolatedFileResponseInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * agent版本
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public IsolatedFileResponseInfo withIsolateSource(String isolateSource) {
        this.isolateSource = isolateSource;
        return this;
    }

    /**
     * 隔离来源，包含如下:   - event : 安全告警事件   - antivirus : 病毒查杀
     * @return isolateSource
     */
    public String getIsolateSource() {
        return isolateSource;
    }

    public void setIsolateSource(String isolateSource) {
        this.isolateSource = isolateSource;
    }

    public IsolatedFileResponseInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public IsolatedFileResponseInfo withAgentEventInfo(IsolateEventResponseInfo agentEventInfo) {
        this.agentEventInfo = agentEventInfo;
        return this;
    }

    public IsolatedFileResponseInfo withAgentEventInfo(Consumer<IsolateEventResponseInfo> agentEventInfoSetter) {
        if (this.agentEventInfo == null) {
            this.agentEventInfo = new IsolateEventResponseInfo();
            agentEventInfoSetter.accept(this.agentEventInfo);
        }

        return this;
    }

    /**
     * Get agentEventInfo
     * @return agentEventInfo
     */
    public IsolateEventResponseInfo getAgentEventInfo() {
        return agentEventInfo;
    }

    public void setAgentEventInfo(IsolateEventResponseInfo agentEventInfo) {
        this.agentEventInfo = agentEventInfo;
    }

    public IsolatedFileResponseInfo withAntivirusResultInfo(AntivirusResultDetailInfo antivirusResultInfo) {
        this.antivirusResultInfo = antivirusResultInfo;
        return this;
    }

    public IsolatedFileResponseInfo withAntivirusResultInfo(
        Consumer<AntivirusResultDetailInfo> antivirusResultInfoSetter) {
        if (this.antivirusResultInfo == null) {
            this.antivirusResultInfo = new AntivirusResultDetailInfo();
            antivirusResultInfoSetter.accept(this.antivirusResultInfo);
        }

        return this;
    }

    /**
     * Get antivirusResultInfo
     * @return antivirusResultInfo
     */
    public AntivirusResultDetailInfo getAntivirusResultInfo() {
        return antivirusResultInfo;
    }

    public void setAntivirusResultInfo(AntivirusResultDetailInfo antivirusResultInfo) {
        this.antivirusResultInfo = antivirusResultInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsolatedFileResponseInfo that = (IsolatedFileResponseInfo) obj;
        return Objects.equals(this.osType, that.osType) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.fileHash, that.fileHash)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileAttr, that.fileAttr)
            && Objects.equals(this.isolationStatus, that.isolationStatus)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.isolateSource, that.isolateSource) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.agentEventInfo, that.agentEventInfo)
            && Objects.equals(this.antivirusResultInfo, that.antivirusResultInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osType,
            hostId,
            hostName,
            fileHash,
            filePath,
            fileAttr,
            isolationStatus,
            privateIp,
            publicIp,
            assetValue,
            updateTime,
            agentVersion,
            isolateSource,
            eventName,
            agentEventInfo,
            antivirusResultInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsolatedFileResponseInfo {\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileAttr: ").append(toIndentedString(fileAttr)).append("\n");
        sb.append("    isolationStatus: ").append(toIndentedString(isolationStatus)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    isolateSource: ").append(toIndentedString(isolateSource)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    agentEventInfo: ").append(toIndentedString(agentEventInfo)).append("\n");
        sb.append("    antivirusResultInfo: ").append(toIndentedString(antivirusResultInfo)).append("\n");
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
