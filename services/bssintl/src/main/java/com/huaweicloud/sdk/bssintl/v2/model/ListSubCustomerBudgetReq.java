package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSubCustomerBudgetReq
 */
public class ListSubCustomerBudgetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_ids")

    private List<String> customerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ListSubCustomerBudgetReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    public ListSubCustomerBudgetReq addCustomerIdsItem(String customerIdsItem) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public ListSubCustomerBudgetReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if (this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /**
     * |参数名称：客户ID列表| |参数的约束及描述：必填，最大支持100个客户ID，如果其中有存在不是该伙伴的客户ID或者其中有存在与该伙伴不是转售关联类型的客户ID，在响应中不返回该客户信息。|
     * @return customerIds
     */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public ListSubCustomerBudgetReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * |参数名称：云经销商ID| |参数约束及描述：非必填，范围限制:0-64，如果需要查询云经销商的子客户列表，必须携带该字段。除此之外，此参数不做处理。|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubCustomerBudgetReq that = (ListSubCustomerBudgetReq) obj;
        return Objects.equals(this.customerIds, that.customerIds)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerIds, indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerBudgetReq {\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
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
