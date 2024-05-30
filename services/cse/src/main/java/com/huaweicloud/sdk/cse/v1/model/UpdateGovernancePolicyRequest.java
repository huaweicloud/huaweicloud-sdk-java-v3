package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGovernancePolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")

    private String xEngineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-environment")

    private String xEnvironment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateGovPolicy body;

    public UpdateGovernancePolicyRequest withXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
        return this;
    }

    /**
     * 微服务引擎的实例ID
     * @return xEngineId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")
    public String getXEngineId() {
        return xEngineId;
    }

    public void setXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
    }

    public UpdateGovernancePolicyRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    /**
     * 企业项目ID
     * @return xEnterpriseProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public UpdateGovernancePolicyRequest withXEnvironment(String xEnvironment) {
        this.xEnvironment = xEnvironment;
        return this;
    }

    /**
     * 所属环境
     * @return xEnvironment
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-environment")
    public String getXEnvironment() {
        return xEnvironment;
    }

    public void setXEnvironment(String xEnvironment) {
        this.xEnvironment = xEnvironment;
    }

    public UpdateGovernancePolicyRequest withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 治理策略类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public UpdateGovernancePolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 治理策略id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateGovernancePolicyRequest withBody(CreateGovPolicy body) {
        this.body = body;
        return this;
    }

    public UpdateGovernancePolicyRequest withBody(Consumer<CreateGovPolicy> bodySetter) {
        if (this.body == null) {
            this.body = new CreateGovPolicy();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateGovPolicy getBody() {
        return body;
    }

    public void setBody(CreateGovPolicy body) {
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
        UpdateGovernancePolicyRequest that = (UpdateGovernancePolicyRequest) obj;
        return Objects.equals(this.xEngineId, that.xEngineId)
            && Objects.equals(this.xEnterpriseProjectID, that.xEnterpriseProjectID)
            && Objects.equals(this.xEnvironment, that.xEnvironment) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xEngineId, xEnterpriseProjectID, xEnvironment, kind, policyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGovernancePolicyRequest {\n");
        sb.append("    xEngineId: ").append(toIndentedString(xEngineId)).append("\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    xEnvironment: ").append(toIndentedString(xEnvironment)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
