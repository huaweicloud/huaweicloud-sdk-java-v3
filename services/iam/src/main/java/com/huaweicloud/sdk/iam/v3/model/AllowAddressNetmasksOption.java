package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class AllowAddressNetmasksOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_netmask")

    @JacksonXmlProperty(localName = "address_netmask")

    private String addressNetmask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public AllowAddressNetmasksOption withAddressNetmask(String addressNetmask) {
        this.addressNetmask = addressNetmask;
        return this;
    }

    /**
     * IP地址或网段,例如:192.168.0.1/24。
     * @return addressNetmask
     */
    public String getAddressNetmask() {
        return addressNetmask;
    }

    public void setAddressNetmask(String addressNetmask) {
        this.addressNetmask = addressNetmask;
    }

    public AllowAddressNetmasksOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllowAddressNetmasksOption allowAddressNetmasksOption = (AllowAddressNetmasksOption) o;
        return Objects.equals(this.addressNetmask, allowAddressNetmasksOption.addressNetmask)
            && Objects.equals(this.description, allowAddressNetmasksOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressNetmask, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowAddressNetmasksOption {\n");
        sb.append("    addressNetmask: ").append(toIndentedString(addressNetmask)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
