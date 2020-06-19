package com.huaweicloud.sdk.meeting.v1.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckVerifyCodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="token")
    
    private String token;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire")
    
    private Integer expire;

    public CheckVerifyCodeResponse withToken(String token) {
        this.token = token;
        return this;
    }

    


    /**
     * 访问token字符串
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CheckVerifyCodeResponse withExpire(Integer expire) {
        this.expire = expire;
        return this;
    }

    


    /**
     * 过期时间，单位：秒
     * @return expire
     */
    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckVerifyCodeResponse checkVerifyCodeResponse = (CheckVerifyCodeResponse) o;
        return Objects.equals(this.token, checkVerifyCodeResponse.token) &&
            Objects.equals(this.expire, checkVerifyCodeResponse.expire);
    }
    @Override
    public int hashCode() {
        return Objects.hash(token, expire);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckVerifyCodeResponse {\n");
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

