package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportBaselineRequestBody
 */
public class ExportBaselineRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_size")

    private Integer exportSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_result")

    private String scanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_headers")

    private List<List<String>> exportHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_scan_result")

    private String statisticsScanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public ExportBaselineRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 导出类型 **约束限制**： 不涉及 **取值范围**： - risk-config : 基线配置检测 - password-complexity : 口令复杂度检测 - weak-password : 弱口令检测  **默认取值**： risk-config
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ExportBaselineRequestBody withExportSize(Integer exportSize) {
        this.exportSize = exportSize;
        return this;
    }

    /**
     * **参数解释** 导出数据条数 **约束限制** 不涉及 **取值范围**  取值 1 - 200000  **默认取值** 100000
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

    public ExportBaselineRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 策略组id **约束限制**： 不涉及 **取值范围**： 字符长度0-128位  **默认取值**: 不涉及 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ExportBaselineRequestBody withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**： 配置检查（基线）的名称，例如SSH、CentOS 7、Windows **约束限制**： 不涉及 **取值范围**： 字符长度0-256位  **默认取值**: 不涉及 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ExportBaselineRequestBody withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释**： 标准类型 **约束限制**： 不涉及 **取值范围**： - cn_standard ： 等保合规标准 - hw_standard ： 云安全实践标准 - cis_standard ： 通用安全标准  **默认取值**: 不涉及 
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ExportBaselineRequestBody withScanResult(String scanResult) {
        this.scanResult = scanResult;
        return this;
    }

    /**
     * **参数解释**： 检查结果 **约束限制**： 不涉及 **取值范围** - pass : 检查通过 - failed : 检查未通过(已废弃) - unhandled: 未通过  **默认取值** 不涉及 
     * @return scanResult
     */
    public String getScanResult() {
        return scanResult;
    }

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }

    public ExportBaselineRequestBody withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险等级 **约束限制**： 不涉及 **取值范围** - Security: 无风险 - Low : 低危 - Medium : 中危 - High: 高危  **默认取值** 不涉及 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ExportBaselineRequestBody withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID，不赋值时，查租户所有主机 **约束限制**： 不涉及 **取值范围**： 字符长度0-64位  **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ExportBaselineRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ExportBaselineRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置
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

    public ExportBaselineRequestBody withExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
        return this;
    }

    public ExportBaselineRequestBody addExportHeadersItem(List<String> exportHeadersItem) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        this.exportHeaders.add(exportHeadersItem);
        return this;
    }

    public ExportBaselineRequestBody withExportHeaders(Consumer<List<List<String>>> exportHeadersSetter) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        exportHeadersSetter.accept(this.exportHeaders);
        return this;
    }

    /**
     * 导出配置检测数据的表头信息列表
     * @return exportHeaders
     */
    public List<List<String>> getExportHeaders() {
        return exportHeaders;
    }

    public void setExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
    }

    public ExportBaselineRequestBody withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释** 基线检查项的类型 **约束限制** 不涉及 **取值范围** 字符长度0-256位 **默认取值** 不涉及
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ExportBaselineRequestBody withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）的名称，例如SSH、CentOS 7、Windows **约束限制** 不涉及 **取值范围** 字符长度0-256位 **默认取值** 不涉及
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ExportBaselineRequestBody withStatisticsScanResult(String statisticsScanResult) {
        this.statisticsScanResult = statisticsScanResult;
        return this;
    }

    /**
     * **参数解释** 统计结果类型，包含如下： **约束限制** 不涉及 **取值范围** - pass      : 已通过，表示查看主机全部通过的检查项 - failed    : 未通过，表示查看主机全部未通过 & 全部未处理的检查项 - processed : 已处理，表示查看主机存在未通过 & 未通过主机已全部处理(忽略、加白)的检查项  **默认取值** 不涉及
     * @return statisticsScanResult
     */
    public String getStatisticsScanResult() {
        return statisticsScanResult;
    }

    public void setStatisticsScanResult(String statisticsScanResult) {
        this.statisticsScanResult = statisticsScanResult;
    }

    public ExportBaselineRequestBody withCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
        return this;
    }

    /**
     * **参数解释** 检查项（检查规则）名称，支持模糊匹配 **约束限制** 不涉及 **取值范围** 字符长度0-2048位 **默认取值** 不涉及
     * @return checkRuleName
     */
    public String getCheckRuleName() {
        return checkRuleName;
    }

    public void setCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
    }

    public ExportBaselineRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释** 集群ID **约束限制** 不涉及 **取值范围** 字符长度0-64位 **默认取值** 不涉及
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportBaselineRequestBody that = (ExportBaselineRequestBody) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.exportSize, that.exportSize)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.standard, that.standard) && Objects.equals(this.scanResult, that.scanResult)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.exportHeaders, that.exportHeaders) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.checkType, that.checkType)
            && Objects.equals(this.statisticsScanResult, that.statisticsScanResult)
            && Objects.equals(this.checkRuleName, that.checkRuleName) && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            exportSize,
            groupId,
            checkName,
            standard,
            scanResult,
            severity,
            hostId,
            limit,
            offset,
            exportHeaders,
            tag,
            checkType,
            statisticsScanResult,
            checkRuleName,
            clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportBaselineRequestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    exportSize: ").append(toIndentedString(exportSize)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    scanResult: ").append(toIndentedString(scanResult)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    exportHeaders: ").append(toIndentedString(exportHeaders)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    statisticsScanResult: ").append(toIndentedString(statisticsScanResult)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
