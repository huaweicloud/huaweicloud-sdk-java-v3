package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListEndpointServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_services")

    private List<ServiceDetailsResp> endpointServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListEndpointServiceResponse withEndpointServices(List<ServiceDetailsResp> endpointServices) {
        this.endpointServices = endpointServices;
        return this;
    }

    public ListEndpointServiceResponse addEndpointServicesItem(ServiceDetailsResp endpointServicesItem) {
        if (this.endpointServices == null) {
            this.endpointServices = new ArrayList<>();
        }
        this.endpointServices.add(endpointServicesItem);
        return this;
    }

    public ListEndpointServiceResponse withEndpointServices(Consumer<List<ServiceDetailsResp>> endpointServicesSetter) {
        if (this.endpointServices == null) {
            this.endpointServices = new ArrayList<>();
        }
        endpointServicesSetter.accept(this.endpointServices);
        return this;
    }

    /** 终端节点服务列表
     * 
     * @return endpointServices */
    public List<ServiceDetailsResp> getEndpointServices() {
        return endpointServices;
    }

    public void setEndpointServices(List<ServiceDetailsResp> endpointServices) {
        this.endpointServices = endpointServices;
    }

    public ListEndpointServiceResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 满足查询条件的终端节点服务总条数，不受分页（即limit、offset参数）影响。
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
        ListEndpointServiceResponse listEndpointServiceResponse = (ListEndpointServiceResponse) o;
        return Objects.equals(this.endpointServices, listEndpointServiceResponse.endpointServices)
            && Objects.equals(this.totalCount, listEndpointServiceResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointServices, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndpointServiceResponse {\n");
        sb.append("    endpointServices: ").append(toIndentedString(endpointServices)).append("\n");
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
