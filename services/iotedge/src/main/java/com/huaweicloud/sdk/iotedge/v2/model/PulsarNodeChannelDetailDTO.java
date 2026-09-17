package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Pulsar通道详情
 */
public class PulsarNodeChannelDetailDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private PulsarNodeChannelConnectionInfoResp connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private PulsarNodeChannelPushInfoRsp pushInfo;

    public PulsarNodeChannelDetailDTO withConnectionInfo(PulsarNodeChannelConnectionInfoResp connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public PulsarNodeChannelDetailDTO withConnectionInfo(
        Consumer<PulsarNodeChannelConnectionInfoResp> connectionInfoSetter) {
        if (this.connectionInfo == null) {
            this.connectionInfo = new PulsarNodeChannelConnectionInfoResp();
            connectionInfoSetter.accept(this.connectionInfo);
        }

        return this;
    }

    /**
     * Get connectionInfo
     * @return connectionInfo
     */
    public PulsarNodeChannelConnectionInfoResp getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(PulsarNodeChannelConnectionInfoResp connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public PulsarNodeChannelDetailDTO withPushInfo(PulsarNodeChannelPushInfoRsp pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public PulsarNodeChannelDetailDTO withPushInfo(Consumer<PulsarNodeChannelPushInfoRsp> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new PulsarNodeChannelPushInfoRsp();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public PulsarNodeChannelPushInfoRsp getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(PulsarNodeChannelPushInfoRsp pushInfo) {
        this.pushInfo = pushInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PulsarNodeChannelDetailDTO that = (PulsarNodeChannelDetailDTO) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PulsarNodeChannelDetailDTO {\n");
        sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
        sb.append("    pushInfo: ").append(toIndentedString(pushInfo)).append("\n");
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
