package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建虚拟接口对等体请求体
 */
public class CreateVifPeerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_peer")

    private CreateVifPeer vifPeer;

    public CreateVifPeerRequestBody withVifPeer(CreateVifPeer vifPeer) {
        this.vifPeer = vifPeer;
        return this;
    }

    public CreateVifPeerRequestBody withVifPeer(Consumer<CreateVifPeer> vifPeerSetter) {
        if (this.vifPeer == null) {
            this.vifPeer = new CreateVifPeer();
            vifPeerSetter.accept(this.vifPeer);
        }

        return this;
    }

    /**
     * Get vifPeer
     * @return vifPeer
     */
    public CreateVifPeer getVifPeer() {
        return vifPeer;
    }

    public void setVifPeer(CreateVifPeer vifPeer) {
        this.vifPeer = vifPeer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVifPeerRequestBody that = (CreateVifPeerRequestBody) obj;
        return Objects.equals(this.vifPeer, that.vifPeer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vifPeer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVifPeerRequestBody {\n");
        sb.append("    vifPeer: ").append(toIndentedString(vifPeer)).append("\n");
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
