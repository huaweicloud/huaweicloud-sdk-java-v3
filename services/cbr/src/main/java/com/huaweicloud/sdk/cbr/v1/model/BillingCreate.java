package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建参数
 */
public class BillingCreate {

    /**
     * 云平台，公有云或者混合云
     */
    public static final class CloudTypeEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final CloudTypeEnum PUBLIC = new CloudTypeEnum("public");

        /**
         * Enum HYBRID for value: "hybrid"
         */
        public static final CloudTypeEnum HYBRID = new CloudTypeEnum("hybrid");

        private static final Map<String, CloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloudTypeEnum> createStaticFields() {
            Map<String, CloudTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("hybrid", HYBRID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloudTypeEnum(String value) {
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
        public static CloudTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CloudTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CloudTypeEnum(value);
            }
            return result;
        }

        public static CloudTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CloudTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CloudTypeEnum) {
                return this.value.equals(((CloudTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private CloudTypeEnum cloudType;

    /**
     * 规格，崩溃一致性（crash_consistent）或应用一致性（app_consistent）
     */
    public static final class ConsistentLevelEnum {

        /**
         * Enum APP_CONSISTENT for value: "app_consistent"
         */
        public static final ConsistentLevelEnum APP_CONSISTENT = new ConsistentLevelEnum("app_consistent");

        /**
         * Enum CRASH_CONSISTENT for value: "crash_consistent"
         */
        public static final ConsistentLevelEnum CRASH_CONSISTENT = new ConsistentLevelEnum("crash_consistent");

        private static final Map<String, ConsistentLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsistentLevelEnum> createStaticFields() {
            Map<String, ConsistentLevelEnum> map = new HashMap<>();
            map.put("app_consistent", APP_CONSISTENT);
            map.put("crash_consistent", CRASH_CONSISTENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsistentLevelEnum(String value) {
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
        public static ConsistentLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConsistentLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConsistentLevelEnum(value);
            }
            return result;
        }

        public static ConsistentLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConsistentLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConsistentLevelEnum) {
                return this.value.equals(((ConsistentLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistent_level")

    private ConsistentLevelEnum consistentLevel;

    /**
     * 对象类型：云服务器（server），云硬盘（disk），文件系统（turbo）。
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum SERVER for value: "server"
         */
        public static final ObjectTypeEnum SERVER = new ObjectTypeEnum("server");

        /**
         * Enum DISK for value: "disk"
         */
        public static final ObjectTypeEnum DISK = new ObjectTypeEnum("disk");

        /**
         * Enum TURBO for value: "turbo"
         */
        public static final ObjectTypeEnum TURBO = new ObjectTypeEnum("turbo");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("server", SERVER);
            map.put("disk", DISK);
            map.put("turbo", TURBO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
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
        public static ObjectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectTypeEnum(value);
            }
            return result;
        }

        public static ObjectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private ObjectTypeEnum objectType;

    /**
     * 保护类型：备份（backup）、复制(replication)
     */
    public static final class ProtectTypeEnum {

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final ProtectTypeEnum BACKUP = new ProtectTypeEnum("backup");

        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final ProtectTypeEnum REPLICATION = new ProtectTypeEnum("replication");

        private static final Map<String, ProtectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectTypeEnum> createStaticFields() {
            Map<String, ProtectTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("replication", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectTypeEnum(String value) {
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
        public static ProtectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtectTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectTypeEnum(value);
            }
            return result;
        }

        public static ProtectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtectTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectTypeEnum) {
                return this.value.equals(((ProtectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private ProtectTypeEnum protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 创建模式，按需：post_paid，包周期：pre_paid，默认为post_paid
     */
    public static final class ChargingModeEnum {

        /**
         * Enum POST_PAID for value: "post_paid"
         */
        public static final ChargingModeEnum POST_PAID = new ChargingModeEnum("post_paid");

        /**
         * Enum PRE_PAID for value: "pre_paid"
         */
        public static final ChargingModeEnum PRE_PAID = new ChargingModeEnum("pre_paid");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("post_paid", POST_PAID);
            map.put("pre_paid", PRE_PAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargingModeEnum(value);
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    /**
     * 创建类型，charging_mode为pre_paid必填，按年(year)或者按月(month)
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");

        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("year", YEAR);
            map.put("month", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodTypeEnum(String value) {
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
        public static PeriodTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PeriodTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodTypeEnum(value);
            }
            return result;
        }

        public static PeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PeriodTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private PeriodTypeEnum periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_url")

    private String consoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private BillbingCreateExtraInfo extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_az")

    private Boolean isMultiAz;

    public BillingCreate withCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 云平台，公有云或者混合云
     * @return cloudType
     */
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public BillingCreate withConsistentLevel(ConsistentLevelEnum consistentLevel) {
        this.consistentLevel = consistentLevel;
        return this;
    }

    /**
     * 规格，崩溃一致性（crash_consistent）或应用一致性（app_consistent）
     * @return consistentLevel
     */
    public ConsistentLevelEnum getConsistentLevel() {
        return consistentLevel;
    }

    public void setConsistentLevel(ConsistentLevelEnum consistentLevel) {
        this.consistentLevel = consistentLevel;
    }

    public BillingCreate withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型：云服务器（server），云硬盘（disk），文件系统（turbo）。
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public BillingCreate withProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * 保护类型：备份（backup）、复制(replication)
     * @return protectType
     */
    public ProtectTypeEnum getProtectType() {
        return protectType;
    }

    public void setProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
    }

    public BillingCreate withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 容量，单位GB
     * minimum: 1
     * maximum: 10485760
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BillingCreate withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 创建模式，按需：post_paid，包周期：pre_paid，默认为post_paid
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public BillingCreate withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 创建类型，charging_mode为pre_paid必填，按年(year)或者按月(month)
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public BillingCreate withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 创建类型的数量，charging_mode为pre_paid必填
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public BillingCreate withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 到期后是否自动续期，默认不续期
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public BillingCreate withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动付费，默认为不自动付费
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public BillingCreate withConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
        return this;
    }

    /**
     * 跳转URL
     * @return consoleUrl
     */
    public String getConsoleUrl() {
        return consoleUrl;
    }

    public void setConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
    }

    public BillingCreate withExtraInfo(BillbingCreateExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public BillingCreate withExtraInfo(Consumer<BillbingCreateExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new BillbingCreateExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public BillbingCreateExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(BillbingCreateExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public BillingCreate withIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
        return this;
    }

    /**
     * 存储库多az属性，默认为false
     * @return isMultiAz
     */
    public Boolean getIsMultiAz() {
        return isMultiAz;
    }

    public void setIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingCreate billingCreate = (BillingCreate) o;
        return Objects.equals(this.cloudType, billingCreate.cloudType)
            && Objects.equals(this.consistentLevel, billingCreate.consistentLevel)
            && Objects.equals(this.objectType, billingCreate.objectType)
            && Objects.equals(this.protectType, billingCreate.protectType)
            && Objects.equals(this.size, billingCreate.size)
            && Objects.equals(this.chargingMode, billingCreate.chargingMode)
            && Objects.equals(this.periodType, billingCreate.periodType)
            && Objects.equals(this.periodNum, billingCreate.periodNum)
            && Objects.equals(this.isAutoRenew, billingCreate.isAutoRenew)
            && Objects.equals(this.isAutoPay, billingCreate.isAutoPay)
            && Objects.equals(this.consoleUrl, billingCreate.consoleUrl)
            && Objects.equals(this.extraInfo, billingCreate.extraInfo)
            && Objects.equals(this.isMultiAz, billingCreate.isMultiAz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudType,
            consistentLevel,
            objectType,
            protectType,
            size,
            chargingMode,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            consoleUrl,
            extraInfo,
            isMultiAz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingCreate {\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    consistentLevel: ").append(toIndentedString(consistentLevel)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    consoleUrl: ").append(toIndentedString(consoleUrl)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
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
