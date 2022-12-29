package com.huaweicloud.sdk.mapds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCredentialRequestBody
 */
public class CreateCredentialRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    private CreateCredentialRequestBodyCredential credential;

    public CreateCredentialRequestBody withCredential(CreateCredentialRequestBodyCredential credential) {
        this.credential = credential;
        return this;
    }

    public CreateCredentialRequestBody withCredential(
        Consumer<CreateCredentialRequestBodyCredential> credentialSetter) {
        if (this.credential == null) {
            this.credential = new CreateCredentialRequestBodyCredential();
            credentialSetter.accept(this.credential);
        }

        return this;
    }

    /**
     * Get credential
     * @return credential
     */
    public CreateCredentialRequestBodyCredential getCredential() {
        return credential;
    }

    public void setCredential(CreateCredentialRequestBodyCredential credential) {
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
        CreateCredentialRequestBody createCredentialRequestBody = (CreateCredentialRequestBody) o;
        return Objects.equals(this.credential, createCredentialRequestBody.credential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credential);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCredentialRequestBody {\n");
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
