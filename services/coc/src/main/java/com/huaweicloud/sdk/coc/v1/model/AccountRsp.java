package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 账号返回体
 */
public class AccountRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 账号类型 NORMAL 普通账号，停用状态 DELEGATOR 委托人 DELEGATEE 被委托人
     */
    public static final class TypeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final TypeEnum NORMAL = new TypeEnum("NORMAL");

        /**
         * Enum DELEGATOR for value: "DELEGATOR"
         */
        public static final TypeEnum DELEGATOR = new TypeEnum("DELEGATOR");

        /**
         * Enum DELEGATEE for value: "DELEGATEE"
         */
        public static final TypeEnum DELEGATEE = new TypeEnum("DELEGATEE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("DELEGATOR", DELEGATOR);
            map.put("DELEGATEE", DELEGATEE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegatee")

    private String delegatee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegator")

    private String delegator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_name")

    private String createUserName;

    /**
     * PENDING_AUTHORIZATION, 待授权,ENABLED 启用, DISABLED 停用
     */
    public static final class StatusEnum {

        /**
         * Enum PENDING_AUTHORIZATION for value: "PENDING_AUTHORIZATION"
         */
        public static final StatusEnum PENDING_AUTHORIZATION = new StatusEnum("PENDING_AUTHORIZATION");

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final StatusEnum DISABLED = new StatusEnum("DISABLED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PENDING_AUTHORIZATION", PENDING_AUTHORIZATION);
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
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
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_name")

    private String updateUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_id")

    private String updateUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public AccountRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountRsp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 账号类型 NORMAL 普通账号，停用状态 DELEGATOR 委托人 DELEGATEE 被委托人
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AccountRsp withDelegatee(String delegatee) {
        this.delegatee = delegatee;
        return this;
    }

    /**
     * 被委托人id
     * @return delegatee
     */
    public String getDelegatee() {
        return delegatee;
    }

    public void setDelegatee(String delegatee) {
        this.delegatee = delegatee;
    }

    public AccountRsp withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 委托id
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public AccountRsp withDelegator(String delegator) {
        this.delegator = delegator;
        return this;
    }

    /**
     * 托管账号Id
     * @return delegator
     */
    public String getDelegator() {
        return delegator;
    }

    public void setDelegator(String delegator) {
        this.delegator = delegator;
    }

    public AccountRsp withCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * 创建人
     * @return createUserName
     */
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public AccountRsp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * PENDING_AUTHORIZATION, 待授权,ENABLED 启用, DISABLED 停用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AccountRsp withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * 创建userId
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public AccountRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AccountRsp withUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
        return this;
    }

    /**
     * 编辑人
     * @return updateUserName
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public AccountRsp withUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }

    /**
     * 编辑人user_id
     * @return updateUserId
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public AccountRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 编辑时间，期初和创建时间一样
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountRsp that = (AccountRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.delegatee, that.delegatee)
            && Objects.equals(this.agencyId, that.agencyId) && Objects.equals(this.delegator, that.delegator)
            && Objects.equals(this.createUserName, that.createUserName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createUserId, that.createUserId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateUserName, that.updateUserName)
            && Objects.equals(this.updateUserId, that.updateUserId) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            delegatee,
            agencyId,
            delegator,
            createUserName,
            status,
            createUserId,
            createTime,
            updateUserName,
            updateUserId,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    delegatee: ").append(toIndentedString(delegatee)).append("\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
        sb.append("    delegator: ").append(toIndentedString(delegator)).append("\n");
        sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateUserName: ").append(toIndentedString(updateUserName)).append("\n");
        sb.append("    updateUserId: ").append(toIndentedString(updateUserId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
