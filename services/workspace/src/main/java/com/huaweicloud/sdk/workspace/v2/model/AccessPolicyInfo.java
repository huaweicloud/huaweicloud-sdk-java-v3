package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AccessPolicyInfo
 */
public class AccessPolicyInfo {

    /**
     * 策略名，当前只支持专线接入策略名。 * PRIVATE_ACCESS： 专线接入
     */
    public static final class PolicyNameEnum {

        /**
         * Enum PRIVATE_ACCESS for value: "PRIVATE_ACCESS"
         */
        public static final PolicyNameEnum PRIVATE_ACCESS = new PolicyNameEnum("PRIVATE_ACCESS");

        private static final Map<String, PolicyNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyNameEnum> createStaticFields() {
            Map<String, PolicyNameEnum> map = new HashMap<>();
            map.put("PRIVATE_ACCESS", PRIVATE_ACCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyNameEnum(String value) {
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
        public static PolicyNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PolicyNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PolicyNameEnum(value);
            }
            return result;
        }

        public static PolicyNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PolicyNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyNameEnum) {
                return this.value.equals(((PolicyNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private PolicyNameEnum policyName;

    /**
     * 黑名单类型，当前黑名单只支持互联网。 * INTERNET： 互联网
     */
    public static final class BlacklistTypeEnum {

        /**
         * Enum INTERNET for value: "INTERNET"
         */
        public static final BlacklistTypeEnum INTERNET = new BlacklistTypeEnum("INTERNET");

        private static final Map<String, BlacklistTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BlacklistTypeEnum> createStaticFields() {
            Map<String, BlacklistTypeEnum> map = new HashMap<>();
            map.put("INTERNET", INTERNET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BlacklistTypeEnum(String value) {
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
        public static BlacklistTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BlacklistTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BlacklistTypeEnum(value);
            }
            return result;
        }

        public static BlacklistTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BlacklistTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BlacklistTypeEnum) {
                return this.value.equals(((BlacklistTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blacklist_type")

    private BlacklistTypeEnum blacklistType;

    public AccessPolicyInfo withPolicyName(PolicyNameEnum policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名，当前只支持专线接入策略名。 * PRIVATE_ACCESS： 专线接入
     * @return policyName
     */
    public PolicyNameEnum getPolicyName() {
        return policyName;
    }

    public void setPolicyName(PolicyNameEnum policyName) {
        this.policyName = policyName;
    }

    public AccessPolicyInfo withBlacklistType(BlacklistTypeEnum blacklistType) {
        this.blacklistType = blacklistType;
        return this;
    }

    /**
     * 黑名单类型，当前黑名单只支持互联网。 * INTERNET： 互联网
     * @return blacklistType
     */
    public BlacklistTypeEnum getBlacklistType() {
        return blacklistType;
    }

    public void setBlacklistType(BlacklistTypeEnum blacklistType) {
        this.blacklistType = blacklistType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessPolicyInfo accessPolicyInfo = (AccessPolicyInfo) o;
        return Objects.equals(this.policyName, accessPolicyInfo.policyName)
            && Objects.equals(this.blacklistType, accessPolicyInfo.blacklistType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, blacklistType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicyInfo {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    blacklistType: ").append(toIndentedString(blacklistType)).append("\n");
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
