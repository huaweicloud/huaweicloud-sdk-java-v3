package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MQTT通道配置详情
 */
public class CreateInfluxDB2ChannelDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private InfluxDB2ConnectionInfo connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private InfluxDB2PushInfo pushInfo;

    public CreateInfluxDB2ChannelDetail withConnectionInfo(InfluxDB2ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public CreateInfluxDB2ChannelDetail withConnectionInfo(Consumer<InfluxDB2ConnectionInfo> connectionInfoSetter) {
        if (this.connectionInfo == null) {
            this.connectionInfo = new InfluxDB2ConnectionInfo();
            connectionInfoSetter.accept(this.connectionInfo);
        }

        return this;
    }

    /**
     * Get connectionInfo
     * @return connectionInfo
     */
    public InfluxDB2ConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(InfluxDB2ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public CreateInfluxDB2ChannelDetail withPushInfo(InfluxDB2PushInfo pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public CreateInfluxDB2ChannelDetail withPushInfo(Consumer<InfluxDB2PushInfo> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new InfluxDB2PushInfo();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public InfluxDB2PushInfo getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(InfluxDB2PushInfo pushInfo) {
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
        CreateInfluxDB2ChannelDetail that = (CreateInfluxDB2ChannelDetail) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInfluxDB2ChannelDetail {\n");
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
