package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 验证码信息。
 */
public class VerificationCodeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact")

    private String contact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verificationCode")

    private String verificationCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    public VerificationCodeDTO withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * 后台自动识别是手机号还是邮箱。 如果为手机号，必须加上国家码，例如中国大陆手机为“+86xxxxxxxxxxx”，当填写手机号时 “country”参数必填。 
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public VerificationCodeDTO withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /**
     * 验证码，在校验的场景时需要携带。
     * @return verificationCode
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public VerificationCodeDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * [[手机号所属的国家](https://support.huaweicloud.com/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hws)[[手机号所属的国家](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hk) 。 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerificationCodeDTO verificationCodeDTO = (VerificationCodeDTO) o;
        return Objects.equals(this.contact, verificationCodeDTO.contact)
            && Objects.equals(this.verificationCode, verificationCodeDTO.verificationCode)
            && Objects.equals(this.country, verificationCodeDTO.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, verificationCode, country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerificationCodeDTO {\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
