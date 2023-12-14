package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 规格信息
 */
public class CreateFirewallReqFlavor {

    /**
     * 防火墙版本 “charge_mode”为“prePaid”时，仅支持专业版。 “charge_mode”为“postPaid”时，支持标准版、专业版。  Standard - 标准版 Professional - 专业版 Platinum - 铂金版，防火墙版本“charge_mode”为\"postPaid\"时，仅支持专业版。“charge_mode”为“prePaid”时，支持标准版、专业版。
     */
    public static final class VersionEnum {

        /**
         * Enum STANDARD for value: "Standard"
         */
        public static final VersionEnum STANDARD = new VersionEnum("Standard");

        /**
         * Enum PROFESSIONAL for value: "Professional"
         */
        public static final VersionEnum PROFESSIONAL = new VersionEnum("Professional");

        /**
         * Enum PLATINUM for value: "Platinum"
         */
        public static final VersionEnum PLATINUM = new VersionEnum("Platinum");

        private static final Map<String, VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionEnum> createStaticFields() {
            Map<String, VersionEnum> map = new HashMap<>();
            map.put("Standard", STANDARD);
            map.put("Professional", PROFESSIONAL);
            map.put("Platinum", PLATINUM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionEnum(String value) {
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
        public static VersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionEnum(value));
        }

        public static VersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionEnum) {
                return this.value.equals(((VersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private VersionEnum version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_eip_count")

    private Integer extendEipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_bandwidth")

    private Integer extendBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_vpc_count")

    private Integer extendVpcCount;

    public CreateFirewallReqFlavor withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    /**
     * 防火墙版本 “charge_mode”为“prePaid”时，仅支持专业版。 “charge_mode”为“postPaid”时，支持标准版、专业版。  Standard - 标准版 Professional - 专业版 Platinum - 铂金版，防火墙版本“charge_mode”为\"postPaid\"时，仅支持专业版。“charge_mode”为“prePaid”时，支持标准版、专业版。
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public CreateFirewallReqFlavor withExtendEipCount(Integer extendEipCount) {
        this.extendEipCount = extendEipCount;
        return this;
    }

    /**
     * 扩展EIP数量，仅包周期场景下生效
     * minimum: 0
     * maximum: 2000
     * @return extendEipCount
     */
    public Integer getExtendEipCount() {
        return extendEipCount;
    }

    public void setExtendEipCount(Integer extendEipCount) {
        this.extendEipCount = extendEipCount;
    }

    public CreateFirewallReqFlavor withExtendBandwidth(Integer extendBandwidth) {
        this.extendBandwidth = extendBandwidth;
        return this;
    }

    /**
     * 扩展带宽，步长为5，仅包周期场景下生效
     * minimum: 0
     * maximum: 5000
     * @return extendBandwidth
     */
    public Integer getExtendBandwidth() {
        return extendBandwidth;
    }

    public void setExtendBandwidth(Integer extendBandwidth) {
        this.extendBandwidth = extendBandwidth;
    }

    public CreateFirewallReqFlavor withExtendVpcCount(Integer extendVpcCount) {
        this.extendVpcCount = extendVpcCount;
        return this;
    }

    /**
     * 扩展VPC数量，仅包周期场景下生效
     * minimum: 0
     * maximum: 100
     * @return extendVpcCount
     */
    public Integer getExtendVpcCount() {
        return extendVpcCount;
    }

    public void setExtendVpcCount(Integer extendVpcCount) {
        this.extendVpcCount = extendVpcCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFirewallReqFlavor that = (CreateFirewallReqFlavor) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.extendEipCount, that.extendEipCount)
            && Objects.equals(this.extendBandwidth, that.extendBandwidth)
            && Objects.equals(this.extendVpcCount, that.extendVpcCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, extendEipCount, extendBandwidth, extendVpcCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFirewallReqFlavor {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    extendEipCount: ").append(toIndentedString(extendEipCount)).append("\n");
        sb.append("    extendBandwidth: ").append(toIndentedString(extendBandwidth)).append("\n");
        sb.append("    extendVpcCount: ").append(toIndentedString(extendVpcCount)).append("\n");
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
