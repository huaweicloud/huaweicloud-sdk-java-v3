package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowVifPeerDetectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_peer_id")

    private String vifPeerId;

    public ShowVifPeerDetectionRequest withVifPeerId(String vifPeerId) {
        this.vifPeerId = vifPeerId;
        return this;
    }

    /**
     * 虚拟接口对等体ID
     * @return vifPeerId
     */
    public String getVifPeerId() {
        return vifPeerId;
    }

    public void setVifPeerId(String vifPeerId) {
        this.vifPeerId = vifPeerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVifPeerDetectionRequest that = (ShowVifPeerDetectionRequest) obj;
        return Objects.equals(this.vifPeerId, that.vifPeerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vifPeerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVifPeerDetectionRequest {\n");
        sb.append("    vifPeerId: ").append(toIndentedString(vifPeerId)).append("\n");
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
