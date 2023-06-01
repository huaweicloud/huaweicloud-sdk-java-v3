package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RtmpBrokens
 */
public class RtmpBrokens {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioRecBytes")

    private List<Double> audioRecBytes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioSentBytes")

    private List<Double> audioSentBytes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtmpReceivedPackets")

    private List<Double> rtmpReceivedPackets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtmpSentPackets")

    private List<Double> rtmpSentPackets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoRecBytes")

    private List<Double> videoRecBytes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoSentBytes")

    private List<Double> videoSentBytes = null;

    public RtmpBrokens withAudioRecBytes(List<Double> audioRecBytes) {
        this.audioRecBytes = audioRecBytes;
        return this;
    }

    public RtmpBrokens addAudioRecBytesItem(Double audioRecBytesItem) {
        if (this.audioRecBytes == null) {
            this.audioRecBytes = new ArrayList<>();
        }
        this.audioRecBytes.add(audioRecBytesItem);
        return this;
    }

    public RtmpBrokens withAudioRecBytes(Consumer<List<Double>> audioRecBytesSetter) {
        if (this.audioRecBytes == null) {
            this.audioRecBytes = new ArrayList<>();
        }
        audioRecBytesSetter.accept(this.audioRecBytes);
        return this;
    }

    /**
     * 音频接收字节数
     * @return audioRecBytes
     */
    public List<Double> getAudioRecBytes() {
        return audioRecBytes;
    }

    public void setAudioRecBytes(List<Double> audioRecBytes) {
        this.audioRecBytes = audioRecBytes;
    }

    public RtmpBrokens withAudioSentBytes(List<Double> audioSentBytes) {
        this.audioSentBytes = audioSentBytes;
        return this;
    }

    public RtmpBrokens addAudioSentBytesItem(Double audioSentBytesItem) {
        if (this.audioSentBytes == null) {
            this.audioSentBytes = new ArrayList<>();
        }
        this.audioSentBytes.add(audioSentBytesItem);
        return this;
    }

    public RtmpBrokens withAudioSentBytes(Consumer<List<Double>> audioSentBytesSetter) {
        if (this.audioSentBytes == null) {
            this.audioSentBytes = new ArrayList<>();
        }
        audioSentBytesSetter.accept(this.audioSentBytes);
        return this;
    }

    /**
     * 音频发送字节数
     * @return audioSentBytes
     */
    public List<Double> getAudioSentBytes() {
        return audioSentBytes;
    }

    public void setAudioSentBytes(List<Double> audioSentBytes) {
        this.audioSentBytes = audioSentBytes;
    }

    public RtmpBrokens withRtmpReceivedPackets(List<Double> rtmpReceivedPackets) {
        this.rtmpReceivedPackets = rtmpReceivedPackets;
        return this;
    }

    public RtmpBrokens addRtmpReceivedPacketsItem(Double rtmpReceivedPacketsItem) {
        if (this.rtmpReceivedPackets == null) {
            this.rtmpReceivedPackets = new ArrayList<>();
        }
        this.rtmpReceivedPackets.add(rtmpReceivedPacketsItem);
        return this;
    }

    public RtmpBrokens withRtmpReceivedPackets(Consumer<List<Double>> rtmpReceivedPacketsSetter) {
        if (this.rtmpReceivedPackets == null) {
            this.rtmpReceivedPackets = new ArrayList<>();
        }
        rtmpReceivedPacketsSetter.accept(this.rtmpReceivedPackets);
        return this;
    }

    /**
     * RTMP接收数据包数
     * @return rtmpReceivedPackets
     */
    public List<Double> getRtmpReceivedPackets() {
        return rtmpReceivedPackets;
    }

    public void setRtmpReceivedPackets(List<Double> rtmpReceivedPackets) {
        this.rtmpReceivedPackets = rtmpReceivedPackets;
    }

    public RtmpBrokens withRtmpSentPackets(List<Double> rtmpSentPackets) {
        this.rtmpSentPackets = rtmpSentPackets;
        return this;
    }

    public RtmpBrokens addRtmpSentPacketsItem(Double rtmpSentPacketsItem) {
        if (this.rtmpSentPackets == null) {
            this.rtmpSentPackets = new ArrayList<>();
        }
        this.rtmpSentPackets.add(rtmpSentPacketsItem);
        return this;
    }

