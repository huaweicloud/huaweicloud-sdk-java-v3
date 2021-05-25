package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.DiscountInfoV3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListOrderDiscountsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discounts")
    
    private List<DiscountInfoV3> discounts = null;
    
    public ListOrderDiscountsResponse withDiscounts(List<DiscountInfoV3> discounts) {
        this.discounts = discounts;
        return this;
    }

    
    public ListOrderDiscountsResponse addDiscountsItem(DiscountInfoV3 discountsItem) {
        if(this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.add(discountsItem);
        return this;
    }

    public ListOrderDiscountsResponse withDiscounts(Consumer<List<DiscountInfoV3>> discountsSetter) {
        if(this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        discountsSetter.accept(this.discounts);
        return this;
    }

    /**
     * |参数名称：可用的优惠券列表。具体请参见表1-30。| |参数约束以及描述：可用的优惠券列表。具体请参见表1-30。|
     * @return discounts
     */
    public List<DiscountInfoV3> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<DiscountInfoV3> discounts) {
        this.discounts = discounts;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOrderDiscountsResponse listOrderDiscountsResponse = (ListOrderDiscountsResponse) o;
        return Objects.equals(this.discounts, listOrderDiscountsResponse.discounts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(discounts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrderDiscountsResponse {\n");
        sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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

