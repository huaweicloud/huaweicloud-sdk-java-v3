package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新Pulsar推送通道详情请求结构体
 */
public class UpdatePulsarNodeChannelDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private UpdatePulsarNodeChannelConnectionInfo connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private UpdatePulsarNodeChannelPushInfoDTO pushInfo;

    public UpdatePulsarNodeChannelDetail withConnectionInfo(UpdatePulsarNodeChannelConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public UpdatePulsarNodeChannelDetail withConnectionInfo(
        Consumer<UpdatePulsarNodeChannelConnectionInfo> connectionInfoSetter) {
        if (this.connectionInfo == null) {
            this.connectionInfo = new UpdatePulsarNodeChannelConnectionInfo();
            connectionInfoSetter.accept(this.connectionInfo);
        }

        return this;
    }

    /**
     * Get connectionInfo
     * @return connectionInfo
     */
    public UpdatePulsarNodeChannelConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(UpdatePulsarNodeChannelConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public UpdatePulsarNodeChannelDetail withPushInfo(UpdatePulsarNodeChannelPushInfoDTO pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public UpdatePulsarNodeChannelDetail withPushInfo(Consumer<UpdatePulsarNodeChannelPushInfoDTO> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new UpdatePulsarNodeChannelPushInfoDTO();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public UpdatePulsarNodeChannelPushInfoDTO getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(UpdatePulsarNodeChannelPushInfoDTO pushInfo) {
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
        UpdatePulsarNodeChannelDetail that = (UpdatePulsarNodeChannelDetail) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePulsarNodeChannelDetail {\n");
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
