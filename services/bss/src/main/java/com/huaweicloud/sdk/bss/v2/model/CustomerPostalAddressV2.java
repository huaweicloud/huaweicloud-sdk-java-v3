package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CustomerPostalAddressV2
 */
public class CustomerPostalAddressV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address_id")
    
    private String addressId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recipient")
    
    private String recipient;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nationality")
    
    private String nationality;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="province")
    
    private String province;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="city")
    
    private String city;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="district")
    
    private String district;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zipcode")
    
    private String zipcode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="areacode")
    
    private String areacode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_default")
    
    private Integer isDefault;

    public CustomerPostalAddressV2 withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    


    /**
     * |参数名称：邮寄地址ID。| |参数约束及描述：邮寄地址ID。|
     * @return addressId
     */
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public CustomerPostalAddressV2 withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    


    /**
     * |参数名称：收件人姓名。| |参数约束及描述：收件人姓名。|
     * @return recipient
     */
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public CustomerPostalAddressV2 withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    


    /**
     * |参数名称：国家。例如：中国| |参数约束及描述：国家。例如：中国|
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public CustomerPostalAddressV2 withProvince(String province) {
        this.province = province;
        return this;
    }

    


    /**
     * |参数名称：省/自治区/直辖市。例如：江苏省。| |参数约束及描述：省/自治区/直辖市。例如：江苏省。|
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public CustomerPostalAddressV2 withCity(String city) {
        this.city = city;
        return this;
    }

    


    /**
     * |参数名称：市/区。例如：南京市。| |参数约束及描述：市/区。例如：南京市。|
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CustomerPostalAddressV2 withDistrict(String district) {
        this.district = district;
        return this;
    }

    


    /**
     * |参数名称：区。例如：雨花区。| |参数约束及描述：区。例如：雨花区。|
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public CustomerPostalAddressV2 withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * |参数名称：邮寄详细地址。| |参数约束及描述：邮寄详细地址。|
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerPostalAddressV2 withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    


    /**
     * |参数名称：邮编。| |参数约束及描述：邮编。|
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public CustomerPostalAddressV2 withAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

    


    /**
     * |参数名称：国家码，例如：中国：0086| |参数约束及描述：国家码，例如：中国：0086|
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public CustomerPostalAddressV2 withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    


    /**
     * |参数名称：手机号码，不带国家码。| |参数约束及描述：手机号码，不带国家码。|
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public CustomerPostalAddressV2 withIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    


    /**
     * |参数名称：是否默认地址，默认为0。1：默认地址0：非默认地址| |参数的约束及描述：是否默认地址，默认为0。1：默认地址0：非默认地址|
     * @return isDefault
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerPostalAddressV2 customerPostalAddressV2 = (CustomerPostalAddressV2) o;
        return Objects.equals(this.addressId, customerPostalAddressV2.addressId) &&
            Objects.equals(this.recipient, customerPostalAddressV2.recipient) &&
            Objects.equals(this.nationality, customerPostalAddressV2.nationality) &&
            Objects.equals(this.province, customerPostalAddressV2.province) &&
            Objects.equals(this.city, customerPostalAddressV2.city) &&
            Objects.equals(this.district, customerPostalAddressV2.district) &&
            Objects.equals(this.address, customerPostalAddressV2.address) &&
            Objects.equals(this.zipcode, customerPostalAddressV2.zipcode) &&
            Objects.equals(this.areacode, customerPostalAddressV2.areacode) &&
            Objects.equals(this.mobilePhone, customerPostalAddressV2.mobilePhone) &&
            Objects.equals(this.isDefault, customerPostalAddressV2.isDefault);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addressId, recipient, nationality, province, city, district, address, zipcode, areacode, mobilePhone, isDefault);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerPostalAddressV2 {\n");
        sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

