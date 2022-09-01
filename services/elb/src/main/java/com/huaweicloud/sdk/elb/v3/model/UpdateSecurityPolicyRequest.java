package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSecurityPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy_id")

    @JacksonXmlProperty(localName = "security_policy_id")

    private String securityPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateSecurityPolicyRequestBody body;

    public UpdateSecurityPolicyRequest withSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }

    /**
     * 自定义安全策略的ID。
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    public void setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
    }

    public UpdateSecurityPolicyRequest withBody(UpdateSecurityPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSecurityPolicyRequest withBody(Consumer<UpdateSecurityPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSecurityPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateSecurityPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSecurityPolicyRequestBody body) {
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
        UpdateSecurityPolicyRequest updateSecurityPolicyRequest = (UpdateSecurityPolicyRequest) o;
        return Objects.equals(this.securityPolicyId, updateSecurityPolicyRequest.securityPolicyId)
            && Objects.equals(this.body, updateSecurityPolicyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityPolicyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityPolicyRequest {\n");
        sb.append("    securityPolicyId: ").append(toIndentedString(securityPolicyId)).append("\n");
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
