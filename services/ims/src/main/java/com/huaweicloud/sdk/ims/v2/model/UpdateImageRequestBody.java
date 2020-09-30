package com.huaweicloud.sdk.ims.v2.model;




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
 * 扩展更新镜像接口请求体
 */
public class UpdateImageRequestBody  {

    /**
     * 操作类型，目前取值为add，replace和remove。
     */
    public static final class OpEnum {

        
        /**
         * Enum ADD for value: "add"
         */
        public static final OpEnum ADD = new OpEnum("add");
        
        /**
         * Enum REPLACE for value: "replace"
         */
        public static final OpEnum REPLACE = new OpEnum("replace");
        
        /**
         * Enum REMOVE for value: "remove"
         */
        public static final OpEnum REMOVE = new OpEnum("remove");
        

        private static final Map<String, OpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OpEnum> createStaticFields() {
            Map<String, OpEnum> map = new HashMap<>();
            map.put("add", ADD);
            map.put("replace", REPLACE);
            map.put("remove", REMOVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OpEnum(String value) {
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
        public static OpEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OpEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OpEnum(value);
            }
            return result;
        }

        public static OpEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OpEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OpEnum) {
                return this.value.equals(((OpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="op")
    
    private OpEnum op;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public UpdateImageRequestBody withOp(OpEnum op) {
        this.op = op;
        return this;
    }

    


    /**
     * 操作类型，目前取值为add，replace和remove。
     * @return op
     */
    public OpEnum getOp() {
        return op;
    }

    public void setOp(OpEnum op) {
        this.op = op;
    }

    public UpdateImageRequestBody withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 需要更新的属性名称，需要在属性名称前加“/”。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public UpdateImageRequestBody withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 需要更新属性的值。
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
        UpdateImageRequestBody updateImageRequestBody = (UpdateImageRequestBody) o;
        return Objects.equals(this.op, updateImageRequestBody.op) &&
            Objects.equals(this.path, updateImageRequestBody.path) &&
            Objects.equals(this.value, updateImageRequestBody.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(op, path, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateImageRequestBody {\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

