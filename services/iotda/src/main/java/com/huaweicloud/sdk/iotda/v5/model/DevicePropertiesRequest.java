package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DevicePropertiesRequest
 */
public class DevicePropertiesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="services")
    
    private Object services;

    public DevicePropertiesRequest withServices(Object services) {
        this.services = services;
        return this;
    }

    


    /**
     * 设备执行的属性，Json格式，里面是一个个健值对，如果serviceId不为空，每个健都是profile中属性的参数名（paraName）;如果serviceId为空则由用户自定义属性格式。设属性令示例：[{\"service_id\": \"Temperature\",\"properties\": {\"value\": 57}},{\"service_id\": \"Battery\",\"properties\": {\"level\": 80}}]，具体格式需要应用和设备约定。 
     * @return services
     */
    public Object getServices() {
        return services;
    }

    public void setServices(Object services) {
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
        DevicePropertiesRequest devicePropertiesRequest = (DevicePropertiesRequest) o;
        return Objects.equals(this.services, devicePropertiesRequest.services);
    }
    @Override
    public int hashCode() {
        return Objects.hash(services);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevicePropertiesRequest {\n");
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

