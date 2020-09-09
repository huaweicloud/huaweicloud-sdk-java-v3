package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.SetSubCustomerDiscountV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SetPartnerDiscountsReq
 */
public class SetPartnerDiscountsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_discounts")
    
    private List<SetSubCustomerDiscountV2> subCustomerDiscounts = new ArrayList<>();
    
    public SetPartnerDiscountsReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：二级经销商ID| |参数约束及描述：一级经销商给二级经销商的子客户设置折扣时需要携带这个字段。|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public SetPartnerDiscountsReq withSubCustomerDiscounts(List<SetSubCustomerDiscountV2> subCustomerDiscounts) {
        this.subCustomerDiscounts = subCustomerDiscounts;
        return this;
    }

    
    public SetPartnerDiscountsReq addSubCustomerDiscountsItem(SetSubCustomerDiscountV2 subCustomerDiscountsItem) {
        this.subCustomerDiscounts.add(subCustomerDiscountsItem);
        return this;
    }

    public SetPartnerDiscountsReq withSubCustomerDiscounts(Consumer<List<SetSubCustomerDiscountV2>> subCustomerDiscountsSetter) {
        if(this.subCustomerDiscounts == null ){
            this.subCustomerDiscounts = new ArrayList<>();
        }
        subCustomerDiscountsSetter.accept(this.subCustomerDiscounts);
        return this;
    }

    /**
     * |参数名称：客户折扣信息列表，最大支持10个。| |参数约束以及描述：客户折扣信息列表，最大支持10个。|
     * @return subCustomerDiscounts
     */
    public List<SetSubCustomerDiscountV2> getSubCustomerDiscounts() {
        return subCustomerDiscounts;
    }

    public void setSubCustomerDiscounts(List<SetSubCustomerDiscountV2> subCustomerDiscounts) {
        this.subCustomerDiscounts = subCustomerDiscounts;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetPartnerDiscountsReq setPartnerDiscountsReq = (SetPartnerDiscountsReq) o;
        return Objects.equals(this.indirectPartnerId, setPartnerDiscountsReq.indirectPartnerId) &&
            Objects.equals(this.subCustomerDiscounts, setPartnerDiscountsReq.subCustomerDiscounts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(indirectPartnerId, subCustomerDiscounts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPartnerDiscountsReq {\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    subCustomerDiscounts: ").append(toIndentedString(subCustomerDiscounts)).append("\n");
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

