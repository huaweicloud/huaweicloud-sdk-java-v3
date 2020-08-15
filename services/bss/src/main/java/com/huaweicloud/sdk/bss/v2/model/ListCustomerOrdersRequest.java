package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerOrdersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time_begin")
    
    private String createTimeBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time_end")
    
    private String createTimeEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_type")
    
    private String orderType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_by")
    
    private String orderBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="payment_time_begin")
    
    private String paymentTimeBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="payment_time_end")
    
    private String paymentTimeEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ListCustomerOrdersRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * Get orderId
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListCustomerOrdersRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * Get customerId
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ListCustomerOrdersRequest withCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }

    


    /**
     * Get createTimeBegin
     * @return createTimeBegin
     */
    public String getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public ListCustomerOrdersRequest withCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    


    /**
     * Get createTimeEnd
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public ListCustomerOrdersRequest withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    


    /**
     * Get serviceTypeCode
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public ListCustomerOrdersRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * minimum: 1
     * maximum: 9
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListCustomerOrdersRequest withOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    


    /**
     * Get orderType
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public ListCustomerOrdersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCustomerOrdersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCustomerOrdersRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    


    /**
     * Get orderBy
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListCustomerOrdersRequest withPaymentTimeBegin(String paymentTimeBegin) {
        this.paymentTimeBegin = paymentTimeBegin;
        return this;
    }

    


    /**
     * Get paymentTimeBegin
     * @return paymentTimeBegin
     */
    public String getPaymentTimeBegin() {
        return paymentTimeBegin;
    }

    public void setPaymentTimeBegin(String paymentTimeBegin) {
        this.paymentTimeBegin = paymentTimeBegin;
    }

    public ListCustomerOrdersRequest withPaymentTimeEnd(String paymentTimeEnd) {
        this.paymentTimeEnd = paymentTimeEnd;
        return this;
    }

    


    /**
     * Get paymentTimeEnd
     * @return paymentTimeEnd
     */
    public String getPaymentTimeEnd() {
        return paymentTimeEnd;
    }

    public void setPaymentTimeEnd(String paymentTimeEnd) {
        this.paymentTimeEnd = paymentTimeEnd;
    }

    public ListCustomerOrdersRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * Get indirectPartnerId
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerOrdersRequest listCustomerOrdersRequest = (ListCustomerOrdersRequest) o;
        return Objects.equals(this.orderId, listCustomerOrdersRequest.orderId) &&
            Objects.equals(this.customerId, listCustomerOrdersRequest.customerId) &&
            Objects.equals(this.createTimeBegin, listCustomerOrdersRequest.createTimeBegin) &&
            Objects.equals(this.createTimeEnd, listCustomerOrdersRequest.createTimeEnd) &&
            Objects.equals(this.serviceTypeCode, listCustomerOrdersRequest.serviceTypeCode) &&
            Objects.equals(this.status, listCustomerOrdersRequest.status) &&
            Objects.equals(this.orderType, listCustomerOrdersRequest.orderType) &&
            Objects.equals(this.limit, listCustomerOrdersRequest.limit) &&
            Objects.equals(this.offset, listCustomerOrdersRequest.offset) &&
            Objects.equals(this.orderBy, listCustomerOrdersRequest.orderBy) &&
            Objects.equals(this.paymentTimeBegin, listCustomerOrdersRequest.paymentTimeBegin) &&
            Objects.equals(this.paymentTimeEnd, listCustomerOrdersRequest.paymentTimeEnd) &&
            Objects.equals(this.indirectPartnerId, listCustomerOrdersRequest.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, createTimeBegin, createTimeEnd, serviceTypeCode, status, orderType, limit, offset, orderBy, paymentTimeBegin, paymentTimeEnd, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerOrdersRequest {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    createTimeBegin: ").append(toIndentedString(createTimeBegin)).append("\n");
        sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    paymentTimeBegin: ").append(toIndentedString(paymentTimeBegin)).append("\n");
        sb.append("    paymentTimeEnd: ").append(toIndentedString(paymentTimeEnd)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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

