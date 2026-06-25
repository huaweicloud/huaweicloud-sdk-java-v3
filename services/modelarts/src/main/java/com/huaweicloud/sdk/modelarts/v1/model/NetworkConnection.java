package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当前网络与其他网络的连接信息。
 */
public class NetworkConnection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerConnectionList")

    private List<PeerConnectionItem> peerConnectionList = null;

    public NetworkConnection withPeerConnectionList(List<PeerConnectionItem> peerConnectionList) {
        this.peerConnectionList = peerConnectionList;
        return this;
    }

    public NetworkConnection addPeerConnectionListItem(PeerConnectionItem peerConnectionListItem) {
        if (this.peerConnectionList == null) {
            this.peerConnectionList = new ArrayList<>();
        }
        this.peerConnectionList.add(peerConnectionListItem);
        return this;
    }

    public NetworkConnection withPeerConnectionList(Consumer<List<PeerConnectionItem>> peerConnectionListSetter) {
        if (this.peerConnectionList == null) {
            this.peerConnectionList = new ArrayList<>();
        }
        peerConnectionListSetter.accept(this.peerConnectionList);
        return this;
    }

    /**
     * **参数解释**：Peer方式打通网络列表。
     * @return peerConnectionList
     */
    public List<PeerConnectionItem> getPeerConnectionList() {
        return peerConnectionList;
    }

    public void setPeerConnectionList(List<PeerConnectionItem> peerConnectionList) {
        this.peerConnectionList = peerConnectionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkConnection that = (NetworkConnection) obj;
        return Objects.equals(this.peerConnectionList, that.peerConnectionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerConnectionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkConnection {\n");
        sb.append("    peerConnectionList: ").append(toIndentedString(peerConnectionList)).append("\n");
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
