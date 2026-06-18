package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ProjectEncryptionStatusBriefDto
 */
public class ProjectEncryptionStatusBriefDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    /**
     * **参数解释：** 仓库加密状态 **取值范围：** - encrypting，加密中。 - encrypted，已加密。 - decrypting，解密中。 - decrypted，已解密。 **默认取值：** 不涉及。
     */
    public static final class StatusEnum {

        /**
         * Enum ENCRYPTING for value: "encrypting"
         */
        public static final StatusEnum ENCRYPTING = new StatusEnum("encrypting");

        /**
         * Enum ENCRYPTED for value: "encrypted"
         */
        public static final StatusEnum ENCRYPTED = new StatusEnum("encrypted");

        /**
         * Enum DECRYPTING for value: "decrypting"
         */
        public static final StatusEnum DECRYPTING = new StatusEnum("decrypting");

        /**
         * Enum DECRYPTED for value: "decrypted"
         */
        public static final StatusEnum DECRYPTED = new StatusEnum("decrypted");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("encrypting", ENCRYPTING);
            map.put("encrypted", ENCRYPTED);
            map.put("decrypting", DECRYPTING);
            map.put("decrypted", DECRYPTED);
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
    @JsonProperty(value = "last_encryption_at")

    private String lastEncryptionAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_decryption_at")

    private String lastDecryptionAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_consistent")

    private Boolean isConsistent;

    public ProjectEncryptionStatusBriefDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库加密状态ID。 **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProjectEncryptionStatusBriefDto withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 仓库加密状态 **取值范围：** - encrypting，加密中。 - encrypted，已加密。 - decrypting，解密中。 - decrypted，已解密。 **默认取值：** 不涉及。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ProjectEncryptionStatusBriefDto withLastEncryptionAt(String lastEncryptionAt) {
        this.lastEncryptionAt = lastEncryptionAt;
        return this;
    }

    /**
     * **参数解释：** 最近加密时间。 **取值范围：** 不涉及。
     * @return lastEncryptionAt
     */
    public String getLastEncryptionAt() {
        return lastEncryptionAt;
    }

    public void setLastEncryptionAt(String lastEncryptionAt) {
        this.lastEncryptionAt = lastEncryptionAt;
    }

    public ProjectEncryptionStatusBriefDto withLastDecryptionAt(String lastDecryptionAt) {
        this.lastDecryptionAt = lastDecryptionAt;
        return this;
    }

    /**
     * **参数解释：** 最近解密时间。 **取值范围：** 不涉及。
     * @return lastDecryptionAt
     */
    public String getLastDecryptionAt() {
        return lastDecryptionAt;
    }

    public void setLastDecryptionAt(String lastDecryptionAt) {
        this.lastDecryptionAt = lastDecryptionAt;
    }

    public ProjectEncryptionStatusBriefDto withIsConsistent(Boolean isConsistent) {
        this.isConsistent = isConsistent;
        return this;
    }

    /**
     * **参数解释：** 是否开启仓库加密。 **约束限制：** 不涉及。 **取值范围：** - true，开启仓库加密。 - false，关闭仓库加密。
     * @return isConsistent
     */
    public Boolean getIsConsistent() {
        return isConsistent;
    }

    public void setIsConsistent(Boolean isConsistent) {
        this.isConsistent = isConsistent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectEncryptionStatusBriefDto that = (ProjectEncryptionStatusBriefDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.lastEncryptionAt, that.lastEncryptionAt)
            && Objects.equals(this.lastDecryptionAt, that.lastDecryptionAt)
            && Objects.equals(this.isConsistent, that.isConsistent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, lastEncryptionAt, lastDecryptionAt, isConsistent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectEncryptionStatusBriefDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastEncryptionAt: ").append(toIndentedString(lastEncryptionAt)).append("\n");
        sb.append("    lastDecryptionAt: ").append(toIndentedString(lastDecryptionAt)).append("\n");
        sb.append("    isConsistent: ").append(toIndentedString(isConsistent)).append("\n");
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
