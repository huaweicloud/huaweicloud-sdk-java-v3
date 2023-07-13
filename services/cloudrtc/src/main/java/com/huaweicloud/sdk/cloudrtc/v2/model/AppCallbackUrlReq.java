package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改app回调请求
 */
public class AppCallbackUrlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_key")

    private String authKey;

    public AppCallbackUrlReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 回调通知url地址，url必须以http://或https://开头，需要支持POST调用。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AppCallbackUrlReq withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * 回调秘钥，主要用于鉴权
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
        AppCallbackUrlReq that = (AppCallbackUrlReq) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.authKey, that.authKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, authKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppCallbackUrlReq {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
