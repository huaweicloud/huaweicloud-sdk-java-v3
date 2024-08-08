package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业版端口信息。创建企业版实例时必填。 
 */
public class Port {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_https_port")

    private Integer appHttpsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_amqps_port")

    private Integer appAmqpsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_coap_port")

    private Integer deviceCoapPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_coaps_port")

    private Integer deviceCoapsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_mqtt_port")

    private Integer deviceMqttPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_mqtts_port")

    private Integer deviceMqttsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_https_port")

    private Integer deviceHttpsPort;

    public Port withAppHttpsPort(Integer appHttpsPort) {
        this.appHttpsPort = appHttpsPort;
        return this;
    }

    /**
     * **参数说明**：应用接入HTTPS协议端口，默认值：443 
     * minimum: 0
     * maximum: 65535
     * @return appHttpsPort
     */
    public Integer getAppHttpsPort() {
        return appHttpsPort;
    }

    public void setAppHttpsPort(Integer appHttpsPort) {
        this.appHttpsPort = appHttpsPort;
    }

    public Port withAppAmqpsPort(Integer appAmqpsPort) {
        this.appAmqpsPort = appAmqpsPort;
        return this;
    }

    /**
     * **参数说明**：应用接入AMQP协议端口, 默认值：5671 
     * minimum: 0
     * maximum: 65535
     * @return appAmqpsPort
     */
    public Integer getAppAmqpsPort() {
        return appAmqpsPort;
    }

    public void setAppAmqpsPort(Integer appAmqpsPort) {
        this.appAmqpsPort = appAmqpsPort;
    }

    public Port withDeviceCoapPort(Integer deviceCoapPort) {
        this.deviceCoapPort = deviceCoapPort;
        return this;
    }

    /**
     * **参数说明**：设备接入COAP协议端口, 默认值：5683 
     * minimum: 0
     * maximum: 65535
     * @return deviceCoapPort
     */
    public Integer getDeviceCoapPort() {
        return deviceCoapPort;
    }

    public void setDeviceCoapPort(Integer deviceCoapPort) {
        this.deviceCoapPort = deviceCoapPort;
    }

    public Port withDeviceCoapsPort(Integer deviceCoapsPort) {
        this.deviceCoapsPort = deviceCoapsPort;
        return this;
    }

    /**
     * **参数说明**：设备接入COAPS协议端口, 默认值：5684 
     * minimum: 0
     * maximum: 65535
     * @return deviceCoapsPort
     */
    public Integer getDeviceCoapsPort() {
        return deviceCoapsPort;
    }

    public void setDeviceCoapsPort(Integer deviceCoapsPort) {
        this.deviceCoapsPort = deviceCoapsPort;
    }

    public Port withDeviceMqttPort(Integer deviceMqttPort) {
        this.deviceMqttPort = deviceMqttPort;
        return this;
    }

    /**
     * **参数说明**：设备接入MQTT协议端口, 默认值：1883 
     * minimum: 0
     * maximum: 65535
     * @return deviceMqttPort
     */
    public Integer getDeviceMqttPort() {
        return deviceMqttPort;
    }

    public void setDeviceMqttPort(Integer deviceMqttPort) {
        this.deviceMqttPort = deviceMqttPort;
    }

    public Port withDeviceMqttsPort(Integer deviceMqttsPort) {
        this.deviceMqttsPort = deviceMqttsPort;
        return this;
    }

    /**
     * **参数说明**：设备接入MQTTS协议端口, 默认值：8883 
     * minimum: 0
     * maximum: 65535
     * @return deviceMqttsPort
     */
    public Integer getDeviceMqttsPort() {
        return deviceMqttsPort;
    }

    public void setDeviceMqttsPort(Integer deviceMqttsPort) {
        this.deviceMqttsPort = deviceMqttsPort;
    }

    public Port withDeviceHttpsPort(Integer deviceHttpsPort) {
        this.deviceHttpsPort = deviceHttpsPort;
        return this;
    }

    /**
     * **参数说明**：设备接入HTTPS协议端口, 默认值：443 
     * minimum: 0
     * maximum: 65535
     * @return deviceHttpsPort
     */
    public Integer getDeviceHttpsPort() {
        return deviceHttpsPort;
    }

    public void setDeviceHttpsPort(Integer deviceHttpsPort) {
        this.deviceHttpsPort = deviceHttpsPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Port that = (Port) obj;
        return Objects.equals(this.appHttpsPort, that.appHttpsPort)
            && Objects.equals(this.appAmqpsPort, that.appAmqpsPort)
            && Objects.equals(this.deviceCoapPort, that.deviceCoapPort)
            && Objects.equals(this.deviceCoapsPort, that.deviceCoapsPort)
            && Objects.equals(this.deviceMqttPort, that.deviceMqttPort)
            && Objects.equals(this.deviceMqttsPort, that.deviceMqttsPort)
            && Objects.equals(this.deviceHttpsPort, that.deviceHttpsPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appHttpsPort,
            appAmqpsPort,
            deviceCoapPort,
            deviceCoapsPort,
            deviceMqttPort,
            deviceMqttsPort,
            deviceHttpsPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Port {\n");
        sb.append("    appHttpsPort: ").append(toIndentedString(appHttpsPort)).append("\n");
        sb.append("    appAmqpsPort: ").append(toIndentedString(appAmqpsPort)).append("\n");
        sb.append("    deviceCoapPort: ").append(toIndentedString(deviceCoapPort)).append("\n");
        sb.append("    deviceCoapsPort: ").append(toIndentedString(deviceCoapsPort)).append("\n");
        sb.append("    deviceMqttPort: ").append(toIndentedString(deviceMqttPort)).append("\n");
        sb.append("    deviceMqttsPort: ").append(toIndentedString(deviceMqttsPort)).append("\n");
        sb.append("    deviceHttpsPort: ").append(toIndentedString(deviceHttpsPort)).append("\n");
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
