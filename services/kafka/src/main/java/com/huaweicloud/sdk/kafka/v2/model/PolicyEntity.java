package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PolicyEntity
 */
public class PolicyEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private Boolean owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    /**
     * 权限类型。 - all：拥有发布、订阅权限; - pub：拥有发布权限; - sub：拥有订阅权限。
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
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessPolicyEnum(value);
            }
            return result;
        }

        public static AccessPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "access_policy")

    private AccessPolicyEnum accessPolicy;

    public PolicyEntity withOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 是否为创建topic时所选择的用户。
     * @return owner
     */
    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public PolicyEntity withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PolicyEntity withAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * 权限类型。 - all：拥有发布、订阅权限; - pub：拥有发布权限; - sub：拥有订阅权限。
     * @return accessPolicy
     */
    public AccessPolicyEnum getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyEntity policyEntity = (PolicyEntity) o;
        return Objects.equals(this.owner, policyEntity.owner) && Objects.equals(this.userName, policyEntity.userName)
            && Objects.equals(this.accessPolicy, policyEntity.accessPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, userName, accessPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyEntity {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
