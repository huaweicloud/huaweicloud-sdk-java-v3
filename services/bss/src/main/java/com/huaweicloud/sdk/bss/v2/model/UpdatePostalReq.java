package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdatePostalReq
 */
public class UpdatePostalReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address_id")
    
    private String addressId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="city")
    
    private String city;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="district")
    
    private String district;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_default")
    
    private Integer isDefault = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="province")
    
    private String province;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recipient")
    
    private String recipient;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zipcode")
    
    private String zipcode;

    public UpdatePostalReq withAddress(String address) {
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

    public UpdatePostalReq withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    


    /**
     * |参数名称：地址ID，地址的唯一索引| |参数约束及描述：地址ID，地址的唯一索引|
     * @return addressId
     */
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public UpdatePostalReq withCity(String city) {
        this.city = city;
        return this;
    }

    


    /**
     * |参数名称：市/区。例如：南京。| |参数约束及描述：市/区。例如：南京。|
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UpdatePostalReq withDistrict(String district) {
        this.district = district;
        return this;
    }

    


    /**
     * |参数名称：区。例如：雨花。| |参数约束及描述：区。例如：雨花。|
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public UpdatePostalReq withIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    


    /**
     * |参数名称：是否默认地址| |参数约束及描述：是否默认地址，默认为0。1：默认地址0：非默认地址|
     * minimum: 0
     * maximum: 1
     * @return isDefault
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public UpdatePostalReq withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    


    /**
     * |参数名称：手机号码，不带国家码| |参数约束及描述：手机号码，不带国家码|
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public UpdatePostalReq withProvince(String province) {
        this.province = province;
        return this;
    }

    


    /**
     * |参数名称：省/自治区/直辖市。例如：江苏，不要写成：江苏省| |参数约束及描述：省/自治区/直辖市。例如：江苏，不要写成：江苏省|
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public UpdatePostalReq withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    


    /**
     * |参数名称：收件人姓名| |参数约束及描述：收件人姓名|
     * @return recipient
     */
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public UpdatePostalReq withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    


    /**
     * |参数名称：邮编| |参数约束及描述：邮编|
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePostalReq updatePostalReq = (UpdatePostalReq) o;
        return Objects.equals(this.address, updatePostalReq.address) &&
            Objects.equals(this.addressId, updatePostalReq.addressId) &&
            Objects.equals(this.city, updatePostalReq.city) &&
            Objects.equals(this.district, updatePostalReq.district) &&
            Objects.equals(this.isDefault, updatePostalReq.isDefault) &&
            Objects.equals(this.mobilePhone, updatePostalReq.mobilePhone) &&
            Objects.equals(this.province, updatePostalReq.province) &&
            Objects.equals(this.recipient, updatePostalReq.recipient) &&
            Objects.equals(this.zipcode, updatePostalReq.zipcode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, addressId, city, district, isDefault, mobilePhone, province, recipient, zipcode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePostalReq {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
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

