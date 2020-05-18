package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 扩展更新镜像接口请求体
 */
public class UpdateImageRequestBody  {

    /**
     * 操作类型，目前取值为add，replace和remove。
     */
    public static class OpEnum {

        
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

        

        public static Map<String, OpEnum> staticFields =
                new HashMap<String, OpEnum>() {
                    { 
                        put("add", ADD);
                        put("replace", REPLACE);
                        put("remove", REMOVE);
                    }
                };

        private String value;

        OpEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OpEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OpEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OpEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OpEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OpEnum result = staticFields.get(value);
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

