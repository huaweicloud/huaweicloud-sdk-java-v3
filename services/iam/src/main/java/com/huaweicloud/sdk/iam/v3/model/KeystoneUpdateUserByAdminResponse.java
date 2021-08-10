package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class KeystoneUpdateUserByAdminResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private KeystoneUpdateUserByAdminResult user;

    public KeystoneUpdateUserByAdminResponse withUser(KeystoneUpdateUserByAdminResult user) {
        this.user = user;
        return this;
    }

    public KeystoneUpdateUserByAdminResponse withUser(Consumer<KeystoneUpdateUserByAdminResult> userSetter) {
        if (this.user == null) {
            this.user = new KeystoneUpdateUserByAdminResult();
            userSetter.accept(this.user);
        }

        return this;
    }

    /** Get user
     * 
     * @return user */
    public KeystoneUpdateUserByAdminResult getUser() {
        return user;
    }

    public void setUser(KeystoneUpdateUserByAdminResult user) {
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
        KeystoneUpdateUserByAdminResponse keystoneUpdateUserByAdminResponse = (KeystoneUpdateUserByAdminResponse) o;
        return Objects.equals(this.user, keystoneUpdateUserByAdminResponse.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateUserByAdminResponse {\n");
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
