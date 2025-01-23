package com.huaweicloud.sdk.elb.v3.model;

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
 * 参数解释：创建负载均衡器实例的预付费计费配置。若传入该结构体，则创建预付费类型的负载均衡器实例。  [不支持该字段，请勿使用。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,fcs,dt,hcso_dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf,srg)
 */
public class UpgradePrepaidOption {

    /**
     * 参数解释：预付费实例的订购周期类型，当前支持月和年。  取值范围：  - month：月。  - year：年。
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
    @JsonProperty(value = "resource_package_type")

    private List<String> resourcePackageType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pay")

    private Boolean autoPay;

    public UpgradePrepaidOption withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 参数解释：预付费实例的订购周期类型，当前支持月和年。  取值范围：  - month：月。  - year：年。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public UpgradePrepaidOption withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 参数解释：预付费实例的订购周期数。  取值范围： - period_type为month时，为[1,9]。 - period_type为year时，为[1,3]。
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

    public UpgradePrepaidOption withResourcePackageType(List<String> resourcePackageType) {
        this.resourcePackageType = resourcePackageType;
        return this;
    }

    public UpgradePrepaidOption addResourcePackageTypeItem(String resourcePackageTypeItem) {
        if (this.resourcePackageType == null) {
            this.resourcePackageType = new ArrayList<>();
        }
        this.resourcePackageType.add(resourcePackageTypeItem);
        return this;
    }

    public UpgradePrepaidOption withResourcePackageType(Consumer<List<String>> resourcePackageTypeSetter) {
        if (this.resourcePackageType == null) {
            this.resourcePackageType = new ArrayList<>();
        }
        resourcePackageTypeSetter.accept(this.resourcePackageType);
        return this;
    }

    /**
     * 参数解释：购买定向套餐包。
     * @return resourcePackageType
     */
    public List<String> getResourcePackageType() {
        return resourcePackageType;
    }

    public void setResourcePackageType(List<String> resourcePackageType) {
        this.resourcePackageType = resourcePackageType;
    }

    public UpgradePrepaidOption withAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    /**
     * 参数解释：自动支付开关。下单订购后，是否自动从客户的账户中支付。  约束限制：开启自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择关闭自动支付，然后在用户费用中心，选择代金券支付。  取值范围：  - true：开启自动支付。  - false：关闭自动支付。
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradePrepaidOption that = (UpgradePrepaidOption) obj;
        return Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.resourcePackageType, that.resourcePackageType)
            && Objects.equals(this.autoPay, that.autoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodNum, resourcePackageType, autoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradePrepaidOption {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    resourcePackageType: ").append(toIndentedString(resourcePackageType)).append("\n");
        sb.append("    autoPay: ").append(toIndentedString(autoPay)).append("\n");
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
