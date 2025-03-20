package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * requestBody中包含的，前端选择的四号单的信息
 */
public class TicketInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private String ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_id")

    private String scopeId;

    public TicketInfo withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 四号单id
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public TicketInfo withTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * 四号单类型，可选CHANGE/INCIDENT/ALARM/WARROOM
     * @return ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public TicketInfo withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 四号单关联的应用id
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public TicketInfo withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    /**
     * region id
     * @return scopeId
     */
    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicketInfo that = (TicketInfo) obj;
        return Objects.equals(this.ticketId, that.ticketId) && Objects.equals(this.ticketType, that.ticketType)
            && Objects.equals(this.targetId, that.targetId) && Objects.equals(this.scopeId, that.scopeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, ticketType, targetId, scopeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicketInfo {\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
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
