package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddBlackWhiteBatchDto
 */
public class AddBlackWhiteBatchDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_items")

    private List<BlackWhiteInfo> listItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_type")

    private Integer listType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    public AddBlackWhiteBatchDto withListItems(List<BlackWhiteInfo> listItems) {
        this.listItems = listItems;
        return this;
    }

    public AddBlackWhiteBatchDto addListItemsItem(BlackWhiteInfo listItemsItem) {
        if (this.listItems == null) {
            this.listItems = new ArrayList<>();
        }
        this.listItems.add(listItemsItem);
        return this;
    }

    public AddBlackWhiteBatchDto withListItems(Consumer<List<BlackWhiteInfo>> listItemsSetter) {
        if (this.listItems == null) {
            this.listItems = new ArrayList<>();
        }
        listItemsSetter.accept(this.listItems);
        return this;
    }

    /**
     * **参数解释**： 黑白名单信息列表 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return listItems
     */
    public List<BlackWhiteInfo> getListItems() {
        return listItems;
    }

    public void setListItems(List<BlackWhiteInfo> listItems) {
        this.listItems = listItems;
    }

    public AddBlackWhiteBatchDto withListType(Integer listType) {
        this.listType = listType;
        return this;
    }

    /**
     * **参数解释**： 黑白名单列表类型 **约束限制**： 不涉及 **取值范围**： 4：黑名单 5：白名单 **默认取值**： 不涉及
     * minimum: 4
     * maximum: 5
     * @return listType
     */
    public Integer getListType() {
        return listType;
    }

    public void setListType(Integer listType) {
        this.listType = listType;
    }

    public AddBlackWhiteBatchDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，type为0时，object_id为互联网边界防护对象ID，type为1时，object_id为VPC边界防护对象ID，type可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddBlackWhiteBatchDto that = (AddBlackWhiteBatchDto) obj;
        return Objects.equals(this.listItems, that.listItems) && Objects.equals(this.listType, that.listType)
            && Objects.equals(this.objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listItems, listType, objectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBlackWhiteBatchDto {\n");
        sb.append("    listItems: ").append(toIndentedString(listItems)).append("\n");
        sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
