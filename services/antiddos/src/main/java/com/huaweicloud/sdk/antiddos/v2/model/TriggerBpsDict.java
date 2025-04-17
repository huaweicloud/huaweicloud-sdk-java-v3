package com.huaweicloud.sdk.antiddos.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流量限制列表
 */
public class TriggerBpsDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_pos_id")

    private Long trafficPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_per_second")

    private Long trafficPerSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_per_second")

    private Long packetPerSecond;

    public TriggerBpsDict withTrafficPosId(Long trafficPosId) {
        this.trafficPosId = trafficPosId;
        return this;
    }

    /**
     * 流量分段ID，取值范围：1：10M;2：30M;3：50M;4：70M;5：100M;6：150M;7：200M;8：250M;9：300M;10：500M;11：800M;88：1000M;99：默认防护。
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerBpsDict that = (TriggerBpsDict) obj;
        return Objects.equals(this.trafficPosId, that.trafficPosId)
            && Objects.equals(this.trafficPerSecond, that.trafficPerSecond)
            && Objects.equals(this.packetPerSecond, that.packetPerSecond);
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
