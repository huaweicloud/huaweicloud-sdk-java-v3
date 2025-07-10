package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateChangeRequestBodyV2 更新变更单
 */
public class CocUpdateChangeRequestBodyV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_info")

    private CocUpdateChangeRequestBodyV2TicketInfo ticketInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tickets")

    private List<CocUpdateChangeRequestBodyV2SubTickets> subTickets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_info")

    private CocUpdateChangeRequestBodyV2HistoryInfo historyInfo;

    public CocUpdateChangeRequestBodyV2 withTicketInfo(CocUpdateChangeRequestBodyV2TicketInfo ticketInfo) {
        this.ticketInfo = ticketInfo;
        return this;
    }

    public CocUpdateChangeRequestBodyV2 withTicketInfo(
        Consumer<CocUpdateChangeRequestBodyV2TicketInfo> ticketInfoSetter) {
        if (this.ticketInfo == null) {
            this.ticketInfo = new CocUpdateChangeRequestBodyV2TicketInfo();
            ticketInfoSetter.accept(this.ticketInfo);
        }

        return this;
    }

    /**
     * Get ticketInfo
     * @return ticketInfo
     */
    public CocUpdateChangeRequestBodyV2TicketInfo getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(CocUpdateChangeRequestBodyV2TicketInfo ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    public CocUpdateChangeRequestBodyV2 withSubTickets(List<CocUpdateChangeRequestBodyV2SubTickets> subTickets) {
        this.subTickets = subTickets;
        return this;
    }

    public CocUpdateChangeRequestBodyV2 addSubTicketsItem(CocUpdateChangeRequestBodyV2SubTickets subTicketsItem) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        this.subTickets.add(subTicketsItem);
        return this;
    }

    public CocUpdateChangeRequestBodyV2 withSubTickets(
        Consumer<List<CocUpdateChangeRequestBodyV2SubTickets>> subTicketsSetter) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        subTicketsSetter.accept(this.subTickets);
        return this;
    }

    /**
     * 子单信息
     * @return subTickets
     */
    public List<CocUpdateChangeRequestBodyV2SubTickets> getSubTickets() {
        return subTickets;
    }

    public void setSubTickets(List<CocUpdateChangeRequestBodyV2SubTickets> subTickets) {
        this.subTickets = subTickets;
    }

    public CocUpdateChangeRequestBodyV2 withHistoryInfo(CocUpdateChangeRequestBodyV2HistoryInfo historyInfo) {
        this.historyInfo = historyInfo;
        return this;
    }

    public CocUpdateChangeRequestBodyV2 withHistoryInfo(
        Consumer<CocUpdateChangeRequestBodyV2HistoryInfo> historyInfoSetter) {
        if (this.historyInfo == null) {
            this.historyInfo = new CocUpdateChangeRequestBodyV2HistoryInfo();
            historyInfoSetter.accept(this.historyInfo);
        }

        return this;
    }

    /**
     * Get historyInfo
     * @return historyInfo
     */
    public CocUpdateChangeRequestBodyV2HistoryInfo getHistoryInfo() {
        return historyInfo;
    }

    public void setHistoryInfo(CocUpdateChangeRequestBodyV2HistoryInfo historyInfo) {
        this.historyInfo = historyInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocUpdateChangeRequestBodyV2 that = (CocUpdateChangeRequestBodyV2) obj;
        return Objects.equals(this.ticketInfo, that.ticketInfo) && Objects.equals(this.subTickets, that.subTickets)
            && Objects.equals(this.historyInfo, that.historyInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketInfo, subTickets, historyInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocUpdateChangeRequestBodyV2 {\n");
        sb.append("    ticketInfo: ").append(toIndentedString(ticketInfo)).append("\n");
        sb.append("    subTickets: ").append(toIndentedString(subTickets)).append("\n");
        sb.append("    historyInfo: ").append(toIndentedString(historyInfo)).append("\n");
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
