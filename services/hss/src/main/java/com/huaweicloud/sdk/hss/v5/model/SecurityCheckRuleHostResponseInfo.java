package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 受单个基线检查项影响的单个服务器信息
 */
public class SecurityCheckRuleHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_name")

    private String baselineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_public_ip")

    private String hostPublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_private_ip")

    private String hostPrivateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passed_num")

    private Integer passedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_description")

    private String diffDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_fix")

    private Integer enableFix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_click")

    private Boolean enableClick;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_ignore_enable_click")

    private Boolean cancelIgnoreEnableClick;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_type")

    private String resultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_failed_reason")

    private String fixFailedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public SecurityCheckRuleHostResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public SecurityCheckRuleHostResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public SecurityCheckRuleHostResponseInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）的名称，例如SSH、CentOS 7、Windows **取值范围** 字符长度0-256位
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public SecurityCheckRuleHostResponseInfo withBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }

    /**
     * **参数解释** 基线的名称，例如SSH 应用基线检查、CentOS 7 系统基线检查、Windows 系统基线检查 **取值范围** 字符长度0-256位
     * @return baselineName
     */
    public String getBaselineName() {
        return baselineName;
    }

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    public SecurityCheckRuleHostResponseInfo withHostPublicIp(String hostPublicIp) {
        this.hostPublicIp = hostPublicIp;
        return this;
    }

    /**
     * **参数解释**: 服务器公网IP **取值范围**: 字符长度0-128位 
     * @return hostPublicIp
     */
    public String getHostPublicIp() {
        return hostPublicIp;
    }

    public void setHostPublicIp(String hostPublicIp) {
        this.hostPublicIp = hostPublicIp;
    }

    public SecurityCheckRuleHostResponseInfo withHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
        return this;
    }

    /**
     * **参数解释** 服务器私有IP **取值范围** 字符长度0-256位
     * @return hostPrivateIp
     */
    public String getHostPrivateIp() {
        return hostPrivateIp;
    }

    public void setHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
    }

    public SecurityCheckRuleHostResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释** 扫描时间(ms) **取值范围** 取值0-9223372036854775807
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public SecurityCheckRuleHostResponseInfo withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * **参数解释** 风险项数量 **取值范围** 取值0-2147483647
     * minimum: 0
     * maximum: 2147483647
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public SecurityCheckRuleHostResponseInfo withPassedNum(Integer passedNum) {
        this.passedNum = passedNum;
        return this;
    }

    /**
     * **参数解释** 通过项数量 **取值范围** 取值0-2147483647
     * minimum: 0
     * maximum: 2147483647
     * @return passedNum
     */
    public Integer getPassedNum() {
        return passedNum;
    }

    public void setPassedNum(Integer passedNum) {
        this.passedNum = passedNum;
    }

    public SecurityCheckRuleHostResponseInfo withDiffDescription(String diffDescription) {
        this.diffDescription = diffDescription;
        return this;
    }

    /**
     * **参数解释** 差异化展示提示信息 **取值范围** 字符长度0-512位
     * @return diffDescription
     */
    public String getDiffDescription() {
        return diffDescription;
    }

    public void setDiffDescription(String diffDescription) {
        this.diffDescription = diffDescription;
    }

    public SecurityCheckRuleHostResponseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 忽略或加白的备注 **取值范围** 字符长度0-1024位
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecurityCheckRuleHostResponseInfo withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * **参数解释** 主机类型，当主机为cce类型时，返回cce **取值范围** - cce
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public SecurityCheckRuleHostResponseInfo withEnableFix(Integer enableFix) {
        this.enableFix = enableFix;
        return this;
    }

    /**
     * **参数解释** 是否支持一键修复 **取值范围** - 1 : 支持一键修复 - 0 : 不支持
     * minimum: 0
     * maximum: 2147483647
     * @return enableFix
     */
    public Integer getEnableFix() {
        return enableFix;
    }

    public void setEnableFix(Integer enableFix) {
        this.enableFix = enableFix;
    }

    public SecurityCheckRuleHostResponseInfo withEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
        return this;
    }

    /**
     * **参数解释** 该检查项的修复&忽略&验证按钮是否可单击 **取值范围** - true  : 按钮可单击 - false : 按钮不可单击
     * @return enableClick
     */
    public Boolean getEnableClick() {
        return enableClick;
    }

    public void setEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
    }

    public SecurityCheckRuleHostResponseInfo withCancelIgnoreEnableClick(Boolean cancelIgnoreEnableClick) {
        this.cancelIgnoreEnableClick = cancelIgnoreEnableClick;
        return this;
    }

    /**
     * **参数解释** 已忽略检查项是否可点击 **取值范围** - true  : 按钮可单击 - false : 按钮不可单击
     * @return cancelIgnoreEnableClick
     */
    public Boolean getCancelIgnoreEnableClick() {
        return cancelIgnoreEnableClick;
    }

    public void setCancelIgnoreEnableClick(Boolean cancelIgnoreEnableClick) {
        this.cancelIgnoreEnableClick = cancelIgnoreEnableClick;
    }

    public SecurityCheckRuleHostResponseInfo withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * **参数解释** 检测结果类型 **取值范围** - safe             : 已通过 - unhandled        : 未处理 - ignored          : 已忽略 - fixing           : 修复中 - fix-failed       : 修复失败 - verifying        : 验证中 - add_to_whitelist : 已加白(表示检测失败，但已进行加白)
     * @return resultType
     */
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public SecurityCheckRuleHostResponseInfo withFixFailedReason(String fixFailedReason) {
        this.fixFailedReason = fixFailedReason;
        return this;
    }

    /**
     * **参数解释** 修复失败原因 **取值范围** 字符长度0-256位
     * @return fixFailedReason
     */
    public String getFixFailedReason() {
        return fixFailedReason;
    }

    public void setFixFailedReason(String fixFailedReason) {
        this.fixFailedReason = fixFailedReason;
    }

    public SecurityCheckRuleHostResponseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释** 集群ID **取值范围** 字符长度0-64位
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
        SecurityCheckRuleHostResponseInfo that = (SecurityCheckRuleHostResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.checkName, that.checkName) && Objects.equals(this.baselineName, that.baselineName)
            && Objects.equals(this.hostPublicIp, that.hostPublicIp)
            && Objects.equals(this.hostPrivateIp, that.hostPrivateIp) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.failedNum, that.failedNum) && Objects.equals(this.passedNum, that.passedNum)
            && Objects.equals(this.diffDescription, that.diffDescription)
            && Objects.equals(this.description, that.description) && Objects.equals(this.hostType, that.hostType)
            && Objects.equals(this.enableFix, that.enableFix) && Objects.equals(this.enableClick, that.enableClick)
            && Objects.equals(this.cancelIgnoreEnableClick, that.cancelIgnoreEnableClick)
            && Objects.equals(this.resultType, that.resultType)
            && Objects.equals(this.fixFailedReason, that.fixFailedReason)
            && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            hostName,
            checkName,
            baselineName,
            hostPublicIp,
            hostPrivateIp,
            scanTime,
            failedNum,
            passedNum,
            diffDescription,
            description,
            hostType,
            enableFix,
            enableClick,
            cancelIgnoreEnableClick,
            resultType,
            fixFailedReason,
            clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckRuleHostResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    baselineName: ").append(toIndentedString(baselineName)).append("\n");
        sb.append("    hostPublicIp: ").append(toIndentedString(hostPublicIp)).append("\n");
        sb.append("    hostPrivateIp: ").append(toIndentedString(hostPrivateIp)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    passedNum: ").append(toIndentedString(passedNum)).append("\n");
        sb.append("    diffDescription: ").append(toIndentedString(diffDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    enableFix: ").append(toIndentedString(enableFix)).append("\n");
        sb.append("    enableClick: ").append(toIndentedString(enableClick)).append("\n");
        sb.append("    cancelIgnoreEnableClick: ").append(toIndentedString(cancelIgnoreEnableClick)).append("\n");
        sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
        sb.append("    fixFailedReason: ").append(toIndentedString(fixFailedReason)).append("\n");
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
