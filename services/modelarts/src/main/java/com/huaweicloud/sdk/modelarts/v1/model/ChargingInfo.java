package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ChargingInfo
 */
public class ChargingInfo {

    /**
     * **参数解释**：付费类型。表示服务器的计费模式。 **约束限制**：不涉及。 **取值范围**： - COMMON：同时支持包周期和按需 - POST_PAID：后付费 - PRE_PAID：预付费 **默认取值**：不涉及。
     */
    public static final class ChargingModeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ChargingModeEnum COMMON = new ChargingModeEnum("COMMON");

        /**
         * Enum POST_PAID for value: "POST_PAID"
         */
        public static final ChargingModeEnum POST_PAID = new ChargingModeEnum("POST_PAID");

        /**
         * Enum PRE_PAID for value: "PRE_PAID"
         */
        public static final ChargingModeEnum PRE_PAID = new ChargingModeEnum("PRE_PAID");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("POST_PAID", POST_PAID);
            map.put("PRE_PAID", PRE_PAID);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    /**
     * **参数解释**：订购周期类型。表示订购周期的时间单位。 **约束限制**：不涉及。 **取值范围**： - ABSOLUTE - DAY：天 - HOUR：小时 - MONTH：月 - WEEK：周 - YEAR：年 **默认取值**：不涉及。
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum ABSOLUTE for value: "ABSOLUTE"
         */
        public static final PeriodTypeEnum ABSOLUTE = new PeriodTypeEnum("ABSOLUTE");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final PeriodTypeEnum DAY = new PeriodTypeEnum("DAY");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final PeriodTypeEnum HOUR = new PeriodTypeEnum("HOUR");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("MONTH");

        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final PeriodTypeEnum WEEK = new PeriodTypeEnum("WEEK");

        /**
         * Enum YEAR for value: "YEAR"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("YEAR");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("ABSOLUTE", ABSOLUTE);
            map.put("DAY", DAY);
            map.put("HOUR", HOUR);
            map.put("MONTH", MONTH);
            map.put("WEEK", WEEK);
            map.put("YEAR", YEAR);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public ChargingInfo withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**：付费类型。表示服务器的计费模式。 **约束限制**：不涉及。 **取值范围**： - COMMON：同时支持包周期和按需 - POST_PAID：后付费 - PRE_PAID：预付费 **默认取值**：不涉及。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ChargingInfo withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * **参数解释**：是否自动支付。表示是否开启自动支付功能。 **约束限制**：不涉及。 **取值范围**： - true：自动支付 - false：不自动支付 **默认取值**：不涉及。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public ChargingInfo withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * **参数解释**：是否自动续订。表示是否开启自动续订功能。 **约束限制**：不涉及。 **取值范围**： - true：自动续订 - false：不自动续订 **默认取值**：不涉及。
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ChargingInfo withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * **参数解释**：订购周期数量。表示订购周期的数量。 **约束限制**：不涉及。 **取值范围**：1 - 11 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 11
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ChargingInfo withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * **参数解释**：订购周期类型。表示订购周期的时间单位。 **约束限制**：不涉及。 **取值范围**： - ABSOLUTE - DAY：天 - HOUR：小时 - MONTH：月 - WEEK：周 - YEAR：年 **默认取值**：不涉及。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChargingInfo that = (ChargingInfo) obj;
        return Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.periodType, that.periodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, isAutoPay, isAutoRenew, periodNum, periodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChargingInfo {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
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
