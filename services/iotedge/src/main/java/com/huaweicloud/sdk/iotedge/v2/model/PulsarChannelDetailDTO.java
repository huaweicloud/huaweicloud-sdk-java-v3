package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Pulsar通道详情
 */
public class PulsarChannelDetailDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private PulsarConnectionInfoResp connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private PulsarPushInfoResp pushInfo;

    public PulsarChannelDetailDTO withConnectionInfo(PulsarConnectionInfoResp connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public PulsarChannelDetailDTO withConnectionInfo(Consumer<PulsarConnectionInfoResp> connectionInfoSetter) {
        if (this.connectionInfo == null) {
            this.connectionInfo = new PulsarConnectionInfoResp();
            connectionInfoSetter.accept(this.connectionInfo);
        }

        return this;
    }

    /**
     * Get connectionInfo
     * @return connectionInfo
     */
    public PulsarConnectionInfoResp getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(PulsarConnectionInfoResp connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public PulsarChannelDetailDTO withPushInfo(PulsarPushInfoResp pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public PulsarChannelDetailDTO withPushInfo(Consumer<PulsarPushInfoResp> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new PulsarPushInfoResp();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public PulsarPushInfoResp getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(PulsarPushInfoResp pushInfo) {
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
        PulsarChannelDetailDTO that = (PulsarChannelDetailDTO) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PulsarChannelDetailDTO {\n");
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
