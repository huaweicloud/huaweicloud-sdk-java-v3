package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CustomerOrderEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPartnerPayOrdersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_infos")
    
    private List<CustomerOrderEntity> orderInfos = null;
    
    public ListPartnerPayOrdersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * |参数名称：符合条件的记录总数。| |参数的约束及描述：符合条件的记录总数。必填|
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPartnerPayOrdersResponse withOrderInfos(List<CustomerOrderEntity> orderInfos) {
        this.orderInfos = orderInfos;
        return this;
    }

    
    public ListPartnerPayOrdersResponse addOrderInfosItem(CustomerOrderEntity orderInfosItem) {
        if (this.orderInfos == null) {
            this.orderInfos = new ArrayList<>();
        }
        this.orderInfos.add(orderInfosItem);
        return this;
    }

    public ListPartnerPayOrdersResponse withOrderInfos(Consumer<List<CustomerOrderEntity>> orderInfosSetter) {
        if(this.orderInfos == null ){
            this.orderInfos = new ArrayList<>();
        }
        orderInfosSetter.accept(this.orderInfos);
        return this;
    }

    /**
     * |参数名称：总额，即最终优惠后的金额，| |参数约束以及描述：总额，即最终优惠后的金额，非必填|
     * @return orderInfos
     */
    public List<CustomerOrderEntity> getOrderInfos() {
        return orderInfos;
    }

    public void setOrderInfos(List<CustomerOrderEntity> orderInfos) {
        this.orderInfos = orderInfos;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPartnerPayOrdersResponse listPartnerPayOrdersResponse = (ListPartnerPayOrdersResponse) o;
        return Objects.equals(this.count, listPartnerPayOrdersResponse.count) &&
            Objects.equals(this.orderInfos, listPartnerPayOrdersResponse.orderInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, orderInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartnerPayOrdersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    orderInfos: ").append(toIndentedString(orderInfos)).append("\n");
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

