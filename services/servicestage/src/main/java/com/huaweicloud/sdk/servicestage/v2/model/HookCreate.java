package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** HookCreate */
public class HookCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public HookCreate withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /** 无法猜测的随机字符串，用于验证接收到的payloads。
     * 
     * @return secret */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public HookCreate withUrl(String url) {
        this.url = url;
        return this;
    }

    /** hook触发时的回调URL。
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HookCreate hookCreate = (HookCreate) o;
        return Objects.equals(this.secret, hookCreate.secret) && Objects.equals(this.url, hookCreate.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HookCreate {\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
