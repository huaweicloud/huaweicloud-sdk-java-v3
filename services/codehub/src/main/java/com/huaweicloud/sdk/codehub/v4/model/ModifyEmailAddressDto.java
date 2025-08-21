package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyEmailAddressDto
 */
public class ModifyEmailAddressDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_code")

    private String verifyCode;

    public ModifyEmailAddressDto withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * **参数解释：** 邮箱。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ModifyEmailAddressDto withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    /**
     * **参数解释：** 验证码。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyEmailAddressDto that = (ModifyEmailAddressDto) obj;
        return Objects.equals(this.email, that.email) && Objects.equals(this.verifyCode, that.verifyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, verifyCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyEmailAddressDto {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
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
