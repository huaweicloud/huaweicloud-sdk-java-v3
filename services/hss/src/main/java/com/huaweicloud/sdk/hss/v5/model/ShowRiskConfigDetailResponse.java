package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRiskConfigDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type_desc")

    private String checkTypeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_num")

    private Integer checkRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_rule_num")

    private Integer failedRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passed_rule_num")

    private Integer passedRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignored_rule_num")

    private Integer ignoredRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Long hostNum;

    public ShowRiskConfigDetailResponse withSeverity(String severity) {
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

    public ShowRiskConfigDetailResponse withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * 基线类型
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ShowRiskConfigDetailResponse withCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
        return this;
    }

    /**
     * 基线描述
     * @return checkTypeDesc
     */
    public String getCheckTypeDesc() {
        return checkTypeDesc;
    }

    public void setCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
    }

    public ShowRiskConfigDetailResponse withCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
        return this;
    }

    /**
     * 检查项总数量
     * minimum: 0
     * maximum: 2147483647
     * @return checkRuleNum
     */
    public Integer getCheckRuleNum() {
        return checkRuleNum;
    }

    public void setCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
    }

    public ShowRiskConfigDetailResponse withFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
        return this;
    }

    /**
     * 未通过的检查项数量
     * minimum: 0
     * maximum: 2147483647
     * @return failedRuleNum
     */
    public Integer getFailedRuleNum() {
        return failedRuleNum;
    }

    public void setFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
    }

    public ShowRiskConfigDetailResponse withPassedRuleNum(Integer passedRuleNum) {
        this.passedRuleNum = passedRuleNum;
        return this;
    }

    /**
     * 已通过的检查项数量
     * minimum: 0
     * maximum: 2147483647
     * @return passedRuleNum
     */
    public Integer getPassedRuleNum() {
        return passedRuleNum;
    }

    public void setPassedRuleNum(Integer passedRuleNum) {
        this.passedRuleNum = passedRuleNum;
    }

    public ShowRiskConfigDetailResponse withIgnoredRuleNum(Integer ignoredRuleNum) {
        this.ignoredRuleNum = ignoredRuleNum;
        return this;
    }

    /**
     * 已忽略的检查项数量
     * minimum: 0
     * maximum: 2147483647
     * @return ignoredRuleNum
     */
    public Integer getIgnoredRuleNum() {
        return ignoredRuleNum;
    }

    public void setIgnoredRuleNum(Integer ignoredRuleNum) {
        this.ignoredRuleNum = ignoredRuleNum;
    }

    public ShowRiskConfigDetailResponse withHostNum(Long hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * 受影响的服务器的数量
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Long getHostNum() {
        return hostNum;
    }

    public void setHostNum(Long hostNum) {
        this.hostNum = hostNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRiskConfigDetailResponse showRiskConfigDetailResponse = (ShowRiskConfigDetailResponse) o;
        return Objects.equals(this.severity, showRiskConfigDetailResponse.severity)
            && Objects.equals(this.checkType, showRiskConfigDetailResponse.checkType)
            && Objects.equals(this.checkTypeDesc, showRiskConfigDetailResponse.checkTypeDesc)
            && Objects.equals(this.checkRuleNum, showRiskConfigDetailResponse.checkRuleNum)
            && Objects.equals(this.failedRuleNum, showRiskConfigDetailResponse.failedRuleNum)
            && Objects.equals(this.passedRuleNum, showRiskConfigDetailResponse.passedRuleNum)
            && Objects.equals(this.ignoredRuleNum, showRiskConfigDetailResponse.ignoredRuleNum)
            && Objects.equals(this.hostNum, showRiskConfigDetailResponse.hostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity,
            checkType,
            checkTypeDesc,
            checkRuleNum,
            failedRuleNum,
            passedRuleNum,
            ignoredRuleNum,
            hostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRiskConfigDetailResponse {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    checkTypeDesc: ").append(toIndentedString(checkTypeDesc)).append("\n");
        sb.append("    checkRuleNum: ").append(toIndentedString(checkRuleNum)).append("\n");
        sb.append("    failedRuleNum: ").append(toIndentedString(failedRuleNum)).append("\n");
        sb.append("    passedRuleNum: ").append(toIndentedString(passedRuleNum)).append("\n");
        sb.append("    ignoredRuleNum: ").append(toIndentedString(ignoredRuleNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
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
