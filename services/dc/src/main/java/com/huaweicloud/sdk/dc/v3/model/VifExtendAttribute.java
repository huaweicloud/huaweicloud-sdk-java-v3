package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 虚拟接口BFD/NQA等可靠性检测的扩展信息
 */
public class VifExtendAttribute {

    /**
     * 虚拟接口的可用性检测类型。取值范围： - nqa：网络质量分析 - bfd：双向转发检测
     */
    public static final class HaTypeEnum {

        /**
         * Enum NQA for value: "nqa"
         */
        public static final HaTypeEnum NQA = new HaTypeEnum("nqa");

        /**
         * Enum BFD for value: "bfd"
         */
        public static final HaTypeEnum BFD = new HaTypeEnum("bfd");

        private static final Map<String, HaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaTypeEnum> createStaticFields() {
            Map<String, HaTypeEnum> map = new HashMap<>();
            map.put("nqa", NQA);
            map.put("bfd", BFD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaTypeEnum(String value) {
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
        public static HaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaTypeEnum(value));
        }

        public static HaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaTypeEnum) {
                return this.value.equals(((HaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_type")

    private HaTypeEnum haType;

    /**
     * 虚拟接口可用性检测的配置模式。取值范围： - auto_single：自动单跳bfd - auto_multi：自动多跳bfd - static_single：静态单跳bfd - static_multi：静态多跳bfd - enhance_nqa：增强型nqa
     */
    public static final class HaModeEnum {

        /**
         * Enum AUTO_SINGLE for value: "auto_single"
         */
        public static final HaModeEnum AUTO_SINGLE = new HaModeEnum("auto_single");

        /**
         * Enum AUTO_MULTI for value: "auto_multi"
         */
        public static final HaModeEnum AUTO_MULTI = new HaModeEnum("auto_multi");

        /**
         * Enum STATIC_SINGLE for value: "static_single"
         */
        public static final HaModeEnum STATIC_SINGLE = new HaModeEnum("static_single");

        /**
         * Enum STATIC_MULTI for value: "static_multi"
         */
        public static final HaModeEnum STATIC_MULTI = new HaModeEnum("static_multi");

        /**
         * Enum ENHANCE_NQA for value: "enhance_nqa"
         */
        public static final HaModeEnum ENHANCE_NQA = new HaModeEnum("enhance_nqa");

        private static final Map<String, HaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaModeEnum> createStaticFields() {
            Map<String, HaModeEnum> map = new HashMap<>();
            map.put("auto_single", AUTO_SINGLE);
            map.put("auto_multi", AUTO_MULTI);
            map.put("static_single", STATIC_SINGLE);
            map.put("static_multi", STATIC_MULTI);
            map.put("enhance_nqa", ENHANCE_NQA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaModeEnum(String value) {
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
        public static HaModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaModeEnum(value));
        }

        public static HaModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaModeEnum) {
                return this.value.equals(((HaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private HaModeEnum haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_multiplier")

    private Integer detectMultiplier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_rx_interval")

    private Integer minRxInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_tx_interval")

    private Integer minTxInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_disclaim")

    private Integer remoteDisclaim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_disclaim")

    private Integer localDisclaim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_remote_disclaim")

    private Integer ipv6RemoteDisclaim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_local_disclaim")

    private Integer ipv6LocalDisclaim;

    public VifExtendAttribute withHaType(HaTypeEnum haType) {
        this.haType = haType;
        return this;
    }

    /**
     * 虚拟接口的可用性检测类型。取值范围： - nqa：网络质量分析 - bfd：双向转发检测
     * @return haType
     */
    public HaTypeEnum getHaType() {
        return haType;
    }

    public void setHaType(HaTypeEnum haType) {
        this.haType = haType;
    }

    public VifExtendAttribute withHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 虚拟接口可用性检测的配置模式。取值范围： - auto_single：自动单跳bfd - auto_multi：自动多跳bfd - static_single：静态单跳bfd - static_multi：静态多跳bfd - enhance_nqa：增强型nqa
     * @return haMode
     */
    public HaModeEnum getHaMode() {
        return haMode;
    }

    public void setHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
    }

    public VifExtendAttribute withDetectMultiplier(Integer detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
        return this;
    }

    /**
     * 检测的重试次数
     * minimum: 3
     * maximum: 20
     * @return detectMultiplier
     */
    public Integer getDetectMultiplier() {
        return detectMultiplier;
    }

    public void setDetectMultiplier(Integer detectMultiplier) {
        this.detectMultiplier = detectMultiplier;
    }

    public VifExtendAttribute withMinRxInterval(Integer minRxInterval) {
        this.minRxInterval = minRxInterval;
        return this;
    }

    /**
     * 检测的接收时长间隔，单位为毫秒。   - 当ha_type为nqa时，实际生效的时间间隔为按秒为单位将输入的数值向上取整，例如输入1500毫秒，实际时间间隔为2秒；   - 当ha_type为bfd时，实际生效的时间间隔为按毫秒为单位的输入数值。最小值为200毫秒，最大值为1000毫秒。
     * minimum: 200
     * maximum: 5000
     * @return minRxInterval
     */
    public Integer getMinRxInterval() {
        return minRxInterval;
    }

    public void setMinRxInterval(Integer minRxInterval) {
        this.minRxInterval = minRxInterval;
    }

    public VifExtendAttribute withMinTxInterval(Integer minTxInterval) {
        this.minTxInterval = minTxInterval;
        return this;
    }

    /**
     * 检测的发送时长间隔，单位为毫秒。   - 当ha_type为nqa时，实际生效的时间间隔为按秒为单位将输入的数值向上取整，例如输入1500毫秒，实际时间间隔为2秒；   - 当ha_type为bfd时，实际生效的时间间隔为按毫秒为单位的输入数值。最小值为200毫秒，最大值为1000毫秒。
     * minimum: 200
     * maximum: 5000
     * @return minTxInterval
     */
    public Integer getMinTxInterval() {
        return minTxInterval;
    }

    public void setMinTxInterval(Integer minTxInterval) {
        this.minTxInterval = minTxInterval;
    }

    public VifExtendAttribute withRemoteDisclaim(Integer remoteDisclaim) {
        this.remoteDisclaim = remoteDisclaim;
        return this;
    }

    /**
     * 检测的远端的标识，用于静态BFD
     * minimum: 1
     * maximum: 16384
     * @return remoteDisclaim
     */
    public Integer getRemoteDisclaim() {
        return remoteDisclaim;
    }

    public void setRemoteDisclaim(Integer remoteDisclaim) {
        this.remoteDisclaim = remoteDisclaim;
    }

    public VifExtendAttribute withLocalDisclaim(Integer localDisclaim) {
        this.localDisclaim = localDisclaim;
        return this;
    }

    /**
     * 检测的本端的标识，用于静态BFD
     * minimum: 1
     * maximum: 16384
     * @return localDisclaim
     */
    public Integer getLocalDisclaim() {
        return localDisclaim;
    }

    public void setLocalDisclaim(Integer localDisclaim) {
        this.localDisclaim = localDisclaim;
    }

    public VifExtendAttribute withIpv6RemoteDisclaim(Integer ipv6RemoteDisclaim) {
        this.ipv6RemoteDisclaim = ipv6RemoteDisclaim;
        return this;
    }

    /**
     * 检测的远端的标识，用于静态ipv6 BFD
     * minimum: 1
     * maximum: 16384
     * @return ipv6RemoteDisclaim
     */
    public Integer getIpv6RemoteDisclaim() {
        return ipv6RemoteDisclaim;
    }

    public void setIpv6RemoteDisclaim(Integer ipv6RemoteDisclaim) {
        this.ipv6RemoteDisclaim = ipv6RemoteDisclaim;
    }

    public VifExtendAttribute withIpv6LocalDisclaim(Integer ipv6LocalDisclaim) {
        this.ipv6LocalDisclaim = ipv6LocalDisclaim;
        return this;
    }

    /**
     * 检测的本端的标识，用于静态ipv6 BFD
     * minimum: 1
     * maximum: 16384
     * @return ipv6LocalDisclaim
     */
    public Integer getIpv6LocalDisclaim() {
        return ipv6LocalDisclaim;
    }

    public void setIpv6LocalDisclaim(Integer ipv6LocalDisclaim) {
        this.ipv6LocalDisclaim = ipv6LocalDisclaim;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VifExtendAttribute that = (VifExtendAttribute) obj;
        return Objects.equals(this.haType, that.haType) && Objects.equals(this.haMode, that.haMode)
            && Objects.equals(this.detectMultiplier, that.detectMultiplier)
            && Objects.equals(this.minRxInterval, that.minRxInterval)
            && Objects.equals(this.minTxInterval, that.minTxInterval)
            && Objects.equals(this.remoteDisclaim, that.remoteDisclaim)
            && Objects.equals(this.localDisclaim, that.localDisclaim)
            && Objects.equals(this.ipv6RemoteDisclaim, that.ipv6RemoteDisclaim)
            && Objects.equals(this.ipv6LocalDisclaim, that.ipv6LocalDisclaim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(haType,
            haMode,
            detectMultiplier,
            minRxInterval,
            minTxInterval,
            remoteDisclaim,
            localDisclaim,
            ipv6RemoteDisclaim,
            ipv6LocalDisclaim);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VifExtendAttribute {\n");
        sb.append("    haType: ").append(toIndentedString(haType)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    detectMultiplier: ").append(toIndentedString(detectMultiplier)).append("\n");
        sb.append("    minRxInterval: ").append(toIndentedString(minRxInterval)).append("\n");
        sb.append("    minTxInterval: ").append(toIndentedString(minTxInterval)).append("\n");
        sb.append("    remoteDisclaim: ").append(toIndentedString(remoteDisclaim)).append("\n");
        sb.append("    localDisclaim: ").append(toIndentedString(localDisclaim)).append("\n");
        sb.append("    ipv6RemoteDisclaim: ").append(toIndentedString(ipv6RemoteDisclaim)).append("\n");
        sb.append("    ipv6LocalDisclaim: ").append(toIndentedString(ipv6LocalDisclaim)).append("\n");
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
