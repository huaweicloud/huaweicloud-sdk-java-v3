package com.huaweicloud.sdk.bssintl.v2.model;

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
public class ListServiceTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_types")

    private List<ServiceTypes> serviceTypes = null;

    public ListServiceTypesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListServiceTypesResponse withServiceTypes(List<ServiceTypes> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }

    public ListServiceTypesResponse addServiceTypesItem(ServiceTypes serviceTypesItem) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        this.serviceTypes.add(serviceTypesItem);
        return this;
    }

    public ListServiceTypesResponse withServiceTypes(Consumer<List<ServiceTypes>> serviceTypesSetter) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        serviceTypesSetter.accept(this.serviceTypes);
        return this;
    }

    /**
     * 云服务类型信息列表，具体请参见表3。
     * @return serviceTypes
     */
    public List<ServiceTypes> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<ServiceTypes> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceTypesResponse listServiceTypesResponse = (ListServiceTypesResponse) o;
        return Objects.equals(this.totalCount, listServiceTypesResponse.totalCount)
            && Objects.equals(this.serviceTypes, listServiceTypesResponse.serviceTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, serviceTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceTypesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
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
