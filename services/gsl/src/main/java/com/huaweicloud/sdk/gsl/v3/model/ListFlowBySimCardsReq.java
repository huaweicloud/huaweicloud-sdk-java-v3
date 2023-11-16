package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListFlowBySimCardsReq
 */
public class ListFlowBySimCardsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccids")

    private List<String> iccids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_ids")

    private List<Long> simCardIds = null;

    public ListFlowBySimCardsReq withIccids(List<String> iccids) {
        this.iccids = iccids;
        return this;
    }

    public ListFlowBySimCardsReq addIccidsItem(String iccidsItem) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        this.iccids.add(iccidsItem);
        return this;
    }

    public ListFlowBySimCardsReq withIccids(Consumer<List<String>> iccidsSetter) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        iccidsSetter.accept(this.iccids);
        return this;
    }

    /**
     * iccid列表（三网卡不支持），最大支持50，且iccid和sim_card_id列表二选一
     * @return iccids
     */
    public List<String> getIccids() {
        return iccids;
    }

    public void setIccids(List<String> iccids) {
        this.iccids = iccids;
    }

    public ListFlowBySimCardsReq withSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
        return this;
    }

    public ListFlowBySimCardsReq addSimCardIdsItem(Long simCardIdsItem) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        this.simCardIds.add(simCardIdsItem);
        return this;
    }

    public ListFlowBySimCardsReq withSimCardIds(Consumer<List<Long>> simCardIdsSetter) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        simCardIdsSetter.accept(this.simCardIds);
        return this;
    }

    /**
     * sim_card_id列表，最大支持50，且iccid和sim_card_id列表二选一
     * @return simCardIds
     */
    public List<Long> getSimCardIds() {
        return simCardIds;
    }

    public void setSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlowBySimCardsReq that = (ListFlowBySimCardsReq) obj;
        return Objects.equals(this.iccids, that.iccids) && Objects.equals(this.simCardIds, that.simCardIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iccids, simCardIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlowBySimCardsReq {\n");
        sb.append("    iccids: ").append(toIndentedString(iccids)).append("\n");
        sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
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
