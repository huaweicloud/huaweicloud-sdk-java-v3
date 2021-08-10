package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneCreateUserRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private KeystoneCreateUserOption user;

    public KeystoneCreateUserRequestBody withUser(KeystoneCreateUserOption user) {
        this.user = user;
        return this;
    }

    public KeystoneCreateUserRequestBody withUser(Consumer<KeystoneCreateUserOption> userSetter) {
        if (this.user == null) {
            this.user = new KeystoneCreateUserOption();
            userSetter.accept(this.user);
        }

        return this;
    }

    /** Get user
     * 
     * @return user */
    public KeystoneCreateUserOption getUser() {
        return user;
    }

    public void setUser(KeystoneCreateUserOption user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateUserRequestBody keystoneCreateUserRequestBody = (KeystoneCreateUserRequestBody) o;
        return Objects.equals(this.user, keystoneCreateUserRequestBody.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateUserRequestBody {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
