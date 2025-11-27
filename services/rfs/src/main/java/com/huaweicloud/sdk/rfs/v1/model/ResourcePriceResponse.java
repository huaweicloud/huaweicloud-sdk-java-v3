package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ResourcePriceResponse
 */
public class ResourcePriceResponse {

    /**
     * 计费模式  * `PRE_PAID` - 包周期计费 * `POST_PAID` - 按需计费 * `FREE` - 免费
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeModeEnum(value));
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sale_price")

    private Double salePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount")

    private Double discount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_price")

    private Double originalPrice;

    /**
     * 计费单位  如果该资源支持包周期计费或按需计费，则会返回该字段；如果该资源为免费资源，则不返回该字段。  * `HOUR` - 小时，按需计费的单位 * `DAY` - 天，按需计费的单位 * `MONTH` - 月，包周期计费的单位 * `YEAR` - 年，包周期计费的单位 * `BYTE` - 字节，按需计费的单位 * `MB` - 百万字节，包周期计费和按需计费的单位 * `GB` - 千兆字节，包周期计费和按需计费的单位
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
    @JsonProperty(value = "period_count")

    private Integer periodCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "best_discount_type")

    private Integer bestDiscountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "best_discount_price")

    private Double bestDiscountPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_discount_price")

    private Double officialWebsiteDiscountPrice;

    public ResourcePriceResponse withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式  * `PRE_PAID` - 包周期计费 * `POST_PAID` - 按需计费 * `FREE` - 免费
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ResourcePriceResponse withSalePrice(Double salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    /**
     * 该资源最终优惠后的金额（只考虑官网折扣、商务折扣以及伙伴折扣，不包含促销折扣及优惠券），保留小数点后2位，向上取整，默认单位是元。
     * @return salePrice
     */
    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public ResourcePriceResponse withDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    /**
     * 该资源的总优惠额，保留小数点后2位，向上取整，默认单位是元。
     * @return discount
     */
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public ResourcePriceResponse withOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    /**
     * 该资源的原价，保留小数点后2位，向上取整，默认单位是元。
     * @return originalPrice
     */
    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public ResourcePriceResponse withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 计费单位  如果该资源支持包周期计费或按需计费，则会返回该字段；如果该资源为免费资源，则不返回该字段。  * `HOUR` - 小时，按需计费的单位 * `DAY` - 天，按需计费的单位 * `MONTH` - 月，包周期计费的单位 * `YEAR` - 年，包周期计费的单位 * `BYTE` - 字节，按需计费的单位 * `MB` - 百万字节，包周期计费和按需计费的单位 * `GB` - 千兆字节，包周期计费和按需计费的单位
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
     * 该资源的计费数量，需要和period_type搭配使用  如果该资源支持包周期计费或按需计费，则会返回该字段；如果该资源为免费资源，则不返回该字段。  * 对于按需计费资源，此值默认返回1，代表在1个计费单位下，该资源的价格 * 对于包周期计费资源，此值与模板中该资源的period字段保持一致
     * @return periodCount
     */
    public Integer getPeriodCount() {
        return periodCount;
    }

    public void setPeriodCount(Integer periodCount) {
        this.periodCount = periodCount;
    }

    public ResourcePriceResponse withBestDiscountType(Integer bestDiscountType) {
        this.bestDiscountType = bestDiscountType;
        return this;
    }

    /**
     * 该资源的最优折扣类型  对于按需计费资源的折扣类型 合同商务优惠类型：605 （华为云商务-折扣率，一口价，华为云用户）、606 （渠道商务-折扣率，一口价，BP用户） 伙伴折扣优惠类型：607 (合作伙伴授予折扣-折扣率)  对于包周期计费资源的折扣类型 合同商务折扣：605（华为云BE场景下的合同商务折扣）、606（分销商BE场景下的合同商务折扣） 伙伴授予折扣：607 促销折扣：700  如果该资源存在折扣，则返回该字段；如果该资源不存在折扣，则不返回该字段。
     * @return bestDiscountType
     */
    public Integer getBestDiscountType() {
        return bestDiscountType;
    }

    public void setBestDiscountType(Integer bestDiscountType) {
        this.bestDiscountType = bestDiscountType;
    }

    public ResourcePriceResponse withBestDiscountPrice(Double bestDiscountPrice) {
        this.bestDiscountPrice = bestDiscountPrice;
        return this;
    }

    /**
     * 最优折扣优惠额，保留小数点后2位，向上取整，默认单位是元。  如果该资源存在折扣，则返回该字段；如果该资源不存在折扣，则不返回该字段。
     * @return bestDiscountPrice
     */
    public Double getBestDiscountPrice() {
        return bestDiscountPrice;
    }

    public void setBestDiscountPrice(Double bestDiscountPrice) {
        this.bestDiscountPrice = bestDiscountPrice;
    }

    public ResourcePriceResponse withOfficialWebsiteDiscountPrice(Double officialWebsiteDiscountPrice) {
        this.officialWebsiteDiscountPrice = officialWebsiteDiscountPrice;
        return this;
    }

    /**
     * 官网价优惠额，保留小数点后2位，向上取整，默认单位是元。  如果该资源存在官网价优惠额，则返回该字段；如果该资源不存在官网价优惠额，则不返回该字段。
     * @return officialWebsiteDiscountPrice
     */
    public Double getOfficialWebsiteDiscountPrice() {
        return officialWebsiteDiscountPrice;
    }

    public void setOfficialWebsiteDiscountPrice(Double officialWebsiteDiscountPrice) {
        this.officialWebsiteDiscountPrice = officialWebsiteDiscountPrice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcePriceResponse that = (ResourcePriceResponse) obj;
        return Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.salePrice, that.salePrice)
            && Objects.equals(this.discount, that.discount) && Objects.equals(this.originalPrice, that.originalPrice)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodCount, that.periodCount)
            && Objects.equals(this.bestDiscountType, that.bestDiscountType)
            && Objects.equals(this.bestDiscountPrice, that.bestDiscountPrice)
            && Objects.equals(this.officialWebsiteDiscountPrice, that.officialWebsiteDiscountPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeMode,
            salePrice,
            discount,
            originalPrice,
            periodType,
            periodCount,
            bestDiscountType,
            bestDiscountPrice,
            officialWebsiteDiscountPrice);
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
        sb.append("    bestDiscountType: ").append(toIndentedString(bestDiscountType)).append("\n");
        sb.append("    bestDiscountPrice: ").append(toIndentedString(bestDiscountPrice)).append("\n");
        sb.append("    officialWebsiteDiscountPrice: ")
            .append(toIndentedString(officialWebsiteDiscountPrice))
            .append("\n");
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
