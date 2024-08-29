package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateComponentRequestSpec
 */
public class UpdateComponentRequestSpec {

    /**
     * 语言/运行时。
     */
    public static final class RuntimeEnum {

        /**
         * Enum DOCKER for value: "Docker"
         */
        public static final RuntimeEnum DOCKER = new RuntimeEnum("Docker");

        /**
         * Enum JAVA8 for value: "Java8"
         */
        public static final RuntimeEnum JAVA8 = new RuntimeEnum("Java8");

        /**
         * Enum JAVA11 for value: "Java11"
         */
        public static final RuntimeEnum JAVA11 = new RuntimeEnum("Java11");

        /**
         * Enum JAVA17 for value: "Java17"
         */
        public static final RuntimeEnum JAVA17 = new RuntimeEnum("Java17");

        /**
         * Enum TOMCAT8 for value: "Tomcat8"
         */
        public static final RuntimeEnum TOMCAT8 = new RuntimeEnum("Tomcat8");

        /**
         * Enum TOMCAT9 for value: "Tomcat9"
         */
        public static final RuntimeEnum TOMCAT9 = new RuntimeEnum("Tomcat9");

        /**
         * Enum PYTHON3 for value: "Python3"
         */
        public static final RuntimeEnum PYTHON3 = new RuntimeEnum("Python3");

        /**
         * Enum NODEJS8 for value: "Nodejs8"
         */
        public static final RuntimeEnum NODEJS8 = new RuntimeEnum("Nodejs8");

        /**
         * Enum NODEJS14 for value: "Nodejs14"
         */
        public static final RuntimeEnum NODEJS14 = new RuntimeEnum("Nodejs14");

        /**
         * Enum NODEJS16 for value: "Nodejs16"
         */
        public static final RuntimeEnum NODEJS16 = new RuntimeEnum("Nodejs16");

        /**
         * Enum PHP7 for value: "Php7"
         */
        public static final RuntimeEnum PHP7 = new RuntimeEnum("Php7");

        /**
         * Enum PHP8 for value: "Php8"
         */
        public static final RuntimeEnum PHP8 = new RuntimeEnum("Php8");

        /**
         * Enum DOTNET6 for value: "Dotnet6"
         */
        public static final RuntimeEnum DOTNET6 = new RuntimeEnum("Dotnet6");

        /**
         * Enum DOTNET7 for value: "Dotnet7"
         */
        public static final RuntimeEnum DOTNET7 = new RuntimeEnum("Dotnet7");

        /**
         * Enum DOTNET8 for value: "Dotnet8"
         */
        public static final RuntimeEnum DOTNET8 = new RuntimeEnum("Dotnet8");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Docker", DOCKER);
            map.put("Java8", JAVA8);
            map.put("Java11", JAVA11);
            map.put("Java17", JAVA17);
            map.put("Tomcat8", TOMCAT8);
            map.put("Tomcat9", TOMCAT9);
            map.put("Python3", PYTHON3);
            map.put("Nodejs8", NODEJS8);
            map.put("Nodejs14", NODEJS14);
            map.put("Nodejs16", NODEJS16);
            map.put("Php7", PHP7);
            map.put("Php8", PHP8);
            map.put("Dotnet6", DOTNET6);
            map.put("Dotnet7", DOTNET7);
            map.put("Dotnet8", DOTNET8);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuntimeEnum(value));
        }

        public static RuntimeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "source")

    private Source source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private Build build;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_limit")

    private ResourceLimit resourceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    public UpdateComponentRequestSpec withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 语言/运行时。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public UpdateComponentRequestSpec withSource(Source source) {
        this.source = source;
        return this;
    }

    public UpdateComponentRequestSpec withSource(Consumer<Source> sourceSetter) {
        if (this.source == null) {
            this.source = new Source();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public UpdateComponentRequestSpec withBuild(Build build) {
        this.build = build;
        return this;
    }

    public UpdateComponentRequestSpec withBuild(Consumer<Build> buildSetter) {
        if (this.build == null) {
            this.build = new Build();
            buildSetter.accept(this.build);
        }

        return this;
    }

    /**
     * Get build
     * @return build
     */
    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public UpdateComponentRequestSpec withResourceLimit(ResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
        return this;
    }

    public UpdateComponentRequestSpec withResourceLimit(Consumer<ResourceLimit> resourceLimitSetter) {
        if (this.resourceLimit == null) {
            this.resourceLimit = new ResourceLimit();
            resourceLimitSetter.accept(this.resourceLimit);
        }

        return this;
    }

    /**
     * Get resourceLimit
     * @return resourceLimit
     */
    public ResourceLimit getResourceLimit() {
        return resourceLimit;
    }

    public void setResourceLimit(ResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
    }

    public UpdateComponentRequestSpec withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * 实例个数。
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateComponentRequestSpec that = (UpdateComponentRequestSpec) obj;
        return Objects.equals(this.runtime, that.runtime) && Objects.equals(this.source, that.source)
            && Objects.equals(this.build, that.build) && Objects.equals(this.resourceLimit, that.resourceLimit)
            && Objects.equals(this.replica, that.replica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtime, source, build, resourceLimit, replica);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateComponentRequestSpec {\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    resourceLimit: ").append(toIndentedString(resourceLimit)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
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
