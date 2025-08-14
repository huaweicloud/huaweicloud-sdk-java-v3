package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器各服务端口信息
 */
public class ServicePortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_port")

    private Integer userPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public ServicePortInfo withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 服务名称
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ServicePortInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，可取值集合[http，https]
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ServicePortInfo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 默认tcp。可取值集合[tcp，udp]
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ServicePortInfo withUserPort(Integer userPort) {
        this.userPort = userPort;
        return this;
    }

    /**
     * 用户端口
     * minimum: 0
     * maximum: 2147483547
     * @return userPort
     */
    public Integer getUserPort() {
        return userPort;
    }

    public void setUserPort(Integer userPort) {
        this.userPort = userPort;
    }

    public ServicePortInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 容器内部端口
     * minimum: 0
     * maximum: 2147483547
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServicePortInfo that = (ServicePortInfo) obj;
        return Objects.equals(this.desc, that.desc) && Objects.equals(this.type, that.type)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.userPort, that.userPort)
            && Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desc, type, protocol, userPort, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServicePortInfo {\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    userPort: ").append(toIndentedString(userPort)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
