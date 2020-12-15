package com.huaweicloud.sdk.ddm.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 扩展参数说明
 */
public class CreateInstanceExtendParam  {

    /**
     * 计费模式，取值范围： - prePaid：预付费，即包年/包月。 - postPaid：后付费，即按需付费。 默认值为postPaid。
     */
    public static final class ChargeModeEnum {

        
        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargeModeEnum PREPAID = new ChargeModeEnum("prePaid");
        
        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargeModeEnum POSTPAID = new ChargeModeEnum("postPaid");
        

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("prePaid", PREPAID);
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargeModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeModeEnum(value);
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private ChargeModeEnum chargeMode = ChargeModeEnum.POSTPAID;
    /**
     * 订购周期类型，取值范围： - month：月。 - year：年。 “charge_mode”参数配置为“prePaid”时该参数有效且为必选值。
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PeriodTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodTypeEnum(value);
            }
            return result;
        }

        public static PeriodTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof PeriodTypeEnum) {
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
    @JsonProperty(value="period_type")
    
    private PeriodTypeEnum periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_num")
    
    private Integer periodNum;
    /**
     * 是否自动续订，取值范围： - “true”：自动续订。 - “false”：不自动续订。 “charge_mode”参数配置为“prePaid”时该参数有效，不传该字段时默认为不自动续订。\"
     */
    public static final class IsAutoRenewEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoRenewEnum TRUE = new IsAutoRenewEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoRenewEnum FALSE = new IsAutoRenewEnum("false");
        

        private static final Map<String, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsAutoRenewEnum> createStaticFields() {
            Map<String, IsAutoRenewEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsAutoRenewEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IsAutoRenewEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsAutoRenewEnum(value);
            }
            return result;
        }

        public static IsAutoRenewEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof IsAutoRenewEnum) {
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
    @JsonProperty(value="is_auto_renew")
    
    private IsAutoRenewEnum isAutoRenew;
    /**
     * 下单订购后，是否自动从客户的账户的余额中支付，取值范围： - “true”：是（自动从客户账户的余额中支付）。 - “false”：否（需要客户手动支付）。 “charge_mode”参数配置为“prePaid”时该参数有效，不传该字段时默认为客户手动支付。\"
     */
    public static final class IsAutoPayEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoPayEnum TRUE = new IsAutoPayEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoPayEnum FALSE = new IsAutoPayEnum("false");
        

        private static final Map<String, IsAutoPayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsAutoPayEnum> createStaticFields() {
            Map<String, IsAutoPayEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsAutoPayEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IsAutoPayEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsAutoPayEnum(value);
            }
            return result;
        }

        public static IsAutoPayEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsAutoPayEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IsAutoPayEnum) {
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
    @JsonProperty(value="is_auto_pay")
    
    private IsAutoPayEnum isAutoPay;

    public CreateInstanceExtendParam withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式，取值范围： - prePaid：预付费，即包年/包月。 - postPaid：后付费，即按需付费。 默认值为postPaid。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateInstanceExtendParam withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 订购周期类型，取值范围： - month：月。 - year：年。 “charge_mode”参数配置为“prePaid”时该参数有效且为必选值。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public CreateInstanceExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * 订购周期数，取值范围： - period_type=month（周期类型为月）时，取值为[1，9]。 - period_type=year（周期类型为年）时，取值为1。 “charge_mode”参数配置为“prePaid”时该参数有效且为必选值。
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public CreateInstanceExtendParam withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    


    /**
     * 是否自动续订，取值范围： - “true”：自动续订。 - “false”：不自动续订。 “charge_mode”参数配置为“prePaid”时该参数有效，不传该字段时默认为不自动续订。\"
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public CreateInstanceExtendParam withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 下单订购后，是否自动从客户的账户的余额中支付，取值范围： - “true”：是（自动从客户账户的余额中支付）。 - “false”：否（需要客户手动支付）。 “charge_mode”参数配置为“prePaid”时该参数有效，不传该字段时默认为客户手动支付。\"
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceExtendParam createInstanceExtendParam = (CreateInstanceExtendParam) o;
        return Objects.equals(this.chargeMode, createInstanceExtendParam.chargeMode) &&
            Objects.equals(this.periodType, createInstanceExtendParam.periodType) &&
            Objects.equals(this.periodNum, createInstanceExtendParam.periodNum) &&
            Objects.equals(this.isAutoRenew, createInstanceExtendParam.isAutoRenew) &&
            Objects.equals(this.isAutoPay, createInstanceExtendParam.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, periodType, periodNum, isAutoRenew, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceExtendParam {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
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

