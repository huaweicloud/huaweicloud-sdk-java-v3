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
 * 模型优化任务目标。
 */
public class OpsTuningTargetAgent {

    /**
     * **参数解释：** 智能体类型，区分优化目标是单智能体还是工作流。  **约束限制：** 不涉及  **取值范围：** 单智能体agent，工作流workflow。  **默认取值：** 无
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

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("agent", AGENT);
            map.put("workflow", WORKFLOW);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * **参数解释：** 工作流节点类型，仅当type为workflow时有效，指定优化工作流中的哪类节点。  **约束限制：** 仅当type为workflow时生效。  **取值范围：** 意图识别intent_detection，大模型llm。  **默认取值：** 无
     */
    public static final class NodeTypeEnum {

        /**
         * Enum INTENT_DETECTION for value: "intent_detection"
         */
        public static final NodeTypeEnum INTENT_DETECTION = new NodeTypeEnum("intent_detection");

        /**
         * Enum LLM for value: "llm"
         */
        public static final NodeTypeEnum LLM = new NodeTypeEnum("llm");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("intent_detection", INTENT_DETECTION);
            map.put("llm", LLM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeTypeEnum(String value) {
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
        public static NodeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeTypeEnum(value));
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeTypeEnum) {
                return this.value.equals(((NodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private NodeTypeEnum nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public OpsTuningTargetAgent withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 智能体类型，区分优化目标是单智能体还是工作流。  **约束限制：** 不涉及  **取值范围：** 单智能体agent，工作流workflow。  **默认取值：** 无
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OpsTuningTargetAgent withId(String id) {
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

    public OpsTuningTargetAgent withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 智能体版本。  **约束限制：** 不涉及  **取值范围：** 版本号字符串。  **默认取值：** latest
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OpsTuningTargetAgent withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * **参数解释：** 工作流节点类型，仅当type为workflow时有效，指定优化工作流中的哪类节点。  **约束限制：** 仅当type为workflow时生效。  **取值范围：** 意图识别intent_detection，大模型llm。  **默认取值：** 无
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public OpsTuningTargetAgent withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释：** 工作流节点ID，对应工作流中特定节点的唯一标识。 可在AgentArts平台“智能体管理”页面获取ID，注意对应的工作流需要是“已提交”状态。  **约束限制：** 仅当type为workflow时生效。  **取值范围：** 有效节点标识符字符串。  **默认取值：** 无
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningTargetAgent that = (OpsTuningTargetAgent) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.id, that.id)
            && Objects.equals(this.version, that.version) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, version, nodeType, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningTargetAgent {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
