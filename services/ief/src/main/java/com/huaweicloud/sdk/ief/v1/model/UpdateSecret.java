package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 密钥。
 */
public class UpdateSecret {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    @JacksonXmlProperty(localName = "secret")

    private UpdateSecretDetail secret;

    public UpdateSecret withSecret(UpdateSecretDetail secret) {
        this.secret = secret;
        return this;
    }

    public UpdateSecret withSecret(Consumer<UpdateSecretDetail> secretSetter) {
        if (this.secret == null) {
            this.secret = new UpdateSecretDetail();
            secretSetter.accept(this.secret);
        }

        return this;
    }

    /**
     * Get secret
     * @return secret
     */
    public UpdateSecretDetail getSecret() {
        return secret;
    }

    public void setSecret(UpdateSecretDetail secret) {
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
        UpdateSecret updateSecret = (UpdateSecret) o;
        return Objects.equals(this.secret, updateSecret.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecret {\n");
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
