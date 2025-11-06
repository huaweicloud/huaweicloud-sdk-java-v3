package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateHttpsPasswordSetting
 */
public class UpdateHttpsPasswordSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_clone_iam_auth")

    private String httpsCloneIamAuth;

    public UpdateHttpsPasswordSetting withHttpsCloneIamAuth(String httpsCloneIamAuth) {
        this.httpsCloneIamAuth = httpsCloneIamAuth;
        return this;
    }

    /**
     * **参数解释：** 是否用https的认证方式 true,false。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return httpsCloneIamAuth
     */
    public String getHttpsCloneIamAuth() {
        return httpsCloneIamAuth;
    }

    public void setHttpsCloneIamAuth(String httpsCloneIamAuth) {
        this.httpsCloneIamAuth = httpsCloneIamAuth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpsPasswordSetting that = (UpdateHttpsPasswordSetting) obj;
        return Objects.equals(this.httpsCloneIamAuth, that.httpsCloneIamAuth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpsCloneIamAuth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpsPasswordSetting {\n");
        sb.append("    httpsCloneIamAuth: ").append(toIndentedString(httpsCloneIamAuth)).append("\n");
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
