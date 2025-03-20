package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserLastLoginV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_last_login")

    private UserLastLogin userLastLogin;

    public ShowUserLastLoginV5Response withUserLastLogin(UserLastLogin userLastLogin) {
        this.userLastLogin = userLastLogin;
        return this;
    }

    public ShowUserLastLoginV5Response withUserLastLogin(Consumer<UserLastLogin> userLastLoginSetter) {
        if (this.userLastLogin == null) {
            this.userLastLogin = new UserLastLogin();
            userLastLoginSetter.accept(this.userLastLogin);
        }

        return this;
    }

    /**
     * Get userLastLogin
     * @return userLastLogin
     */
    public UserLastLogin getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(UserLastLogin userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserLastLoginV5Response that = (ShowUserLastLoginV5Response) obj;
        return Objects.equals(this.userLastLogin, that.userLastLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userLastLogin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserLastLoginV5Response {\n");
        sb.append("    userLastLogin: ").append(toIndentedString(userLastLogin)).append("\n");
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
