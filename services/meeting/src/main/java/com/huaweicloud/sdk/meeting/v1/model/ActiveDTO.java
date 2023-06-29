package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备联系人信息。
 */
public class ActiveDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smsNumber")

    private String smsNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emailAddr")

    private String emailAddr;

    public ActiveDTO withSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
        return this;
    }

    /**
     * 手机号。 例如中国大陆手机+86xxxxxxxxxxx。当填写手机号时 “country”参数必填。 > 号码和邮箱必须填一个，若企业未开启短信功能，则邮箱必填。 
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
     * [[手机号所属的国家](https://support.huaweicloud.com/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hws)[[手机号所属的国家](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hk) 。 
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
     * 邮件地址。 > 号码和邮箱必须填一个，若企业未开启短信功能，则邮箱必填。 
     * @return emailAddr
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActiveDTO that = (ActiveDTO) obj;
        return Objects.equals(this.smsNumber, that.smsNumber) && Objects.equals(this.country, that.country)
            && Objects.equals(this.emailAddr, that.emailAddr);
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
