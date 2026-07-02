package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SaInfo
 */
public class SaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip_cidr")

    private String sourceIpCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_ip_cidr")

    private String destIpCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packets_sent")

    private BigDecimal packetsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packets_recv")

    private BigDecimal packetsRecv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_sent")

    private BigDecimal trafficSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_recv")

    private BigDecimal trafficRecv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collected_at")

    private OffsetDateTime collectedAt;

    public SaInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网段协商ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SaInfo withSourceIpCidr(String sourceIpCidr) {
        this.sourceIpCidr = sourceIpCidr;
        return this;
    }

    /**
     * 源IP网段
     * @return sourceIpCidr
     */
    public String getSourceIpCidr() {
        return sourceIpCidr;
    }

    public void setSourceIpCidr(String sourceIpCidr) {
        this.sourceIpCidr = sourceIpCidr;
    }

    public SaInfo withDestIpCidr(String destIpCidr) {
        this.destIpCidr = destIpCidr;
        return this;
    }

    /**
     * 目的IP网段
     * @return destIpCidr
     */
    public String getDestIpCidr() {
        return destIpCidr;
    }

    public void setDestIpCidr(String destIpCidr) {
        this.destIpCidr = destIpCidr;
    }

    public SaInfo withPacketsSent(BigDecimal packetsSent) {
        this.packetsSent = packetsSent;
        return this;
    }

    /**
     * 发送包
     * @return packetsSent
     */
    public BigDecimal getPacketsSent() {
        return packetsSent;
    }

    public void setPacketsSent(BigDecimal packetsSent) {
        this.packetsSent = packetsSent;
    }

    public SaInfo withPacketsRecv(BigDecimal packetsRecv) {
        this.packetsRecv = packetsRecv;
        return this;
    }

    /**
     * 接收包
     * @return packetsRecv
     */
    public BigDecimal getPacketsRecv() {
        return packetsRecv;
    }

    public void setPacketsRecv(BigDecimal packetsRecv) {
        this.packetsRecv = packetsRecv;
    }

    public SaInfo withTrafficSent(BigDecimal trafficSent) {
        this.trafficSent = trafficSent;
        return this;
    }

    /**
     * 发送流量(Byte)
     * @return trafficSent
     */
    public BigDecimal getTrafficSent() {
        return trafficSent;
    }

    public void setTrafficSent(BigDecimal trafficSent) {
        this.trafficSent = trafficSent;
    }

    public SaInfo withTrafficRecv(BigDecimal trafficRecv) {
        this.trafficRecv = trafficRecv;
        return this;
    }

    /**
     * 接收流量(Byte)
     * @return trafficRecv
     */
    public BigDecimal getTrafficRecv() {
        return trafficRecv;
    }

    public void setTrafficRecv(BigDecimal trafficRecv) {
        this.trafficRecv = trafficRecv;
    }

    public SaInfo withCollectedAt(OffsetDateTime collectedAt) {
        this.collectedAt = collectedAt;
        return this;
    }

    /**
     * 数据收集时间
     * @return collectedAt
     */
    public OffsetDateTime getCollectedAt() {
        return collectedAt;
    }

    public void setCollectedAt(OffsetDateTime collectedAt) {
        this.collectedAt = collectedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaInfo that = (SaInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sourceIpCidr, that.sourceIpCidr)
            && Objects.equals(this.destIpCidr, that.destIpCidr) && Objects.equals(this.packetsSent, that.packetsSent)
            && Objects.equals(this.packetsRecv, that.packetsRecv) && Objects.equals(this.trafficSent, that.trafficSent)
            && Objects.equals(this.trafficRecv, that.trafficRecv) && Objects.equals(this.collectedAt, that.collectedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, sourceIpCidr, destIpCidr, packetsSent, packetsRecv, trafficSent, trafficRecv, collectedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceIpCidr: ").append(toIndentedString(sourceIpCidr)).append("\n");
        sb.append("    destIpCidr: ").append(toIndentedString(destIpCidr)).append("\n");
        sb.append("    packetsSent: ").append(toIndentedString(packetsSent)).append("\n");
        sb.append("    packetsRecv: ").append(toIndentedString(packetsRecv)).append("\n");
        sb.append("    trafficSent: ").append(toIndentedString(trafficSent)).append("\n");
        sb.append("    trafficRecv: ").append(toIndentedString(trafficRecv)).append("\n");
        sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
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
