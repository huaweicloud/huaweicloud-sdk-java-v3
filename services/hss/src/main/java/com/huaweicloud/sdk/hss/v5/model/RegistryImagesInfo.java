package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像信息
 */
public class RegistryImagesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

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
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private String registryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

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
    @JsonProperty(value = "latest_sync_time")

    private Long latestSyncTime;

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
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_status")

    private String sharedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scannable")

    private Boolean scannable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multiple_arch")

    private Boolean isMultipleArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_url")

    private String instanceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_images")

    private List<AssociateImagesInfo> associationImages = null;

    public RegistryImagesInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: id **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RegistryImagesInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称 **取值范围**: 字符长度0-64位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public RegistryImagesInfo withImageName(String imageName) {
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

    public RegistryImagesInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **取值范围**: 字符长度0-64位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public RegistryImagesInfo withImageDigest(String imageDigest) {
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

    public RegistryImagesInfo withImageVersion(String imageVersion) {
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

    public RegistryImagesInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型 **取值范围**: - private_image：SWR私有镜像。 - shared_image：SWR共享镜像。 - instance_image：SWR企业版镜像。 - harbor：Harbor仓库镜像。 - jfrog：Jfrog镜像。 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public RegistryImagesInfo withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * **参数解释**: 镜像仓id **取值范围**: 字符长度1-64位 
     * @return registryId
     */
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public RegistryImagesInfo withRegistryName(String registryName) {
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

    public RegistryImagesInfo withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**： 镜像仓库类型 **取值范围**： - SwrPrivate：swr私有。 - SwrShared：swr共享。 - SwrEnterprise：swr企业。 - Harbor：harbor仓库。 - Jfrog：jfrog仓库。 - Other：其他仓库。 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public RegistryImagesInfo withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 是否是最新版本
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public RegistryImagesInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释**： 扫描状态 **取值范围**： - unscan：未扫描。 - success：扫描完成。 - scanning：正在扫描。 - failed：扫描失败。 - download_failed：下载失败。 - image_oversized：镜像超大。 - waiting_for_scan：等待扫描。 
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public RegistryImagesInfo withScanFailedDesc(String scanFailedDesc) {
        this.scanFailedDesc = scanFailedDesc;
        return this;
    }

    /**
     * **参数解释**： 扫描失败原因描述 **取值范围**： 扫描失败原因code和描述对应关系如下 - unknown_error：未知错误。 - authentication_failed：认证失败。 - download_failed：镜像下载失败。请向技术人员寻求帮助。 - image_over_sized：镜像大小超限，不支持扫描。建议精简镜像。 - get_detail_info_not_found：获取镜像详细信息失败，镜像仓中可能已经不存在此镜像。请重新同步最新镜像。 - image_layer_over_sized：镜像层数超限，不支持扫描。建议精简镜像。 - schema_v1_not_support：Schema V1镜像不支持扫描。建议升级到V2版本。 - access_swr_failed：访问SWR服务出错。请向技术人员寻求帮助。 - swr_authentication_error：缺少SWR授权。请参考镜像授权指导设置权限。 - failed_to_scan_vulnerability：漏洞扫描失败。 - failed_to_scan_file：文件扫描失败。 - failed_to_scan_software：软件扫描失败。 - failed_to_check_sensitive_information：敏感信息核查失败。 - failed_to_check_baseline：基线检查失败。 - failed_to_check_software_compliance：软件合规检查失败。 - failed_to_query_basic_image_information：基础镜像信息查询失败。 - failed_to_check_build_cmd：镜像构建指令扫描失败。 - response_timed_out：响应超时。 - database_error：数据库错误。 - failed_to_send_the_scan_request：发送扫描请求失败。 
     * @return scanFailedDesc
     */
    public String getScanFailedDesc() {
        return scanFailedDesc;
    }

    public void setScanFailedDesc(String scanFailedDesc) {
        this.scanFailedDesc = scanFailedDesc;
    }

    public RegistryImagesInfo withScanFailedCode(String scanFailedCode) {
        this.scanFailedCode = scanFailedCode;
        return this;
    }

    /**
     * **参数解释**： 扫描失败原因code **取值范围**： 扫描失败原因code和描述对应关系如下 - unknown_error：未知错误。 - authentication_failed：认证失败。 - download_failed：镜像下载失败。请向技术人员寻求帮助。 - image_over_sized：镜像大小超限，不支持扫描。建议精简镜像。 - get_detail_info_not_found：获取镜像详细信息失败，镜像仓中可能已经不存在此镜像。请重新同步最新镜像。 - image_layer_over_sized：镜像层数超限，不支持扫描。建议精简镜像。 - schema_v1_not_support：Schema V1镜像不支持扫描。建议升级到V2版本。 - access_swr_failed：访问SWR服务出错。请向技术人员寻求帮助。 - swr_authentication_error：缺少SWR授权。请参考镜像授权指导设置权限。 - failed_to_scan_vulnerability：漏洞扫描失败。 - failed_to_scan_file：文件扫描失败。 - failed_to_scan_software：软件扫描失败。 - failed_to_check_sensitive_information：敏感信息核查失败。 - failed_to_check_baseline：基线检查失败。 - failed_to_check_software_compliance：软件合规检查失败。 - failed_to_query_basic_image_information：基础镜像信息查询失败。 - failed_to_check_build_cmd：镜像构建指令扫描失败。 - response_timed_out：响应超时。 - database_error：数据库错误。 - failed_to_send_the_scan_request：发送扫描请求失败。 
     * @return scanFailedCode
     */
    public String getScanFailedCode() {
        return scanFailedCode;
    }

    public void setScanFailedCode(String scanFailedCode) {
        this.scanFailedCode = scanFailedCode;
    }

    public RegistryImagesInfo withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释**: 镜像大小 **取值范围**: 取值0-2147483547 
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

    public RegistryImagesInfo withLatestUpdateTime(Long latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 镜像版本最后更新时间，时间单位 毫秒（ms） **取值范围**: 取值0-9223372036854775807 
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

    public RegistryImagesInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间，时间单位 毫秒（ms） **取值范围**: 取值0-9223372036854775807 
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

    public RegistryImagesInfo withLatestSyncTime(Long latestSyncTime) {
        this.latestSyncTime = latestSyncTime;
        return this;
    }

    /**
     * **参数解释**: 最近同步时间，时间单位 毫秒（ms） **取值范围**: 取值0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestSyncTime
     */
    public Long getLatestSyncTime() {
        return latestSyncTime;
    }

    public void setLatestSyncTime(Long latestSyncTime) {
        this.latestSyncTime = latestSyncTime;
    }

    public RegistryImagesInfo withVulNum(Integer vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞个数 **取值范围**: 取值0-2147483647 
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

    public RegistryImagesInfo withUnsafeSettingNum(Integer unsafeSettingNum) {
        this.unsafeSettingNum = unsafeSettingNum;
        return this;
    }

    /**
     * **参数解释**: 基线扫描未通过数 **取值范围**: 取值0-2147483647 
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

    public RegistryImagesInfo withMaliciousFileNum(Integer maliciousFileNum) {
        this.maliciousFileNum = maliciousFileNum;
        return this;
    }

    /**
     * **参数解释**: 恶意文件数 **取值范围**: 取值0-2147483647 
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

    public RegistryImagesInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**: 拥有者（共享镜像参数） **取值范围**: 字符长度0-128 
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public RegistryImagesInfo withSharedStatus(String sharedStatus) {
        this.sharedStatus = sharedStatus;
        return this;
    }

    /**
     * **参数解释**： 共享镜像状态 **取值范围**： - expired：已过期。 - effective：有效。 
     * @return sharedStatus
     */
    public String getSharedStatus() {
        return sharedStatus;
    }

    public void setSharedStatus(String sharedStatus) {
        this.sharedStatus = sharedStatus;
    }

    public RegistryImagesInfo withScannable(Boolean scannable) {
        this.scannable = scannable;
        return this;
    }

    /**
     * 是否可扫描
     * @return scannable
     */
    public Boolean getScannable() {
        return scannable;
    }

    public void setScannable(Boolean scannable) {
        this.scannable = scannable;
    }

    public RegistryImagesInfo withIsMultipleArch(Boolean isMultipleArch) {
        this.isMultipleArch = isMultipleArch;
        return this;
    }

    /**
     * 是否是多架构镜像
     * @return isMultipleArch
     */
    public Boolean getIsMultipleArch() {
        return isMultipleArch;
    }

    public void setIsMultipleArch(Boolean isMultipleArch) {
        this.isMultipleArch = isMultipleArch;
    }

    public RegistryImagesInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**: 企业版镜像实例名称 **取值范围**: 字符长度0-128 
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RegistryImagesInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 企业版镜像实例ID **取值范围**: 字符长度0-64 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RegistryImagesInfo withInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
        return this;
    }

    /**
     * **参数解释**: 企业版镜像实例URL **取值范围**: 字符长度0-256 
     * @return instanceUrl
     */
    public String getInstanceUrl() {
        return instanceUrl;
    }

    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    public RegistryImagesInfo withSeverityLevel(String severityLevel) {
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

    public RegistryImagesInfo withAssociationImages(List<AssociateImagesInfo> associationImages) {
        this.associationImages = associationImages;
        return this;
    }

    public RegistryImagesInfo addAssociationImagesItem(AssociateImagesInfo associationImagesItem) {
        if (this.associationImages == null) {
            this.associationImages = new ArrayList<>();
        }
        this.associationImages.add(associationImagesItem);
        return this;
    }

    public RegistryImagesInfo withAssociationImages(Consumer<List<AssociateImagesInfo>> associationImagesSetter) {
        if (this.associationImages == null) {
            this.associationImages = new ArrayList<>();
        }
        associationImagesSetter.accept(this.associationImages);
        return this;
    }

    /**
     * 多架构关联镜像信息
     * @return associationImages
     */
    public List<AssociateImagesInfo> getAssociationImages() {
        return associationImages;
    }

    public void setAssociationImages(List<AssociateImagesInfo> associationImages) {
        this.associationImages = associationImages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegistryImagesInfo that = (RegistryImagesInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageDigest, that.imageDigest)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.registryId, that.registryId) && Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.registryType, that.registryType)
            && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.scanFailedDesc, that.scanFailedDesc)
            && Objects.equals(this.scanFailedCode, that.scanFailedCode)
            && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.latestUpdateTime, that.latestUpdateTime)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.latestSyncTime, that.latestSyncTime) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.unsafeSettingNum, that.unsafeSettingNum)
            && Objects.equals(this.maliciousFileNum, that.maliciousFileNum)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.sharedStatus, that.sharedStatus)
            && Objects.equals(this.scannable, that.scannable)
            && Objects.equals(this.isMultipleArch, that.isMultipleArch)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceUrl, that.instanceUrl)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.associationImages, that.associationImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            namespace,
            imageName,
            imageId,
            imageDigest,
            imageVersion,
            imageType,
            registryId,
            registryName,
            registryType,
            latestVersion,
            scanStatus,
            scanFailedDesc,
            scanFailedCode,
            imageSize,
            latestUpdateTime,
            latestScanTime,
            latestSyncTime,
            vulNum,
            unsafeSettingNum,
            maliciousFileNum,
            domainName,
            sharedStatus,
            scannable,
            isMultipleArch,
            instanceName,
            instanceId,
            instanceUrl,
            severityLevel,
            associationImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegistryImagesInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    scanFailedDesc: ").append(toIndentedString(scanFailedDesc)).append("\n");
        sb.append("    scanFailedCode: ").append(toIndentedString(scanFailedCode)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    latestUpdateTime: ").append(toIndentedString(latestUpdateTime)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    latestSyncTime: ").append(toIndentedString(latestSyncTime)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    unsafeSettingNum: ").append(toIndentedString(unsafeSettingNum)).append("\n");
        sb.append("    maliciousFileNum: ").append(toIndentedString(maliciousFileNum)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    sharedStatus: ").append(toIndentedString(sharedStatus)).append("\n");
        sb.append("    scannable: ").append(toIndentedString(scannable)).append("\n");
        sb.append("    isMultipleArch: ").append(toIndentedString(isMultipleArch)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    associationImages: ").append(toIndentedString(associationImages)).append("\n");
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
