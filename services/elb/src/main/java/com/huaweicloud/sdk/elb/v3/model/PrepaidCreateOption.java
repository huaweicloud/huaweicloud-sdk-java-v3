package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 创建负载均衡器的包周期信息，若传入该结构体，则创建包周期的LB */
public class PrepaidCreateOption {

    /** 订购周期类型，仅在change_mode为delay时有效。取值： - month：月（默认）。 - year：年。 */
    public static final class PeriodTypeEnum {

        /** Enum MONTH for value: "month" */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        /** Enum YEAR for value: "year" */
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
    @JsonProperty(value = "auto_renew")

    private Boolean autoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pay")

    private Boolean autoPay;

    public PrepaidCreateOption withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /** 订购周期类型，仅在change_mode为delay时有效。取值： - month：月（默认）。 - year：年。
     * 
     * @return periodType */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public PrepaidCreateOption withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /** 订购周期数，仅在change_mode为delay时有效。取值： - period_type为month时，为[1,9]，默认1。 - period_type为year时，为[1,3]，默认1。 minimum: 1
     * maximum: 9
     * 
     * @return periodNum */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PrepaidCreateOption withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /** 是否自动续订； true：自动续订 false：不自动续订
     * 
     * @return autoRenew */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public PrepaidCreateOption withAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    /** 下单订购后，是否自动从客户的账户中支付； true：自动支付； false：不自动支付。 自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择不自动支付，然后在用户费用中心，选择代金券支付。
     * 
     * @return autoPay */
    public Boolean getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrepaidCreateOption prepaidCreateOption = (PrepaidCreateOption) o;
        return Objects.equals(this.periodType, prepaidCreateOption.periodType)
            && Objects.equals(this.periodNum, prepaidCreateOption.periodNum)
            && Objects.equals(this.autoRenew, prepaidCreateOption.autoRenew)
            && Objects.equals(this.autoPay, prepaidCreateOption.autoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodNum, autoRenew, autoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrepaidCreateOption {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
        sb.append("    autoPay: ").append(toIndentedString(autoPay)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
