package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 密钥对详细信息
 */
public class KeypairDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    /**
     * SSH密钥对的类型
     */
    public static final class TypeEnum {

        /**
         * Enum SSH for value: "ssh"
         */
        public static final TypeEnum SSH = new TypeEnum("ssh");

        /**
         * Enum X509 for value: "x509"
         */
        public static final TypeEnum X509 = new TypeEnum("x509");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ssh", SSH);
            map.put("x509", X509);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 租户级或者用户级
     */
    public static final class ScopeEnum {

        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final ScopeEnum DOMAIN = new ScopeEnum("domain");

        /**
         * Enum USER for value: "user"
         */
        public static final ScopeEnum USER = new ScopeEnum("user");

        private static final Map<String, ScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScopeEnum> createStaticFields() {
            Map<String, ScopeEnum> map = new HashMap<>();
            map.put("domain", DOMAIN);
            map.put("user", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScopeEnum(value));
        }

        public static ScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScopeEnum) {
                return this.value.equals(((ScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private ScopeEnum scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_key_protection")

    private Boolean isKeyProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_state")

    private Integer frozenState;

    public KeypairDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * SSH密钥对的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeypairDetail withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * SSH密钥对的ID
     * minimum: 0
     * maximum: 1000000000
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KeypairDetail withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * SSH密钥对的类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public KeypairDetail withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 租户级或者用户级
     * @return scope
     */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public KeypairDetail withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * SSH密钥对对应的publicKey信息
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public KeypairDetail withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * SSH密钥对应指纹信息
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public KeypairDetail withIsKeyProtection(Boolean isKeyProtection) {
        this.isKeyProtection = isKeyProtection;
        return this;
    }

    /**
     * 是否托管密钥
     * @return isKeyProtection
     */
    public Boolean getIsKeyProtection() {
        return isKeyProtection;
    }

    public void setIsKeyProtection(Boolean isKeyProtection) {
        this.isKeyProtection = isKeyProtection;
    }

    public KeypairDetail withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * SSH密钥对删除的标记
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public KeypairDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SSH密钥对的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KeypairDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * SSH密钥对所属的用户信息
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public KeypairDetail withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * SSH密钥对创建的时间，时间戳，即从1970年1月1日至该时间的总秒数
     * minimum: 0
     * maximum: 10000000000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public KeypairDetail withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * SSH密钥对删除的时间，时间戳，即从1970年1月1日至该时间的总秒数
     * minimum: 0
     * maximum: 10000000000000
     * @return deleteTime
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public KeypairDetail withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * SSH密钥对的更新时间，时间戳，即从1970年1月1日至该时间的总秒数
     * minimum: 0
     * maximum: 10000000000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public KeypairDetail withFrozenState(Integer frozenState) {
        this.frozenState = frozenState;
        return this;
    }

    /**
     * 冻结状态 - 0：正常状态 - 1：普通冻结 - 2：公安冻结 - 3：普通冻结及公安冻结 - 4：违规冻结 - 5：普通冻结及违规冻结 - 6：公安冻结及违规冻结 - 7：普通冻结、公安冻结及违规冻结 - 8：未实名认证冻结 - 9：普通冻结及未实名认证冻结 - 10：公安冻结及未实名认证冻结
     * minimum: 0
     * maximum: 64
     * @return frozenState
     */
    public Integer getFrozenState() {
        return frozenState;
    }

    public void setFrozenState(Integer frozenState) {
        this.frozenState = frozenState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeypairDetail that = (KeypairDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.publicKey, that.publicKey) && Objects.equals(this.fingerprint, that.fingerprint)
            && Objects.equals(this.isKeyProtection, that.isKeyProtection) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.description, that.description) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.deleteTime, that.deleteTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.frozenState, that.frozenState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            type,
            scope,
            publicKey,
            fingerprint,
            isKeyProtection,
            deleted,
            description,
            userId,
            createTime,
            deleteTime,
            updateTime,
            frozenState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeypairDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    isKeyProtection: ").append(toIndentedString(isKeyProtection)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    frozenState: ").append(toIndentedString(frozenState)).append("\n");
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
