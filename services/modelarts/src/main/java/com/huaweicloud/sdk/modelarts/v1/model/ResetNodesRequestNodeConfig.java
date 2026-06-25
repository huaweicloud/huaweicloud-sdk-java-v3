package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：节点配置参数。 **约束限制**：该参数待下线。超节点禁传此参数，非超节点亦不推荐传递此参数。重置配置参数会从节点所在的nodepool自动取值， 若需要重置时修改某参数， 可先修改nodepool相关参数， 再进行重置。
 */
public class ResetNodesRequestNodeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageId")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageType")

    private String imageType;

    /**
     * **参数解释**：节点的容器运行时。 **约束限制**：不涉及。 **取值范围**：只能是[docker, containerd]其中一个。
     */
    public static final class RuntimeEnum {

        /**
         * Enum DOCKER for value: "docker"
         */
        public static final RuntimeEnum DOCKER = new RuntimeEnum("docker");

        /**
         * Enum CONTAINERD for value: "containerd"
         */
        public static final RuntimeEnum CONTAINERD = new RuntimeEnum("containerd");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("docker", DOCKER);
            map.put("containerd", CONTAINERD);
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

    public ResetNodesRequestNodeConfig withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * **参数解释**：节点的镜像名称，如果不设置则取name字段的值 **约束限制**：不涉及。
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public ResetNodesRequestNodeConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：节点的镜像名称，如果os字段不设置才取此字段的值。 **约束限制**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResetNodesRequestNodeConfig withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：节点的镜像ID。 **约束限制**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ResetNodesRequestNodeConfig withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**：节点的镜像类型。 **约束限制**：不涉及。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ResetNodesRequestNodeConfig withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * **参数解释**：节点的容器运行时。 **约束限制**：不涉及。 **取值范围**：只能是[docker, containerd]其中一个。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetNodesRequestNodeConfig that = (ResetNodesRequestNodeConfig) obj;
        return Objects.equals(this.os, that.os) && Objects.equals(this.name, that.name)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.runtime, that.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os, name, imageId, imageType, runtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetNodesRequestNodeConfig {\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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
