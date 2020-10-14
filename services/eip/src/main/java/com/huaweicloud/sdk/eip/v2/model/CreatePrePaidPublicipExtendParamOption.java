package com.huaweicloud.sdk.eip.v2.model;




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
 * 创建包周期弹性公网IP的订单信息
 */
public class CreatePrePaidPublicipExtendParamOption  {

    /**
     * 功能说明：付费方式（预付费、按需付费；预付费，即包周期付费）  取值范围：  prePaid -预付费，即包年包月；  postPaid-后付费，即按需付费；  后付费的场景下，extendParam的其他字段都会被忽略。
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
     * 功能说明：订购资源的周期类型（包年、包月等）  取值范围：  month-月  year-年  约束：如果用包周期共享带宽创建时（即携带共享带宽id创建弹性公网IP）此字段可不填。付费方式是预付费且不是使用共享带宽创建IP时，该字段必选；  使用共享带宽创建IP时，带宽资源到期时间与IP的到期时间相同。
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_renew")
    
    private Boolean isAutoRenew = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    
    private Boolean isAutoPay = false;

    public CreatePrePaidPublicipExtendParamOption withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 功能说明：付费方式（预付费、按需付费；预付费，即包周期付费）  取值范围：  prePaid -预付费，即包年包月；  postPaid-后付费，即按需付费；  后付费的场景下，extendParam的其他字段都会被忽略。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreatePrePaidPublicipExtendParamOption withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 功能说明：订购资源的周期类型（包年、包月等）  取值范围：  month-月  year-年  约束：如果用包周期共享带宽创建时（即携带共享带宽id创建弹性公网IP）此字段可不填。付费方式是预付费且不是使用共享带宽创建IP时，该字段必选；  使用共享带宽创建IP时，带宽资源到期时间与IP的到期时间相同。
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public CreatePrePaidPublicipExtendParamOption withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * 功能说明：订购周期数  取值范围：(后续会随运营策略变化)  period_type为month时，为[1,9]  period_type为year时，为[1,3]  约束：同period_type约束。
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

    public CreatePrePaidPublicipExtendParamOption withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    


    /**
     * 功能说明：是否自动续订  取值范围：  false：不自动续订  true：自动续订  约束：到期后，默认自动续订1个月（自动续订时间后续可能会变化），详情可联系客服咨询。
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public CreatePrePaidPublicipExtendParamOption withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 功能说明：下单订购后，是否自动从客户的账户中支付  取值范围：  true：自动支付，从账户余额自动扣费  false：只提交订单不支付，需要客户手动去支付  约束：自动支付时，只能使用账户的现金支付；如果要使用代金券，请选择不自动支付，然后在用户费用中心，选择代金券支付。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
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
        CreatePrePaidPublicipExtendParamOption createPrePaidPublicipExtendParamOption = (CreatePrePaidPublicipExtendParamOption) o;
        return Objects.equals(this.chargeMode, createPrePaidPublicipExtendParamOption.chargeMode) &&
            Objects.equals(this.periodType, createPrePaidPublicipExtendParamOption.periodType) &&
            Objects.equals(this.periodNum, createPrePaidPublicipExtendParamOption.periodNum) &&
            Objects.equals(this.isAutoRenew, createPrePaidPublicipExtendParamOption.isAutoRenew) &&
            Objects.equals(this.isAutoPay, createPrePaidPublicipExtendParamOption.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, periodType, periodNum, isAutoRenew, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrePaidPublicipExtendParamOption {\n");
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

