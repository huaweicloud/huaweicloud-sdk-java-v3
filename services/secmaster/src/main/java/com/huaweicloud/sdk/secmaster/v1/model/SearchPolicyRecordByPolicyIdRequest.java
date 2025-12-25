package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SearchPolicyRecordByPolicyIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Secmaster-Version")

    private String xSecmasterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SearchPolicyRequestBody body;

    public SearchPolicyRecordByPolicyIdRequest withXSecmasterVersion(String xSecmasterVersion) {
        this.xSecmasterVersion = xSecmasterVersion;
        return this;
    }

    /**
     * 服务版本，例如25.5.0
     * @return xSecmasterVersion
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Secmaster-Version")
    public String getXSecmasterVersion() {
        return xSecmasterVersion;
    }

    public void setXSecmasterVersion(String xSecmasterVersion) {
        this.xSecmasterVersion = xSecmasterVersion;
    }

    public SearchPolicyRecordByPolicyIdRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间id。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public SearchPolicyRecordByPolicyIdRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 策略id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public SearchPolicyRecordByPolicyIdRequest withBody(SearchPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public SearchPolicyRecordByPolicyIdRequest withBody(Consumer<SearchPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SearchPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SearchPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(SearchPolicyRequestBody body) {
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
        SearchPolicyRecordByPolicyIdRequest that = (SearchPolicyRecordByPolicyIdRequest) obj;
        return Objects.equals(this.xSecmasterVersion, that.xSecmasterVersion)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSecmasterVersion, workspaceId, policyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchPolicyRecordByPolicyIdRequest {\n");
        sb.append("    xSecmasterVersion: ").append(toIndentedString(xSecmasterVersion)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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
