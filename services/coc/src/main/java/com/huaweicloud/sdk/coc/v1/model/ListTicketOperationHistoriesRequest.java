package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTicketOperationHistoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private String ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListTicketParams body;

    public ListTicketOperationHistoriesRequest withTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * 工单类型
     * @return ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public ListTicketOperationHistoriesRequest withBody(ListTicketParams body) {
        this.body = body;
        return this;
    }

    public ListTicketOperationHistoriesRequest withBody(Consumer<ListTicketParams> bodySetter) {
        if (this.body == null) {
            this.body = new ListTicketParams();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListTicketParams getBody() {
        return body;
    }

    public void setBody(ListTicketParams body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTicketOperationHistoriesRequest that = (ListTicketOperationHistoriesRequest) obj;
        return Objects.equals(this.ticketType, that.ticketType) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTicketOperationHistoriesRequest {\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
