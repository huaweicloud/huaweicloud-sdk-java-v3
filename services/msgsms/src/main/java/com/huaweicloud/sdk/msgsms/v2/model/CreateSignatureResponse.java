package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateSignatureResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_id")

    private String signatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_name")

    private String signatureName;

    public CreateSignatureResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 签名主键ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSignatureResponse withSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }

    /**
     * 签名ID
     * @return signatureId
     */
    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public CreateSignatureResponse withSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }

    /**
     * 签名名称
     * @return signatureName
     */
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSignatureResponse createSignatureResponse = (CreateSignatureResponse) o;
        return Objects.equals(this.id, createSignatureResponse.id)
            && Objects.equals(this.signatureId, createSignatureResponse.signatureId)
            && Objects.equals(this.signatureName, createSignatureResponse.signatureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, signatureId, signatureName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSignatureResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
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
