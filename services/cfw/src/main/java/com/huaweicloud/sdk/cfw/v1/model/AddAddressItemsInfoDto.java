package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 地址组成员信息
 */
public class AddAddressItemsInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_items")

    private List<AddAddressItemsInfoDtoAddressItems> addressItems = null;

    public AddAddressItemsInfoDto withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 地址组id，可通过[查询地址组列表接口](ListAddressSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public AddAddressItemsInfoDto withAddressItems(List<AddAddressItemsInfoDtoAddressItems> addressItems) {
        this.addressItems = addressItems;
        return this;
    }

    public AddAddressItemsInfoDto addAddressItemsItem(AddAddressItemsInfoDtoAddressItems addressItemsItem) {
        if (this.addressItems == null) {
            this.addressItems = new ArrayList<>();
        }
        this.addressItems.add(addressItemsItem);
        return this;
    }

    public AddAddressItemsInfoDto withAddressItems(
        Consumer<List<AddAddressItemsInfoDtoAddressItems>> addressItemsSetter) {
        if (this.addressItems == null) {
            this.addressItems = new ArrayList<>();
        }
        addressItemsSetter.accept(this.addressItems);
        return this;
    }

    /**
     * 地址组成员列表
     * @return addressItems
     */
    public List<AddAddressItemsInfoDtoAddressItems> getAddressItems() {
        return addressItems;
    }

    public void setAddressItems(List<AddAddressItemsInfoDtoAddressItems> addressItems) {
        this.addressItems = addressItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddAddressItemsInfoDto that = (AddAddressItemsInfoDto) obj;
        return Objects.equals(this.setId, that.setId) && Objects.equals(this.addressItems, that.addressItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, addressItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAddressItemsInfoDto {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    addressItems: ").append(toIndentedString(addressItems)).append("\n");
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
