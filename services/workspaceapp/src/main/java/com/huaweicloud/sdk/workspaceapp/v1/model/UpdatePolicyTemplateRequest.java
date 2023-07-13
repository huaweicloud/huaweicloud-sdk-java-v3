package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePolicyTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_template_id")

    private String policyTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePolicyTemplateReq body;

    public UpdatePolicyTemplateRequest withPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
        return this;
    }

    /**
     * 策略模板id。
     * @return policyTemplateId
     */
    public String getPolicyTemplateId() {
        return policyTemplateId;
    }

    public void setPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    public UpdatePolicyTemplateRequest withBody(UpdatePolicyTemplateReq body) {
        this.body = body;
        return this;
    }

    public UpdatePolicyTemplateRequest withBody(Consumer<UpdatePolicyTemplateReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePolicyTemplateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePolicyTemplateReq getBody() {
        return body;
    }

    public void setBody(UpdatePolicyTemplateReq body) {
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
        UpdatePolicyTemplateRequest that = (UpdatePolicyTemplateRequest) obj;
        return Objects.equals(this.policyTemplateId, that.policyTemplateId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyTemplateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyTemplateRequest {\n");
        sb.append("    policyTemplateId: ").append(toIndentedString(policyTemplateId)).append("\n");
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
