package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FreezeSubCustomersReq
 */
public class FreezeSubCustomersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_ids")

    @JacksonXmlProperty(localName = "customer_ids")

    private List<String> customerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    @JacksonXmlProperty(localName = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    @JacksonXmlProperty(localName = "indirect_partner_id")

    private String indirectPartnerId;

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

    /**
     * 需要冻结的客户账号ID列表。 您可以调用查询客户列表接口获取customer_id。
     * @return customerIds
     */
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

    /**
     * 冻结原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public FreezeSubCustomersReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见查询云经销商列表。如果需要查询云经销商的子客户列表，必须携带该字段。除此之外，此参数不做处理。
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
        FreezeSubCustomersReq freezeSubCustomersReq = (FreezeSubCustomersReq) o;
        return Objects.equals(this.customerIds, freezeSubCustomersReq.customerIds)
            && Objects.equals(this.reason, freezeSubCustomersReq.reason)
            && Objects.equals(this.indirectPartnerId, freezeSubCustomersReq.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerIds, reason, indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreezeSubCustomersReq {\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
