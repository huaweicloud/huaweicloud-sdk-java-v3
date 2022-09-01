package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCouponQuotasRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    @JacksonXmlProperty(localName = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_id")

    @JacksonXmlProperty(localName = "quota_id")

    private String quotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time_begin")

    @JacksonXmlProperty(localName = "operation_time_begin")

    private String operationTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time_end")

    @JacksonXmlProperty(localName = "operation_time_end")

    private String operationTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_quota_id")

    @JacksonXmlProperty(localName = "parent_quota_id")

    private String parentQuotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    @JacksonXmlProperty(localName = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ListCouponQuotasRecordsRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见[查询云经销商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。为空表示查询所有的代金券额度发放回收记录。不为空表示仅查询与该云经销商相关的代金券额度发放回收记录。默认查询所有云经销商的代金券额度发放回收记录。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public ListCouponQuotasRecordsRequest withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /**
     * 云经销商的代金券额度ID。获取方法请参见[查询优惠券额度](https://support.huaweicloud.com/api-bpconsole/mp_02003.html)。即华为云总经销商给云经销商发放代金券额度时，产生的云经销商的代金券额度ID，或者从云经销商回收代金券额度时，云经销商的代金券额度ID。此参数不携带或携带值为空时，不作为筛选条件。
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public ListCouponQuotasRecordsRequest withOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
        return this;
    }

    /**
     * 查询条件：操作起始时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。此参数不携带或携带值为空时，不作为筛选条件。
     * @return operationTimeBegin
     */
    public String getOperationTimeBegin() {
        return operationTimeBegin;
    }

    public void setOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
    }

    public ListCouponQuotasRecordsRequest withOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
        return this;
    }

    /**
     * 查询条件：操作截止时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。此参数不携带或携带值为空时，不作为筛选条件。
     * @return operationTimeEnd
     */
    public String getOperationTimeEnd() {
        return operationTimeEnd;
    }

    public void setOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
    }

    public ListCouponQuotasRecordsRequest withParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }

    /**
     * 父额度ID。这即华为云总经销商给云经销商发放代金券额度时，华为云总经销商的额度ID，或者从云经销商回收代金券额度时，回收的华为云总经销商的额度ID。此参数不携带或携带值为空时，不作为筛选条件。
     * @return parentQuotaId
     */
    public String getParentQuotaId() {
        return parentQuotaId;
    }

    public void setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
    }

    public ListCouponQuotasRecordsRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类型。10：发放额度11：回收额度此参数不携带或携带值为空或携带值为空串时，不作为筛选条件。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ListCouponQuotasRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始，默认值为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
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

    public ListCouponQuotasRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的数目。默认值为10。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCouponQuotasRecordsRequest listCouponQuotasRecordsRequest = (ListCouponQuotasRecordsRequest) o;
        return Objects.equals(this.indirectPartnerId, listCouponQuotasRecordsRequest.indirectPartnerId)
            && Objects.equals(this.quotaId, listCouponQuotasRecordsRequest.quotaId)
            && Objects.equals(this.operationTimeBegin, listCouponQuotasRecordsRequest.operationTimeBegin)
            && Objects.equals(this.operationTimeEnd, listCouponQuotasRecordsRequest.operationTimeEnd)
            && Objects.equals(this.parentQuotaId, listCouponQuotasRecordsRequest.parentQuotaId)
            && Objects.equals(this.operationType, listCouponQuotasRecordsRequest.operationType)
            && Objects.equals(this.offset, listCouponQuotasRecordsRequest.offset)
            && Objects.equals(this.limit, listCouponQuotasRecordsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indirectPartnerId,
            quotaId,
            operationTimeBegin,
            operationTimeEnd,
            parentQuotaId,
            operationType,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCouponQuotasRecordsRequest {\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    operationTimeBegin: ").append(toIndentedString(operationTimeBegin)).append("\n");
        sb.append("    operationTimeEnd: ").append(toIndentedString(operationTimeEnd)).append("\n");
        sb.append("    parentQuotaId: ").append(toIndentedString(parentQuotaId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
