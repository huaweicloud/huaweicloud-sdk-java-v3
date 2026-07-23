package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

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
 * Response Object
 */
public class CreateCoreCodeInterpreterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_agency_name")

    private String executionAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity")

    private CoreToolsWorkloadIdentity workloadIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_endpoint")

    private String accessEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observability")

    private CoreToolsObservability observability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreToolsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_config")

    private CoreToolsOutboundNetwork networkConfig;

    /**
     * **参数解释：** 工具认证方式。 **取值范围：** `API_KEY`: 使用 API 密钥认证。 `IAM`: 使用 IAM方式认证。
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

    public CreateCoreCodeInterpreterResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工具ID。 **取值范围：** 符合UUID规则^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$的36位字符串。
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public CreateCoreCodeInterpreterResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 工具的名称。 **取值范围：** 符合正则^[a-z][a-z0-9-]{0,38}[a-z0-9]$，即必须以小写字母开头，小写字母或数字结尾，中间可包含数字、小写字母、中划线，字符长度必须在2-40个字符之间。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreCodeInterpreterResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 工具的描述。 **取值范围：** 任意字符，长度不能超过4096个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCoreCodeInterpreterResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** ISO 8601格式的时间字符串，例如：2026-04-09T08:29:59.922+00:00。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateCoreCodeInterpreterResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** ISO 8601格式的时间字符串，例如：2026-04-09T08:29:59.922+00:00。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateCoreCodeInterpreterResponse withExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
        return this;
    }

    /**
     * **参数解释：** 为工具提供访问云服务的权限的IAM委托名。 **取值范围：** IAM委托名长度必须在1-64个字符之间，字符规则以IAM服务校验规则为准。
     * @return executionAgencyName
     */
    public String getExecutionAgencyName() {
        return executionAgencyName;
    }

    public void setExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
    }

    public CreateCoreCodeInterpreterResponse withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * **参数解释：** 工具入口的AgentGateway的ID。 **取值范围：** 符合UUID规则 ^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$的36位字符串。
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public CreateCoreCodeInterpreterResponse withWorkloadIdentity(CoreToolsWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
        return this;
    }

    public CreateCoreCodeInterpreterResponse withWorkloadIdentity(
        Consumer<CoreToolsWorkloadIdentity> workloadIdentitySetter) {
        if (this.workloadIdentity == null) {
            this.workloadIdentity = new CoreToolsWorkloadIdentity();
            workloadIdentitySetter.accept(this.workloadIdentity);
        }

        return this;
    }

    /**
     * Get workloadIdentity
     * @return workloadIdentity
     */
    public CoreToolsWorkloadIdentity getWorkloadIdentity() {
        return workloadIdentity;
    }

    public void setWorkloadIdentity(CoreToolsWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
    }

    public CreateCoreCodeInterpreterResponse withAccessEndpoint(String accessEndpoint) {
        this.accessEndpoint = accessEndpoint;
        return this;
    }

    /**
     * **参数解释：** 访问域名。 **取值范围：** 不涉及。
     * @return accessEndpoint
     */
    public String getAccessEndpoint() {
        return accessEndpoint;
    }

    public void setAccessEndpoint(String accessEndpoint) {
        this.accessEndpoint = accessEndpoint;
    }

    public CreateCoreCodeInterpreterResponse withObservability(CoreToolsObservability observability) {
        this.observability = observability;
        return this;
    }

    public CreateCoreCodeInterpreterResponse withObservability(Consumer<CoreToolsObservability> observabilitySetter) {
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

    public CreateCoreCodeInterpreterResponse withTags(List<CoreToolsTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreCodeInterpreterResponse addTagsItem(CoreToolsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreCodeInterpreterResponse withTags(Consumer<List<CoreToolsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签。 **取值范围：** 不涉及。
     * @return tags
     */
    public List<CoreToolsTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreToolsTag> tags) {
        this.tags = tags;
    }

    public CreateCoreCodeInterpreterResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 工具状态。 **取值范围：** - RUNNING：运行中。 - DELETING：删除中。 - DELETE_FAILED：删除失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateCoreCodeInterpreterResponse withNetworkConfig(CoreToolsOutboundNetwork networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }

    public CreateCoreCodeInterpreterResponse withNetworkConfig(Consumer<CoreToolsOutboundNetwork> networkConfigSetter) {
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

    public CreateCoreCodeInterpreterResponse withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释：** 工具认证方式。 **取值范围：** `API_KEY`: 使用 API 密钥认证。 `IAM`: 使用 IAM方式认证。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public CreateCoreCodeInterpreterResponse withApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }

    /**
     * **参数解释：** API Key名称。 **取值范围：** 只能包含数字、字母、下划线、中划线，且长度必须在1-64个字符之间。
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return apiKeyName;
    }

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreCodeInterpreterResponse that = (CreateCoreCodeInterpreterResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.executionAgencyName, that.executionAgencyName)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.workloadIdentity, that.workloadIdentity)
            && Objects.equals(this.accessEndpoint, that.accessEndpoint)
            && Objects.equals(this.observability, that.observability) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.status, that.status) && Objects.equals(this.networkConfig, that.networkConfig)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.apiKeyName, that.apiKeyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            updatedAt,
            executionAgencyName,
            agentGatewayId,
            workloadIdentity,
            accessEndpoint,
            observability,
            tags,
            status,
            networkConfig,
            authType,
            apiKeyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreCodeInterpreterResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    executionAgencyName: ").append(toIndentedString(executionAgencyName)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    workloadIdentity: ").append(toIndentedString(workloadIdentity)).append("\n");
        sb.append("    accessEndpoint: ").append(toIndentedString(accessEndpoint)).append("\n");
        sb.append("    observability: ").append(toIndentedString(observability)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
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
