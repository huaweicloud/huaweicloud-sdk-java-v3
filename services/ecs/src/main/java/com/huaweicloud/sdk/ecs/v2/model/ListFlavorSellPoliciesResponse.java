package com.huaweicloud.sdk.ecs.v2.model;

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
public class ListFlavorSellPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sell_policies")

    private List<ListFlavorSellPoliciesResult> sellPolicies = null;

    public ListFlavorSellPoliciesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 云服务器规格销售策略数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListFlavorSellPoliciesResponse withSellPolicies(List<ListFlavorSellPoliciesResult> sellPolicies) {
        this.sellPolicies = sellPolicies;
        return this;
    }

    public ListFlavorSellPoliciesResponse addSellPoliciesItem(ListFlavorSellPoliciesResult sellPoliciesItem) {
        if (this.sellPolicies == null) {
            this.sellPolicies = new ArrayList<>();
        }
        this.sellPolicies.add(sellPoliciesItem);
        return this;
    }

    public ListFlavorSellPoliciesResponse withSellPolicies(
        Consumer<List<ListFlavorSellPoliciesResult>> sellPoliciesSetter) {
        if (this.sellPolicies == null) {
            this.sellPolicies = new ArrayList<>();
        }
        sellPoliciesSetter.accept(this.sellPolicies);
        return this;
    }

    /**
     * 云服务器规格销售策略。
     * @return sellPolicies
     */
    public List<ListFlavorSellPoliciesResult> getSellPolicies() {
        return sellPolicies;
    }

    public void setSellPolicies(List<ListFlavorSellPoliciesResult> sellPolicies) {
        this.sellPolicies = sellPolicies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorSellPoliciesResponse listFlavorSellPoliciesResponse = (ListFlavorSellPoliciesResponse) o;
        return Objects.equals(this.count, listFlavorSellPoliciesResponse.count)
            && Objects.equals(this.sellPolicies, listFlavorSellPoliciesResponse.sellPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, sellPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorSellPoliciesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    sellPolicies: ").append(toIndentedString(sellPolicies)).append("\n");
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
