package com.huaweicloud.sdk.aos.v1.model;




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
 * resource price response
 */
public class ResourcePriceResponse  {

    /**
     * 计费模式，包周期计费、按需计费、免费的返回，不支持的资源不返回 PRE_PAID 包周期计费 POST_PAID 按需计费 FREE 免费
     */
    public static final class ChargeModeEnum {

        
        /**
         * Enum PRE_PAID for value: "PRE_PAID"
         */
        public static final ChargeModeEnum PRE_PAID = new ChargeModeEnum("PRE_PAID");
        
        /**
         * Enum POST_PAID for value: "POST_PAID"
         */
        public static final ChargeModeEnum POST_PAID = new ChargeModeEnum("POST_PAID");
        
        /**
         * Enum FREE for value: "FREE"
         */
        public static final ChargeModeEnum FREE = new ChargeModeEnum("FREE");
        

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("PRE_PAID", PRE_PAID);
            map.put("POST_PAID", POST_PAID);
            map.put("FREE", FREE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
            if (obj instanceof ChargeModeEnum) {
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
    
    
    private ChargeModeEnum chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sale_price")
    
    
    private Object salePrice;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount")
    
    
    private Object discount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="original_price")
    
    
    private Object originalPrice;
    /**
     * 包周期和按需的计费单位，包周期计费和按需计费返回，免费不会返回 HOUR：小时，包周期计费和按需计费返回，免费不会返回 DAY：天，包周期计费返回，按需计费和免费不会返回 WEEK：周，包周期计费返回，按需计费和免费不会返回 MONTH：月，包周期计费返回，按需计费和免费不会返回 YEAR：年，包周期计费返回，按需计费和免费不会返回 BYTE：字节，按需计费返回，包周期计费和免费不会返回 MB：百万字节，按需计费返回，包周期计费和免费不会返回 GB：千兆字节，按需计费返回，包周期计费和免费不会返回
     */
    public static final class PeriodTypeEnum {

        
        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final PeriodTypeEnum HOUR = new PeriodTypeEnum("HOUR");
        
        /**
         * Enum DAY for value: "DAY"
         */
        public static final PeriodTypeEnum DAY = new PeriodTypeEnum("DAY");
        
        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final PeriodTypeEnum WEEK = new PeriodTypeEnum("WEEK");
        
        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("MONTH");
        
        /**
         * Enum YEAR for value: "YEAR"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("YEAR");
        
        /**
         * Enum BYTE for value: "BYTE"
         */
        public static final PeriodTypeEnum BYTE = new PeriodTypeEnum("BYTE");
        
        /**
         * Enum MB for value: "MB"
         */
        public static final PeriodTypeEnum MB = new PeriodTypeEnum("MB");
        
        /**
         * Enum GB for value: "GB"
         */
        public static final PeriodTypeEnum GB = new PeriodTypeEnum("GB");
        

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MONTH", MONTH);
            map.put("YEAR", YEAR);
            map.put("BYTE", BYTE);
            map.put("MB", MB);
            map.put("GB", GB);
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
    @JsonProperty(value="period_type")
    
    
    private PeriodTypeEnum periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_count")
    
    
    private Integer periodCount;

    public ResourcePriceResponse withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式，包周期计费、按需计费、免费的返回，不支持的资源不返回 PRE_PAID 包周期计费 POST_PAID 按需计费 FREE 免费
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    

    public ResourcePriceResponse withSalePrice(Object salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    


    /**
     * 执行计划中的每个资源部署后最终优惠后的金额，保留小数点后2位，向下取整，默认单位是元
     * @return salePrice
     */
    public Object getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Object salePrice) {
        this.salePrice = salePrice;
    }

    

    public ResourcePriceResponse withDiscount(Object discount) {
        this.discount = discount;
        return this;
    }

    


    /**
     * 执行计划中的每个资源部署后的优惠额，保留小数点后2位，向下取整，默认单位是元
     * @return discount
     */
    public Object getDiscount() {
        return discount;
    }

    public void setDiscount(Object discount) {
        this.discount = discount;
    }

    

    public ResourcePriceResponse withOriginalPrice(Object originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    


    /**
     * 执行计划中的每个资源部署后的原价，保留小数点后2位，向下取整，默认单位是元
     * @return originalPrice
     */
    public Object getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Object originalPrice) {
        this.originalPrice = originalPrice;
    }

    

    public ResourcePriceResponse withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 包周期和按需的计费单位，包周期计费和按需计费返回，免费不会返回 HOUR：小时，包周期计费和按需计费返回，免费不会返回 DAY：天，包周期计费返回，按需计费和免费不会返回 WEEK：周，包周期计费返回，按需计费和免费不会返回 MONTH：月，包周期计费返回，按需计费和免费不会返回 YEAR：年，包周期计费返回，按需计费和免费不会返回 BYTE：字节，按需计费返回，包周期计费和免费不会返回 MB：百万字节，按需计费返回，包周期计费和免费不会返回 GB：千兆字节，按需计费返回，包周期计费和免费不会返回
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    

    public ResourcePriceResponse withPeriodCount(Integer periodCount) {
        this.periodCount = periodCount;
        return this;
    }

    


    /**
     * 订购数量。包周期计费和按需计费返回，免费不会返回。
     * @return periodCount
     */
    public Integer getPeriodCount() {
        return periodCount;
    }

    public void setPeriodCount(Integer periodCount) {
        this.periodCount = periodCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcePriceResponse resourcePriceResponse = (ResourcePriceResponse) o;
        return Objects.equals(this.chargeMode, resourcePriceResponse.chargeMode) &&
            Objects.equals(this.salePrice, resourcePriceResponse.salePrice) &&
            Objects.equals(this.discount, resourcePriceResponse.discount) &&
            Objects.equals(this.originalPrice, resourcePriceResponse.originalPrice) &&
            Objects.equals(this.periodType, resourcePriceResponse.periodType) &&
            Objects.equals(this.periodCount, resourcePriceResponse.periodCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, salePrice, discount, originalPrice, periodType, periodCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcePriceResponse {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodCount: ").append(toIndentedString(periodCount)).append("\n");
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

