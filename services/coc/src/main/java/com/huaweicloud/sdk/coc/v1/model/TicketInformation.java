package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TicketInformation
 */
public class TicketInformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_infos")

    private List<TicketInfo> ticketInfos = null;

    public TicketInformation withTicketInfos(List<TicketInfo> ticketInfos) {
        this.ticketInfos = ticketInfos;
        return this;
    }

    public TicketInformation addTicketInfosItem(TicketInfo ticketInfosItem) {
        if (this.ticketInfos == null) {
            this.ticketInfos = new ArrayList<>();
        }
        this.ticketInfos.add(ticketInfosItem);
        return this;
    }

    public TicketInformation withTicketInfos(Consumer<List<TicketInfo>> ticketInfosSetter) {
        if (this.ticketInfos == null) {
            this.ticketInfos = new ArrayList<>();
        }
        ticketInfosSetter.accept(this.ticketInfos);
        return this;
    }

    /**
     * 选择的四号提权单信息
     * @return ticketInfos
     */
    public List<TicketInfo> getTicketInfos() {
        return ticketInfos;
    }

    public void setTicketInfos(List<TicketInfo> ticketInfos) {
        this.ticketInfos = ticketInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicketInformation that = (TicketInformation) obj;
        return Objects.equals(this.ticketInfos, that.ticketInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicketInformation {\n");
        sb.append("    ticketInfos: ").append(toIndentedString(ticketInfos)).append("\n");
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
