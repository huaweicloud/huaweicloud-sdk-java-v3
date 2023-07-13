package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置企业用户指定类型的阈值的请求体。
 */
public class SetQosThresholdReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private SetThresholdData latency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jitter")

    private SetThresholdData jitter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packetLoss")

    private SetPacketThresholdData packetLoss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientCpuMax")

    private SetCPUThresholdData clientCpuMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemCpuMax")

    private SetCPUThresholdData systemCpuMax;

    public SetQosThresholdReq withLatency(SetThresholdData latency) {
        this.latency = latency;
        return this;
    }

    public SetQosThresholdReq withLatency(Consumer<SetThresholdData> latencySetter) {
        if (this.latency == null) {
            this.latency = new SetThresholdData();
            latencySetter.accept(this.latency);
        }

        return this;
    }

    /**
     * Get latency
     * @return latency
     */
    public SetThresholdData getLatency() {
        return latency;
    }

    public void setLatency(SetThresholdData latency) {
        this.latency = latency;
    }

    public SetQosThresholdReq withJitter(SetThresholdData jitter) {
        this.jitter = jitter;
        return this;
    }

    public SetQosThresholdReq withJitter(Consumer<SetThresholdData> jitterSetter) {
        if (this.jitter == null) {
            this.jitter = new SetThresholdData();
            jitterSetter.accept(this.jitter);
        }

        return this;
    }

    /**
     * Get jitter
     * @return jitter
     */
    public SetThresholdData getJitter() {
        return jitter;
    }

    public void setJitter(SetThresholdData jitter) {
        this.jitter = jitter;
    }

    public SetQosThresholdReq withPacketLoss(SetPacketThresholdData packetLoss) {
        this.packetLoss = packetLoss;
        return this;
    }

    public SetQosThresholdReq withPacketLoss(Consumer<SetPacketThresholdData> packetLossSetter) {
        if (this.packetLoss == null) {
            this.packetLoss = new SetPacketThresholdData();
            packetLossSetter.accept(this.packetLoss);
        }

        return this;
    }

    /**
     * Get packetLoss
     * @return packetLoss
     */
    public SetPacketThresholdData getPacketLoss() {
        return packetLoss;
    }

    public void setPacketLoss(SetPacketThresholdData packetLoss) {
        this.packetLoss = packetLoss;
    }

    public SetQosThresholdReq withClientCpuMax(SetCPUThresholdData clientCpuMax) {
        this.clientCpuMax = clientCpuMax;
        return this;
    }

    public SetQosThresholdReq withClientCpuMax(Consumer<SetCPUThresholdData> clientCpuMaxSetter) {
        if (this.clientCpuMax == null) {
            this.clientCpuMax = new SetCPUThresholdData();
            clientCpuMaxSetter.accept(this.clientCpuMax);
        }

        return this;
    }

    /**
     * Get clientCpuMax
     * @return clientCpuMax
     */
    public SetCPUThresholdData getClientCpuMax() {
        return clientCpuMax;
    }

    public void setClientCpuMax(SetCPUThresholdData clientCpuMax) {
        this.clientCpuMax = clientCpuMax;
    }

    public SetQosThresholdReq withSystemCpuMax(SetCPUThresholdData systemCpuMax) {
        this.systemCpuMax = systemCpuMax;
        return this;
    }

    public SetQosThresholdReq withSystemCpuMax(Consumer<SetCPUThresholdData> systemCpuMaxSetter) {
        if (this.systemCpuMax == null) {
            this.systemCpuMax = new SetCPUThresholdData();
            systemCpuMaxSetter.accept(this.systemCpuMax);
        }

        return this;
    }

    /**
     * Get systemCpuMax
     * @return systemCpuMax
     */
    public SetCPUThresholdData getSystemCpuMax() {
        return systemCpuMax;
    }

    public void setSystemCpuMax(SetCPUThresholdData systemCpuMax) {
        this.systemCpuMax = systemCpuMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetQosThresholdReq that = (SetQosThresholdReq) obj;
        return Objects.equals(this.latency, that.latency) && Objects.equals(this.jitter, that.jitter)
            && Objects.equals(this.packetLoss, that.packetLoss) && Objects.equals(this.clientCpuMax, that.clientCpuMax)
            && Objects.equals(this.systemCpuMax, that.systemCpuMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latency, jitter, packetLoss, clientCpuMax, systemCpuMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetQosThresholdReq {\n");
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
