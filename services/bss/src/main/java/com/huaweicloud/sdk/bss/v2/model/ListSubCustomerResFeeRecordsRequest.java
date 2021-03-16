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
public class ListSubCustomerResFeeRecordsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cycle")
    
    private String cycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_zero_record")
    
    private Boolean includeZeroRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ListSubCustomerResFeeRecordsRequest withCustomerId(String customerId) {
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

    

    public ListSubCustomerResFeeRecordsRequest withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    


    /**
     * Get cycle
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    

    public ListSubCustomerResFeeRecordsRequest withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * Get cloudServiceType
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    

    public ListSubCustomerResFeeRecordsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public ListSubCustomerResFeeRecordsRequest withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * Get chargeMode
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    

    public ListSubCustomerResFeeRecordsRequest withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * Get billType
     * minimum: 0
     * maximum: 17
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    

    public ListSubCustomerResFeeRecordsRequest withOffset(Integer offset) {
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

    

    public ListSubCustomerResFeeRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListSubCustomerResFeeRecordsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * Get resourceId
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public ListSubCustomerResFeeRecordsRequest withIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
        return this;
    }

    


    /**
     * Get includeZeroRecord
     * @return includeZeroRecord
     */
    public Boolean getIncludeZeroRecord() {
        return includeZeroRecord;
    }

    public void setIncludeZeroRecord(Boolean includeZeroRecord) {
        this.includeZeroRecord = includeZeroRecord;
    }

    

    public ListSubCustomerResFeeRecordsRequest withIndirectPartnerId(String indirectPartnerId) {
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
        ListSubCustomerResFeeRecordsRequest listSubCustomerResFeeRecordsRequest = (ListSubCustomerResFeeRecordsRequest) o;
        return Objects.equals(this.customerId, listSubCustomerResFeeRecordsRequest.customerId) &&
            Objects.equals(this.cycle, listSubCustomerResFeeRecordsRequest.cycle) &&
            Objects.equals(this.cloudServiceType, listSubCustomerResFeeRecordsRequest.cloudServiceType) &&
            Objects.equals(this.region, listSubCustomerResFeeRecordsRequest.region) &&
            Objects.equals(this.chargeMode, listSubCustomerResFeeRecordsRequest.chargeMode) &&
            Objects.equals(this.billType, listSubCustomerResFeeRecordsRequest.billType) &&
            Objects.equals(this.offset, listSubCustomerResFeeRecordsRequest.offset) &&
            Objects.equals(this.limit, listSubCustomerResFeeRecordsRequest.limit) &&
            Objects.equals(this.resourceId, listSubCustomerResFeeRecordsRequest.resourceId) &&
            Objects.equals(this.includeZeroRecord, listSubCustomerResFeeRecordsRequest.includeZeroRecord) &&
            Objects.equals(this.indirectPartnerId, listSubCustomerResFeeRecordsRequest.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, cycle, cloudServiceType, region, chargeMode, billType, offset, limit, resourceId, includeZeroRecord, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerResFeeRecordsRequest {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    includeZeroRecord: ").append(toIndentedString(includeZeroRecord)).append("\n");
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

