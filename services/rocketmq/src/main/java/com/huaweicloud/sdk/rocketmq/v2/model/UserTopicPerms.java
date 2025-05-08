package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UserTopicPerms
 */
public class UserTopicPerms {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释**： Topic权限。 **约束限制**： 不涉及。 **取值范围**： - pub：拥有发布权限。 - sub：拥有订阅权限。 - PUB|sub：拥有发布订阅权限。 - DENY：无权限。  **默认取值**： 不涉及。
     */
    public static final class PermEnum {

        /**
         * Enum PUB for value: "PUB"
         */
        public static final PermEnum PUB = new PermEnum("PUB");

        /**
         * Enum SUB for value: "SUB"
         */
        public static final PermEnum SUB = new PermEnum("SUB");

        /**
         * Enum PUB_SUB for value: "PUB|SUB"
         */
        public static final PermEnum PUB_SUB = new PermEnum("PUB|SUB");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final PermEnum DENY = new PermEnum("DENY");

        private static final Map<String, PermEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermEnum> createStaticFields() {
            Map<String, PermEnum> map = new HashMap<>();
            map.put("PUB", PUB);
            map.put("SUB", SUB);
            map.put("PUB|SUB", PUB_SUB);
            map.put("DENY", DENY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermEnum(String value) {
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
        public static PermEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermEnum(value));
        }

        public static PermEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermEnum) {
                return this.value.equals(((PermEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perm")

    private PermEnum perm;

    public UserTopicPerms withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 主题名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserTopicPerms withPerm(PermEnum perm) {
        this.perm = perm;
        return this;
    }

    /**
     * **参数解释**： Topic权限。 **约束限制**： 不涉及。 **取值范围**： - pub：拥有发布权限。 - sub：拥有订阅权限。 - PUB|sub：拥有发布订阅权限。 - DENY：无权限。  **默认取值**： 不涉及。
     * @return perm
     */
    public PermEnum getPerm() {
        return perm;
    }

    public void setPerm(PermEnum perm) {
        this.perm = perm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserTopicPerms that = (UserTopicPerms) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.perm, that.perm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, perm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserTopicPerms {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
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
