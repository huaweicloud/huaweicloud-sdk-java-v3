package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 管理员信息
 */
public class QueryAdminResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    @JacksonXmlProperty(localName = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminType")

    @JacksonXmlProperty(localName = "adminType")

    private Integer adminType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    @JacksonXmlProperty(localName = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    @JacksonXmlProperty(localName = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    @JacksonXmlProperty(localName = "country")

    private String country;

    public QueryAdminResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryAdminResultDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户账号
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public QueryAdminResultDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryAdminResultDTO withAdminType(Integer adminType) {
        this.adminType = adminType;
        return this;
    }

    /**
     * 管理员类型 - 0：默认管理员 - 1：普通管理员
     * @return adminType
     */
    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public QueryAdminResultDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public QueryAdminResultDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 联系电话
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public QueryAdminResultDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 联系电话所属的国家
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
        QueryAdminResultDTO queryAdminResultDTO = (QueryAdminResultDTO) o;
        return Objects.equals(this.id, queryAdminResultDTO.id)
            && Objects.equals(this.account, queryAdminResultDTO.account)
            && Objects.equals(this.name, queryAdminResultDTO.name)
            && Objects.equals(this.adminType, queryAdminResultDTO.adminType)
            && Objects.equals(this.email, queryAdminResultDTO.email)
            && Objects.equals(this.phone, queryAdminResultDTO.phone)
            && Objects.equals(this.country, queryAdminResultDTO.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, name, adminType, email, phone, country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAdminResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
