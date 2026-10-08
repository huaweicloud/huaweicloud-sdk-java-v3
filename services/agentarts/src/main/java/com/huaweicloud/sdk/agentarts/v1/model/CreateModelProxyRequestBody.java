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
 * **参数解释：** 创建模型代理的请求体。 **取值范围：** 不涉及。 
 */
public class CreateModelProxyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_model_provider_id")

    private UUID customModelProviderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：** 入站认证类型。 **约束限制：** 不涉及。 **取值范围：** - `iam`: 使用 IAM 认证 - `api_key`: 使用 API 密钥认证（必须携带 authorizer_configuration） **默认取值：** 不涉及。 
     */
    public static final class InboundAuthorizerTypeEnum {

        /**
         * Enum IAM for value: "iam"
         */
        public static final InboundAuthorizerTypeEnum IAM = new InboundAuthorizerTypeEnum("iam");

        /**
         * Enum API_KEY for value: "api_key"
         */
        public static final InboundAuthorizerTypeEnum API_KEY = new InboundAuthorizerTypeEnum("api_key");

        private static final Map<String, InboundAuthorizerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InboundAuthorizerTypeEnum> createStaticFields() {
            Map<String, InboundAuthorizerTypeEnum> map = new HashMap<>();
            map.put("iam", IAM);
            map.put("api_key", API_KEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InboundAuthorizerTypeEnum(String value) {
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
        public static InboundAuthorizerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InboundAuthorizerTypeEnum(value));
        }

        public static InboundAuthorizerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InboundAuthorizerTypeEnum) {
                return this.value.equals(((InboundAuthorizerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_authorizer_type")

    private InboundAuthorizerTypeEnum inboundAuthorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_authorizer_configuration")

    private CoreModelProxyAuthorizerConfiguration inboundAuthorizerConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreGatewayTagForRequest> tags = null;

    public CreateModelProxyRequestBody withCustomModelProviderId(UUID customModelProviderId) {
        this.customModelProviderId = customModelProviderId;
        return this;
    }

    /**
     * **参数解释：** 模型提供商ID。 **约束限制：** 不涉及。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值：** 不涉及。 
     * @return customModelProviderId
     */
    public UUID getCustomModelProviderId() {
        return customModelProviderId;
    }

    public void setCustomModelProviderId(UUID customModelProviderId) {
        this.customModelProviderId = customModelProviderId;
    }

    public CreateModelProxyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 模型代理名称。 **约束限制：** 账户下模型代理名称唯一（不区分大小写）。 **取值范围：** 长度为 2-40 个字符，匹配以小写字母开头、以小写字母或数字结尾、中间可包含0到38个小写字母、数字或连字符的字符串，符合正则条件^[a-z][a-z0-9-]{0,38}[a-z0-9]$。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateModelProxyRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 模型代理的详细描述。 **约束限制：** 不涉及。 **取值范围：** 长度为 0-1000 个字符。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateModelProxyRequestBody withInboundAuthorizerType(InboundAuthorizerTypeEnum inboundAuthorizerType) {
        this.inboundAuthorizerType = inboundAuthorizerType;
        return this;
    }

    /**
     * **参数解释：** 入站认证类型。 **约束限制：** 不涉及。 **取值范围：** - `iam`: 使用 IAM 认证 - `api_key`: 使用 API 密钥认证（必须携带 authorizer_configuration） **默认取值：** 不涉及。 
     * @return inboundAuthorizerType
     */
    public InboundAuthorizerTypeEnum getInboundAuthorizerType() {
        return inboundAuthorizerType;
    }

    public void setInboundAuthorizerType(InboundAuthorizerTypeEnum inboundAuthorizerType) {
        this.inboundAuthorizerType = inboundAuthorizerType;
    }

    public CreateModelProxyRequestBody withInboundAuthorizerConfiguration(
        CoreModelProxyAuthorizerConfiguration inboundAuthorizerConfiguration) {
        this.inboundAuthorizerConfiguration = inboundAuthorizerConfiguration;
        return this;
    }

    public CreateModelProxyRequestBody withInboundAuthorizerConfiguration(
        Consumer<CoreModelProxyAuthorizerConfiguration> inboundAuthorizerConfigurationSetter) {
        if (this.inboundAuthorizerConfiguration == null) {
            this.inboundAuthorizerConfiguration = new CoreModelProxyAuthorizerConfiguration();
            inboundAuthorizerConfigurationSetter.accept(this.inboundAuthorizerConfiguration);
        }

        return this;
    }

    /**
     * Get inboundAuthorizerConfiguration
     * @return inboundAuthorizerConfiguration
     */
    public CoreModelProxyAuthorizerConfiguration getInboundAuthorizerConfiguration() {
        return inboundAuthorizerConfiguration;
    }

    public void setInboundAuthorizerConfiguration(
        CoreModelProxyAuthorizerConfiguration inboundAuthorizerConfiguration) {
        this.inboundAuthorizerConfiguration = inboundAuthorizerConfiguration;
    }

    public CreateModelProxyRequestBody withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * **参数解释：** AgentGateway ID，关联底层 AgentGateway 实例。 **约束限制：** 不涉及。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值：** 不涉及。 
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public CreateModelProxyRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称，用于指定模型代理使用的委托身份。 **约束限制：** 不涉及。 **取值范围：** 长度为 1-64 个字符。 **默认取值：** 不涉及。 
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CreateModelProxyRequestBody withTags(List<CoreGatewayTagForRequest> tags) {
        this.tags = tags;
        return this;
    }

    public CreateModelProxyRequestBody addTagsItem(CoreGatewayTagForRequest tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateModelProxyRequestBody withTags(Consumer<List<CoreGatewayTagForRequest>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表。 **约束限制：** 不涉及。 **取值范围：** 数组长度为 0-20。 **默认取值：** 不涉及。 
     * @return tags
     */
    public List<CoreGatewayTagForRequest> getTags() {
        return tags;
    }

    public void setTags(List<CoreGatewayTagForRequest> tags) {
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
        CreateModelProxyRequestBody that = (CreateModelProxyRequestBody) obj;
        return Objects.equals(this.customModelProviderId, that.customModelProviderId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.inboundAuthorizerType, that.inboundAuthorizerType)
            && Objects.equals(this.inboundAuthorizerConfiguration, that.inboundAuthorizerConfiguration)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customModelProviderId,
            name,
            description,
            inboundAuthorizerType,
            inboundAuthorizerConfiguration,
            agentGatewayId,
            agencyName,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModelProxyRequestBody {\n");
        sb.append("    customModelProviderId: ").append(toIndentedString(customModelProviderId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    inboundAuthorizerType: ").append(toIndentedString(inboundAuthorizerType)).append("\n");
        sb.append("    inboundAuthorizerConfiguration: ")
            .append(toIndentedString(inboundAuthorizerConfiguration))
            .append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
