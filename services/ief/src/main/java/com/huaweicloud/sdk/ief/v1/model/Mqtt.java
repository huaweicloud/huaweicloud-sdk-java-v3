package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MQTT配置。 当enable_mqtt取值为false时，mqtts需要为空数组。
 */
public class Mqtt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_addr")

    private String bindAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public Mqtt withBindAddr(String bindAddr) {
        this.bindAddr = bindAddr;
        return this;
    }

    /**
     * MQTT监听地址，根据type取值确定。
     * @return bindAddr
     */
    public String getBindAddr() {
        return bindAddr;
    }

    public void setBindAddr(String bindAddr) {
        this.bindAddr = bindAddr;
    }

    public Mqtt withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Mqtt withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。枚举值： - nic：网卡类型 - ip：IP类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mqtt that = (Mqtt) obj;
        return Objects.equals(this.bindAddr, that.bindAddr) && Objects.equals(this.port, that.port)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindAddr, port, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Mqtt {\n");
        sb.append("    bindAddr: ").append(toIndentedString(bindAddr)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
