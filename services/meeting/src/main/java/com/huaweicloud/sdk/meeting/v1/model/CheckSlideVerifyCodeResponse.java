package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckSlideVerifyCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire")

    private Integer expire;

    public CheckSlideVerifyCodeResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 访问Token字符串。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CheckSlideVerifyCodeResponse withExpire(Integer expire) {
        this.expire = expire;
        return this;
    }

    /**
     * 过期时间，单位：秒。
     * @return expire
     */
    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckSlideVerifyCodeResponse that = (CheckSlideVerifyCodeResponse) obj;
        return Objects.equals(this.token, that.token) && Objects.equals(this.expire, that.expire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, expire);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSlideVerifyCodeResponse {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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
