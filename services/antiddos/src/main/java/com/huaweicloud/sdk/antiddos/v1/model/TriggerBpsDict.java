package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 流量限制列表
 */
public class TriggerBpsDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_pos_id")

    @JacksonXmlProperty(localName = "traffic_pos_id")

    private Long trafficPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_per_second")

    @JacksonXmlProperty(localName = "traffic_per_second")

    private Long trafficPerSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_per_second")

    @JacksonXmlProperty(localName = "packet_per_second")

    private Long packetPerSecond;

    public TriggerBpsDict withTrafficPosId(Long trafficPosId) {
        this.trafficPosId = trafficPosId;
        return this;
    }

    /**
     * 流量分段ID
     * @return trafficPosId
     */
    public Long getTrafficPosId() {
        return trafficPosId;
    }

    public void setTrafficPosId(Long trafficPosId) {
        this.trafficPosId = trafficPosId;
    }

    public TriggerBpsDict withTrafficPerSecond(Long trafficPerSecond) {
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

    public TriggerBpsDict withPacketPerSecond(Long packetPerSecond) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TriggerBpsDict triggerBpsDict = (TriggerBpsDict) o;
        return Objects.equals(this.trafficPosId, triggerBpsDict.trafficPosId)
            && Objects.equals(this.trafficPerSecond, triggerBpsDict.trafficPerSecond)
            && Objects.equals(this.packetPerSecond, triggerBpsDict.packetPerSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficPosId, trafficPerSecond, packetPerSecond);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerBpsDict {\n");
        sb.append("    trafficPosId: ").append(toIndentedString(trafficPosId)).append("\n");
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
