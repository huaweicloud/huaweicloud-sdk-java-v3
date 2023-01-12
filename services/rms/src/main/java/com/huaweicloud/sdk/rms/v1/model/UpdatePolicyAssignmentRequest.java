package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePolicyAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")

    private String xAuthToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PolicyAssignmentRequestBody body;

    public UpdatePolicyAssignmentRequest withXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
        return this;
    }

    /**
     * 用户Token。 获取Token，请参考《统一身份认证服务API参考》的“获取用户Token”章节。请求响应成功后在响应消息头中包含的“X-Subject-Token”的值即为Token值。
     * @return xAuthToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")
    public String getXAuthToken() {
        return xAuthToken;
    }

    public void setXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
    }

    public UpdatePolicyAssignmentRequest withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * 规则ID
     * @return policyAssignmentId
     */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    public UpdatePolicyAssignmentRequest withBody(PolicyAssignmentRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePolicyAssignmentRequest withBody(Consumer<PolicyAssignmentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new PolicyAssignmentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PolicyAssignmentRequestBody getBody() {
        return body;
    }

    public void setBody(PolicyAssignmentRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePolicyAssignmentRequest updatePolicyAssignmentRequest = (UpdatePolicyAssignmentRequest) o;
        return Objects.equals(this.xAuthToken, updatePolicyAssignmentRequest.xAuthToken)
            && Objects.equals(this.policyAssignmentId, updatePolicyAssignmentRequest.policyAssignmentId)
            && Objects.equals(this.body, updatePolicyAssignmentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAuthToken, policyAssignmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyAssignmentRequest {\n");
        sb.append("    xAuthToken: ").append(toIndentedString(xAuthToken)).append("\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
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
