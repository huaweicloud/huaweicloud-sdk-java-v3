package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    private List<Long> simCardIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccids")

    private List<String> iccids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_cycles")

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
     * sim卡id列表，最多支持传入500个SIM卡id。sim_card_ids与iccids不能同时为空，sim_card_ids参数为空则根据iccids参数处理
     * @return simCardIds
     */
    public List<Long> getSimCardIds() {
        return simCardIds;
    }

    public void setSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
    }

    public ShowMonthUsageReq withIccids(List<String> iccids) {
        this.iccids = iccids;
        return this;
    }

    public ShowMonthUsageReq addIccidsItem(String iccidsItem) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        this.iccids.add(iccidsItem);
        return this;
    }

    public ShowMonthUsageReq withIccids(Consumer<List<String>> iccidsSetter) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        iccidsSetter.accept(this.iccids);
        return this;
    }

    /**
     * iccid列表，最多支持传入500个iccid。sim_card_ids与iccids不能同时为空，sim_card_ids参数为空则根据iccids参数处理
     * @return iccids
     */
    public List<String> getIccids() {
        return iccids;
    }

    public void setIccids(List<String> iccids) {
        this.iccids = iccids;
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
     * 账期，最多支持传入本月在内的6个月账期，例如[2022-07, 2022-06]，不支持传入未来账期。
     * @return billingCycles
     */
    public List<String> getBillingCycles() {
        return billingCycles;
    }

    public void setBillingCycles(List<String> billingCycles) {
        this.billingCycles = billingCycles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMonthUsageReq that = (ShowMonthUsageReq) obj;
        return Objects.equals(this.simCardIds, that.simCardIds) && Objects.equals(this.iccids, that.iccids)
            && Objects.equals(this.billingCycles, that.billingCycles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardIds, iccids, billingCycles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonthUsageReq {\n");
        sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
        sb.append("    iccids: ").append(toIndentedString(iccids)).append("\n");
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
