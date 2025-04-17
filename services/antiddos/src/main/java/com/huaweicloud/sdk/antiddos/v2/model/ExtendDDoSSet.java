package com.huaweicloud.sdk.antiddos.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩展配置列表
 */
public class ExtendDDoSSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SetID")

    private Long setID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_connection_limited")

    private Long newConnectionLimited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_connection_limited")

    private Long totalConnectionLimited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_packet_per_second")

    private Long httpPacketPerSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_per_second")

    private Long trafficPerSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_per_second")

    private Long packetPerSecond;

    public ExtendDDoSSet withSetID(Long setID) {
        this.setID = setID;
        return this;
    }

    /**
     * 配置分段ID
     * @return setID
     */
    public Long getSetID() {
        return setID;
    }

    public void setSetID(Long setID) {
        this.setID = setID;
    }

    public ExtendDDoSSet withNewConnectionLimited(Long newConnectionLimited) {
        this.newConnectionLimited = newConnectionLimited;
        return this;
    }

    /**
     * 单一源IP新建连接个数
     * @return newConnectionLimited
     */
    public Long getNewConnectionLimited() {
        return newConnectionLimited;
    }

    public void setNewConnectionLimited(Long newConnectionLimited) {
        this.newConnectionLimited = newConnectionLimited;
    }

    public ExtendDDoSSet withTotalConnectionLimited(Long totalConnectionLimited) {
        this.totalConnectionLimited = totalConnectionLimited;
        return this;
    }

    /**
     * 单一源IP连接数总个数
     * @return totalConnectionLimited
     */
    public Long getTotalConnectionLimited() {
        return totalConnectionLimited;
    }

    public void setTotalConnectionLimited(Long totalConnectionLimited) {
        this.totalConnectionLimited = totalConnectionLimited;
    }

    public ExtendDDoSSet withHttpPacketPerSecond(Long httpPacketPerSecond) {
        this.httpPacketPerSecond = httpPacketPerSecond;
        return this;
    }

    /**
     * 每秒HTTP请求数（个/s）阈值
     * @return httpPacketPerSecond
     */
    public Long getHttpPacketPerSecond() {
        return httpPacketPerSecond;
    }

    public void setHttpPacketPerSecond(Long httpPacketPerSecond) {
        this.httpPacketPerSecond = httpPacketPerSecond;
    }

    public ExtendDDoSSet withTrafficPerSecond(Long trafficPerSecond) {
        this.trafficPerSecond = trafficPerSecond;
        return this;
    }

    /**
     * 每秒流量（Mbit/s）阈值
     * @return trafficPerSecond
     */
    public Long getTrafficPerSecond() {
        return trafficPerSecond;
    }

    public void setTrafficPerSecond(Long trafficPerSecond) {
        this.trafficPerSecond = trafficPerSecond;
    }

    public ExtendDDoSSet withPacketPerSecond(Long packetPerSecond) {
        this.packetPerSecond = packetPerSecond;
        return this;
    }

    /**
     * 每秒报文数（个/s）阈值
     * @return packetPerSecond
     */
    public Long getPacketPerSecond() {
        return packetPerSecond;
    }

    public void setPacketPerSecond(Long packetPerSecond) {
        this.packetPerSecond = packetPerSecond;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendDDoSSet that = (ExtendDDoSSet) obj;
        return Objects.equals(this.setID, that.setID)
            && Objects.equals(this.newConnectionLimited, that.newConnectionLimited)
            && Objects.equals(this.totalConnectionLimited, that.totalConnectionLimited)
            && Objects.equals(this.httpPacketPerSecond, that.httpPacketPerSecond)
            && Objects.equals(this.trafficPerSecond, that.trafficPerSecond)
            && Objects.equals(this.packetPerSecond, that.packetPerSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setID,
            newConnectionLimited,
            totalConnectionLimited,
            httpPacketPerSecond,
            trafficPerSecond,
            packetPerSecond);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendDDoSSet {\n");
        sb.append("    setID: ").append(toIndentedString(setID)).append("\n");
        sb.append("    newConnectionLimited: ").append(toIndentedString(newConnectionLimited)).append("\n");
        sb.append("    totalConnectionLimited: ").append(toIndentedString(totalConnectionLimited)).append("\n");
        sb.append("    httpPacketPerSecond: ").append(toIndentedString(httpPacketPerSecond)).append("\n");
        sb.append("    trafficPerSecond: ").append(toIndentedString(trafficPerSecond)).append("\n");
        sb.append("    packetPerSecond: ").append(toIndentedString(packetPerSecond)).append("\n");
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
