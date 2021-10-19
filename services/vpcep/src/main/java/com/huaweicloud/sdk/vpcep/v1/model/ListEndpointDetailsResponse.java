package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListEndpointDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndpointResp> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListEndpointDetailsResponse withEndpoints(List<EndpointResp> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ListEndpointDetailsResponse addEndpointsItem(EndpointResp endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ListEndpointDetailsResponse withEndpoints(Consumer<List<EndpointResp>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /** 终端节点列表。
     * 
     * @return endpoints */
    public List<EndpointResp> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointResp> endpoints) {
        this.endpoints = endpoints;
    }

    public ListEndpointDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 满足查询条件的终端节点总条数，不受分页（即limit、offset参数）影响。
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEndpointDetailsResponse listEndpointDetailsResponse = (ListEndpointDetailsResponse) o;
        return Objects.equals(this.endpoints, listEndpointDetailsResponse.endpoints)
            && Objects.equals(this.totalCount, listEndpointDetailsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoints, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndpointDetailsResponse {\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
