package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AddPostalReq
 */
public class AddPostalReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recipient")
    
    private String recipient;


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
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_default")
    
    private Integer isDefault;

    public AddPostalReq withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    


    /**
     * 收件人姓名。
     * @return recipient
     */
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    

    public AddPostalReq withProvince(String province) {
        this.province = province;
        return this;
    }

    


    /**
     * 省、自治区或直辖市。例如：江苏省。
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    

    public AddPostalReq withCity(String city) {
        this.city = city;
        return this;
    }

    


    /**
     * 市/区。例如：南京市。
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    

    public AddPostalReq withDistrict(String district) {
        this.district = district;
        return this;
    }

    


    /**
     * 区。例如：雨花台区。
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    

    public AddPostalReq withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 邮寄详细地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public AddPostalReq withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    


    /**
     * 邮寄地址所在邮编。
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    

    public AddPostalReq withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    


    /**
     * 手机号码，不带国家码。
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    

    public AddPostalReq withIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    


    /**
     * 是否默认地址，默认为0。 1：默认地址0：非默认地址
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddPostalReq addPostalReq = (AddPostalReq) o;
        return Objects.equals(this.recipient, addPostalReq.recipient) &&
            Objects.equals(this.province, addPostalReq.province) &&
            Objects.equals(this.city, addPostalReq.city) &&
            Objects.equals(this.district, addPostalReq.district) &&
            Objects.equals(this.address, addPostalReq.address) &&
            Objects.equals(this.zipcode, addPostalReq.zipcode) &&
            Objects.equals(this.mobilePhone, addPostalReq.mobilePhone) &&
            Objects.equals(this.isDefault, addPostalReq.isDefault);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recipient, province, city, district, address, zipcode, mobilePhone, isDefault);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPostalReq {\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
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

