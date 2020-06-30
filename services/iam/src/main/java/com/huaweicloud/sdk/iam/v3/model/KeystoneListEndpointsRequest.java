package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneListEndpointsRequest  {

    /**
     * Gets or Sets _interface
     */
    public static class InterfaceEnum {

        
        /**
         * Enum PUBLIC for value: "public"
         */
        public static final InterfaceEnum PUBLIC = new InterfaceEnum("public");
        
        /**
         * Enum INTERNAL for value: "internal"
         */
        public static final InterfaceEnum INTERNAL = new InterfaceEnum("internal");
        
        /**
         * Enum ADMIN for value: "admin"
         */
        public static final InterfaceEnum ADMIN = new InterfaceEnum("admin");
        

        public static final Map<String, InterfaceEnum> staticFields = new HashMap<String, InterfaceEnum>() {
            { 
                put("public", PUBLIC);
                put("internal", INTERNAL);
                put("admin", ADMIN);
            }
        };

        private String value;

        InterfaceEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InterfaceEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            InterfaceEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new InterfaceEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static InterfaceEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InterfaceEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof InterfaceEnum) {
                return this.value.equals(((InterfaceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interface")
    
    private InterfaceEnum _interface;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private String serviceId;

    public KeystoneListEndpointsRequest withInterface(InterfaceEnum _interface) {
        this._interface = _interface;
        return this;
    }

    


    /**
     * Get _interface
     * @return _interface
     */
    public InterfaceEnum getInterface() {
        return _interface;
    }

    public void setInterface(InterfaceEnum _interface) {
        this._interface = _interface;
    }

    public KeystoneListEndpointsRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * Get serviceId
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListEndpointsRequest keystoneListEndpointsRequest = (KeystoneListEndpointsRequest) o;
        return Objects.equals(this._interface, keystoneListEndpointsRequest._interface) &&
            Objects.equals(this.serviceId, keystoneListEndpointsRequest.serviceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(_interface, serviceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListEndpointsRequest {\n");
        sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

