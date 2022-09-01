package com.huaweicloud.sdk.ief.v1.model;

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
public class ListEndpointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    @JacksonXmlProperty(localName = "endpoints")

    private List<EndpointObjResp> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

    public ListEndpointsResponse withEndpoints(List<EndpointObjResp> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ListEndpointsResponse addEndpointsItem(EndpointObjResp endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ListEndpointsResponse withEndpoints(Consumer<List<EndpointObjResp>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 端点详情
     * @return endpoints
     */
    public List<EndpointObjResp> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointObjResp> endpoints) {
        this.endpoints = endpoints;
    }

    public ListEndpointsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 满足条件的端点个数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEndpointsResponse listEndpointsResponse = (ListEndpointsResponse) o;
        return Objects.equals(this.endpoints, listEndpointsResponse.endpoints)
            && Objects.equals(this.count, listEndpointsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoints, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndpointsResponse {\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
