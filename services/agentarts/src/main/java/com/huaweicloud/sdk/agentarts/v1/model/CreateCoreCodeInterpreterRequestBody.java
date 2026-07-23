package com.huaweicloud.sdk.agentarts.v1.model;

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
import java.util.UUID;
import java.util.function.Consumer;

/**
 * 代码解释器请求体。
 */
public class CreateCoreCodeInterpreterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：** 工具认证方式。 **约束限制：** 不涉及。 **取值范围：** `API_KEY`: 使用 API 密钥认证。 `IAM`: 使用 IAM认证。 **默认取值：** IAM。
     */
    public static final class AuthTypeEnum {

        /**
         * Enum API_KEY for value: "API_KEY"
         */
        public static final AuthTypeEnum API_KEY = new AuthTypeEnum("API_KEY");

        /**
         * Enum IAM for value: "IAM"
         */
        public static final AuthTypeEnum IAM = new AuthTypeEnum("IAM");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("API_KEY", API_KEY);
            map.put("IAM", IAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key_name")

    private String apiKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_agency_name")

    private String executionAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observability")

    private CoreToolsObservability observability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_config")

    private CoreToolsOutboundNetwork networkConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreToolsTag> tags = null;

    public CreateCoreCodeInterpreterRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 代码解释器的名称。 **约束限制：** 该名称在您的账户中必须是唯一的。 **取值范围：** 符合正则条件^[a-z][a-z0-9-]{0,38}[a-z0-9]$，即必须以小写字母开头，小写字母或数字结尾，中间可包含数字、小写字母、中划线，字符长度必须在2-40个字符之间。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreCodeInterpreterRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 代码解释器的描述。 **约束限制：** 不涉及。 **取值范围：** 任意字符（包括中文、英文字母、数字、特殊字符等），长度不能超过4096个字符。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCoreCodeInterpreterRequestBody withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释：** 工具认证方式。 **约束限制：** 不涉及。 **取值范围：** `API_KEY`: 使用 API 密钥认证。 `IAM`: 使用 IAM认证。 **默认取值：** IAM。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public CreateCoreCodeInterpreterRequestBody withApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }

    /**
     * **参数解释：** API Key名称。 **约束限制：** 不涉及。 **取值范围：** 满足正则^[a-zA-Z0-9_-]{1,64}$，即只能包含数字、字母、下划线、中划线，且长度必须在1-64个字符之间。 **默认取值：** 不涉及。
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return apiKeyName;
    }

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    public CreateCoreCodeInterpreterRequestBody withExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
        return this;
    }

    /**
     * **参数解释：** 为代码解释器提供访问云服务的权限的IAM委托名，获取方式请参见[创建委托](https://support.huaweicloud.com/usermanual-iam/iam_06_0001.html)。 **约束限制：** 必须是IAM已创建委托。 **取值范围：** IAM委托名长度必须在1-64个字符之间，字符规则以IAM服务校验规则为准。 **默认取值：** 不涉及。
     * @return executionAgencyName
     */
    public String getExecutionAgencyName() {
        return executionAgencyName;
    }

    public void setExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
    }

    public CreateCoreCodeInterpreterRequestBody withObservability(CoreToolsObservability observability) {
        this.observability = observability;
        return this;
    }

    public CreateCoreCodeInterpreterRequestBody withObservability(
        Consumer<CoreToolsObservability> observabilitySetter) {
        if (this.observability == null) {
            this.observability = new CoreToolsObservability();
            observabilitySetter.accept(this.observability);
        }

        return this;
    }

    /**
     * Get observability
     * @return observability
     */
    public CoreToolsObservability getObservability() {
        return observability;
    }

    public void setObservability(CoreToolsObservability observability) {
        this.observability = observability;
    }

    public CreateCoreCodeInterpreterRequestBody withNetworkConfig(CoreToolsOutboundNetwork networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    public CreateCoreCodeInterpreterRequestBody withNetworkConfig(
        Consumer<CoreToolsOutboundNetwork> networkConfigSetter) {
        if (this.networkConfig == null) {
            this.networkConfig = new CoreToolsOutboundNetwork();
            networkConfigSetter.accept(this.networkConfig);
        }

        return this;
    }

    /**
     * Get networkConfig
     * @return networkConfig
     */
    public CoreToolsOutboundNetwork getNetworkConfig() {
        return networkConfig;
    }

    public void setNetworkConfig(CoreToolsOutboundNetwork networkConfig) {
        this.networkConfig = networkConfig;
    }

    public CreateCoreCodeInterpreterRequestBody withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * **参数解释：** 代码解释器入口的AgentGateway的ID。 **约束限制：** 必须为已存在AgentGateway的ID，或者缺省为空，使用租户默认AgentGateway接入。 **取值范围：** 从AgentGateway实例获取，或默认不填。 **默认取值：** 不涉及。
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public CreateCoreCodeInterpreterRequestBody withTags(List<CoreToolsTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreCodeInterpreterRequestBody addTagsItem(CoreToolsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreCodeInterpreterRequestBody withTags(Consumer<List<CoreToolsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签。 **约束限制：** 同一个资源的标签key不能重复、标签列表最多支持20个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tags
     */
    public List<CoreToolsTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreToolsTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreCodeInterpreterRequestBody that = (CreateCoreCodeInterpreterRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.apiKeyName, that.apiKeyName)
            && Objects.equals(this.executionAgencyName, that.executionAgencyName)
            && Objects.equals(this.observability, that.observability)
            && Objects.equals(this.networkConfig, that.networkConfig)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            authType,
            apiKeyName,
            executionAgencyName,
            observability,
            networkConfig,
            agentGatewayId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreCodeInterpreterRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
        sb.append("    executionAgencyName: ").append(toIndentedString(executionAgencyName)).append("\n");
        sb.append("    observability: ").append(toIndentedString(observability)).append("\n");
        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
