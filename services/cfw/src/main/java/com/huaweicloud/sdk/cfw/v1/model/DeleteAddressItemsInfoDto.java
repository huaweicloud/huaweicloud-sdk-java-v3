package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteAddressItemsInfoDto
 */
public class DeleteAddressItemsInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_item_ids")

    private List<String> addressItemIds = null;

    public DeleteAddressItemsInfoDto withSetId(String setId) {
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

    public DeleteAddressItemsInfoDto withAddressItemIds(List<String> addressItemIds) {
        this.addressItemIds = addressItemIds;
        return this;
    }

    public DeleteAddressItemsInfoDto addAddressItemIdsItem(String addressItemIdsItem) {
        if (this.addressItemIds == null) {
            this.addressItemIds = new ArrayList<>();
        }
        this.addressItemIds.add(addressItemIdsItem);
        return this;
    }

    public DeleteAddressItemsInfoDto withAddressItemIds(Consumer<List<String>> addressItemIdsSetter) {
        if (this.addressItemIds == null) {
            this.addressItemIds = new ArrayList<>();
        }
        addressItemIdsSetter.accept(this.addressItemIds);
        return this;
    }

    /**
     * 地址组成员id列表，地址组成员id可通过[查询地址组成员接口](ListAddressItems.xml)查询获得，通过返回值中的data.records.item_id（.表示各对象之间层级的区分）获得。
     * @return addressItemIds
     */
    public List<String> getAddressItemIds() {
        return addressItemIds;
    }

    public void setAddressItemIds(List<String> addressItemIds) {
        this.addressItemIds = addressItemIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAddressItemsInfoDto that = (DeleteAddressItemsInfoDto) obj;
        return Objects.equals(this.setId, that.setId) && Objects.equals(this.addressItemIds, that.addressItemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, addressItemIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAddressItemsInfoDto {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    addressItemIds: ").append(toIndentedString(addressItemIds)).append("\n");
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
