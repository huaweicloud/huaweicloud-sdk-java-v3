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
     * **参数解释** 镜像名称 **取值范围** 字符长度0-256位 
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
     * **参数解释** 本地镜像的唯一标识，用于后续查询镜像详情、执行扫描等操作 **取值范围** 字符长度1-64位，支持字母、数字、短横线，符合UUID格式 
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
     * **参数解释** 本地镜像的加密摘要（SHA-256算法），用于唯一标识镜像内容，避免篡改 **取值范围** 字符长度64-128位，以'sha256:'开头，后跟十六进制字符串（如sha256:ce0b5d91b072730d0bc9518f11efd07eb7fdb9f43251e11a96cab5b1918b7044） 
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
     * **参数解释** 镜像版本 **取值范围** 字符长度0-256位 
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
     * **参数解释** 本地镜像的存储来源类型，标识镜像是否来自华为云SWR仓库 **取值范围** swr_image：华为云SWR仓库镜像 other_image：非SWR仓库镜像 
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
     * **参数解释** 本地镜像的安全扫描状态，反映当前镜像是否完成安全检测 **取值范围** 扫描状态，包含如下：   - unscan：未扫描   - success：扫描完成   - scanning：正在扫描   - failed：扫描失败   - waiting：等待扫描 
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
     * **参数解释** 本地镜像的实际存储大小，单位为字节（B） **取值范围** 取值0-9223372036854775807（约9EB） 
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
     * **参数解释** 本地镜像版本的最后更新时间，即镜像创建或更新的时间戳 **取值范围** Unix时间戳（单位ms），取值0-9223372036854775807 
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
     * **参数解释** 本地镜像最近一次完成安全扫描的时间戳，未扫描时该字段可能为0或空 **取值范围** Unix时间戳（单位ms），取值0-9223372036854775807，未扫描时为0 
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
     * **参数解释** 本地镜像中检测到的软件漏洞总数，包含高、中、低危漏洞 **取值范围** 取值0-9223372036854775807 
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
     * **参数解释** 本地镜像在安全基线扫描中未通过的检查项数量，反映镜像配置合规性 **取值范围** 取值0-9223372036854775807 
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
     * **参数解释** 本地镜像中检测到的恶意文件（如病毒、木马）总数 **取值范围** 取值0-9223372036854775807 
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
     * **参数解释** 当前本地镜像所关联的云服务器总数 **取值范围** 取值0-9223372036854775807 
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
     * **参数解释** 当前本地镜像所创建或关联的容器总数 **取值范围** 取值0-9223372036854775807 
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
     * **参数解释** 本地镜像中包含的软件组件（如依赖库、应用程序）总数 **取值范围** 取值0-9223372036854775807 
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
     * **参数解释** 当scan_status为failed时，该字段说明扫描失败的具体原因，未失败时为空字符串 **取值范围** - unknown_error：未知错误 - failed_to_match_agent：对应主机未开启容器版防护或agent离线 - create_container_failed：创建容器失败      - get_container_info_failed：获取容器信息失败 - docker_offline：docker引擎不在线 - get_docker_root_failed：获取容器根文件系统失败 - image_not_exist_or_docker_api_fault：镜像不存在或docker接口错误 - huge_image：超大镜像 - docker_root_in_nfs：容器根目录位于网络挂载 - response_timed_out：响应超时 
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
     * **参数解释** 根据镜像的漏洞、基线违规、恶意文件情况综合评定的风险等级 **取值范围** - Security：安全 - Low：低危 - Medium：中危 - High：高危 
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
     * **参数解释** 应用防护事件所属云服务器的名称，用于标识事件来源主机 **取值范围** 字符长度1-64位，支持中文、英文、数字、短横线、下划线，符合华为云ECS命名规范 
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
     * **参数解释**: 主机id **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及
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
     * **参数解释** 本地镜像所在服务器上安装的HSS Agent唯一标识，用于关联Agent相关操作 **取值范围** 字符长度1-128位，支持字母、数字、短横线、下划线 
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
     * **参数解释** 说明本地镜像无法进行安全扫描的具体原因（如镜像格式不支持、权限不足等），为空表示支持扫描 **取值范围** 字符长度0-1024位，支持中文、英文、数字、常用标点符号 
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
