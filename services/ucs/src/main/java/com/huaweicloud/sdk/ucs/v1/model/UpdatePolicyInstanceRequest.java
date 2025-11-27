package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePolicyInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyinstanceid")

    private String policyinstanceid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UCSConstraintRequest body;

    public UpdatePolicyInstanceRequest withPolicyinstanceid(String policyinstanceid) {
        this.policyinstanceid = policyinstanceid;
        return this;
    }

    /**
     * 策略实例id
     * @return policyinstanceid
     */
    public String getPolicyinstanceid() {
        return policyinstanceid;
    }

    public void setPolicyinstanceid(String policyinstanceid) {
        this.policyinstanceid = policyinstanceid;
    }

    public UpdatePolicyInstanceRequest withBody(UCSConstraintRequest body) {
        this.body = body;
        return this;
    }

    public UpdatePolicyInstanceRequest withBody(Consumer<UCSConstraintRequest> bodySetter) {
        if (this.body == null) {
            this.body = new UCSConstraintRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UCSConstraintRequest getBody() {
        return body;
    }

    public void setBody(UCSConstraintRequest body) {
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
        UpdatePolicyInstanceRequest that = (UpdatePolicyInstanceRequest) obj;
        return Objects.equals(this.policyinstanceid, that.policyinstanceid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyinstanceid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyInstanceRequest {\n");
        sb.append("    policyinstanceid: ").append(toIndentedString(policyinstanceid)).append("\n");
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
