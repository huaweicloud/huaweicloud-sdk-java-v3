package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Network
 */
public class Network {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

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

    private Geo srcGeo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_ip")

    private String destIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_port")

    private Integer destPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_domain")

    private String destDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_geo")

    private Geo destGeo;

    public Network withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，取值范围：IN、OUT。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Network withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Network withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP地址。
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public Network withSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口，0–65535。
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

    public Network withSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
        return this;
    }

    /**
     * 源域名，最大128个字符。
     * @return srcDomain
     */
    public String getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    public Network withSrcGeo(Geo srcGeo) {
        this.srcGeo = srcGeo;
        return this;
    }

    public Network withSrcGeo(Consumer<Geo> srcGeoSetter) {
        if (this.srcGeo == null) {
            this.srcGeo = new Geo();
            srcGeoSetter.accept(this.srcGeo);
        }

        return this;
    }

    /**
     * Get srcGeo
     * @return srcGeo
     */
    public Geo getSrcGeo() {
        return srcGeo;
    }

    public void setSrcGeo(Geo srcGeo) {
        this.srcGeo = srcGeo;
    }

    public Network withDestIp(String destIp) {
        this.destIp = destIp;
        return this;
    }

    /**
     * 目标IP地址。
     * @return destIp
     */
    public String getDestIp() {
        return destIp;
    }

    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public Network withDestPort(Integer destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * 目标端口，0–65535。
     * minimum: 0
     * maximum: 65535
     * @return destPort
     */
    public Integer getDestPort() {
        return destPort;
    }

    public void setDestPort(Integer destPort) {
        this.destPort = destPort;
    }

    public Network withDestDomain(String destDomain) {
        this.destDomain = destDomain;
        return this;
    }

    /**
     * 目标域名，最大128个字符。
     * @return destDomain
     */
    public String getDestDomain() {
        return destDomain;
    }

    public void setDestDomain(String destDomain) {
        this.destDomain = destDomain;
    }

    public Network withDestGeo(Geo destGeo) {
        this.destGeo = destGeo;
        return this;
    }

    public Network withDestGeo(Consumer<Geo> destGeoSetter) {
        if (this.destGeo == null) {
            this.destGeo = new Geo();
            destGeoSetter.accept(this.destGeo);
        }

        return this;
    }

    /**
     * Get destGeo
     * @return destGeo
     */
    public Geo getDestGeo() {
        return destGeo;
    }

    public void setDestGeo(Geo destGeo) {
        this.destGeo = destGeo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Network network = (Network) o;
        return Objects.equals(this.direction, network.direction) && Objects.equals(this.protocol, network.protocol)
            && Objects.equals(this.srcIp, network.srcIp) && Objects.equals(this.srcPort, network.srcPort)
            && Objects.equals(this.srcDomain, network.srcDomain) && Objects.equals(this.srcGeo, network.srcGeo)
            && Objects.equals(this.destIp, network.destIp) && Objects.equals(this.destPort, network.destPort)
            && Objects.equals(this.destDomain, network.destDomain) && Objects.equals(this.destGeo, network.destGeo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(direction, protocol, srcIp, srcPort, srcDomain, srcGeo, destIp, destPort, destDomain, destGeo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Network {\n");
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
