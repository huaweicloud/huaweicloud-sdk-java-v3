package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAclStrategyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_name")

    private String aclName;

    /**
     * 类型。 - PERMIT：白名单类型 - DENY：黑名单类型 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_type")

    private String entityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public CreateAclStrategyV2Response withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    /**
     * 名称
     * @return aclName
     */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public CreateAclStrategyV2Response withAclType(AclTypeEnum aclType) {
        this.aclType = aclType;
        return this;
    }

    /**
     * 类型。 - PERMIT：白名单类型 - DENY：黑名单类型 
     * @return aclType
     */
    public AclTypeEnum getAclType() {
        return aclType;
    }

    public void setAclType(AclTypeEnum aclType) {
        this.aclType = aclType;
    }

    public CreateAclStrategyV2Response withAclValue(String aclValue) {
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

    public CreateAclStrategyV2Response withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 对象类型： - IP - DOMAIN - DOMAIN_ID
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public CreateAclStrategyV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAclStrategyV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
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
        CreateAclStrategyV2Response that = (CreateAclStrategyV2Response) obj;
        return Objects.equals(this.aclName, that.aclName) && Objects.equals(this.aclType, that.aclType)
            && Objects.equals(this.aclValue, that.aclValue) && Objects.equals(this.entityType, that.entityType)
            && Objects.equals(this.id, that.id) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclName, aclType, aclValue, entityType, id, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAclStrategyV2Response {\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
        sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
        sb.append("    aclValue: ").append(toIndentedString(aclValue)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
