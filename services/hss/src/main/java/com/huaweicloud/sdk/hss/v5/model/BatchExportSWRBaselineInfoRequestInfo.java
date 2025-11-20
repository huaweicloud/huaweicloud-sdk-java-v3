package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作的事件
 */
public class BatchExportSWRBaselineInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id_list")

    private List<String> imageIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_type")

    private String vulType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

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
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private Boolean latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

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
    @JsonProperty(value = "has_malicious_file")

    private Boolean hasMaliciousFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_vul")

    private Boolean hasVul;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_unsafe_setting")

    private Boolean hasUnsafeSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky")

    private Boolean risky;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_name")

    private String cicdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_command_risk_level")

    private String buildCommandRiskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_command_risk_name")

    private String buildCommandRiskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_command_rule_id_list")

    private List<String> buildCommandRuleIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_container")

    private Boolean hasContainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id_list")

    private List<String> vulIdList = null;

    public BatchExportSWRBaselineInfoRequestInfo withImageIdList(List<String> imageIdList) {
        this.imageIdList = imageIdList;
        return this;
    }

    public BatchExportSWRBaselineInfoRequestInfo addImageIdListItem(String imageIdListItem) {
        if (this.imageIdList == null) {
            this.imageIdList = new ArrayList<>();
        }
        this.imageIdList.add(imageIdListItem);
        return this;
    }

    public BatchExportSWRBaselineInfoRequestInfo withImageIdList(Consumer<List<String>> imageIdListSetter) {
        if (this.imageIdList == null) {
            this.imageIdList = new ArrayList<>();
        }
        imageIdListSetter.accept(this.imageIdList);
        return this;
    }

    /**
     * **参数解释**: 要导出的镜像信息列表，operate_all参数为false时需要填写批量查询条件,image_id 镜像id，唯一镜像标识（注：对私有镜像和共享镜像来说是镜像列表返回的id） **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2147483647 **默认取值**: 不涉及 
     * @return imageIdList
     */
    public List<String> getImageIdList() {
        return imageIdList;
    }

    public void setImageIdList(List<String> imageIdList) {
        this.imageIdList = imageIdList;
    }

    public BatchExportSWRBaselineInfoRequestInfo withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * **参数解释**： 若为true全量查询，可筛选条件全部查询 **约束限制**: 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public BatchExportSWRBaselineInfoRequestInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型 **约束限制**: 不涉及 **取值范围**: - private_image: 私有镜像。 - shared_image: 共享镜像。 - local_image: 本地镜像。 - instance_image: 企业镜像。 - harbor: Harbor镜像。 - jfrog: Jfrog镜像。 - cicd: cicd镜像。  **默认取值**: 不涉及 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public BatchExportSWRBaselineInfoRequestInfo withVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * **参数解释**: 漏洞类型 **约束限制**: 不涉及 **取值范围**: - linux_vul : linux漏洞。 - app_vul : 应用漏洞。  **默认取值**: 不涉及 
     * @return vulType
     */
    public String getVulType() {
        return vulType;
    }

    public void setVulType(String vulType) {
        this.vulType = vulType;
    }

    public BatchExportSWRBaselineInfoRequestInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释**: 扫描状态 **约束限制**: 不涉及 **取值范围**: - unscan: 未扫描。 - success: 扫描完成。 - scanning: 扫描中。 - failed: 扫描失败。 - download_failed: 下载失败。 - image_oversized: 镜像超大。  **默认取值**: 不涉及 
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public BatchExportSWRBaselineInfoRequestInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称（只有私有镜像和共享镜像有该字段，本地镜像没有） **约束限制**: 不涉及 **取值范围**: 字符长度0-65535位 **默认取值**: 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public BatchExportSWRBaselineInfoRequestInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-65535位 **默认取值**: 不涉及 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public BatchExportSWRBaselineInfoRequestInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-65535位 **默认取值**: 不涉及 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public BatchExportSWRBaselineInfoRequestInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public BatchExportSWRBaselineInfoRequestInfo withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释**： 仅关注最新版本镜像 **约束限制**: 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public BatchExportSWRBaselineInfoRequestInfo withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释**: 镜像大小 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2147483547 **默认取值**: 不涉及 
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

    public BatchExportSWRBaselineInfoRequestInfo withStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间开始日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2147483547 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 2147483547
     * @return startLatestUpdateTime
     */
    public Long getStartLatestUpdateTime() {
        return startLatestUpdateTime;
    }

    public void setStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
    }

    public BatchExportSWRBaselineInfoRequestInfo withEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间结束日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2147483547 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 2147483547
     * @return endLatestUpdateTime
     */
    public Long getEndLatestUpdateTime() {
        return endLatestUpdateTime;
    }

    public void setEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
    }

    public BatchExportSWRBaselineInfoRequestInfo withStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近一次扫描完成时间开始日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2147483547 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 2147483547
     * @return startLatestScanTime
     */
    public Long getStartLatestScanTime() {
        return startLatestScanTime;
    }

    public void setStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
    }

    public BatchExportSWRBaselineInfoRequestInfo withEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近一次扫描完成时间结束日期，时间单位 毫秒（ms） **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2147483547 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 2147483547
     * @return endLatestScanTime
     */
    public Long getEndLatestScanTime() {
        return endLatestScanTime;
    }

    public void setEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
    }

    public BatchExportSWRBaselineInfoRequestInfo withHasMaliciousFile(Boolean hasMaliciousFile) {
        this.hasMaliciousFile = hasMaliciousFile;
        return this;
    }

    /**
     * **参数解释**： 是否存在恶意文件 **约束限制**: 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return hasMaliciousFile
     */
    public Boolean getHasMaliciousFile() {
        return hasMaliciousFile;
    }

    public void setHasMaliciousFile(Boolean hasMaliciousFile) {
        this.hasMaliciousFile = hasMaliciousFile;
    }

    public BatchExportSWRBaselineInfoRequestInfo withHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
        return this;
    }

    /**
     * **参数解释**： 是否存在软件漏洞 **约束限制**: 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return hasVul
     */
    public Boolean getHasVul() {
        return hasVul;
    }

    public void setHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
    }

    public BatchExportSWRBaselineInfoRequestInfo withHasUnsafeSetting(Boolean hasUnsafeSetting) {
        this.hasUnsafeSetting = hasUnsafeSetting;
        return this;
    }

    /**
     * **参数解释**： 是否存在基线检查 **约束限制**: 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return hasUnsafeSetting
     */
    public Boolean getHasUnsafeSetting() {
        return hasUnsafeSetting;
    }

    public void setHasUnsafeSetting(Boolean hasUnsafeSetting) {
        this.hasUnsafeSetting = hasUnsafeSetting;
    }

    public BatchExportSWRBaselineInfoRequestInfo withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * **参数解释**： 是否有安全风险 **约束限制**: 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public BatchExportSWRBaselineInfoRequestInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**: 镜像风险程度，在镜像扫描完成后展示 **约束限制**: 不涉及 **取值范围**: - Security : 安全。 - Low : 低危。 - Medium : 中危。 - High : 高危。  **默认取值**: 不涉及 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public BatchExportSWRBaselineInfoRequestInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**: 企业镜像实例名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public BatchExportSWRBaselineInfoRequestInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 企业仓库实例ID **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchExportSWRBaselineInfoRequestInfo withCicdName(String cicdName) {
        this.cicdName = cicdName;
        return this;
    }

    /**
     * **参数解释**: cicd名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return cicdName
     */
    public String getCicdName() {
        return cicdName;
    }

    public void setCicdName(String cicdName) {
        this.cicdName = cicdName;
    }

    public BatchExportSWRBaselineInfoRequestInfo withBuildCommandRiskLevel(String buildCommandRiskLevel) {
        this.buildCommandRiskLevel = buildCommandRiskLevel;
        return this;
    }

    /**
     * **参数解释**: 构建指令风险程度 **约束限制**: 不涉及 **取值范围**: - critical ：严重。 - high ：高危。 - medium ：中危。 - low ：低危。  **默认取值**: 不涉及 
     * @return buildCommandRiskLevel
     */
    public String getBuildCommandRiskLevel() {
        return buildCommandRiskLevel;
    }

    public void setBuildCommandRiskLevel(String buildCommandRiskLevel) {
        this.buildCommandRiskLevel = buildCommandRiskLevel;
    }

    public BatchExportSWRBaselineInfoRequestInfo withBuildCommandRiskName(String buildCommandRiskName) {
        this.buildCommandRiskName = buildCommandRiskName;
        return this;
    }

    /**
     * **参数解释**: 构建指令风险名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return buildCommandRiskName
     */
    public String getBuildCommandRiskName() {
        return buildCommandRiskName;
    }

    public void setBuildCommandRiskName(String buildCommandRiskName) {
        this.buildCommandRiskName = buildCommandRiskName;
    }

    public BatchExportSWRBaselineInfoRequestInfo withBuildCommandRuleIdList(List<String> buildCommandRuleIdList) {
        this.buildCommandRuleIdList = buildCommandRuleIdList;
        return this;
    }

    public BatchExportSWRBaselineInfoRequestInfo addBuildCommandRuleIdListItem(String buildCommandRuleIdListItem) {
        if (this.buildCommandRuleIdList == null) {
            this.buildCommandRuleIdList = new ArrayList<>();
        }
        this.buildCommandRuleIdList.add(buildCommandRuleIdListItem);
        return this;
    }

    public BatchExportSWRBaselineInfoRequestInfo withBuildCommandRuleIdList(
        Consumer<List<String>> buildCommandRuleIdListSetter) {
        if (this.buildCommandRuleIdList == null) {
            this.buildCommandRuleIdList = new ArrayList<>();
        }
        buildCommandRuleIdListSetter.accept(this.buildCommandRuleIdList);
        return this;
    }

    /**
     * **参数解释**: 要导出的构建指令风险检测规则id列表。rule_id的值可以从接口/v5/{project_id}/image/build-command-risks的返回参数获取 **约束限制**: 不涉及 **取值范围**: 字符长度1-200位 **默认取值**: 不涉及 
     * @return buildCommandRuleIdList
     */
    public List<String> getBuildCommandRuleIdList() {
        return buildCommandRuleIdList;
    }

    public void setBuildCommandRuleIdList(List<String> buildCommandRuleIdList) {
        this.buildCommandRuleIdList = buildCommandRuleIdList;
    }

    public BatchExportSWRBaselineInfoRequestInfo withHasContainer(Boolean hasContainer) {
        this.hasContainer = hasContainer;
        return this;
    }

    /**
     * **参数解释**： 是否存在容器 **约束限制**: 不涉及 **取值范围**： - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return hasContainer
     */
    public Boolean getHasContainer() {
        return hasContainer;
    }

    public void setHasContainer(Boolean hasContainer) {
        this.hasContainer = hasContainer;
    }

    public BatchExportSWRBaselineInfoRequestInfo withVulIdList(List<String> vulIdList) {
        this.vulIdList = vulIdList;
        return this;
    }

    public BatchExportSWRBaselineInfoRequestInfo addVulIdListItem(String vulIdListItem) {
        if (this.vulIdList == null) {
            this.vulIdList = new ArrayList<>();
        }
        this.vulIdList.add(vulIdListItem);
        return this;
    }

    public BatchExportSWRBaselineInfoRequestInfo withVulIdList(Consumer<List<String>> vulIdListSetter) {
        if (this.vulIdList == null) {
            this.vulIdList = new ArrayList<>();
        }
        vulIdListSetter.accept(this.vulIdList);
        return this;
    }

    /**
     * **参数解释**: 导出镜像漏洞时的漏洞id列表 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2048 **默认取值**: 不涉及 
     * @return vulIdList
     */
    public List<String> getVulIdList() {
        return vulIdList;
    }

    public void setVulIdList(List<String> vulIdList) {
        this.vulIdList = vulIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchExportSWRBaselineInfoRequestInfo that = (BatchExportSWRBaselineInfoRequestInfo) obj;
        return Objects.equals(this.imageIdList, that.imageIdList) && Objects.equals(this.operateAll, that.operateAll)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.vulType, that.vulType)
            && Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.startLatestUpdateTime, that.startLatestUpdateTime)
            && Objects.equals(this.endLatestUpdateTime, that.endLatestUpdateTime)
            && Objects.equals(this.startLatestScanTime, that.startLatestScanTime)
            && Objects.equals(this.endLatestScanTime, that.endLatestScanTime)
            && Objects.equals(this.hasMaliciousFile, that.hasMaliciousFile) && Objects.equals(this.hasVul, that.hasVul)
            && Objects.equals(this.hasUnsafeSetting, that.hasUnsafeSetting) && Objects.equals(this.risky, that.risky)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.cicdName, that.cicdName)
            && Objects.equals(this.buildCommandRiskLevel, that.buildCommandRiskLevel)
            && Objects.equals(this.buildCommandRiskName, that.buildCommandRiskName)
            && Objects.equals(this.buildCommandRuleIdList, that.buildCommandRuleIdList)
            && Objects.equals(this.hasContainer, that.hasContainer) && Objects.equals(this.vulIdList, that.vulIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageIdList,
            operateAll,
            imageType,
            vulType,
            scanStatus,
            namespace,
            imageName,
            imageVersion,
            imageId,
            latestVersion,
            imageSize,
            startLatestUpdateTime,
            endLatestUpdateTime,
            startLatestScanTime,
            endLatestScanTime,
            hasMaliciousFile,
            hasVul,
            hasUnsafeSetting,
            risky,
            severityLevel,
            instanceName,
            instanceId,
            cicdName,
            buildCommandRiskLevel,
            buildCommandRiskName,
            buildCommandRuleIdList,
            hasContainer,
            vulIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchExportSWRBaselineInfoRequestInfo {\n");
        sb.append("    imageIdList: ").append(toIndentedString(imageIdList)).append("\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    startLatestUpdateTime: ").append(toIndentedString(startLatestUpdateTime)).append("\n");
        sb.append("    endLatestUpdateTime: ").append(toIndentedString(endLatestUpdateTime)).append("\n");
        sb.append("    startLatestScanTime: ").append(toIndentedString(startLatestScanTime)).append("\n");
        sb.append("    endLatestScanTime: ").append(toIndentedString(endLatestScanTime)).append("\n");
        sb.append("    hasMaliciousFile: ").append(toIndentedString(hasMaliciousFile)).append("\n");
        sb.append("    hasVul: ").append(toIndentedString(hasVul)).append("\n");
        sb.append("    hasUnsafeSetting: ").append(toIndentedString(hasUnsafeSetting)).append("\n");
        sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    cicdName: ").append(toIndentedString(cicdName)).append("\n");
        sb.append("    buildCommandRiskLevel: ").append(toIndentedString(buildCommandRiskLevel)).append("\n");
        sb.append("    buildCommandRiskName: ").append(toIndentedString(buildCommandRiskName)).append("\n");
        sb.append("    buildCommandRuleIdList: ").append(toIndentedString(buildCommandRuleIdList)).append("\n");
        sb.append("    hasContainer: ").append(toIndentedString(hasContainer)).append("\n");
        sb.append("    vulIdList: ").append(toIndentedString(vulIdList)).append("\n");
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
