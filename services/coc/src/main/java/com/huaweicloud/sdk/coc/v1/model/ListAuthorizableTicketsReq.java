package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAuthorizableTicketsReq
 */
public class ListAuthorizableTicketsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_params")

    private List<AuthorizableTicketBody> requestParams = null;

    public ListAuthorizableTicketsReq withRequestParams(List<AuthorizableTicketBody> requestParams) {
        this.requestParams = requestParams;
        return this;
    }

    public ListAuthorizableTicketsReq addRequestParamsItem(AuthorizableTicketBody requestParamsItem) {
        if (this.requestParams == null) {
            this.requestParams = new ArrayList<>();
        }
        this.requestParams.add(requestParamsItem);
        return this;
    }

    public ListAuthorizableTicketsReq withRequestParams(Consumer<List<AuthorizableTicketBody>> requestParamsSetter) {
        if (this.requestParams == null) {
            this.requestParams = new ArrayList<>();
        }
        requestParamsSetter.accept(this.requestParams);
        return this;
    }

    /**
     * 搜索结果
     * @return requestParams
     */
    public List<AuthorizableTicketBody> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(List<AuthorizableTicketBody> requestParams) {
        this.requestParams = requestParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthorizableTicketsReq that = (ListAuthorizableTicketsReq) obj;
        return Objects.equals(this.requestParams, that.requestParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizableTicketsReq {\n");
        sb.append("    requestParams: ").append(toIndentedString(requestParams)).append("\n");
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
