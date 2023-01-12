package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OpenEngressEipReq
 */
public class OpenEngressEipReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private String bandwidthSize;

    /**
     * 出公网带宽计费类型： - bandwidth：按带宽计费 - traffic：按流量计费
     */
    public static final class BandwidthChargingModeEnum {

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final BandwidthChargingModeEnum BANDWIDTH = new BandwidthChargingModeEnum("bandwidth");

        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final BandwidthChargingModeEnum TRAFFIC = new BandwidthChargingModeEnum("traffic");

        private static final Map<String, BandwidthChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthChargingModeEnum> createStaticFields() {
            Map<String, BandwidthChargingModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BandwidthChargingModeEnum(String value) {
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
        public static BandwidthChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BandwidthChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BandwidthChargingModeEnum(value);
            }
            return result;
        }

        public static BandwidthChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BandwidthChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BandwidthChargingModeEnum) {
                return this.value.equals(((BandwidthChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_charging_mode")

    private BandwidthChargingModeEnum bandwidthChargingMode;

    public OpenEngressEipReq withBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 出公网带宽  单位：Mbit/s
     * @return bandwidthSize
     */
    public String getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public OpenEngressEipReq withBandwidthChargingMode(BandwidthChargingModeEnum bandwidthChargingMode) {
        this.bandwidthChargingMode = bandwidthChargingMode;
        return this;
    }

    /**
     * 出公网带宽计费类型： - bandwidth：按带宽计费 - traffic：按流量计费
     * @return bandwidthChargingMode
     */
    public BandwidthChargingModeEnum getBandwidthChargingMode() {
        return bandwidthChargingMode;
    }

    public void setBandwidthChargingMode(BandwidthChargingModeEnum bandwidthChargingMode) {
        this.bandwidthChargingMode = bandwidthChargingMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenEngressEipReq openEngressEipReq = (OpenEngressEipReq) o;
        return Objects.equals(this.bandwidthSize, openEngressEipReq.bandwidthSize)
            && Objects.equals(this.bandwidthChargingMode, openEngressEipReq.bandwidthChargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthSize, bandwidthChargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenEngressEipReq {\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    bandwidthChargingMode: ").append(toIndentedString(bandwidthChargingMode)).append("\n");
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
