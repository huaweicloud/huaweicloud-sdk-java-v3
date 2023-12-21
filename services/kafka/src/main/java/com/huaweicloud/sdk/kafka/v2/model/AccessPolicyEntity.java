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
 * 权限实体。
 */
public class AccessPolicyEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    /**
     * 权限类型。 - all：拥有发布、订阅权限; - pub：拥有发布权限; - sub：拥有订阅权限。  设置用户权限时，为必选参数。
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

    public AccessPolicyEntity withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。  设置用户权限时，为必选参数。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AccessPolicyEntity withAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * 权限类型。 - all：拥有发布、订阅权限; - pub：拥有发布权限; - sub：拥有订阅权限。  设置用户权限时，为必选参数。
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
        AccessPolicyEntity that = (AccessPolicyEntity) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.accessPolicy, that.accessPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, accessPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicyEntity {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
