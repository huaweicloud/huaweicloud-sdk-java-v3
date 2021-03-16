package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UnfreezeSubCustomersReq
 */
public class UnfreezeSubCustomersReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_ids")
    
    private List<String> customerIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reason")
    
    private String reason;

    public UnfreezeSubCustomersReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    
    public UnfreezeSubCustomersReq addCustomerIdsItem(String customerIdsItem) {
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public UnfreezeSubCustomersReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if(this.customerIds == null ){
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /**
     * |参数名称：需要解冻的客户ID列表。| |参数约束以及描述：需要解冻的客户ID列表。|
     * @return customerIds
     */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    

    public UnfreezeSubCustomersReq withReason(String reason) {
        this.reason = reason;
        return this;
    }

    


    /**
     * |参数名称：解冻原因。| |参数约束及描述：解冻原因。|
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnfreezeSubCustomersReq unfreezeSubCustomersReq = (UnfreezeSubCustomersReq) o;
        return Objects.equals(this.customerIds, unfreezeSubCustomersReq.customerIds) &&
            Objects.equals(this.reason, unfreezeSubCustomersReq.reason);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerIds, reason);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnfreezeSubCustomersReq {\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

