package com.huaweicloud.sdk.mapds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCredentialResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credentials")

    private List<CredentialsRespCredentials> credentials = null;

    public ShowCredentialResponse withCredentials(List<CredentialsRespCredentials> credentials) {
        this.credentials = credentials;
        return this;
    }

    public ShowCredentialResponse addCredentialsItem(CredentialsRespCredentials credentialsItem) {
        if (this.credentials == null) {
            this.credentials = new ArrayList<>();
        }
        this.credentials.add(credentialsItem);
        return this;
    }

    public ShowCredentialResponse withCredentials(Consumer<List<CredentialsRespCredentials>> credentialsSetter) {
        if (this.credentials == null) {
            this.credentials = new ArrayList<>();
        }
        credentialsSetter.accept(this.credentials);
        return this;
    }

    /**
     * 凭证信息。
     * @return credentials
     */
    public List<CredentialsRespCredentials> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<CredentialsRespCredentials> credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCredentialResponse that = (ShowCredentialResponse) obj;
        return Objects.equals(this.credentials, that.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCredentialResponse {\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
