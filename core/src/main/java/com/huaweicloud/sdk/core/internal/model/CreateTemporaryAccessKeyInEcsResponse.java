package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateTemporaryAccessKeyInEcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    private Credential credential;

    public CreateTemporaryAccessKeyInEcsResponse withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    public CreateTemporaryAccessKeyInEcsResponse withCredential(Consumer<Credential> credentialSetter) {
        if (this.credential == null) {
            this.credential = new Credential();
            credentialSetter.accept(this.credential);
        }

        return this;
    }

    /** Get credential
     * 
     * @return credential */
    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemporaryAccessKeyInEcsResponse response = (CreateTemporaryAccessKeyInEcsResponse) o;
        return Objects.equals(this.credential, response.credential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credential);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemporaryAccessKeyInEcsResponse {\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