    public RtmpBrokens withRtmpSentPackets(Consumer<List<Double>> rtmpSentPacketsSetter) {
        if (this.rtmpSentPackets == null) {
            this.rtmpSentPackets = new ArrayList<>();
        }
        rtmpSentPacketsSetter.accept(this.rtmpSentPackets);
        return this;
    }

    /**
     * RTMP发送数据包数
     * @return rtmpSentPackets
     */
    public List<Double> getRtmpSentPackets() {
        return rtmpSentPackets;
    }

    public void setRtmpSentPackets(List<Double> rtmpSentPackets) {
        this.rtmpSentPackets = rtmpSentPackets;
    }

    public RtmpBrokens withVideoRecBytes(List<Double> videoRecBytes) {
        this.videoRecBytes = videoRecBytes;
        return this;
    }

    public RtmpBrokens addVideoRecBytesItem(Double videoRecBytesItem) {
        if (this.videoRecBytes == null) {
            this.videoRecBytes = new ArrayList<>();
        }
        this.videoRecBytes.add(videoRecBytesItem);
        return this;
    }

    public RtmpBrokens withVideoRecBytes(Consumer<List<Double>> videoRecBytesSetter) {
        if (this.videoRecBytes == null) {
            this.videoRecBytes = new ArrayList<>();
        }
        videoRecBytesSetter.accept(this.videoRecBytes);
        return this;
    }

    /**
     * 视频接收字节数
     * @return videoRecBytes
     */
    public List<Double> getVideoRecBytes() {
        return videoRecBytes;
    }

    public void setVideoRecBytes(List<Double> videoRecBytes) {
        this.videoRecBytes = videoRecBytes;
    }

    public RtmpBrokens withVideoSentBytes(List<Double> videoSentBytes) {
        this.videoSentBytes = videoSentBytes;
        return this;
    }

    public RtmpBrokens addVideoSentBytesItem(Double videoSentBytesItem) {
        if (this.videoSentBytes == null) {
            this.videoSentBytes = new ArrayList<>();
        }
        this.videoSentBytes.add(videoSentBytesItem);
        return this;
    }

    public RtmpBrokens withVideoSentBytes(Consumer<List<Double>> videoSentBytesSetter) {
        if (this.videoSentBytes == null) {
            this.videoSentBytes = new ArrayList<>();
        }
        videoSentBytesSetter.accept(this.videoSentBytes);
        return this;
    }

    /**
     * 视频发送字节数
     * @return videoSentBytes
     */
    public List<Double> getVideoSentBytes() {
        return videoSentBytes;
    }

    public void setVideoSentBytes(List<Double> videoSentBytes) {
        this.videoSentBytes = videoSentBytes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RtmpBrokens rtmpBrokens = (RtmpBrokens) o;
        return Objects.equals(this.audioRecBytes, rtmpBrokens.audioRecBytes)
            && Objects.equals(this.audioSentBytes, rtmpBrokens.audioSentBytes)
            && Objects.equals(this.rtmpReceivedPackets, rtmpBrokens.rtmpReceivedPackets)
            && Objects.equals(this.rtmpSentPackets, rtmpBrokens.rtmpSentPackets)
            && Objects.equals(this.videoRecBytes, rtmpBrokens.videoRecBytes)
            && Objects.equals(this.videoSentBytes, rtmpBrokens.videoSentBytes);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(audioRecBytes, audioSentBytes, rtmpReceivedPackets, rtmpSentPackets, videoRecBytes, videoSentBytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RtmpBrokens {\n");
        sb.append("    audioRecBytes: ").append(toIndentedString(audioRecBytes)).append("\n");
        sb.append("    audioSentBytes: ").append(toIndentedString(audioSentBytes)).append("\n");
        sb.append("    rtmpReceivedPackets: ").append(toIndentedString(rtmpReceivedPackets)).append("\n");
        sb.append("    rtmpSentPackets: ").append(toIndentedString(rtmpSentPackets)).append("\n");
        sb.append("    videoRecBytes: ").append(toIndentedString(videoRecBytes)).append("\n");
        sb.append("    videoSentBytes: ").append(toIndentedString(videoSentBytes)).append("\n");
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
