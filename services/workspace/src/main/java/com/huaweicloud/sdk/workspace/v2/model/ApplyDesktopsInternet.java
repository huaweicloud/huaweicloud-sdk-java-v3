package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 开通桌面上网能力请求体。
 */
public class ApplyDesktopsInternet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_type")

    private String eipType;

    /**
     * eip带宽计费模式 - TRAFFIC：按流量计费。 - BANDWIDTH：按带宽计费。
     */
    public static final class EipChargeModeEnum {

        /**
         * Enum TRAFFIC for value: "TRAFFIC"
         */
        public static final EipChargeModeEnum TRAFFIC = new EipChargeModeEnum("TRAFFIC");

        /**
         * Enum BANDWIDTH for value: "BANDWIDTH"
         */
        public static final EipChargeModeEnum BANDWIDTH = new EipChargeModeEnum("BANDWIDTH");

        private static final Map<String, EipChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EipChargeModeEnum> createStaticFields() {
            Map<String, EipChargeModeEnum> map = new HashMap<>();
            map.put("TRAFFIC", TRAFFIC);
            map.put("BANDWIDTH", BANDWIDTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EipChargeModeEnum(String value) {
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
        public static EipChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EipChargeModeEnum(value));
        }

        public static EipChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EipChargeModeEnum) {
                return this.value.equals(((EipChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_charge_mode")

    private EipChargeModeEnum eipChargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ApplyDesktopsInternet withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public ApplyDesktopsInternet addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public ApplyDesktopsInternet withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 需要开通上网功能的桌面id列表。
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    public ApplyDesktopsInternet withEipType(String eipType) {
        this.eipType = eipType;
        return this;
    }

    /**
     * 支持的类型请参考EIP服务支持的类型。可通过调用如下链接的接口查询，https://support.huaweicloud.com/api-eip/ShowPublicIpType.html。
     * @return eipType
     */
    public String getEipType() {
        return eipType;
    }

    public void setEipType(String eipType) {
        this.eipType = eipType;
    }

    public ApplyDesktopsInternet withEipChargeMode(EipChargeModeEnum eipChargeMode) {
        this.eipChargeMode = eipChargeMode;
        return this;
    }

    /**
     * eip带宽计费模式 - TRAFFIC：按流量计费。 - BANDWIDTH：按带宽计费。
     * @return eipChargeMode
     */
    public EipChargeModeEnum getEipChargeMode() {
        return eipChargeMode;
    }

    public void setEipChargeMode(EipChargeModeEnum eipChargeMode) {
        this.eipChargeMode = eipChargeMode;
    }

    public ApplyDesktopsInternet withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽大小，单位Mbit/s。默认1Mbit/s~2000Mbit/s（具体范围以各区域配置为准，请参见控制台对应页面显示）。
     * minimum: 1
     * maximum: 2000
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public ApplyDesktopsInternet withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 需要购买EIP的数量，当desktop_ids为空时需要填，兼容单独购买EIP场景。
     * minimum: 0
     * maximum: 100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyDesktopsInternet that = (ApplyDesktopsInternet) obj;
        return Objects.equals(this.desktopIds, that.desktopIds) && Objects.equals(this.eipType, that.eipType)
            && Objects.equals(this.eipChargeMode, that.eipChargeMode)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopIds, eipType, eipChargeMode, bandwidthSize, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyDesktopsInternet {\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    eipType: ").append(toIndentedString(eipType)).append("\n");
        sb.append("    eipChargeMode: ").append(toIndentedString(eipChargeMode)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
