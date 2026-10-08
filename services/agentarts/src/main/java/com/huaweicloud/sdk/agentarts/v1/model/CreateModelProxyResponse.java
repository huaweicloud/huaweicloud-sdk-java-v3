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
public class CreateModelProxyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private UUID gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "tags")

    private List<CoreGatewayTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_model_provider_id")

    private UUID customModelProviderId;

    public CreateModelProxyResponse withGatewayId(UUID gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * **参数解释：** 模型代理的唯一标识符。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **约束限制：** 不涉及。 **默认取值：** 不涉及。 
     * @return gatewayId
     */
    public UUID getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(UUID gatewayId) {
        this.gatewayId = gatewayId;
    }

    public CreateModelProxyResponse withName(String name) {
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

    public CreateModelProxyResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 网关的详细描述。 **取值范围：** 长度为 0-1000 个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateModelProxyResponse withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * **参数解释：** 访问模型代理的 URL 端点。 **取值范围：** 长度为 1-512 个字符。 - 示例：https://gateway-fo2ao8pg-beta1-gw-gu2geoldgz.cn-southwest-301.huaweicloud-agentarts.com 
     * @return endpointUrl
     */
    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public CreateModelProxyResponse withInboundAuthorizerType(InboundAuthorizerTypeEnum inboundAuthorizerType) {
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

    public CreateModelProxyResponse withTags(List<CoreGatewayTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateModelProxyResponse addTagsItem(CoreGatewayTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateModelProxyResponse withTags(Consumer<List<CoreGatewayTag>> tagsSetter) {
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

    public CreateModelProxyResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 模型代理创建时间戳。 **取值范围：** 遵循ISO 8601标准格式，例如：2022-11-09 16:37:24。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateModelProxyResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 模型代理最后更新时间戳。 **取值范围：** 遵循ISO 8601标准格式，例如：2022-11-09 16:37:24。 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateModelProxyResponse withCustomModelProviderId(UUID customModelProviderId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateModelProxyResponse that = (CreateModelProxyResponse) obj;
        return Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.endpointUrl, that.endpointUrl)
            && Objects.equals(this.inboundAuthorizerType, that.inboundAuthorizerType)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.customModelProviderId, that.customModelProviderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId,
            name,
            description,
            endpointUrl,
            inboundAuthorizerType,
            tags,
            createdAt,
            updatedAt,
            customModelProviderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModelProxyResponse {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
        sb.append("    inboundAuthorizerType: ").append(toIndentedString(inboundAuthorizerType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    customModelProviderId: ").append(toIndentedString(customModelProviderId)).append("\n");
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
