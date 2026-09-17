package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MQTT通道配置详情
 */
public class InfluxDB2NodeChannelDetailDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_info")

    private InfluxDB2ConnectionInfo connectionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_info")

    private InfluxDB2NodeChannelPushInfoRsp pushInfo;

    public InfluxDB2NodeChannelDetailDTO withConnectionInfo(InfluxDB2ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    public InfluxDB2NodeChannelDetailDTO withConnectionInfo(Consumer<InfluxDB2ConnectionInfo> connectionInfoSetter) {
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

    public InfluxDB2NodeChannelDetailDTO withPushInfo(InfluxDB2NodeChannelPushInfoRsp pushInfo) {
        this.pushInfo = pushInfo;
        return this;
    }

    public InfluxDB2NodeChannelDetailDTO withPushInfo(Consumer<InfluxDB2NodeChannelPushInfoRsp> pushInfoSetter) {
        if (this.pushInfo == null) {
            this.pushInfo = new InfluxDB2NodeChannelPushInfoRsp();
            pushInfoSetter.accept(this.pushInfo);
        }

        return this;
    }

    /**
     * Get pushInfo
     * @return pushInfo
     */
    public InfluxDB2NodeChannelPushInfoRsp getPushInfo() {
        return pushInfo;
    }

    public void setPushInfo(InfluxDB2NodeChannelPushInfoRsp pushInfo) {
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
        InfluxDB2NodeChannelDetailDTO that = (InfluxDB2NodeChannelDetailDTO) obj;
        return Objects.equals(this.connectionInfo, that.connectionInfo) && Objects.equals(this.pushInfo, that.pushInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionInfo, pushInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InfluxDB2NodeChannelDetailDTO {\n");
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
