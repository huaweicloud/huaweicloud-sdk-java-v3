package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

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
 * BackendParamBase
 */
public class BackendParamBase  {

    /**
     * 参数类别：REQUEST、CONSTANT、SYSTEM
     */
    public static final class OriginEnum {

        
        /**
         * Enum REQUEST for value: "REQUEST"
         */
        public static final OriginEnum REQUEST = new OriginEnum("REQUEST");
        
        /**
         * Enum CONSTANT for value: "CONSTANT"
         */
        public static final OriginEnum CONSTANT = new OriginEnum("CONSTANT");
        
        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final OriginEnum SYSTEM = new OriginEnum("SYSTEM");
        

        private static final Map<String, OriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginEnum> createStaticFields() {
            Map<String, OriginEnum> map = new HashMap<>();
            map.put("REQUEST", REQUEST);
            map.put("CONSTANT", CONSTANT);
            map.put("SYSTEM", SYSTEM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OriginEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OriginEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OriginEnum(value);
            }
            return result;
        }

        public static OriginEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OriginEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin")
    
    private OriginEnum origin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;
    /**
     * 参数位置：PATH、QUERY、HEADER
     */
    public static final class LocationEnum {

        
        /**
         * Enum PATH for value: "PATH"
         */
        public static final LocationEnum PATH = new LocationEnum("PATH");
        
        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final LocationEnum QUERY = new LocationEnum("QUERY");
        
        /**
         * Enum HEADER for value: "HEADER"
         */
        public static final LocationEnum HEADER = new LocationEnum("HEADER");
        

        private static final Map<String, LocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocationEnum> createStaticFields() {
            Map<String, LocationEnum> map = new HashMap<>();
            map.put("PATH", PATH);
            map.put("QUERY", QUERY);
            map.put("HEADER", HEADER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocationEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LocationEnum(value);
            }
            return result;
        }

        public static LocationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LocationEnum) {
                return this.value.equals(((LocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private LocationEnum location;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public BackendParamBase withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    


    /**
     * 参数类别：REQUEST、CONSTANT、SYSTEM
     * @return origin
     */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public BackendParamBase withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数名称。 字符串由英文字母、数字、中划线、下划线、英文句号组成，且只能以英文开头。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackendParamBase withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BackendParamBase withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    


    /**
     * 参数位置：PATH、QUERY、HEADER
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public BackendParamBase withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 参数值。字符长度不超过255，类别为REQUEST时，值为req_params中的参数名称；类别为CONSTANT时，值为参数真正的值；类别为SYSTEM时，值为网关参数名称
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackendParamBase backendParamBase = (BackendParamBase) o;
        return Objects.equals(this.origin, backendParamBase.origin) &&
            Objects.equals(this.name, backendParamBase.name) &&
            Objects.equals(this.remark, backendParamBase.remark) &&
            Objects.equals(this.location, backendParamBase.location) &&
            Objects.equals(this.value, backendParamBase.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(origin, name, remark, location, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendParamBase {\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

