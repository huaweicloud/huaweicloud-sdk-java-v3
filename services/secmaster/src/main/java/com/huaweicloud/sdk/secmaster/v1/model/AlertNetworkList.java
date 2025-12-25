package com.huaweicloud.sdk.secmaster.v1.model;

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
 * AlertNetworkList
 */
public class AlertNetworkList {

    /**
     * 方向，取值范围：IN | OUT
     */
    public static final class DirectionEnum {

        /**
         * Enum IN for value: "IN"
         */
        public static final DirectionEnum IN = new DirectionEnum("IN");

        /**
         * Enum OUT for value: "OUT"
         */
        public static final DirectionEnum OUT = new DirectionEnum("OUT");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("IN", IN);
            map.put("OUT", OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private Integer srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_domain")

    private String srcDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_geo")

    private AlertSrcGeo srcGeo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_ip")

    private String destIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_port")

    private String destPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_domain")

    private String destDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_geo")

    private AlertDestGeo destGeo;

    public AlertNetworkList withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，取值范围：IN | OUT
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public AlertNetworkList withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议，包含7层和4层的协议 参考：IANA registered name https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public AlertNetworkList withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP地址
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public AlertNetworkList withSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口，0–65535
     * minimum: 0
     * maximum: 65535
     * @return srcPort
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public AlertNetworkList withSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
        return this;
    }

    /**
     * 源域名
     * @return srcDomain
     */
    public String getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    public AlertNetworkList withSrcGeo(AlertSrcGeo srcGeo) {
        this.srcGeo = srcGeo;
        return this;
    }

    public AlertNetworkList withSrcGeo(Consumer<AlertSrcGeo> srcGeoSetter) {
        if (this.srcGeo == null) {
            this.srcGeo = new AlertSrcGeo();
            srcGeoSetter.accept(this.srcGeo);
        }

        return this;
    }

    /**
     * Get srcGeo
     * @return srcGeo
     */
    public AlertSrcGeo getSrcGeo() {
        return srcGeo;
    }

    public void setSrcGeo(AlertSrcGeo srcGeo) {
        this.srcGeo = srcGeo;
    }

    public AlertNetworkList withDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    /**
     * 目的IP地址
     * @return destIp
     */
    public String getDestIp() {
        return destIp;
    }

    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public AlertNetworkList withDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * 目的端口，0–65535
     * @return destPort
     */
    public String getDestPort() {
        return destPort;
    }

    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public AlertNetworkList withDestDomain(String destDomain) {
        this.destDomain = destDomain;
        return this;
    }

    /**
     * 目的域名
     * @return destDomain
     */
    public String getDestDomain() {
        return destDomain;
    }

    public void setDestDomain(String destDomain) {
        this.destDomain = destDomain;
    }

    public AlertNetworkList withDestGeo(AlertDestGeo destGeo) {
        this.destGeo = destGeo;
        return this;
    }

    public AlertNetworkList withDestGeo(Consumer<AlertDestGeo> destGeoSetter) {
        if (this.destGeo == null) {
            this.destGeo = new AlertDestGeo();
            destGeoSetter.accept(this.destGeo);
        }

        return this;
    }

    /**
     * Get destGeo
     * @return destGeo
     */
    public AlertDestGeo getDestGeo() {
        return destGeo;
    }

    public void setDestGeo(AlertDestGeo destGeo) {
        this.destGeo = destGeo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertNetworkList that = (AlertNetworkList) obj;
        return Objects.equals(this.direction, that.direction) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.srcPort, that.srcPort)
            && Objects.equals(this.srcDomain, that.srcDomain) && Objects.equals(this.srcGeo, that.srcGeo)
            && Objects.equals(this.destIp, that.destIp) && Objects.equals(this.destPort, that.destPort)
            && Objects.equals(this.destDomain, that.destDomain) && Objects.equals(this.destGeo, that.destGeo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(direction, protocol, srcIp, srcPort, srcDomain, srcGeo, destIp, destPort, destDomain, destGeo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertNetworkList {\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    srcDomain: ").append(toIndentedString(srcDomain)).append("\n");
        sb.append("    srcGeo: ").append(toIndentedString(srcGeo)).append("\n");
        sb.append("    destIp: ").append(toIndentedString(destIp)).append("\n");
        sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
        sb.append("    destDomain: ").append(toIndentedString(destDomain)).append("\n");
        sb.append("    destGeo: ").append(toIndentedString(destGeo)).append("\n");
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
