package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * WatermarkLocation
 */
public class WatermarkLocation {

    /**
     * 水印位置。  包含如下选项： - TOPLEFT：左上 - TOPRIGHT：右上 - BOTTOMLEFT：左下 - BOTTOMRIGHT：右下 - RANDOM：随机模式，图片水印将随机在视频流的左上、右上、左下、右下四个位置展示。
     */
    public static final class LocationEnum {

        /**
         * Enum TOPLEFT for value: "TOPLEFT"
         */
        public static final LocationEnum TOPLEFT = new LocationEnum("TOPLEFT");

        /**
         * Enum TOPRIGHT for value: "TOPRIGHT"
         */
        public static final LocationEnum TOPRIGHT = new LocationEnum("TOPRIGHT");

        /**
         * Enum BOTTOMLEFT for value: "BOTTOMLEFT"
         */
        public static final LocationEnum BOTTOMLEFT = new LocationEnum("BOTTOMLEFT");

        /**
         * Enum BOTTOMRIGHT for value: "BOTTOMRIGHT"
         */
        public static final LocationEnum BOTTOMRIGHT = new LocationEnum("BOTTOMRIGHT");

        /**
         * Enum RANDOM for value: "RANDOM"
         */
        public static final LocationEnum RANDOM = new LocationEnum("RANDOM");

        private static final Map<String, LocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocationEnum> createStaticFields() {
            Map<String, LocationEnum> map = new HashMap<>();
            map.put("TOPLEFT", TOPLEFT);
            map.put("TOPRIGHT", TOPRIGHT);
            map.put("BOTTOMLEFT", BOTTOMLEFT);
            map.put("BOTTOMRIGHT", BOTTOMRIGHT);
            map.put("RANDOM", RANDOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocationEnum(String value) {
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
        public static LocationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LocationEnum(value));
        }

        public static LocationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocationEnum) {
                return this.value.equals(((LocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private LocationEnum location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_offset")

    private BigDecimal xOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y_offset")

    private BigDecimal yOffset;

    public WatermarkLocation withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    /**
     * 水印位置。  包含如下选项： - TOPLEFT：左上 - TOPRIGHT：右上 - BOTTOMLEFT：左下 - BOTTOMRIGHT：右下 - RANDOM：随机模式，图片水印将随机在视频流的左上、右上、左下、右下四个位置展示。
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public WatermarkLocation withXOffset(BigDecimal xOffset) {
        this.xOffset = xOffset;
        return this;
    }

    /**
     * 水印相对输出视频的水平偏移量。 说明：值有两种形式： 1）整数型代表偏移像素，范围[1，4096]，单位px。 2）小数型代表水平偏移量与输出分辨率宽的比率，范围[0，1) 百分比限制最多保留小数点后4位
     * minimum: 0
     * maximum: 4096
     * @return xOffset
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_offset")
    public BigDecimal getXOffset() {
        return xOffset;
    }

    public void setXOffset(BigDecimal xOffset) {
        this.xOffset = xOffset;
    }

    public WatermarkLocation withYOffset(BigDecimal yOffset) {
        this.yOffset = yOffset;
        return this;
    }

    /**
     * 水印相对输出视频的垂直偏移量 说明: 值有两种形式： 1）整数型代表偏移像素，范围[1，4096]，单位px。 2）小数型代表垂直偏移量与输出分辨率高的比率，范围[0，1) 百分比限制最多保留小数点后4位
     * minimum: 0
     * maximum: 4096
     * @return yOffset
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y_offset")
    public BigDecimal getYOffset() {
        return yOffset;
    }

    public void setYOffset(BigDecimal yOffset) {
        this.yOffset = yOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WatermarkLocation that = (WatermarkLocation) obj;
        return Objects.equals(this.location, that.location) && Objects.equals(this.xOffset, that.xOffset)
            && Objects.equals(this.yOffset, that.yOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, xOffset, yOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WatermarkLocation {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    xOffset: ").append(toIndentedString(xOffset)).append("\n");
        sb.append("    yOffset: ").append(toIndentedString(yOffset)).append("\n");
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
