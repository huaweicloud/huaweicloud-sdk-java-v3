package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateOpenIdConnectConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateOpenIdConnectConfigRequestBody body;

    public CreateOpenIdConnectConfigRequest withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    /**
     * 身份提供商ID
     * @return idpId
     */
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public CreateOpenIdConnectConfigRequest withBody(CreateOpenIdConnectConfigRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateOpenIdConnectConfigRequest withBody(Consumer<CreateOpenIdConnectConfigRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateOpenIdConnectConfigRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateOpenIdConnectConfigRequestBody getBody() {
        return body;
    }

    public void setBody(CreateOpenIdConnectConfigRequestBody body) {
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
        CreateOpenIdConnectConfigRequest createOpenIdConnectConfigRequest = (CreateOpenIdConnectConfigRequest) o;
        return Objects.equals(this.idpId, createOpenIdConnectConfigRequest.idpId)
            && Objects.equals(this.body, createOpenIdConnectConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpenIdConnectConfigRequest {\n");
        sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
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
