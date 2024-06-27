package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络质量对象，音频不涉及分辨率和帧率（注：所有媒体流的数据均为服务器视角，Portal展示时需要转换为端侧视角）
 */
public class Qos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkQuality")

    private String networkQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codecType")

    private String codecType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandWidth")

    private Integer bandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lostPacketRate")

    private Integer lostPacketRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jitter")

    private Integer jitter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolutionHeight")

    private Integer resolutionHeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolutionWidth")

    private Integer resolutionWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frameRate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codecUserId")

    private String codecUserId;

    public Qos withNetworkQuality(String networkQuality) {
        this.networkQuality = networkQuality;
        return this;
    }

    /**
     * 网络质量评级
     * @return networkQuality
     */
    public String getNetworkQuality() {
        return networkQuality;
    }

    public void setNetworkQuality(String networkQuality) {
        this.networkQuality = networkQuality;
    }

    public Qos withCodecType(String codecType) {
        this.codecType = codecType;
        return this;
    }

    /**
     * 编解码类型
     * @return codecType
     */
    public String getCodecType() {
        return codecType;
    }

    public void setCodecType(String codecType) {
        this.codecType = codecType;
    }

    public Qos withBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    /**
     * 带宽(kbit/s)
     * @return bandWidth
     */
    public Integer getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
    }

    public Qos withLostPacketRate(Integer lostPacketRate) {
        this.lostPacketRate = lostPacketRate;
        return this;
    }

    /**
     * 丢包率（千分数）
     * @return lostPacketRate
     */
    public Integer getLostPacketRate() {
        return lostPacketRate;
    }

    public void setLostPacketRate(Integer lostPacketRate) {
        this.lostPacketRate = lostPacketRate;
    }

    public Qos withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 时延(ms)
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Qos withJitter(Integer jitter) {
        this.jitter = jitter;
        return this;
    }

    /**
     * 抖动(ms)
     * @return jitter
     */
    public Integer getJitter() {
        return jitter;
    }

    public void setJitter(Integer jitter) {
        this.jitter = jitter;
    }

    public Qos withResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }

    /**
     * 分辨率:高
     * @return resolutionHeight
     */
    public Integer getResolutionHeight() {
        return resolutionHeight;
    }

    public void setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public Qos withResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }

    /**
     * 分辨率：宽
     * @return resolutionWidth
     */
    public Integer getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public Qos withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public Qos withCodecUserId(String codecUserId) {
        this.codecUserId = codecUserId;
        return this;
    }

    /**
     * 该媒体流编码会场ID，仅服务器向端侧发送方向涉及(视频)，如路径A-->服务器-->B，即B观看A，该媒体流的codec_user_id为A
     * @return codecUserId
     */
    public String getCodecUserId() {
        return codecUserId;
    }

    public void setCodecUserId(String codecUserId) {
        this.codecUserId = codecUserId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Qos that = (Qos) obj;
        return Objects.equals(this.networkQuality, that.networkQuality)
            && Objects.equals(this.codecType, that.codecType) && Objects.equals(this.bandWidth, that.bandWidth)
            && Objects.equals(this.lostPacketRate, that.lostPacketRate) && Objects.equals(this.delay, that.delay)
            && Objects.equals(this.jitter, that.jitter) && Objects.equals(this.resolutionHeight, that.resolutionHeight)
            && Objects.equals(this.resolutionWidth, that.resolutionWidth)
            && Objects.equals(this.frameRate, that.frameRate) && Objects.equals(this.codecUserId, that.codecUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkQuality,
            codecType,
            bandWidth,
            lostPacketRate,
            delay,
            jitter,
            resolutionHeight,
            resolutionWidth,
            frameRate,
            codecUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Qos {\n");
        sb.append("    networkQuality: ").append(toIndentedString(networkQuality)).append("\n");
        sb.append("    codecType: ").append(toIndentedString(codecType)).append("\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
        sb.append("    lostPacketRate: ").append(toIndentedString(lostPacketRate)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
        sb.append("    resolutionHeight: ").append(toIndentedString(resolutionHeight)).append("\n");
        sb.append("    resolutionWidth: ").append(toIndentedString(resolutionWidth)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    codecUserId: ").append(toIndentedString(codecUserId)).append("\n");
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
