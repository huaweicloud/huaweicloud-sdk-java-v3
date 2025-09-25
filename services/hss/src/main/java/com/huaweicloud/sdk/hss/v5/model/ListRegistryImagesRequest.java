package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRegistryImagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private Boolean latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_latest_update_time")

    private Long startLatestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_latest_update_time")

    private Long endLatestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_latest_scan_time")

    private Long startLatestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_latest_scan_time")

    private Long endLatestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_latest_sync_time")

    private Long startLatestSyncTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_latest_sync_time")

    private Long endLatestSyncTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_malicious_file")

    private Boolean hasMaliciousFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_unsafe_setting")

    private Boolean hasUnsafeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_vul")

    private Boolean hasVul;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky")

    private Boolean risky;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multarch")

    private Boolean isMultarch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    public ListRegistryImagesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListRegistryImagesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位。  **默认取值**: 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListRegistryImagesRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度1-128位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListRegistryImagesRequest withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本 **取值范围**: 字符长度1-64位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ListRegistryImagesRequest withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**: 仓库名称 **取值范围**: 字符长度1-128位 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public ListRegistryImagesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRegistryImagesRequest withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型 **约束限制**: 不涉及 **取值范围**: - private_image：SWR私有镜像。 - shared_image：SWR共享镜像。 - instance_image：SWR企业版镜像。 - harbor：Harbor仓库镜像。 - jfrog：Jfrog镜像。  **默认取值**: 不涉及 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ListRegistryImagesRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**: 可排序字段 **约束限制**: 不涉及 **取值范围**: - latest_scan_time：最近扫描时间。  **默认取值**: 不涉及 
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListRegistryImagesRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**: 排序的顺序 **约束限制**: 不涉及 **取值范围**:   - asc  : 正序   - desc : 倒序  **默认取值**: 正序排序 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListRegistryImagesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值1-200 **默认取值**: 10 
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRegistryImagesRequest withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 仅关注最新版本镜像
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ListRegistryImagesRequest withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释**: 镜像大小 **约束限制**: 不涉及 **取值范围**: 取值0-2147483547 **默认取值**: 不涉及 
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

    public ListRegistryImagesRequest withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释**: 扫描状态 **约束限制**: 不涉及 **取值范围**: - unscan：未扫描。 - success：扫描完成。 - scanning：扫描中。 - failed：扫描失败。 - waiting_for_scan：等待扫描。  **默认取值**: 不涉及 
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ListRegistryImagesRequest withStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间开始日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startLatestUpdateTime
     */
    public Long getStartLatestUpdateTime() {
        return startLatestUpdateTime;
    }

    public void setStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
    }

    public ListRegistryImagesRequest withEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间结束日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endLatestUpdateTime
     */
    public Long getEndLatestUpdateTime() {
        return endLatestUpdateTime;
    }

    public void setEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
    }

    public ListRegistryImagesRequest withStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近一次扫描完成时间开始日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startLatestScanTime
     */
    public Long getStartLatestScanTime() {
        return startLatestScanTime;
    }

    public void setStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
    }

    public ListRegistryImagesRequest withEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近一次扫描完成时间结束日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endLatestScanTime
     */
    public Long getEndLatestScanTime() {
        return endLatestScanTime;
    }

    public void setEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
    }

    public ListRegistryImagesRequest withStartLatestSyncTime(Long startLatestSyncTime) {
        this.startLatestSyncTime = startLatestSyncTime;
        return this;
    }

    /**
     * **参数解释**: 最近一次同步完成时间开始日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startLatestSyncTime
     */
    public Long getStartLatestSyncTime() {
        return startLatestSyncTime;
    }

    public void setStartLatestSyncTime(Long startLatestSyncTime) {
        this.startLatestSyncTime = startLatestSyncTime;
    }

    public ListRegistryImagesRequest withEndLatestSyncTime(Long endLatestSyncTime) {
        this.endLatestSyncTime = endLatestSyncTime;
        return this;
    }

    /**
     * **参数解释**: 最近一次同步完成时间结束日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endLatestSyncTime
     */
    public Long getEndLatestSyncTime() {
        return endLatestSyncTime;
    }

    public void setEndLatestSyncTime(Long endLatestSyncTime) {
        this.endLatestSyncTime = endLatestSyncTime;
    }

    public ListRegistryImagesRequest withHasMaliciousFile(Boolean hasMaliciousFile) {
        this.hasMaliciousFile = hasMaliciousFile;
        return this;
    }

    /**
     * 是否存在恶意文件
     * @return hasMaliciousFile
     */
    public Boolean getHasMaliciousFile() {
        return hasMaliciousFile;
    }

    public void setHasMaliciousFile(Boolean hasMaliciousFile) {
        this.hasMaliciousFile = hasMaliciousFile;
    }

    public ListRegistryImagesRequest withHasUnsafeSetting(Boolean hasUnsafeSetting) {
        this.hasUnsafeSetting = hasUnsafeSetting;
        return this;
    }

    /**
     * 是否存在基线检查风险
     * @return hasUnsafeSetting
     */
    public Boolean getHasUnsafeSetting() {
        return hasUnsafeSetting;
    }

    public void setHasUnsafeSetting(Boolean hasUnsafeSetting) {
        this.hasUnsafeSetting = hasUnsafeSetting;
    }

    public ListRegistryImagesRequest withHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
        return this;
    }

    /**
     * 是否存在软件漏洞
     * @return hasVul
     */
    public Boolean getHasVul() {
        return hasVul;
    }

    public void setHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
    }

    public ListRegistryImagesRequest withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * 有安全风险
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public ListRegistryImagesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 企业仓库实例ID，SWR企业版可以使用该参数 **约束限制**： 不涉及 **取值范围**： 字符长度0-128位 **默认取值**： 不涉及 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListRegistryImagesRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**： 企业镜像实例名称，SWR企业版可以使用该参数 **约束限制**： 不涉及 **取值范围**： 字符长度0-128位 **默认取值**： 不涉及 
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListRegistryImagesRequest withIsMultarch(Boolean isMultarch) {
        this.isMultarch = isMultarch;
        return this;
    }

    /**
     * 是否是多架构镜像
     * @return isMultarch
     */
    public Boolean getIsMultarch() {
        return isMultarch;
    }

    public void setIsMultarch(Boolean isMultarch) {
        this.isMultarch = isMultarch;
    }

    public ListRegistryImagesRequest withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**: 镜像风险程度，在镜像扫描完成后展示 **约束限制**: 不涉及 **取值范围**: - Security：安全。 - Low：低危。 - Medium：中危。 - High：高危。  **默认取值**: 不涉及 
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
        ListRegistryImagesRequest that = (ListRegistryImagesRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.registryName, that.registryName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.latestVersion, that.latestVersion) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.startLatestUpdateTime, that.startLatestUpdateTime)
            && Objects.equals(this.endLatestUpdateTime, that.endLatestUpdateTime)
            && Objects.equals(this.startLatestScanTime, that.startLatestScanTime)
            && Objects.equals(this.endLatestScanTime, that.endLatestScanTime)
            && Objects.equals(this.startLatestSyncTime, that.startLatestSyncTime)
            && Objects.equals(this.endLatestSyncTime, that.endLatestSyncTime)
            && Objects.equals(this.hasMaliciousFile, that.hasMaliciousFile)
            && Objects.equals(this.hasUnsafeSetting, that.hasUnsafeSetting) && Objects.equals(this.hasVul, that.hasVul)
            && Objects.equals(this.risky, that.risky) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.isMultarch, that.isMultarch)
            && Objects.equals(this.severityLevel, that.severityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            namespace,
            imageName,
            imageVersion,
            registryName,
            offset,
            imageType,
            sortKey,
            sortDir,
            limit,
            latestVersion,
            imageSize,
            scanStatus,
            startLatestUpdateTime,
            endLatestUpdateTime,
            startLatestScanTime,
            endLatestScanTime,
            startLatestSyncTime,
            endLatestSyncTime,
            hasMaliciousFile,
            hasUnsafeSetting,
            hasVul,
            risky,
            instanceId,
            instanceName,
            isMultarch,
            severityLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegistryImagesRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    startLatestUpdateTime: ").append(toIndentedString(startLatestUpdateTime)).append("\n");
        sb.append("    endLatestUpdateTime: ").append(toIndentedString(endLatestUpdateTime)).append("\n");
        sb.append("    startLatestScanTime: ").append(toIndentedString(startLatestScanTime)).append("\n");
        sb.append("    endLatestScanTime: ").append(toIndentedString(endLatestScanTime)).append("\n");
        sb.append("    startLatestSyncTime: ").append(toIndentedString(startLatestSyncTime)).append("\n");
        sb.append("    endLatestSyncTime: ").append(toIndentedString(endLatestSyncTime)).append("\n");
        sb.append("    hasMaliciousFile: ").append(toIndentedString(hasMaliciousFile)).append("\n");
        sb.append("    hasUnsafeSetting: ").append(toIndentedString(hasUnsafeSetting)).append("\n");
        sb.append("    hasVul: ").append(toIndentedString(hasVul)).append("\n");
        sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    isMultarch: ").append(toIndentedString(isMultarch)).append("\n");
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
