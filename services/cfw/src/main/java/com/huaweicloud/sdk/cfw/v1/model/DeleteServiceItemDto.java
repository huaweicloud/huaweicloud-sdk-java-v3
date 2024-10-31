package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteServiceItemDto
 */
public class DeleteServiceItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_item_ids")

    private List<String> serviceItemIds = null;

    public DeleteServiceItemDto withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 服务组id，可通过[获取服务组列表接口](ListServiceSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public DeleteServiceItemDto withServiceItemIds(List<String> serviceItemIds) {
        this.serviceItemIds = serviceItemIds;
        return this;
    }

    public DeleteServiceItemDto addServiceItemIdsItem(String serviceItemIdsItem) {
        if (this.serviceItemIds == null) {
            this.serviceItemIds = new ArrayList<>();
        }
        this.serviceItemIds.add(serviceItemIdsItem);
        return this;
    }

    public DeleteServiceItemDto withServiceItemIds(Consumer<List<String>> serviceItemIdsSetter) {
        if (this.serviceItemIds == null) {
            this.serviceItemIds = new ArrayList<>();
        }
        serviceItemIdsSetter.accept(this.serviceItemIds);
        return this;
    }

    /**
     * 服务组成员id列表，服务组成员id可通过[查询服务成员列表接口](ListServiceItems.xml)查询获得，通过返回值中的data.records.item_id（.表示各对象之间层级的区分）获得。
     * @return serviceItemIds
     */
    public List<String> getServiceItemIds() {
        return serviceItemIds;
    }

    public void setServiceItemIds(List<String> serviceItemIds) {
        this.serviceItemIds = serviceItemIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteServiceItemDto that = (DeleteServiceItemDto) obj;
        return Objects.equals(this.setId, that.setId) && Objects.equals(this.serviceItemIds, that.serviceItemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, serviceItemIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteServiceItemDto {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    serviceItemIds: ").append(toIndentedString(serviceItemIds)).append("\n");
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
