package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDesktopNamePolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDesktopNamePolicyReq body;

    public UpdateDesktopNamePolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateDesktopNamePolicyRequest withBody(UpdateDesktopNamePolicyReq body) {
        this.body = body;
        return this;
    }

    public UpdateDesktopNamePolicyRequest withBody(Consumer<UpdateDesktopNamePolicyReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDesktopNamePolicyReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDesktopNamePolicyReq getBody() {
        return body;
    }

    public void setBody(UpdateDesktopNamePolicyReq body) {
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
        UpdateDesktopNamePolicyRequest that = (UpdateDesktopNamePolicyRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesktopNamePolicyRequest {\n");
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
