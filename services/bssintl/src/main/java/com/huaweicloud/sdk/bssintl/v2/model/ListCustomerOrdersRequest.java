package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListCustomerOrdersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_begin")

    private String createTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_end")

    private String createTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_type")

    private String orderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_time_begin")

    private String paymentTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_time_end")

    private String paymentTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ListCustomerOrdersRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** |参数名称：订单ID。| |参数的约束及描述：|
     * 
     * @return orderId */
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

    /** |参数名称：客户账号ID。| |参数的约束及描述：|
     * 
     * @return customerId */
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

    /** |参数名称：订单创建开始时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2020-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数的约束及描述：|
     * 
     * @return createTimeBegin */
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

    /** |参数名称：订单创建结束时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2020-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数的约束及描述：|
     * 
     * @return createTimeEnd */
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

    /** |参数名称：云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。具体请参见云服务类型云服务类型云服务类型云服务类型。| |参数的约束及描述：|
     * 
     * @return serviceTypeCode */
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

    /** |参数名称：订单状态。1：待审核3：处理中4：已取消5：已完成6：待支付9：待确认| |参数的约束及描述：| minimum: 1 maximum: 9
     * 
     * @return status */
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

    /** |参数名称：订单类型。1：开通2：续订3：变更4：退订10：包周期转按需11：按需转包周期12：赠送13：试用14：转商用15：费用调整| |参数的约束及描述：|
     * 
     * @return orderType */
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

    /** |参数名称：每次查询的大小，默认为10| |参数的约束及描述：最大值100| minimum: 1 maximum: 100
     * 
     * @return limit */
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

    /** |参数名称：偏移量，从0开始，默认为0| |参数的约束及描述：| minimum: 0 maximum: 2147483647
     * 
     * @return offset */
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

    /** |参数名称：查询的订单列表排序。支持3中多个响应参数进行排序，但每次只能用一个。缺省或者带+为升序，带-表示倒序。例如：按照创建时间升序排序表示为+createTime| |参数的约束及描述：|
     * 
     * @return orderBy */
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

    /** |参数名称：订单支付开始时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数的约束及描述：|
     * 
     * @return paymentTimeBegin */
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

    /** |参数名称：订单支付结束时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数的约束及描述：|
     * 
     * @return paymentTimeEnd */
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

    /** |参数名称：二级经销商ID，只有伙伴用自身token调用的时候，该字段才有含义。| |参数的约束及描述：|
     * 
     * @return indirectPartnerId */
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
        return Objects.equals(this.orderId, listCustomerOrdersRequest.orderId)
            && Objects.equals(this.customerId, listCustomerOrdersRequest.customerId)
            && Objects.equals(this.createTimeBegin, listCustomerOrdersRequest.createTimeBegin)
            && Objects.equals(this.createTimeEnd, listCustomerOrdersRequest.createTimeEnd)
            && Objects.equals(this.serviceTypeCode, listCustomerOrdersRequest.serviceTypeCode)
            && Objects.equals(this.status, listCustomerOrdersRequest.status)
            && Objects.equals(this.orderType, listCustomerOrdersRequest.orderType)
            && Objects.equals(this.limit, listCustomerOrdersRequest.limit)
            && Objects.equals(this.offset, listCustomerOrdersRequest.offset)
            && Objects.equals(this.orderBy, listCustomerOrdersRequest.orderBy)
            && Objects.equals(this.paymentTimeBegin, listCustomerOrdersRequest.paymentTimeBegin)
            && Objects.equals(this.paymentTimeEnd, listCustomerOrdersRequest.paymentTimeEnd)
            && Objects.equals(this.indirectPartnerId, listCustomerOrdersRequest.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId,
            customerId,
            createTimeBegin,
            createTimeEnd,
            serviceTypeCode,
            status,
            orderType,
            limit,
            offset,
            orderBy,
            paymentTimeBegin,
            paymentTimeEnd,
            indirectPartnerId);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
