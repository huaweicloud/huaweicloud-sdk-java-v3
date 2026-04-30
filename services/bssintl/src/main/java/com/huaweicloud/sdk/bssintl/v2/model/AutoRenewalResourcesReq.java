package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AutoRenewalResourcesReq
 */
public class AutoRenewalResourcesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew_times")

    private Integer autoRenewTimes;

    /**
     * |参数名称：自动续费的周期类型| |参数的约束及描述：该参数非必填，自动续费的周期类型，支持枚举| |MONTH：包月，YEAR：包年。此参数不携带或携带值为null时，按照如下规则处理。购买时，未设置自动续费功能，默认与设置资源的最后一个订单的订购周期类型一致。|
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("MONTH");

        /**
         * Enum YEAR for value: "YEAR"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("YEAR");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("MONTH", MONTH);
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

    public AutoRenewalResourcesReq withAutoRenewTimes(Integer autoRenewTimes) {
        this.autoRenewTimes = autoRenewTimes;
        return this;
    }

    /**
     * |参数名称：自动续费次数| |参数的约束及描述：该参数非必填，范围限制：0-99，0代表不限制次数。 首次开通自动续费，此参数不携带或携带值为null时，默认为不限制次数 已开通自动续费，重置自动续费次数时此参数必填，否则不做处理，不进行修改|
     * minimum: 0
     * maximum: 99
     * @return autoRenewTimes
     */
    public Integer getAutoRenewTimes() {
        return autoRenewTimes;
    }

    public void setAutoRenewTimes(Integer autoRenewTimes) {
        this.autoRenewTimes = autoRenewTimes;
    }

    public AutoRenewalResourcesReq withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * |参数名称：自动续费的周期类型| |参数的约束及描述：该参数非必填，自动续费的周期类型，支持枚举| |MONTH：包月，YEAR：包年。此参数不携带或携带值为null时，按照如下规则处理。购买时，未设置自动续费功能，默认与设置资源的最后一个订单的订购周期类型一致。|
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
        AutoRenewalResourcesReq that = (AutoRenewalResourcesReq) obj;
        return Objects.equals(this.autoRenewTimes, that.autoRenewTimes)
            && Objects.equals(this.periodType, that.periodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoRenewTimes, periodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoRenewalResourcesReq {\n");
        sb.append("    autoRenewTimes: ").append(toIndentedString(autoRenewTimes)).append("\n");
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
