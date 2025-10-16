package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateIpReputationRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectid")

    private String projectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyids")

    private String policyids;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateIpReputationRuleRequestBody body;

    public BatchCreateIpReputationRuleRequest withProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }

    /**
     * **参数解释：** 项目ID，对应控制台用户名->我的凭证->项目列表->项目ID。 **约束限制：** 不涉及 **取值范围：** 只能由英文字母、数字组成，且长度为32个字符。 **默认取值：** 不涉及
     * @return projectid
     */
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public BatchCreateIpReputationRuleRequest withPolicyids(String policyids) {
        this.policyids = policyids;
        return this;
    }

    /**
     * **参数解释：** 域名id。 **约束限制：** 不涉及 **取值范围：** 只能由英文字母、数字组成，且长度为32个字符。 **默认取值：** 不涉及
     * @return policyids
     */
    public String getPolicyids() {
        return policyids;
    }

    public void setPolicyids(String policyids) {
        this.policyids = policyids;
    }

    public BatchCreateIpReputationRuleRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目ID。若需要查询当前用户所有企业项目绑定的资源信息，请传参all_granted_eps。 **约束限制：** 不涉及 **取值范围：**  - 0：代表default企业项目  - all_granted_eps：代表所有企业项目  - 其它企业项目ID：长度为36个字符  **默认取值：** 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public BatchCreateIpReputationRuleRequest withBody(BatchCreateIpReputationRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateIpReputationRuleRequest withBody(Consumer<BatchCreateIpReputationRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateIpReputationRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateIpReputationRuleRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateIpReputationRuleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateIpReputationRuleRequest that = (BatchCreateIpReputationRuleRequest) obj;
        return Objects.equals(this.projectid, that.projectid) && Objects.equals(this.policyids, that.policyids)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectid, policyids, enterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateIpReputationRuleRequest {\n");
        sb.append("    projectid: ").append(toIndentedString(projectid)).append("\n");
        sb.append("    policyids: ").append(toIndentedString(policyids)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
