package com.huaweicloud.sdk.dataartsfabricep.v1.model;

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
public class ListServicesInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_instances")

    private List<ServiceInstanceBriefInfo> serviceInstances = null;

    public ListServicesInstancesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 符合条件的service Istance总数
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListServicesInstancesResponse withServiceInstances(List<ServiceInstanceBriefInfo> serviceInstances) {
        this.serviceInstances = serviceInstances;
        return this;
    }

    public ListServicesInstancesResponse addServiceInstancesItem(ServiceInstanceBriefInfo serviceInstancesItem) {
        if (this.serviceInstances == null) {
            this.serviceInstances = new ArrayList<>();
        }
        this.serviceInstances.add(serviceInstancesItem);
        return this;
    }

    public ListServicesInstancesResponse withServiceInstances(
        Consumer<List<ServiceInstanceBriefInfo>> serviceInstancesSetter) {
        if (this.serviceInstances == null) {
            this.serviceInstances = new ArrayList<>();
        }
        serviceInstancesSetter.accept(this.serviceInstances);
        return this;
    }

    /**
     * 符合条件的service Instance列表
     * @return serviceInstances
     */
    public List<ServiceInstanceBriefInfo> getServiceInstances() {
        return serviceInstances;
    }

    public void setServiceInstances(List<ServiceInstanceBriefInfo> serviceInstances) {
        this.serviceInstances = serviceInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServicesInstancesResponse that = (ListServicesInstancesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.serviceInstances, that.serviceInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, serviceInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServicesInstancesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    serviceInstances: ").append(toIndentedString(serviceInstances)).append("\n");
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
