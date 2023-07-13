package com.huaweicloud.sdk.as.v1.model;

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
 * eip信息
 */
public class EipResult {

    /**
     * IP地址类型。
     */
    public static final class IpTypeEnum {

        /**
         * Enum _5_BGP for value: "5_bgp"
         */
        public static final IpTypeEnum _5_BGP = new IpTypeEnum("5_bgp");

        /**
         * Enum _5_SBGP for value: "5_sbgp"
         */
        public static final IpTypeEnum _5_SBGP = new IpTypeEnum("5_sbgp");

        /**
         * Enum _5_TELCOM for value: "5_telcom"
         */
        public static final IpTypeEnum _5_TELCOM = new IpTypeEnum("5_telcom");

        /**
         * Enum _5_UNION for value: "5_union"
         */
        public static final IpTypeEnum _5_UNION = new IpTypeEnum("5_union");

        private static final Map<String, IpTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpTypeEnum> createStaticFields() {
            Map<String, IpTypeEnum> map = new HashMap<>();
            map.put("5_bgp", _5_BGP);
            map.put("5_sbgp", _5_SBGP);
            map.put("5_telcom", _5_TELCOM);
            map.put("5_union", _5_UNION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpTypeEnum(String value) {
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
        public static IpTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpTypeEnum(value));
        }

        public static IpTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpTypeEnum) {
                return this.value.equals(((IpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private IpTypeEnum ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandwidthResult bandwidth;

    public EipResult withIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * IP地址类型。
     * @return ipType
     */
    public IpTypeEnum getIpType() {
        return ipType;
    }

    public void setIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
    }

    public EipResult withBandwidth(BandwidthResult bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public EipResult withBandwidth(Consumer<BandwidthResult> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthResult();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthResult getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthResult bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipResult that = (EipResult) obj;
        return Objects.equals(this.ipType, that.ipType) && Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipType, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipResult {\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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
