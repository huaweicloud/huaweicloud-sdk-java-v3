package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowMonthUsageReq
 */
public class ShowMonthUsageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_ids")

    @JacksonXmlProperty(localName = "sim_card_ids")

    private List<Long> simCardIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_cycles")

    @JacksonXmlProperty(localName = "billing_cycles")

    private List<String> billingCycles = null;

    public ShowMonthUsageReq withSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
        return this;
    }

    public ShowMonthUsageReq addSimCardIdsItem(Long simCardIdsItem) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        this.simCardIds.add(simCardIdsItem);
        return this;
    }

    public ShowMonthUsageReq withSimCardIds(Consumer<List<Long>> simCardIdsSetter) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        simCardIdsSetter.accept(this.simCardIds);
        return this;
    }

    /**
     * sim卡id列表
     * @return simCardIds
     */
    public List<Long> getSimCardIds() {
        return simCardIds;
    }

    public void setSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
    }

    public ShowMonthUsageReq withBillingCycles(List<String> billingCycles) {
        this.billingCycles = billingCycles;
        return this;
    }

    public ShowMonthUsageReq addBillingCyclesItem(String billingCyclesItem) {
        if (this.billingCycles == null) {
            this.billingCycles = new ArrayList<>();
        }
        this.billingCycles.add(billingCyclesItem);
        return this;
    }

    public ShowMonthUsageReq withBillingCycles(Consumer<List<String>> billingCyclesSetter) {
        if (this.billingCycles == null) {
            this.billingCycles = new ArrayList<>();
        }
        billingCyclesSetter.accept(this.billingCycles);
        return this;
    }

    /**
     * 账期
     * @return billingCycles
     */
    public List<String> getBillingCycles() {
        return billingCycles;
    }

    public void setBillingCycles(List<String> billingCycles) {
        this.billingCycles = billingCycles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMonthUsageReq showMonthUsageReq = (ShowMonthUsageReq) o;
        return Objects.equals(this.simCardIds, showMonthUsageReq.simCardIds)
            && Objects.equals(this.billingCycles, showMonthUsageReq.billingCycles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardIds, billingCycles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonthUsageReq {\n");
        sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
        sb.append("    billingCycles: ").append(toIndentedString(billingCycles)).append("\n");
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
