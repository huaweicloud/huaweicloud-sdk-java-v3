package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户输入的数字人名片信息。实际可以填写哪些字段取决于名片模板。
 */
public class BusinessCardTextConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private String company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile_phone")

    private String mobilePhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mail")

    private String mail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other1")

    private String other1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other2")

    private String other2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other3")

    private String other3;

    public BusinessCardTextConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusinessCardTextConfig withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * 企业或组织名称。
     * @return company
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BusinessCardTextConfig withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 职位名称。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BusinessCardTextConfig withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * 手机号码。
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public BusinessCardTextConfig withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 固话号码。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BusinessCardTextConfig withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * 电子邮件地址。
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public BusinessCardTextConfig withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BusinessCardTextConfig withOther1(String other1) {
        this.other1 = other1;
        return this;
    }

    /**
     * 其他信息1。可填写一些公司广告语等
     * @return other1
     */
    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public BusinessCardTextConfig withOther2(String other2) {
        this.other2 = other2;
        return this;
    }

    /**
     * 其他信息2。可填写一些公司广告语等
     * @return other2
     */
    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public BusinessCardTextConfig withOther3(String other3) {
        this.other3 = other3;
        return this;
    }

    /**
     * 其他信息3。可填写一些公司广告语等
     * @return other3
     */
    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessCardTextConfig that = (BusinessCardTextConfig) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.company, that.company)
            && Objects.equals(this.title, that.title) && Objects.equals(this.mobilePhone, that.mobilePhone)
            && Objects.equals(this.phone, that.phone) && Objects.equals(this.mail, that.mail)
            && Objects.equals(this.address, that.address) && Objects.equals(this.other1, that.other1)
            && Objects.equals(this.other2, that.other2) && Objects.equals(this.other3, that.other3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, title, mobilePhone, phone, mail, address, other1, other2, other3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessCardTextConfig {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    other1: ").append(toIndentedString(other1)).append("\n");
        sb.append("    other2: ").append(toIndentedString(other2)).append("\n");
        sb.append("    other3: ").append(toIndentedString(other3)).append("\n");
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
