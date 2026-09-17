package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新MQTT推送通道详情请求结构体
 */
public class UpdateMqttNodeChannelDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private UpdateMqttNodeChannelConnectionInfo connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private UpdateMqttNodeChannelPushInfoDTO pushInfo;

    public UpdateMqttNodeChannelDetail withConnectionInfo(UpdateMqttNodeChannelConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public UpdateMqttNodeChannelDetail withConnectionInfo(
        Consumer<UpdateMqttNodeChannelConnectionInfo> connectionInfoSetter) {
        if (this.connectionInfo == null) {
            this.connectionInfo = new UpdateMqttNodeChannelConnectionInfo();
            connectionInfoSetter.accept(this.connectionInfo);
        }

        return this;
    }

    /**
     * Get connectionInfo
     * @return connectionInfo
     */
    public UpdateMqttNodeChannelConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(UpdateMqttNodeChannelConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public UpdateMqttNodeChannelDetail withPushInfo(UpdateMqttNodeChannelPushInfoDTO pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public UpdateMqttNodeChannelDetail withPushInfo(Consumer<UpdateMqttNodeChannelPushInfoDTO> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new UpdateMqttNodeChannelPushInfoDTO();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public UpdateMqttNodeChannelPushInfoDTO getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(UpdateMqttNodeChannelPushInfoDTO pushInfo) {
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
        UpdateMqttNodeChannelDetail that = (UpdateMqttNodeChannelDetail) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMqttNodeChannelDetail {\n");
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
