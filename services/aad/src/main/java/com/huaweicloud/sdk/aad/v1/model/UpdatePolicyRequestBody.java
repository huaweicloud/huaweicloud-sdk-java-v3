package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新策略的请求体
 */
public class UpdatePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * udp协议设置。block：封禁，unblock：不封禁，limiting：限速
     */
    public static final class UdpEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final UdpEnum BLOCK = new UdpEnum("block");

        /**
         * Enum UNBLOCK for value: "unblock"
         */
        public static final UdpEnum UNBLOCK = new UdpEnum("unblock");

        /**
         * Enum LIMITING for value: "limiting"
         */
        public static final UdpEnum LIMITING = new UdpEnum("limiting");

        private static final Map<String, UdpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UdpEnum> createStaticFields() {
            Map<String, UdpEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("unblock", UNBLOCK);
            map.put("limiting", LIMITING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UdpEnum(String value) {
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
        public static UdpEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UdpEnum(value));
        }

        public static UdpEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UdpEnum) {
                return this.value.equals(((UdpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udp")

    private UdpEnum udp;

    /**
     * tcp协议设置。block：封禁，unblock：不封禁，limiting：限速
     */
    public static final class TcpEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final TcpEnum BLOCK = new TcpEnum("block");

        /**
         * Enum UNBLOCK for value: "unblock"
         */
        public static final TcpEnum UNBLOCK = new TcpEnum("unblock");

        /**
         * Enum LIMITING for value: "limiting"
         */
        public static final TcpEnum LIMITING = new TcpEnum("limiting");

        private static final Map<String, TcpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TcpEnum> createStaticFields() {
            Map<String, TcpEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("unblock", UNBLOCK);
            map.put("limiting", LIMITING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TcpEnum(String value) {
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
        public static TcpEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TcpEnum(value));
        }

        public static TcpEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TcpEnum) {
                return this.value.equals(((TcpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp")

    private TcpEnum tcp;

    /**
     * icmp协议设置。block：封禁，unblock：不封禁，limiting：限速
     */
    public static final class IcmpEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final IcmpEnum BLOCK = new IcmpEnum("block");

        /**
         * Enum UNBLOCK for value: "unblock"
         */
        public static final IcmpEnum UNBLOCK = new IcmpEnum("unblock");

        /**
         * Enum LIMITING for value: "limiting"
         */
        public static final IcmpEnum LIMITING = new IcmpEnum("limiting");

        private static final Map<String, IcmpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IcmpEnum> createStaticFields() {
            Map<String, IcmpEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("unblock", UNBLOCK);
            map.put("limiting", LIMITING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IcmpEnum(String value) {
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
        public static IcmpEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IcmpEnum(value));
        }

        public static IcmpEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IcmpEnum) {
                return this.value.equals(((IcmpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icmp")

    private IcmpEnum icmp;

    /**
     * other协议设置。block：封禁，unblock：不封禁，limiting：限速
     */
    public static final class OtherEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final OtherEnum BLOCK = new OtherEnum("block");

        /**
         * Enum UNBLOCK for value: "unblock"
         */
        public static final OtherEnum UNBLOCK = new OtherEnum("unblock");

        /**
         * Enum LIMITING for value: "limiting"
         */
        public static final OtherEnum LIMITING = new OtherEnum("limiting");

        private static final Map<String, OtherEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OtherEnum> createStaticFields() {
            Map<String, OtherEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("unblock", UNBLOCK);
            map.put("limiting", LIMITING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OtherEnum(String value) {
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
        public static OtherEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OtherEnum(value));
        }

        public static OtherEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OtherEnum) {
                return this.value.equals(((OtherEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private OtherEnum other;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icmp_traffic_limiting")

    private Long icmpTrafficLimiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udp_traffic_limiting")

    private Long udpTrafficLimiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udp_fragment_rate_limiting")

    private Long udpFragmentRateLimiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_traffic_limiting")

    private Long otherTrafficLimiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_traffic_limiting")

    private Long tcpTrafficLimiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_fragment_rate_limiting")

    private Long tcpFragmentRateLimiting;

    public UpdatePolicyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdatePolicyRequestBody withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 清洗阈值
     * minimum: 100
     * maximum: 1000
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public UpdatePolicyRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePolicyRequestBody withUdp(UdpEnum udp) {
        this.udp = udp;
        return this;
    }

    /**
     * udp协议设置。block：封禁，unblock：不封禁，limiting：限速
     * @return udp
     */
    public UdpEnum getUdp() {
        return udp;
    }

    public void setUdp(UdpEnum udp) {
        this.udp = udp;
    }

    public UpdatePolicyRequestBody withTcp(TcpEnum tcp) {
        this.tcp = tcp;
        return this;
    }

    /**
     * tcp协议设置。block：封禁，unblock：不封禁，limiting：限速
     * @return tcp
     */
    public TcpEnum getTcp() {
        return tcp;
    }

    public void setTcp(TcpEnum tcp) {
        this.tcp = tcp;
    }

    public UpdatePolicyRequestBody withIcmp(IcmpEnum icmp) {
        this.icmp = icmp;
        return this;
    }

    /**
     * icmp协议设置。block：封禁，unblock：不封禁，limiting：限速
     * @return icmp
     */
    public IcmpEnum getIcmp() {
        return icmp;
    }

    public void setIcmp(IcmpEnum icmp) {
        this.icmp = icmp;
    }

    public UpdatePolicyRequestBody withOther(OtherEnum other) {
        this.other = other;
        return this;
    }

    /**
     * other协议设置。block：封禁，unblock：不封禁，limiting：限速
     * @return other
     */
    public OtherEnum getOther() {
        return other;
    }

    public void setOther(OtherEnum other) {
        this.other = other;
    }

    public UpdatePolicyRequestBody withIcmpTrafficLimiting(Long icmpTrafficLimiting) {
        this.icmpTrafficLimiting = icmpTrafficLimiting;
        return this;
    }

    /**
     * icmp自定义限速值，icmp取值limiting情况下，如果该值为空表示不限速
     * minimum: 1
     * maximum: 2000000
     * @return icmpTrafficLimiting
     */
    public Long getIcmpTrafficLimiting() {
        return icmpTrafficLimiting;
    }

    public void setIcmpTrafficLimiting(Long icmpTrafficLimiting) {
        this.icmpTrafficLimiting = icmpTrafficLimiting;
    }

    public UpdatePolicyRequestBody withUdpTrafficLimiting(Long udpTrafficLimiting) {
        this.udpTrafficLimiting = udpTrafficLimiting;
        return this;
    }

    /**
     * udp自定义限速值，udp取值limiting情况下，如果该值为空表示不限速
     * minimum: 1
     * maximum: 80000000
     * @return udpTrafficLimiting
     */
    public Long getUdpTrafficLimiting() {
        return udpTrafficLimiting;
    }

    public void setUdpTrafficLimiting(Long udpTrafficLimiting) {
        this.udpTrafficLimiting = udpTrafficLimiting;
    }

    public UpdatePolicyRequestBody withUdpFragmentRateLimiting(Long udpFragmentRateLimiting) {
        this.udpFragmentRateLimiting = udpFragmentRateLimiting;
        return this;
    }

    /**
     * udp分片自定义限速值，udp取值limiting情况下，如果该值为空表示不限速
     * minimum: 1
     * maximum: 80000000
     * @return udpFragmentRateLimiting
     */
    public Long getUdpFragmentRateLimiting() {
        return udpFragmentRateLimiting;
    }

    public void setUdpFragmentRateLimiting(Long udpFragmentRateLimiting) {
        this.udpFragmentRateLimiting = udpFragmentRateLimiting;
    }

    public UpdatePolicyRequestBody withOtherTrafficLimiting(Long otherTrafficLimiting) {
        this.otherTrafficLimiting = otherTrafficLimiting;
        return this;
    }

    /**
     * other自定义限速值，other取值limiting情况下，如果该值为空表示不限速
     * minimum: 1
     * maximum: 80000000
     * @return otherTrafficLimiting
     */
    public Long getOtherTrafficLimiting() {
        return otherTrafficLimiting;
    }

    public void setOtherTrafficLimiting(Long otherTrafficLimiting) {
        this.otherTrafficLimiting = otherTrafficLimiting;
    }

    public UpdatePolicyRequestBody withTcpTrafficLimiting(Long tcpTrafficLimiting) {
        this.tcpTrafficLimiting = tcpTrafficLimiting;
        return this;
    }

    /**
     * tcp自定义限速值，tcp取值limiting情况下，如果该值为空表示不限速
     * minimum: 1
     * maximum: 80000000
     * @return tcpTrafficLimiting
     */
    public Long getTcpTrafficLimiting() {
        return tcpTrafficLimiting;
    }

    public void setTcpTrafficLimiting(Long tcpTrafficLimiting) {
        this.tcpTrafficLimiting = tcpTrafficLimiting;
    }

    public UpdatePolicyRequestBody withTcpFragmentRateLimiting(Long tcpFragmentRateLimiting) {
        this.tcpFragmentRateLimiting = tcpFragmentRateLimiting;
        return this;
    }

    /**
     * tcp分片自定义限速值，tcp取值limiting情况下，如果该值为空表示不限速
     * minimum: 1
     * maximum: 80000000
     * @return tcpFragmentRateLimiting
     */
    public Long getTcpFragmentRateLimiting() {
        return tcpFragmentRateLimiting;
    }

    public void setTcpFragmentRateLimiting(Long tcpFragmentRateLimiting) {
        this.tcpFragmentRateLimiting = tcpFragmentRateLimiting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePolicyRequestBody that = (UpdatePolicyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.description, that.description) && Objects.equals(this.udp, that.udp)
            && Objects.equals(this.tcp, that.tcp) && Objects.equals(this.icmp, that.icmp)
            && Objects.equals(this.other, that.other)
            && Objects.equals(this.icmpTrafficLimiting, that.icmpTrafficLimiting)
            && Objects.equals(this.udpTrafficLimiting, that.udpTrafficLimiting)
            && Objects.equals(this.udpFragmentRateLimiting, that.udpFragmentRateLimiting)
            && Objects.equals(this.otherTrafficLimiting, that.otherTrafficLimiting)
            && Objects.equals(this.tcpTrafficLimiting, that.tcpTrafficLimiting)
            && Objects.equals(this.tcpFragmentRateLimiting, that.tcpFragmentRateLimiting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            threshold,
            description,
            udp,
            tcp,
            icmp,
            other,
            icmpTrafficLimiting,
            udpTrafficLimiting,
            udpFragmentRateLimiting,
            otherTrafficLimiting,
            tcpTrafficLimiting,
            tcpFragmentRateLimiting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    udp: ").append(toIndentedString(udp)).append("\n");
        sb.append("    tcp: ").append(toIndentedString(tcp)).append("\n");
        sb.append("    icmp: ").append(toIndentedString(icmp)).append("\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    icmpTrafficLimiting: ").append(toIndentedString(icmpTrafficLimiting)).append("\n");
        sb.append("    udpTrafficLimiting: ").append(toIndentedString(udpTrafficLimiting)).append("\n");
        sb.append("    udpFragmentRateLimiting: ").append(toIndentedString(udpFragmentRateLimiting)).append("\n");
        sb.append("    otherTrafficLimiting: ").append(toIndentedString(otherTrafficLimiting)).append("\n");
        sb.append("    tcpTrafficLimiting: ").append(toIndentedString(tcpTrafficLimiting)).append("\n");
        sb.append("    tcpFragmentRateLimiting: ").append(toIndentedString(tcpFragmentRateLimiting)).append("\n");
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
