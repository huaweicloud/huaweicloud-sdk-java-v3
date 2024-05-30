package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
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

    /**
     * 查询方式。oneself：客户自己订单sub_customer：客户给企业子代付订单此参数不携带或携带值为空串或携带值为null时，默认值为“oneself”。
     */
    public static final class MethodEnum {

        /**
         * Enum ONESELF for value: "oneself"
         */
        public static final MethodEnum ONESELF = new MethodEnum("oneself");

        /**
         * Enum SUB_CUSTOMER for value: "sub_customer"
         */
        public static final MethodEnum SUB_CUSTOMER = new MethodEnum("sub_customer");

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("oneself", ONESELF);
            map.put("sub_customer", SUB_CUSTOMER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MethodEnum(value));
        }

        public static MethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MethodEnum) {
                return this.value.equals(((MethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private MethodEnum method;

    public ListCustomerOrdersRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。大小写不敏感。此参数不携带或携带值为空时，不作为筛选条件。 说明： 使用特殊字符进行查询的时候，请注意进行URL编码转换，如“%”的转码应为“%25”。
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
     * 客户账号ID。您可以调用查询客户列表接口获取customer_id。此参数不携带或携带值为空时，不作为筛选条件。
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
     * 订单创建开始时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。订单创建开始时间与订单创建结束时间间隔不能超过1年。此参数不携带或携带值为空时，不作为筛选条件。
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
     * 订单创建结束时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。订单创建开始时间与订单创建结束时间间隔不能超过1年。此参数不携带或携带值为空时，不作为筛选条件。
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
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。大小写不敏感。您可以调用查询云服务类型列表接口获取。此参数不携带或携带值为空时，不作为筛选条件。
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
     * 订单状态：1：待审核3：处理中4：已取消5：已完成6：待支付9：待确认此参数不携带或携带值为空时，不作为筛选条件。
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
     * 订单类型：1：开通2：续订3：变更4：退订10：包年/包月转按需11：按需转包年/包月13：试用14：转商用15：费用调整此参数不携带或携带值为空时，不作为筛选条件。
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
     * 每次查询的订单数量，默认值为10。此参数不携带或携带值为空或携带值为null，取默认值10。
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
     * 偏移量，从0开始。默认值为0。此参数不携带或携带值为空或携带值为null，取默认值10。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
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
     * 查询的订单列表排序。大小写不敏感。支持按照创建时间进行排序，带-表示倒序。创建时间：升序为createTime，倒序为-createTime。此参数不携带或携带值为空时，不作为筛选条件。
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
     * 订单支付开始时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。订单支付开始时间与订单支付结束时间间隔不能超过1年。此参数不携带或携带值为空时，不作为筛选条件。
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
     * 订单支付结束时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。订单支付开始时间与订单支付结束时间间隔不能超过1年。此参数不携带或携带值为空时，不作为筛选条件。
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
     * 云经销商ID。获取方法请参见[查询云经销商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。华为云总经销商（一级经销商）查询云经销商的客户订单列表时，需要携带该参数；否则只能查询自己客户的订单列表。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public ListCustomerOrdersRequest withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * 查询方式。oneself：客户自己订单sub_customer：客户给企业子代付订单此参数不携带或携带值为空串或携带值为null时，默认值为“oneself”。
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomerOrdersRequest that = (ListCustomerOrdersRequest) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.createTimeBegin, that.createTimeBegin)
            && Objects.equals(this.createTimeEnd, that.createTimeEnd)
            && Objects.equals(this.serviceTypeCode, that.serviceTypeCode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.orderType, that.orderType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.paymentTimeBegin, that.paymentTimeBegin)
            && Objects.equals(this.paymentTimeEnd, that.paymentTimeEnd)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId)
            && Objects.equals(this.method, that.method);
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
            indirectPartnerId,
            method);
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
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
