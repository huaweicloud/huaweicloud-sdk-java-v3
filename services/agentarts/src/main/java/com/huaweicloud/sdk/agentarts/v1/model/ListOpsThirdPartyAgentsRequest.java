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
 * Request Object
 */
public class ListOpsThirdPartyAgentsRequest {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum THIRD_PARTY_AGENT for value: "third_party_agent"
         */
        public static final TypeEnum THIRD_PARTY_AGENT = new TypeEnum("third_party_agent");

        /**
         * Enum AGENT_RUNTIME for value: "agent_runtime"
         */
        public static final TypeEnum AGENT_RUNTIME = new TypeEnum("agent_runtime");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("third_party_agent", THIRD_PARTY_AGENT);
            map.put("agent_runtime", AGENT_RUNTIME);
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

    /**
     * Gets or Sets agentType
     */
    public static final class AgentTypeEnum {

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final AgentTypeEnum WORKFLOW = new AgentTypeEnum("workflow");

        /**
         * Enum AGENT for value: "agent"
         */
        public static final AgentTypeEnum AGENT = new AgentTypeEnum("agent");

        /**
         * Enum MULTIAGENTS for value: "multiagents"
         */
        public static final AgentTypeEnum MULTIAGENTS = new AgentTypeEnum("multiagents");

        private static final Map<String, AgentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentTypeEnum> createStaticFields() {
            Map<String, AgentTypeEnum> map = new HashMap<>();
            map.put("workflow", WORKFLOW);
            map.put("agent", AGENT);
            map.put("multiagents", MULTIAGENTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentTypeEnum(String value) {
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
        public static AgentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentTypeEnum(value));
        }

        public static AgentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentTypeEnum) {
                return this.value.equals(((AgentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private AgentTypeEnum agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    public ListOpsThirdPartyAgentsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListOpsThirdPartyAgentsRequest withAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * Get agentType
     * @return agentType
     */
    public AgentTypeEnum getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
    }

    public ListOpsThirdPartyAgentsRequest withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * Get agentName
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsThirdPartyAgentsRequest that = (ListOpsThirdPartyAgentsRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.agentType, that.agentType)
            && Objects.equals(this.agentName, that.agentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, agentType, agentName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsThirdPartyAgentsRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
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
