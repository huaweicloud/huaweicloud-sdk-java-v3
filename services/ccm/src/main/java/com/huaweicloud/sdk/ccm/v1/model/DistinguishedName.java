package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DistinguishedName */
public class DistinguishedName {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_name")

    private String commonName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locality")

    private String locality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit")

    private String organizationalUnit;

    public DistinguishedName withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /** 证书通用名称（CN）。
     * 
     * @return commonName */
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public DistinguishedName withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 国家编码，需符合正则\"**[A-Za-z]{2}**\"。
     * 
     * @return country */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public DistinguishedName withState(String state) {
        this.state = state;
        return this;
    }

    /** 省市名称。
     * 
     * @return state */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DistinguishedName withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /** 地区名称。
     * 
     * @return locality */
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public DistinguishedName withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /** 组织名称。
     * 
     * @return organization */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public DistinguishedName withOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    /** 组织单元名称。
     * 
     * @return organizationalUnit */
    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DistinguishedName distinguishedName = (DistinguishedName) o;
        return Objects.equals(this.commonName, distinguishedName.commonName)
            && Objects.equals(this.country, distinguishedName.country)
            && Objects.equals(this.state, distinguishedName.state)
            && Objects.equals(this.locality, distinguishedName.locality)
            && Objects.equals(this.organization, distinguishedName.organization)
            && Objects.equals(this.organizationalUnit, distinguishedName.organizationalUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonName, country, state, locality, organization, organizationalUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DistinguishedName {\n");
        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    organizationalUnit: ").append(toIndentedString(organizationalUnit)).append("\n");
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
