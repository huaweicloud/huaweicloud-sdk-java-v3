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
public class ListCompositeHostsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_total")

    private Integer cloudTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "premium_total")

    private Integer premiumTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<CompositeHostResponse> items = null;

    public ListCompositeHostsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 所有防护域名的数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCompositeHostsResponse withCloudTotal(Integer cloudTotal) {
        this.cloudTotal = cloudTotal;
        return this;
    }

    /**
     * 云模式防护域名的数量
     * @return cloudTotal
     */
    public Integer getCloudTotal() {
        return cloudTotal;
    }

    public void setCloudTotal(Integer cloudTotal) {
        this.cloudTotal = cloudTotal;
    }

    public ListCompositeHostsResponse withPremiumTotal(Integer premiumTotal) {
        this.premiumTotal = premiumTotal;
        return this;
    }

    /**
     * 独享模式防护域名的数量
     * @return premiumTotal
     */
    public Integer getPremiumTotal() {
        return premiumTotal;
    }

    public void setPremiumTotal(Integer premiumTotal) {
        this.premiumTotal = premiumTotal;
    }

    public ListCompositeHostsResponse withItems(List<CompositeHostResponse> items) {
        this.items = items;
        return this;
    }

    public ListCompositeHostsResponse addItemsItem(CompositeHostResponse itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListCompositeHostsResponse withItems(Consumer<List<CompositeHostResponse>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 详细的防护域名信息
     * @return items
     */
    public List<CompositeHostResponse> getItems() {
        return items;
    }

    public void setItems(List<CompositeHostResponse> items) {
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
        ListCompositeHostsResponse that = (ListCompositeHostsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.cloudTotal, that.cloudTotal)
            && Objects.equals(this.premiumTotal, that.premiumTotal) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, cloudTotal, premiumTotal, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCompositeHostsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    cloudTotal: ").append(toIndentedString(cloudTotal)).append("\n");
        sb.append("    premiumTotal: ").append(toIndentedString(premiumTotal)).append("\n");
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
