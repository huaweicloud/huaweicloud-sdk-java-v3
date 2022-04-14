package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** PostAddressInfoIntl */
public class PostAddressInfoIntl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipients")

    private String recipients;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zipCode")

    private String zipCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobilePhone")

    private String mobilePhone;

    public PostAddressInfoIntl withAddress(String address) {
        this.address = address;
        return this;
    }

    /** 收件人地址。
     * 
     * @return address */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PostAddressInfoIntl withRecipients(String recipients) {
        this.recipients = recipients;
        return this;
    }

    /** 收件人。
     * 
     * @return recipients */
    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public PostAddressInfoIntl withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /** 收件所在地邮政编码。
     * 
     * @return zipCode */
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public PostAddressInfoIntl withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /** 收件人手机号码。
     * 
     * @return mobilePhone */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostAddressInfoIntl postAddressInfoIntl = (PostAddressInfoIntl) o;
        return Objects.equals(this.address, postAddressInfoIntl.address)
            && Objects.equals(this.recipients, postAddressInfoIntl.recipients)
            && Objects.equals(this.zipCode, postAddressInfoIntl.zipCode)
            && Objects.equals(this.mobilePhone, postAddressInfoIntl.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, recipients, zipCode, mobilePhone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostAddressInfoIntl {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
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
