package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当前网络与其他云服务的连接状态信息。
 */
public class NetworkConnectionStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerConnectionStatus")

    private List<PeerConnectionStatus> peerConnectionStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfsTurboStatus")

    private List<SfsTurboConnectionStatus> sfsTurboStatus = null;

    public NetworkConnectionStatus withPeerConnectionStatus(List<PeerConnectionStatus> peerConnectionStatus) {
        this.peerConnectionStatus = peerConnectionStatus;
        return this;
    }

    public NetworkConnectionStatus addPeerConnectionStatusItem(PeerConnectionStatus peerConnectionStatusItem) {
        if (this.peerConnectionStatus == null) {
            this.peerConnectionStatus = new ArrayList<>();
        }
        this.peerConnectionStatus.add(peerConnectionStatusItem);
        return this;
    }

    public NetworkConnectionStatus withPeerConnectionStatus(
        Consumer<List<PeerConnectionStatus>> peerConnectionStatusSetter) {
        if (this.peerConnectionStatus == null) {
            this.peerConnectionStatus = new ArrayList<>();
        }
        peerConnectionStatusSetter.accept(this.peerConnectionStatus);
        return this;
    }

    /**
     * **参数解释**：Peer方式打通网络的状态信息列表。
     * @return peerConnectionStatus
     */
    public List<PeerConnectionStatus> getPeerConnectionStatus() {
        return peerConnectionStatus;
    }

    public void setPeerConnectionStatus(List<PeerConnectionStatus> peerConnectionStatus) {
        this.peerConnectionStatus = peerConnectionStatus;
    }

    public NetworkConnectionStatus withSfsTurboStatus(List<SfsTurboConnectionStatus> sfsTurboStatus) {
        this.sfsTurboStatus = sfsTurboStatus;
        return this;
    }

    public NetworkConnectionStatus addSfsTurboStatusItem(SfsTurboConnectionStatus sfsTurboStatusItem) {
        if (this.sfsTurboStatus == null) {
            this.sfsTurboStatus = new ArrayList<>();
        }
        this.sfsTurboStatus.add(sfsTurboStatusItem);
        return this;
    }

    public NetworkConnectionStatus withSfsTurboStatus(Consumer<List<SfsTurboConnectionStatus>> sfsTurboStatusSetter) {
        if (this.sfsTurboStatus == null) {
            this.sfsTurboStatus = new ArrayList<>();
        }
        sfsTurboStatusSetter.accept(this.sfsTurboStatus);
        return this;
    }

    /**
     * **参数解释**：网络可连通的SFS Turbo信息列表。
     * @return sfsTurboStatus
     */
    public List<SfsTurboConnectionStatus> getSfsTurboStatus() {
        return sfsTurboStatus;
    }

    public void setSfsTurboStatus(List<SfsTurboConnectionStatus> sfsTurboStatus) {
        this.sfsTurboStatus = sfsTurboStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkConnectionStatus that = (NetworkConnectionStatus) obj;
        return Objects.equals(this.peerConnectionStatus, that.peerConnectionStatus)
            && Objects.equals(this.sfsTurboStatus, that.sfsTurboStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerConnectionStatus, sfsTurboStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkConnectionStatus {\n");
        sb.append("    peerConnectionStatus: ").append(toIndentedString(peerConnectionStatus)).append("\n");
        sb.append("    sfsTurboStatus: ").append(toIndentedString(sfsTurboStatus)).append("\n");
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
