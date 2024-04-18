package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * rtc信息
 */
public class RmAuthTokenRespDataResourceRtc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ice_signaling")

    private RmAuthTokenRespDataResourceRtcIceSignaling iceSignaling;

    public RmAuthTokenRespDataResourceRtc withIceSignaling(RmAuthTokenRespDataResourceRtcIceSignaling iceSignaling) {
        this.iceSignaling = iceSignaling;
        return this;
    }

    public RmAuthTokenRespDataResourceRtc withIceSignaling(
        Consumer<RmAuthTokenRespDataResourceRtcIceSignaling> iceSignalingSetter) {
        if (this.iceSignaling == null) {
            this.iceSignaling = new RmAuthTokenRespDataResourceRtcIceSignaling();
            iceSignalingSetter.accept(this.iceSignaling);
        }

        return this;
    }

    /**
     * Get iceSignaling
     * @return iceSignaling
     */
    public RmAuthTokenRespDataResourceRtcIceSignaling getIceSignaling() {
        return iceSignaling;
    }

    public void setIceSignaling(RmAuthTokenRespDataResourceRtcIceSignaling iceSignaling) {
        this.iceSignaling = iceSignaling;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmAuthTokenRespDataResourceRtc that = (RmAuthTokenRespDataResourceRtc) obj;
        return Objects.equals(this.iceSignaling, that.iceSignaling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iceSignaling);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmAuthTokenRespDataResourceRtc {\n");
        sb.append("    iceSignaling: ").append(toIndentedString(iceSignaling)).append("\n");
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
