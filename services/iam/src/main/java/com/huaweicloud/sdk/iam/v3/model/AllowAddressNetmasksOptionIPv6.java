package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AllowAddressNetmasksOptionIPv6 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_netmask")

    private String addressNetmask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AllowAddressNetmasksOptionIPv6 withAddressNetmask(String addressNetmask) {
        this.addressNetmask = addressNetmask;
        return this;
    }

    /**
     * IPv6地址或网段，例如： 0000:0000:0000:0000:0000:0000:0000:0000/126。
     * @return addressNetmask
     */
    public String getAddressNetmask() {
        return addressNetmask;
    }

    public void setAddressNetmask(String addressNetmask) {
        this.addressNetmask = addressNetmask;
    }

    public AllowAddressNetmasksOptionIPv6 withDescription(String description) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AllowAddressNetmasksOptionIPv6 that = (AllowAddressNetmasksOptionIPv6) obj;
        return Objects.equals(this.addressNetmask, that.addressNetmask)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressNetmask, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowAddressNetmasksOptionIPv6 {\n");
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
