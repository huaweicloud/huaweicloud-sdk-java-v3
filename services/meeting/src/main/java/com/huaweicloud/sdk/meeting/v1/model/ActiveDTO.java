package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 约束 - 号码和邮箱必须填一个，若企业未开启短信功能，则邮箱必填
 */
public class ActiveDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smsNumber")

    @JacksonXmlProperty(localName = "smsNumber")

    private String smsNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    @JacksonXmlProperty(localName = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emailAddr")

    @JacksonXmlProperty(localName = "emailAddr")

    private String emailAddr;

    public ActiveDTO withSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
        return this;
    }

    /**
     * 手机号，如果为手机号，必须加上国家码。 例如中国大陆手机+86xxxxxxxxxxx，当填写手机号时 “country”参数必填。 maxLength：32 minLength：0
     * @return smsNumber
     */
    public String getSmsNumber() {
        return smsNumber;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    public ActiveDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 若smsNumber为手机号,则需带上手机号所属的国家。 例如国家为中国大陆则country参数取值为chinaPR 国家和国家码的对应关系请参考：https://support.huaweicloud.com/api-meeting/meeting_21_0109.html 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ActiveDTO withEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
        return this;
    }

    /**
     * 邮件地址。 maxLength：255 minLength：0
     * @return emailAddr
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActiveDTO activeDTO = (ActiveDTO) o;
        return Objects.equals(this.smsNumber, activeDTO.smsNumber) && Objects.equals(this.country, activeDTO.country)
            && Objects.equals(this.emailAddr, activeDTO.emailAddr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smsNumber, country, emailAddr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActiveDTO {\n");
        sb.append("    smsNumber: ").append(toIndentedString(smsNumber)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    emailAddr: ").append(toIndentedString(emailAddr)).append("\n");
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
