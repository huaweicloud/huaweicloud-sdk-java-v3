package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateGeoipRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateGeoIpRuleRequestBody body;

    public CreateGeoipRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /** 策略id（策略id从查询防护策略列表接口获取）
     * 
     * @return policyId */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public CreateGeoipRuleRequest withBody(CreateGeoIpRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateGeoipRuleRequest withBody(Consumer<CreateGeoIpRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateGeoIpRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public CreateGeoIpRuleRequestBody getBody() {
        return body;
    }

    public void setBody(CreateGeoIpRuleRequestBody body) {
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
        CreateGeoipRuleRequest createGeoipRuleRequest = (CreateGeoipRuleRequest) o;
        return Objects.equals(this.policyId, createGeoipRuleRequest.policyId)
            && Objects.equals(this.body, createGeoipRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGeoipRuleRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
