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
 * CreateCoreGatewayRequestBody
 */
public class CreateCoreGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 网关协议类型。
     */
    public static final class ProtocolTypeEnum {

        /**
         * Enum MCP for value: "mcp"
         */
        public static final ProtocolTypeEnum MCP = new ProtocolTypeEnum("mcp");

        private static final Map<String, ProtocolTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolTypeEnum> createStaticFields() {
            Map<String, ProtocolTypeEnum> map = new HashMap<>();
            map.put("mcp", MCP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolTypeEnum(String value) {
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
        public static ProtocolTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolTypeEnum(value));
        }

        public static ProtocolTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolTypeEnum) {
                return this.value.equals(((ProtocolTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private ProtocolTypeEnum protocolType;

    /**
     * 授权器类型。
     */
    public static final class AuthorizerTypeEnum {

        /**
         * Enum CUSTOM_JWT for value: "custom_jwt"
         */
        public static final AuthorizerTypeEnum CUSTOM_JWT = new AuthorizerTypeEnum("custom_jwt");

        /**
         * Enum IAM for value: "iam"
         */
        public static final AuthorizerTypeEnum IAM = new AuthorizerTypeEnum("iam");

        /**
         * Enum API_KEY for value: "api_key"
         */
        public static final AuthorizerTypeEnum API_KEY = new AuthorizerTypeEnum("api_key");

        private static final Map<String, AuthorizerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthorizerTypeEnum> createStaticFields() {
            Map<String, AuthorizerTypeEnum> map = new HashMap<>();
            map.put("custom_jwt", CUSTOM_JWT);
            map.put("iam", IAM);
            map.put("api_key", API_KEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthorizerTypeEnum(String value) {
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
        public static AuthorizerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthorizerTypeEnum(value));
        }

        public static AuthorizerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthorizerTypeEnum) {
                return this.value.equals(((AuthorizerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_type")

    private AuthorizerTypeEnum authorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_configuration")

    private CoreGatewayAuthorizerConfiguration authorizerConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_configuration")

    private CoreGatewayProtocolConfiguration protocolConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_delivery_configuration")

    private CoreGatewayLogDeliveryConfigurationRequestBody logDeliveryConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outbound_network_configuration")

    private CoreGatewayOutboundNetworkConfiguration outboundNetworkConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreGatewayTag> tags = null;

    public CreateCoreGatewayRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网关名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreGatewayRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 网关的详细描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCoreGatewayRequestBody withProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * 网关协议类型。
     * @return protocolType
     */
    public ProtocolTypeEnum getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(ProtocolTypeEnum protocolType) {
        this.protocolType = protocolType;
    }

    public CreateCoreGatewayRequestBody withAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * 授权器类型。
     * @return authorizerType
     */
    public AuthorizerTypeEnum getAuthorizerType() {
        return authorizerType;
    }

    public void setAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
    }

    public CreateCoreGatewayRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CreateCoreGatewayRequestBody withAuthorizerConfiguration(
        CoreGatewayAuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
        return this;
    }

    public CreateCoreGatewayRequestBody withAuthorizerConfiguration(
        Consumer<CoreGatewayAuthorizerConfiguration> authorizerConfigurationSetter) {
        if (this.authorizerConfiguration == null) {
            this.authorizerConfiguration = new CoreGatewayAuthorizerConfiguration();
            authorizerConfigurationSetter.accept(this.authorizerConfiguration);
        }

        return this;
    }

    /**
     * Get authorizerConfiguration
     * @return authorizerConfiguration
     */
    public CoreGatewayAuthorizerConfiguration getAuthorizerConfiguration() {
        return authorizerConfiguration;
    }

    public void setAuthorizerConfiguration(CoreGatewayAuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
    }

    public CreateCoreGatewayRequestBody withProtocolConfiguration(
        CoreGatewayProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }

    public CreateCoreGatewayRequestBody withProtocolConfiguration(
        Consumer<CoreGatewayProtocolConfiguration> protocolConfigurationSetter) {
        if (this.protocolConfiguration == null) {
            this.protocolConfiguration = new CoreGatewayProtocolConfiguration();
            protocolConfigurationSetter.accept(this.protocolConfiguration);
        }

        return this;
    }

    /**
     * Get protocolConfiguration
     * @return protocolConfiguration
     */
    public CoreGatewayProtocolConfiguration getProtocolConfiguration() {
        return protocolConfiguration;
    }

    public void setProtocolConfiguration(CoreGatewayProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
    }

    public CreateCoreGatewayRequestBody withLogDeliveryConfiguration(
        CoreGatewayLogDeliveryConfigurationRequestBody logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
        return this;
    }

    public CreateCoreGatewayRequestBody withLogDeliveryConfiguration(
        Consumer<CoreGatewayLogDeliveryConfigurationRequestBody> logDeliveryConfigurationSetter) {
        if (this.logDeliveryConfiguration == null) {
            this.logDeliveryConfiguration = new CoreGatewayLogDeliveryConfigurationRequestBody();
            logDeliveryConfigurationSetter.accept(this.logDeliveryConfiguration);
        }

        return this;
    }

    /**
     * Get logDeliveryConfiguration
     * @return logDeliveryConfiguration
     */
    public CoreGatewayLogDeliveryConfigurationRequestBody getLogDeliveryConfiguration() {
        return logDeliveryConfiguration;
    }

    public void setLogDeliveryConfiguration(CoreGatewayLogDeliveryConfigurationRequestBody logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
    }

    public CreateCoreGatewayRequestBody withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * AgentGateway ID。
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public CreateCoreGatewayRequestBody withOutboundNetworkConfiguration(
        CoreGatewayOutboundNetworkConfiguration outboundNetworkConfiguration) {
        this.outboundNetworkConfiguration = outboundNetworkConfiguration;
        return this;
    }

    public CreateCoreGatewayRequestBody withOutboundNetworkConfiguration(
        Consumer<CoreGatewayOutboundNetworkConfiguration> outboundNetworkConfigurationSetter) {
        if (this.outboundNetworkConfiguration == null) {
            this.outboundNetworkConfiguration = new CoreGatewayOutboundNetworkConfiguration();
            outboundNetworkConfigurationSetter.accept(this.outboundNetworkConfiguration);
        }

        return this;
    }

    /**
     * Get outboundNetworkConfiguration
     * @return outboundNetworkConfiguration
     */
    public CoreGatewayOutboundNetworkConfiguration getOutboundNetworkConfiguration() {
        return outboundNetworkConfiguration;
    }

    public void setOutboundNetworkConfiguration(CoreGatewayOutboundNetworkConfiguration outboundNetworkConfiguration) {
        this.outboundNetworkConfiguration = outboundNetworkConfiguration;
    }

    public CreateCoreGatewayRequestBody withTags(List<CoreGatewayTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreGatewayRequestBody addTagsItem(CoreGatewayTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreGatewayRequestBody withTags(Consumer<List<CoreGatewayTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表。
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
        CreateCoreGatewayRequestBody that = (CreateCoreGatewayRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.authorizerType, that.authorizerType)
            && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.authorizerConfiguration, that.authorizerConfiguration)
            && Objects.equals(this.protocolConfiguration, that.protocolConfiguration)
            && Objects.equals(this.logDeliveryConfiguration, that.logDeliveryConfiguration)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.outboundNetworkConfiguration, that.outboundNetworkConfiguration)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            protocolType,
            authorizerType,
            agencyName,
            authorizerConfiguration,
            protocolConfiguration,
            logDeliveryConfiguration,
            agentGatewayId,
            outboundNetworkConfiguration,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreGatewayRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    authorizerConfiguration: ").append(toIndentedString(authorizerConfiguration)).append("\n");
        sb.append("    protocolConfiguration: ").append(toIndentedString(protocolConfiguration)).append("\n");
        sb.append("    logDeliveryConfiguration: ").append(toIndentedString(logDeliveryConfiguration)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    outboundNetworkConfiguration: ")
            .append(toIndentedString(outboundNetworkConfiguration))
            .append("\n");
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
