package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 包年/包月信息体。
 */
public class PeriodOrderInfo {

    /**
     * 订购周期类型。取值： - 2：月。 - 3：年。
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final PeriodTypeEnum NUMBER_2 = new PeriodTypeEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final PeriodTypeEnum NUMBER_3 = new PeriodTypeEnum(3);

        private static final Map<Integer, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PeriodTypeEnum> createStaticFields() {
            Map<Integer, PeriodTypeEnum> map = new HashMap<>();
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PeriodTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            PeriodTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodTypeEnum(value);
            }
            return result;
        }

        public static PeriodTypeEnum valueOf(Integer value) {
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

    /**
     * 是否自动续订。取值： - 0：否（默认值，需要客户手动去支付）。 - 1：是（自动支付）。
     */
    public static final class IsAutoRenewEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsAutoRenewEnum NUMBER_0 = new IsAutoRenewEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsAutoRenewEnum NUMBER_1 = new IsAutoRenewEnum(1);

        private static final Map<Integer, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsAutoRenewEnum> createStaticFields() {
            Map<Integer, IsAutoRenewEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsAutoRenewEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            IsAutoRenewEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsAutoRenewEnum(value);
            }
            return result;
        }

        public static IsAutoRenewEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            IsAutoRenewEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public PeriodOrderInfo withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型。取值： - 2：月。 - 3：年。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public PeriodOrderInfo withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数。根据period_type取值不同，代表不同周期数，例如： - 当period_type为2时，period_num为1代表1月。 - 当period_type为3时，period_num为1代表1年。
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PeriodOrderInfo withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订。取值： - 0：否（默认值，需要客户手动去支付）。 - 1：是（自动支付）。
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeriodOrderInfo periodOrderInfo = (PeriodOrderInfo) o;
        return Objects.equals(this.periodType, periodOrderInfo.periodType)
            && Objects.equals(this.periodNum, periodOrderInfo.periodNum)
            && Objects.equals(this.isAutoRenew, periodOrderInfo.isAutoRenew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodNum, isAutoRenew);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodOrderInfo {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
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
