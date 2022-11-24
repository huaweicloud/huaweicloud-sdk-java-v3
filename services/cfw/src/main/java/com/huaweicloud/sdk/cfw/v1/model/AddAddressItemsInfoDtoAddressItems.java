package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 成员信息
 */
public class AddAddressItemsInfoDtoAddressItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AddAddressItemsInfoDtoAddressItems withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 地址名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddAddressItemsInfoDtoAddressItems withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4,1 ipv6
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public AddAddressItemsInfoDtoAddressItems withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址组ip信息
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AddAddressItemsInfoDtoAddressItems withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 地址组成员描述
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
        AddAddressItemsInfoDtoAddressItems addAddressItemsInfoDtoAddressItems = (AddAddressItemsInfoDtoAddressItems) o;
        return Objects.equals(this.name, addAddressItemsInfoDtoAddressItems.name)
            && Objects.equals(this.addressType, addAddressItemsInfoDtoAddressItems.addressType)
            && Objects.equals(this.address, addAddressItemsInfoDtoAddressItems.address)
            && Objects.equals(this.description, addAddressItemsInfoDtoAddressItems.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addressType, address, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAddressItemsInfoDtoAddressItems {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
