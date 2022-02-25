package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListDependenciesRequest {

    /** 依赖包类型public：公开,private:私有，all：全部。缺省时查询全量。 */
    public static final class DependencyTypeEnum {

        /** Enum PUBLIC for value: "public" */
        public static final DependencyTypeEnum PUBLIC = new DependencyTypeEnum("public");

        /** Enum PRIVATE for value: "private" */
        public static final DependencyTypeEnum PRIVATE = new DependencyTypeEnum("private");

        /** Enum ALL for value: "all" */
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DependencyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DependencyTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DependencyTypeEnum(value);
            }
            return result;
        }

        public static DependencyTypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof DependencyTypeEnum) {
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
    @JsonProperty(value = "dependency_type")

    private DependencyTypeEnum dependencyType;

    /** 运行时语言 Java11、Nodejs14.18、Python3.9在type为v2时支持 */
    public static final class RuntimeEnum {

        /** Enum JAVA8 for value: "Java8" */
        public static final RuntimeEnum JAVA8 = new RuntimeEnum("Java8");

        /** Enum JAVA11 for value: "Java11" */
        public static final RuntimeEnum JAVA11 = new RuntimeEnum("Java11");

        /** Enum NODE_JS6_10 for value: "Node.js6.10" */
        public static final RuntimeEnum NODE_JS6_10 = new RuntimeEnum("Node.js6.10");

        /** Enum NODE_JS8_10 for value: "Node.js8.10" */
        public static final RuntimeEnum NODE_JS8_10 = new RuntimeEnum("Node.js8.10");

        /** Enum NODE_JS10_16 for value: "Node.js10.16" */
        public static final RuntimeEnum NODE_JS10_16 = new RuntimeEnum("Node.js10.16");

        /** Enum NODE_JS12_13 for value: "Node.js12.13" */
        public static final RuntimeEnum NODE_JS12_13 = new RuntimeEnum("Node.js12.13");

        /** Enum NODE_JS14_18 for value: "Node.js14.18" */
        public static final RuntimeEnum NODE_JS14_18 = new RuntimeEnum("Node.js14.18");

        /** Enum PYTHON2_7 for value: "Python2.7" */
        public static final RuntimeEnum PYTHON2_7 = new RuntimeEnum("Python2.7");

        /** Enum PYTHON3_6 for value: "Python3.6" */
        public static final RuntimeEnum PYTHON3_6 = new RuntimeEnum("Python3.6");

        /** Enum PYTHON3_9 for value: "Python3.9" */
        public static final RuntimeEnum PYTHON3_9 = new RuntimeEnum("Python3.9");

        /** Enum GO1_8 for value: "Go1.8" */
        public static final RuntimeEnum GO1_8 = new RuntimeEnum("Go1.8");

        /** Enum GO1_X for value: "Go1.x" */
        public static final RuntimeEnum GO1_X = new RuntimeEnum("Go1.x");

        /** Enum C_NET_CORE_2_0_ for value: "C#(.NET Core 2.0)" */
        public static final RuntimeEnum C_NET_CORE_2_0_ = new RuntimeEnum("C#(.NET Core 2.0)");

        /** Enum C_NET_CORE_2_1_ for value: "C#(.NET Core 2.1)" */
        public static final RuntimeEnum C_NET_CORE_2_1_ = new RuntimeEnum("C#(.NET Core 2.1)");

        /** Enum C_NET_CORE_3_1_ for value: "C#(.NET Core 3.1)" */
        public static final RuntimeEnum C_NET_CORE_3_1_ = new RuntimeEnum("C#(.NET Core 3.1)");

        /** Enum PHP7_3 for value: "PHP7.3" */
        public static final RuntimeEnum PHP7_3 = new RuntimeEnum("PHP7.3");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Java8", JAVA8);
            map.put("Java11", JAVA11);
            map.put("Node.js6.10", NODE_JS6_10);
            map.put("Node.js8.10", NODE_JS8_10);
            map.put("Node.js10.16", NODE_JS10_16);
            map.put("Node.js12.13", NODE_JS12_13);
            map.put("Node.js14.18", NODE_JS14_18);
            map.put("Python2.7", PYTHON2_7);
            map.put("Python3.6", PYTHON3_6);
            map.put("Python3.9", PYTHON3_9);
            map.put("Go1.8", GO1_8);
            map.put("Go1.x", GO1_X);
            map.put("C#(.NET Core 2.0)", C_NET_CORE_2_0_);
            map.put("C#(.NET Core 2.1)", C_NET_CORE_2_1_);
            map.put("C#(.NET Core 3.1)", C_NET_CORE_3_1_);
            map.put("PHP7.3", PHP7_3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuntimeEnum(String value) {
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
        public static RuntimeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RuntimeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RuntimeEnum(value);
            }
            return result;
        }

        public static RuntimeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof RuntimeEnum) {
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
    @JsonProperty(value = "runtime")

    private RuntimeEnum runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListDependenciesRequest withDependencyType(DependencyTypeEnum dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    /** 依赖包类型public：公开,private:私有，all：全部。缺省时查询全量。
     * 
     * @return dependencyType */
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

    /** 运行时语言 Java11、Nodejs14.18、Python3.9在type为v2时支持
     * 
     * @return runtime */
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

    /** 依赖包名称。
     * 
     * @return name */
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

    /** 上一次查询依赖包的最后记录位置，默认为\"0\"。
     * 
     * @return marker */
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

    /** 本次查询可获取的依赖包的最大数目，默认为\"400\"。
     * 
     * @return limit */
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
        return Objects.equals(this.dependencyType, listDependenciesRequest.dependencyType)
            && Objects.equals(this.runtime, listDependenciesRequest.runtime)
            && Objects.equals(this.name, listDependenciesRequest.name)
            && Objects.equals(this.marker, listDependenciesRequest.marker)
            && Objects.equals(this.limit, listDependenciesRequest.limit);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
