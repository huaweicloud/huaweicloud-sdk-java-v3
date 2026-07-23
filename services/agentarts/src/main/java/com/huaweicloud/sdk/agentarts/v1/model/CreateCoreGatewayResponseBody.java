package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * CreateCoreGatewayResponseBody
 */
public class CreateCoreGatewayResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private UUID gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 网关的当前状态。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");

        /**
         * Enum INACTIVE for value: "inactive"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("inactive");

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum UPDATING for value: "updating"
         */
        public static final StatusEnum UPDATING = new StatusEnum("updating");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("inactive", INACTIVE);
            map.put("creating", CREATING);
            map.put("deleting", DELETING);
            map.put("updating", UPDATING);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_configuration")

    private CoreGatewayProtocolConfiguration protocolConfiguration;

    /**
     * 入站认证类型。
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
    @JsonProperty(value = "endpoint_url")

    private String endpointUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_delivery_configuration")

    private CoreGatewayLogDeliveryConfiguration logDeliveryConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity")

    private CoreGatewayWorkloadIdentity workloadIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outbound_network_configuration")

    private CoreGatewayOutboundNetworkConfiguration outboundNetworkConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreGatewayTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public CreateCoreGatewayResponseBody withGatewayId(UUID gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 网关的唯一标识符。
     * @return gatewayId
     */
    public UUID getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(UUID gatewayId) {
        this.gatewayId = gatewayId;
    }

    public CreateCoreGatewayResponseBody withName(String name) {
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

    public CreateCoreGatewayResponseBody withDescription(String description) {
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

    public CreateCoreGatewayResponseBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 网关的当前状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateCoreGatewayResponseBody withProtocolType(ProtocolTypeEnum protocolType) {
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

    public CreateCoreGatewayResponseBody withProtocolConfiguration(
        CoreGatewayProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }

    public CreateCoreGatewayResponseBody withProtocolConfiguration(
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

    public CreateCoreGatewayResponseBody withAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * 入站认证类型。
     * @return authorizerType
     */
    public AuthorizerTypeEnum getAuthorizerType() {
        return authorizerType;
    }

    public void setAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
    }

    public CreateCoreGatewayResponseBody withAgencyName(String agencyName) {
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

    public CreateCoreGatewayResponseBody withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * 访问网关的 URL 端点。
     * @return endpointUrl
     */
    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public CreateCoreGatewayResponseBody withLogDeliveryConfiguration(
        CoreGatewayLogDeliveryConfiguration logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
        return this;
    }

    public CreateCoreGatewayResponseBody withLogDeliveryConfiguration(
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

    public CreateCoreGatewayResponseBody withWorkloadIdentity(CoreGatewayWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
        return this;
    }

    public CreateCoreGatewayResponseBody withWorkloadIdentity(
        Consumer<CoreGatewayWorkloadIdentity> workloadIdentitySetter) {
        if (this.workloadIdentity == null) {
            this.workloadIdentity = new CoreGatewayWorkloadIdentity();
            workloadIdentitySetter.accept(this.workloadIdentity);
        }

        return this;
    }

    /**
     * Get workloadIdentity
     * @return workloadIdentity
     */
    public CoreGatewayWorkloadIdentity getWorkloadIdentity() {
        return workloadIdentity;
    }

    public void setWorkloadIdentity(CoreGatewayWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
    }

    public CreateCoreGatewayResponseBody withAgentGatewayId(UUID agentGatewayId) {
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

    public CreateCoreGatewayResponseBody withOutboundNetworkConfiguration(
        CoreGatewayOutboundNetworkConfiguration outboundNetworkConfiguration) {
        this.outboundNetworkConfiguration = outboundNetworkConfiguration;
        return this;
    }

    public CreateCoreGatewayResponseBody withOutboundNetworkConfiguration(
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

    public CreateCoreGatewayResponseBody withTags(List<CoreGatewayTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreGatewayResponseBody addTagsItem(CoreGatewayTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreGatewayResponseBody withTags(Consumer<List<CoreGatewayTag>> tagsSetter) {
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

    public CreateCoreGatewayResponseBody withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 网关创建时间戳。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateCoreGatewayResponseBody withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 网关最后更新时间戳。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreGatewayResponseBody that = (CreateCoreGatewayResponseBody) obj;
        return Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.protocolConfiguration, that.protocolConfiguration)
            && Objects.equals(this.authorizerType, that.authorizerType)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.endpointUrl, that.endpointUrl)
            && Objects.equals(this.logDeliveryConfiguration, that.logDeliveryConfiguration)
            && Objects.equals(this.workloadIdentity, that.workloadIdentity)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.outboundNetworkConfiguration, that.outboundNetworkConfiguration)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId,
            name,
            description,
            status,
            protocolType,
            protocolConfiguration,
            authorizerType,
            agencyName,
            endpointUrl,
            logDeliveryConfiguration,
            workloadIdentity,
            agentGatewayId,
            outboundNetworkConfiguration,
            tags,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreGatewayResponseBody {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    protocolConfiguration: ").append(toIndentedString(protocolConfiguration)).append("\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
        sb.append("    logDeliveryConfiguration: ").append(toIndentedString(logDeliveryConfiguration)).append("\n");
        sb.append("    workloadIdentity: ").append(toIndentedString(workloadIdentity)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    outboundNetworkConfiguration: ")
            .append(toIndentedString(outboundNetworkConfiguration))
            .append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
