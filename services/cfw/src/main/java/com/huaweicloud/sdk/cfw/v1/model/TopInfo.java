package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopInfo
 */
public class TopInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private String item;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    public TopInfo withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 次数 **取值范围**： 不涉及
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public TopInfo withItem(String item) {
        this.item = item;
        return this;
    }

    /**
     * **参数解释**： 项 **取值范围**： 不涉及
     * @return item
     */
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public TopInfo withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * **参数解释**： 项ID **取值范围**： 不涉及
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopInfo that = (TopInfo) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.item, that.item)
            && Objects.equals(this.itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, item, itemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopInfo {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
