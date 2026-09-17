package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 单个标签的分布统计对象。 **约束限制：** 不涉及。 
 */
public class OpsChartsTagDistributionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private String tagType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_list")

    private List<OpsChartsTagValueCount> itemList = null;

    public OpsChartsTagDistributionItem withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * 标签ID。
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public OpsChartsTagDistributionItem withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 标签名称。
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public OpsChartsTagDistributionItem withTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * 标签类型。
     * @return tagType
     */
    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public OpsChartsTagDistributionItem withItemList(List<OpsChartsTagValueCount> itemList) {
        this.itemList = itemList;
        return this;
    }

    public OpsChartsTagDistributionItem addItemListItem(OpsChartsTagValueCount itemListItem) {
        if (this.itemList == null) {
            this.itemList = new ArrayList<>();
        }
        this.itemList.add(itemListItem);
        return this;
    }

    public OpsChartsTagDistributionItem withItemList(Consumer<List<OpsChartsTagValueCount>> itemListSetter) {
        if (this.itemList == null) {
            this.itemList = new ArrayList<>();
        }
        itemListSetter.accept(this.itemList);
        return this;
    }

    /**
     * 标签值分布列表。
     * @return itemList
     */
    public List<OpsChartsTagValueCount> getItemList() {
        return itemList;
    }

    public void setItemList(List<OpsChartsTagValueCount> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsChartsTagDistributionItem that = (OpsChartsTagDistributionItem) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.tagName, that.tagName)
            && Objects.equals(this.tagType, that.tagType) && Objects.equals(this.itemList, that.itemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, tagName, tagType, itemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsChartsTagDistributionItem {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
        sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
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
