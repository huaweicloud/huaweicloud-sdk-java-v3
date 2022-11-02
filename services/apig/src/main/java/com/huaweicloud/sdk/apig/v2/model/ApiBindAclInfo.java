package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiBindAclInfo
 */
public class ApiBindAclInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_id")

    private String aclId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_name")

    private String aclName;

    /**
     * ACL策略作用的对象类型
     */
    public static final class EntityTypeEnum {

        /**
         * Enum IP for value: "IP"
         */
        public static final EntityTypeEnum IP = new EntityTypeEnum("IP");

        /**
         * Enum DOMAIN for value: "DOMAIN"
         */
        public static final EntityTypeEnum DOMAIN = new EntityTypeEnum("DOMAIN");

        /**
         * Enum DOMAIN_ID for value: "DOMAIN_ID"
         */
        public static final EntityTypeEnum DOMAIN_ID = new EntityTypeEnum("DOMAIN_ID");

        private static final Map<String, EntityTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EntityTypeEnum> createStaticFields() {
            Map<String, EntityTypeEnum> map = new HashMap<>();
            map.put("IP", IP);
            map.put("DOMAIN", DOMAIN);
            map.put("DOMAIN_ID", DOMAIN_ID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EntityTypeEnum(String value) {
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
        public static EntityTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EntityTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EntityTypeEnum(value);
            }
            return result;
        }

        public static EntityTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EntityTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EntityTypeEnum) {
                return this.value.equals(((EntityTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_type")

    private EntityTypeEnum entityType;

    /**
     * ACL策略类型 - PERMIT：白名单类型 - DENY：黑名单类型
     */
    public static final class AclTypeEnum {

        /**
         * Enum PERMIT for value: "PERMIT"
         */
        public static final AclTypeEnum PERMIT = new AclTypeEnum("PERMIT");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final AclTypeEnum DENY = new AclTypeEnum("DENY");

        private static final Map<String, AclTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AclTypeEnum> createStaticFields() {
            Map<String, AclTypeEnum> map = new HashMap<>();
            map.put("PERMIT", PERMIT);
            map.put("DENY", DENY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AclTypeEnum(String value) {
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
        public static AclTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AclTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AclTypeEnum(value);
            }
            return result;
        }

        public static AclTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AclTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AclTypeEnum) {
                return this.value.equals(((AclTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_type")

    private AclTypeEnum aclType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_value")

    private String aclValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_id")

    private String bindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_time")

    private OffsetDateTime bindTime;

    public ApiBindAclInfo withAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }

    /**
     * ACL策略编号
     * @return aclId
     */
    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public ApiBindAclInfo withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    /**
     * ACL策略名称
     * @return aclName
     */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public ApiBindAclInfo withEntityType(EntityTypeEnum entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * ACL策略作用的对象类型
     * @return entityType
     */
    public EntityTypeEnum getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityTypeEnum entityType) {
        this.entityType = entityType;
    }

    public ApiBindAclInfo withAclType(AclTypeEnum aclType) {
        this.aclType = aclType;
        return this;
    }

    /**
     * ACL策略类型 - PERMIT：白名单类型 - DENY：黑名单类型
     * @return aclType
     */
    public AclTypeEnum getAclType() {
        return aclType;
    }

    public void setAclType(AclTypeEnum aclType) {
        this.aclType = aclType;
    }

    public ApiBindAclInfo withAclValue(String aclValue) {
        this.aclValue = aclValue;
        return this;
    }

    /**
     * ACL策略值
     * @return aclValue
     */
    public String getAclValue() {
        return aclValue;
    }

    public void setAclValue(String aclValue) {
        this.aclValue = aclValue;
    }

    public ApiBindAclInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 生效的环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ApiBindAclInfo withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 生效的环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public ApiBindAclInfo withBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }

    /**
     * 绑定关系编号
     * @return bindId
     */
    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public ApiBindAclInfo withBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
        return this;
    }

    /**
     * 绑定时间
     * @return bindTime
     */
    public OffsetDateTime getBindTime() {
        return bindTime;
    }

    public void setBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiBindAclInfo apiBindAclInfo = (ApiBindAclInfo) o;
        return Objects.equals(this.aclId, apiBindAclInfo.aclId) && Objects.equals(this.aclName, apiBindAclInfo.aclName)
            && Objects.equals(this.entityType, apiBindAclInfo.entityType)
            && Objects.equals(this.aclType, apiBindAclInfo.aclType)
            && Objects.equals(this.aclValue, apiBindAclInfo.aclValue)
            && Objects.equals(this.envId, apiBindAclInfo.envId) && Objects.equals(this.envName, apiBindAclInfo.envName)
            && Objects.equals(this.bindId, apiBindAclInfo.bindId)
            && Objects.equals(this.bindTime, apiBindAclInfo.bindTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclId, aclName, entityType, aclType, aclValue, envId, envName, bindId, bindTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiBindAclInfo {\n");
        sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
        sb.append("    aclValue: ").append(toIndentedString(aclValue)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
        sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
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
