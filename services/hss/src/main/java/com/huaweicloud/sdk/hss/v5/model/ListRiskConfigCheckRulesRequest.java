package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRiskConfigCheckRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    @JacksonXmlProperty(localName = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    @JacksonXmlProperty(localName = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_type")

    @JacksonXmlProperty(localName = "result_type")

    private String resultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    @JacksonXmlProperty(localName = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    @JacksonXmlProperty(localName = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    @JacksonXmlProperty(localName = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    public ListRiskConfigCheckRulesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListRiskConfigCheckRulesRequest withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * 基线名称
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ListRiskConfigCheckRulesRequest withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * 标准类型，包含如下: - cn_standard : 等保合规标准 - hw_standard : 华为标准 - qt_standard : 青腾标准
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ListRiskConfigCheckRulesRequest withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * 结果类型，包含如下： - safe ： 已通过 - unhandled : 未通过，且未忽略的 - ignored : 未通过，且已忽略的
     * @return resultType
     */
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public ListRiskConfigCheckRulesRequest withCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
        return this;
    }

    /**
     * 检查项名称，支持模糊匹配
     * @return checkRuleName
     */
    public String getCheckRuleName() {
        return checkRuleName;
    }

    public void setCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
    }

    public ListRiskConfigCheckRulesRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 风险等级，包含如下:   - Security : 安全   - Low : 低危   - Medium : 中危   - High : 高危   - Critical : 危急
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ListRiskConfigCheckRulesRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID，不赋值时，查租户所有主机
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListRiskConfigCheckRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量
     * minimum: 0
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRiskConfigCheckRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRiskConfigCheckRulesRequest listRiskConfigCheckRulesRequest = (ListRiskConfigCheckRulesRequest) o;
        return Objects.equals(this.enterpriseProjectId, listRiskConfigCheckRulesRequest.enterpriseProjectId)
            && Objects.equals(this.checkType, listRiskConfigCheckRulesRequest.checkType)
            && Objects.equals(this.standard, listRiskConfigCheckRulesRequest.standard)
            && Objects.equals(this.resultType, listRiskConfigCheckRulesRequest.resultType)
            && Objects.equals(this.checkRuleName, listRiskConfigCheckRulesRequest.checkRuleName)
            && Objects.equals(this.severity, listRiskConfigCheckRulesRequest.severity)
            && Objects.equals(this.hostId, listRiskConfigCheckRulesRequest.hostId)
            && Objects.equals(this.limit, listRiskConfigCheckRulesRequest.limit)
            && Objects.equals(this.offset, listRiskConfigCheckRulesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, checkType, standard, resultType, checkRuleName, severity, hostId, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRiskConfigCheckRulesRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
