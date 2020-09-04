package com.huaweicloud.sdk.kafka.v2.model;




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
public class ShowInstanceExtendProductInfoRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;
    /**
     * Gets or Sets type
     */
    public static class TypeEnum {

        
        /**
         * Enum ADVANCED for value: "advanced"
         */
        public static final TypeEnum ADVANCED = new TypeEnum("advanced");
        
        /**
         * Enum PLATINUM for value: "platinum"
         */
        public static final TypeEnum PLATINUM = new TypeEnum("platinum");
        
        /**
         * Enum DEC for value: "dec"
         */
        public static final TypeEnum DEC = new TypeEnum("dec");
        
        /**
         * Enum EXP for value: "exp"
         */
        public static final TypeEnum EXP = new TypeEnum("exp");
        

        public static final Map<String, TypeEnum> staticFields = new HashMap<String, TypeEnum>() {
            { 
                put("advanced", ADVANCED);
                put("platinum", PLATINUM);
                put("dec", DEC);
                put("exp", EXP);
            }
        };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;
    /**
     * Gets or Sets engine
     */
    public static class EngineEnum {

        
        /**
         * Enum KAFKA for value: "kafka"
         */
        public static final EngineEnum KAFKA = new EngineEnum("kafka");
        

        public static final Map<String, EngineEnum> staticFields = new HashMap<String, EngineEnum>() {
            { 
                put("kafka", KAFKA);
            }
        };

        private String value;

        EngineEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EngineEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EngineEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new EngineEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static EngineEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine")
    
    private EngineEnum engine;

    public ShowInstanceExtendProductInfoRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceExtendProductInfoRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowInstanceExtendProductInfoRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    


    /**
     * Get engine
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceExtendProductInfoRequest showInstanceExtendProductInfoRequest = (ShowInstanceExtendProductInfoRequest) o;
        return Objects.equals(this.instanceId, showInstanceExtendProductInfoRequest.instanceId) &&
            Objects.equals(this.type, showInstanceExtendProductInfoRequest.type) &&
            Objects.equals(this.engine, showInstanceExtendProductInfoRequest.engine);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type, engine);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceExtendProductInfoRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
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

