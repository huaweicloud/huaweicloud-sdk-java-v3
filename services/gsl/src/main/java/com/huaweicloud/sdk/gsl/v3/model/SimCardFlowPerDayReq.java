package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimCardFlowPerDayReq
 */
public class SimCardFlowPerDayReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_ids")

    private List<Long> simCardIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccids")

    private List<String> iccids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month")

    private String month;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    public SimCardFlowPerDayReq withSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
        return this;
    }

    public SimCardFlowPerDayReq addSimCardIdsItem(Long simCardIdsItem) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        this.simCardIds.add(simCardIdsItem);
        return this;
    }

    public SimCardFlowPerDayReq withSimCardIds(Consumer<List<Long>> simCardIdsSetter) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        simCardIdsSetter.accept(this.simCardIds);
        return this;
    }

    /**
     * Get simCardIds
     * @return simCardIds
     */
    public List<Long> getSimCardIds() {
        return simCardIds;
    }

    public void setSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
    }

    public SimCardFlowPerDayReq withIccids(List<String> iccids) {
        this.iccids = iccids;
        return this;
    }

    public SimCardFlowPerDayReq addIccidsItem(String iccidsItem) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        this.iccids.add(iccidsItem);
        return this;
    }

    public SimCardFlowPerDayReq withIccids(Consumer<List<String>> iccidsSetter) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        iccidsSetter.accept(this.iccids);
        return this;
    }

    /**
     * Get iccids
     * @return iccids
     */
    public List<String> getIccids() {
        return iccids;
    }

    public void setIccids(List<String> iccids) {
        this.iccids = iccids;
    }

    public SimCardFlowPerDayReq withMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * 月份
     * @return month
     */
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public SimCardFlowPerDayReq withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimCardFlowPerDayReq that = (SimCardFlowPerDayReq) obj;
        return Objects.equals(this.simCardIds, that.simCardIds) && Objects.equals(this.iccids, that.iccids)
            && Objects.equals(this.month, that.month) && Objects.equals(this.date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardIds, iccids, month, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimCardFlowPerDayReq {\n");
        sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
        sb.append("    iccids: ").append(toIndentedString(iccids)).append("\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
