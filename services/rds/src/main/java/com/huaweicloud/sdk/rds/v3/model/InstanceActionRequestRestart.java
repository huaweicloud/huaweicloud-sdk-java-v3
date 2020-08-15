package com.huaweicloud.sdk.rds.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 重启实例时必填。
 */
public class InstanceActionRequestRestart  {

    /**
     * 在线调试时必填。
     */
    public static class RestartEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final RestartEnum TRUE = new RestartEnum("true");
        

        public static final Map<String, RestartEnum> staticFields = new HashMap<String, RestartEnum>() {
            { 
                put("true", TRUE);
            }
        };

        private String value;

        RestartEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RestartEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RestartEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new RestartEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static RestartEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RestartEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RestartEnum) {
                return this.value.equals(((RestartEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restart")
    
    private RestartEnum restart;

    public InstanceActionRequestRestart withRestart(RestartEnum restart) {
        this.restart = restart;
        return this;
    }

    


    /**
     * 在线调试时必填。
     * @return restart
     */
    public RestartEnum getRestart() {
        return restart;
    }

    public void setRestart(RestartEnum restart) {
        this.restart = restart;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceActionRequestRestart instanceActionRequestRestart = (InstanceActionRequestRestart) o;
        return Objects.equals(this.restart, instanceActionRequestRestart.restart);
    }
    @Override
    public int hashCode() {
        return Objects.hash(restart);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceActionRequestRestart {\n");
        sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
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

