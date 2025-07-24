package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 计费参数详情
 */
public class BssInfo {

    /**
     * 是否自动续费。0表示不自动续费，1表示自动续费。
     */
    public static final class IsAutoRenewEnum {

        /**
         * Enum NUMBER_0 for value: 0L
         */
        public static final IsAutoRenewEnum NUMBER_0 = new IsAutoRenewEnum(0L);

        /**
         * Enum NUMBER_1 for value: 1L
         */
        public static final IsAutoRenewEnum NUMBER_1 = new IsAutoRenewEnum(1L);

        private static final Map<Long, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, IsAutoRenewEnum> createStaticFields() {
            Map<Long, IsAutoRenewEnum> map = new HashMap<>();
            map.put(0L, NUMBER_0);
            map.put(1L, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        IsAutoRenewEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoRenewEnum(value));
        }

        public static IsAutoRenewEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoRenewEnum) {
                return this.value.equals(((IsAutoRenewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private IsAutoRenewEnum isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Long periodNum;

    /**
     * 包周期的类型，可选包年或包月，2 表示包月，3 表示包年
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum NUMBER_2 for value: 2L
         */
        public static final PeriodTypeEnum NUMBER_2 = new PeriodTypeEnum(2L);

        /**
         * Enum NUMBER_3 for value: 3L
         */
        public static final PeriodTypeEnum NUMBER_3 = new PeriodTypeEnum(3L);

        private static final Map<Long, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, PeriodTypeEnum> createStaticFields() {
            Map<Long, PeriodTypeEnum> map = new HashMap<>();
            map.put(2L, NUMBER_2);
            map.put(3L, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        PeriodTypeEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(Long value) {
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

    /**
     * 是否生成订单后自动扣款。0表示不自动续费，1表示自动续费。
     */
    public static final class IsAutoPayEnum {

        /**
         * Enum NUMBER_0 for value: 0L
         */
        public static final IsAutoPayEnum NUMBER_0 = new IsAutoPayEnum(0L);

        /**
         * Enum NUMBER_1 for value: 1L
         */
        public static final IsAutoPayEnum NUMBER_1 = new IsAutoPayEnum(1L);

        private static final Map<Long, IsAutoPayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, IsAutoPayEnum> createStaticFields() {
            Map<Long, IsAutoPayEnum> map = new HashMap<>();
            map.put(0L, NUMBER_0);
            map.put(1L, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        IsAutoPayEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoPayEnum(value));
        }

        public static IsAutoPayEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoPayEnum) {
                return this.value.equals(((IsAutoPayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private IsAutoPayEnum isAutoPay;

    public BssInfo withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续费。0表示不自动续费，1表示自动续费。
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public BssInfo withPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 包周期订购的周期数
     * minimum: 1
     * maximum: 11
     * @return periodNum
     */
    public Long getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
    }

    public BssInfo withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 包周期的类型，可选包年或包月，2 表示包月，3 表示包年
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public BssInfo withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否生成订单后自动扣款。0表示不自动续费，1表示自动续费。
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BssInfo that = (BssInfo) obj;
        return Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.isAutoPay, that.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAutoRenew, periodNum, periodType, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BssInfo {\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
