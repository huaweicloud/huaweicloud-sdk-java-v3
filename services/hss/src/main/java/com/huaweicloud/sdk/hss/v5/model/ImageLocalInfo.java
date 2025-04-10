package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageLocalInfo
 */
public class ImageLocalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_digest")

    private String imageDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_type")

    private String localImageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_update_time")

    private Long latestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Long vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsafe_setting_num")

    private Long unsafeSettingNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_file_num")

    private Long maliciousFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Long hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_num")

    private Long containerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_num")

    private Long componentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_failed_desc")

    private String scanFailedDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_scan_reason")

    private String nonScanReason;

    public ImageLocalInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageLocalInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImageLocalInfo withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * 镜像digest
     * @return imageDigest
     */
    public String getImageDigest() {
        return imageDigest;
    }

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    public ImageLocalInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 镜像版本
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ImageLocalInfo withLocalImageType(String localImageType) {
        this.localImageType = localImageType;
        return this;
    }

    /**
     * 本地镜像类型
     * @return localImageType
     */
    public String getLocalImageType() {
        return localImageType;
    }

    public void setLocalImageType(String localImageType) {
        this.localImageType = localImageType;
    }

    public ImageLocalInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 扫描状态，包含如下：   - unscan：未扫描   - success：扫描完成   - scanning：正在扫描   - failed：扫描失败   - waiting：等待扫描
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ImageLocalInfo withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 镜像大小，单位字节
     * minimum: 0
     * maximum: 9223372036854775807
     * @return imageSize
     */
    public Long getImageSize() {
        return imageSize;
    }

    public void setImageSize(Long imageSize) {
        this.imageSize = imageSize;
    }

    public ImageLocalInfo withLatestUpdateTime(Long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
        return this;
    }

    /**
     * 镜像版本最后更新时间，时间单位毫秒（ms）
     * minimum: 0
     * maximum: 4070880000000
     * @return latestUpdateTime
     */
    public Long getLatestUpdateTime() {
        return latestUpdateTime;
    }

    public void setLatestUpdateTime(Long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
    }

    public ImageLocalInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * 最近扫描时间，时间单位毫秒（ms）
     * minimum: 0
     * maximum: 4070880000000
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public ImageLocalInfo withVulNum(Long vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * 漏洞个数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return vulNum
     */
    public Long getVulNum() {
        return vulNum;
    }

    public void setVulNum(Long vulNum) {
        this.vulNum = vulNum;
    }

    public ImageLocalInfo withUnsafeSettingNum(Long unsafeSettingNum) {
        this.unsafeSettingNum = unsafeSettingNum;
        return this;
    }

    /**
     * 基线扫描未通过数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return unsafeSettingNum
     */
    public Long getUnsafeSettingNum() {
        return unsafeSettingNum;
    }

    public void setUnsafeSettingNum(Long unsafeSettingNum) {
        this.unsafeSettingNum = unsafeSettingNum;
    }

    public ImageLocalInfo withMaliciousFileNum(Long maliciousFileNum) {
        this.maliciousFileNum = maliciousFileNum;
        return this;
    }

    /**
     * 恶意文件数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return maliciousFileNum
     */
    public Long getMaliciousFileNum() {
        return maliciousFileNum;
    }

    public void setMaliciousFileNum(Long maliciousFileNum) {
        this.maliciousFileNum = maliciousFileNum;
    }

    public ImageLocalInfo withHostNum(Long hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * 关联主机数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return hostNum
     */
    public Long getHostNum() {
        return hostNum;
    }

    public void setHostNum(Long hostNum) {
        this.hostNum = hostNum;
    }

    public ImageLocalInfo withContainerNum(Long containerNum) {
        this.containerNum = containerNum;
        return this;
    }

    /**
     * 关联容器数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return containerNum
     */
    public Long getContainerNum() {
        return containerNum;
    }

    public void setContainerNum(Long containerNum) {
        this.containerNum = containerNum;
    }

    public ImageLocalInfo withComponentNum(Long componentNum) {
        this.componentNum = componentNum;
        return this;
    }

    /**
     * 关联组件数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return componentNum
     */
    public Long getComponentNum() {
        return componentNum;
    }

    public void setComponentNum(Long componentNum) {
        this.componentNum = componentNum;
    }

    public ImageLocalInfo withScanFailedDesc(String scanFailedDesc) {
        this.scanFailedDesc = scanFailedDesc;
        return this;
    }

    /**
     * 扫描失败原因，包含如下10种。   - \"unknown_error\":未知错误   - \"failed_to_match_agent\":对应主机未开启容器版防护或agent离线   - \"create_container_failed\":创建容器失败        - \"get_container_info_failed\":获取容器信息失败   - \"docker_offline\":docker引擎不在线   - \"get_docker_root_failed\":获取容器根文件系统失败   - \"image_not_exist_or_docker_api_fault\":镜像不存在或docker接口错误   - \"huge_image\":超大镜像   - \"docker_root_in_nfs\":容器根目录位于网络挂载   - \"response_timed_out\":响应超时
     * @return scanFailedDesc
     */
    public String getScanFailedDesc() {
        return scanFailedDesc;
    }

    public void setScanFailedDesc(String scanFailedDesc) {
        this.scanFailedDesc = scanFailedDesc;
    }

    public ImageLocalInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * 镜像风险程度，在镜像扫描完成后展示，包含如下：   - Security：安全   - Low：低危   - Medium：中危   - High：高危
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public ImageLocalInfo withHostName(String hostName) {
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

    public ImageLocalInfo withHostId(String hostId) {
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

    public ImageLocalInfo withAgentId(String agentId) {
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

    public ImageLocalInfo withNonScanReason(String nonScanReason) {
        this.nonScanReason = nonScanReason;
        return this;
    }

    /**
     * 该镜像不支持扫描的原因；若该字段为空则表示镜像可以扫描
     * @return nonScanReason
     */
    public String getNonScanReason() {
        return nonScanReason;
    }

    public void setNonScanReason(String nonScanReason) {
        this.nonScanReason = nonScanReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageLocalInfo that = (ImageLocalInfo) obj;
        return Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageDigest, that.imageDigest)
            && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.localImageType, that.localImageType)
            && Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.latestUpdateTime, that.latestUpdateTime)
            && Objects.equals(this.latestScanTime, that.latestScanTime) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.unsafeSettingNum, that.unsafeSettingNum)
            && Objects.equals(this.maliciousFileNum, that.maliciousFileNum)
            && Objects.equals(this.hostNum, that.hostNum) && Objects.equals(this.containerNum, that.containerNum)
            && Objects.equals(this.componentNum, that.componentNum)
            && Objects.equals(this.scanFailedDesc, that.scanFailedDesc)
            && Objects.equals(this.severityLevel, that.severityLevel) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.nonScanReason, that.nonScanReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName,
            imageId,
            imageDigest,
            imageVersion,
            localImageType,
            scanStatus,
            imageSize,
            latestUpdateTime,
            latestScanTime,
            vulNum,
            unsafeSettingNum,
            maliciousFileNum,
            hostNum,
            containerNum,
            componentNum,
            scanFailedDesc,
            severityLevel,
            hostName,
            hostId,
            agentId,
            nonScanReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageLocalInfo {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    localImageType: ").append(toIndentedString(localImageType)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    latestUpdateTime: ").append(toIndentedString(latestUpdateTime)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    unsafeSettingNum: ").append(toIndentedString(unsafeSettingNum)).append("\n");
        sb.append("    maliciousFileNum: ").append(toIndentedString(maliciousFileNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    containerNum: ").append(toIndentedString(containerNum)).append("\n");
        sb.append("    componentNum: ").append(toIndentedString(componentNum)).append("\n");
        sb.append("    scanFailedDesc: ").append(toIndentedString(scanFailedDesc)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    nonScanReason: ").append(toIndentedString(nonScanReason)).append("\n");
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
