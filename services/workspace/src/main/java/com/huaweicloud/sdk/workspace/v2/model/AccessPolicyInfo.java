package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

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

    /**
     * 访问控制类型。默认为接入类型 * ACCESS_TYPE： 接入类型 * IP_WHITE_LIST： IP白名单
     */
    public static final class AccessControlTypeEnum {

        /**
         * Enum ACCESS_TYPE for value: "ACCESS_TYPE"
         */
        public static final AccessControlTypeEnum ACCESS_TYPE = new AccessControlTypeEnum("ACCESS_TYPE");

        /**
         * Enum IP_WHITE_LIST for value: "IP_WHITE_LIST"
         */
        public static final AccessControlTypeEnum IP_WHITE_LIST = new AccessControlTypeEnum("IP_WHITE_LIST");

        private static final Map<String, AccessControlTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessControlTypeEnum> createStaticFields() {
            Map<String, AccessControlTypeEnum> map = new HashMap<>();
            map.put("ACCESS_TYPE", ACCESS_TYPE);
            map.put("IP_WHITE_LIST", IP_WHITE_LIST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessControlTypeEnum(String value) {
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
        public static AccessControlTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessControlTypeEnum(value));
        }

        public static AccessControlTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessControlTypeEnum) {
                return this.value.equals(((AccessControlTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_type")

    private AccessControlTypeEnum accessControlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<IpInfo> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Boolean isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_block_all")

    private Boolean isBlockAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_total_count")

    private Integer ipTotalCount;

    public AccessPolicyInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名。
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

    public AccessPolicyInfo withAccessControlType(AccessControlTypeEnum accessControlType) {
        this.accessControlType = accessControlType;
        return this;
    }

    /**
     * 访问控制类型。默认为接入类型 * ACCESS_TYPE： 接入类型 * IP_WHITE_LIST： IP白名单
     * @return accessControlType
     */
    public AccessControlTypeEnum getAccessControlType() {
        return accessControlType;
    }

    public void setAccessControlType(AccessControlTypeEnum accessControlType) {
        this.accessControlType = accessControlType;
    }

    public AccessPolicyInfo withIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
        return this;
    }

    public AccessPolicyInfo addIpListItem(IpInfo ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public AccessPolicyInfo withIpList(Consumer<List<IpInfo>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * 策略的ip列表。
     * @return ipList
     */
    public List<IpInfo> getIpList() {
        return ipList;
    }

    public void setIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
    }

    public AccessPolicyInfo withIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * IP白名单是否生效。只能单独更新，此值的优先级最高，传此值只修改该策略是否生效。
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public AccessPolicyInfo withIsBlockAll(Boolean isBlockAll) {
        this.isBlockAll = isBlockAll;
        return this;
    }

    /**
     * IP白名单是否禁止所有Ip接入。is_enable为false时，无法修改此值。此值也只能单独更新。
     * @return isBlockAll
     */
    public Boolean getIsBlockAll() {
        return isBlockAll;
    }

    public void setIsBlockAll(Boolean isBlockAll) {
        this.isBlockAll = isBlockAll;
    }

    public AccessPolicyInfo withIpTotalCount(Integer ipTotalCount) {
        this.ipTotalCount = ipTotalCount;
        return this;
    }

    /**
     * 策略总数。
     * minimum: 0
     * maximum: 1000
     * @return ipTotalCount
     */
    public Integer getIpTotalCount() {
        return ipTotalCount;
    }

    public void setIpTotalCount(Integer ipTotalCount) {
        this.ipTotalCount = ipTotalCount;
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
            && Objects.equals(this.blacklistType, that.blacklistType)
            && Objects.equals(this.accessControlType, that.accessControlType)
            && Objects.equals(this.ipList, that.ipList) && Objects.equals(this.isEnable, that.isEnable)
            && Objects.equals(this.isBlockAll, that.isBlockAll) && Objects.equals(this.ipTotalCount, that.ipTotalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, blacklistType, accessControlType, ipList, isEnable, isBlockAll, ipTotalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicyInfo {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    blacklistType: ").append(toIndentedString(blacklistType)).append("\n");
        sb.append("    accessControlType: ").append(toIndentedString(accessControlType)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    isBlockAll: ").append(toIndentedString(isBlockAll)).append("\n");
        sb.append("    ipTotalCount: ").append(toIndentedString(ipTotalCount)).append("\n");
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
