package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Credential;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CreateTemporaryAccessKeyByAgencyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credential")
    
    private Credential credential = null;

    public CreateTemporaryAccessKeyByAgencyResponse withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    public CreateTemporaryAccessKeyByAgencyResponse withCredential(Consumer<Credential> credentialSetter) {
        if(this.credential == null ){
            this.credential = new Credential();
        }
        credentialSetter.accept(this.credential);
        return this;
    }


    /**
     * Get credential
     * @return credential
     */
    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
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
        CreateTemporaryAccessKeyByAgencyResponse createTemporaryAccessKeyByAgencyResponse = (CreateTemporaryAccessKeyByAgencyResponse) o;
        return Objects.equals(this.credential, createTemporaryAccessKeyByAgencyResponse.credential);
    }
    @Override
    public int hashCode() {
        return Objects.hash(credential);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemporaryAccessKeyByAgencyResponse {\n");
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

