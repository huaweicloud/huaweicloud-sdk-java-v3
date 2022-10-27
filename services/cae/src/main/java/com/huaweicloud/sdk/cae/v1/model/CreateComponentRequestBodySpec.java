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
 * 组件规格信息。
 */
public class CreateComponentRequestBodySpec {

    /**
     * 语言/运行时，例如：Java8、tomcat8。
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
         * Enum PHP7 for value: "Php7"
         */
        public static final RuntimeEnum PHP7 = new RuntimeEnum("Php7");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Docker", DOCKER);
            map.put("Java8", JAVA8);
            map.put("Java11", JAVA11);
            map.put("Tomcat8", TOMCAT8);
            map.put("Tomcat9", TOMCAT9);
            map.put("Python3", PYTHON3);
            map.put("Nodejs8", NODEJS8);
            map.put("Php7", PHP7);
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
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private Build build;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Source source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_limit")

    private ResourceLimit resourceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    public CreateComponentRequestBodySpec withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 语言/运行时，例如：Java8、tomcat8。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public CreateComponentRequestBodySpec withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * 副本数目。
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public CreateComponentRequestBodySpec withBuild(Build build) {
        this.build = build;
        return this;
    }

    public CreateComponentRequestBodySpec withBuild(Consumer<Build> buildSetter) {
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

    public CreateComponentRequestBodySpec withSource(Source source) {
        this.source = source;
        return this;
    }

    public CreateComponentRequestBodySpec withSource(Consumer<Source> sourceSetter) {
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

    public CreateComponentRequestBodySpec withResourceLimit(ResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
        return this;
    }

    public CreateComponentRequestBodySpec withResourceLimit(Consumer<ResourceLimit> resourceLimitSetter) {
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

    public CreateComponentRequestBodySpec withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 镜像地址。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateComponentRequestBodySpec createComponentRequestBodySpec = (CreateComponentRequestBodySpec) o;
        return Objects.equals(this.runtime, createComponentRequestBodySpec.runtime)
            && Objects.equals(this.replica, createComponentRequestBodySpec.replica)
            && Objects.equals(this.build, createComponentRequestBodySpec.build)
            && Objects.equals(this.source, createComponentRequestBodySpec.source)
            && Objects.equals(this.resourceLimit, createComponentRequestBodySpec.resourceLimit)
            && Objects.equals(this.imageUrl, createComponentRequestBodySpec.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtime, replica, build, source, resourceLimit, imageUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComponentRequestBodySpec {\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    resourceLimit: ").append(toIndentedString(resourceLimit)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
