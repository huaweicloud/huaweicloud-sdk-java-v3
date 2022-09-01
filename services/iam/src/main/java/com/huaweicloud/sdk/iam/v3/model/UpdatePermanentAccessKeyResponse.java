package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdatePermanentAccessKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    @JacksonXmlProperty(localName = "credential")

    private UpdateCredentialResult credential;

    public UpdatePermanentAccessKeyResponse withCredential(UpdateCredentialResult credential) {
        this.credential = credential;
        return this;
    }

    public UpdatePermanentAccessKeyResponse withCredential(Consumer<UpdateCredentialResult> credentialSetter) {
        if (this.credential == null) {
            this.credential = new UpdateCredentialResult();
            credentialSetter.accept(this.credential);
        }

        return this;
    }

    /**
     * Get credential
     * @return credential
     */
    public UpdateCredentialResult getCredential() {
        return credential;
    }

    public void setCredential(UpdateCredentialResult credential) {
        this.credential = credential;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePermanentAccessKeyResponse updatePermanentAccessKeyResponse = (UpdatePermanentAccessKeyResponse) o;
        return Objects.equals(this.credential, updatePermanentAccessKeyResponse.credential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credential);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePermanentAccessKeyResponse {\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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
