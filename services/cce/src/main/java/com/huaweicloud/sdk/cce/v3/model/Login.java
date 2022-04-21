package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Login
 */
public class Login {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sshKey")

    private String sshKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userPassword")

    private UserPassword userPassword;

    public Login withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * 选择密钥对方式登录时的密钥对名称。密钥对和密码登录方式二者必选其一。
     * @return sshKey
     */
    public String getSshKey() {
        return sshKey;
    }

    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }

    public Login withUserPassword(UserPassword userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public Login withUserPassword(Consumer<UserPassword> userPasswordSetter) {
        if (this.userPassword == null) {
            this.userPassword = new UserPassword();
            userPasswordSetter.accept(this.userPassword);
        }

        return this;
    }

    /**
     * Get userPassword
     * @return userPassword
     */
    public UserPassword getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(UserPassword userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Login login = (Login) o;
        return Objects.equals(this.sshKey, login.sshKey) && Objects.equals(this.userPassword, login.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sshKey, userPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Login {\n");
        sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
        sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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
