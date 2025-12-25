package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 联系人信息
 */
public class HwcDomainContact {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register")

    private String register;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_name")

    private String contactName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_num")

    private String phoneNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zip_code")

    private String zipCode;

    public HwcDomainContact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HwcDomainContact withRegister(String register) {
        this.register = register;
        return this;
    }

    /**
     * 域名所有者
     * @return register
     */
    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public HwcDomainContact withContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * 联系人
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public HwcDomainContact withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /**
     * 联系电话
     * @return phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public HwcDomainContact withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 省份
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public HwcDomainContact withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 城市
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HwcDomainContact withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 通讯地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HwcDomainContact withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * 邮编
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcDomainContact that = (HwcDomainContact) obj;
        return Objects.equals(this.email, that.email) && Objects.equals(this.register, that.register)
            && Objects.equals(this.contactName, that.contactName) && Objects.equals(this.phoneNum, that.phoneNum)
            && Objects.equals(this.province, that.province) && Objects.equals(this.city, that.city)
            && Objects.equals(this.address, that.address) && Objects.equals(this.zipCode, that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, register, contactName, phoneNum, province, city, address, zipCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcDomainContact {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    register: ").append(toIndentedString(register)).append("\n");
        sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
        sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
