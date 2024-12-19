package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateInstanceBandwidthAutoScalingPolicyResponse extends SdkResponse {

    /**
     * 带宽弹性的观测窗口，单位：分钟。支持的取值：1、5、10、15、30。
     */
    public static final class WindowSizeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final WindowSizeEnum NUMBER_1 = new WindowSizeEnum(1);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final WindowSizeEnum NUMBER_5 = new WindowSizeEnum(5);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final WindowSizeEnum NUMBER_10 = new WindowSizeEnum(10);

        /**
         * Enum NUMBER_15 for value: 15
         */
        public static final WindowSizeEnum NUMBER_15 = new WindowSizeEnum(15);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final WindowSizeEnum NUMBER_30 = new WindowSizeEnum(30);

        private static final Map<Integer, WindowSizeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, WindowSizeEnum> createStaticFields() {
            Map<Integer, WindowSizeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(5, NUMBER_5);
            map.put(10, NUMBER_10);
            map.put(15, NUMBER_15);
            map.put(30, NUMBER_30);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        WindowSizeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static WindowSizeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WindowSizeEnum(value));
        }

        public static WindowSizeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WindowSizeEnum) {
                return this.value.equals(((WindowSizeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "window_size")

    private WindowSizeEnum windowSize;

    /**
     * 触发带宽自动扩展的带宽平均使用率阈值，单位：百分比。支持的取值：50、60、70、80、90、95。
     */
    public static final class BandwidthUsageUpperThresholdEnum {

        /**
         * Enum NUMBER_50 for value: 50
         */
        public static final BandwidthUsageUpperThresholdEnum NUMBER_50 = new BandwidthUsageUpperThresholdEnum(50);

        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final BandwidthUsageUpperThresholdEnum NUMBER_60 = new BandwidthUsageUpperThresholdEnum(60);

        /**
         * Enum NUMBER_70 for value: 70
         */
        public static final BandwidthUsageUpperThresholdEnum NUMBER_70 = new BandwidthUsageUpperThresholdEnum(70);

        /**
         * Enum NUMBER_80 for value: 80
         */
        public static final BandwidthUsageUpperThresholdEnum NUMBER_80 = new BandwidthUsageUpperThresholdEnum(80);

        /**
         * Enum NUMBER_90 for value: 90
         */
        public static final BandwidthUsageUpperThresholdEnum NUMBER_90 = new BandwidthUsageUpperThresholdEnum(90);

        /**
         * Enum NUMBER_95 for value: 95
         */
        public static final BandwidthUsageUpperThresholdEnum NUMBER_95 = new BandwidthUsageUpperThresholdEnum(95);

        private static final Map<Integer, BandwidthUsageUpperThresholdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BandwidthUsageUpperThresholdEnum> createStaticFields() {
            Map<Integer, BandwidthUsageUpperThresholdEnum> map = new HashMap<>();
            map.put(50, NUMBER_50);
            map.put(60, NUMBER_60);
            map.put(70, NUMBER_70);
            map.put(80, NUMBER_80);
            map.put(90, NUMBER_90);
            map.put(95, NUMBER_95);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BandwidthUsageUpperThresholdEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BandwidthUsageUpperThresholdEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new BandwidthUsageUpperThresholdEnum(value));
        }

        public static BandwidthUsageUpperThresholdEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BandwidthUsageUpperThresholdEnum) {
                return this.value.equals(((BandwidthUsageUpperThresholdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_usage_upper_threshold")

    private BandwidthUsageUpperThresholdEnum bandwidthUsageUpperThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_out_cooldown")

    private Integer scaleOutCooldown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_in_enabled")

    private Boolean scaleInEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_usage_lower_threshold")

    private Integer bandwidthUsageLowerThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_in_cooldown")

    private Integer scaleInCooldown;

    public UpdateInstanceBandwidthAutoScalingPolicyResponse withWindowSize(WindowSizeEnum windowSize) {
        this.windowSize = windowSize;
        return this;
    }

    /**
     * 带宽弹性的观测窗口，单位：分钟。支持的取值：1、5、10、15、30。
     * @return windowSize
     */
    public WindowSizeEnum getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(WindowSizeEnum windowSize) {
        this.windowSize = windowSize;
    }

    public UpdateInstanceBandwidthAutoScalingPolicyResponse withBandwidthUsageUpperThreshold(
        BandwidthUsageUpperThresholdEnum bandwidthUsageUpperThreshold) {
        this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
        return this;
    }

    /**
     * 触发带宽自动扩展的带宽平均使用率阈值，单位：百分比。支持的取值：50、60、70、80、90、95。
     * minimum: 50
     * maximum: 95
     * @return bandwidthUsageUpperThreshold
     */
    public BandwidthUsageUpperThresholdEnum getBandwidthUsageUpperThreshold() {
        return bandwidthUsageUpperThreshold;
    }

    public void setBandwidthUsageUpperThreshold(BandwidthUsageUpperThresholdEnum bandwidthUsageUpperThreshold) {
        this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
    }

    public UpdateInstanceBandwidthAutoScalingPolicyResponse withScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
        return this;
    }

    /**
     * 带宽扩展操作的静默时间（两次带宽扩展操作之间的最小间隔时间），单位：秒。 默认值：0。取值范围：0~86400。 
     * minimum: 0
     * maximum: 86400
     * @return scaleOutCooldown
     */
    public Integer getScaleOutCooldown() {
        return scaleOutCooldown;
    }

    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    public UpdateInstanceBandwidthAutoScalingPolicyResponse withScaleInEnabled(Boolean scaleInEnabled) {
        this.scaleInEnabled = scaleInEnabled;
        return this;
    }

    /**
     * 是否启用带宽自动回缩。默认值：false。该参数暂未启用。
     * @return scaleInEnabled
     */
    public Boolean getScaleInEnabled() {
        return scaleInEnabled;
    }

    public void setScaleInEnabled(Boolean scaleInEnabled) {
        this.scaleInEnabled = scaleInEnabled;
    }

    public UpdateInstanceBandwidthAutoScalingPolicyResponse withBandwidthUsageLowerThreshold(
        Integer bandwidthUsageLowerThreshold) {
        this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
        return this;
    }

    /**
     * 触发带宽自动回缩的带宽平均使用率阈值，单位：百分比。支持的取值：10、20、30。该参数暂未启用。
     * minimum: 10
     * maximum: 30
     * @return bandwidthUsageLowerThreshold
     */
    public Integer getBandwidthUsageLowerThreshold() {
        return bandwidthUsageLowerThreshold;
    }

    public void setBandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
        this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
    }

    public UpdateInstanceBandwidthAutoScalingPolicyResponse withScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
        return this;
    }

    /**
     * 带宽回缩操作的静默时间（两次带宽回缩操作之间的最小间隔时间），单位：秒。该参数暂未启用。 默认值：300。取值范围：0~86400。 
     * minimum: 0
     * maximum: 86400
     * @return scaleInCooldown
     */
    public Integer getScaleInCooldown() {
        return scaleInCooldown;
    }

    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceBandwidthAutoScalingPolicyResponse that = (UpdateInstanceBandwidthAutoScalingPolicyResponse) obj;
        return Objects.equals(this.windowSize, that.windowSize)
            && Objects.equals(this.bandwidthUsageUpperThreshold, that.bandwidthUsageUpperThreshold)
            && Objects.equals(this.scaleOutCooldown, that.scaleOutCooldown)
            && Objects.equals(this.scaleInEnabled, that.scaleInEnabled)
            && Objects.equals(this.bandwidthUsageLowerThreshold, that.bandwidthUsageLowerThreshold)
            && Objects.equals(this.scaleInCooldown, that.scaleInCooldown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(windowSize,
            bandwidthUsageUpperThreshold,
            scaleOutCooldown,
            scaleInEnabled,
            bandwidthUsageLowerThreshold,
            scaleInCooldown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceBandwidthAutoScalingPolicyResponse {\n");
        sb.append("    windowSize: ").append(toIndentedString(windowSize)).append("\n");
        sb.append("    bandwidthUsageUpperThreshold: ")
            .append(toIndentedString(bandwidthUsageUpperThreshold))
            .append("\n");
        sb.append("    scaleOutCooldown: ").append(toIndentedString(scaleOutCooldown)).append("\n");
        sb.append("    scaleInEnabled: ").append(toIndentedString(scaleInEnabled)).append("\n");
        sb.append("    bandwidthUsageLowerThreshold: ")
            .append(toIndentedString(bandwidthUsageLowerThreshold))
            .append("\n");
        sb.append("    scaleInCooldown: ").append(toIndentedString(scaleInCooldown)).append("\n");
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
