package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置检测结果信息
 */
public class SecurityCheckInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executable_file_path")

    private String executableFilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_num")

    private Integer checkRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_rule_num")

    private Integer failedRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type_desc")

    private String checkTypeDesc;

    public SecurityCheckInfoResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 风险等级 **取值范围**: - Low : 低危 - Medium : 中危 - High : 高危 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public SecurityCheckInfoResponseInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**: 配置检查（基线）的名称，例如SSH、CentOS 7、Windows **取值范围**: 不涉及 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public SecurityCheckInfoResponseInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释**: 配置检查（基线）的类型,Linux系统支持的基线一般check_type和check_name相同,例如SSH、CentOS 7。 Windows系统支持的基线一般check_type和check_name不相同，例如check_name为Windows的配置检查（基线），它的check_type包含Windows Server 2019 R2、Windows Server 2016 R2等。 **取值范围**: 不涉及 
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public SecurityCheckInfoResponseInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释**: 标准类型 **取值范围**: - cn_standard : 等保合规标准 - hw_standard : 云安全实践标准 
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public SecurityCheckInfoResponseInfo withExecutableFilePath(String executableFilePath) {
        this.executableFilePath = executableFilePath;
        return this;
    }

    /**
     * **参数解释**: 配置检查（基线）的路径信息 **取值范围**: 不涉及 
     * @return executableFilePath
     */
    public String getExecutableFilePath() {
        return executableFilePath;
    }

    public void setExecutableFilePath(String executableFilePath) {
        this.executableFilePath = executableFilePath;
    }

    public SecurityCheckInfoResponseInfo withCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
        return this;
    }

    /**
     * **参数解释**: 当前配置检查（基线）类型下，用户共检测了多少个检查项。例如标准类型为hw_standard的SSH基线，主机安全提供了17个检查项，但用户所有主机都只检测了SSH基线的其中5个检查项，check_rule_num就是5。用户有一台主机进行了全量检查项检测，check_rule_num就是17。 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2097152
     * @return checkRuleNum
     */
    public Integer getCheckRuleNum() {
        return checkRuleNum;
    }

    public void setCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
    }

    public SecurityCheckInfoResponseInfo withFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
        return this;
    }

    /**
     * **参数解释**: 未通过的检查项数量，check_rule_num中只要有一台主机没通过某个检查项，这个检查项就会被计算在failed_rule_num中 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2097152
     * @return failedRuleNum
     */
    public Integer getFailedRuleNum() {
        return failedRuleNum;
    }

    public void setFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
    }

    public SecurityCheckInfoResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 受影响的服务器的数量，进行了当前基线检测的服务器数量 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2097152
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public SecurityCheckInfoResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**: 最新检测时间(ms) **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2097152
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public SecurityCheckInfoResponseInfo withCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
        return this;
    }

    /**
     * **参数解释**: 对配置检查（基线）类型的描述信息，概括当前基线包含的检查项是根据什么标准制定的，能够审计哪些方面的问题。 **取值范围**: 不涉及 
     * @return checkTypeDesc
     */
    public String getCheckTypeDesc() {
        return checkTypeDesc;
    }

    public void setCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckInfoResponseInfo that = (SecurityCheckInfoResponseInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.executableFilePath, that.executableFilePath)
            && Objects.equals(this.checkRuleNum, that.checkRuleNum)
            && Objects.equals(this.failedRuleNum, that.failedRuleNum) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.checkTypeDesc, that.checkTypeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity,
            checkName,
            checkType,
            standard,
            executableFilePath,
            checkRuleNum,
            failedRuleNum,
            hostNum,
            scanTime,
            checkTypeDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckInfoResponseInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    executableFilePath: ").append(toIndentedString(executableFilePath)).append("\n");
        sb.append("    checkRuleNum: ").append(toIndentedString(checkRuleNum)).append("\n");
        sb.append("    failedRuleNum: ").append(toIndentedString(failedRuleNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    checkTypeDesc: ").append(toIndentedString(checkTypeDesc)).append("\n");
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
