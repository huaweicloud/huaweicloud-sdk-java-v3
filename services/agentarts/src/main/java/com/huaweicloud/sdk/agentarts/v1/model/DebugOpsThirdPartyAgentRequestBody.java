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
 * **参数解释：** 调试三方托管智能体或智能体运行时的请求体，包含调用配置信息和测试变量。agent_id从URL路径传入。type字段用于区分调试对象类型：third_party_agent（三方托管智能体）或agent_runtime（智能体运行时）。三方智能体的身份信息（ID、名称）从可观测服务获取，调用参数由评估服务管理。调试成功后配置自动保存至数据库并记录调试状态。 **约束限制：** type为third_party_agent时，auth_config必填；type为agent_runtime时，auth_config不填（平台内部调用无需鉴权）。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class DebugOpsThirdPartyAgentRequestBody {

    /**
     * **参数解释：** 调试对象类型，用于区分三方托管智能体和智能体运行时。 **约束限制：** 必须为枚举值之一。 **取值范围：** - third_party_agent：三方托管智能体，需配置auth_config - agent_runtime：智能体运行时，平台内部调用无需auth_config **默认取值：** 不涉及。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private String runtimeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_config")

    private OpsThirdPartyAgentApiConfig apiConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config")

    private OpsThirdPartyAgentAuthConfig authConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_config")

    private OpsThirdPartyAgentResponseConfig responseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private Map<String, String> variables = null;

    public DebugOpsThirdPartyAgentRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 调试对象类型，用于区分三方托管智能体和智能体运行时。 **约束限制：** 必须为枚举值之一。 **取值范围：** - third_party_agent：三方托管智能体，需配置auth_config - agent_runtime：智能体运行时，平台内部调用无需auth_config **默认取值：** 不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DebugOpsThirdPartyAgentRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 智能体的描述信息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DebugOpsThirdPartyAgentRequestBody withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * **参数解释：** 三方智能体的名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public DebugOpsThirdPartyAgentRequestBody withRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * **参数解释：** 智能体运行时ID，type为agent_runtime时必填。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return runtimeId
     */
    public String getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
    }

    public DebugOpsThirdPartyAgentRequestBody withApiConfig(OpsThirdPartyAgentApiConfig apiConfig) {
        this.apiConfig = apiConfig;
        return this;
    }

    public DebugOpsThirdPartyAgentRequestBody withApiConfig(Consumer<OpsThirdPartyAgentApiConfig> apiConfigSetter) {
        if (this.apiConfig == null) {
            this.apiConfig = new OpsThirdPartyAgentApiConfig();
            apiConfigSetter.accept(this.apiConfig);
        }

        return this;
    }

    /**
     * Get apiConfig
     * @return apiConfig
     */
    public OpsThirdPartyAgentApiConfig getApiConfig() {
        return apiConfig;
    }

    public void setApiConfig(OpsThirdPartyAgentApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }

    public DebugOpsThirdPartyAgentRequestBody withAuthConfig(OpsThirdPartyAgentAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    public DebugOpsThirdPartyAgentRequestBody withAuthConfig(Consumer<OpsThirdPartyAgentAuthConfig> authConfigSetter) {
        if (this.authConfig == null) {
            this.authConfig = new OpsThirdPartyAgentAuthConfig();
            authConfigSetter.accept(this.authConfig);
        }

        return this;
    }

    /**
     * Get authConfig
     * @return authConfig
     */
    public OpsThirdPartyAgentAuthConfig getAuthConfig() {
        return authConfig;
    }

    public void setAuthConfig(OpsThirdPartyAgentAuthConfig authConfig) {
        this.authConfig = authConfig;
    }

    public DebugOpsThirdPartyAgentRequestBody withResponseConfig(OpsThirdPartyAgentResponseConfig responseConfig) {
        this.responseConfig = responseConfig;
        return this;
    }

    public DebugOpsThirdPartyAgentRequestBody withResponseConfig(
        Consumer<OpsThirdPartyAgentResponseConfig> responseConfigSetter) {
        if (this.responseConfig == null) {
            this.responseConfig = new OpsThirdPartyAgentResponseConfig();
            responseConfigSetter.accept(this.responseConfig);
        }

        return this;
    }

    /**
     * Get responseConfig
     * @return responseConfig
     */
    public OpsThirdPartyAgentResponseConfig getResponseConfig() {
        return responseConfig;
    }

    public void setResponseConfig(OpsThirdPartyAgentResponseConfig responseConfig) {
        this.responseConfig = responseConfig;
    }

    public DebugOpsThirdPartyAgentRequestBody withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * **参数解释：** 单次调用超时时间（秒）。 **约束限制：** 整数类型，范围5到600。 **取值范围：** 5-600。 **默认取值：** 60。
     * minimum: 5
     * maximum: 600
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public DebugOpsThirdPartyAgentRequestBody withVariables(Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    public DebugOpsThirdPartyAgentRequestBody putVariablesItem(String key, String variablesItem) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variablesItem);
        return this;
    }

    public DebugOpsThirdPartyAgentRequestBody withVariables(Consumer<Map<String, String>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * **参数解释：** 自定义变量键值对，将替换API配置中的{{变量名}}占位符。例如API配置Body中使用{{input}}，则variables中传入input变量即可。 **约束限制：** 键和值均为字符串类型，最多支持20个变量。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return variables
     */
    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugOpsThirdPartyAgentRequestBody that = (DebugOpsThirdPartyAgentRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.agentName, that.agentName) && Objects.equals(this.runtimeId, that.runtimeId)
            && Objects.equals(this.apiConfig, that.apiConfig) && Objects.equals(this.authConfig, that.authConfig)
            && Objects.equals(this.responseConfig, that.responseConfig) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.variables, that.variables);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, description, agentName, runtimeId, apiConfig, authConfig, responseConfig, timeout, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugOpsThirdPartyAgentRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
        sb.append("    apiConfig: ").append(toIndentedString(apiConfig)).append("\n");
        sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
        sb.append("    responseConfig: ").append(toIndentedString(responseConfig)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
