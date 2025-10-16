package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ak/sk信息
 */
public class AuthObjectAuthAccessKey {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    public AuthObjectAuthAccessKey withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ak id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuthObjectAuthAccessKey withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * sk id
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthObjectAuthAccessKey that = (AuthObjectAuthAccessKey) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthObjectAuthAccessKey {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
