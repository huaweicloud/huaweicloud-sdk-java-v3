package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** FreezeSubCustomersReq */
public class FreezeSubCustomersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_ids")

    private List<String> customerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public FreezeSubCustomersReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    public FreezeSubCustomersReq addCustomerIdsItem(String customerIdsItem) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public FreezeSubCustomersReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /** |参数名称：需要冻结的客户ID列表。| |参数约束以及描述：需要冻结的客户ID列表。|
     * 
     * @return customerIds */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public FreezeSubCustomersReq withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** |参数名称：冻结原因。| |参数约束及描述：冻结原因。|
     * 
     * @return reason */
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
        FreezeSubCustomersReq freezeSubCustomersReq = (FreezeSubCustomersReq) o;
        return Objects.equals(this.customerIds, freezeSubCustomersReq.customerIds)
            && Objects.equals(this.reason, freezeSubCustomersReq.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerIds, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreezeSubCustomersReq {\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
