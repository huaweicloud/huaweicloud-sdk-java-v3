package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CreateUnscopedTokenWithIdTokenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_id")

    private String protocolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    public CreateUnscopedTokenWithIdTokenRequest withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    /**
     * 身份提供商id。
     * @return idpId
     */
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public CreateUnscopedTokenWithIdTokenRequest withProtocolId(String protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    /**
     * 协议id。
     * @return protocolId
     */
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public CreateUnscopedTokenWithIdTokenRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * OpenID Connect身份提供商的ID Token，格式为Bearer {ID Token}。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUnscopedTokenWithIdTokenRequest createUnscopedTokenWithIdTokenRequest =
            (CreateUnscopedTokenWithIdTokenRequest) o;
        return Objects.equals(this.idpId, createUnscopedTokenWithIdTokenRequest.idpId)
            && Objects.equals(this.protocolId, createUnscopedTokenWithIdTokenRequest.protocolId)
            && Objects.equals(this.authorization, createUnscopedTokenWithIdTokenRequest.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpId, protocolId, authorization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUnscopedTokenWithIdTokenRequest {\n");
        sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
        sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
