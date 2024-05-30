package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetBridgeSecret
 */
public class ResetBridgeSecret {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_disconnect")

    private Boolean forceDisconnect;

    public ResetBridgeSecret withForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
        return this;
    }

    /**
     * 是否强制断开网桥的连接，当前仅限长连接。
     * @return forceDisconnect
     */
    public Boolean getForceDisconnect() {
        return forceDisconnect;
    }

    public void setForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetBridgeSecret that = (ResetBridgeSecret) obj;
        return Objects.equals(this.forceDisconnect, that.forceDisconnect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forceDisconnect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetBridgeSecret {\n");
        sb.append("    forceDisconnect: ").append(toIndentedString(forceDisconnect)).append("\n");
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
