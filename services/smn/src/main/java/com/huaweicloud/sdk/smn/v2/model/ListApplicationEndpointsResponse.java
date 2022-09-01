package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListApplicationEndpointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_page_flag")

    @JacksonXmlProperty(localName = "next_page_flag")

    private Boolean nextPageFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    @JacksonXmlProperty(localName = "endpoints")

    private List<ApplicationEndpoint> endpoints = null;

    public ListApplicationEndpointsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListApplicationEndpointsResponse withNextPageFlag(Boolean nextPageFlag) {
        this.nextPageFlag = nextPageFlag;
        return this;
    }

    /**
     * 是否有下一页标识。
     * @return nextPageFlag
     */
    public Boolean getNextPageFlag() {
        return nextPageFlag;
    }

    public void setNextPageFlag(Boolean nextPageFlag) {
        this.nextPageFlag = nextPageFlag;
    }

    public ListApplicationEndpointsResponse withEndpoints(List<ApplicationEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ListApplicationEndpointsResponse addEndpointsItem(ApplicationEndpoint endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ListApplicationEndpointsResponse withEndpoints(Consumer<List<ApplicationEndpoint>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * Application_endpoint结构体数。
     * @return endpoints
     */
    public List<ApplicationEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<ApplicationEndpoint> endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApplicationEndpointsResponse listApplicationEndpointsResponse = (ListApplicationEndpointsResponse) o;
        return Objects.equals(this.requestId, listApplicationEndpointsResponse.requestId)
            && Objects.equals(this.nextPageFlag, listApplicationEndpointsResponse.nextPageFlag)
            && Objects.equals(this.endpoints, listApplicationEndpointsResponse.endpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, nextPageFlag, endpoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationEndpointsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    nextPageFlag: ").append(toIndentedString(nextPageFlag)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
