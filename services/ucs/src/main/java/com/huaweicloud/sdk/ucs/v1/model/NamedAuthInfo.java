package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NamedAuthInfo
 */
public class NamedAuthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private AuthInfo user;

    public NamedAuthInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamedAuthInfo withUser(AuthInfo user) {
        this.user = user;
        return this;
    }

    public NamedAuthInfo withUser(Consumer<AuthInfo> userSetter) {
        if (this.user == null) {
            this.user = new AuthInfo();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public AuthInfo getUser() {
        return user;
    }

    public void setUser(AuthInfo user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamedAuthInfo that = (NamedAuthInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamedAuthInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
