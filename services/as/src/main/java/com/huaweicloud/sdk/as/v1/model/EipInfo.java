package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置云服务器的弹性IP信息
 */
public class EipInfo {

    /**
     * 弹性IP地址类型。类型枚举值：5_bgp：全动态BGP;5_sbgp：静态BGP;5_telcom：中国电信;5_union：中国联通;详情请参见《虚拟私有云接口参考》“申请弹性公网IP”章节的“publicip”字段说明。
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
            IpTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IpTypeEnum(value);
            }
            return result;
        }

        public static IpTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            IpTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "ip_type")

    private IpTypeEnum ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    @JacksonXmlProperty(localName = "bandwidth")

    private BandwidthInfo bandwidth;

    public EipInfo withIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * 弹性IP地址类型。类型枚举值：5_bgp：全动态BGP;5_sbgp：静态BGP;5_telcom：中国电信;5_union：中国联通;详情请参见《虚拟私有云接口参考》“申请弹性公网IP”章节的“publicip”字段说明。
     * @return ipType
     */
    public IpTypeEnum getIpType() {
        return ipType;
    }

    public void setIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
    }

    public EipInfo withBandwidth(BandwidthInfo bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public EipInfo withBandwidth(Consumer<BandwidthInfo> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthInfo();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthInfo getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthInfo bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EipInfo eipInfo = (EipInfo) o;
        return Objects.equals(this.ipType, eipInfo.ipType) && Objects.equals(this.bandwidth, eipInfo.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipType, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipInfo {\n");
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
