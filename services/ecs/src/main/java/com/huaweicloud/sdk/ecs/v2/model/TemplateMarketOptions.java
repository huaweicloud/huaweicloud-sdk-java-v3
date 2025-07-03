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
 * 计费条件
 */
public class TemplateMarketOptions {

    /**
     * 计费类型
     */
    public static final class MarketTypeEnum {

        /**
         * Enum SPOT for value: "spot"
         */
        public static final MarketTypeEnum SPOT = new MarketTypeEnum("spot");

        /**
         * Enum POSTPAID for value: "postpaid"
         */
        public static final MarketTypeEnum POSTPAID = new MarketTypeEnum("postpaid");

        private static final Map<String, MarketTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MarketTypeEnum> createStaticFields() {
            Map<String, MarketTypeEnum> map = new HashMap<>();
            map.put("spot", SPOT);
            map.put("postpaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MarketTypeEnum(String value) {
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
        public static MarketTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MarketTypeEnum(value));
        }

        public static MarketTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MarketTypeEnum) {
                return this.value.equals(((MarketTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_type")

    private MarketTypeEnum marketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_options")

    private TemplateSpotOptions spotOptions;

    public TemplateMarketOptions withMarketType(MarketTypeEnum marketType) {
        this.marketType = marketType;
        return this;
    }

    /**
     * 计费类型
     * @return marketType
     */
    public MarketTypeEnum getMarketType() {
        return marketType;
    }

    public void setMarketType(MarketTypeEnum marketType) {
        this.marketType = marketType;
    }

    public TemplateMarketOptions withSpotOptions(TemplateSpotOptions spotOptions) {
        this.spotOptions = spotOptions;
        return this;
    }

    public TemplateMarketOptions withSpotOptions(Consumer<TemplateSpotOptions> spotOptionsSetter) {
        if (this.spotOptions == null) {
            this.spotOptions = new TemplateSpotOptions();
            spotOptionsSetter.accept(this.spotOptions);
        }

        return this;
    }

    /**
     * Get spotOptions
     * @return spotOptions
     */
    public TemplateSpotOptions getSpotOptions() {
        return spotOptions;
    }

    public void setSpotOptions(TemplateSpotOptions spotOptions) {
        this.spotOptions = spotOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateMarketOptions that = (TemplateMarketOptions) obj;
        return Objects.equals(this.marketType, that.marketType) && Objects.equals(this.spotOptions, that.spotOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketType, spotOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateMarketOptions {\n");
        sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
        sb.append("    spotOptions: ").append(toIndentedString(spotOptions)).append("\n");
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
