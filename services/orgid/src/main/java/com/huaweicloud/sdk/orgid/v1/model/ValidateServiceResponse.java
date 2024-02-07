package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ValidateServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceResponse")

    private ServiceResponse serviceResponse;

    public ValidateServiceResponse withServiceResponse(ServiceResponse serviceResponse) {
        this.serviceResponse = serviceResponse;
        return this;
    }

    public ValidateServiceResponse withServiceResponse(Consumer<ServiceResponse> serviceResponseSetter) {
        if (this.serviceResponse == null) {
            this.serviceResponse = new ServiceResponse();
            serviceResponseSetter.accept(this.serviceResponse);
        }

        return this;
    }

    /**
     * Get serviceResponse
     * @return serviceResponse
     */
    public ServiceResponse getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(ServiceResponse serviceResponse) {
        this.serviceResponse = serviceResponse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateServiceResponse that = (ValidateServiceResponse) obj;
        return Objects.equals(this.serviceResponse, that.serviceResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateServiceResponse {\n");
        sb.append("    serviceResponse: ").append(toIndentedString(serviceResponse)).append("\n");
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
