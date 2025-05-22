package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 任务详情子项。 **取值范围**： 不涉及。
 */
public class ActionItemVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_name")

    private String itemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_items")

    private List<ActionSubItemVo> subItems = null;

    public ActionItemVo withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /**
     * **参数解释**： 任务详情子项，一级菜单。 **取值范围**： 不涉及。
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ActionItemVo withSubItems(List<ActionSubItemVo> subItems) {
        this.subItems = subItems;
        return this;
    }

    public ActionItemVo addSubItemsItem(ActionSubItemVo subItemsItem) {
        if (this.subItems == null) {
            this.subItems = new ArrayList<>();
        }
        this.subItems.add(subItemsItem);
        return this;
    }

    public ActionItemVo withSubItems(Consumer<List<ActionSubItemVo>> subItemsSetter) {
        if (this.subItems == null) {
            this.subItems = new ArrayList<>();
        }
        subItemsSetter.accept(this.subItems);
        return this;
    }

    /**
     * **参数解释**： 任务详情子项，一级菜单详情。 **取值范围**： 不涉及。
     * @return subItems
     */
    public List<ActionSubItemVo> getSubItems() {
        return subItems;
    }

    public void setSubItems(List<ActionSubItemVo> subItems) {
        this.subItems = subItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionItemVo that = (ActionItemVo) obj;
        return Objects.equals(this.itemName, that.itemName) && Objects.equals(this.subItems, that.subItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, subItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionItemVo {\n");
        sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
        sb.append("    subItems: ").append(toIndentedString(subItems)).append("\n");
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
