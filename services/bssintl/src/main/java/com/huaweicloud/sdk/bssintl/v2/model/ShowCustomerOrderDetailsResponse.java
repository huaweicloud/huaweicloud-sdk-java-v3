package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.CustomerOrderV2;
import com.huaweicloud.sdk.bssintl.v2.model.OrderLineItemEntityV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCustomerOrderDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_info")
    
    private CustomerOrderV2 orderInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_line_items")
    
    private List<OrderLineItemEntityV2> orderLineItems = null;
    
    public ShowCustomerOrderDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：符合条件的记录总数。| |参数的约束及描述：符合条件的记录总数。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ShowCustomerOrderDetailsResponse withOrderInfo(CustomerOrderV2 orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }

    public ShowCustomerOrderDetailsResponse withOrderInfo(Consumer<CustomerOrderV2> orderInfoSetter) {
        if(this.orderInfo == null ){
            this.orderInfo = new CustomerOrderV2();
            orderInfoSetter.accept(this.orderInfo);
        }
        
        return this;
    }


    /**
     * Get orderInfo
     * @return orderInfo
     */
    public CustomerOrderV2 getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(CustomerOrderV2 orderInfo) {
        this.orderInfo = orderInfo;
    }

    

    public ShowCustomerOrderDetailsResponse withOrderLineItems(List<OrderLineItemEntityV2> orderLineItems) {
        this.orderLineItems = orderLineItems;
        return this;
    }

    
    public ShowCustomerOrderDetailsResponse addOrderLineItemsItem(OrderLineItemEntityV2 orderLineItemsItem) {
        if(this.orderLineItems == null) {
            this.orderLineItems = new ArrayList<>();
        }
        this.orderLineItems.add(orderLineItemsItem);
        return this;
    }

    public ShowCustomerOrderDetailsResponse withOrderLineItems(Consumer<List<OrderLineItemEntityV2>> orderLineItemsSetter) {
        if(this.orderLineItems == null) {
            this.orderLineItems = new ArrayList<>();
        }
        orderLineItemsSetter.accept(this.orderLineItems);
        return this;
    }

    /**
     * |参数名称：订单对应的订单项。具体请参见表 OrderLineItemEntity。| |参数约束及描述： 订单对应的订单项。具体请参见表 OrderLineItemEntity。|
     * @return orderLineItems
     */
    public List<OrderLineItemEntityV2> getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(List<OrderLineItemEntityV2> orderLineItems) {
        this.orderLineItems = orderLineItems;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCustomerOrderDetailsResponse showCustomerOrderDetailsResponse = (ShowCustomerOrderDetailsResponse) o;
        return Objects.equals(this.totalCount, showCustomerOrderDetailsResponse.totalCount) &&
            Objects.equals(this.orderInfo, showCustomerOrderDetailsResponse.orderInfo) &&
            Objects.equals(this.orderLineItems, showCustomerOrderDetailsResponse.orderLineItems);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, orderInfo, orderLineItems);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomerOrderDetailsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    orderInfo: ").append(toIndentedString(orderInfo)).append("\n");
        sb.append("    orderLineItems: ").append(toIndentedString(orderLineItems)).append("\n");
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

