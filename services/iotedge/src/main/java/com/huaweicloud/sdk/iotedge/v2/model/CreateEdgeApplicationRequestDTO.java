package com.huaweicloud.sdk.iotedge.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateEdgeApplicationRequestDTO
 */
public class CreateEdgeApplicationRequestDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    @JacksonXmlProperty(localName = "edge_app_id")
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    @JacksonXmlProperty(localName = "description")
    
    private String description;
    /**
     * 功能类型,分为数据处理（DATA_PROCESSING）、协议解析（PROTOCOL_PARSING）、IT集成（ON_PREMISE_INTEGRATION）和混合应用（COMPOSITE_APPLICATION），数据默认为DATA_PROCESSING，数据处理模块可以传输消息，协议解析为驱动类型，IT集成为部署南向3rdIA使用，混合应用可同时实现数据处理和协议解析。
     */
    public static final class FunctionTypeEnum {

        
        /**
         * Enum DATA_PROCESSING for value: "DATA_PROCESSING"
         */
        public static final FunctionTypeEnum DATA_PROCESSING = new FunctionTypeEnum("DATA_PROCESSING");
        
        /**
         * Enum PROTOCOL_PARSING for value: "PROTOCOL_PARSING"
         */
        public static final FunctionTypeEnum PROTOCOL_PARSING = new FunctionTypeEnum("PROTOCOL_PARSING");
        
        /**
         * Enum ON_PREMISE_INTEGRATION for value: "ON_PREMISE_INTEGRATION"
         */
        public static final FunctionTypeEnum ON_PREMISE_INTEGRATION = new FunctionTypeEnum("ON_PREMISE_INTEGRATION");
        
        /**
         * Enum GATEWAY_MANAGER for value: "GATEWAY_MANAGER"
         */
        public static final FunctionTypeEnum GATEWAY_MANAGER = new FunctionTypeEnum("GATEWAY_MANAGER");
        
        /**
         * Enum COMPOSITE_APPLICATION for value: "COMPOSITE_APPLICATION"
         */
        public static final FunctionTypeEnum COMPOSITE_APPLICATION = new FunctionTypeEnum("COMPOSITE_APPLICATION");
        
        /**
         * Enum DATA_COLLECTION for value: "DATA_COLLECTION"
         */
        public static final FunctionTypeEnum DATA_COLLECTION = new FunctionTypeEnum("DATA_COLLECTION");
        

        private static final Map<String, FunctionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FunctionTypeEnum> createStaticFields() {
            Map<String, FunctionTypeEnum> map = new HashMap<>();
            map.put("DATA_PROCESSING", DATA_PROCESSING);
            map.put("PROTOCOL_PARSING", PROTOCOL_PARSING);
            map.put("ON_PREMISE_INTEGRATION", ON_PREMISE_INTEGRATION);
            map.put("GATEWAY_MANAGER", GATEWAY_MANAGER);
            map.put("COMPOSITE_APPLICATION", COMPOSITE_APPLICATION);
            map.put("DATA_COLLECTION", DATA_COLLECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FunctionTypeEnum(String value) {
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
        public static FunctionTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FunctionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FunctionTypeEnum(value);
            }
            return result;
        }

        public static FunctionTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FunctionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FunctionTypeEnum) {
                return this.value.equals(((FunctionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_type")
    
    @JacksonXmlProperty(localName = "function_type")
    
    private FunctionTypeEnum functionType;

    public CreateEdgeApplicationRequestDTO withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用ID
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public CreateEdgeApplicationRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateEdgeApplicationRequestDTO withFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
        return this;
    }

    


    /**
     * 功能类型,分为数据处理（DATA_PROCESSING）、协议解析（PROTOCOL_PARSING）、IT集成（ON_PREMISE_INTEGRATION）和混合应用（COMPOSITE_APPLICATION），数据默认为DATA_PROCESSING，数据处理模块可以传输消息，协议解析为驱动类型，IT集成为部署南向3rdIA使用，混合应用可同时实现数据处理和协议解析。
     * @return functionType
     */
    public FunctionTypeEnum getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEdgeApplicationRequestDTO createEdgeApplicationRequestDTO = (CreateEdgeApplicationRequestDTO) o;
        return Objects.equals(this.edgeAppId, createEdgeApplicationRequestDTO.edgeAppId) &&
            Objects.equals(this.description, createEdgeApplicationRequestDTO.description) &&
            Objects.equals(this.functionType, createEdgeApplicationRequestDTO.functionType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, description, functionType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeApplicationRequestDTO {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
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

