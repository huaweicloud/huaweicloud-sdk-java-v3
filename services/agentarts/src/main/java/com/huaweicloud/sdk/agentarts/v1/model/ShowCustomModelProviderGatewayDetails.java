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
 * **参数解释：** 模型提供商列表。 **取值范围：** 数组长度为 0-100。 
 */
public class ShowCustomModelProviderGatewayDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_url")

    private String endpointUrl;

    /**
     * **参数解释：** 入站认证类型。 **取值范围：** - `iam`: 使用 IAM 认证 - `api_key`: 使用 API 密钥认证 
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
    @JsonProperty(value = "workload_identity_urn")

    private String workloadIdentityUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_delivery_configuration")

    private CoreGatewayLogDeliveryConfiguration logDeliveryConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreGatewayTag> tags = null;

    public ShowCustomModelProviderGatewayDetails withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 网关的唯一标识符。 网关ID获取方式： 1. 进入AgentArts平台，在左侧导航栏选择“托管与运行 > 网关”，进入网关界面。 2. 在网关列表中“网关名称/ID”处复制网关ID即可。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ShowCustomModelProviderGatewayDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 网关名称。 **取值范围：** 长度为 2-40 个字符，匹配以小写字母开头、以小写字母或数字结尾、中间可包含0到38个小写字母、数字或连字符的字符串，符合正则条件^[a-z][a-z0-9-]{0,38}[a-z0-9]$。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCustomModelProviderGatewayDetails withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * **参数解释：** 访问网关的 URL 端点。 **取值范围：** 长度为 1-512 个字符。 - 示例：https://gateway-fo2ao8pg-beta1-gw-gu2geoldgz.cn-southwest-301.huaweicloud-agentarts.com 
     * @return endpointUrl
     */
    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public ShowCustomModelProviderGatewayDetails withInboundAuthorizerType(
        InboundAuthorizerTypeEnum inboundAuthorizerType) {
        this.inboundAuthorizerType = inboundAuthorizerType;
        return this;
    }

    /**
     * **参数解释：** 入站认证类型。 **取值范围：** - `iam`: 使用 IAM 认证 - `api_key`: 使用 API 密钥认证 
     * @return inboundAuthorizerType
     */
    public InboundAuthorizerTypeEnum getInboundAuthorizerType() {
        return inboundAuthorizerType;
    }

    public void setInboundAuthorizerType(InboundAuthorizerTypeEnum inboundAuthorizerType) {
        this.inboundAuthorizerType = inboundAuthorizerType;
    }

    public ShowCustomModelProviderGatewayDetails withWorkloadIdentityUrn(String workloadIdentityUrn) {
        this.workloadIdentityUrn = workloadIdentityUrn;
        return this;
    }

    /**
     * **参数解释：** 工作负载标识的统一资源名称，格式为''agentIdentity:\\<region-id>:\\<account-id>:workloadIdentity:gateway_\\<gateway-name>''。 **取值范围：** 长度为 1-200 个字符。 
     * @return workloadIdentityUrn
     */
    public String getWorkloadIdentityUrn() {
        return workloadIdentityUrn;
    }

    public void setWorkloadIdentityUrn(String workloadIdentityUrn) {
        this.workloadIdentityUrn = workloadIdentityUrn;
    }

    public ShowCustomModelProviderGatewayDetails withLogDeliveryConfiguration(
        CoreGatewayLogDeliveryConfiguration logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
        return this;
    }

    public ShowCustomModelProviderGatewayDetails withLogDeliveryConfiguration(
        Consumer<CoreGatewayLogDeliveryConfiguration> logDeliveryConfigurationSetter) {
        if (this.logDeliveryConfiguration == null) {
            this.logDeliveryConfiguration = new CoreGatewayLogDeliveryConfiguration();
            logDeliveryConfigurationSetter.accept(this.logDeliveryConfiguration);
        }

        return this;
    }

    /**
     * Get logDeliveryConfiguration
     * @return logDeliveryConfiguration
     */
    public CoreGatewayLogDeliveryConfiguration getLogDeliveryConfiguration() {
        return logDeliveryConfiguration;
    }

    public void setLogDeliveryConfiguration(CoreGatewayLogDeliveryConfiguration logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
    }

    public ShowCustomModelProviderGatewayDetails withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * **参数解释：** AgentGateway ID，关联底层 AgentGateway 实例。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public ShowCustomModelProviderGatewayDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 详细描述。 **取值范围：** 长度为 1-1000 个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCustomModelProviderGatewayDetails withTags(List<CoreGatewayTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowCustomModelProviderGatewayDetails addTagsItem(CoreGatewayTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowCustomModelProviderGatewayDetails withTags(Consumer<List<CoreGatewayTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表。 **取值范围：** 数组长度为0-20。 
     * @return tags
     */
    public List<CoreGatewayTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreGatewayTag> tags) {
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
        ShowCustomModelProviderGatewayDetails that = (ShowCustomModelProviderGatewayDetails) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.endpointUrl, that.endpointUrl)
            && Objects.equals(this.inboundAuthorizerType, that.inboundAuthorizerType)
            && Objects.equals(this.workloadIdentityUrn, that.workloadIdentityUrn)
            && Objects.equals(this.logDeliveryConfiguration, that.logDeliveryConfiguration)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            endpointUrl,
            inboundAuthorizerType,
            workloadIdentityUrn,
            logDeliveryConfiguration,
            agentGatewayId,
            description,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomModelProviderGatewayDetails {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
        sb.append("    inboundAuthorizerType: ").append(toIndentedString(inboundAuthorizerType)).append("\n");
        sb.append("    workloadIdentityUrn: ").append(toIndentedString(workloadIdentityUrn)).append("\n");
        sb.append("    logDeliveryConfiguration: ").append(toIndentedString(logDeliveryConfiguration)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
