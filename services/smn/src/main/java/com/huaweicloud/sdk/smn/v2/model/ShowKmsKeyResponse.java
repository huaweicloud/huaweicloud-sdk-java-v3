package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowKmsKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    /**
     * 密钥的状态字段，为枚举类型。 - ENABLED状态为密钥启用状态，此时发布的消息均使用该主密钥创建的数据密钥进行加解密。 - TO_BE_ACTIVATED状态为密钥待激活状态，当密钥未激活时，发布主题消息会返回失败，请前往DEW服务对密钥进行操作。 - DISABLED状态为密钥禁用状态，当密钥已被禁用时，发布主题消息会返回失败，请前往DEW服务对密钥进行操作。 - PENDING_DELETION状态为密钥计划删除状态，当密钥已被计划删除时，发布主题消息仍能正常使用该密钥。 - PENDING_IMPORT状态为密钥计划导入状态，当密钥计划导入时，发布主题消息会返回失败，请前往DEW服务对密钥进行操作。 - DELETED状态为密钥已删除状态，当密钥已删除后，SMN无法从DEW服务处获取有效的密钥，此时发布主题消息会返回失败，请重新在主题下配置可用的密钥。
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        /**
         * Enum TO_BE_ACTIVATED for value: "TO_BE_ACTIVATED"
         */
        public static final StatusEnum TO_BE_ACTIVATED = new StatusEnum("TO_BE_ACTIVATED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final StatusEnum DISABLED = new StatusEnum("DISABLED");

        /**
         * Enum PENDING_DELETION for value: "PENDING_DELETION"
         */
        public static final StatusEnum PENDING_DELETION = new StatusEnum("PENDING_DELETION");

        /**
         * Enum PENDING_IMPORT for value: "PENDING_IMPORT"
         */
        public static final StatusEnum PENDING_IMPORT = new StatusEnum("PENDING_IMPORT");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("TO_BE_ACTIVATED", TO_BE_ACTIVATED);
            map.put("DISABLED", DISABLED);
            map.put("PENDING_DELETION", PENDING_DELETION);
            map.put("PENDING_IMPORT", PENDING_IMPORT);
            map.put("DELETED", DELETED);
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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowKmsKeyResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 在DEW服务上创建的用户主密钥对应的密钥ID，具体参考在DEW服务上创建密钥章节。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public ShowKmsKeyResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 密钥的状态字段，为枚举类型。 - ENABLED状态为密钥启用状态，此时发布的消息均使用该主密钥创建的数据密钥进行加解密。 - TO_BE_ACTIVATED状态为密钥待激活状态，当密钥未激活时，发布主题消息会返回失败，请前往DEW服务对密钥进行操作。 - DISABLED状态为密钥禁用状态，当密钥已被禁用时，发布主题消息会返回失败，请前往DEW服务对密钥进行操作。 - PENDING_DELETION状态为密钥计划删除状态，当密钥已被计划删除时，发布主题消息仍能正常使用该密钥。 - PENDING_IMPORT状态为密钥计划导入状态，当密钥计划导入时，发布主题消息会返回失败，请前往DEW服务对密钥进行操作。 - DELETED状态为密钥已删除状态，当密钥已删除后，SMN无法从DEW服务处获取有效的密钥，此时发布主题消息会返回失败，请重新在主题下配置可用的密钥。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowKmsKeyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 密钥对应的资源ID，该ID由SMN服务生成。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowKmsKeyResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKmsKeyResponse that = (ShowKmsKeyResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.id, that.id) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, status, id, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKmsKeyResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
