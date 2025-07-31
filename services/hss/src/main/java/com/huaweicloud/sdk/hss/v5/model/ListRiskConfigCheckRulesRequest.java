package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRiskConfigCheckRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_type")

    private String resultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

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

    public ListRiskConfigCheckRulesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListRiskConfigCheckRulesRequest withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**: 配置检查（基线）的名称，例如SSH、CentOS 7、Windows **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ListRiskConfigCheckRulesRequest withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释**: 标准类型 **约束限制**: 不涉及 **取值范围**: - cn_standard : 等保合规标准 - hw_standard : 云安全实践标准 **默认取值**: 不涉及 
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
     * **参数解释**: 结果类型 **约束限制**: 不涉及 **取值范围**: - safe : 已通过 - unhandled : 未通过，且未忽略的 - ignored : 未通过，且已忽略的 **默认取值**: unhandled 
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
     * **参数解释**: 检查项（检查规则）名称，支持模糊匹配 **约束限制**: 不涉及 **取值范围**: 字符长度0-2048位 **默认取值**: 不涉及 
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
     * **参数解释**: 风险等级 **约束限制**: 不涉及 **取值范围**: - Security : 安全 - Low : 低危 - Medium : 中危 - High : 高危 - Critical : 危急 **默认取值**: 不涉及 
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
     * **参数解释**: 主机ID，不赋值时，查租户所有主机 **约束限制**: 不涉及 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
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
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
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

    public ListRiskConfigCheckRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRiskConfigCheckRulesRequest that = (ListRiskConfigCheckRulesRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.checkName, that.checkName) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.resultType, that.resultType)
            && Objects.equals(this.checkRuleName, that.checkRuleName) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, checkName, standard, resultType, checkRuleName, severity, hostId, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRiskConfigCheckRulesRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
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
