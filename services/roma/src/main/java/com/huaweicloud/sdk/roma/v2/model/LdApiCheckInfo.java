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
 * LdApiCheckInfo
 */
public class LdApiCheckInfo  {

    /**
     * 校验类型：   - path：路径类型   - name：名称类型
     */
    public static final class TypeEnum {

        
        /**
         * Enum PATH for value: "path"
         */
        public static final TypeEnum PATH = new TypeEnum("path");
        
        /**
         * Enum NAME for value: "name"
         */
        public static final TypeEnum NAME = new TypeEnum("name");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("path", PATH);
            map.put("name", NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ld_api_name")
    
    private String ldApiName;
    /**
     * 自定义后端API请求方式。  type = path时必填
     */
    public static final class LdApiMethodEnum {

        
        /**
         * Enum GET for value: "GET"
         */
        public static final LdApiMethodEnum GET = new LdApiMethodEnum("GET");
        
        /**
         * Enum POST for value: "POST"
         */
        public static final LdApiMethodEnum POST = new LdApiMethodEnum("POST");
        
        /**
         * Enum PUT for value: "PUT"
         */
        public static final LdApiMethodEnum PUT = new LdApiMethodEnum("PUT");
        
        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final LdApiMethodEnum DELETE = new LdApiMethodEnum("DELETE");
        

        private static final Map<String, LdApiMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LdApiMethodEnum> createStaticFields() {
            Map<String, LdApiMethodEnum> map = new HashMap<>();
            map.put("GET", GET);
            map.put("POST", POST);
            map.put("PUT", PUT);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LdApiMethodEnum(String value) {
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
        public static LdApiMethodEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LdApiMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LdApiMethodEnum(value);
            }
            return result;
        }

        public static LdApiMethodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LdApiMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LdApiMethodEnum) {
                return this.value.equals(((LdApiMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ld_api_method")
    
    private LdApiMethodEnum ldApiMethod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ld_api_path")
    
    private String ldApiPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;

    public LdApiCheckInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 校验类型：   - path：路径类型   - name：名称类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public LdApiCheckInfo withLdApiName(String ldApiName) {
        this.ldApiName = ldApiName;
        return this;
    }

    


    /**
     * 自定义后端API名称。  type = name时必填
     * @return ldApiName
     */
    public String getLdApiName() {
        return ldApiName;
    }

    public void setLdApiName(String ldApiName) {
        this.ldApiName = ldApiName;
    }

    

    public LdApiCheckInfo withLdApiMethod(LdApiMethodEnum ldApiMethod) {
        this.ldApiMethod = ldApiMethod;
        return this;
    }

    


    /**
     * 自定义后端API请求方式。  type = path时必填
     * @return ldApiMethod
     */
    public LdApiMethodEnum getLdApiMethod() {
        return ldApiMethod;
    }

    public void setLdApiMethod(LdApiMethodEnum ldApiMethod) {
        this.ldApiMethod = ldApiMethod;
    }

    

    public LdApiCheckInfo withLdApiPath(String ldApiPath) {
        this.ldApiPath = ldApiPath;
        return this;
    }

    


    /**
     * 自定义后端API的访问地址。  type = path时必填
     * @return ldApiPath
     */
    public String getLdApiPath() {
        return ldApiPath;
    }

    public void setLdApiPath(String ldApiPath) {
        this.ldApiPath = ldApiPath;
    }

    

    public LdApiCheckInfo withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    


    /**
     * 集成应用ID。  校验应用下后端API定义是否重复时必填
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiCheckInfo ldApiCheckInfo = (LdApiCheckInfo) o;
        return Objects.equals(this.type, ldApiCheckInfo.type) &&
            Objects.equals(this.ldApiName, ldApiCheckInfo.ldApiName) &&
            Objects.equals(this.ldApiMethod, ldApiCheckInfo.ldApiMethod) &&
            Objects.equals(this.ldApiPath, ldApiCheckInfo.ldApiPath) &&
            Objects.equals(this.romaAppId, ldApiCheckInfo.romaAppId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, ldApiName, ldApiMethod, ldApiPath, romaAppId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiCheckInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ldApiName: ").append(toIndentedString(ldApiName)).append("\n");
        sb.append("    ldApiMethod: ").append(toIndentedString(ldApiMethod)).append("\n");
        sb.append("    ldApiPath: ").append(toIndentedString(ldApiPath)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
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

