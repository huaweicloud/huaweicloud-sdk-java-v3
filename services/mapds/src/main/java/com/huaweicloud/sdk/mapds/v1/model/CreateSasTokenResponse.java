package com.huaweicloud.sdk.mapds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateSasTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry")

    private String expiry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    public CreateSasTokenResponse withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * API key的client_id
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public CreateSasTokenResponse withExpiry(String expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * 超期时间，UTC格式
     * @return expiry
     */
    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public CreateSasTokenResponse withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 签名字符串
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSasTokenResponse createSasTokenResponse = (CreateSasTokenResponse) o;
        return Objects.equals(this.clientId, createSasTokenResponse.clientId)
            && Objects.equals(this.expiry, createSasTokenResponse.expiry)
            && Objects.equals(this.signature, createSasTokenResponse.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, expiry, signature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSasTokenResponse {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
