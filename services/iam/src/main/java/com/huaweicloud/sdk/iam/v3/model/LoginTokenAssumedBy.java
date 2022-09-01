package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class LoginTokenAssumedBy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    @JacksonXmlProperty(localName = "user")

    private LoginTokenUser user;

    public LoginTokenAssumedBy withUser(LoginTokenUser user) {
        this.user = user;
        return this;
    }

    public LoginTokenAssumedBy withUser(Consumer<LoginTokenUser> userSetter) {
        if (this.user == null) {
            this.user = new LoginTokenUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public LoginTokenUser getUser() {
        return user;
    }

    public void setUser(LoginTokenUser user) {
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
        LoginTokenAssumedBy loginTokenAssumedBy = (LoginTokenAssumedBy) o;
        return Objects.equals(this.user, loginTokenAssumedBy.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginTokenAssumedBy {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
