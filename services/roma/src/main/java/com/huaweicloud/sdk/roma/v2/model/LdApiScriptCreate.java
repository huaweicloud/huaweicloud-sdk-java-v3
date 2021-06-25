package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiScriptBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LdApiScriptCreate
 */
public class LdApiScriptCreate  {

    /**
     * API类型 - data：数据API - function：函数API 
     */
    public static final class ApiTypeEnum {

        
        /**
         * Enum DATA for value: "data"
         */
        public static final ApiTypeEnum DATA = new ApiTypeEnum("data");
        
        /**
         * Enum FUNCTION for value: "function"
         */
        public static final ApiTypeEnum FUNCTION = new ApiTypeEnum("function");
        

        private static final Map<String, ApiTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiTypeEnum> createStaticFields() {
            Map<String, ApiTypeEnum> map = new HashMap<>();
            map.put("data", DATA);
            map.put("function", FUNCTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiTypeEnum(String value) {
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
        public static ApiTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ApiTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiTypeEnum(value);
            }
            return result;
        }

        public static ApiTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ApiTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ApiTypeEnum) {
                return this.value.equals(((ApiTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_type")
    
    private ApiTypeEnum apiType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scripts")
    
    private List<LdApiScriptBase> scripts = null;
    
    public LdApiScriptCreate withApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
        return this;
    }

    


    /**
     * API类型 - data：数据API - function：函数API 
     * @return apiType
     */
    public ApiTypeEnum getApiType() {
        return apiType;
    }

    public void setApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
    }

    

    public LdApiScriptCreate withScripts(List<LdApiScriptBase> scripts) {
        this.scripts = scripts;
        return this;
    }

    
    public LdApiScriptCreate addScriptsItem(LdApiScriptBase scriptsItem) {
        if(this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public LdApiScriptCreate withScripts(Consumer<List<LdApiScriptBase>> scriptsSetter) {
        if(this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        scriptsSetter.accept(this.scripts);
        return this;
    }

    /**
     * API脚本信息列表
     * @return scripts
     */
    public List<LdApiScriptBase> getScripts() {
        return scripts;
    }

    public void setScripts(List<LdApiScriptBase> scripts) {
        this.scripts = scripts;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiScriptCreate ldApiScriptCreate = (LdApiScriptCreate) o;
        return Objects.equals(this.apiType, ldApiScriptCreate.apiType) &&
            Objects.equals(this.scripts, ldApiScriptCreate.scripts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiType, scripts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiScriptCreate {\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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

