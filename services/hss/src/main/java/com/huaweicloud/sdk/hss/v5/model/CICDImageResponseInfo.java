package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * cicd image info
 */
public class CICDImageResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_name")

    private String cicdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_digest")

    private String imageDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private Boolean latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_failed_desc")

    private String scanFailedDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_failed_code")

    private String scanFailedCode;

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

    private Integer vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsafe_setting_num")

    private Integer unsafeSettingNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_file_num")

    private Integer maliciousFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    public CICDImageResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: cicd镜像标识 **取值范围**: 字符长度0-128位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public CICDImageResponseInfo withCicdName(String cicdName) {
        this.cicdName = cicdName;
        return this;
    }

    /**
     * **参数解释**: cicd名称 **取值范围**: 字符长度0-128位 
     * @return cicdName
     */
    public String getCicdName() {
        return cicdName;
    }

    public void setCicdName(String cicdName) {
        this.cicdName = cicdName;
    }

    public CICDImageResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 命名空间 **取值范围**: 字符长度0-64位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CICDImageResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-128位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public CICDImageResponseInfo withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * **参数解释**: 镜像digest **取值范围**: 字符长度0-128位 
     * @return imageDigest
     */
    public String getImageDigest() {
        return imageDigest;
    }

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    public CICDImageResponseInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本 **取值范围**: 字符长度0-64位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public CICDImageResponseInfo withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**: 镜像仓库名称 **取值范围**: 字符长度1-128位 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public CICDImageResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**： 镜像类型 **取值范围**： - cicd ：cicd镜像。 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public CICDImageResponseInfo withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**： 镜像仓库类型 **取值范围**： - cicd ：cicd镜像。 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public CICDImageResponseInfo withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释**: 是否是最新版本 **取值范围**: - true：是。 - false：否。 
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public CICDImageResponseInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释**: 扫描状态 **取值范围**: - unscan ：未扫描。 - success ：扫描完成。 - scanning ：正在扫描。 - failed ：扫描失败。 - download_failed ：下载失败。 - image_oversized ：镜像超大。 - waiting_for_scan ：等待扫描。 
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public CICDImageResponseInfo withScanFailedDesc(String scanFailedDesc) {
        this.scanFailedDesc = scanFailedDesc;
        return this;
    }

    /**
     * **参数解释**: 扫描失败原因，包含如下16种。   - 未知错误   - 认证失败   - 镜像下载失败。请向技术人员寻求帮助。   - 镜像大小超限，不支持扫描。建议精简镜像。   - 获取镜像详细信息失败，镜像仓中可能已经不存在此镜像。请重新同步最新镜像。   - 镜像层数超限，不支持扫描。建议精简镜像。   - 漏洞扫描失败   - 文件扫描失败   - 软件扫描失败   - 敏感信息核查失败   - 基线检查失败   - 软件合规检查失败   - 基础镜像信息查询失败   - 响应超时   - 数据库错误   - 发送扫描请求失败 **取值范围**: 字符长度0-128位 
     * @return scanFailedDesc
     */
    public String getScanFailedDesc() {
        return scanFailedDesc;
    }

    public void setScanFailedDesc(String scanFailedDesc) {
        this.scanFailedDesc = scanFailedDesc;
    }

    public CICDImageResponseInfo withScanFailedCode(String scanFailedCode) {
        this.scanFailedCode = scanFailedCode;
        return this;
    }

    /**
     * **参数解释**: 扫描失败原因code，包含如下16种。   - \"unknown_error\"   - \"authentication_failed\"   - \"download_failed\"   - \"image_over_sized\"   - \"get_detail_info_not_found\"   - \"image_layer_over_sized\"   - \"failed_to_scan_vulnerability\"   - \"failed_to_scan_file\"   - \"failed_to_scan_software\"   - \"failed_to_check_sensitive_information\"   - \"failed_to_check_baseline\"   - \"failed_to_check_software_compliance\"   - \"failed_to_query_basic_image_information\"   - \"response_timed_out\"   - \"database_error\"   - \"failed_to_send_the_scan_request\" **取值范围**: 字符长度0-64位 
     * @return scanFailedCode
     */
    public String getScanFailedCode() {
        return scanFailedCode;
    }

    public void setScanFailedCode(String scanFailedCode) {
        this.scanFailedCode = scanFailedCode;
    }

    public CICDImageResponseInfo withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释**: 镜像大小 **取值范围**: 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return imageSize
     */
    public Long getImageSize() {
        return imageSize;
    }

    public void setImageSize(Long imageSize) {
        this.imageSize = imageSize;
    }

    public CICDImageResponseInfo withLatestUpdateTime(Long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 镜像版本最后更新时间，时间单位 毫秒（ms） **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestUpdateTime
     */
    public Long getLatestUpdateTime() {
        return latestUpdateTime;
    }

    public void setLatestUpdateTime(Long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
    }

    public CICDImageResponseInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间，时间单位 毫秒（ms） **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public CICDImageResponseInfo withVulNum(Integer vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulNum
     */
    public Integer getVulNum() {
        return vulNum;
    }

    public void setVulNum(Integer vulNum) {
        this.vulNum = vulNum;
    }

    public CICDImageResponseInfo withUnsafeSettingNum(Integer unsafeSettingNum) {
        this.unsafeSettingNum = unsafeSettingNum;
        return this;
    }

    /**
     * **参数解释**: 基线扫描未通过数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unsafeSettingNum
     */
    public Integer getUnsafeSettingNum() {
        return unsafeSettingNum;
    }

    public void setUnsafeSettingNum(Integer unsafeSettingNum) {
        this.unsafeSettingNum = unsafeSettingNum;
    }

    public CICDImageResponseInfo withMaliciousFileNum(Integer maliciousFileNum) {
        this.maliciousFileNum = maliciousFileNum;
        return this;
    }

    /**
     * **参数解释**: 恶意文件数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return maliciousFileNum
     */
    public Integer getMaliciousFileNum() {
        return maliciousFileNum;
    }

    public void setMaliciousFileNum(Integer maliciousFileNum) {
        this.maliciousFileNum = maliciousFileNum;
    }

    public CICDImageResponseInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**: 镜像风险程度，在镜像扫描完成后展示 **取值范围**: - Security：安全。 - Low：低危。 - Medium：中危。 - High：高危。 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CICDImageResponseInfo that = (CICDImageResponseInfo) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.cicdName, that.cicdName)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageDigest, that.imageDigest)
            && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.registryName, that.registryName) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.registryType, that.registryType)
            && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.scanFailedDesc, that.scanFailedDesc)
            && Objects.equals(this.scanFailedCode, that.scanFailedCode)
            && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.latestUpdateTime, that.latestUpdateTime)
            && Objects.equals(this.latestScanTime, that.latestScanTime) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.unsafeSettingNum, that.unsafeSettingNum)
            && Objects.equals(this.maliciousFileNum, that.maliciousFileNum)
            && Objects.equals(this.severityLevel, that.severityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId,
            cicdName,
            namespace,
            imageName,
            imageDigest,
            imageVersion,
            registryName,
            imageType,
            registryType,
            latestVersion,
            scanStatus,
            scanFailedDesc,
            scanFailedCode,
            imageSize,
            latestUpdateTime,
            latestScanTime,
            vulNum,
            unsafeSettingNum,
            maliciousFileNum,
            severityLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CICDImageResponseInfo {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    cicdName: ").append(toIndentedString(cicdName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    scanFailedDesc: ").append(toIndentedString(scanFailedDesc)).append("\n");
        sb.append("    scanFailedCode: ").append(toIndentedString(scanFailedCode)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    latestUpdateTime: ").append(toIndentedString(latestUpdateTime)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    unsafeSettingNum: ").append(toIndentedString(unsafeSettingNum)).append("\n");
        sb.append("    maliciousFileNum: ").append(toIndentedString(maliciousFileNum)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
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
