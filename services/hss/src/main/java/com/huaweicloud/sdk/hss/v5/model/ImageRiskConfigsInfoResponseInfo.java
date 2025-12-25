package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置检测结果信息
 */
public class ImageRiskConfigsInfoResponseInfo {

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
    @JsonProperty(value = "check_rule_num")

    private Integer checkRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_rule_num")

    private Integer failedRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type_desc")

    private String checkTypeDesc;

    public ImageRiskConfigsInfoResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释** 镜像安全配置检测结果的风险等级，用于筛选指定风险等级的检测记录 **约束限制** 取值必须在指定范围内，否则返回空结果 **取值范围** - Security：安全 - Low：低危 - Medium：中危 - High：高危 **默认取值** 无 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ImageRiskConfigsInfoResponseInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释** 安全配置检测的基线名称，用于筛选指定基线的检测结果（如'CentOS 7'、'EulerOS'等） **约束限制** 仅支持功能介绍中列出的系统基线（CentOS 7、Debian 10、EulerOS、Ubuntu16） **取值范围** 支持的基线名称列表详见功能介绍 **默认取值** 无 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ImageRiskConfigsInfoResponseInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释** 用于区分基线的类型 **取值范围** 字符长度0-256位 
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ImageRiskConfigsInfoResponseInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释** 安全配置检测遵循的标准，用于筛选符合指定标准的检测结果 **约束限制** 取值必须在指定范围内，否则返回空结果 **取值范围** - cn_standard：等保合规标准 - hw_standard：云安全实践标准 **默认取值** 无 
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ImageRiskConfigsInfoResponseInfo withCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
        return this;
    }

    /**
     * **参数解释** 该基线对应的安全配置检测总检查项数量 **取值范围** 取值0-2097152 
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

    public ImageRiskConfigsInfoResponseInfo withFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
        return this;
    }

    /**
     * **参数解释** 该基线检测中未通过（存在安全风险）的检查项数量 **取值范围** 取值0-2097152 
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

    public ImageRiskConfigsInfoResponseInfo withCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
        return this;
    }

    /**
     * **参数解释** 该基线的详细描述，说明基线的检测目的、适用场景等信息 **取值范围** 字符长度0-65534位，支持中文、英文、数字、常用标点符号及空格 
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
        ImageRiskConfigsInfoResponseInfo that = (ImageRiskConfigsInfoResponseInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.checkRuleNum, that.checkRuleNum)
            && Objects.equals(this.failedRuleNum, that.failedRuleNum)
            && Objects.equals(this.checkTypeDesc, that.checkTypeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, checkName, checkType, standard, checkRuleNum, failedRuleNum, checkTypeDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageRiskConfigsInfoResponseInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    checkRuleNum: ").append(toIndentedString(checkRuleNum)).append("\n");
        sb.append("    failedRuleNum: ").append(toIndentedString(failedRuleNum)).append("\n");
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
