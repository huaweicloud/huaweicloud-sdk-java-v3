package com.huaweicloud.sdk.iam.v3.model;

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
public class ListPermanentAccessKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credentials")

    private List<Credentials> credentials = null;

    public ListPermanentAccessKeysResponse withCredentials(List<Credentials> credentials) {
        this.credentials = credentials;
        return this;
    }

    public ListPermanentAccessKeysResponse addCredentialsItem(Credentials credentialsItem) {
        if (this.credentials == null) {
            this.credentials = new ArrayList<>();
        }
        this.credentials.add(credentialsItem);
        return this;
    }

    public ListPermanentAccessKeysResponse withCredentials(Consumer<List<Credentials>> credentialsSetter) {
        if (this.credentials == null) {
            this.credentials = new ArrayList<>();
        }
        credentialsSetter.accept(this.credentials);
        return this;
    }

    /**
     * 认证结果信息列表。
     * @return credentials
     */
    public List<Credentials> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<Credentials> credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPermanentAccessKeysResponse listPermanentAccessKeysResponse = (ListPermanentAccessKeysResponse) o;
        return Objects.equals(this.credentials, listPermanentAccessKeysResponse.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPermanentAccessKeysResponse {\n");
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
