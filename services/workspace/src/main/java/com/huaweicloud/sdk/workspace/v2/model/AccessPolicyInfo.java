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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BlacklistTypeEnum(value));
        }

        public static BlacklistTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public AccessPolicyInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名，当前只支持专线接入策略名。 * PRIVATE_ACCESS： 专线接入
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessPolicyInfo that = (AccessPolicyInfo) obj;
        return Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.blacklistType, that.blacklistType);
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
