package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导出的配置检测信息
 */
public class ExportSecurityCheckInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_public_ip")

    private String hostPublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_private_ip")

    private String hostPrivateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executable_file_path")

    private String executableFilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_result")

    private String scanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_desc")

    private String checkRuleDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit")

    private String audit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private String remediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_info_list")

    private String checkInfoList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public ExportSecurityCheckInfoResponseInfo withHostId(String hostId) {
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

    public ExportSecurityCheckInfoResponseInfo withHostName(String hostName) {
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

    public ExportSecurityCheckInfoResponseInfo withHostPublicIp(String hostPublicIp) {
        this.hostPublicIp = hostPublicIp;
        return this;
    }

    /**
     * 服务器公网IP
     * @return hostPublicIp
     */
    public String getHostPublicIp() {
        return hostPublicIp;
    }

    public void setHostPublicIp(String hostPublicIp) {
        this.hostPublicIp = hostPublicIp;
    }

    public ExportSecurityCheckInfoResponseInfo withHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
        return this;
    }

    /**
     * 服务器私网IP
     * @return hostPrivateIp
     */
    public String getHostPrivateIp() {
        return hostPrivateIp;
    }

    public void setHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
    }

    public ExportSecurityCheckInfoResponseInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * 配置检查（基线）的类型,Linux系统支持的基线一般check_type和check_name相同,例如SSH、CentOS 7。 Windows系统支持的基线一般check_type和check_name不相同，例如check_name为Windows的配置检查（基线），它的check_type包含Windows Server 2019 R2、Windows Server 2016 R2等。
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ExportSecurityCheckInfoResponseInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * 配置检查（基线）的名称，例如SSH、CentOS 7、Windows
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ExportSecurityCheckInfoResponseInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * 基线标准 - cn_standard#等保合规标准 - hw_standard#云安全实践标准
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ExportSecurityCheckInfoResponseInfo withCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
        return this;
    }

    /**
     * 检查项（检查规则）名称
     * @return checkRuleName
     */
    public String getCheckRuleName() {
        return checkRuleName;
    }

    public void setCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
    }

    public ExportSecurityCheckInfoResponseInfo withExecutableFilePath(String executableFilePath) {
        this.executableFilePath = executableFilePath;
        return this;
    }

    /**
     * 配置检查（基线）的路径信息
     * @return executableFilePath
     */
    public String getExecutableFilePath() {
        return executableFilePath;
    }

    public void setExecutableFilePath(String executableFilePath) {
        this.executableFilePath = executableFilePath;
    }

    public ExportSecurityCheckInfoResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 风险等级，包含如下:   - Low : 低危   - Medium : 中危   - High : 高危
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ExportSecurityCheckInfoResponseInfo withScanResult(String scanResult) {
        this.scanResult = scanResult;
        return this;
    }

    /**
     * 检测结果  - pass - failed
     * @return scanResult
     */
    public String getScanResult() {
        return scanResult;
    }

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }

    public ExportSecurityCheckInfoResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态  - safe : 无需处理 - ignored : 已忽略 - unhandled : 未处理
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExportSecurityCheckInfoResponseInfo withCheckRuleDesc(String checkRuleDesc) {
        this.checkRuleDesc = checkRuleDesc;
        return this;
    }

    /**
     * 规则描述
     * @return checkRuleDesc
     */
    public String getCheckRuleDesc() {
        return checkRuleDesc;
    }

    public void setCheckRuleDesc(String checkRuleDesc) {
        this.checkRuleDesc = checkRuleDesc;
    }

    public ExportSecurityCheckInfoResponseInfo withAudit(String audit) {
        this.audit = audit;
        return this;
    }

    /**
     * 审计描述
     * @return audit
     */
    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public ExportSecurityCheckInfoResponseInfo withRemediation(String remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * 修改建议
     * @return remediation
     */
    public String getRemediation() {
        return remediation;
    }

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    public ExportSecurityCheckInfoResponseInfo withCheckInfoList(String checkInfoList) {
        this.checkInfoList = checkInfoList;
        return this;
    }

    /**
     * 检测用例信息
     * @return checkInfoList
     */
    public String getCheckInfoList() {
        return checkInfoList;
    }

    public void setCheckInfoList(String checkInfoList) {
        this.checkInfoList = checkInfoList;
    }

    public ExportSecurityCheckInfoResponseInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 首次扫描时间，时间戳单位：毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportSecurityCheckInfoResponseInfo that = (ExportSecurityCheckInfoResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostPublicIp, that.hostPublicIp)
            && Objects.equals(this.hostPrivateIp, that.hostPrivateIp) && Objects.equals(this.checkType, that.checkType)
            && Objects.equals(this.checkName, that.checkName) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.checkRuleName, that.checkRuleName)
            && Objects.equals(this.executableFilePath, that.executableFilePath)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.scanResult, that.scanResult)
            && Objects.equals(this.status, that.status) && Objects.equals(this.checkRuleDesc, that.checkRuleDesc)
            && Objects.equals(this.audit, that.audit) && Objects.equals(this.remediation, that.remediation)
            && Objects.equals(this.checkInfoList, that.checkInfoList)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            hostName,
            hostPublicIp,
            hostPrivateIp,
            checkType,
            checkName,
            standard,
            checkRuleName,
            executableFilePath,
            severity,
            scanResult,
            status,
            checkRuleDesc,
            audit,
            remediation,
            checkInfoList,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSecurityCheckInfoResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostPublicIp: ").append(toIndentedString(hostPublicIp)).append("\n");
        sb.append("    hostPrivateIp: ").append(toIndentedString(hostPrivateIp)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    executableFilePath: ").append(toIndentedString(executableFilePath)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    scanResult: ").append(toIndentedString(scanResult)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    checkRuleDesc: ").append(toIndentedString(checkRuleDesc)).append("\n");
        sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    checkInfoList: ").append(toIndentedString(checkInfoList)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
