package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckParam
 */
public class CheckParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_item")

    private SearchAfterParam lastItem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_tags")

    private Map<String, List<String>> customTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_num_tags")

    private Map<String, RangeParam> customNumTags = null;

    public CheckParam withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * 数据的服务实例级唯一标识，字符长度范围为[1, 256]。 - item_id/custom_tags/custom_num_tags中必须给定至少一个参数，以支持对服务实例中的数据进行指定ID检查或条件检查。 - 如给定item_id参数，则进行指定ID检查，否则进行条件检查。
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public CheckParam withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回检查结果的数量，默认为10，取值范围为[1, 100]。仅对条件检查生效。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public CheckParam withLastItem(SearchAfterParam lastItem) {
        this.lastItem = lastItem;
        return this;
    }

    public CheckParam withLastItem(Consumer<SearchAfterParam> lastItemSetter) {
        if (this.lastItem == null) {
            this.lastItem = new SearchAfterParam();
            lastItemSetter.accept(this.lastItem);
        }

        return this;
    }

    /**
     * Get lastItem
     * @return lastItem
     */
    public SearchAfterParam getLastItem() {
        return lastItem;
    }

    public void setLastItem(SearchAfterParam lastItem) {
        this.lastItem = lastItem;
    }

    public CheckParam withCustomTags(Map<String, List<String>> customTags) {
        this.customTags = customTags;
        return this;
    }

    public CheckParam putCustomTagsItem(String key, List<String> customTagsItem) {
        if (this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        this.customTags.put(key, customTagsItem);
        return this;
    }

    public CheckParam withCustomTags(Consumer<Map<String, List<String>>> customTagsSetter) {
        if (this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        customTagsSetter.accept(this.customTags);
        return this;
    }

    /**
     * 自定义字符标签，用于对服务实例中的数据进行条件查找。格式为键值对{key:value}。 - key: 必须为服务实例custom_tags中已存在的key，可在创建服务实例时进行配置，或在更新服务实例时进行新增。 - value: 标签值列表，列表内多个标签值为“或”关系，即满足一个即可。列表长度范围为[1, 32]，标签值类型为字符串，字符长度范围为[1, 64]。
     * @return customTags
     */
    public Map<String, List<String>> getCustomTags() {
        return customTags;
    }

    public void setCustomTags(Map<String, List<String>> customTags) {
        this.customTags = customTags;
    }

    public CheckParam withCustomNumTags(Map<String, RangeParam> customNumTags) {
        this.customNumTags = customNumTags;
        return this;
    }

    public CheckParam putCustomNumTagsItem(String key, RangeParam customNumTagsItem) {
        if (this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        this.customNumTags.put(key, customNumTagsItem);
        return this;
    }

    public CheckParam withCustomNumTags(Consumer<Map<String, RangeParam>> customNumTagsSetter) {
        if (this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        customNumTagsSetter.accept(this.customNumTags);
        return this;
    }

    /**
     * 自定义数值标签，用于对服务实例中的数据进行条件查找。格式为键值对{key:value}。 - key: 必须为服务实例custom_num_tags中已存在的key，可在创建服务实例时进行配置，或在更新服务实例时进行新增。针对没有设置该数值标签的数据，会直接过滤。 - value: 标签值的取值范围，标签值在给定的取值范围内即视为符合条件。
     * @return customNumTags
     */
    public Map<String, RangeParam> getCustomNumTags() {
        return customNumTags;
    }

    public void setCustomNumTags(Map<String, RangeParam> customNumTags) {
        this.customNumTags = customNumTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckParam that = (CheckParam) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.lastItem, that.lastItem) && Objects.equals(this.customTags, that.customTags)
            && Objects.equals(this.customNumTags, that.customNumTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, limit, lastItem, customTags, customNumTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckParam {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    lastItem: ").append(toIndentedString(lastItem)).append("\n");
        sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
        sb.append("    customNumTags: ").append(toIndentedString(customNumTags)).append("\n");
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
