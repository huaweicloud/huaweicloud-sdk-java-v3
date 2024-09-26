package com.huaweicloud.sdk.cc.v3.model;

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
 * 租户购买全域互联带宽的动态配置项。
 */
public class ListGlobalConnectionBandwidthConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_range")

    private List<GlobalConnectionBandwidthSizeRange> sizeRange = null;

    /**
     * 计费类型： - bwd: 按带宽计费 - 95: 按传统型95计费 - 95avr (日95计费)
     */
    public static final class ChargeModeEnum {

        /**
         * Enum BWD for value: "bwd"
         */
        public static final ChargeModeEnum BWD = new ChargeModeEnum("bwd");

        /**
         * Enum _95 for value: "95"
         */
        public static final ChargeModeEnum _95 = new ChargeModeEnum("95");

        /**
         * Enum _95AVR for value: "95avr"
         */
        public static final ChargeModeEnum _95AVR = new ChargeModeEnum("95avr");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("bwd", BWD);
            map.put("95", _95);
            map.put("95avr", _95AVR);
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

    private List<ChargeModeEnum> chargeMode = null;

    /**
     * 支持服务实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络
     */
    public static final class ServicesEnum {

        /**
         * Enum CC for value: "CC"
         */
        public static final ServicesEnum CC = new ServicesEnum("CC");

        /**
         * Enum GEIP for value: "GEIP"
         */
        public static final ServicesEnum GEIP = new ServicesEnum("GEIP");

        /**
         * Enum GCN for value: "GCN"
         */
        public static final ServicesEnum GCN = new ServicesEnum("GCN");

        /**
         * Enum GSN for value: "GSN"
         */
        public static final ServicesEnum GSN = new ServicesEnum("GSN");

        private static final Map<String, ServicesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServicesEnum> createStaticFields() {
            Map<String, ServicesEnum> map = new HashMap<>();
            map.put("CC", CC);
            map.put("GEIP", GEIP);
            map.put("GCN", GCN);
            map.put("GSN", GSN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServicesEnum(String value) {
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
        public static ServicesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServicesEnum(value));
        }

        public static ServicesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServicesEnum) {
                return this.value.equals(((ServicesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "services")

    private List<ServicesEnum> services = null;

    /**
     * 支持的带宽类型： - TrsArea: 跨区带宽 - Area: 大区带宽 - SubArea: 区域带宽 - Region: 城域带宽
     */
    public static final class GcbTypeEnum {

        /**
         * Enum REGION for value: "Region"
         */
        public static final GcbTypeEnum REGION = new GcbTypeEnum("Region");

        /**
         * Enum SUBAREA for value: "SubArea"
         */
        public static final GcbTypeEnum SUBAREA = new GcbTypeEnum("SubArea");

        /**
         * Enum AREA for value: "Area"
         */
        public static final GcbTypeEnum AREA = new GcbTypeEnum("Area");

        /**
         * Enum TRSAREA for value: "TrsArea"
         */
        public static final GcbTypeEnum TRSAREA = new GcbTypeEnum("TrsArea");

        private static final Map<String, GcbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GcbTypeEnum> createStaticFields() {
            Map<String, GcbTypeEnum> map = new HashMap<>();
            map.put("Region", REGION);
            map.put("SubArea", SUBAREA);
            map.put("Area", AREA);
            map.put("TrsArea", TRSAREA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GcbTypeEnum(String value) {
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
        public static GcbTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GcbTypeEnum(value));
        }

        public static GcbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GcbTypeEnum) {
                return this.value.equals(((GcbTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_type")

    private List<GcbTypeEnum> gcbType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_95peak_plus")

    private Integer ratio95peakPlus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_95peak_guar")

    private Integer ratio95peakGuar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crossborder")

    private Boolean crossborder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<GlobalConnectionBandwidthQuotas> quotas = null;

    /**
     * 支持线路分级： - Pt: 铂金 - Au: 金 - Ag: 银
     */
    public static final class SlaLevelEnum {

        /**
         * Enum PT for value: "Pt"
         */
        public static final SlaLevelEnum PT = new SlaLevelEnum("Pt");

        /**
         * Enum AU for value: "Au"
         */
        public static final SlaLevelEnum AU = new SlaLevelEnum("Au");

        /**
         * Enum AG for value: "Ag"
         */
        public static final SlaLevelEnum AG = new SlaLevelEnum("Ag");

        private static final Map<String, SlaLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SlaLevelEnum> createStaticFields() {
            Map<String, SlaLevelEnum> map = new HashMap<>();
            map.put("Pt", PT);
            map.put("Au", AU);
            map.put("Ag", AG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SlaLevelEnum(String value) {
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
        public static SlaLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SlaLevelEnum(value));
        }

        public static SlaLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SlaLevelEnum) {
                return this.value.equals(((SlaLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_level")

    private List<SlaLevelEnum> slaLevel = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_limit")

    private Integer bindLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_area_bandwidth")

    private Boolean enableAreaBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_change_95")

    private Boolean enableChange95;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_spec_code")

    private Boolean enableSpecCode;

    public ListGlobalConnectionBandwidthConfigs withSizeRange(List<GlobalConnectionBandwidthSizeRange> sizeRange) {
        this.sizeRange = sizeRange;
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs addSizeRangeItem(GlobalConnectionBandwidthSizeRange sizeRangeItem) {
        if (this.sizeRange == null) {
            this.sizeRange = new ArrayList<>();
        }
        this.sizeRange.add(sizeRangeItem);
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs withSizeRange(
        Consumer<List<GlobalConnectionBandwidthSizeRange>> sizeRangeSetter) {
        if (this.sizeRange == null) {
            this.sizeRange = new ArrayList<>();
        }
        sizeRangeSetter.accept(this.sizeRange);
        return this;
    }

    /**
     * 计费类型对应全域互联带宽大小范围。
     * @return sizeRange
     */
    public List<GlobalConnectionBandwidthSizeRange> getSizeRange() {
        return sizeRange;
    }

    public void setSizeRange(List<GlobalConnectionBandwidthSizeRange> sizeRange) {
        this.sizeRange = sizeRange;
    }

    public ListGlobalConnectionBandwidthConfigs withChargeMode(List<ChargeModeEnum> chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs addChargeModeItem(ChargeModeEnum chargeModeItem) {
        if (this.chargeMode == null) {
            this.chargeMode = new ArrayList<>();
        }
        this.chargeMode.add(chargeModeItem);
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs withChargeMode(Consumer<List<ChargeModeEnum>> chargeModeSetter) {
        if (this.chargeMode == null) {
            this.chargeMode = new ArrayList<>();
        }
        chargeModeSetter.accept(this.chargeMode);
        return this;
    }

    /**
     * 支持的计费类型列表。
     * @return chargeMode
     */
    public List<ChargeModeEnum> getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(List<ChargeModeEnum> chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListGlobalConnectionBandwidthConfigs withServices(List<ServicesEnum> services) {
        this.services = services;
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs addServicesItem(ServicesEnum servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs withServices(Consumer<List<ServicesEnum>> servicesSetter) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /**
     * 支持服务实例类型。
     * @return services
     */
    public List<ServicesEnum> getServices() {
        return services;
    }

    public void setServices(List<ServicesEnum> services) {
        this.services = services;
    }

    public ListGlobalConnectionBandwidthConfigs withGcbType(List<GcbTypeEnum> gcbType) {
        this.gcbType = gcbType;
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs addGcbTypeItem(GcbTypeEnum gcbTypeItem) {
        if (this.gcbType == null) {
            this.gcbType = new ArrayList<>();
        }
        this.gcbType.add(gcbTypeItem);
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs withGcbType(Consumer<List<GcbTypeEnum>> gcbTypeSetter) {
        if (this.gcbType == null) {
            this.gcbType = new ArrayList<>();
        }
        gcbTypeSetter.accept(this.gcbType);
        return this;
    }

    /**
     * 支持的带宽类型。
     * @return gcbType
     */
    public List<GcbTypeEnum> getGcbType() {
        return gcbType;
    }

    public void setGcbType(List<GcbTypeEnum> gcbType) {
        this.gcbType = gcbType;
    }

    public ListGlobalConnectionBandwidthConfigs withRatio95peakPlus(Integer ratio95peakPlus) {
        this.ratio95peakPlus = ratio95peakPlus;
        return this;
    }

    /**
     * 按增强型95计费保底消费百分比。
     * minimum: 0
     * maximum: 100
     * @return ratio95peakPlus
     */
    public Integer getRatio95peakPlus() {
        return ratio95peakPlus;
    }

    public void setRatio95peakPlus(Integer ratio95peakPlus) {
        this.ratio95peakPlus = ratio95peakPlus;
    }

    public ListGlobalConnectionBandwidthConfigs withRatio95peakGuar(Integer ratio95peakGuar) {
        this.ratio95peakGuar = ratio95peakGuar;
        return this;
    }

    /**
     * 按传统型95计费保底消费百分比。
     * minimum: 0
     * maximum: 100
     * @return ratio95peakGuar
     */
    public Integer getRatio95peakGuar() {
        return ratio95peakGuar;
    }

    public void setRatio95peakGuar(Integer ratio95peakGuar) {
        this.ratio95peakGuar = ratio95peakGuar;
    }

    public ListGlobalConnectionBandwidthConfigs withCrossborder(Boolean crossborder) {
        this.crossborder = crossborder;
        return this;
    }

    /**
     * 是否已经完成跨境审批。
     * @return crossborder
     */
    public Boolean getCrossborder() {
        return crossborder;
    }

    public void setCrossborder(Boolean crossborder) {
        this.crossborder = crossborder;
    }

    public ListGlobalConnectionBandwidthConfigs withQuotas(List<GlobalConnectionBandwidthQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs addQuotasItem(GlobalConnectionBandwidthQuotas quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs withQuotas(
        Consumer<List<GlobalConnectionBandwidthQuotas>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * 配额信息。
     * @return quotas
     */
    public List<GlobalConnectionBandwidthQuotas> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<GlobalConnectionBandwidthQuotas> quotas) {
        this.quotas = quotas;
    }

    public ListGlobalConnectionBandwidthConfigs withSlaLevel(List<SlaLevelEnum> slaLevel) {
        this.slaLevel = slaLevel;
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs addSlaLevelItem(SlaLevelEnum slaLevelItem) {
        if (this.slaLevel == null) {
            this.slaLevel = new ArrayList<>();
        }
        this.slaLevel.add(slaLevelItem);
        return this;
    }

    public ListGlobalConnectionBandwidthConfigs withSlaLevel(Consumer<List<SlaLevelEnum>> slaLevelSetter) {
        if (this.slaLevel == null) {
            this.slaLevel = new ArrayList<>();
        }
        slaLevelSetter.accept(this.slaLevel);
        return this;
    }

    /**
     * 支持线路分级。
     * @return slaLevel
     */
    public List<SlaLevelEnum> getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(List<SlaLevelEnum> slaLevel) {
        this.slaLevel = slaLevel;
    }

    public ListGlobalConnectionBandwidthConfigs withBindLimit(Integer bindLimit) {
        this.bindLimit = bindLimit;
        return this;
    }

    /**
     * 共享带宽允许绑定实例数量上限。
     * minimum: 0
     * maximum: 2000
     * @return bindLimit
     */
    public Integer getBindLimit() {
        return bindLimit;
    }

    public void setBindLimit(Integer bindLimit) {
        this.bindLimit = bindLimit;
    }

    public ListGlobalConnectionBandwidthConfigs withEnableAreaBandwidth(Boolean enableAreaBandwidth) {
        this.enableAreaBandwidth = enableAreaBandwidth;
        return this;
    }

    /**
     * 是否启用传统的大区带宽。
     * @return enableAreaBandwidth
     */
    public Boolean getEnableAreaBandwidth() {
        return enableAreaBandwidth;
    }

    public void setEnableAreaBandwidth(Boolean enableAreaBandwidth) {
        this.enableAreaBandwidth = enableAreaBandwidth;
    }

    public ListGlobalConnectionBandwidthConfigs withEnableChange95(Boolean enableChange95) {
        this.enableChange95 = enableChange95;
        return this;
    }

    /**
     * 是否支持95转按需。
     * @return enableChange95
     */
    public Boolean getEnableChange95() {
        return enableChange95;
    }

    public void setEnableChange95(Boolean enableChange95) {
        this.enableChange95 = enableChange95;
    }

    public ListGlobalConnectionBandwidthConfigs withEnableSpecCode(Boolean enableSpecCode) {
        this.enableSpecCode = enableSpecCode;
        return this;
    }

    /**
     * 是否支持多SKU产品功能。
     * @return enableSpecCode
     */
    public Boolean getEnableSpecCode() {
        return enableSpecCode;
    }

    public void setEnableSpecCode(Boolean enableSpecCode) {
        this.enableSpecCode = enableSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthConfigs that = (ListGlobalConnectionBandwidthConfigs) obj;
        return Objects.equals(this.sizeRange, that.sizeRange) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.services, that.services) && Objects.equals(this.gcbType, that.gcbType)
            && Objects.equals(this.ratio95peakPlus, that.ratio95peakPlus)
            && Objects.equals(this.ratio95peakGuar, that.ratio95peakGuar)
            && Objects.equals(this.crossborder, that.crossborder) && Objects.equals(this.quotas, that.quotas)
            && Objects.equals(this.slaLevel, that.slaLevel) && Objects.equals(this.bindLimit, that.bindLimit)
            && Objects.equals(this.enableAreaBandwidth, that.enableAreaBandwidth)
            && Objects.equals(this.enableChange95, that.enableChange95)
            && Objects.equals(this.enableSpecCode, that.enableSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeRange,
            chargeMode,
            services,
            gcbType,
            ratio95peakPlus,
            ratio95peakGuar,
            crossborder,
            quotas,
            slaLevel,
            bindLimit,
            enableAreaBandwidth,
            enableChange95,
            enableSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthConfigs {\n");
        sb.append("    sizeRange: ").append(toIndentedString(sizeRange)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    gcbType: ").append(toIndentedString(gcbType)).append("\n");
        sb.append("    ratio95peakPlus: ").append(toIndentedString(ratio95peakPlus)).append("\n");
        sb.append("    ratio95peakGuar: ").append(toIndentedString(ratio95peakGuar)).append("\n");
        sb.append("    crossborder: ").append(toIndentedString(crossborder)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    slaLevel: ").append(toIndentedString(slaLevel)).append("\n");
        sb.append("    bindLimit: ").append(toIndentedString(bindLimit)).append("\n");
        sb.append("    enableAreaBandwidth: ").append(toIndentedString(enableAreaBandwidth)).append("\n");
        sb.append("    enableChange95: ").append(toIndentedString(enableChange95)).append("\n");
        sb.append("    enableSpecCode: ").append(toIndentedString(enableSpecCode)).append("\n");
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
