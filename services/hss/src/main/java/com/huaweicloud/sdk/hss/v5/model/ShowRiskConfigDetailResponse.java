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
     * **参数解释**: 风险等级 **取值范围**: - Low : 低危 - Medium : 中危 - High : 高危 
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
     * **参数解释**: 配置检查（基线）的类型,例如SSH、CentOS 7、Windows Server 2019 R2、Windows Server 2016 R2、MySQL5-Windows **取值范围**: 不涉及 
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
     * **参数解释**: 对配置检查（基线）类型的描述信息，概括当前基线包含的检查项是根据什么标准制定的，能够审计哪些方面的问题。 **取值范围**: 不涉及 
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
     * **参数解释**: 当前配置检查（基线）类型下，用户共检测了多少个检查项。例如标准类型为hw_standard的SSH基线，主机安全提供了17个检查项，但用户所有主机都只检测了SSH基线的其中5个检查项，check_rule_num就是5。用户有一台主机进行了全量检查项检测，check_rule_num就是17。 **取值范围**: 不涉及 
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
     * **参数解释**: 未通过的检查项数量，check_rule_num中只要有一台主机没通过某个检查项，这个检查项就会被计算在failed_rule_num中 **取值范围**: 不涉及 
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
     * **参数解释**: 已通过的检查项数量，check_rule_num中只要有一台主机通过了某个检查项，这个检查项就会被计算在passed_rule_num中 **取值范围**: 不涉及 
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
     * **参数解释**: 已忽略的检查项数量，check_rule_num中只要有一台主机忽略了某个检查项，这个检查项就会被计算在ignored_rule_num中 **取值范围**: 不涉及 
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
     * **参数解释**: 受影响的服务器的数量，进行了当前基线检测的服务器数量 **取值范围**: 不涉及 
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRiskConfigDetailResponse that = (ShowRiskConfigDetailResponse) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkType, that.checkType)
            && Objects.equals(this.checkTypeDesc, that.checkTypeDesc)
            && Objects.equals(this.checkRuleNum, that.checkRuleNum)
            && Objects.equals(this.failedRuleNum, that.failedRuleNum)
            && Objects.equals(this.passedRuleNum, that.passedRuleNum)
            && Objects.equals(this.ignoredRuleNum, that.ignoredRuleNum) && Objects.equals(this.hostNum, that.hostNum);
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
