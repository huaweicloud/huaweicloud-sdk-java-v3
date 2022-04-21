package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQosThresholdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private ThresholdData latency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jitter")

    private ThresholdData jitter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packetLoss")

    private PacketThresholdData packetLoss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientCpuMax")

    private CPUThresholdData clientCpuMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemCpuMax")

    private CPUThresholdData systemCpuMax;

    public ShowQosThresholdResponse withLatency(ThresholdData latency) {
        this.latency = latency;
        return this;
    }

    public ShowQosThresholdResponse withLatency(Consumer<ThresholdData> latencySetter) {
        if (this.latency == null) {
            this.latency = new ThresholdData();
            latencySetter.accept(this.latency);
        }

        return this;
    }

    /**
     * Get latency
     * @return latency
     */
    public ThresholdData getLatency() {
        return latency;
    }

    public void setLatency(ThresholdData latency) {
        this.latency = latency;
    }

    public ShowQosThresholdResponse withJitter(ThresholdData jitter) {
        this.jitter = jitter;
        return this;
    }

    public ShowQosThresholdResponse withJitter(Consumer<ThresholdData> jitterSetter) {
        if (this.jitter == null) {
            this.jitter = new ThresholdData();
            jitterSetter.accept(this.jitter);
        }

        return this;
    }

    /**
     * Get jitter
     * @return jitter
     */
    public ThresholdData getJitter() {
        return jitter;
    }

    public void setJitter(ThresholdData jitter) {
        this.jitter = jitter;
    }

    public ShowQosThresholdResponse withPacketLoss(PacketThresholdData packetLoss) {
        this.packetLoss = packetLoss;
        return this;
    }

    public ShowQosThresholdResponse withPacketLoss(Consumer<PacketThresholdData> packetLossSetter) {
        if (this.packetLoss == null) {
            this.packetLoss = new PacketThresholdData();
            packetLossSetter.accept(this.packetLoss);
        }

        return this;
    }

    /**
     * Get packetLoss
     * @return packetLoss
     */
    public PacketThresholdData getPacketLoss() {
        return packetLoss;
    }

    public void setPacketLoss(PacketThresholdData packetLoss) {
        this.packetLoss = packetLoss;
    }

    public ShowQosThresholdResponse withClientCpuMax(CPUThresholdData clientCpuMax) {
        this.clientCpuMax = clientCpuMax;
        return this;
    }

    public ShowQosThresholdResponse withClientCpuMax(Consumer<CPUThresholdData> clientCpuMaxSetter) {
        if (this.clientCpuMax == null) {
            this.clientCpuMax = new CPUThresholdData();
            clientCpuMaxSetter.accept(this.clientCpuMax);
        }

        return this;
    }

    /**
     * Get clientCpuMax
     * @return clientCpuMax
     */
    public CPUThresholdData getClientCpuMax() {
        return clientCpuMax;
    }

    public void setClientCpuMax(CPUThresholdData clientCpuMax) {
        this.clientCpuMax = clientCpuMax;
    }

    public ShowQosThresholdResponse withSystemCpuMax(CPUThresholdData systemCpuMax) {
        this.systemCpuMax = systemCpuMax;
        return this;
    }

    public ShowQosThresholdResponse withSystemCpuMax(Consumer<CPUThresholdData> systemCpuMaxSetter) {
        if (this.systemCpuMax == null) {
            this.systemCpuMax = new CPUThresholdData();
            systemCpuMaxSetter.accept(this.systemCpuMax);
        }

        return this;
    }

    /**
     * Get systemCpuMax
     * @return systemCpuMax
     */
    public CPUThresholdData getSystemCpuMax() {
        return systemCpuMax;
    }

    public void setSystemCpuMax(CPUThresholdData systemCpuMax) {
        this.systemCpuMax = systemCpuMax;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQosThresholdResponse showQosThresholdResponse = (ShowQosThresholdResponse) o;
        return Objects.equals(this.latency, showQosThresholdResponse.latency)
            && Objects.equals(this.jitter, showQosThresholdResponse.jitter)
            && Objects.equals(this.packetLoss, showQosThresholdResponse.packetLoss)
            && Objects.equals(this.clientCpuMax, showQosThresholdResponse.clientCpuMax)
            && Objects.equals(this.systemCpuMax, showQosThresholdResponse.systemCpuMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latency, jitter, packetLoss, clientCpuMax, systemCpuMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQosThresholdResponse {\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
        sb.append("    packetLoss: ").append(toIndentedString(packetLoss)).append("\n");
        sb.append("    clientCpuMax: ").append(toIndentedString(clientCpuMax)).append("\n");
        sb.append("    systemCpuMax: ").append(toIndentedString(systemCpuMax)).append("\n");
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
