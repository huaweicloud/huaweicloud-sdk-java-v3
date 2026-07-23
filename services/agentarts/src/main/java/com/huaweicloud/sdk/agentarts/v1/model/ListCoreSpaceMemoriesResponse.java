package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCoreSpaceMemoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<MemoryRecord> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListCoreSpaceMemoriesResponse withItems(List<MemoryRecord> items) {
        this.items = items;
        return this;
    }

    public ListCoreSpaceMemoriesResponse addItemsItem(MemoryRecord itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListCoreSpaceMemoriesResponse withItems(Consumer<List<MemoryRecord>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释：**  记忆记录列表，包含当前页的所有记忆记录。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * @return items
     */
    public List<MemoryRecord> getItems() {
        return items;
    }

    public void setItems(List<MemoryRecord> items) {
        this.items = items;
    }

    public ListCoreSpaceMemoriesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：**  符合条件的记录总数，用于计算总页数。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCoreSpaceMemoriesResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：**  每页返回的记录数量，用于分页查询。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * minimum: 1
     * maximum: 20
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCoreSpaceMemoriesResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：**  偏移量，用于分页查询时指定起始位置，从0开始。 **取值范围：**  不涉及。 **默认取值：** 不涉及。 
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreSpaceMemoriesResponse that = (ListCoreSpaceMemoriesResponse) obj;
        return Objects.equals(this.items, that.items) && Objects.equals(this.total, that.total)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, total, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreSpaceMemoriesResponse {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
