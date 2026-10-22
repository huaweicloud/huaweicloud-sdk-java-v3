package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：更新自定义镜像请求体。
 */
public class UpdateV2ImageVersionInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * Gets or Sets architectures
     */
    public static final class ArchitecturesEnum {

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final ArchitecturesEnum X86_64 = new ArchitecturesEnum("x86_64");

        /**
         * Enum AARCH64 for value: "aarch64"
         */
        public static final ArchitecturesEnum AARCH64 = new ArchitecturesEnum("aarch64");

        private static final Map<String, ArchitecturesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchitecturesEnum> createStaticFields() {
            Map<String, ArchitecturesEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("aarch64", AARCH64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchitecturesEnum(String value) {
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
        public static ArchitecturesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchitecturesEnum(value));
        }

        public static ArchitecturesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchitecturesEnum) {
                return this.value.equals(((ArchitecturesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architectures")

    private List<ArchitecturesEnum> architectures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private V2ImageVersionType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_softwares")

    private List<ContainerSoftware> containerSoftwares = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private V2ImageCategory category;

    public UpdateV2ImageVersionInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：自定义镜像的描述。 **约束限制**：不涉及。 **取值范围**：不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号、艾特符、井号、百分号、分号、左括号、右括号、竖线、星号、反斜杠。长度为0~2000个字符。 **默认取值**：不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateV2ImageVersionInput withArchitectures(List<ArchitecturesEnum> architectures) {
        this.architectures = architectures;
        return this;
    }

    public UpdateV2ImageVersionInput addArchitecturesItem(ArchitecturesEnum architecturesItem) {
        if (this.architectures == null) {
            this.architectures = new ArrayList<>();
        }
        this.architectures.add(architecturesItem);
        return this;
    }

    public UpdateV2ImageVersionInput withArchitectures(Consumer<List<ArchitecturesEnum>> architecturesSetter) {
        if (this.architectures == null) {
            this.architectures = new ArrayList<>();
        }
        architecturesSetter.accept(this.architectures);
        return this;
    }

    /**
     * **参数解释**：支持镜像架构列表，取值包括：x86_64（x86架构）、aarch64（ARM架构），未传入该参数时默认为x86_64。 **约束限制**：不涉及。
     * @return architectures
     */
    public List<ArchitecturesEnum> getArchitectures() {
        return architectures;
    }

    public void setArchitectures(List<ArchitecturesEnum> architectures) {
        this.architectures = architectures;
    }

    public UpdateV2ImageVersionInput withType(V2ImageVersionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public V2ImageVersionType getType() {
        return type;
    }

    public void setType(V2ImageVersionType type) {
        this.type = type;
    }

    public UpdateV2ImageVersionInput withContainerSoftwares(List<ContainerSoftware> containerSoftwares) {
        this.containerSoftwares = containerSoftwares;
        return this;
    }

    public UpdateV2ImageVersionInput addContainerSoftwaresItem(ContainerSoftware containerSoftwaresItem) {
        if (this.containerSoftwares == null) {
            this.containerSoftwares = new ArrayList<>();
        }
        this.containerSoftwares.add(containerSoftwaresItem);
        return this;
    }

    public UpdateV2ImageVersionInput withContainerSoftwares(
        Consumer<List<ContainerSoftware>> containerSoftwaresSetter) {
        if (this.containerSoftwares == null) {
            this.containerSoftwares = new ArrayList<>();
        }
        containerSoftwaresSetter.accept(this.containerSoftwares);
        return this;
    }

    /**
     * **参数解释**：自定义镜像包含的软件列表，每个元素为一个ContainerSoftware对象，包含软件名称和版本信息，软件列表最小个数为0，最大个数为100。 **约束限制**：不涉及。
     * @return containerSoftwares
     */
    public List<ContainerSoftware> getContainerSoftwares() {
        return containerSoftwares;
    }

    public void setContainerSoftwares(List<ContainerSoftware> containerSoftwares) {
        this.containerSoftwares = containerSoftwares;
    }

    public UpdateV2ImageVersionInput withCategory(V2ImageCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public V2ImageCategory getCategory() {
        return category;
    }

    public void setCategory(V2ImageCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateV2ImageVersionInput that = (UpdateV2ImageVersionInput) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.architectures, that.architectures) && Objects.equals(this.type, that.type)
            && Objects.equals(this.containerSoftwares, that.containerSoftwares)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, architectures, type, containerSoftwares, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateV2ImageVersionInput {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    containerSoftwares: ").append(toIndentedString(containerSoftwares)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
