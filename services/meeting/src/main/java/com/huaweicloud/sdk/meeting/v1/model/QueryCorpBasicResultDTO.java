package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 企业基本信息
 */
public class QueryCorpBasicResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    @JacksonXmlProperty(localName = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    @JacksonXmlProperty(localName = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fax")

    @JacksonXmlProperty(localName = "fax")

    private String fax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    @JacksonXmlProperty(localName = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    @JacksonXmlProperty(localName = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spId")

    @JacksonXmlProperty(localName = "spId")

    private String spId;

    public QueryCorpBasicResultDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryCorpBasicResultDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 联系号码
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public QueryCorpBasicResultDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 联系号码所属的国家
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public QueryCorpBasicResultDTO withFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * 传真号码
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public QueryCorpBasicResultDTO withEmail(String email) {
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

    public QueryCorpBasicResultDTO withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public QueryCorpBasicResultDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryCorpBasicResultDTO withSpId(String spId) {
        this.spId = spId;
        return this;
    }

    /**
     * 企业所属spId
     * @return spId
     */
    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCorpBasicResultDTO queryCorpBasicResultDTO = (QueryCorpBasicResultDTO) o;
        return Objects.equals(this.name, queryCorpBasicResultDTO.name)
            && Objects.equals(this.phone, queryCorpBasicResultDTO.phone)
            && Objects.equals(this.country, queryCorpBasicResultDTO.country)
            && Objects.equals(this.fax, queryCorpBasicResultDTO.fax)
            && Objects.equals(this.email, queryCorpBasicResultDTO.email)
            && Objects.equals(this.address, queryCorpBasicResultDTO.address)
            && Objects.equals(this.description, queryCorpBasicResultDTO.description)
            && Objects.equals(this.spId, queryCorpBasicResultDTO.spId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, country, fax, email, address, description, spId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCorpBasicResultDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    spId: ").append(toIndentedString(spId)).append("\n");
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
