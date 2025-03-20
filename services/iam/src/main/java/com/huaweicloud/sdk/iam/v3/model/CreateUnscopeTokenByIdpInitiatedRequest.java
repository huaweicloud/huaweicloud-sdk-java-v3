package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateUnscopeTokenByIdpInitiatedRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")

    private String xIdpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateUnscopeTokenByIdpInitiatedRequestBody body;

    public CreateUnscopeTokenByIdpInitiatedRequest withXIdpId(String xIdpId) {
        this.xIdpId = xIdpId;
        return this;
    }

    /**
     * 身份提供商ID。
     * @return xIdpId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")
    public String getXIdpId() {
        return xIdpId;
    }

    public void setXIdpId(String xIdpId) {
        this.xIdpId = xIdpId;
    }

    public CreateUnscopeTokenByIdpInitiatedRequest withBody(CreateUnscopeTokenByIdpInitiatedRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateUnscopeTokenByIdpInitiatedRequest withBody(
        Consumer<CreateUnscopeTokenByIdpInitiatedRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateUnscopeTokenByIdpInitiatedRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateUnscopeTokenByIdpInitiatedRequestBody getBody() {
        return body;
    }

    public void setBody(CreateUnscopeTokenByIdpInitiatedRequestBody body) {
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
        CreateUnscopeTokenByIdpInitiatedRequest that = (CreateUnscopeTokenByIdpInitiatedRequest) obj;
        return Objects.equals(this.xIdpId, that.xIdpId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xIdpId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUnscopeTokenByIdpInitiatedRequest {\n");
        sb.append("    xIdpId: ").append(toIndentedString(xIdpId)).append("\n");
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
