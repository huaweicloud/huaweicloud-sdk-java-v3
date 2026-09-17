package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MQTT通道详情
 */
public class MqttChannelDetailDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private MqttConnectionInfoResp connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private MqttPushInfoResp pushInfo;

    public MqttChannelDetailDTO withConnectionInfo(MqttConnectionInfoResp connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public MqttChannelDetailDTO withConnectionInfo(Consumer<MqttConnectionInfoResp> connectionInfoSetter) {
        if (this.connectionInfo == null) {
            this.connectionInfo = new MqttConnectionInfoResp();
            connectionInfoSetter.accept(this.connectionInfo);
        }

        return this;
    }

    /**
     * Get connectionInfo
     * @return connectionInfo
     */
    public MqttConnectionInfoResp getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(MqttConnectionInfoResp connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public MqttChannelDetailDTO withPushInfo(MqttPushInfoResp pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public MqttChannelDetailDTO withPushInfo(Consumer<MqttPushInfoResp> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new MqttPushInfoResp();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public MqttPushInfoResp getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(MqttPushInfoResp pushInfo) {
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
        MqttChannelDetailDTO that = (MqttChannelDetailDTO) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MqttChannelDetailDTO {\n");
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
