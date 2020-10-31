package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.ServiceType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListServiceTypesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_types")
    
    private List<ServiceType> serviceTypes = null;
    
    public ListServiceTypesResponse withServiceTypes(List<ServiceType> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }

    
    public ListServiceTypesResponse addServiceTypesItem(ServiceType serviceTypesItem) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        this.serviceTypes.add(serviceTypesItem);
        return this;
    }

    public ListServiceTypesResponse withServiceTypes(Consumer<List<ServiceType>> serviceTypesSetter) {
        if(this.serviceTypes == null ){
            this.serviceTypes = new ArrayList<>();
        }
        serviceTypesSetter.accept(this.serviceTypes);
        return this;
    }

    /**
     * |参数名称：返回数据| |参数约束以及描述：返回数据|
     * @return serviceTypes
     */
    public List<ServiceType> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<ServiceType> serviceTypes) {
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
        return Objects.equals(this.serviceTypes, listServiceTypesResponse.serviceTypes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceTypes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceTypesResponse {\n");
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

