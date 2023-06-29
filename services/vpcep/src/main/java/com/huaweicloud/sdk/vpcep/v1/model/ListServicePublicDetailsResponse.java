package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListServicePublicDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_services")

    private List<EndpointService> endpointServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListServicePublicDetailsResponse withEndpointServices(List<EndpointService> endpointServices) {
        this.endpointServices = endpointServices;
        return this;
    }

    public ListServicePublicDetailsResponse addEndpointServicesItem(EndpointService endpointServicesItem) {
        if (this.endpointServices == null) {
            this.endpointServices = new ArrayList<>();
        }
        this.endpointServices.add(endpointServicesItem);
        return this;
    }

    public ListServicePublicDetailsResponse withEndpointServices(
        Consumer<List<EndpointService>> endpointServicesSetter) {
        if (this.endpointServices == null) {
            this.endpointServices = new ArrayList<>();
        }
        endpointServicesSetter.accept(this.endpointServices);
        return this;
    }

    /**
     * 终端节点服务列表。
     * @return endpointServices
     */
    public List<EndpointService> getEndpointServices() {
        return endpointServices;
    }

    public void setEndpointServices(List<EndpointService> endpointServices) {
        this.endpointServices = endpointServices;
    }

    public ListServicePublicDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 满足查询条件的公共终端节点服务总条数，不受分页（即limit、offset参数）影响。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServicePublicDetailsResponse that = (ListServicePublicDetailsResponse) obj;
        return Objects.equals(this.endpointServices, that.endpointServices)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointServices, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServicePublicDetailsResponse {\n");
        sb.append("    endpointServices: ").append(toIndentedString(endpointServices)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
