package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpVo
 */
public class HttpVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request")

    private ProtocolReqVo request;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private ProtocolResVo response;

    public HttpVo withRequest(ProtocolReqVo request) {
        this.request = request;
        return this;
    }

    public HttpVo withRequest(Consumer<ProtocolReqVo> requestSetter) {
        if (this.request == null) {
            this.request = new ProtocolReqVo();
            requestSetter.accept(this.request);
        }

        return this;
    }

    /**
     * Get request
     * @return request
     */
    public ProtocolReqVo getRequest() {
        return request;
    }

    public void setRequest(ProtocolReqVo request) {
        this.request = request;
    }

    public HttpVo withResponse(ProtocolResVo response) {
        this.response = response;
        return this;
    }

    public HttpVo withResponse(Consumer<ProtocolResVo> responseSetter) {
        if (this.response == null) {
            this.response = new ProtocolResVo();
            responseSetter.accept(this.response);
        }

        return this;
    }

    /**
     * Get response
     * @return response
     */
    public ProtocolResVo getResponse() {
        return response;
    }

    public void setResponse(ProtocolResVo response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpVo that = (HttpVo) obj;
        return Objects.equals(this.request, that.request) && Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpVo {\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
