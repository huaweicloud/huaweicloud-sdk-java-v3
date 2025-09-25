package com.huaweicloud.sdk.waf.v1.model;

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
public class ListWhiteblackipPolicyRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<WhiteBlackIpResponseBody> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public ListWhiteblackipPolicyRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 黑白名单规则条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWhiteblackipPolicyRulesResponse withItems(List<WhiteBlackIpResponseBody> items) {
        this.items = items;
        return this;
    }

    public ListWhiteblackipPolicyRulesResponse addItemsItem(WhiteBlackIpResponseBody itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListWhiteblackipPolicyRulesResponse withItems(Consumer<List<WhiteBlackIpResponseBody>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 黑白名单规则列表信息
     * @return items
     */
    public List<WhiteBlackIpResponseBody> getItems() {
        return items;
    }

    public void setItems(List<WhiteBlackIpResponseBody> items) {
        this.items = items;
    }

    public ListWhiteblackipPolicyRulesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * ip地址总数
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWhiteblackipPolicyRulesResponse that = (ListWhiteblackipPolicyRulesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.items, that.items)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWhiteblackipPolicyRulesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
