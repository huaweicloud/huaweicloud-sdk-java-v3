package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Service;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneShowServiceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service")
    
    private Service service = null;

    public KeystoneShowServiceResponse withService(Service service) {
        this.service = service;
        return this;
    }

    public KeystoneShowServiceResponse withService(Consumer<Service> serviceSetter) {
        if(this.service == null ){
            this.service = new Service();
            serviceSetter.accept(this.service);
        }
        
        return this;
    }


    /**
     * Get service
     * @return service
     */
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowServiceResponse keystoneShowServiceResponse = (KeystoneShowServiceResponse) o;
        return Objects.equals(this.service, keystoneShowServiceResponse.service);
    }
    @Override
    public int hashCode() {
        return Objects.hash(service);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowServiceResponse {\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

