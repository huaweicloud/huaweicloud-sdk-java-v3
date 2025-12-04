package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UserPolicyEntity
 */
public class UserPolicyEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    /**
     * **参数解释**： 匹配方式。 **约束限制**： 不涉及。 **取值范围**： - LITERAL：完全匹配。 - PREFIXED：前缀匹配。 **默认取值**： 不涉及。
     */
    public static final class PatternTypeEnum {

        /**
         * Enum LITERAL for value: "LITERAL"
         */
        public static final PatternTypeEnum LITERAL = new PatternTypeEnum("LITERAL");

        /**
         * Enum PREFIXED for value: "PREFIXED"
         */
        public static final PatternTypeEnum PREFIXED = new PatternTypeEnum("PREFIXED");

        private static final Map<String, PatternTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PatternTypeEnum> createStaticFields() {
            Map<String, PatternTypeEnum> map = new HashMap<>();
            map.put("LITERAL", LITERAL);
            map.put("PREFIXED", PREFIXED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PatternTypeEnum(String value) {
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
        public static PatternTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PatternTypeEnum(value));
        }

        public static PatternTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PatternTypeEnum) {
                return this.value.equals(((PatternTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern_type")

    private PatternTypeEnum patternType;

    /**
     * **参数解释**： 权限类型。 **约束限制**： 不涉及。 **取值范围**： - all：拥有发布、订阅权限。 - pub：拥有发布权限。 - sub：拥有订阅权限。 **默认取值**： 不涉及。
     */
    public static final class AccessPolicyEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final AccessPolicyEnum ALL = new AccessPolicyEnum("all");

        /**
         * Enum PUB for value: "pub"
         */
        public static final AccessPolicyEnum PUB = new AccessPolicyEnum("pub");

        /**
         * Enum SUB for value: "sub"
         */
        public static final AccessPolicyEnum SUB = new AccessPolicyEnum("sub");

        private static final Map<String, AccessPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessPolicyEnum> createStaticFields() {
            Map<String, AccessPolicyEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("pub", PUB);
            map.put("sub", SUB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessPolicyEnum(String value) {
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
        public static AccessPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessPolicyEnum(value));
        }

        public static AccessPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessPolicyEnum) {
                return this.value.equals(((AccessPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    private AccessPolicyEnum accessPolicy;

    public UserPolicyEntity withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数解释**： 资源类型。 **约束限制**： 不涉及。 **取值范围**： - TOPIC：表示资源类型为Topic。 **默认取值**： TOPIC
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UserPolicyEntity withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释**： 资源名称。 **约束限制**： 不涉及。 **取值范围**： - 已有的Topic名称。 - 符合Topic名称规则的前缀。 - “*”表示匹配所有的Topic。 **默认取值**： 不涉及。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public UserPolicyEntity withPatternType(PatternTypeEnum patternType) {
        this.patternType = patternType;
        return this;
    }

    /**
     * **参数解释**： 匹配方式。 **约束限制**： 不涉及。 **取值范围**： - LITERAL：完全匹配。 - PREFIXED：前缀匹配。 **默认取值**： 不涉及。
     * @return patternType
     */
    public PatternTypeEnum getPatternType() {
        return patternType;
    }

    public void setPatternType(PatternTypeEnum patternType) {
        this.patternType = patternType;
    }

    public UserPolicyEntity withAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * **参数解释**： 权限类型。 **约束限制**： 不涉及。 **取值范围**： - all：拥有发布、订阅权限。 - pub：拥有发布权限。 - sub：拥有订阅权限。 **默认取值**： 不涉及。
     * @return accessPolicy
     */
    public AccessPolicyEnum getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserPolicyEntity that = (UserPolicyEntity) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.patternType, that.patternType)
            && Objects.equals(this.accessPolicy, that.accessPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceName, patternType, accessPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPolicyEntity {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
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
