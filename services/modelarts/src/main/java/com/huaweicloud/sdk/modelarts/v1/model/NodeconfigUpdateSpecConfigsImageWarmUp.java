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
 * NodeconfigUpdateSpecConfigsImageWarmUp
 */
public class NodeconfigUpdateSpecConfigsImageWarmUp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    /**
     * **参数解释**：镜像类型。 **约束限制**：必填。指定镜像的来源类型。 **取值范围**：可选值如下： - SWR：华为云容器镜像服务。 **默认取值**：不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum SWR for value: "SWR"
         */
        public static final TypeEnum SWR = new TypeEnum("SWR");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SWR", SWR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    public NodeconfigUpdateSpecConfigsImageWarmUp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务ID。 **约束限制**：选填。新增任务时无需填写，系统自动生成；格式为image-warm-up-task-<uuid>。删除已有任务时必须填写，通过id标识区分。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeconfigUpdateSpecConfigsImageWarmUp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务名称。 **约束限制**：必填。由4~32位小写字母、数字或\"-\"组成，以字母开头、以字母或数字结尾；同一请求内任务名称不可重复。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeconfigUpdateSpecConfigsImageWarmUp withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务的创建时间。 **约束限制**：选填。新增任务时无需填写，系统自动填充为当前时间。 **取值范围**：RFC3339格式时间，例如2026-08-14T19:53:27+08:00。 **默认取值**：不涉及。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public NodeconfigUpdateSpecConfigsImageWarmUp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：镜像类型。 **约束限制**：必填。指定镜像的来源类型。 **取值范围**：可选值如下： - SWR：华为云容器镜像服务。 **默认取值**：不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public NodeconfigUpdateSpecConfigsImageWarmUp withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * **参数解释**：需要预热的镜像地址，例如swr.xxx.com/namespace/repository:v1.0。 **约束限制**：必填。同一请求内镜像地址不可重复。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigUpdateSpecConfigsImageWarmUp that = (NodeconfigUpdateSpecConfigsImageWarmUp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp) && Objects.equals(this.type, that.type)
            && Objects.equals(this.image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creationTimestamp, type, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigUpdateSpecConfigsImageWarmUp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
