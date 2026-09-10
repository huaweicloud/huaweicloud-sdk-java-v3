package com.huaweicloud.sdk.agentarts.v1.model;

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
 * **参数解释：** 评估对象（智能体/工作流）的配置信息，用于场景2（agent）和场景3（trace）中指定被评估的智能体。 **约束限制：** id、type、name、version为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsFineGrainedEvaluationObjectConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * **参数解释：** 评估对象的类型。 **约束限制：** 必须为枚举值之一。 **取值范围：** WORKFLOW, AGENT, MULTI_AGENT。 **默认取值：** 不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum WORKFLOW for value: "WORKFLOW"
         */
        public static final TypeEnum WORKFLOW = new TypeEnum("WORKFLOW");

        /**
         * Enum AGENT for value: "AGENT"
         */
        public static final TypeEnum AGENT = new TypeEnum("AGENT");

        /**
         * Enum MULTI_AGENT for value: "MULTI_AGENT"
         */
        public static final TypeEnum MULTI_AGENT = new TypeEnum("MULTI_AGENT");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("WORKFLOW", WORKFLOW);
            map.put("AGENT", AGENT);
            map.put("MULTI_AGENT", MULTI_AGENT);
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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs_mapping")

    private OpsFineGrainedEvaluationObjectConfigInputsMapping inputsMapping;

    public OpsFineGrainedEvaluationObjectConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 评估对象的唯一标识符。 **约束限制：** 字符长度1到36。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsFineGrainedEvaluationObjectConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 评估对象的类型。 **约束限制：** 必须为枚举值之一。 **取值范围：** WORKFLOW, AGENT, MULTI_AGENT。 **默认取值：** 不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OpsFineGrainedEvaluationObjectConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评估对象的名称。 **约束限制：** 字符长度1到100。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsFineGrainedEvaluationObjectConfig withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 评估对象的版本号。 **约束限制：** 字符长度1到100。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OpsFineGrainedEvaluationObjectConfig withInputsMapping(
        OpsFineGrainedEvaluationObjectConfigInputsMapping inputsMapping) {
        this.inputsMapping = inputsMapping;
        return this;
    }

    public OpsFineGrainedEvaluationObjectConfig withInputsMapping(
        Consumer<OpsFineGrainedEvaluationObjectConfigInputsMapping> inputsMappingSetter) {
        if (this.inputsMapping == null) {
            this.inputsMapping = new OpsFineGrainedEvaluationObjectConfigInputsMapping();
            inputsMappingSetter.accept(this.inputsMapping);
        }

        return this;
    }

    /**
     * Get inputsMapping
     * @return inputsMapping
     */
    public OpsFineGrainedEvaluationObjectConfigInputsMapping getInputsMapping() {
        return inputsMapping;
    }

    public void setInputsMapping(OpsFineGrainedEvaluationObjectConfigInputsMapping inputsMapping) {
        this.inputsMapping = inputsMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFineGrainedEvaluationObjectConfig that = (OpsFineGrainedEvaluationObjectConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.inputsMapping, that.inputsMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, version, inputsMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFineGrainedEvaluationObjectConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    inputsMapping: ").append(toIndentedString(inputsMapping)).append("\n");
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
