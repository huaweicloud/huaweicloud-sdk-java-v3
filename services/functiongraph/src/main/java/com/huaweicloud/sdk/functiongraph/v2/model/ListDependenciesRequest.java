package com.huaweicloud.sdk.functiongraph.v2.model;




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
public class ListDependenciesRequest  {

    /**
     * Gets or Sets dependencyType
     */
    public static final class DependencyTypeEnum {

        
        /**
         * Enum PUBLIC for value: "public"
         */
        public static final DependencyTypeEnum PUBLIC = new DependencyTypeEnum("public");
        
        /**
         * Enum PRIVATE for value: "private"
         */
        public static final DependencyTypeEnum PRIVATE = new DependencyTypeEnum("private");
        
        /**
         * Enum ALL for value: "all"
         */
        public static final DependencyTypeEnum ALL = new DependencyTypeEnum("all");
        

        private static final Map<String, DependencyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DependencyTypeEnum> createStaticFields() {
            Map<String, DependencyTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("private", PRIVATE);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DependencyTypeEnum(String value) {
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
        public static DependencyTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DependencyTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DependencyTypeEnum(value);
            }
            return result;
        }

        public static DependencyTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DependencyTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DependencyTypeEnum) {
                return this.value.equals(((DependencyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dependency_type")
    
    private DependencyTypeEnum dependencyType;
    /**
     * Gets or Sets runtime
     */
    public static final class RuntimeEnum {

        
        /**
         * Enum JAVA_8 for value: "Java 8"
         */
        public static final RuntimeEnum JAVA_8 = new RuntimeEnum("Java 8");
        
        /**
         * Enum NODE_JS_6_10 for value: "Node.js 6.10"
         */
        public static final RuntimeEnum NODE_JS_6_10 = new RuntimeEnum("Node.js 6.10");
        
        /**
         * Enum NODE_JS_8_10 for value: "Node.js 8.10"
         */
        public static final RuntimeEnum NODE_JS_8_10 = new RuntimeEnum("Node.js 8.10");
        
        /**
         * Enum NODE_JS_10_16 for value: "Node.js 10.16"
         */
        public static final RuntimeEnum NODE_JS_10_16 = new RuntimeEnum("Node.js 10.16");
        
        /**
         * Enum NODE_JS_12_13 for value: "Node.js 12.13"
         */
        public static final RuntimeEnum NODE_JS_12_13 = new RuntimeEnum("Node.js 12.13");
        
        /**
         * Enum PYTHON_2_7 for value: "Python 2.7"
         */
        public static final RuntimeEnum PYTHON_2_7 = new RuntimeEnum("Python 2.7");
        
        /**
         * Enum _PYTHON_3_6 for value: "  Python 3.6"
         */
        public static final RuntimeEnum _PYTHON_3_6 = new RuntimeEnum("  Python 3.6");
        
        /**
         * Enum GO_1_8 for value: "Go 1.8"
         */
        public static final RuntimeEnum GO_1_8 = new RuntimeEnum("Go 1.8");
        
        /**
         * Enum C_NET_CORE_2_0_ for value: "C#(.NET Core 2.0)"
         */
        public static final RuntimeEnum C_NET_CORE_2_0_ = new RuntimeEnum("C#(.NET Core 2.0)");
        
        /**
         * Enum C_NET_CORE_2_1_ for value: "C#(.NET Core 2.1)"
         */
        public static final RuntimeEnum C_NET_CORE_2_1_ = new RuntimeEnum("C#(.NET Core 2.1)");
        
        /**
         * Enum C_NET_CORE_3_1_ for value: "C#(.NET Core 3.1)"
         */
        public static final RuntimeEnum C_NET_CORE_3_1_ = new RuntimeEnum("C#(.NET Core 3.1)");
        
        /**
         * Enum PHP_7_3 for value: "PHP 7.3"
         */
        public static final RuntimeEnum PHP_7_3 = new RuntimeEnum("PHP 7.3");
        

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Java 8", JAVA_8);
            map.put("Node.js 6.10", NODE_JS_6_10);
            map.put("Node.js 8.10", NODE_JS_8_10);
            map.put("Node.js 10.16", NODE_JS_10_16);
            map.put("Node.js 12.13", NODE_JS_12_13);
            map.put("Python 2.7", PYTHON_2_7);
            map.put("  Python 3.6", _PYTHON_3_6);
            map.put("Go 1.8", GO_1_8);
            map.put("C#(.NET Core 2.0)", C_NET_CORE_2_0_);
            map.put("C#(.NET Core 2.1)", C_NET_CORE_2_1_);
            map.put("C#(.NET Core 3.1)", C_NET_CORE_3_1_);
            map.put("PHP 7.3", PHP_7_3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuntimeEnum(String value) {
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
        public static RuntimeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RuntimeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RuntimeEnum(value);
            }
            return result;
        }

        public static RuntimeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RuntimeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RuntimeEnum) {
                return this.value.equals(((RuntimeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="runtime")
    
    private RuntimeEnum runtime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;

    public ListDependenciesRequest withDependencyType(DependencyTypeEnum dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    


    /**
     * Get dependencyType
     * @return dependencyType
     */
    public DependencyTypeEnum getDependencyType() {
        return dependencyType;
    }

    public void setDependencyType(DependencyTypeEnum dependencyType) {
        this.dependencyType = dependencyType;
    }

    public ListDependenciesRequest withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    


    /**
     * Get runtime
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public ListDependenciesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDependenciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListDependenciesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDependenciesRequest listDependenciesRequest = (ListDependenciesRequest) o;
        return Objects.equals(this.dependencyType, listDependenciesRequest.dependencyType) &&
            Objects.equals(this.runtime, listDependenciesRequest.runtime) &&
            Objects.equals(this.name, listDependenciesRequest.name) &&
            Objects.equals(this.marker, listDependenciesRequest.marker) &&
            Objects.equals(this.limit, listDependenciesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dependencyType, runtime, name, marker, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDependenciesRequest {\n");
        sb.append("    dependencyType: ").append(toIndentedString(dependencyType)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

