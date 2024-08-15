package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 扩展参数，用于包周期资源变更
 */
public class UpdatePrePaidBandwidthExtendParamOption {

    /**
     * - 功能说明：变更资源的周期类型（包年、包月等）,可选字段。 - 取值范围：    - month-月    - year-年 - 约束：只有在资源续费降配的时候必须传，其他场景不需要传，如果传入默认忽略。
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("month", MONTH);
            map.put("year", YEAR);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    public UpdatePrePaidBandwidthExtendParamOption withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * - 功能说明：变更资源的周期类型（包年、包月等）,可选字段。 - 取值范围：    - month-月    - year-年 - 约束：只有在资源续费降配的时候必须传，其他场景不需要传，如果传入默认忽略。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public UpdatePrePaidBandwidthExtendParamOption withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * - 功能说明：订购周期数，和period_type同步传入，可选字段 - 取值范围：(后续会随运营策略变化)    - period_type为month时，为[1,9]    - period_type为year时，为[1,3] - 约束：只有在资源续费降配的时候必须传，其他场景不需要传，如果传入默认忽略。该字段需要和period_type同步传入或同步不传
     * minimum: 1
     * maximum: 9
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public UpdatePrePaidBandwidthExtendParamOption withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * - 功能说明：下单订购后，是否自动从客户的账户中支付，而不需要客户手动去进行支付；系统默认是“非自动支付”。 - 取值范围：    - true：是（自动支付，从账户余额自动扣费）    - false：否（默认值，需要客户手动去支付） - 约束：资源升配或续费降配时，该参数为必传字段。自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择不自动支付，然后在用户费用中心，选择代金券支付。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
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
        UpdatePrePaidBandwidthExtendParamOption that = (UpdatePrePaidBandwidthExtendParamOption) obj;
        return Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.isAutoPay, that.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodNum, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrePaidBandwidthExtendParamOption {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
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
