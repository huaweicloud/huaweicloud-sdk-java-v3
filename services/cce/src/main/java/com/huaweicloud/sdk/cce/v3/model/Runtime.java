package com.huaweicloud.sdk.cce.v3.model;




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
 * Runtime
 */
public class Runtime  {

    /**
     * 容器运行时，默认为“docker”
     */
    public static final class NameEnum {

        
        /**
         * Enum DOCKER for value: "docker"
         */
        public static final NameEnum DOCKER = new NameEnum("docker");
        
        /**
         * Enum CONTAINERD for value: "containerd"
         */
        public static final NameEnum CONTAINERD = new NameEnum("containerd");
        

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("docker", DOCKER);
            map.put("containerd", CONTAINERD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NameEnum(value);
            }
            return result;
        }

        public static NameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private NameEnum name;

    public Runtime withName(NameEnum name) {
        this.name = name;
        return this;
    }

    


    /**
     * 容器运行时，默认为“docker”
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Runtime runtime = (Runtime) o;
        return Objects.equals(this.name, runtime.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Runtime {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

