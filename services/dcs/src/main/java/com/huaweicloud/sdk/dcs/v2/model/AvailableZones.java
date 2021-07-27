package com.huaweicloud.sdk.dcs.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 可用分区结构体
 */
public class AvailableZones  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * 分区上是否还有可用资源。 - true：还有资源。 - false：资源已售罄。 
     */
    public static final class ResourceAvailabilityEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final ResourceAvailabilityEnum TRUE = new ResourceAvailabilityEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final ResourceAvailabilityEnum FALSE = new ResourceAvailabilityEnum("false");
        

        private static final Map<String, ResourceAvailabilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceAvailabilityEnum> createStaticFields() {
            Map<String, ResourceAvailabilityEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceAvailabilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceAvailabilityEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResourceAvailabilityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceAvailabilityEnum(value);
            }
            return result;
        }

        public static ResourceAvailabilityEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResourceAvailabilityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceAvailabilityEnum) {
                return this.value.equals(((ResourceAvailabilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_availability")
    
    private ResourceAvailabilityEnum resourceAvailability;

    public AvailableZones withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 可用区编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    

    public AvailableZones withPort(String port) {
        this.port = port;
        return this;
    }

    


    /**
     * 可用区端口号。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    

    public AvailableZones withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 可用区名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public AvailableZones withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 可用区ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public AvailableZones withResourceAvailability(ResourceAvailabilityEnum resourceAvailability) {
        this.resourceAvailability = resourceAvailability;
        return this;
    }

    


    /**
     * 分区上是否还有可用资源。 - true：还有资源。 - false：资源已售罄。 
     * @return resourceAvailability
     */
    public ResourceAvailabilityEnum getResourceAvailability() {
        return resourceAvailability;
    }

    public void setResourceAvailability(ResourceAvailabilityEnum resourceAvailability) {
        this.resourceAvailability = resourceAvailability;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableZones availableZones = (AvailableZones) o;
        return Objects.equals(this.code, availableZones.code) &&
            Objects.equals(this.port, availableZones.port) &&
            Objects.equals(this.name, availableZones.name) &&
            Objects.equals(this.id, availableZones.id) &&
            Objects.equals(this.resourceAvailability, availableZones.resourceAvailability);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, port, name, id, resourceAvailability);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableZones {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceAvailability: ").append(toIndentedString(resourceAvailability)).append("\n");
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

