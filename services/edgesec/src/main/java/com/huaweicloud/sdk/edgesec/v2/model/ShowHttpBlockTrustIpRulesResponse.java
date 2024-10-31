package com.huaweicloud.sdk.edgesec.v2.model;

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
public class ShowHttpBlockTrustIpRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ShowHttpBlockTrustIpRuleResponseBody> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    public ShowHttpBlockTrustIpRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 策略下防护规则数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowHttpBlockTrustIpRulesResponse withItems(List<ShowHttpBlockTrustIpRuleResponseBody> items) {
        this.items = items;
        return this;
    }

    public ShowHttpBlockTrustIpRulesResponse addItemsItem(ShowHttpBlockTrustIpRuleResponseBody itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ShowHttpBlockTrustIpRulesResponse withItems(
        Consumer<List<ShowHttpBlockTrustIpRuleResponseBody>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 防护规则列表
     * @return items
     */
    public List<ShowHttpBlockTrustIpRuleResponseBody> getItems() {
        return items;
    }

    public void setItems(List<ShowHttpBlockTrustIpRuleResponseBody> items) {
        this.items = items;
    }

    public ShowHttpBlockTrustIpRulesResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 防护规则下IP/IP段数量
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
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
        ShowHttpBlockTrustIpRulesResponse that = (ShowHttpBlockTrustIpRulesResponse) obj;
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
        sb.append("class ShowHttpBlockTrustIpRulesResponse {\n");
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
