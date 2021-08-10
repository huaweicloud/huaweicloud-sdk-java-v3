package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 管理员信息 */
public class AdminDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd")

    private String pwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    public AdminDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    /** 用户账号，帐号只能包含大小写字母、数字、_、-、.、@符号，不能为纯数字和@后面带.号
     * 
     * @return account */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public AdminDTO withName(String name) {
        this.name = name;
        return this;
    }

    /** 名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdminDTO withPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    /** 若携带则以前台携带为准，否则后台默认生成,密码必须满足: - 1、6-32位 - 2、不能和账号的正序和倒序一致 - 3、至少包含两种字符类型：小写字母、大写字母、数字、特殊字符（` ~ ! @ # $ % ^ & * (
     * ) - _ = + \\ | [ { } ] ; : \\\" ,' < . > / ?
     * 
     * @return pwd */
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public AdminDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /** 邮箱，管理员手机和邮箱必填其一，否则无法重置密码。如果企业短信开关关闭，则邮箱必填。格式必须满足(^$|^[\\\\w-+]+(\\\\.[\\\\w-+]+)*@[\\\\w-]+(\\\\.[\\\\w-]+)*(\\\\.[\\\\w-]{1,})$)
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AdminDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /** 手机号，必须加上国家码，例如中国大陆手机+86xxxxxxx，当填写手机号时 “country”参数必填,手机格式必须满足(^$|^[+]?[0-9]+$)
     * 
     * @return phone */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AdminDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 若smsNumber为手机号,则需带上手机号所属的国家。 例如国家为中国大陆则country参数取值为chinaPR
     * 国家和国家码的对应关系请参考：https://support.huaweicloud.com/api-meeting/meeting_21_0109.html
     * 
     * @return country */
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
        AdminDTO adminDTO = (AdminDTO) o;
        return Objects.equals(this.account, adminDTO.account) && Objects.equals(this.name, adminDTO.name)
            && Objects.equals(this.pwd, adminDTO.pwd) && Objects.equals(this.email, adminDTO.email)
            && Objects.equals(this.phone, adminDTO.phone) && Objects.equals(this.country, adminDTO.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, name, pwd, email, phone, country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdminDTO {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
