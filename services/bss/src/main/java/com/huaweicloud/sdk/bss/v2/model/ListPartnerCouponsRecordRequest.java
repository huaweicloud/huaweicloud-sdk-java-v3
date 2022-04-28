package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListPartnerCouponsRecordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_types")

    private List<String> operationTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_id")

    private String quotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_type")

    private Integer quotaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_ids")

    private List<String> couponIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time_begin")

    private String operationTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time_end")

    private String operationTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ListPartnerCouponsRecordRequest withOperationTypes(List<String> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }

    public ListPartnerCouponsRecordRequest addOperationTypesItem(String operationTypesItem) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        this.operationTypes.add(operationTypesItem);
        return this;
    }

    public ListPartnerCouponsRecordRequest withOperationTypes(Consumer<List<String>> operationTypesSetter) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        operationTypesSetter.accept(this.operationTypes);
        return this;
    }

    /**
     * 操作类型。1：发放2：手动回收3：解绑自动回收4：过期回收5：退订回收6：退款充值撤销7：建立关联回收
     * @return operationTypes
     */
    public List<String> getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(List<String> operationTypes) {
        this.operationTypes = operationTypes;
    }

    public ListPartnerCouponsRecordRequest withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /**
     * 额度ID。请从“查询优惠券额度”接口的响应参数中获取。
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public ListPartnerCouponsRecordRequest withQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    /**
     * 额度类型：0：代金券额度1：现金券额度
     * minimum: 0
     * maximum: 1
     * @return quotaType
     */
    public Integer getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
    }

    public ListPartnerCouponsRecordRequest withCouponIds(List<String> couponIds) {
        this.couponIds = couponIds;
        return this;
    }

    public ListPartnerCouponsRecordRequest addCouponIdsItem(String couponIdsItem) {
        if (this.couponIds == null) {
            this.couponIds = new ArrayList<>();
        }
        this.couponIds.add(couponIdsItem);
        return this;
    }

    public ListPartnerCouponsRecordRequest withCouponIds(Consumer<List<String>> couponIdsSetter) {
        if (this.couponIds == null) {
            this.couponIds = new ArrayList<>();
        }
        couponIdsSetter.accept(this.couponIds);
        return this;
    }

    /**
     * 代金券ID列表。请从“发放优惠券”接口的响应参数中获取。
     * @return couponIds
     */
    public List<String> getCouponIds() {
        return couponIds;
    }

    public void setCouponIds(List<String> couponIds) {
        this.couponIds = couponIds;
    }

    public ListPartnerCouponsRecordRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ListPartnerCouponsRecordRequest withOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
        return this;
    }

    /**
     * 操作时间（开始）。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。输入这个条件，会查询出操作时间大于这个时间的记录。
     * @return operationTimeBegin
     */
    public String getOperationTimeBegin() {
        return operationTimeBegin;
    }

    public void setOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
    }

    public ListPartnerCouponsRecordRequest withOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
        return this;
    }

    /**
     * 操作时间（结束）。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。输入这个条件，会查询出操作时间小于这个时间的记录。
     * @return operationTimeEnd
     */
    public String getOperationTimeEnd() {
        return operationTimeEnd;
    }

    public void setOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
    }

    public ListPartnerCouponsRecordRequest withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 操作结果：0：成功-1：失败（非0的记录）
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ListPartnerCouponsRecordRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPartnerCouponsRecordRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数。默认值为10。
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

    public ListPartnerCouponsRecordRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 精英服务商ID。获取方法请参见[查询精英服务商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。华为云伙伴能力中心（一级经销商）查询精英服务商发放给子客户的优惠券发放记录时，需要携带该参数，否则只能查询发给自己子客户的优惠券发放记录。
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
        ListPartnerCouponsRecordRequest listPartnerCouponsRecordRequest = (ListPartnerCouponsRecordRequest) o;
        return Objects.equals(this.operationTypes, listPartnerCouponsRecordRequest.operationTypes)
            && Objects.equals(this.quotaId, listPartnerCouponsRecordRequest.quotaId)
            && Objects.equals(this.quotaType, listPartnerCouponsRecordRequest.quotaType)
            && Objects.equals(this.couponIds, listPartnerCouponsRecordRequest.couponIds)
            && Objects.equals(this.customerId, listPartnerCouponsRecordRequest.customerId)
            && Objects.equals(this.operationTimeBegin, listPartnerCouponsRecordRequest.operationTimeBegin)
            && Objects.equals(this.operationTimeEnd, listPartnerCouponsRecordRequest.operationTimeEnd)
            && Objects.equals(this.result, listPartnerCouponsRecordRequest.result)
            && Objects.equals(this.offset, listPartnerCouponsRecordRequest.offset)
            && Objects.equals(this.limit, listPartnerCouponsRecordRequest.limit)
            && Objects.equals(this.indirectPartnerId, listPartnerCouponsRecordRequest.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationTypes,
            quotaId,
            quotaType,
            couponIds,
            customerId,
            operationTimeBegin,
            operationTimeEnd,
            result,
            offset,
            limit,
            indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartnerCouponsRecordRequest {\n");
        sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    couponIds: ").append(toIndentedString(couponIds)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    operationTimeBegin: ").append(toIndentedString(operationTimeBegin)).append("\n");
        sb.append("    operationTimeEnd: ").append(toIndentedString(operationTimeEnd)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
