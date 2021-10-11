package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

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
 * Response Object
 */
public class ShowModuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_version")
    
    
    private String appVersion;
    /**
     * 模块状态
     */
    public static final class StateEnum {

        
        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StateEnum PENDING = new StateEnum("PENDING");
        
        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StateEnum PENDING_DELETE = new StateEnum("PENDING_DELETE");
        
        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StateEnum DELETE_FAILED = new StateEnum("DELETE_FAILED");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");
        
        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StateEnum SUCCEEDED = new StateEnum("SUCCEEDED");
        
        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final StateEnum UNKNOWN = new StateEnum("UNKNOWN");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("PENDING", PENDING);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("UNKNOWN", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    
    private StateEnum state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_name")
    
    
    private String moduleName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_id")
    
    
    private String moduleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private String updateTime;
    /**
     * 应用类型
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

    public ShowModuleResponse withEdgeAppId(String edgeAppId) {
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

    

    public ShowModuleResponse withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    


    /**
     * 应用版本
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    

    public ShowModuleResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 模块状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    public ShowModuleResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 边缘节点（同deviceID）ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public ShowModuleResponse withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    


    /**
     * 模块名称
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    

    public ShowModuleResponse withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    


    /**
     * 模块ID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    

    public ShowModuleResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ShowModuleResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public ShowModuleResponse withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * 应用类型
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    

    public ShowModuleResponse withFunctionType(FunctionTypeEnum functionType) {
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
        ShowModuleResponse showModuleResponse = (ShowModuleResponse) o;
        return Objects.equals(this.edgeAppId, showModuleResponse.edgeAppId) &&
            Objects.equals(this.appVersion, showModuleResponse.appVersion) &&
            Objects.equals(this.state, showModuleResponse.state) &&
            Objects.equals(this.nodeId, showModuleResponse.nodeId) &&
            Objects.equals(this.moduleName, showModuleResponse.moduleName) &&
            Objects.equals(this.moduleId, showModuleResponse.moduleId) &&
            Objects.equals(this.createTime, showModuleResponse.createTime) &&
            Objects.equals(this.updateTime, showModuleResponse.updateTime) &&
            Objects.equals(this.appType, showModuleResponse.appType) &&
            Objects.equals(this.functionType, showModuleResponse.functionType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, appVersion, state, nodeId, moduleName, moduleId, createTime, updateTime, appType, functionType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModuleResponse {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

