package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ValidateServiceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket")

    private String ticket;

    public ValidateServiceRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 登录时携带的回调地址
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ValidateServiceRequest withTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }

    /**
     * 登录时系统返回的ticket
     * @return ticket
     */
    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateServiceRequest that = (ValidateServiceRequest) obj;
        return Objects.equals(this.service, that.service) && Objects.equals(this.ticket, that.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, ticket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateServiceRequest {\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
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
