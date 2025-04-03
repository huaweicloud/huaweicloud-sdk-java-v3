package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddressItemDto
 */
public class AddressItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formatted")

    private String formatted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streetAddress")

    private String streetAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locality")

    private String locality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postalCode")

    private String postalCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private Boolean primary;

    public AddressItemDto withFormatted(String formatted) {
        this.formatted = formatted;
        return this;
    }

    /**
     * 包含要显示的地址的格式化版本的字符串
     * @return formatted
     */
    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public AddressItemDto withStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    /**
     * 街道
     * @return streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public AddressItemDto withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * 地址位置
     * @return locality
     */
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public AddressItemDto withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AddressItemDto withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * 邮政编码
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public AddressItemDto withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 国家或地区
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressItemDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 表示地址类型的字符串
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AddressItemDto withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 一个布尔值，表示这是否是用户的主地址
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddressItemDto that = (AddressItemDto) obj;
        return Objects.equals(this.formatted, that.formatted) && Objects.equals(this.streetAddress, that.streetAddress)
            && Objects.equals(this.locality, that.locality) && Objects.equals(this.region, that.region)
            && Objects.equals(this.postalCode, that.postalCode) && Objects.equals(this.country, that.country)
            && Objects.equals(this.type, that.type) && Objects.equals(this.primary, that.primary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formatted, streetAddress, locality, region, postalCode, country, type, primary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressItemDto {\n");
        sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
        sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
