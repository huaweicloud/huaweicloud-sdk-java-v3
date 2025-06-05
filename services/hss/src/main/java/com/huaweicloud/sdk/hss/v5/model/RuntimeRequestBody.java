package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RuntimeRequestBody
 */
public class RuntimeRequestBody {

    /**
     * 运行时名称：   - crio_endpoint：CRIO   - containerd_endpoint：Containerd   - docker_endpoint：Docker   - isulad_endpoint：Isulad   - podman_endpoint：Podman 
     */
    public static final class RuntimeNameEnum {

        /**
         * Enum CRIO_ENDPOINT for value: "crio_endpoint"
         */
        public static final RuntimeNameEnum CRIO_ENDPOINT = new RuntimeNameEnum("crio_endpoint");

        /**
         * Enum CONTAINERD_ENDPOINT for value: "containerd_endpoint"
         */
        public static final RuntimeNameEnum CONTAINERD_ENDPOINT = new RuntimeNameEnum("containerd_endpoint");

        /**
         * Enum DOCKER_ENDPOINT for value: "docker_endpoint"
         */
        public static final RuntimeNameEnum DOCKER_ENDPOINT = new RuntimeNameEnum("docker_endpoint");

        /**
         * Enum ISULAD_ENDPOINT for value: "isulad_endpoint"
         */
        public static final RuntimeNameEnum ISULAD_ENDPOINT = new RuntimeNameEnum("isulad_endpoint");

        /**
         * Enum PODMAN_ENDPOINT for value: "podman_endpoint"
         */
        public static final RuntimeNameEnum PODMAN_ENDPOINT = new RuntimeNameEnum("podman_endpoint");

        private static final Map<String, RuntimeNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeNameEnum> createStaticFields() {
            Map<String, RuntimeNameEnum> map = new HashMap<>();
            map.put("crio_endpoint", CRIO_ENDPOINT);
            map.put("containerd_endpoint", CONTAINERD_ENDPOINT);
            map.put("docker_endpoint", DOCKER_ENDPOINT);
            map.put("isulad_endpoint", ISULAD_ENDPOINT);
            map.put("podman_endpoint", PODMAN_ENDPOINT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuntimeNameEnum(String value) {
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
        public static RuntimeNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuntimeNameEnum(value));
        }

        public static RuntimeNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuntimeNameEnum) {
                return this.value.equals(((RuntimeNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_name")

    private RuntimeNameEnum runtimeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_path")

    private String runtimePath;

    public RuntimeRequestBody withRuntimeName(RuntimeNameEnum runtimeName) {
        this.runtimeName = runtimeName;
        return this;
    }

    /**
     * 运行时名称：   - crio_endpoint：CRIO   - containerd_endpoint：Containerd   - docker_endpoint：Docker   - isulad_endpoint：Isulad   - podman_endpoint：Podman 
     * @return runtimeName
     */
    public RuntimeNameEnum getRuntimeName() {
        return runtimeName;
    }

    public void setRuntimeName(RuntimeNameEnum runtimeName) {
        this.runtimeName = runtimeName;
    }

    public RuntimeRequestBody withRuntimePath(String runtimePath) {
        this.runtimePath = runtimePath;
        return this;
    }

    /**
     * 运行时路径
     * @return runtimePath
     */
    public String getRuntimePath() {
        return runtimePath;
    }

    public void setRuntimePath(String runtimePath) {
        this.runtimePath = runtimePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeRequestBody that = (RuntimeRequestBody) obj;
        return Objects.equals(this.runtimeName, that.runtimeName) && Objects.equals(this.runtimePath, that.runtimePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeName, runtimePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeRequestBody {\n");
        sb.append("    runtimeName: ").append(toIndentedString(runtimeName)).append("\n");
        sb.append("    runtimePath: ").append(toIndentedString(runtimePath)).append("\n");
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
