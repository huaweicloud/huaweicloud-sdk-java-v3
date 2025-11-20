package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCheckRuleHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

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
    @JsonProperty(value = "result_type")

    private String resultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_cce")

    private Boolean checkCce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_id")

    private String policyGroupId;

    public ListCheckRuleHostRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListCheckRuleHostRequest withOffset(Integer offset) {
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

    public ListCheckRuleHostRequest withLimit(Integer limit) {
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

    public ListCheckRuleHostRequest withCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
        return this;
    }

    /**
     * **参数解释** 具体基线检查项id **约束限制** 不涉及 **取值范围** - 值可以通过这个接口的返回数据获得：/v5/{project_id}/baseline/risk-config/{check_name}/check-rules **默认取值** 不涉及
     * @return checkRuleId
     */
    public String getCheckRuleId() {
        return checkRuleId;
    }

    public void setCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
    }

    public ListCheckRuleHostRequest withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）的名称，如SSH、CentOS 7、Windows，与check_type相比，会多-PID之类的进程信息，通过具体基线维度查询时，传check_name **约束限制** 不涉及 **取值范围** 不涉及 **默认取值** 不涉及
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ListCheckRuleHostRequest withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）的类型，如SSH、CentOS 7、Windows，通过检查项维度查询时，传check_type **约束限制** 不涉及 **取值范围** 不涉及 **默认取值** 不涉及
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ListCheckRuleHostRequest withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释** 基线分类 **约束限制** 不涉及 **取值范围** - cn_standard : 等保合规标准 - hw_standard : 云安全实践标准 - cis_standard：通用安全标准  **默认取值** 不涉及
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ListCheckRuleHostRequest withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * **参数解释** 检测结果类型 **约束限制** 不涉及 **取值范围** - safe             : 已通过 - unhandled        : 未处理 - ignored          : 已忽略 - fixing           : 修复中 - fix-failed       : 修复失败 - verifying        : 验证中 - add_to_whitelist : 已加白  **默认取值** 不涉及
     * @return resultType
     */
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public ListCheckRuleHostRequest withClusterId(String clusterId) {
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

    public ListCheckRuleHostRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释** 主机名称或ip **约束限制** 不涉及 **取值范围** 不涉及 **默认取值** 不涉及
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListCheckRuleHostRequest withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * **参数解释** 主机类型，已废弃 **约束限制** 不涉及 **取值范围** - cce **默认取值** 不涉及
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public ListCheckRuleHostRequest withCheckCce(Boolean checkCce) {
        this.checkCce = checkCce;
        return this;
    }

    /**
     * **参数解释**: 是否只筛选cce主机，已废弃 **约束限制**: 不涉及 **取值范围**: -true：是。 -false：否。 **默认取值**: false 
     * @return checkCce
     */
    public Boolean getCheckCce() {
        return checkCce;
    }

    public void setCheckCce(Boolean checkCce) {
        this.checkCce = checkCce;
    }

    public ListCheckRuleHostRequest withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * **参数解释** 策略组ID，已废弃 **约束限制** 不涉及 **取值范围** 字符长度0-128位 **默认取值** 不涉及
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCheckRuleHostRequest that = (ListCheckRuleHostRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.checkRuleId, that.checkRuleId) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.resultType, that.resultType) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostType, that.hostType)
            && Objects.equals(this.checkCce, that.checkCce) && Objects.equals(this.policyGroupId, that.policyGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            offset,
            limit,
            checkRuleId,
            checkName,
            checkType,
            standard,
            resultType,
            clusterId,
            hostName,
            hostType,
            checkCce,
            policyGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCheckRuleHostRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    checkCce: ").append(toIndentedString(checkCce)).append("\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
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
