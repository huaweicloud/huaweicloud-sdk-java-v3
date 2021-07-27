package com.huaweicloud.sdk.roma.v2.model;




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
 * ThrottleSpecialCreate
 */
public class ThrottleSpecialCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="call_limits")
    
    private Integer callLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_id")
    
    private String objectId;
    /**
     * 特殊对象类型
     */
    public static final class ObjectTypeEnum {

        
        /**
         * Enum APP for value: "APP"
         */
        public static final ObjectTypeEnum APP = new ObjectTypeEnum("APP");
        
        /**
         * Enum USER for value: "USER"
         */
        public static final ObjectTypeEnum USER = new ObjectTypeEnum("USER");
        

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("APP", APP);
            map.put("USER", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
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
        public static ObjectTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectTypeEnum(value);
            }
            return result;
        }

        public static ObjectTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_type")
    
    private ObjectTypeEnum objectType;

    public ThrottleSpecialCreate withCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
        return this;
    }

    


    /**
     * 流控时间内特殊对象能够访问API的最大次数限制
     * minimum: 1
     * @return callLimits
     */
    public Integer getCallLimits() {
        return callLimits;
    }

    public void setCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
    }

    

    public ThrottleSpecialCreate withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    


    /**
     * 特殊APP的编号或特殊租户的帐号ID
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    

    public ThrottleSpecialCreate withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    


    /**
     * 特殊对象类型
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleSpecialCreate throttleSpecialCreate = (ThrottleSpecialCreate) o;
        return Objects.equals(this.callLimits, throttleSpecialCreate.callLimits) &&
            Objects.equals(this.objectId, throttleSpecialCreate.objectId) &&
            Objects.equals(this.objectType, throttleSpecialCreate.objectType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(callLimits, objectId, objectType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleSpecialCreate {\n");
        sb.append("    callLimits: ").append(toIndentedString(callLimits)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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

