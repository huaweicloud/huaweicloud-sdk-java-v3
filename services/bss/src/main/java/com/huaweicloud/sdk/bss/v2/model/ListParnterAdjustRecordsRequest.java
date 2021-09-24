package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListParnterAdjustRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time_begin")

    private String operationTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time_end")

    private String operationTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_id")

    private String transId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ListParnterAdjustRecordsRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /** 客户账号ID。您可以调用查询客户列表接口获取customer_id。为空表示查询所有的调账记录。不为空表示仅查询与该客户相关的调账记录。默认查询所有客户的调账记录。 说明：
     * 此处的客户包含伙伴的子客户，以及华为云伙伴能力中心关联的精英服务商（二级经销商）。
     * 
     * @return customerId */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ListParnterAdjustRecordsRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /** 操作类型。SOURCE_OPERATION_BEADJUST：拨款SOURCE_OPERATION_BERETRIEVE：回收SOURCE_OPERATION_BEUNBIND：解绑回收不传递默认查询所有类型。
     * 
     * @return operationType */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ListParnterAdjustRecordsRequest withOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
        return this;
    }

    /** 调账起始时间。UTC时间，格式为：2016-03-28T14:45:38Z
     * 
     * @return operationTimeBegin */
    public String getOperationTimeBegin() {
        return operationTimeBegin;
    }

    public void setOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
    }

    public ListParnterAdjustRecordsRequest withOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
        return this;
    }

    /** 调账截止时间。UTC时间，格式为：2016-03-28T14:45:38Z
     * 
     * @return operationTimeEnd */
    public String getOperationTimeEnd() {
        return operationTimeEnd;
    }

    public void setOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
    }

    public ListParnterAdjustRecordsRequest withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    /** 事务ID。
     * 
     * @return transId */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public ListParnterAdjustRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，从0开始。默认值为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset =
     * 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。 minimum: 0 maximum:
     * 2147483647
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListParnterAdjustRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页的显示条数。默认值为10。 minimum: 1 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListParnterAdjustRecordsRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /** 精英服务商ID。获取方法请参见查询精英服务商列表。华为云伙伴能力中心（一级经销商）查询精英服务商（二级经销商）的子客户调账记录时，需携带此参数；否则只能查询自己的子客户调账记录。
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
        ListParnterAdjustRecordsRequest listParnterAdjustRecordsRequest = (ListParnterAdjustRecordsRequest) o;
        return Objects.equals(this.customerId, listParnterAdjustRecordsRequest.customerId)
            && Objects.equals(this.operationType, listParnterAdjustRecordsRequest.operationType)
            && Objects.equals(this.operationTimeBegin, listParnterAdjustRecordsRequest.operationTimeBegin)
            && Objects.equals(this.operationTimeEnd, listParnterAdjustRecordsRequest.operationTimeEnd)
            && Objects.equals(this.transId, listParnterAdjustRecordsRequest.transId)
            && Objects.equals(this.offset, listParnterAdjustRecordsRequest.offset)
            && Objects.equals(this.limit, listParnterAdjustRecordsRequest.limit)
            && Objects.equals(this.indirectPartnerId, listParnterAdjustRecordsRequest.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId,
            operationType,
            operationTimeBegin,
            operationTimeEnd,
            transId,
            offset,
            limit,
            indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListParnterAdjustRecordsRequest {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operationTimeBegin: ").append(toIndentedString(operationTimeBegin)).append("\n");
        sb.append("    operationTimeEnd: ").append(toIndentedString(operationTimeEnd)).append("\n");
        sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
