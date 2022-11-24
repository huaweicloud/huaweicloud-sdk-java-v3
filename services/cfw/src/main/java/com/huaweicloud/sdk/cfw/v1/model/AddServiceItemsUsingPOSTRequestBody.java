package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddServiceItemsUsingPOSTRequestBody
 */
public class AddServiceItemsUsingPOSTRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_items")

    private List<AddServiceItemsUsingPOSTRequestBodyServiceItems> serviceItems = null;

    public AddServiceItemsUsingPOSTRequestBody withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 服务组id
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public AddServiceItemsUsingPOSTRequestBody withServiceItems(
        List<AddServiceItemsUsingPOSTRequestBodyServiceItems> serviceItems) {
        this.serviceItems = serviceItems;
        return this;
    }

    public AddServiceItemsUsingPOSTRequestBody addServiceItemsItem(
        AddServiceItemsUsingPOSTRequestBodyServiceItems serviceItemsItem) {
        if (this.serviceItems == null) {
            this.serviceItems = new ArrayList<>();
        }
        this.serviceItems.add(serviceItemsItem);
        return this;
    }

    public AddServiceItemsUsingPOSTRequestBody withServiceItems(
        Consumer<List<AddServiceItemsUsingPOSTRequestBodyServiceItems>> serviceItemsSetter) {
        if (this.serviceItems == null) {
            this.serviceItems = new ArrayList<>();
        }
        serviceItemsSetter.accept(this.serviceItems);
        return this;
    }

    /**
     * 添加服务组成员
     * @return serviceItems
     */
    public List<AddServiceItemsUsingPOSTRequestBodyServiceItems> getServiceItems() {
        return serviceItems;
    }

    public void setServiceItems(List<AddServiceItemsUsingPOSTRequestBodyServiceItems> serviceItems) {
        this.serviceItems = serviceItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddServiceItemsUsingPOSTRequestBody addServiceItemsUsingPOSTRequestBody =
            (AddServiceItemsUsingPOSTRequestBody) o;
        return Objects.equals(this.setId, addServiceItemsUsingPOSTRequestBody.setId)
            && Objects.equals(this.serviceItems, addServiceItemsUsingPOSTRequestBody.serviceItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, serviceItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddServiceItemsUsingPOSTRequestBody {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    serviceItems: ").append(toIndentedString(serviceItems)).append("\n");
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
