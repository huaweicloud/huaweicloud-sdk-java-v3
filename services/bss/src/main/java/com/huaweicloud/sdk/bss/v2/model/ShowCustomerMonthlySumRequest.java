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
public class ShowCustomerMonthlySumRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_cycle")
    
    private String billCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private String method;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_id")
    
    private String subCustomerId;

    public ShowCustomerMonthlySumRequest withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    


    /**
     * Get billCycle
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public ShowCustomerMonthlySumRequest withServiceTypeCode(String serviceTypeCode) {
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

    public ShowCustomerMonthlySumRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowCustomerMonthlySumRequest withOffset(Integer offset) {
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

    public ShowCustomerMonthlySumRequest withLimit(Integer limit) {
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

    public ShowCustomerMonthlySumRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    


    /**
     * Get method
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ShowCustomerMonthlySumRequest withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    


    /**
     * Get subCustomerId
     * @return subCustomerId
     */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCustomerMonthlySumRequest showCustomerMonthlySumRequest = (ShowCustomerMonthlySumRequest) o;
        return Objects.equals(this.billCycle, showCustomerMonthlySumRequest.billCycle) &&
            Objects.equals(this.serviceTypeCode, showCustomerMonthlySumRequest.serviceTypeCode) &&
            Objects.equals(this.enterpriseProjectId, showCustomerMonthlySumRequest.enterpriseProjectId) &&
            Objects.equals(this.offset, showCustomerMonthlySumRequest.offset) &&
            Objects.equals(this.limit, showCustomerMonthlySumRequest.limit) &&
            Objects.equals(this.method, showCustomerMonthlySumRequest.method) &&
            Objects.equals(this.subCustomerId, showCustomerMonthlySumRequest.subCustomerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billCycle, serviceTypeCode, enterpriseProjectId, offset, limit, method, subCustomerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomerMonthlySumRequest {\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
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

