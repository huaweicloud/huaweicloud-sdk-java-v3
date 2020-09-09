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
public class ListPartnerAdjustRecordsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_type")
    
    private String operationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_time_begin")
    
    private String operationTimeBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_time_end")
    
    private String operationTimeEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trans_id")
    
    private String transId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ListPartnerAdjustRecordsRequest withCustomerId(String customerId) {
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

    public ListPartnerAdjustRecordsRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    


    /**
     * Get operationType
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ListPartnerAdjustRecordsRequest withOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
        return this;
    }

    


    /**
     * Get operationTimeBegin
     * @return operationTimeBegin
     */
    public String getOperationTimeBegin() {
        return operationTimeBegin;
    }

    public void setOperationTimeBegin(String operationTimeBegin) {
        this.operationTimeBegin = operationTimeBegin;
    }

    public ListPartnerAdjustRecordsRequest withOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
        return this;
    }

    


    /**
     * Get operationTimeEnd
     * @return operationTimeEnd
     */
    public String getOperationTimeEnd() {
        return operationTimeEnd;
    }

    public void setOperationTimeEnd(String operationTimeEnd) {
        this.operationTimeEnd = operationTimeEnd;
    }

    public ListPartnerAdjustRecordsRequest withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    


    /**
     * Get transId
     * @return transId
     */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public ListPartnerAdjustRecordsRequest withOffset(Integer offset) {
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

    public ListPartnerAdjustRecordsRequest withLimit(Integer limit) {
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

    public ListPartnerAdjustRecordsRequest withIndirectPartnerId(String indirectPartnerId) {
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
        ListPartnerAdjustRecordsRequest listPartnerAdjustRecordsRequest = (ListPartnerAdjustRecordsRequest) o;
        return Objects.equals(this.customerId, listPartnerAdjustRecordsRequest.customerId) &&
            Objects.equals(this.operationType, listPartnerAdjustRecordsRequest.operationType) &&
            Objects.equals(this.operationTimeBegin, listPartnerAdjustRecordsRequest.operationTimeBegin) &&
            Objects.equals(this.operationTimeEnd, listPartnerAdjustRecordsRequest.operationTimeEnd) &&
            Objects.equals(this.transId, listPartnerAdjustRecordsRequest.transId) &&
            Objects.equals(this.offset, listPartnerAdjustRecordsRequest.offset) &&
            Objects.equals(this.limit, listPartnerAdjustRecordsRequest.limit) &&
            Objects.equals(this.indirectPartnerId, listPartnerAdjustRecordsRequest.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, operationType, operationTimeBegin, operationTimeEnd, transId, offset, limit, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartnerAdjustRecordsRequest {\n");
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

