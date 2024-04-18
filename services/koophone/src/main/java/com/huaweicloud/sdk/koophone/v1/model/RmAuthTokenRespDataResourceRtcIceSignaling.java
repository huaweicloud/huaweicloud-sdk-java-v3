package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ice信令信息
 */
public class RmAuthTokenRespDataResourceRtcIceSignaling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signaling_url")

    private String signalingUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private String expiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ice_servers")

    private List<String> iceServers = null;

    public RmAuthTokenRespDataResourceRtcIceSignaling withSignalingUrl(String signalingUrl) {
        this.signalingUrl = signalingUrl;
        return this;
    }

    /**
     * 信令服务访问地址
     * @return signalingUrl
     */
    public String getSignalingUrl() {
        return signalingUrl;
    }

    public void setSignalingUrl(String signalingUrl) {
        this.signalingUrl = signalingUrl;
    }

    public RmAuthTokenRespDataResourceRtcIceSignaling withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * streaming时长。单位秒
     * @return expiredTime
     */
    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public RmAuthTokenRespDataResourceRtcIceSignaling withIceServers(List<String> iceServers) {
        this.iceServers = iceServers;
        return this;
    }

    public RmAuthTokenRespDataResourceRtcIceSignaling addIceServersItem(String iceServersItem) {
        if (this.iceServers == null) {
            this.iceServers = new ArrayList<>();
        }
        this.iceServers.add(iceServersItem);
        return this;
    }

    public RmAuthTokenRespDataResourceRtcIceSignaling withIceServers(Consumer<List<String>> iceServersSetter) {
        if (this.iceServers == null) {
            this.iceServers = new ArrayList<>();
        }
        iceServersSetter.accept(this.iceServers);
        return this;
    }

    /**
     * ICE 服务器
     * @return iceServers
     */
    public List<String> getIceServers() {
        return iceServers;
    }

    public void setIceServers(List<String> iceServers) {
        this.iceServers = iceServers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmAuthTokenRespDataResourceRtcIceSignaling that = (RmAuthTokenRespDataResourceRtcIceSignaling) obj;
        return Objects.equals(this.signalingUrl, that.signalingUrl)
            && Objects.equals(this.expiredTime, that.expiredTime) && Objects.equals(this.iceServers, that.iceServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signalingUrl, expiredTime, iceServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmAuthTokenRespDataResourceRtcIceSignaling {\n");
        sb.append("    signalingUrl: ").append(toIndentedString(signalingUrl)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
        sb.append("    iceServers: ").append(toIndentedString(iceServers)).append("\n");
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
