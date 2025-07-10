package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新变更单工单请求body体。
 */
public class CocUpdateChangeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_info")

    private CocUpdateChangeRequestBodyTicketInfo ticketInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tickets")

    private List<CocUpdateChangeRequestBodySubTickets> subTickets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_info")

    private CocUpdateChangeRequestBodyHistoryInfo historyInfo;

    public CocUpdateChangeRequestBody withTicketInfo(CocUpdateChangeRequestBodyTicketInfo ticketInfo) {
        this.ticketInfo = ticketInfo;
        return this;
    }

    public CocUpdateChangeRequestBody withTicketInfo(Consumer<CocUpdateChangeRequestBodyTicketInfo> ticketInfoSetter) {
        if (this.ticketInfo == null) {
            this.ticketInfo = new CocUpdateChangeRequestBodyTicketInfo();
            ticketInfoSetter.accept(this.ticketInfo);
        }

        return this;
    }

    /**
     * Get ticketInfo
     * @return ticketInfo
     */
    public CocUpdateChangeRequestBodyTicketInfo getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(CocUpdateChangeRequestBodyTicketInfo ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    public CocUpdateChangeRequestBody withSubTickets(List<CocUpdateChangeRequestBodySubTickets> subTickets) {
        this.subTickets = subTickets;
        return this;
    }

    public CocUpdateChangeRequestBody addSubTicketsItem(CocUpdateChangeRequestBodySubTickets subTicketsItem) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        this.subTickets.add(subTicketsItem);
        return this;
    }

    public CocUpdateChangeRequestBody withSubTickets(
        Consumer<List<CocUpdateChangeRequestBodySubTickets>> subTicketsSetter) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        subTicketsSetter.accept(this.subTickets);
        return this;
    }

    /**
     * 变更子单信息。
     * @return subTickets
     */
    public List<CocUpdateChangeRequestBodySubTickets> getSubTickets() {
        return subTickets;
    }

    public void setSubTickets(List<CocUpdateChangeRequestBodySubTickets> subTickets) {
        this.subTickets = subTickets;
    }

    public CocUpdateChangeRequestBody withHistoryInfo(CocUpdateChangeRequestBodyHistoryInfo historyInfo) {
        this.historyInfo = historyInfo;
        return this;
    }

    public CocUpdateChangeRequestBody withHistoryInfo(
        Consumer<CocUpdateChangeRequestBodyHistoryInfo> historyInfoSetter) {
        if (this.historyInfo == null) {
            this.historyInfo = new CocUpdateChangeRequestBodyHistoryInfo();
            historyInfoSetter.accept(this.historyInfo);
        }

        return this;
    }

    /**
     * Get historyInfo
     * @return historyInfo
     */
    public CocUpdateChangeRequestBodyHistoryInfo getHistoryInfo() {
        return historyInfo;
    }

    public void setHistoryInfo(CocUpdateChangeRequestBodyHistoryInfo historyInfo) {
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
        CocUpdateChangeRequestBody that = (CocUpdateChangeRequestBody) obj;
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
        sb.append("class CocUpdateChangeRequestBody {\n");
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
