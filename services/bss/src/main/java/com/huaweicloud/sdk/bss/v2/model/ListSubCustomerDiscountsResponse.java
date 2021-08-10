package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSubCustomerDiscountsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_discount")

    private QuerySubCustomerDiscountV2 subCustomerDiscount;

    public ListSubCustomerDiscountsResponse withSubCustomerDiscount(QuerySubCustomerDiscountV2 subCustomerDiscount) {
        this.subCustomerDiscount = subCustomerDiscount;
        return this;
    }

    public ListSubCustomerDiscountsResponse withSubCustomerDiscount(
        Consumer<QuerySubCustomerDiscountV2> subCustomerDiscountSetter) {
        if (this.subCustomerDiscount == null) {
            this.subCustomerDiscount = new QuerySubCustomerDiscountV2();
            subCustomerDiscountSetter.accept(this.subCustomerDiscount);
        }

        return this;
    }

    /** Get subCustomerDiscount
     * 
     * @return subCustomerDiscount */
    public QuerySubCustomerDiscountV2 getSubCustomerDiscount() {
        return subCustomerDiscount;
    }

    public void setSubCustomerDiscount(QuerySubCustomerDiscountV2 subCustomerDiscount) {
        this.subCustomerDiscount = subCustomerDiscount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubCustomerDiscountsResponse listSubCustomerDiscountsResponse = (ListSubCustomerDiscountsResponse) o;
        return Objects.equals(this.subCustomerDiscount, listSubCustomerDiscountsResponse.subCustomerDiscount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCustomerDiscount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerDiscountsResponse {\n");
        sb.append("    subCustomerDiscount: ").append(toIndentedString(subCustomerDiscount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
