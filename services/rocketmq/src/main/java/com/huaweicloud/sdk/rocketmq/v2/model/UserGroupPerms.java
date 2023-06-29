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
 * UserGroupPerms
 */
public class UserGroupPerms {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 权限。
     */
    public static final class PermEnum {

        /**
         * Enum SUB for value: "SUB"
         */
        public static final PermEnum SUB = new PermEnum("SUB");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final PermEnum DENY = new PermEnum("DENY");

        private static final Map<String, PermEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermEnum> createStaticFields() {
            Map<String, PermEnum> map = new HashMap<>();
            map.put("SUB", SUB);
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

    public UserGroupPerms withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消费组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserGroupPerms withPerm(PermEnum perm) {
        this.perm = perm;
        return this;
    }

    /**
     * 权限。
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
        UserGroupPerms that = (UserGroupPerms) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.perm, that.perm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, perm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserGroupPerms {\n");
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
