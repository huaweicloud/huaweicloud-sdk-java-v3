package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MQTT通道配置详情
 */
public class CreateMqttChannelDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private ItMqttConnectionInfo connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private MqttPushInfo pushInfo;

    public CreateMqttChannelDetail withConnectionInfo(ItMqttConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public CreateMqttChannelDetail withConnectionInfo(Consumer<ItMqttConnectionInfo> connectionInfoSetter) {
        if (this.connectionInfo == null) {
            this.connectionInfo = new ItMqttConnectionInfo();
            connectionInfoSetter.accept(this.connectionInfo);
        }

        return this;
    }

    /**
     * Get connectionInfo
     * @return connectionInfo
     */
    public ItMqttConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(ItMqttConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public CreateMqttChannelDetail withPushInfo(MqttPushInfo pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public CreateMqttChannelDetail withPushInfo(Consumer<MqttPushInfo> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new MqttPushInfo();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public MqttPushInfo getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(MqttPushInfo pushInfo) {
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
        CreateMqttChannelDetail that = (CreateMqttChannelDetail) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMqttChannelDetail {\n");
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
