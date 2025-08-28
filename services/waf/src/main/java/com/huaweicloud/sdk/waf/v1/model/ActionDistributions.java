package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ActionDistributions
 */
public class ActionDistributions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<TypedStatBucket> items = null;

    public ActionDistributions withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 处置动作的总数量 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * minimum: 0
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ActionDistributions withItems(List<TypedStatBucket> items) {
        this.items = items;
        return this;
    }

    public ActionDistributions addItemsItem(TypedStatBucket itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ActionDistributions withItems(Consumer<List<TypedStatBucket>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释：** 各处置动作的统计详情 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return items
     */
    public List<TypedStatBucket> getItems() {
        return items;
    }

    public void setItems(List<TypedStatBucket> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionDistributions that = (ActionDistributions) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDistributions {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
