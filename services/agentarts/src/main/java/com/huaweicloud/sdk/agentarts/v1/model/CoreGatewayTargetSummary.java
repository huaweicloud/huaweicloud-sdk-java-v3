package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * CoreGatewayTargetSummary
 */
public class CoreGatewayTargetSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private UUID targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private UUID gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 目标服务状态。 **取值范围：** - `creating`: 创建中 - `updating`: 更新中 - `ready`: 就绪可用 - `failed`: 失败 - `deleting`: 删除中 - `synchronize_pending`: 等待同步中 - `synchronizing`: 同步中 - `active`: 在线 - `inactive`: 离线 
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum UPDATING for value: "updating"
         */
        public static final StatusEnum UPDATING = new StatusEnum("updating");

        /**
         * Enum READY for value: "ready"
         */
        public static final StatusEnum READY = new StatusEnum("ready");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum SYNCHRONIZE_PENDING for value: "synchronize_pending"
         */
        public static final StatusEnum SYNCHRONIZE_PENDING = new StatusEnum("synchronize_pending");

        /**
         * Enum SYNCHRONIZING for value: "synchronizing"
         */
        public static final StatusEnum SYNCHRONIZING = new StatusEnum("synchronizing");

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");

        /**
         * Enum INACTIVE for value: "inactive"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("inactive");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("creating", CREATING);
            map.put("updating", UPDATING);
            map.put("ready", READY);
            map.put("failed", FAILED);
            map.put("deleting", DELETING);
            map.put("synchronize_pending", SYNCHRONIZE_PENDING);
            map.put("synchronizing", SYNCHRONIZING);
            map.put("active", ACTIVE);
            map.put("inactive", INACTIVE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inactive_reason")

    private String inactiveReason;

    /**
     * **参数解释：** 目标服务类型。 **取值范围：** - `mcp_server`: MCP 服务器 - `openapi`: 基于 OpenAPI 规范的 REST API 
     */
    public static final class TargetTypeEnum {

        /**
         * Enum MCP_SERVER for value: "mcp_server"
         */
        public static final TargetTypeEnum MCP_SERVER = new TargetTypeEnum("mcp_server");

        /**
         * Enum OPENAPI for value: "openapi"
         */
        public static final TargetTypeEnum OPENAPI = new TargetTypeEnum("openapi");

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("mcp_server", MCP_SERVER);
            map.put("openapi", OPENAPI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetTypeEnum(value));
        }

        public static TargetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetTypeEnum) {
                return this.value.equals(((TargetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private TargetTypeEnum targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public CoreGatewayTargetSummary withTargetId(UUID targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * **参数解释：** 目标服务的唯一标识符。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 
     * @return targetId
     */
    public UUID getTargetId() {
        return targetId;
    }

    public void setTargetId(UUID targetId) {
        this.targetId = targetId;
    }

    public CoreGatewayTargetSummary withGatewayId(UUID gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * **参数解释：** 所属网关的标识符。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 
     * @return gatewayId
     */
    public UUID getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(UUID gatewayId) {
        this.gatewayId = gatewayId;
    }

    public CoreGatewayTargetSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 目标服务名称。 **取值范围：** 长度为 1-50 个字符，匹配以字母数字开头和结尾、中间可含0到48个字母数字或短横线的字符串，符合正则条件^[a-zA-Z0-9]\\([a-zA-Z0-9-]{0,48}[a-zA-Z0-9])?$。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoreGatewayTargetSummary withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 目标服务状态。 **取值范围：** - `creating`: 创建中 - `updating`: 更新中 - `ready`: 就绪可用 - `failed`: 失败 - `deleting`: 删除中 - `synchronize_pending`: 等待同步中 - `synchronizing`: 同步中 - `active`: 在线 - `inactive`: 离线 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CoreGatewayTargetSummary withInactiveReason(String inactiveReason) {
        this.inactiveReason = inactiveReason;
        return this;
    }

    /**
     * **参数解释：** 目标服务离线状态原因。 **取值范围：** 长度为 1-100 个字符。 
     * @return inactiveReason
     */
    public String getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(String inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    public CoreGatewayTargetSummary withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数解释：** 目标服务类型。 **取值范围：** - `mcp_server`: MCP 服务器 - `openapi`: 基于 OpenAPI 规范的 REST API 
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public CoreGatewayTargetSummary withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CoreGatewayTargetSummary withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** 不涉及。 
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
        CoreGatewayTargetSummary that = (CoreGatewayTargetSummary) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.gatewayId, that.gatewayId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.inactiveReason, that.inactiveReason)
            && Objects.equals(this.targetType, that.targetType) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, gatewayId, name, status, inactiveReason, targetType, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayTargetSummary {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inactiveReason: ").append(toIndentedString(inactiveReason)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
