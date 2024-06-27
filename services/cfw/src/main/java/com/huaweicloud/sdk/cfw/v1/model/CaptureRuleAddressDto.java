package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CaptureRuleAddressDto
 */
public class CaptureRuleAddressDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public CaptureRuleAddressDto withAddress(String address) {
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

    public CaptureRuleAddressDto withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 目的地址类型0 ipv4,1 ipv6
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public CaptureRuleAddressDto withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 输入地址类型，目前只支持0，手工输入类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaptureRuleAddressDto that = (CaptureRuleAddressDto) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.addressType, that.addressType)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, addressType, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaptureRuleAddressDto {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
