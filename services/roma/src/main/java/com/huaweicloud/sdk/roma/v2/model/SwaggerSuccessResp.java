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
 * SwaggerSuccessResp
 */
public class SwaggerSuccessResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private String method;
    /**
     * 导入行为： - update：表示更新API - create：表示新建API
     */
    public static final class ActionEnum {

        
        /**
         * Enum UPDATE for value: "update"
         */
        public static final ActionEnum UPDATE = new ActionEnum("update");
        
        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("update", UPDATE);
            map.put("create", CREATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public SwaggerSuccessResp withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * API请求路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public SwaggerSuccessResp withMethod(String method) {
        this.method = method;
        return this;
    }

    


    /**
     * API请求方法
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    

    public SwaggerSuccessResp withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 导入行为： - update：表示更新API - create：表示新建API
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public SwaggerSuccessResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 导入成功的API编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwaggerSuccessResp swaggerSuccessResp = (SwaggerSuccessResp) o;
        return Objects.equals(this.path, swaggerSuccessResp.path) &&
            Objects.equals(this.method, swaggerSuccessResp.method) &&
            Objects.equals(this.action, swaggerSuccessResp.action) &&
            Objects.equals(this.id, swaggerSuccessResp.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, method, action, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwaggerSuccessResp {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

