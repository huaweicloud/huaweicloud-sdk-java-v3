package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AiAppCreateRequest
 */
public class AiAppCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_sign")

    private String apiSign;

    public AiAppCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * AI应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AiAppCreateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AiAppCreateRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 要与应用关联的策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public AiAppCreateRequest withApiSign(String apiSign) {
        this.apiSign = apiSign;
        return this;
    }

    /**
     * API签名
     * @return apiSign
     */
    public String getApiSign() {
        return apiSign;
    }

    public void setApiSign(String apiSign) {
        this.apiSign = apiSign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiAppCreateRequest that = (AiAppCreateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.apiSign, that.apiSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, policyId, apiSign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiAppCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    apiSign: ").append(toIndentedString(apiSign)).append("\n");
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
