package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAppWhitelistPolicyRequest {

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
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "learning_status")

    private String learningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intercept")

    private Boolean intercept;

    public ListAppWhitelistPolicyRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListAppWhitelistPolicyRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 不涉及 
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

    public ListAppWhitelistPolicyRequest withLimit(Integer limit) {
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

    public ListAppWhitelistPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ListAppWhitelistPolicyRequest withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 进程白名单策略类型进程白名单策略类型 - allow # 允许指定/授权进程运行 - block # 阻止潜在恶意软件运行  
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public ListAppWhitelistPolicyRequest withLearningStatus(String learningStatus) {
        this.learningStatus = learningStatus;
        return this;
    }

    /**
     * **策略学习状态**： 策略学习状态 **约束限制**: 不涉及 **取值范围**: - effecting：学习完成，策略生效 - learned：学习完成，待确认 - learning：学习中 - pause：暂停 - abnormal：学习异常  **默认取值**: 不涉及 
     * @return learningStatus
     */
    public String getLearningStatus() {
        return learningStatus;
    }

    public void setLearningStatus(String learningStatus) {
        this.learningStatus = learningStatus;
    }

    public ListAppWhitelistPolicyRequest withIntercept(Boolean intercept) {
        this.intercept = intercept;
        return this;
    }

    /**
     * **参数解释**： 是否开启阻断 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: 不涉及 
     * @return intercept
     */
    public Boolean getIntercept() {
        return intercept;
    }

    public void setIntercept(Boolean intercept) {
        this.intercept = intercept;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppWhitelistPolicyRequest that = (ListAppWhitelistPolicyRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.policyName, that.policyName) && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.learningStatus, that.learningStatus)
            && Objects.equals(this.intercept, that.intercept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, offset, limit, policyName, policyType, learningStatus, intercept);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppWhitelistPolicyRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    learningStatus: ").append(toIndentedString(learningStatus)).append("\n");
        sb.append("    intercept: ").append(toIndentedString(intercept)).append("\n");
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
