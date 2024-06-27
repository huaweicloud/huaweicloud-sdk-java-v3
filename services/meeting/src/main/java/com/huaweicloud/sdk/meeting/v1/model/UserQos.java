package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会场网络质量对象
 */
public class UserQos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "netRate")

    private String netRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandWidthUp")

    private Integer bandWidthUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandWidthDown")

    private Integer bandWidthDown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lostPacketRateUp")

    private Integer lostPacketRateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lostPacketRateDown")

    private Integer lostPacketRateDown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoQos")

    private MediaQos videoQos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioQos")

    private MediaQos audioQos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auxQos")

    private MediaQos auxQos;

    public UserQos withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 会场ID
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public UserQos withNetRate(String netRate) {
        this.netRate = netRate;
        return this;
    }

    /**
     * 网络质量评级
     * @return netRate
     */
    public String getNetRate() {
        return netRate;
    }

    public void setNetRate(String netRate) {
        this.netRate = netRate;
    }

    public UserQos withBandWidthUp(Integer bandWidthUp) {
        this.bandWidthUp = bandWidthUp;
        return this;
    }

    /**
     * 上行总带宽(kbit/s)
     * @return bandWidthUp
     */
    public Integer getBandWidthUp() {
        return bandWidthUp;
    }

    public void setBandWidthUp(Integer bandWidthUp) {
        this.bandWidthUp = bandWidthUp;
    }

    public UserQos withBandWidthDown(Integer bandWidthDown) {
        this.bandWidthDown = bandWidthDown;
        return this;
    }

    /**
     * 下行总带宽(kbit/s)
     * @return bandWidthDown
     */
    public Integer getBandWidthDown() {
        return bandWidthDown;
    }

    public void setBandWidthDown(Integer bandWidthDown) {
        this.bandWidthDown = bandWidthDown;
    }

    public UserQos withLostPacketRateUp(Integer lostPacketRateUp) {
        this.lostPacketRateUp = lostPacketRateUp;
        return this;
    }

    /**
     * 上行丢包率（千分数）
     * @return lostPacketRateUp
     */
    public Integer getLostPacketRateUp() {
        return lostPacketRateUp;
    }

    public void setLostPacketRateUp(Integer lostPacketRateUp) {
        this.lostPacketRateUp = lostPacketRateUp;
    }

    public UserQos withLostPacketRateDown(Integer lostPacketRateDown) {
        this.lostPacketRateDown = lostPacketRateDown;
        return this;
    }

    /**
     * 下行丢包率（千分数）
     * @return lostPacketRateDown
     */
    public Integer getLostPacketRateDown() {
        return lostPacketRateDown;
    }

    public void setLostPacketRateDown(Integer lostPacketRateDown) {
        this.lostPacketRateDown = lostPacketRateDown;
    }

    public UserQos withDelay(Integer delay) {
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

    public UserQos withVideoQos(MediaQos videoQos) {
        this.videoQos = videoQos;
        return this;
    }

    public UserQos withVideoQos(Consumer<MediaQos> videoQosSetter) {
        if (this.videoQos == null) {
            this.videoQos = new MediaQos();
            videoQosSetter.accept(this.videoQos);
        }

        return this;
    }

    /**
     * Get videoQos
     * @return videoQos
     */
    public MediaQos getVideoQos() {
        return videoQos;
    }

    public void setVideoQos(MediaQos videoQos) {
        this.videoQos = videoQos;
    }

    public UserQos withAudioQos(MediaQos audioQos) {
        this.audioQos = audioQos;
        return this;
    }

    public UserQos withAudioQos(Consumer<MediaQos> audioQosSetter) {
        if (this.audioQos == null) {
            this.audioQos = new MediaQos();
            audioQosSetter.accept(this.audioQos);
        }

        return this;
    }

    /**
     * Get audioQos
     * @return audioQos
     */
    public MediaQos getAudioQos() {
        return audioQos;
    }

    public void setAudioQos(MediaQos audioQos) {
        this.audioQos = audioQos;
    }

    public UserQos withAuxQos(MediaQos auxQos) {
        this.auxQos = auxQos;
        return this;
    }

    public UserQos withAuxQos(Consumer<MediaQos> auxQosSetter) {
        if (this.auxQos == null) {
            this.auxQos = new MediaQos();
            auxQosSetter.accept(this.auxQos);
        }

        return this;
    }

    /**
     * Get auxQos
     * @return auxQos
     */
    public MediaQos getAuxQos() {
        return auxQos;
    }

    public void setAuxQos(MediaQos auxQos) {
        this.auxQos = auxQos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserQos that = (UserQos) obj;
        return Objects.equals(this.participantID, that.participantID) && Objects.equals(this.netRate, that.netRate)
            && Objects.equals(this.bandWidthUp, that.bandWidthUp)
            && Objects.equals(this.bandWidthDown, that.bandWidthDown)
            && Objects.equals(this.lostPacketRateUp, that.lostPacketRateUp)
            && Objects.equals(this.lostPacketRateDown, that.lostPacketRateDown)
            && Objects.equals(this.delay, that.delay) && Objects.equals(this.videoQos, that.videoQos)
            && Objects.equals(this.audioQos, that.audioQos) && Objects.equals(this.auxQos, that.auxQos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantID,
            netRate,
            bandWidthUp,
            bandWidthDown,
            lostPacketRateUp,
            lostPacketRateDown,
            delay,
            videoQos,
            audioQos,
            auxQos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserQos {\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    netRate: ").append(toIndentedString(netRate)).append("\n");
        sb.append("    bandWidthUp: ").append(toIndentedString(bandWidthUp)).append("\n");
        sb.append("    bandWidthDown: ").append(toIndentedString(bandWidthDown)).append("\n");
        sb.append("    lostPacketRateUp: ").append(toIndentedString(lostPacketRateUp)).append("\n");
        sb.append("    lostPacketRateDown: ").append(toIndentedString(lostPacketRateDown)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    videoQos: ").append(toIndentedString(videoQos)).append("\n");
        sb.append("    audioQos: ").append(toIndentedString(audioQos)).append("\n");
        sb.append("    auxQos: ").append(toIndentedString(auxQos)).append("\n");
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
