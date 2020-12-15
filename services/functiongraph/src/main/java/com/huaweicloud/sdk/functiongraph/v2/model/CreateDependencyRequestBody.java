package com.huaweicloud.sdk.functiongraph.v2.model;




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
 * CreateDependencyRequestBody
 */
public class CreateDependencyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="depend_file")
    
    private String dependFile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="depend_link")
    
    private String dependLink;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="depend_type")
    
    private String dependType;
    /**
     * 运行时语言。
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
    @JsonProperty(value="description")
    
    private String description;

    public CreateDependencyRequestBody withDependFile(String dependFile) {
        this.dependFile = dependFile;
        return this;
    }

    


    /**
     * depend_type为zip类型时必填，为文件流格式。
     * @return dependFile
     */
    public String getDependFile() {
        return dependFile;
    }

    public void setDependFile(String dependFile) {
        this.dependFile = dependFile;
    }

    public CreateDependencyRequestBody withDependLink(String dependLink) {
        this.dependLink = dependLink;
        return this;
    }

    


    /**
     * depend_type为obs类型时，依赖包在obs的存储地址。
     * @return dependLink
     */
    public String getDependLink() {
        return dependLink;
    }

    public void setDependLink(String dependLink) {
        this.dependLink = dependLink;
    }

    public CreateDependencyRequestBody withDependType(String dependType) {
        this.dependType = dependType;
        return this;
    }

    


    /**
     * 导入类型,目前支持obs和zip。
     * @return dependType
     */
    public String getDependType() {
        return dependType;
    }

    public void setDependType(String dependType) {
        this.dependType = dependType;
    }

    public CreateDependencyRequestBody withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    


    /**
     * 运行时语言。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public CreateDependencyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 依赖包名称。必须以大、小写字母开头，以字母或数字结尾，只能由字母、数字、下划线、点和中划线组成，长度不超过96个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDependencyRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 依赖包描述，不超过512个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDependencyRequestBody createDependencyRequestBody = (CreateDependencyRequestBody) o;
        return Objects.equals(this.dependFile, createDependencyRequestBody.dependFile) &&
            Objects.equals(this.dependLink, createDependencyRequestBody.dependLink) &&
            Objects.equals(this.dependType, createDependencyRequestBody.dependType) &&
            Objects.equals(this.runtime, createDependencyRequestBody.runtime) &&
            Objects.equals(this.name, createDependencyRequestBody.name) &&
            Objects.equals(this.description, createDependencyRequestBody.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dependFile, dependLink, dependType, runtime, name, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDependencyRequestBody {\n");
        sb.append("    dependFile: ").append(toIndentedString(dependFile)).append("\n");
        sb.append("    dependLink: ").append(toIndentedString(dependLink)).append("\n");
        sb.append("    dependType: ").append(toIndentedString(dependType)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

