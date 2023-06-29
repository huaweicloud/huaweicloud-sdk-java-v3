package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标记接受云硬盘过户操作。
 */
public class CinderAcceptVolumeTransferOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_key")

    private String authKey;

    public CinderAcceptVolumeTransferOption withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * 云硬盘过户的身份认证密钥。  创建云硬盘过户时会返回该身份认证密钥。
     * @return authKey
     */
    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CinderAcceptVolumeTransferOption that = (CinderAcceptVolumeTransferOption) obj;
        return Objects.equals(this.authKey, that.authKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderAcceptVolumeTransferOption {\n");
        sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
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
