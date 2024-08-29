package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MarketModel
 */
public class MarketModel {

    /**
     * 计费类型
     */
    public static final class ChargeModeEnum {

        /**
         * Enum SPOT for value: "spot"
         */
        public static final ChargeModeEnum SPOT = new ChargeModeEnum("spot");

        /**
         * Enum PREPAID for value: "prepaid"
         */
        public static final ChargeModeEnum PREPAID = new ChargeModeEnum("prepaid");

        /**
         * Enum POSTPAID for value: "postpaid"
         */
        public static final ChargeModeEnum POSTPAID = new ChargeModeEnum("postpaid");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("spot", SPOT);
            map.put("prepaid", PREPAID);
            map.put("postpaid", POSTPAID);
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
    @JsonProperty(value = "prepaid_info")

    private MarketModelPrepaidInfo prepaidInfo;

    public MarketModel withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费类型
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public MarketModel withPrepaidInfo(MarketModelPrepaidInfo prepaidInfo) {
        this.prepaidInfo = prepaidInfo;
        return this;
    }

    public MarketModel withPrepaidInfo(Consumer<MarketModelPrepaidInfo> prepaidInfoSetter) {
        if (this.prepaidInfo == null) {
            this.prepaidInfo = new MarketModelPrepaidInfo();
            prepaidInfoSetter.accept(this.prepaidInfo);
        }

        return this;
    }

    /**
     * Get prepaidInfo
     * @return prepaidInfo
     */
    public MarketModelPrepaidInfo getPrepaidInfo() {
        return prepaidInfo;
    }

    public void setPrepaidInfo(MarketModelPrepaidInfo prepaidInfo) {
        this.prepaidInfo = prepaidInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarketModel that = (MarketModel) obj;
        return Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.prepaidInfo, that.prepaidInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, prepaidInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketModel {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    prepaidInfo: ").append(toIndentedString(prepaidInfo)).append("\n");
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
