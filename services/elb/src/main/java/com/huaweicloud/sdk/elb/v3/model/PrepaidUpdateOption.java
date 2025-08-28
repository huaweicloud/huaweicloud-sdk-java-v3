package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：更新负载均衡器实例的预付费计费配置。  **约束限制**：不涉及  [不支持该字段，请勿使用。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,fcs,dt,hcso_dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf,srg)
 */
public class PrepaidUpdateOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pay")

    private Boolean autoPay;

    /**
     * **参数解释**：规格变更类型。  **约束限制**：不涉及  **取值范围**： - immediate：即时变更，规格变更立即生效。 - delay：续费变更，当前周期结束后变更为目标规格。  **默认取值**：不涉及
     */
    public static final class ChangeModeEnum {

        /**
         * Enum IMMEDIATE for value: "immediate"
         */
        public static final ChangeModeEnum IMMEDIATE = new ChangeModeEnum("immediate");

        /**
         * Enum DELAY for value: "delay"
         */
        public static final ChangeModeEnum DELAY = new ChangeModeEnum("delay");

        private static final Map<String, ChangeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChangeModeEnum> createStaticFields() {
            Map<String, ChangeModeEnum> map = new HashMap<>();
            map.put("immediate", IMMEDIATE);
            map.put("delay", DELAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChangeModeEnum(String value) {
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
        public static ChangeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChangeModeEnum(value));
        }

        public static ChangeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChangeModeEnum) {
                return this.value.equals(((ChangeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_mode")

    private ChangeModeEnum changeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    /**
     * **参数解释**：订购周期类型。  **约束限制**：仅在change_mode为delay时生效。  **取值范围**： - month：月 - year：年  **默认取值**：不涉及
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

    public PrepaidUpdateOption withAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    /**
     * **参数解释**：下单订购后，是否自动从客户的账户中支付。  **约束限制**：自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择不自动支付，然后在用户费用中心，选择代金券支付。  **取值范围**： - true：自动支付。 - false：不自动支付。  **默认取值**：不涉及
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    public PrepaidUpdateOption withChangeMode(ChangeModeEnum changeMode) {
        this.changeMode = changeMode;
        return this;
    }

    /**
     * **参数解释**：规格变更类型。  **约束限制**：不涉及  **取值范围**： - immediate：即时变更，规格变更立即生效。 - delay：续费变更，当前周期结束后变更为目标规格。  **默认取值**：不涉及
     * @return changeMode
     */
    public ChangeModeEnum getChangeMode() {
        return changeMode;
    }

    public void setChangeMode(ChangeModeEnum changeMode) {
        this.changeMode = changeMode;
    }

    public PrepaidUpdateOption withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * **参数解释**：订购周期数，取值会随运营策略变化。  **约束限制**：仅在change_mode为delay时生效  **取值范围**： - period_type为month时，为[1,9] - period_type为year时，为[1,3]  **默认取值**：不涉及
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

    public PrepaidUpdateOption withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * **参数解释**：订购周期类型。  **约束限制**：仅在change_mode为delay时生效。  **取值范围**： - month：月 - year：年  **默认取值**：不涉及
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
        PrepaidUpdateOption that = (PrepaidUpdateOption) obj;
        return Objects.equals(this.autoPay, that.autoPay) && Objects.equals(this.changeMode, that.changeMode)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.periodType, that.periodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoPay, changeMode, periodNum, periodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrepaidUpdateOption {\n");
        sb.append("    autoPay: ").append(toIndentedString(autoPay)).append("\n");
        sb.append("    changeMode: ").append(toIndentedString(changeMode)).append("\n");
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
