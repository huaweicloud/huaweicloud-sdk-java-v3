package com.huaweicloud.sdk.cloudtest.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudtest.v1.model.ServicesInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowRegisterServiceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="services")
    
    private List<ServicesInfo> services = null;
    
    public ShowRegisterServiceResponse withServices(List<ServicesInfo> services) {
        this.services = services;
        return this;
    }

    
    public ShowRegisterServiceResponse addServicesItem(ServicesInfo servicesItem) {
        this.services.add(servicesItem);
        return this;
    }

    public ShowRegisterServiceResponse withServices(Consumer<List<ServicesInfo>> servicesSetter) {
        if(this.services == null ){
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /**
     * 注册服务信息
     * @return services
     */
    public List<ServicesInfo> getServices() {
        return services;
    }

    public void setServices(List<ServicesInfo> services) {
        this.services = services;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRegisterServiceResponse showRegisterServiceResponse = (ShowRegisterServiceResponse) o;
        return Objects.equals(this.services, showRegisterServiceResponse.services);
    }
    @Override
    public int hashCode() {
        return Objects.hash(services);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRegisterServiceResponse {\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

