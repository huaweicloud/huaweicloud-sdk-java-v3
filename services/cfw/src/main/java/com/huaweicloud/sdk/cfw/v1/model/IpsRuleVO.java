package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * IpsRuleVO
 */
public class IpsRuleVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_application")

    private String affectedApplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    /**
     * Gets or Sets defaultStatus
     */
    public static final class DefaultStatusEnum {

        /**
         * Enum OBSERVE for value: "OBSERVE"
         */
        public static final DefaultStatusEnum OBSERVE = new DefaultStatusEnum("OBSERVE");

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final DefaultStatusEnum ENABLE = new DefaultStatusEnum("ENABLE");

        /**
         * Enum CLOSE for value: "CLOSE"
         */
        public static final DefaultStatusEnum CLOSE = new DefaultStatusEnum("CLOSE");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final DefaultStatusEnum DEFAULT = new DefaultStatusEnum("DEFAULT");

        /**
         * Enum ALL_DEFAULT for value: "ALL_DEFAULT"
         */
        public static final DefaultStatusEnum ALL_DEFAULT = new DefaultStatusEnum("ALL_DEFAULT");

        private static final Map<String, DefaultStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DefaultStatusEnum> createStaticFields() {
            Map<String, DefaultStatusEnum> map = new HashMap<>();
            map.put("OBSERVE", OBSERVE);
            map.put("ENABLE", ENABLE);
            map.put("CLOSE", CLOSE);
            map.put("DEFAULT", DEFAULT);
            map.put("ALL_DEFAULT", ALL_DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DefaultStatusEnum(String value) {
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
        public static DefaultStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DefaultStatusEnum(value));
        }

        public static DefaultStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DefaultStatusEnum) {
                return this.value.equals(((DefaultStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_status")

    private DefaultStatusEnum defaultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_cve")

    private String ipsCve;

    /**
     * Gets or Sets ipsGroup
     */
    public static final class IpsGroupEnum {

        /**
         * Enum OBSERVE for value: "OBSERVE"
         */
        public static final IpsGroupEnum OBSERVE = new IpsGroupEnum("OBSERVE");

        /**
         * Enum STRICTLY for value: "STRICTLY"
         */
        public static final IpsGroupEnum STRICTLY = new IpsGroupEnum("STRICTLY");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final IpsGroupEnum MEDIUM = new IpsGroupEnum("MEDIUM");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final IpsGroupEnum LOW = new IpsGroupEnum("LOW");

        private static final Map<String, IpsGroupEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpsGroupEnum> createStaticFields() {
            Map<String, IpsGroupEnum> map = new HashMap<>();
            map.put("OBSERVE", OBSERVE);
            map.put("STRICTLY", STRICTLY);
            map.put("MEDIUM", MEDIUM);
            map.put("LOW", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpsGroupEnum(String value) {
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
        public static IpsGroupEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpsGroupEnum(value));
        }

        public static IpsGroupEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpsGroupEnum) {
                return this.value.equals(((IpsGroupEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_group")

    private IpsGroupEnum ipsGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_id")

    private String ipsId;

    /**
     * Gets or Sets ipsLevel
     */
    public static final class IpsLevelEnum {

        /**
         * Enum FATAL for value: "FATAL"
         */
        public static final IpsLevelEnum FATAL = new IpsLevelEnum("FATAL");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final IpsLevelEnum HIGH = new IpsLevelEnum("HIGH");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final IpsLevelEnum MEDIUM = new IpsLevelEnum("MEDIUM");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final IpsLevelEnum LOW = new IpsLevelEnum("LOW");

        /**
         * Enum UNKNOWNS for value: "UNKNOWNS"
         */
        public static final IpsLevelEnum UNKNOWNS = new IpsLevelEnum("UNKNOWNS");

        private static final Map<String, IpsLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpsLevelEnum> createStaticFields() {
            Map<String, IpsLevelEnum> map = new HashMap<>();
            map.put("FATAL", FATAL);
            map.put("HIGH", HIGH);
            map.put("MEDIUM", MEDIUM);
            map.put("LOW", LOW);
            map.put("UNKNOWNS", UNKNOWNS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpsLevelEnum(String value) {
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
        public static IpsLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpsLevelEnum(value));
        }

        public static IpsLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpsLevelEnum) {
                return this.value.equals(((IpsLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_level")

    private IpsLevelEnum ipsLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_name")

    private String ipsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_rules_type")

    private String ipsRulesType;

    /**
     * Gets or Sets ipsStatus
     */
    public static final class IpsStatusEnum {

        /**
         * Enum OBSERVE for value: "OBSERVE"
         */
        public static final IpsStatusEnum OBSERVE = new IpsStatusEnum("OBSERVE");

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final IpsStatusEnum ENABLE = new IpsStatusEnum("ENABLE");

        /**
         * Enum CLOSE for value: "CLOSE"
         */
        public static final IpsStatusEnum CLOSE = new IpsStatusEnum("CLOSE");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final IpsStatusEnum DEFAULT = new IpsStatusEnum("DEFAULT");

        /**
         * Enum ALL_DEFAULT for value: "ALL_DEFAULT"
         */
        public static final IpsStatusEnum ALL_DEFAULT = new IpsStatusEnum("ALL_DEFAULT");

        private static final Map<String, IpsStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpsStatusEnum> createStaticFields() {
            Map<String, IpsStatusEnum> map = new HashMap<>();
            map.put("OBSERVE", OBSERVE);
            map.put("ENABLE", ENABLE);
            map.put("CLOSE", CLOSE);
            map.put("DEFAULT", DEFAULT);
            map.put("ALL_DEFAULT", ALL_DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpsStatusEnum(String value) {
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
        public static IpsStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpsStatusEnum(value));
        }

        public static IpsStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpsStatusEnum) {
                return this.value.equals(((IpsStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_status")

    private IpsStatusEnum ipsStatus;

    public IpsRuleVO withAffectedApplication(String affectedApplication) {
        this.affectedApplication = affectedApplication;
        return this;
    }

    /**
     * Get affectedApplication
     * @return affectedApplication
     */
    public String getAffectedApplication() {
        return affectedApplication;
    }

    public void setAffectedApplication(String affectedApplication) {
        this.affectedApplication = affectedApplication;
    }

    public IpsRuleVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public IpsRuleVO withDefaultStatus(DefaultStatusEnum defaultStatus) {
        this.defaultStatus = defaultStatus;
        return this;
    }

    /**
     * Get defaultStatus
     * @return defaultStatus
     */
    public DefaultStatusEnum getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(DefaultStatusEnum defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public IpsRuleVO withIpsCve(String ipsCve) {
        this.ipsCve = ipsCve;
        return this;
    }

    /**
     * Get ipsCve
     * @return ipsCve
     */
    public String getIpsCve() {
        return ipsCve;
    }

    public void setIpsCve(String ipsCve) {
        this.ipsCve = ipsCve;
    }

    public IpsRuleVO withIpsGroup(IpsGroupEnum ipsGroup) {
        this.ipsGroup = ipsGroup;
        return this;
    }

    /**
     * Get ipsGroup
     * @return ipsGroup
     */
    public IpsGroupEnum getIpsGroup() {
        return ipsGroup;
    }

    public void setIpsGroup(IpsGroupEnum ipsGroup) {
        this.ipsGroup = ipsGroup;
    }

    public IpsRuleVO withIpsId(String ipsId) {
        this.ipsId = ipsId;
        return this;
    }

    /**
     * Get ipsId
     * @return ipsId
     */
    public String getIpsId() {
        return ipsId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }

    public IpsRuleVO withIpsLevel(IpsLevelEnum ipsLevel) {
        this.ipsLevel = ipsLevel;
        return this;
    }

    /**
     * Get ipsLevel
     * @return ipsLevel
     */
    public IpsLevelEnum getIpsLevel() {
        return ipsLevel;
    }

    public void setIpsLevel(IpsLevelEnum ipsLevel) {
        this.ipsLevel = ipsLevel;
    }

    public IpsRuleVO withIpsName(String ipsName) {
        this.ipsName = ipsName;
        return this;
    }

    /**
     * Get ipsName
     * @return ipsName
     */
    public String getIpsName() {
        return ipsName;
    }

    public void setIpsName(String ipsName) {
        this.ipsName = ipsName;
    }

    public IpsRuleVO withIpsRulesType(String ipsRulesType) {
        this.ipsRulesType = ipsRulesType;
        return this;
    }

    /**
     * Get ipsRulesType
     * @return ipsRulesType
     */
    public String getIpsRulesType() {
        return ipsRulesType;
    }

    public void setIpsRulesType(String ipsRulesType) {
        this.ipsRulesType = ipsRulesType;
    }

    public IpsRuleVO withIpsStatus(IpsStatusEnum ipsStatus) {
        this.ipsStatus = ipsStatus;
        return this;
    }

    /**
     * Get ipsStatus
     * @return ipsStatus
     */
    public IpsStatusEnum getIpsStatus() {
        return ipsStatus;
    }

    public void setIpsStatus(IpsStatusEnum ipsStatus) {
        this.ipsStatus = ipsStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpsRuleVO that = (IpsRuleVO) obj;
        return Objects.equals(this.affectedApplication, that.affectedApplication)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.defaultStatus, that.defaultStatus) && Objects.equals(this.ipsCve, that.ipsCve)
            && Objects.equals(this.ipsGroup, that.ipsGroup) && Objects.equals(this.ipsId, that.ipsId)
            && Objects.equals(this.ipsLevel, that.ipsLevel) && Objects.equals(this.ipsName, that.ipsName)
            && Objects.equals(this.ipsRulesType, that.ipsRulesType) && Objects.equals(this.ipsStatus, that.ipsStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affectedApplication,
            createTime,
            defaultStatus,
            ipsCve,
            ipsGroup,
            ipsId,
            ipsLevel,
            ipsName,
            ipsRulesType,
            ipsStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsRuleVO {\n");
        sb.append("    affectedApplication: ").append(toIndentedString(affectedApplication)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    defaultStatus: ").append(toIndentedString(defaultStatus)).append("\n");
        sb.append("    ipsCve: ").append(toIndentedString(ipsCve)).append("\n");
        sb.append("    ipsGroup: ").append(toIndentedString(ipsGroup)).append("\n");
        sb.append("    ipsId: ").append(toIndentedString(ipsId)).append("\n");
        sb.append("    ipsLevel: ").append(toIndentedString(ipsLevel)).append("\n");
        sb.append("    ipsName: ").append(toIndentedString(ipsName)).append("\n");
        sb.append("    ipsRulesType: ").append(toIndentedString(ipsRulesType)).append("\n");
        sb.append("    ipsStatus: ").append(toIndentedString(ipsStatus)).append("\n");
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
