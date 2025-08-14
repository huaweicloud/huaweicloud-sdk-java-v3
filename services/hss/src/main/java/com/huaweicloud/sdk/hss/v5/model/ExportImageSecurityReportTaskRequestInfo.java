package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像安全报告导出任务请求信息。
 */
public class ExportImageSecurityReportTaskRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_size")

    private Integer exportSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_report_type")

    private String securityReportType;

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

    public ExportImageSecurityReportTaskRequestInfo withExportSize(Integer exportSize) {
        this.exportSize = exportSize;
        return this;
    }

    /**
     * 导出数据条数
     * minimum: 1
     * maximum: 200000
     * @return exportSize
     */
    public Integer getExportSize() {
        return exportSize;
    }

    public void setExportSize(Integer exportSize) {
        this.exportSize = exportSize;
    }

    public ExportImageSecurityReportTaskRequestInfo withSecurityReportType(String securityReportType) {
        this.securityReportType = securityReportType;
        return this;
    }

    /**
     * **参数解释**: 安全报告类型 **约束限制**: 不涉及 **取值范围**: - malwares : 恶意文件信息 - apps : 软件信息 - files : 文件信息 - sensitive-info : 敏感信息 - non-compliant-app : 软件合规信息 - build-command-risks : 镜像构建指令风险 
     * @return securityReportType
     */
    public String getSecurityReportType() {
        return securityReportType;
    }

    public void setSecurityReportType(String securityReportType) {
        this.securityReportType = securityReportType;
    }

    public ExportImageSecurityReportTaskRequestInfo withImageIdList(List<String> imageIdList) {
        this.imageIdList = imageIdList;
        return this;
    }

    public ExportImageSecurityReportTaskRequestInfo addImageIdListItem(String imageIdListItem) {
        if (this.imageIdList == null) {
            this.imageIdList = new ArrayList<>();
        }
        this.imageIdList.add(imageIdListItem);
        return this;
    }

    public ExportImageSecurityReportTaskRequestInfo withImageIdList(Consumer<List<String>> imageIdListSetter) {
        if (this.imageIdList == null) {
            this.imageIdList = new ArrayList<>();
        }
        imageIdListSetter.accept(this.imageIdList);
        return this;
    }

    /**
     * 要导出的镜像id列表。operate_all参数为false时,需要填写此批量查询条件。本地/CICD镜像填写image_id，仓库镜像填写镜像列表返回的id
     * @return imageIdList
     */
    public List<String> getImageIdList() {
        return imageIdList;
    }

    public void setImageIdList(List<String> imageIdList) {
        this.imageIdList = imageIdList;
    }

    public ExportImageSecurityReportTaskRequestInfo withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * 若为true表示查询全量镜像，可传其他参数对全量镜像数据进行筛选
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public ExportImageSecurityReportTaskRequestInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型。导出本地镜像和cicd镜像报告时，需要传参image_type。不传此参数时，默认导出其他仓库镜像数据。 **约束限制**: 不涉及 **取值范围**: - private_image : 私有镜像 - shared_image : 共享镜像 - local_image : 本地镜像 - instance_image : 企业镜像 - harbor : Harbor镜像 - jfrog : Jfrog镜像 - cicd : cicd镜像 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ExportImageSecurityReportTaskRequestInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 扫描状态，包含如下:   - unscan : 未扫描   - success : 扫描完成   - scanning : 扫描中   - failed : 扫描失败   - download_failed : 下载失败   - image_oversized : 镜像超大
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ExportImageSecurityReportTaskRequestInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ExportImageSecurityReportTaskRequestInfo withImageName(String imageName) {
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

    public ExportImageSecurityReportTaskRequestInfo withImageVersion(String imageVersion) {
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

    public ExportImageSecurityReportTaskRequestInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ExportImageSecurityReportTaskRequestInfo withLatestVersion(Boolean latestVersion) {
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

    public ExportImageSecurityReportTaskRequestInfo withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 镜像大小
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

    public ExportImageSecurityReportTaskRequestInfo withStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
        return this;
    }

    /**
     * 创建时间开始日期，时间单位：毫秒（ms）
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

    public ExportImageSecurityReportTaskRequestInfo withEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
        return this;
    }

    /**
     * 创建时间结束日期，时间单位：毫秒（ms）
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

    public ExportImageSecurityReportTaskRequestInfo withStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
        return this;
    }

    /**
     * 最近一次扫描完成时间开始日期，时间单位：毫秒（ms）
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

    public ExportImageSecurityReportTaskRequestInfo withEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
        return this;
    }

    /**
     * 最近一次扫描完成时间结束日期，时间单位：毫秒（ms）
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

    public ExportImageSecurityReportTaskRequestInfo withHasMaliciousFile(Boolean hasMaliciousFile) {
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

    public ExportImageSecurityReportTaskRequestInfo withHasVul(Boolean hasVul) {
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

    public ExportImageSecurityReportTaskRequestInfo withHasUnsafeSetting(Boolean hasUnsafeSetting) {
        this.hasUnsafeSetting = hasUnsafeSetting;
        return this;
    }

    /**
     * 是否存在基线检查
     * @return hasUnsafeSetting
     */
    public Boolean getHasUnsafeSetting() {
        return hasUnsafeSetting;
    }

    public void setHasUnsafeSetting(Boolean hasUnsafeSetting) {
        this.hasUnsafeSetting = hasUnsafeSetting;
    }

    public ExportImageSecurityReportTaskRequestInfo withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * 是否有安全风险，包含如下:   - true : 有风险   - false : 无风险
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public ExportImageSecurityReportTaskRequestInfo withSeverityLevel(String severityLevel) {
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

    public ExportImageSecurityReportTaskRequestInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 企业镜像实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ExportImageSecurityReportTaskRequestInfo withCicdName(String cicdName) {
        this.cicdName = cicdName;
        return this;
    }

    /**
     * cicd名称
     * @return cicdName
     */
    public String getCicdName() {
        return cicdName;
    }

    public void setCicdName(String cicdName) {
        this.cicdName = cicdName;
    }

    public ExportImageSecurityReportTaskRequestInfo withBuildCommandRiskLevel(String buildCommandRiskLevel) {
        this.buildCommandRiskLevel = buildCommandRiskLevel;
        return this;
    }

    /**
     * **参数解释**: 构建指令风险程度 **约束限制**: 不涉及 **取值范围**: - critical ：严重 - high ：高危 - medium ：中危 - low ：低危  **默认取值**: 不涉及 
     * @return buildCommandRiskLevel
     */
    public String getBuildCommandRiskLevel() {
        return buildCommandRiskLevel;
    }

    public void setBuildCommandRiskLevel(String buildCommandRiskLevel) {
        this.buildCommandRiskLevel = buildCommandRiskLevel;
    }

    public ExportImageSecurityReportTaskRequestInfo withBuildCommandRiskName(String buildCommandRiskName) {
        this.buildCommandRiskName = buildCommandRiskName;
        return this;
    }

    /**
     * 构建指令风险名称
     * @return buildCommandRiskName
     */
    public String getBuildCommandRiskName() {
        return buildCommandRiskName;
    }

    public void setBuildCommandRiskName(String buildCommandRiskName) {
        this.buildCommandRiskName = buildCommandRiskName;
    }

    public ExportImageSecurityReportTaskRequestInfo withBuildCommandRuleIdList(List<String> buildCommandRuleIdList) {
        this.buildCommandRuleIdList = buildCommandRuleIdList;
        return this;
    }

    public ExportImageSecurityReportTaskRequestInfo addBuildCommandRuleIdListItem(String buildCommandRuleIdListItem) {
        if (this.buildCommandRuleIdList == null) {
            this.buildCommandRuleIdList = new ArrayList<>();
        }
        this.buildCommandRuleIdList.add(buildCommandRuleIdListItem);
        return this;
    }

    public ExportImageSecurityReportTaskRequestInfo withBuildCommandRuleIdList(
        Consumer<List<String>> buildCommandRuleIdListSetter) {
        if (this.buildCommandRuleIdList == null) {
            this.buildCommandRuleIdList = new ArrayList<>();
        }
        buildCommandRuleIdListSetter.accept(this.buildCommandRuleIdList);
        return this;
    }

    /**
     * 要导出的构建指令风险检测规则id列表。rule_id的值可以从接口/v5/{project_id}/image/build-command-risks的返回参数获取
     * @return buildCommandRuleIdList
     */
    public List<String> getBuildCommandRuleIdList() {
        return buildCommandRuleIdList;
    }

    public void setBuildCommandRuleIdList(List<String> buildCommandRuleIdList) {
        this.buildCommandRuleIdList = buildCommandRuleIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportImageSecurityReportTaskRequestInfo that = (ExportImageSecurityReportTaskRequestInfo) obj;
        return Objects.equals(this.exportSize, that.exportSize)
            && Objects.equals(this.securityReportType, that.securityReportType)
            && Objects.equals(this.imageIdList, that.imageIdList) && Objects.equals(this.operateAll, that.operateAll)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.latestVersion, that.latestVersion) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.startLatestUpdateTime, that.startLatestUpdateTime)
            && Objects.equals(this.endLatestUpdateTime, that.endLatestUpdateTime)
            && Objects.equals(this.startLatestScanTime, that.startLatestScanTime)
            && Objects.equals(this.endLatestScanTime, that.endLatestScanTime)
            && Objects.equals(this.hasMaliciousFile, that.hasMaliciousFile) && Objects.equals(this.hasVul, that.hasVul)
            && Objects.equals(this.hasUnsafeSetting, that.hasUnsafeSetting) && Objects.equals(this.risky, that.risky)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.cicdName, that.cicdName)
            && Objects.equals(this.buildCommandRiskLevel, that.buildCommandRiskLevel)
            && Objects.equals(this.buildCommandRiskName, that.buildCommandRiskName)
            && Objects.equals(this.buildCommandRuleIdList, that.buildCommandRuleIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportSize,
            securityReportType,
            imageIdList,
            operateAll,
            imageType,
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
            cicdName,
            buildCommandRiskLevel,
            buildCommandRiskName,
            buildCommandRuleIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportImageSecurityReportTaskRequestInfo {\n");
        sb.append("    exportSize: ").append(toIndentedString(exportSize)).append("\n");
        sb.append("    securityReportType: ").append(toIndentedString(securityReportType)).append("\n");
        sb.append("    imageIdList: ").append(toIndentedString(imageIdList)).append("\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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
        sb.append("    cicdName: ").append(toIndentedString(cicdName)).append("\n");
        sb.append("    buildCommandRiskLevel: ").append(toIndentedString(buildCommandRiskLevel)).append("\n");
        sb.append("    buildCommandRiskName: ").append(toIndentedString(buildCommandRiskName)).append("\n");
        sb.append("    buildCommandRuleIdList: ").append(toIndentedString(buildCommandRuleIdList)).append("\n");
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
