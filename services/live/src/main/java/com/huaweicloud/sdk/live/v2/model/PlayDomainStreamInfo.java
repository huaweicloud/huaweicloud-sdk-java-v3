package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PlayDomainStreamInfo
 */
public class PlayDomainStreamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domain")

    private String playDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Long bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online")

    private Long online;

    public PlayDomainStreamInfo withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * 播放域名
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    public PlayDomainStreamInfo withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 播放流名
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public PlayDomainStreamInfo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 播放的协议，支持flv,hls,rtmp。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public PlayDomainStreamInfo withBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 1分钟粒度的带宽值，单位为bps。
     * minimum: 0
     * maximum: 50000000000000000
     * @return bandwidth
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public PlayDomainStreamInfo withOnline(Long online) {
        this.online = online;
        return this;
    }

    /**
     * 1分钟粒度的在线人数。
     * minimum: 0
     * maximum: 1000000000
     * @return online
     */
    public Long getOnline() {
        return online;
    }

    public void setOnline(Long online) {
        this.online = online;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlayDomainStreamInfo that = (PlayDomainStreamInfo) obj;
        return Objects.equals(this.playDomain, that.playDomain) && Objects.equals(this.stream, that.stream)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.online, that.online);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomain, stream, protocol, bandwidth, online);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayDomainStreamInfo {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
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
