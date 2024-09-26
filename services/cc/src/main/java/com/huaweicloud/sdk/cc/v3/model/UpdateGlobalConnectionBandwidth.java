package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新全域互联带宽的详细信息
 */
public class UpdateGlobalConnectionBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 功能说明：描述计费类型，描述可选计费类型。默认开放按带宽计费，传统95计费租户白名单控制。 取值范围：     bwd: 按带宽计费     95: 按传统型95计费     95avr: 按传统型日95计费
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

    private ChargeModeEnum chargeMode;

    /**
     * 功能说明：描述网络等级，从高到低分为铂金、金、银。默认金，其余租户白名单控制。 - Pt: 铂金 - Au: 金 - Ag: 银
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

    private SlaLevelEnum slaLevel;

    /**
     * 功能说明：绑定的服务类型。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络 - ALL: 所有实例类型
     */
    public static final class BindingServiceEnum {

        /**
         * Enum CC for value: "CC"
         */
        public static final BindingServiceEnum CC = new BindingServiceEnum("CC");

        /**
         * Enum GEIP for value: "GEIP"
         */
        public static final BindingServiceEnum GEIP = new BindingServiceEnum("GEIP");

        /**
         * Enum GCN for value: "GCN"
         */
        public static final BindingServiceEnum GCN = new BindingServiceEnum("GCN");

        /**
         * Enum GSN for value: "GSN"
         */
        public static final BindingServiceEnum GSN = new BindingServiceEnum("GSN");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final BindingServiceEnum ALL = new BindingServiceEnum("ALL");

        private static final Map<String, BindingServiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BindingServiceEnum> createStaticFields() {
            Map<String, BindingServiceEnum> map = new HashMap<>();
            map.put("CC", CC);
            map.put("GEIP", GEIP);
            map.put("GCN", GCN);
            map.put("GSN", GSN);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BindingServiceEnum(String value) {
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
        public static BindingServiceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BindingServiceEnum(value));
        }

        public static BindingServiceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BindingServiceEnum) {
                return this.value.equals(((BindingServiceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_service")

    private BindingServiceEnum bindingService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code_id")

    private String specCodeId;

    public UpdateGlobalConnectionBandwidth withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateGlobalConnectionBandwidth withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateGlobalConnectionBandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 功能说明：全域互联带宽实例中的带宽值大小，单位Mbit/s。 取值范围：2-300Mbit/s
     * minimum: 2
     * maximum: 300
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public UpdateGlobalConnectionBandwidth withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 功能说明：描述计费类型，描述可选计费类型。默认开放按带宽计费，传统95计费租户白名单控制。 取值范围：     bwd: 按带宽计费     95: 按传统型95计费     95avr: 按传统型日95计费
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public UpdateGlobalConnectionBandwidth withSlaLevel(SlaLevelEnum slaLevel) {
        this.slaLevel = slaLevel;
        return this;
    }

    /**
     * 功能说明：描述网络等级，从高到低分为铂金、金、银。默认金，其余租户白名单控制。 - Pt: 铂金 - Au: 金 - Ag: 银
     * @return slaLevel
     */
    public SlaLevelEnum getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(SlaLevelEnum slaLevel) {
        this.slaLevel = slaLevel;
    }

    public UpdateGlobalConnectionBandwidth withBindingService(BindingServiceEnum bindingService) {
        this.bindingService = bindingService;
        return this;
    }

    /**
     * 功能说明：绑定的服务类型。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络 - ALL: 所有实例类型
     * @return bindingService
     */
    public BindingServiceEnum getBindingService() {
        return bindingService;
    }

    public void setBindingService(BindingServiceEnum bindingService) {
        this.bindingService = bindingService;
    }

    public UpdateGlobalConnectionBandwidth withSpecCodeId(String specCodeId) {
        this.specCodeId = specCodeId;
        return this;
    }

    /**
     * 功能说明：线路规格编码UUID。
     * @return specCodeId
     */
    public String getSpecCodeId() {
        return specCodeId;
    }

    public void setSpecCodeId(String specCodeId) {
        this.specCodeId = specCodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGlobalConnectionBandwidth that = (UpdateGlobalConnectionBandwidth) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.size, that.size) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.slaLevel, that.slaLevel) && Objects.equals(this.bindingService, that.bindingService)
            && Objects.equals(this.specCodeId, that.specCodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, size, chargeMode, slaLevel, bindingService, specCodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalConnectionBandwidth {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    slaLevel: ").append(toIndentedString(slaLevel)).append("\n");
        sb.append("    bindingService: ").append(toIndentedString(bindingService)).append("\n");
        sb.append("    specCodeId: ").append(toIndentedString(specCodeId)).append("\n");
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
