package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEntitiesForPolicyV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    /**
     * 实体类型，包含user、 group 和 agency三种类型。
     */
    public static final class EntityTypeEnum {

        /**
         * Enum USER for value: "user"
         */
        public static final EntityTypeEnum USER = new EntityTypeEnum("user");

        /**
         * Enum GROUP for value: "group"
         */
        public static final EntityTypeEnum GROUP = new EntityTypeEnum("group");

        /**
         * Enum AGENCY for value: "agency"
         */
        public static final EntityTypeEnum AGENCY = new EntityTypeEnum("agency");

        private static final Map<String, EntityTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EntityTypeEnum> createStaticFields() {
            Map<String, EntityTypeEnum> map = new HashMap<>();
            map.put("user", USER);
            map.put("group", GROUP);
            map.put("agency", AGENCY);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListEntitiesForPolicyV5Request withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 身份策略ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ListEntitiesForPolicyV5Request withEntityType(EntityTypeEnum entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 实体类型，包含user、 group 和 agency三种类型。
     * @return entityType
     */
    public EntityTypeEnum getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityTypeEnum entityType) {
        this.entityType = entityType;
    }

    public ListEntitiesForPolicyV5Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，范围为1到200条，默认为100条。
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEntitiesForPolicyV5Request withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标记，长度为4到400个字符，只包含字母、数字、\"+\"、\"/\"、\"=\"、\"-\"和\"_\"的字符串。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEntitiesForPolicyV5Request that = (ListEntitiesForPolicyV5Request) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.entityType, that.entityType)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, entityType, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEntitiesForPolicyV5Request {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
