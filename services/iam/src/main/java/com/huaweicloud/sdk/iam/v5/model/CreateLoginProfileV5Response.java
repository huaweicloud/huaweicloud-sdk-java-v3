package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateLoginProfileV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_profile")

    private LoginProfile loginProfile;

    public CreateLoginProfileV5Response withLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }

    public CreateLoginProfileV5Response withLoginProfile(Consumer<LoginProfile> loginProfileSetter) {
        if (this.loginProfile == null) {
            this.loginProfile = new LoginProfile();
            loginProfileSetter.accept(this.loginProfile);
        }

        return this;
    }

    /**
     * Get loginProfile
     * @return loginProfile
     */
    public LoginProfile getLoginProfile() {
        return loginProfile;
    }

    public void setLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLoginProfileV5Response that = (CreateLoginProfileV5Response) obj;
        return Objects.equals(this.loginProfile, that.loginProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoginProfileV5Response {\n");
        sb.append("    loginProfile: ").append(toIndentedString(loginProfile)).append("\n");
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
