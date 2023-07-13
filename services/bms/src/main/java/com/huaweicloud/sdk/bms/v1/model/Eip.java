package com.huaweicloud.sdk.bms.v1.model;

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
 * eip字段数据结构说明
 */
public class Eip {

    /**
     * 弹性公网IP地址类型。类型枚举值：5_bgp、5_sbgp详情请参见《虚拟私有云API参考》申请弹性公网IP章节的publicip字段说明。
     */
    public static final class IptypeEnum {

        /**
         * Enum _5_BGP for value: "5_bgp"
         */
        public static final IptypeEnum _5_BGP = new IptypeEnum("5_bgp");

        /**
         * Enum _5_SBGP for value: "5_sbgp"
         */
        public static final IptypeEnum _5_SBGP = new IptypeEnum("5_sbgp");

        private static final Map<String, IptypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IptypeEnum> createStaticFields() {
            Map<String, IptypeEnum> map = new HashMap<>();
            map.put("5_bgp", _5_BGP);
            map.put("5_sbgp", _5_SBGP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IptypeEnum(String value) {
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
        public static IptypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IptypeEnum(value));
        }

        public static IptypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IptypeEnum) {
                return this.value.equals(((IptypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iptype")

    private IptypeEnum iptype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandWidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private ExtendParamEip extendparam;

    public Eip withIptype(IptypeEnum iptype) {
        this.iptype = iptype;
        return this;
    }

    /**
     * 弹性公网IP地址类型。类型枚举值：5_bgp、5_sbgp详情请参见《虚拟私有云API参考》申请弹性公网IP章节的publicip字段说明。
     * @return iptype
     */
    public IptypeEnum getIptype() {
        return iptype;
    }

    public void setIptype(IptypeEnum iptype) {
        this.iptype = iptype;
    }

    public Eip withBandwidth(BandWidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Eip withBandwidth(Consumer<BandWidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandWidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandWidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandWidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Eip withExtendparam(ExtendParamEip extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public Eip withExtendparam(Consumer<ExtendParamEip> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new ExtendParamEip();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    /**
     * Get extendparam
     * @return extendparam
     */
    public ExtendParamEip getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(ExtendParamEip extendparam) {
        this.extendparam = extendparam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Eip that = (Eip) obj;
        return Objects.equals(this.iptype, that.iptype) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.extendparam, that.extendparam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iptype, bandwidth, extendparam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Eip {\n");
        sb.append("    iptype: ").append(toIndentedString(iptype)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
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
