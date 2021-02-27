package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CustomerInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryCustomersBalancesReq
 */
public class QueryCustomersBalancesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_infos")
    
    private List<CustomerInfoV2> customerInfos = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public QueryCustomersBalancesReq withCustomerInfos(List<CustomerInfoV2> customerInfos) {
        this.customerInfos = customerInfos;
        return this;
    }

    
    public QueryCustomersBalancesReq addCustomerInfosItem(CustomerInfoV2 customerInfosItem) {
        this.customerInfos.add(customerInfosItem);
        return this;
    }

    public QueryCustomersBalancesReq withCustomerInfos(Consumer<List<CustomerInfoV2>> customerInfosSetter) {
        if(this.customerInfos == null ){
            this.customerInfos = new ArrayList<>();
        }
        customerInfosSetter.accept(this.customerInfos);
        return this;
    }

    /**
     * 客户信息列表。 具体请参见表1。
     * @return customerInfos
     */
    public List<CustomerInfoV2> getCustomerInfos() {
        return customerInfos;
    }

    public void setCustomerInfos(List<CustomerInfoV2> customerInfos) {
        this.customerInfos = customerInfos;
    }

    public QueryCustomersBalancesReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * 精英服务商ID。 华为云伙伴能力中心（一级经销商）查询精英服务商（二级经销商）子客户的账户余额时，需要携带该参数。
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
        QueryCustomersBalancesReq queryCustomersBalancesReq = (QueryCustomersBalancesReq) o;
        return Objects.equals(this.customerInfos, queryCustomersBalancesReq.customerInfos) &&
            Objects.equals(this.indirectPartnerId, queryCustomersBalancesReq.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerInfos, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCustomersBalancesReq {\n");
        sb.append("    customerInfos: ").append(toIndentedString(customerInfos)).append("\n");
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

