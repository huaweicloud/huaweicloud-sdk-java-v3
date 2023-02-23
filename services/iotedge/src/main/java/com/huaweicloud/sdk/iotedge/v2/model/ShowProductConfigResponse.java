package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowProductConfigResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private List<Object> properties = null;
    
    public ShowProductConfigResponse withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    

    public ShowProductConfigResponse withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * 服务类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    

    public ShowProductConfigResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowProductConfigResponse withProperties(List<Object> properties) {
        this.properties = properties;
        return this;
    }

    
    public ShowProductConfigResponse addPropertiesItem(Object propertiesItem) {
        if(this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public ShowProductConfigResponse withProperties(Consumer<List<Object>> propertiesSetter) {
        if(this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 属性
     * @return properties
     */
    public List<Object> getProperties() {
        return properties;
    }

    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProductConfigResponse showProductConfigResponse = (ShowProductConfigResponse) o;
        return Objects.equals(this.serviceId, showProductConfigResponse.serviceId) &&
            Objects.equals(this.serviceType, showProductConfigResponse.serviceType) &&
            Objects.equals(this.description, showProductConfigResponse.description) &&
            Objects.equals(this.properties, showProductConfigResponse.properties);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceType, description, properties);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProductConfigResponse {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

