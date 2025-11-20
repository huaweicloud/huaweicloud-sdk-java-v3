package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检查项风险信息
 */
public class ImageCheckRuleResponseInfo {

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
    @JsonProperty(value = "check_type_desc")

    private String checkTypeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_result")

    private String scanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Integer imageNum;

    public ImageCheckRuleResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险等级 **取值范围**： - Security：安全 - Low：低危 - Medium：中危 - High：高危 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ImageCheckRuleResponseInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**: 基线名称 **取值范围**: 字符长度0-256 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ImageCheckRuleResponseInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释**: 基线类型 **取值范围**: 字符长度0-256 
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ImageCheckRuleResponseInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释**: 标准类型 **取值范围**: - cn_standard：等保合规标准 - hw_standard：华为标准 - qt_standard：青腾标准
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ImageCheckRuleResponseInfo withCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
        return this;
    }

    /**
     * **参数解释**: 基线描述信息 **取值范围**: 字符长度0-65534 
     * @return checkTypeDesc
     */
    public String getCheckTypeDesc() {
        return checkTypeDesc;
    }

    public void setCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
    }

    public ImageCheckRuleResponseInfo withCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
        return this;
    }

    /**
     * **参数解释**: 检查项 **取值范围**: 字符长度0-2048 
     * @return checkRuleName
     */
    public String getCheckRuleName() {
        return checkRuleName;
    }

    public void setCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
    }

    public ImageCheckRuleResponseInfo withCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
        return this;
    }

    /**
     * **参数解释**: 检查项ID **取值范围**: 字符长度0-128 
     * @return checkRuleId
     */
    public String getCheckRuleId() {
        return checkRuleId;
    }

    public void setCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
    }

    public ImageCheckRuleResponseInfo withScanResult(String scanResult) {
        this.scanResult = scanResult;
        return this;
    }

    /**
     * **参数解释**: 检测结果 **取值范围**: - pass：通过 - failed：未通过
     * @return scanResult
     */
    public String getScanResult() {
        return scanResult;
    }

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }

    public ImageCheckRuleResponseInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最后一次检测时间，时间单位：毫秒（ms） **取值范围**: 大小0-9223372036854775807 
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

    public ImageCheckRuleResponseInfo withImageNum(Integer imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * **参数解释**: 受影响的镜像的数量，进行了当前基线检测的镜像数量 **取值范围**: 大小0-2097152 
     * minimum: 0
     * maximum: 2097152
     * @return imageNum
     */
    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageCheckRuleResponseInfo that = (ImageCheckRuleResponseInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.checkTypeDesc, that.checkTypeDesc)
            && Objects.equals(this.checkRuleName, that.checkRuleName)
            && Objects.equals(this.checkRuleId, that.checkRuleId) && Objects.equals(this.scanResult, that.scanResult)
            && Objects.equals(this.latestScanTime, that.latestScanTime) && Objects.equals(this.imageNum, that.imageNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity,
            checkName,
            checkType,
            standard,
            checkTypeDesc,
            checkRuleName,
            checkRuleId,
            scanResult,
            latestScanTime,
            imageNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageCheckRuleResponseInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    checkTypeDesc: ").append(toIndentedString(checkTypeDesc)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    scanResult: ").append(toIndentedString(scanResult)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
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
