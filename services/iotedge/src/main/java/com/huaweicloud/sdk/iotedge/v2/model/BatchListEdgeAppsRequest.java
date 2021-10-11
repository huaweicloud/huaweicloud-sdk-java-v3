package com.huaweicloud.sdk.iotedge.v2.model;




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
 * Request Object
 */
public class BatchListEdgeAppsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;
    /**
     * 应用id搜索关键字
     */
    public static final class AppTypeEnum {

        
        /**
         * Enum SYSTEM_REQUIRED for value: "SYSTEM_REQUIRED"
         */
        public static final AppTypeEnum SYSTEM_REQUIRED = new AppTypeEnum("SYSTEM_REQUIRED");
        
        /**
         * Enum SYSTEM_OPTIONAL for value: "SYSTEM_OPTIONAL"
         */
        public static final AppTypeEnum SYSTEM_OPTIONAL = new AppTypeEnum("SYSTEM_OPTIONAL");
        
        /**
         * Enum USER for value: "USER"
         */
        public static final AppTypeEnum USER = new AppTypeEnum("USER");
        

        private static final Map<String, AppTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppTypeEnum> createStaticFields() {
            Map<String, AppTypeEnum> map = new HashMap<>();
            map.put("SYSTEM_REQUIRED", SYSTEM_REQUIRED);
            map.put("SYSTEM_OPTIONAL", SYSTEM_OPTIONAL);
            map.put("USER", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppTypeEnum(String value) {
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
        public static AppTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AppTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AppTypeEnum(value);
            }
            return result;
        }

        public static AppTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AppTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppTypeEnum) {
                return this.value.equals(((AppTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_type")
    
    
    private AppTypeEnum appType;
    /**
     * 功能类型
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
        

        private static final Map<String, FunctionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FunctionTypeEnum> createStaticFields() {
            Map<String, FunctionTypeEnum> map = new HashMap<>();
            map.put("DATA_PROCESSING", DATA_PROCESSING);
            map.put("PROTOCOL_PARSING", PROTOCOL_PARSING);
            map.put("ON_PREMISE_INTEGRATION", ON_PREMISE_INTEGRATION);
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
    
    
    private FunctionTypeEnum functionType;

    public BatchListEdgeAppsRequest withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用ID搜索关键字
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public BatchListEdgeAppsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public BatchListEdgeAppsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页记录数，默认值为10，取值区间为1-1000
     * minimum: 0
     * maximum: 1000000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public BatchListEdgeAppsRequest withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * 应用id搜索关键字
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    

    public BatchListEdgeAppsRequest withFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
        return this;
    }

    


    /**
     * 功能类型
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
        BatchListEdgeAppsRequest batchListEdgeAppsRequest = (BatchListEdgeAppsRequest) o;
        return Objects.equals(this.edgeAppId, batchListEdgeAppsRequest.edgeAppId) &&
            Objects.equals(this.offset, batchListEdgeAppsRequest.offset) &&
            Objects.equals(this.limit, batchListEdgeAppsRequest.limit) &&
            Objects.equals(this.appType, batchListEdgeAppsRequest.appType) &&
            Objects.equals(this.functionType, batchListEdgeAppsRequest.functionType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, offset, limit, appType, functionType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListEdgeAppsRequest {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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

