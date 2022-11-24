package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VerifyCodeCheckDTO
 */
public class VerifyCodeCheckDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public VerifyCodeCheckDTO withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 必须和发送验证码时带的用户身份信息相同。 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public VerifyCodeCheckDTO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 验证码。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyCodeCheckDTO verifyCodeCheckDTO = (VerifyCodeCheckDTO) o;
        return Objects.equals(this.user, verifyCodeCheckDTO.user) && Objects.equals(this.code, verifyCodeCheckDTO.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyCodeCheckDTO {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
