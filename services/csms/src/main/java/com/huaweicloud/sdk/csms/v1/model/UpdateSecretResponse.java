package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSecretResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    @JacksonXmlProperty(localName = "secret")

    private Secret secret;

    public UpdateSecretResponse withSecret(Secret secret) {
        this.secret = secret;
        return this;
    }

    public UpdateSecretResponse withSecret(Consumer<Secret> secretSetter) {
        if (this.secret == null) {
            this.secret = new Secret();
            secretSetter.accept(this.secret);
        }

        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    public Secret getSecret() {
        return secret;
    }

    public void setSecret(Secret secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecretResponse updateSecretResponse = (UpdateSecretResponse) o;
        return Objects.equals(this.secret, updateSecretResponse.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretResponse {\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
