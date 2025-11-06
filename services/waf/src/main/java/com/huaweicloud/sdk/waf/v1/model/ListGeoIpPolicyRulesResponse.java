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
public class ListGeoIpPolicyRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<GeOIpItem> items = null;

    public ListGeoIpPolicyRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 该策略下地理位置控制规则数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListGeoIpPolicyRulesResponse withItems(List<GeOIpItem> items) {
        this.items = items;
        return this;
    }

    public ListGeoIpPolicyRulesResponse addItemsItem(GeOIpItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListGeoIpPolicyRulesResponse withItems(Consumer<List<GeOIpItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 地理位置控制规则数组
     * @return items
     */
    public List<GeOIpItem> getItems() {
        return items;
    }

    public void setItems(List<GeOIpItem> items) {
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
        ListGeoIpPolicyRulesResponse that = (ListGeoIpPolicyRulesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGeoIpPolicyRulesResponse {\n");
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
