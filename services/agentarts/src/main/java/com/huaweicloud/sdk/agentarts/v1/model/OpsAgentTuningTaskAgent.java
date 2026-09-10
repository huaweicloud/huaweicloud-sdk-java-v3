package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 智能体优化任务目标。
 */
public class OpsAgentTuningTaskAgent {

    /**
     * **参数解释：** 智能体类型。  **约束限制：** 不涉及  **取值范围：** agent：单智能体，workflow：工作流，agentrun：部署在运行时的智能体，third_party：三方接入观测的智能体。  **默认取值：** 无
     */
    public static final class TypeEnum {

        /**
         * Enum AGENT for value: "agent"
         */
        public static final TypeEnum AGENT = new TypeEnum("agent");

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final TypeEnum WORKFLOW = new TypeEnum("workflow");

        /**
         * Enum AGENTRUN for value: "agentrun"
         */
        public static final TypeEnum AGENTRUN = new TypeEnum("agentrun");

        /**
         * Enum THIRD_PARTY for value: "third_party"
         */
        public static final TypeEnum THIRD_PARTY = new TypeEnum("third_party");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("agent", AGENT);
            map.put("workflow", WORKFLOW);
            map.put("agentrun", AGENTRUN);
            map.put("third_party", THIRD_PARTY);
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
    @JsonProperty(value = "id")

    private String id;

    public OpsAgentTuningTaskAgent withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 智能体类型。  **约束限制：** 不涉及  **取值范围：** agent：单智能体，workflow：工作流，agentrun：部署在运行时的智能体，third_party：三方接入观测的智能体。  **默认取值：** 无
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OpsAgentTuningTaskAgent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 智能体ID，对应AgentArts平台中的智能体实例。 可在AgentArts平台“智能体管理”页面获取ID，注意对应的智能体需要是“已提交”状态。  **约束限制：** 必须是系统中存在的真实ID。  **取值范围：** 有效标识符字符串。  **默认取值：** 无
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsAgentTuningTaskAgent that = (OpsAgentTuningTaskAgent) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsAgentTuningTaskAgent {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
