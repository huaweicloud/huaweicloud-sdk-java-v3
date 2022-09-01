package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会议与会者发送/接收QoS数据。当qosType &#x3D; audio/video/screen 时有效。
 */
public class QosSendReceiveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    @JacksonXmlProperty(localName = "bitrate")

    private List<QosDataNoThrElement> bitrate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    @JacksonXmlProperty(localName = "latency")

    private List<QosDataElement> latency = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jitter")

    @JacksonXmlProperty(localName = "jitter")

    private List<QosDataElement> jitter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_loss_max")

    @JacksonXmlProperty(localName = "packet_loss_max")

    private List<QosDataElement> packetLossMax = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    @JacksonXmlProperty(localName = "resolution")

    private List<QosDataNoThrElement> resolution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame")

    @JacksonXmlProperty(localName = "frame")

    private List<QosDataNoThrElement> frame = null;

    public QosSendReceiveInfo withBitrate(List<QosDataNoThrElement> bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    public QosSendReceiveInfo addBitrateItem(QosDataNoThrElement bitrateItem) {
        if (this.bitrate == null) {
            this.bitrate = new ArrayList<>();
        }
        this.bitrate.add(bitrateItem);
        return this;
    }

    public QosSendReceiveInfo withBitrate(Consumer<List<QosDataNoThrElement>> bitrateSetter) {
        if (this.bitrate == null) {
            this.bitrate = new ArrayList<>();
        }
        bitrateSetter.accept(this.bitrate);
        return this;
    }

    /**
     * 码率, 单位kbps，不含阈值告警。当qosType = audio/video/screen 时有效。
     * @return bitrate
     */
    public List<QosDataNoThrElement> getBitrate() {
        return bitrate;
    }

    public void setBitrate(List<QosDataNoThrElement> bitrate) {
        this.bitrate = bitrate;
    }

    public QosSendReceiveInfo withLatency(List<QosDataElement> latency) {
        this.latency = latency;
        return this;
    }

    public QosSendReceiveInfo addLatencyItem(QosDataElement latencyItem) {
        if (this.latency == null) {
            this.latency = new ArrayList<>();
        }
        this.latency.add(latencyItem);
        return this;
    }

    public QosSendReceiveInfo withLatency(Consumer<List<QosDataElement>> latencySetter) {
        if (this.latency == null) {
            this.latency = new ArrayList<>();
        }
        latencySetter.accept(this.latency);
        return this;
    }

    /**
     * 时延，单位毫秒, 含阈值告警。当qosType = audio/video/screen 时有效。
     * @return latency
     */
    public List<QosDataElement> getLatency() {
        return latency;
    }

    public void setLatency(List<QosDataElement> latency) {
        this.latency = latency;
    }

    public QosSendReceiveInfo withJitter(List<QosDataElement> jitter) {
        this.jitter = jitter;
        return this;
    }

    public QosSendReceiveInfo addJitterItem(QosDataElement jitterItem) {
        if (this.jitter == null) {
            this.jitter = new ArrayList<>();
        }
        this.jitter.add(jitterItem);
        return this;
    }

    public QosSendReceiveInfo withJitter(Consumer<List<QosDataElement>> jitterSetter) {
        if (this.jitter == null) {
            this.jitter = new ArrayList<>();
        }
        jitterSetter.accept(this.jitter);
        return this;
    }

    /**
     * 抖动, 单位毫秒，含阈值告警。当qosType = audio/video/screen 时有效。
     * @return jitter
     */
    public List<QosDataElement> getJitter() {
        return jitter;
    }

    public void setJitter(List<QosDataElement> jitter) {
        this.jitter = jitter;
    }

    public QosSendReceiveInfo withPacketLossMax(List<QosDataElement> packetLossMax) {
        this.packetLossMax = packetLossMax;
        return this;
    }

    public QosSendReceiveInfo addPacketLossMaxItem(QosDataElement packetLossMaxItem) {
        if (this.packetLossMax == null) {
            this.packetLossMax = new ArrayList<>();
        }
        this.packetLossMax.add(packetLossMaxItem);
        return this;
    }

    public QosSendReceiveInfo withPacketLossMax(Consumer<List<QosDataElement>> packetLossMaxSetter) {
        if (this.packetLossMax == null) {
            this.packetLossMax = new ArrayList<>();
        }
        packetLossMaxSetter.accept(this.packetLossMax);
        return this;
    }

    /**
     * 最大丢包率, 单位百分比 含阈值告警。当qosType = audio/video/screen 时有效。
     * @return packetLossMax
     */
    public List<QosDataElement> getPacketLossMax() {
        return packetLossMax;
    }

    public void setPacketLossMax(List<QosDataElement> packetLossMax) {
        this.packetLossMax = packetLossMax;
    }

    public QosSendReceiveInfo withResolution(List<QosDataNoThrElement> resolution) {
        this.resolution = resolution;
        return this;
    }

    public QosSendReceiveInfo addResolutionItem(QosDataNoThrElement resolutionItem) {
        if (this.resolution == null) {
            this.resolution = new ArrayList<>();
        }
        this.resolution.add(resolutionItem);
        return this;
    }

    public QosSendReceiveInfo withResolution(Consumer<List<QosDataNoThrElement>> resolutionSetter) {
        if (this.resolution == null) {
            this.resolution = new ArrayList<>();
        }
        resolutionSetter.accept(this.resolution);
        return this;
    }

    /**
     * 分辨率, 不含阈值告警。当qosType = video/screen 时有效。
     * @return resolution
     */
    public List<QosDataNoThrElement> getResolution() {
        return resolution;
    }

    public void setResolution(List<QosDataNoThrElement> resolution) {
        this.resolution = resolution;
    }

    public QosSendReceiveInfo withFrame(List<QosDataNoThrElement> frame) {
        this.frame = frame;
        return this;
    }

    public QosSendReceiveInfo addFrameItem(QosDataNoThrElement frameItem) {
        if (this.frame == null) {
            this.frame = new ArrayList<>();
        }
        this.frame.add(frameItem);
        return this;
    }

    public QosSendReceiveInfo withFrame(Consumer<List<QosDataNoThrElement>> frameSetter) {
        if (this.frame == null) {
            this.frame = new ArrayList<>();
        }
        frameSetter.accept(this.frame);
        return this;
    }

    /**
     * 帧率, 单位fps，不含阈值告警。当qosType = video/screen 时有效。
     * @return frame
     */
    public List<QosDataNoThrElement> getFrame() {
        return frame;
    }

    public void setFrame(List<QosDataNoThrElement> frame) {
        this.frame = frame;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QosSendReceiveInfo qosSendReceiveInfo = (QosSendReceiveInfo) o;
        return Objects.equals(this.bitrate, qosSendReceiveInfo.bitrate)
            && Objects.equals(this.latency, qosSendReceiveInfo.latency)
            && Objects.equals(this.jitter, qosSendReceiveInfo.jitter)
            && Objects.equals(this.packetLossMax, qosSendReceiveInfo.packetLossMax)
            && Objects.equals(this.resolution, qosSendReceiveInfo.resolution)
            && Objects.equals(this.frame, qosSendReceiveInfo.frame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitrate, latency, jitter, packetLossMax, resolution, frame);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QosSendReceiveInfo {\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
        sb.append("    packetLossMax: ").append(toIndentedString(packetLossMax)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
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
