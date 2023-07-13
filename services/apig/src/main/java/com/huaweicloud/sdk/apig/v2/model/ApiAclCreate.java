package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiAclCreate
 */
public class ApiAclCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_name")

    private String aclName;

    /**
     * 类型 -  PERMIT (白名单类型) -  DENY (黑名单类型)
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AclTypeEnum(value));
        }

        public static AclTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 对象类型： - IP：IP地址 - DOMAIN：帐号名 - DOMAIN_ID：帐号ID
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EntityTypeEnum(value));
        }

        public static EntityTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public ApiAclCreate withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    /**
     * ACL策略名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return aclName
     */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public ApiAclCreate withAclType(AclTypeEnum aclType) {
        this.aclType = aclType;
        return this;
    }

    /**
     * 类型 -  PERMIT (白名单类型) -  DENY (黑名单类型)
     * @return aclType
     */
    public AclTypeEnum getAclType() {
        return aclType;
    }

    public void setAclType(AclTypeEnum aclType) {
        this.aclType = aclType;
    }

    public ApiAclCreate withAclValue(String aclValue) {
        this.aclValue = aclValue;
        return this;
    }

    /**
     * ACL策略值，支持一个或多个值，使用英文半角逗号分隔
     * @return aclValue
     */
    public String getAclValue() {
        return aclValue;
    }

    public void setAclValue(String aclValue) {
        this.aclValue = aclValue;
    }

    public ApiAclCreate withEntityType(EntityTypeEnum entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 对象类型： - IP：IP地址 - DOMAIN：帐号名 - DOMAIN_ID：帐号ID
     * @return entityType
     */
    public EntityTypeEnum getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityTypeEnum entityType) {
        this.entityType = entityType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiAclCreate that = (ApiAclCreate) obj;
        return Objects.equals(this.aclName, that.aclName) && Objects.equals(this.aclType, that.aclType)
            && Objects.equals(this.aclValue, that.aclValue) && Objects.equals(this.entityType, that.entityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclName, aclType, aclValue, entityType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAclCreate {\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
        sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
        sb.append("    aclValue: ").append(toIndentedString(aclValue)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
