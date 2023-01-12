package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class WebImageContactInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "district")

    private String district;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_address")

    private String detailAddress;

    public WebImageContactInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 传入contact_info时的返回，为姓名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebImageContactInfo withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 传入contact_info时的返回，联系电话。 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public WebImageContactInfo withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 传入contact_info时的返回，省。 
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public WebImageContactInfo withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 传入contact_info时的返回，市。 
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public WebImageContactInfo withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * 传入contact_info时的返回，县区。 
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public WebImageContactInfo withDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
        return this;
    }

    /**
     * 传入contact_info时的返回，详细地址（不含省市区）。 
     * @return detailAddress
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebImageContactInfo webImageContactInfo = (WebImageContactInfo) o;
        return Objects.equals(this.name, webImageContactInfo.name)
            && Objects.equals(this.phone, webImageContactInfo.phone)
            && Objects.equals(this.province, webImageContactInfo.province)
            && Objects.equals(this.city, webImageContactInfo.city)
            && Objects.equals(this.district, webImageContactInfo.district)
            && Objects.equals(this.detailAddress, webImageContactInfo.detailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, province, city, district, detailAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebImageContactInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
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
