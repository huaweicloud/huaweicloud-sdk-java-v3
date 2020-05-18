package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 包周期创卷的计费策略参数。
 */
public class BssParamForCreateVolume  {

    /**
     * 功能说明：计费模式。默认值为postPaid。 取值范围： * prePaid：包年包月 * postPaid：按需
     */
    public static class ChargingModeEnum {

        
        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargingModeEnum POSTPAID = new ChargingModeEnum("postPaid");

        
        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargingModeEnum PREPAID = new ChargingModeEnum("prePaid");

        

        public static Map<String, ChargingModeEnum> staticFields =
                new HashMap<String, ChargingModeEnum>() {
                    { 
                        put("postPaid", POSTPAID);
                        put("prePaid", PREPAID);
                    }
                };

        private String value;

        ChargingModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ChargingModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargingModeEnum) {
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
    @JsonProperty(value="chargingMode")
    
    private ChargingModeEnum chargingMode = ChargingModeEnum.POSTPAID;
    /**
     * 功能说明：是否立即支付。chargingMode为PrePaid时该参数会生效。默认值为false。 取值范围： * true：立即支付，从帐户余额中自动扣费 * false：不立即支付，创建订单暂不支付 
     */
    public static class IsAutoPayEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoPayEnum TRUE = new IsAutoPayEnum("true");

        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoPayEnum FALSE = new IsAutoPayEnum("false");

        

        public static Map<String, IsAutoPayEnum> staticFields =
                new HashMap<String, IsAutoPayEnum>() {
                    { 
                        put("true", TRUE);
                        put("false", FALSE);
                    }
                };

        private String value;

        IsAutoPayEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoPayEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            IsAutoPayEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IsAutoPayEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IsAutoPayEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsAutoPayEnum result = staticFields.get(value);
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
    @JsonProperty(value="isAutoPay")
    
    private IsAutoPayEnum isAutoPay = IsAutoPayEnum.FALSE;
    /**
     * 功能说明：是否自动续订。chargingMode为prePaid时该参数会生效。默认值为false。 取值范围： * true：自动续订，自动续订周期与订购周期相同 * false：不自动续订 
     */
    public static class IsAutoRenewEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final IsAutoRenewEnum TRUE = new IsAutoRenewEnum("true");

        
        /**
         * Enum FALSE for value: "false"
         */
        public static final IsAutoRenewEnum FALSE = new IsAutoRenewEnum("false");

        

        public static Map<String, IsAutoRenewEnum> staticFields =
                new HashMap<String, IsAutoRenewEnum>() {
                    { 
                        put("true", TRUE);
                        put("false", FALSE);
                    }
                };

        private String value;

        IsAutoRenewEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            IsAutoRenewEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IsAutoRenewEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IsAutoRenewEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsAutoRenewEnum result = staticFields.get(value);
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
    @JsonProperty(value="isAutoRenew")
    
    private IsAutoRenewEnum isAutoRenew = IsAutoRenewEnum.FALSE;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="periodNum")
    
    private Integer periodNum;
    /**
     * 功能说明：订购周期单位。chargingMode为prePaid时该参数会生效，并且该参数为必选。 取值范围： * month：月 * year：年
     */
    public static class PeriodTypeEnum {

        
        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        
        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");

        

        public static Map<String, PeriodTypeEnum> staticFields =
                new HashMap<String, PeriodTypeEnum>() {
                    { 
                        put("month", MONTH);
                        put("year", YEAR);
                    }
                };

        private String value;

        PeriodTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            PeriodTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new PeriodTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static PeriodTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PeriodTypeEnum result = staticFields.get(value);
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
    @JsonProperty(value="periodType")
    
    private PeriodTypeEnum periodType;

    public BssParamForCreateVolume withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 功能说明：计费模式。默认值为postPaid。 取值范围： * prePaid：包年包月 * postPaid：按需
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public BssParamForCreateVolume withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 功能说明：是否立即支付。chargingMode为PrePaid时该参数会生效。默认值为false。 取值范围： * true：立即支付，从帐户余额中自动扣费 * false：不立即支付，创建订单暂不支付 
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public BssParamForCreateVolume withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    


    /**
     * 功能说明：是否自动续订。chargingMode为prePaid时该参数会生效。默认值为false。 取值范围： * true：自动续订，自动续订周期与订购周期相同 * false：不自动续订 
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public BssParamForCreateVolume withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * 功能说明：订购周期数，chargingMode为prePaid时该参数会生效，并且该参数为为必选。 取值范围： * periodType为month时，为[1-9] * periodType为year时，为[1-1]
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public BssParamForCreateVolume withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 功能说明：订购周期单位。chargingMode为prePaid时该参数会生效，并且该参数为必选。 取值范围： * month：月 * year：年
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BssParamForCreateVolume bssParamForCreateVolume = (BssParamForCreateVolume) o;
        return Objects.equals(this.chargingMode, bssParamForCreateVolume.chargingMode) &&
            Objects.equals(this.isAutoPay, bssParamForCreateVolume.isAutoPay) &&
            Objects.equals(this.isAutoRenew, bssParamForCreateVolume.isAutoRenew) &&
            Objects.equals(this.periodNum, bssParamForCreateVolume.periodNum) &&
            Objects.equals(this.periodType, bssParamForCreateVolume.periodType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, isAutoPay, isAutoRenew, periodNum, periodType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BssParamForCreateVolume {\n");
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

