package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 鉴权信息
 */
public class AuthObjectAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessKey")

    private AuthObjectAuthAccessKey accessKey;

    public AuthObjectAuth withAccessKey(AuthObjectAuthAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public AuthObjectAuth withAccessKey(Consumer<AuthObjectAuthAccessKey> accessKeySetter) {
        if (this.accessKey == null) {
            this.accessKey = new AuthObjectAuthAccessKey();
            accessKeySetter.accept(this.accessKey);
        }

        return this;
    }

    /**
     * Get accessKey
     * @return accessKey
     */
    public AuthObjectAuthAccessKey getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(AuthObjectAuthAccessKey accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthObjectAuth that = (AuthObjectAuth) obj;
        return Objects.equals(this.accessKey, that.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthObjectAuth {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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
